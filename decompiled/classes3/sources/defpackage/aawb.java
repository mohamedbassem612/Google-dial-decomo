package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawb {
    public final java.util.HashMap a = new java.util.HashMap();

    public final int a() {
        return this.a.size();
    }

    public final java.lang.Object b(java.lang.String str) {
        return this.a.get(str);
    }

    public final java.util.Set c() {
        return this.a.keySet();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aawb)) {
            return false;
        }
        defpackage.aawb aawbVar = (defpackage.aawb) obj;
        if (a() != aawbVar.a()) {
            return false;
        }
        java.util.Iterator it = c().iterator();
        while (true) {
            boolean zEquals = true;
            if (!it.hasNext()) {
                return true;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.lang.Object objB = b(str);
            java.lang.Object objB2 = aawbVar.b(str);
            if (objB instanceof com.google.android.gms.wearable.Asset) {
                if (!(objB2 instanceof com.google.android.gms.wearable.Asset)) {
                    return false;
                }
                com.google.android.gms.wearable.Asset asset = (com.google.android.gms.wearable.Asset) objB;
                com.google.android.gms.wearable.Asset asset2 = (com.google.android.gms.wearable.Asset) objB2;
                if (asset != null && asset2 != null) {
                    java.lang.String str2 = asset.b;
                    if (android.text.TextUtils.isEmpty(str2)) {
                        zEquals = java.util.Arrays.equals(asset.a, asset2.a);
                    } else {
                        ahvr.ci(str2);
                        zEquals = str2.equals(asset2.b);
                    }
                } else if (asset != asset2) {
                    zEquals = false;
                }
                if (!zEquals) {
                    return false;
                }
            } else if (objB instanceof java.lang.String[]) {
                if (!(objB2 instanceof java.lang.String[]) || !java.util.Arrays.equals((java.lang.String[]) objB, (java.lang.String[]) objB2)) {
                    return false;
                }
            } else if (objB instanceof long[]) {
                if (!(objB2 instanceof long[]) || !java.util.Arrays.equals((long[]) objB, (long[]) objB2)) {
                    return false;
                }
            } else if (objB instanceof float[]) {
                if (!(objB2 instanceof float[]) || !java.util.Arrays.equals((float[]) objB, (float[]) objB2)) {
                    return false;
                }
            } else if (objB instanceof byte[]) {
                if (!(objB2 instanceof byte[]) || !java.util.Arrays.equals((byte[]) objB, (byte[]) objB2)) {
                    return false;
                }
            } else if (!j$.util.Objects.equals(objB, objB2)) {
                return false;
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode() * 29;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
