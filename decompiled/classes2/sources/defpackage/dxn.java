package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dxn {
    public static final add a = new add(16);
    public static final java.util.concurrent.ExecutorService b;
    public static final java.lang.Object c;
    public static final aec d;

    static {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new defpackage.ibm(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new java.lang.Object();
        d = new aec(0);
    }

    public static java.lang.String a(java.util.List list, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((dxj) list.get(i2)).h);
            sb.append('-');
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(';');
            }
        }
        return sb.toString();
    }

    public static amwp b(java.lang.String str, android.content.Context context, java.util.List list, int i) throws android.os.RemoteException {
        amwp amwpVar;
        int i2;
        byte[] bArr;
        int i3;
        java.util.List list2;
        int i4;
        int length;
        android.graphics.Typeface typefaceI;
        android.content.pm.ProviderInfo providerInfoResolveContentProvider;
        android.database.Cursor cursorQuery;
        java.lang.String[] strArr;
        int i5;
        java.lang.String str2;
        android.graphics.Typeface typefaceA;
        java.lang.String str3 = "content";
        dzk.G("getFontSync");
        try {
            android.graphics.Typeface typeface = (android.graphics.Typeface) a.a(str);
            if (typeface != null) {
                amwpVar = new amwp(typeface);
            } else {
                try {
                    add addVar = defpackage.dxi.a;
                    dzk.G("FontProvider.getFontFamilyResult");
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= list.size()) {
                                i2 = i6;
                                bArr = null;
                                android.os.Trace.endSection();
                                i3 = i2;
                                list2 = arrayList;
                                break;
                            }
                            dxj dxjVar = (dxj) list.get(i7);
                            if (android.os.Build.VERSION.SDK_INT < 31 || (typefaceA = dwq.a((str2 = dxjVar.f))) == null || dwq.b(typefaceA) == null) {
                                android.content.pm.PackageManager packageManager = context.getPackageManager();
                                android.content.res.Resources resources = context.getResources();
                                dzk.G("FontProvider.getProvider");
                                try {
                                    java.util.List listG = dxjVar.d;
                                    if (listG == null) {
                                        listG = dff.g(resources, dxjVar.e);
                                    }
                                    java.lang.String str4 = dxjVar.a;
                                    bArr = null;
                                    java.lang.String str5 = dxjVar.b;
                                    defpackage.dxh dxhVar = new defpackage.dxh(str4, str5, listG);
                                    add addVar2 = defpackage.dxi.a;
                                    android.content.pm.ProviderInfo providerInfo = (android.content.pm.ProviderInfo) addVar2.a(dxhVar);
                                    if (providerInfo != null) {
                                        android.os.Trace.endSection();
                                        providerInfoResolveContentProvider = providerInfo;
                                    } else {
                                        providerInfoResolveContentProvider = packageManager.resolveContentProvider(str4, i6);
                                        if (providerInfoResolveContentProvider == null) {
                                            throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: " + str4);
                                        }
                                        if (!providerInfoResolveContentProvider.packageName.equals(str5)) {
                                            throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + str4 + ", but package was not " + dxjVar.b);
                                        }
                                        android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        int length2 = signatureArr.length;
                                        int i8 = 0;
                                        while (i8 < length2) {
                                            arrayList2.add(signatureArr[i8].toByteArray());
                                            i8++;
                                            signatureArr = signatureArr;
                                        }
                                        java.util.Comparator comparator = defpackage.dxi.b;
                                        java.util.Collections.sort(arrayList2, comparator);
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= listG.size()) {
                                                android.os.Trace.endSection();
                                                providerInfoResolveContentProvider = null;
                                                break;
                                            }
                                            int i10 = i9;
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList((java.util.Collection) listG.get(i9));
                                            java.util.Collections.sort(arrayList3, comparator);
                                            java.util.Comparator comparator2 = comparator;
                                            if (arrayList2.size() == arrayList3.size()) {
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 >= arrayList2.size()) {
                                                        addVar2.b(dxhVar, providerInfoResolveContentProvider);
                                                        android.os.Trace.endSection();
                                                        break;
                                                    }
                                                    int i12 = i11;
                                                    if (!java.util.Arrays.equals((byte[]) arrayList2.get(i11), (byte[]) arrayList3.get(i11))) {
                                                        break;
                                                    }
                                                    i11 = i12 + 1;
                                                }
                                            }
                                            i9 = i10 + 1;
                                            comparator = comparator2;
                                        }
                                    }
                                    if (providerInfoResolveContentProvider == null) {
                                        i2 = 0;
                                        java.util.List listSingletonList = java.util.Collections.singletonList(null);
                                        android.os.Trace.endSection();
                                        i3 = 1;
                                        list2 = listSingletonList;
                                        break;
                                    }
                                    java.lang.String str6 = providerInfoResolveContentProvider.authority;
                                    dzk.G("FontProvider.query");
                                    try {
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme(str3).authority(str6).build();
                                        android.net.Uri uriBuild2 = new android.net.Uri.Builder().scheme(str3).authority(str6).appendPath("file").build();
                                        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                                        try {
                                            java.lang.String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                                            dzk.G("ContentQueryWrapper.query");
                                            try {
                                                java.lang.String str7 = dxjVar.g;
                                                if (str7 == null) {
                                                    strArr = new java.lang.String[]{dxjVar.c};
                                                    break;
                                                }
                                                int length3 = str7.length();
                                                int iCharCount = 0;
                                                while (true) {
                                                    if (iCharCount >= length3) {
                                                        strArr = new java.lang.String[]{dxjVar.c};
                                                        break;
                                                    }
                                                    int iCodePointAt = str7.codePointAt(iCharCount);
                                                    if (!java.lang.Character.isWhitespace(iCodePointAt)) {
                                                        strArr = new java.lang.String[]{dxjVar.c, "VF"};
                                                        break;
                                                    }
                                                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                                                }
                                                java.lang.String[] strArr3 = strArr;
                                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                                    try {
                                                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr2, "query = ?", strArr3, null, null);
                                                    } catch (android.os.RemoteException e) {
                                                        uriBuild = uriBuild;
                                                        android.util.Log.w("FontsProvider", "Unable to query the content provider", e);
                                                        cursorQuery = null;
                                                    }
                                                } else {
                                                    cursorQuery = null;
                                                }
                                                try {
                                                    android.os.Trace.endSection();
                                                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                                                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                                                        arrayList4 = new java.util.ArrayList();
                                                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                                                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                                                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                                                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                                                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                                                        while (cursorQuery.moveToNext()) {
                                                            arrayList4.add(new defpackage.dxo(columnIndex3 == -1 ? android.content.ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : android.content.ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, dxjVar.g, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                                                            columnIndex = columnIndex;
                                                        }
                                                    }
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    defpackage.dvh.e(contentProviderClientAcquireUnstableContentProviderClient);
                                                    i5 = 0;
                                                    defpackage.dxo[] dxoVarArr = (defpackage.dxo[]) arrayList4.toArray(new defpackage.dxo[0]);
                                                    android.os.Trace.endSection();
                                                    arrayList.add(dxoVarArr);
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    defpackage.dvh.e(contentProviderClientAcquireUnstableContentProviderClient);
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                android.os.Trace.endSection();
                                                throw th2;
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            cursorQuery = null;
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        android.os.Trace.endSection();
                                        throw th4;
                                    }
                                } catch (java.lang.Throwable th5) {
                                    android.os.Trace.endSection();
                                    throw th5;
                                }
                            } else {
                                defpackage.dxo[] dxoVarArr2 = new defpackage.dxo[1];
                                dxoVarArr2[i6] = new defpackage.dxo(str2, dxjVar.g);
                                arrayList.add(dxoVarArr2);
                                str3 = str3;
                                i5 = i6;
                                i7 = i7;
                            }
                            i7++;
                            i6 = i5;
                            str3 = str3;
                        }
                        if (i3 != 0) {
                            i4 = -2;
                        } else {
                            defpackage.dxo[] dxoVarArrD = defpackage.dvl.d(list2);
                            if (dxoVarArrD == null || (length = dxoVarArrD.length) == 0) {
                                i4 = 1;
                            } else {
                                int i13 = i2;
                                while (true) {
                                    if (i13 >= length) {
                                        i4 = i2;
                                        break;
                                    }
                                    i4 = dxoVarArrD[i13].f;
                                    if (i4 != 0) {
                                        if (i4 >= 0) {
                                            break;
                                        }
                                        i4 = -3;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        if (i4 != 0) {
                            amwpVar = new amwp(i4, bArr);
                        } else {
                            if (list2.size() > 1) {
                                add addVar3 = dwq.a;
                                dzk.G("TypefaceCompat.createFromFontInfoWithFallback");
                                try {
                                    typefaceI = dwq.b.j(context, list2, i);
                                    android.os.Trace.endSection();
                                } finally {
                                    android.os.Trace.endSection();
                                }
                            } else {
                                defpackage.dxo[] dxoVarArrD2 = defpackage.dvl.d(list2);
                                add addVar4 = dwq.a;
                                dzk.G("TypefaceCompat.createFromFontInfo");
                                try {
                                    typefaceI = dwq.b.i(context, dxoVarArrD2, i);
                                    android.os.Trace.endSection();
                                } finally {
                                    android.os.Trace.endSection();
                                }
                            }
                            if (typefaceI != null) {
                                a.b(str, typefaceI);
                                amwpVar = new amwp(typefaceI);
                            } else {
                                amwpVar = new amwp(-3, (byte[]) null);
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        android.os.Trace.endSection();
                        throw th6;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    amwpVar = new amwp(-1, (byte[]) null);
                }
            }
            return amwpVar;
        } catch (java.lang.Throwable th7) {
            android.os.Trace.endSection();
            throw th7;
        }
    }
}
