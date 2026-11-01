package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afax {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final java.lang.String[] c;
    private static final java.lang.String[] d;

    static {
        c = new java.lang.String[]{"media", (android.os.Build.HARDWARE.equals("goldfish") || android.os.Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new java.lang.String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 114(0x72, float:1.6E-43)
            if (r0 == r1) goto L4b
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == r1) goto L41
            r1 = 3653(0xe45, float:5.119E-42)
            if (r0 == r1) goto L38
            r1 = 3786(0xeca, float:5.305E-42)
            if (r0 == r1) goto L2f
            r1 = 3805(0xedd, float:5.332E-42)
            if (r0 == r1) goto L26
            r1 = 113359(0x1bacf, float:1.5885E-40)
            if (r0 != r1) goto L55
            java.lang.String r0 = "rwt"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L55
            goto L49
        L26:
            java.lang.String r0 = "wt"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L55
            goto L49
        L2f:
            java.lang.String r0 = "wa"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L55
            goto L49
        L38:
            java.lang.String r0 = "rw"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L55
            goto L49
        L41:
            java.lang.String r0 = "w"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L55
        L49:
            r2 = 2
            goto L54
        L4b:
            java.lang.String r0 = "r"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L55
            r2 = 1
        L54:
            return r2
        L55:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afax.a(java.lang.String):int");
    }

    public static android.content.res.AssetFileDescriptor b(android.content.Context context, android.net.Uri uri, java.lang.String str, defpackage.afaw afawVar) throws java.io.FileNotFoundException {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uri, str);
        }
        if ("content".equals(scheme)) {
            if (!f(context, uri, a(str), afawVar)) {
                throw new java.io.FileNotFoundException("Can't open content uri.");
            }
            android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, str);
            g(assetFileDescriptorOpenAssetFileDescriptor);
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new java.io.FileNotFoundException("Unsupported scheme");
        }
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, str);
        g(assetFileDescriptorOpenAssetFileDescriptor2);
        try {
            e(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uri, afawVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (java.io.FileNotFoundException e) {
            d(assetFileDescriptorOpenAssetFileDescriptor2, e);
            throw e;
        } catch (java.io.IOException e2) {
            java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            d(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static java.io.InputStream c(android.content.Context context, android.net.Uri uri, defpackage.afaw afawVar) throws java.io.FileNotFoundException {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uri);
        }
        if ("content".equals(scheme)) {
            if (!f(context, uri, 1, afawVar)) {
                throw new java.io.FileNotFoundException("Can't open content uri.");
            }
            java.io.InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            g(inputStreamOpenInputStream);
            return inputStreamOpenInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new java.io.FileNotFoundException("Unsupported scheme");
        }
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(android.net.Uri.fromFile(new java.io.File(uri.getPath()).getCanonicalFile()), "r");
            try {
                e(context, parcelFileDescriptorOpenFileDescriptor, uri, afawVar);
                return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
            } catch (java.io.FileNotFoundException e) {
                k(parcelFileDescriptorOpenFileDescriptor, e);
                throw e;
            } catch (java.io.IOException e2) {
                java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                k(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (java.io.IOException e3) {
            java.io.FileNotFoundException fileNotFoundException2 = new java.io.FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    public static void d(android.content.res.AssetFileDescriptor assetFileDescriptor, java.io.FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (java.io.IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        r7 = aa$.ExternalSyntheticApiModelOutline1.m(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r7 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r7 = aa$.ExternalSyntheticApiModelOutline1.m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r7 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r8.startsWith(i(r7)) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r7 = l(new defpackage.zpk(r6, 16));
        r0 = r7.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r2 >= r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r4 = r7[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        if (r4 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r8.startsWith(i(r4)) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r6 = l(new defpackage.zpk(r6, 17));
        r7 = r6.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r0 >= r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        r2 = r6[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        if (r2 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r8.startsWith(i(r2)) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r6, android.os.ParcelFileDescriptor r7, android.net.Uri r8, defpackage.afaw r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afax.e(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, afaw):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f A[PHI: r0 r1
      0x002f: PHI (r0v1 java.lang.String) = (r0v0 java.lang.String), (r0v3 java.lang.String) binds: [B:3:0x000e, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r1v2 android.content.pm.ProviderInfo) = (r1v1 android.content.pm.ProviderInfo), (r1v3 android.content.pm.ProviderInfo) binds: [B:3:0x000e, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[LOOP:1: B:32:0x0088->B:35:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[LOOP:2: B:37:0x0099->B:40:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:12:0x003f->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static boolean f(android.content.Context context, android.net.Uri uri, int i, defpackage.afaw afawVar) {
        defpackage.afpl afplVar;
        aike aikeVar;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String[] strArr;
        int i6;
        java.lang.String[] strArr2;
        int i7;
        java.lang.String[] strArr3;
        int i8;
        java.lang.String str;
        int iA;
        java.lang.String authority = uri.getAuthority();
        android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider != null) {
            afplVar = new defpackage.afpl(uri, providerInfoResolveContentProvider, (byte[]) null);
            defpackage.afaw afawVar2 = defpackage.afaw.a;
            aikeVar = afawVar.e;
            i2 = aikeVar.d;
            i3 = 0;
            while (true) {
                if (i3 < i2) {
                    i4 = 3;
                    break;
                }
                iA = ((defpackage.afay) aikeVar.get(i3)).a(context, afplVar, afawVar.c) - 1;
                i3++;
                if (iA != 0) {
                    i4 = 1;
                    break;
                }
                if (iA == 1) {
                    i4 = 2;
                    break;
                }
            }
            i5 = i4 - 1;
            if (i5 != 0) {
                if (i5 != 1) {
                    return false;
                }
                if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
                    return afawVar.c;
                }
                if (!afawVar.c) {
                    return false;
                }
                if (context.checkUriPermission(uri, android.os.Process.myPid(), android.os.Process.myUid(), i) != 0 && providerInfoResolveContentProvider.exported) {
                    strArr = c;
                    int length = strArr.length;
                    for (i6 = 0; i6 < 2; i6++) {
                        if (!strArr[i6].equals(authority)) {
                        }
                    }
                    strArr2 = d;
                    int length2 = strArr2.length;
                    for (i7 = 0; i7 < 3; i7++) {
                        if (!strArr2[i7].equals(authority)) {
                        }
                    }
                    strArr3 = b;
                    for (i8 = 0; i8 < 7; i8++) {
                        str = strArr3[i8];
                        if (str.charAt(str.length() - 1) == '.') {
                            if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                                return false;
                            }
                        } else if (!providerInfoResolveContentProvider.packageName.equals(str)) {
                            return false;
                        }
                    }
                }
            }
        } else {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                defpackage.afaw afawVar3 = defpackage.afaw.a;
                if (afawVar.c) {
                    return false;
                }
            } else {
                afplVar = new defpackage.afpl(uri, providerInfoResolveContentProvider, (byte[]) null);
                defpackage.afaw afawVar4 = defpackage.afaw.a;
                aikeVar = afawVar.e;
                i2 = aikeVar.d;
                i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        i4 = 3;
                        break;
                    }
                    iA = ((defpackage.afay) aikeVar.get(i3)).a(context, afplVar, afawVar.c) - 1;
                    i3++;
                    if (iA != 0) {
                        i4 = 1;
                        break;
                    }
                    if (iA == 1) {
                        i4 = 2;
                        break;
                    }
                }
                i5 = i4 - 1;
                if (i5 != 0) {
                    if (i5 != 1) {
                        return false;
                    }
                    if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
                        return afawVar.c;
                    }
                    if (!afawVar.c) {
                        return false;
                    }
                    if (context.checkUriPermission(uri, android.os.Process.myPid(), android.os.Process.myUid(), i) != 0) {
                        strArr = c;
                        int length3 = strArr.length;
                        while (i6 < 2) {
                            if (!strArr[i6].equals(authority)) {
                            }
                        }
                        strArr2 = d;
                        int length4 = strArr2.length;
                        while (i7 < 3) {
                            if (!strArr2[i7].equals(authority)) {
                            }
                        }
                        strArr3 = b;
                        while (i8 < 7) {
                            str = strArr3[i8];
                            if (str.charAt(str.length() - 1) == '.') {
                                if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                                    return false;
                                }
                            } else if (!providerInfoResolveContentProvider.packageName.equals(str)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void g(java.lang.Object obj) throws java.io.FileNotFoundException {
        if (obj == null) {
            throw new java.io.FileNotFoundException("Content resolver returned null value.");
        }
    }

    @java.lang.Deprecated
    public static android.os.ParcelFileDescriptor h(android.content.Context context, android.net.Uri uri, defpackage.afaw afawVar) throws java.io.FileNotFoundException {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openFileDescriptor(uri, "r");
        }
        if ("content".equals(scheme)) {
            if (!f(context, uri, a("r"), afawVar)) {
                throw new java.io.FileNotFoundException("Can't open content uri.");
            }
            android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            g(parcelFileDescriptorOpenFileDescriptor);
            return parcelFileDescriptorOpenFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new java.io.FileNotFoundException("Unsupported scheme");
        }
        android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(uri, "r");
        try {
            e(context, parcelFileDescriptorOpenFileDescriptor2, uri, afawVar);
            return parcelFileDescriptorOpenFileDescriptor2;
        } catch (java.io.FileNotFoundException e) {
            k(parcelFileDescriptorOpenFileDescriptor2, e);
            throw e;
        } catch (java.io.IOException e2) {
            java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            k(parcelFileDescriptorOpenFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    private static java.lang.String i(java.io.File file) throws java.io.IOException {
        java.lang.String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? java.lang.String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void j(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str) throws java.io.IOException {
        try {
            android.system.StructStat structStatFstat = android.system.Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                android.system.StructStat structStatLstat = android.system.Os.lstat(str);
                if (android.system.OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new java.io.FileNotFoundException("Can't open file: ".concat(java.lang.String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new java.io.FileNotFoundException("Can't open file: ".concat(java.lang.String.valueOf(str)));
                }
            } catch (android.system.ErrnoException e) {
                throw new java.io.IOException(e);
            }
        } catch (android.system.ErrnoException e2) {
            throw new java.io.IOException(e2);
        }
    }

    private static void k(android.os.ParcelFileDescriptor parcelFileDescriptor, java.io.FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (java.io.IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static java.io.File[] l(java.util.concurrent.Callable callable) {
        try {
            return (java.io.File[]) callable.call();
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
