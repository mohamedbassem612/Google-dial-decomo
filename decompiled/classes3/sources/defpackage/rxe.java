package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rxe {
    public static boolean b;
    public static java.lang.String c;
    public static final aimz a = aimz.i("com/android/dialer/oem/CequintCallerIdManager");
    private static final java.lang.String[] d = new java.lang.String[0];

    /* JADX WARN: Code duplicated, block: B:23:0x00d2 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:5:0x001b, B:7:0x0021, B:9:0x0098, B:13:0x00b3, B:21:0x00cc, B:23:0x00d2, B:15:0x00b9, B:20:0x00c9, B:16:0x00bd, B:18:0x00c2, B:25:0x00d8, B:27:0x00de, B:38:0x0100, B:29:0x00e4, B:31:0x00ea, B:33:0x00f0, B:34:0x00f7, B:41:0x010a), top: B:59:0x001b, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d7  */
    public static defpackage.rxc a(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        gus.aJ();
        ahvr.ci(str);
        try {
            android.database.Cursor cursorB = snl.ac(context).aZ().b(uri, d, str, strArr, (java.lang.String) null);
            if (cursorB != null) {
                try {
                    if (cursorB.moveToFirst()) {
                        java.lang.String strC = c(cursorB, cursorB.getColumnIndex("cid_pCityName"));
                        java.lang.String strC2 = c(cursorB, cursorB.getColumnIndex("cid_pStateName"));
                        java.lang.String strC3 = c(cursorB, cursorB.getColumnIndex("cid_pStateAbbr"));
                        java.lang.String strC4 = c(cursorB, cursorB.getColumnIndex("cid_pCountryName"));
                        java.lang.String strC5 = c(cursorB, cursorB.getColumnIndex("cid_pCompany"));
                        java.lang.String strC6 = c(cursorB, cursorB.getColumnIndex("cid_pName"));
                        java.lang.String strC7 = c(cursorB, cursorB.getColumnIndex("cid_pFirstName"));
                        java.lang.String strC8 = c(cursorB, cursorB.getColumnIndex("cid_pLastName"));
                        java.lang.String strC9 = c(cursorB, cursorB.getColumnIndex("cid_pLogo"));
                        java.lang.String strC10 = c(cursorB, cursorB.getColumnIndex("cid_pDisplayName"));
                        snl.ac(context).bt().o(rmx.cJ);
                        if (android.text.TextUtils.isEmpty(strC10)) {
                            boolean zIsEmpty = android.text.TextUtils.isEmpty(strC7);
                            boolean zIsEmpty2 = android.text.TextUtils.isEmpty(strC8);
                            boolean zIsEmpty3 = android.text.TextUtils.isEmpty(strC5);
                            boolean zIsEmpty4 = android.text.TextUtils.isEmpty(strC6);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            if (zIsEmpty) {
                                if (zIsEmpty2) {
                                    if (!zIsEmpty3) {
                                        sb.append(strC5);
                                    } else if (zIsEmpty4) {
                                        strC10 = null;
                                    } else {
                                        sb.append(strC6);
                                    }
                                }
                                if (sb.length() > 0) {
                                    strC10 = sb.toString();
                                } else {
                                    strC10 = null;
                                }
                            } else {
                                sb.append(strC7);
                                if (!zIsEmpty2) {
                                    sb.append(' ');
                                }
                            }
                            if (!zIsEmpty2) {
                                sb.append(strC8);
                            }
                            if (sb.length() > 0) {
                                strC10 = sb.toString();
                            } else {
                                strC10 = null;
                            }
                        }
                        if (!android.text.TextUtils.isEmpty(strC) || android.text.TextUtils.isEmpty(strC2)) {
                            if (android.text.TextUtils.isEmpty(strC) || android.text.TextUtils.isEmpty(strC3)) {
                                strC2 = !android.text.TextUtils.isEmpty(strC4) ? strC4 : null;
                            } else {
                                strC2 = a.br(strC3, strC, ", ");
                            }
                        }
                        defpackage.rxc rxcVar = new defpackage.rxc(strC10, strC2, strC9);
                        cursorB.close();
                        return rxcVar;
                    }
                } catch (java.lang.Throwable th) {
                    if (cursorB == null) {
                        throw th;
                    }
                    try {
                        cursorB.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            snl.ac(context).bt().o(rmx.cK);
            if (cursorB == null) {
                return null;
            }
            cursorB.close();
            return null;
        } catch (java.lang.RuntimeException e) {
            a.bq(a.c(), "exception on query", "com/android/dialer/oem/CequintCallerIdManager", "lookup", (char) 251, "CequintCallerIdManager.java", e, zct.b);
            return null;
        }
    }

    public static ajcq b(final android.content.Context context) {
        return !((java.lang.Boolean) snl.ac(context).hB().a()).booleanValue() ? aiql.z(java.lang.Boolean.FALSE) : ahvr.F(new java.util.concurrent.Callable() { // from class: rxb
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.String str;
                if (!defpackage.rxe.b) {
                    android.content.Context context2 = context;
                    defpackage.rxe.b = true;
                    java.lang.String[] stringArray = context2.getResources().getStringArray(2130903056);
                    android.content.pm.PackageManager packageManager = context2.getPackageManager();
                    for (java.lang.String str2 : stringArray) {
                        aimz aimzVar = defpackage.rxf.a;
                        if (packageManager == null) {
                            defpackage.rxf.a.b().l("com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", 245, "CequintPackageUtils.java").v("failed to get PackageManager!");
                        } else {
                            android.content.pm.ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str2, 128);
                            if (providerInfoResolveContentProvider == null) {
                                a.bI(defpackage.rxf.a.d(), "Can't resolve content provider. May need a <queries> declaration for package info in Android R.", "com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", (char) 255, "CequintPackageUtils.java", zct.b);
                            } else {
                                java.lang.String str3 = "CequintPackageUtils.java";
                                java.lang.String str4 = providerInfoResolveContentProvider.packageName;
                                if (str4 == null) {
                                    a.bI(defpackage.rxf.a.d(), "can't get valid package name.", "com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", (char) 263, str3, zct.b);
                                } else {
                                    aimz aimzVar2 = defpackage.rxf.a;
                                    aimzVar2.b().l("com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", 267, str3).y("content provider package name : %s", str4);
                                    try {
                                        android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(str4, 64).signatures;
                                        if (signatureArr.length > 1) {
                                            aimzVar2.d().i(zct.b).l("com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", 275, str3).v("package has more than one signature.");
                                        } else {
                                            byte[] bArrA = defpackage.rxf.a(signatureArr[0].toByteArray());
                                            int i = 0;
                                            while (true) {
                                                java.util.List list = defpackage.rxf.b;
                                                if (i >= list.size()) {
                                                    break;
                                                }
                                                if (java.util.Arrays.equals((byte[]) list.get(i), bArrA)) {
                                                    aimw aimwVarL = aimzVar2.b().l("com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", 282, str3);
                                                    if (i == 0) {
                                                        str = "1024-signed";
                                                    } else if (i != 1) {
                                                        str = i != 2 ? "SprintPackage" : "VZWPackage";
                                                    } else {
                                                        str = "2048-signed";
                                                    }
                                                    aimwVarL.y("this is %s Caller Name ID APK.", str);
                                                    defpackage.rxe.c = str2;
                                                    defpackage.rxe.a.b().l("com/android/dialer/oem/CequintCallerIdManager", "isCequintCallerIdEnabledFuture", 165, "CequintCallerIdManager.java").y("found provider: %s", str2);
                                                    return java.lang.Boolean.TRUE;
                                                }
                                                i++;
                                            }
                                            a.bt(defpackage.rxf.a.d(), "signature check failed for package: %s", str4, "com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", (char) 296, str3, zct.b);
                                        }
                                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                                        hgb.g(defpackage.rxf.a.c(), "couldn't find package info for the package: %s", str4, "com/android/dialer/oem/CequintPackageUtils", "isCallerIdInstalled", (char) 291, str3, e, zct.b);
                                        str3 = str3;
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(defpackage.rxe.c != null);
            }
        }, snl.ac(context).fF());
    }

    private static java.lang.String c(android.database.Cursor cursor, int i) {
        if (!cursor.isNull(i)) {
            java.lang.String string = cursor.getString(i);
            if (!android.text.TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return null;
    }
}
