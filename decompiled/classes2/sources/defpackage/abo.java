package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abo {
    public static final defpackage.abo a = new defpackage.abo(null, new java.util.HashMap(), true);
    private final java.util.Map b;
    private final boolean c;
    private final java.util.Map d = new java.util.HashMap();
    private final android.content.pm.PackageManager e;
    private final boolean f;

    public abo(android.content.pm.PackageManager packageManager, java.util.Map map, boolean z) {
        this.e = packageManager;
        this.b = map;
        this.c = z;
        boolean z2 = false;
        if (packageManager != null && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            z2 = true;
        }
        this.f = z2;
    }

    private static java.security.MessageDigest b() {
        try {
            return java.security.MessageDigest.getInstance("SHA256");
        } catch (java.security.NoSuchAlgorithmException e) {
            android.util.Log.e("CarApp.Val", "Could not find SHA256 hash algorithm", e);
            return null;
        }
    }

    private static final java.lang.String c(android.content.pm.Signature signature) {
        byte[] byteArray = signature.toByteArray();
        java.security.MessageDigest messageDigestB = b();
        if (messageDigestB == null) {
            return null;
        }
        messageDigestB.update(byteArray);
        byte[] bArrDigest = messageDigestB.digest();
        java.lang.StringBuilder sb = new java.lang.StringBuilder((bArrDigest.length * 3) - 1);
        for (byte b : bArrDigest) {
            sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public final boolean a(defpackage.ty tyVar) {
        android.content.pm.PackageInfo packageInfo;
        boolean z;
        boolean z2;
        j$.util.Objects.requireNonNull(tyVar);
        if (android.util.Log.isLoggable("CarApp.Val", 3)) {
            java.util.Objects.toString(tyVar);
            android.util.Log.d("CarApp.Val", "Evaluating ".concat(tyVar.toString()));
        }
        boolean z3 = true;
        if (this.c) {
            if (!android.util.Log.isLoggable("CarApp.Val", 3)) {
                return true;
            }
            android.util.Log.d("CarApp.Val", "Accepted - Validator disabled, all hosts allowed");
            return true;
        }
        java.util.Map map = this.d;
        java.lang.String str = tyVar.a;
        android.util.Pair pair = (android.util.Pair) map.get(str);
        java.lang.Boolean bool = (pair == null || ((java.lang.Integer) pair.first).intValue() != tyVar.b) ? null : (java.lang.Boolean) pair.second;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            android.content.pm.PackageManager packageManager = this.e;
            if (packageManager == null) {
                android.util.Log.d("CarApp.Val", a.bx(str, "PackageManager is null. Package info cannot be found for package "));
                packageInfo = null;
            } else {
                packageInfo = packageManager.getPackageInfo(str, 134221824);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w("CarApp.Val", a.bk(str, "Package ", " not found"), e);
        }
        if (packageInfo == null) {
            android.util.Log.w("CarApp.Val", a.bk(str, "Rejected - package name ", " not found"));
        } else {
            android.content.pm.Signature[] signatureArrM = ft$.ExternalSyntheticApiModelOutline0.m(packageInfo) != null ? ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(packageInfo)) : null;
            if (signatureArrM != null && signatureArrM.length != 0) {
                int i = packageInfo.applicationInfo.uid;
                if (i != tyVar.b) {
                    throw new java.lang.IllegalStateException("Host " + tyVar + " doesn't match caller's actual UID " + i);
                }
                if (this.f && packageInfo.requestedPermissionsFlags != null && packageInfo.requestedPermissions != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= packageInfo.requestedPermissionsFlags.length) {
                            z = false;
                            break;
                        }
                        if ((packageInfo.requestedPermissionsFlags[i2] & 2) != 0 && i2 < packageInfo.requestedPermissions.length && "android.car.permission.TEMPLATE_RENDERER".equals(packageInfo.requestedPermissions[i2])) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                } else {
                    z = false;
                    break;
                }
                java.util.List list = (java.util.List) this.b.get(str);
                if (list == null) {
                    z2 = false;
                    break;
                }
                int length = signatureArrM.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    }
                    if (list.contains(c(signatureArrM[i3]))) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                if (i == android.os.Process.myUid()) {
                    if (android.util.Log.isLoggable("CarApp.Val", 3)) {
                        android.util.Log.d("CarApp.Val", "Accepted - Local service call");
                    }
                } else if (z2) {
                    if (android.util.Log.isLoggable("CarApp.Val", 3)) {
                        android.util.Log.d("CarApp.Val", "Accepted - Host in allow-list");
                    }
                } else if (i == 1000) {
                    if (android.util.Log.isLoggable("CarApp.Val", 3)) {
                        android.util.Log.d("CarApp.Val", "Accepted - System binding");
                    }
                } else if (!z) {
                    android.util.Log.e("CarApp.Val", java.lang.String.format("Unrecognized host.\nIf this is a valid caller, please add the following to your CarAppService#createHostValidator() implementation:\nreturn new HostValidator.Builder(context)\n\t.addAllowedHost(\"%s\", \"%s\");\n\t.build()", str, c(signatureArrM[0])));
                } else if (android.util.Log.isLoggable("CarApp.Val", 3)) {
                    android.util.Log.d("CarApp.Val", "Accepted - Host has android.car.permission.TEMPLATE_RENDERER");
                }
                this.d.put(tyVar.a, android.util.Pair.create(java.lang.Integer.valueOf(tyVar.b), java.lang.Boolean.valueOf(z3)));
                return z3;
            }
            android.util.Log.w("CarApp.Val", a.bk(str, "Package ", " is not signed or it has more than one signature"));
        }
        z3 = false;
        this.d.put(tyVar.a, android.util.Pair.create(java.lang.Integer.valueOf(tyVar.b), java.lang.Boolean.valueOf(z3)));
        return z3;
    }
}
