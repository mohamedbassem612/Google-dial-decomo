package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gzl {
    public static final java.util.Map a = new java.util.HashMap();
    private static final java.util.Set b = new java.util.HashSet();
    private static final byte[] c = {80, 75, 3, 4};
    private static final byte[] d = {31, -117, 8};

    public static defpackage.gzy a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        defpackage.gzy gzyVarH;
        defpackage.gzh gzhVarA = str2 == null ? null : defpackage.hcy.a.a(str2);
        if (gzhVarA != null) {
            return new defpackage.gzy(gzhVarA);
        }
        try {
            appx appxVar = new appx(aoov.aN(context.getAssets().open(str)));
            if (m(appxVar, c).booleanValue()) {
                gzyVarH = i(context, new java.util.zip.ZipInputStream(new appw(appxVar)), str2);
            } else {
                gzyVarH = l(appxVar).booleanValue() ? h(new java.util.zip.GZIPInputStream(new appw(appxVar)), str2) : h(new appw(appxVar), str2);
            }
            return gzyVarH;
        } catch (java.io.IOException e) {
            return new defpackage.gzy((java.lang.Throwable) e);
        }
    }

    public static defpackage.gzy b(android.content.Context context, int i, java.lang.String str) {
        defpackage.gzy gzyVar;
        defpackage.gzh gzhVarA = str == null ? null : defpackage.hcy.a.a(str);
        if (gzhVarA != null) {
            return new defpackage.gzy(gzhVarA);
        }
        try {
            appx appxVar = new appx(aoov.aN(context.getResources().openRawResource(i)));
            if (m(appxVar, c).booleanValue()) {
                return i(context, new java.util.zip.ZipInputStream(new appw(appxVar)), str);
            }
            if (!l(appxVar).booleanValue()) {
                appx appxVar2 = new appx(aoov.aN(new appw(appxVar)));
                java.lang.String[] strArr = defpackage.hfz.a;
                return k(new hga(appxVar2), str, true);
            }
            try {
                appx appxVar3 = new appx(aoov.aN(new java.util.zip.GZIPInputStream(new appw(appxVar))));
                java.lang.String[] strArr2 = defpackage.hfz.a;
                return k(new hga(appxVar3), str, true);
            } catch (java.io.IOException e) {
                gzyVar = new defpackage.gzy((java.lang.Throwable) e);
                return gzyVar;
            }
        } catch (android.content.res.Resources.NotFoundException e2) {
            gzyVar = new defpackage.gzy((java.lang.Throwable) e2);
            return gzyVar;
        }
    }

    public static haa c(final java.lang.String str, java.util.concurrent.Callable callable, java.lang.Runnable runnable) {
        defpackage.gzh gzhVarA = str == null ? null : defpackage.hcy.a.a(str);
        haa haaVar = gzhVarA != null ? new haa(gzhVarA) : null;
        if (str != null) {
            java.util.Map map = a;
            if (map.containsKey(str)) {
                haaVar = (haa) map.get(str);
            }
        }
        if (haaVar == null) {
            final int i = 0;
            haaVar = new haa(callable, false);
            if (str != null) {
                final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                final int i2 = 1;
                haaVar.d(new defpackage.gzu() { // from class: gzi
                    @Override // defpackage.gzu
                    public final void a(java.lang.Object obj) {
                        if (i2 != 0) {
                            java.util.Map map2 = defpackage.gzl.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                defpackage.gzl.j();
                                return;
                            }
                            return;
                        }
                        java.util.Map map3 = defpackage.gzl.a;
                        map3.remove(str);
                        atomicBoolean.set(true);
                        if (map3.size() == 0) {
                            defpackage.gzl.j();
                        }
                    }
                });
                haaVar.c(new defpackage.gzu() { // from class: gzi
                    @Override // defpackage.gzu
                    public final void a(java.lang.Object obj) {
                        if (i != 0) {
                            java.util.Map map2 = defpackage.gzl.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                defpackage.gzl.j();
                                return;
                            }
                            return;
                        }
                        java.util.Map map3 = defpackage.gzl.a;
                        map3.remove(str);
                        atomicBoolean.set(true);
                        if (map3.size() == 0) {
                            defpackage.gzl.j();
                        }
                    }
                });
                if (!atomicBoolean.get()) {
                    java.util.Map map2 = a;
                    map2.put(str, haaVar);
                    if (map2.size() == 1) {
                        j();
                    }
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
        return haaVar;
    }

    public static haa d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return c(str2, new defpackage.hsl(context.getApplicationContext(), str, str2, 1, (byte[]) null), null);
    }

    public static haa e(android.content.Context context, int i, java.lang.String str) {
        return c(str, new defpackage.nzd(new java.lang.ref.WeakReference(context), context.getApplicationContext(), i, str, 1), null);
    }

    public static haa f(final android.content.Context context, final java.lang.String str, final java.lang.String str2) {
        return c(str2, new java.util.concurrent.Callable() { // from class: gzj
            /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Throwable {
                java.lang.Object obj;
                defpackage.gzy gzyVar;
                defpackage.gzy gzyVarI;
                defpackage.hep hepVar;
                java.lang.Object obj2;
                android.util.Pair pair;
                defpackage.gzy gzyVarI2;
                defpackage.hep hepVar2;
                defpackage.heq heqVar;
                java.util.Map map = defpackage.gzl.a;
                defpackage.her herVar = defpackage.hgt.b;
                android.content.Context context2 = context;
                defpackage.heo heoVar = null;
                java.lang.String message = null;
                heoVar = null;
                if (herVar == null) {
                    synchronized (defpackage.her.class) {
                        herVar = defpackage.hgt.b;
                        if (herVar == null) {
                            android.content.Context applicationContext = context2.getApplicationContext();
                            defpackage.heq heqVar2 = defpackage.hgt.c;
                            if (heqVar2 == null) {
                                synchronized (defpackage.heq.class) {
                                    try {
                                        heqVar = defpackage.hgt.c;
                                        if (heqVar == null) {
                                            heqVar = new defpackage.heq(new rai(applicationContext), (byte[]) null);
                                            defpackage.hgt.c = heqVar;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                                heqVar2 = heqVar;
                            }
                            herVar = new defpackage.her(heqVar2);
                            defpackage.hgt.b = herVar;
                        }
                    }
                }
                java.lang.String str3 = str2;
                java.lang.String str4 = str;
                if (str3 != null) {
                    java.lang.Object obj3 = herVar.a;
                    try {
                        java.io.File file = new java.io.File(((defpackage.heq) obj3).a(), defpackage.heq.c(str4, defpackage.hep.JSON, false));
                        if (!file.exists()) {
                            file = new java.io.File(((defpackage.heq) obj3).a(), defpackage.heq.c(str4, defpackage.hep.ZIP, false));
                            if (!file.exists()) {
                                file = new java.io.File(((defpackage.heq) obj3).a(), defpackage.heq.c(str4, defpackage.hep.GZIP, false));
                                if (!file.exists()) {
                                    file = null;
                                }
                            }
                        }
                        if (file != null) {
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                            if (file.getAbsolutePath().endsWith(".zip")) {
                                hepVar2 = defpackage.hep.ZIP;
                            } else {
                                hepVar2 = file.getAbsolutePath().endsWith(".gz") ? defpackage.hep.GZIP : defpackage.hep.JSON;
                            }
                            file.getAbsolutePath();
                            int i = defpackage.hge.a;
                            pair = new android.util.Pair(hepVar2, fileInputStream);
                        } else {
                            pair = null;
                        }
                    } catch (java.io.FileNotFoundException unused) {
                    }
                    if (pair != null) {
                        defpackage.hep hepVar3 = (defpackage.hep) pair.first;
                        java.io.InputStream inputStream = (java.io.InputStream) pair.second;
                        defpackage.hep hepVar4 = defpackage.hep.JSON;
                        int iOrdinal = hepVar3.ordinal();
                        if (iOrdinal == 1) {
                            gzyVarI2 = defpackage.gzl.i(context2, new java.util.zip.ZipInputStream(inputStream), str3);
                        } else if (iOrdinal != 2) {
                            gzyVarI2 = defpackage.gzl.h(inputStream, str3);
                        } else {
                            try {
                                gzyVarI2 = defpackage.gzl.h(new java.util.zip.GZIPInputStream(inputStream), str3);
                            } catch (java.io.IOException e) {
                                gzyVarI2 = new defpackage.gzy((java.lang.Throwable) e);
                            }
                        }
                        obj = gzyVarI2.a;
                        if (obj == null) {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                if (obj != null) {
                    gzyVar = new defpackage.gzy(obj);
                } else {
                    int i2 = defpackage.hge.a;
                    try {
                        try {
                            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str4).openConnection();
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.connect();
                            defpackage.heo heoVar2 = new defpackage.heo(httpURLConnection);
                            try {
                                try {
                                    if (heoVar2.a()) {
                                        java.net.HttpURLConnection httpURLConnection2 = heoVar2.a;
                                        java.io.InputStream inputStream2 = httpURLConnection2.getInputStream();
                                        java.lang.String contentType = httpURLConnection2.getContentType();
                                        if (contentType == null) {
                                            contentType = "application/json";
                                        }
                                        if (contentType.contains("application/zip") || contentType.contains("application/x-zip") || contentType.contains("application/x-zip-compressed") || str4.split("\\?")[0].endsWith(".lottie")) {
                                            defpackage.hep hepVar5 = defpackage.hep.ZIP;
                                            gzyVarI = str3 != null ? defpackage.gzl.i(context2, new java.util.zip.ZipInputStream(new java.io.FileInputStream(((defpackage.heq) herVar.a).b(str4, inputStream2, hepVar5))), str4) : defpackage.gzl.i(context2, new java.util.zip.ZipInputStream(inputStream2), null);
                                            hepVar = hepVar5;
                                        } else if (contentType.contains("application/gzip") || contentType.contains("application/x-gzip") || str4.split("\\?")[0].endsWith(".tgs")) {
                                            hepVar = defpackage.hep.GZIP;
                                            gzyVarI = str3 != null ? defpackage.gzl.h(new java.util.zip.GZIPInputStream(new java.io.FileInputStream(((defpackage.heq) herVar.a).b(str4, inputStream2, hepVar))), str4) : defpackage.gzl.h(new java.util.zip.GZIPInputStream(inputStream2), null);
                                        } else {
                                            hepVar = defpackage.hep.JSON;
                                            gzyVarI = str3 != null ? defpackage.gzl.h(new java.io.FileInputStream(((defpackage.heq) herVar.a).b(str4, inputStream2, hepVar).getAbsolutePath()), str4) : defpackage.gzl.h(inputStream2, null);
                                        }
                                        if (str3 != null && gzyVarI.a != null) {
                                            java.io.File file2 = new java.io.File(((defpackage.heq) herVar.a).a(), defpackage.heq.c(str4, hepVar, true));
                                            java.io.File file3 = new java.io.File(file2.getAbsolutePath().replace(".temp", ""));
                                            boolean zRenameTo = file2.renameTo(file3);
                                            file3.toString();
                                            if (!zRenameTo) {
                                                defpackage.hge.a("Unable to rename cache file " + file2.getAbsolutePath() + " to " + file3.getAbsolutePath() + '.');
                                            }
                                        }
                                        java.lang.Object obj4 = gzyVarI.a;
                                        try {
                                            heoVar2.close();
                                        } catch (java.io.IOException e2) {
                                            defpackage.hge.b("LottieFetchResult close failed ", e2);
                                        }
                                        gzyVar = gzyVarI;
                                    } else {
                                        try {
                                            if (!heoVar2.a()) {
                                                java.net.HttpURLConnection httpURLConnection3 = heoVar2.a;
                                                java.lang.String strValueOf = java.lang.String.valueOf(httpURLConnection3.getURL());
                                                int responseCode = httpURLConnection3.getResponseCode();
                                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection3.getErrorStream()));
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                while (true) {
                                                    try {
                                                        java.lang.String line = bufferedReader.readLine();
                                                        if (line != null) {
                                                            sb.append(line);
                                                            sb.append('\n');
                                                        } else {
                                                            try {
                                                                break;
                                                            } catch (java.lang.Exception unused2) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th2) {
                                                        try {
                                                            bufferedReader.close();
                                                        } catch (java.lang.Exception unused3) {
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                bufferedReader.close();
                                                message = "Unable to fetch " + strValueOf + ". Failed with " + responseCode + '\n' + sb.toString();
                                            }
                                        } catch (java.io.IOException e3) {
                                            defpackage.hge.b("get error failed ", e3);
                                            message = e3.getMessage();
                                        }
                                        gzyVar = new defpackage.gzy((java.lang.Throwable) new java.lang.IllegalArgumentException(message));
                                        try {
                                            heoVar2.close();
                                        } catch (java.io.IOException e4) {
                                            defpackage.hge.b("LottieFetchResult close failed ", e4);
                                        }
                                    }
                                } catch (java.lang.Exception e5) {
                                    e = e5;
                                    heoVar = heoVar2;
                                    defpackage.gzy gzyVar2 = new defpackage.gzy((java.lang.Throwable) e);
                                    if (heoVar != null) {
                                        try {
                                            heoVar.close();
                                        } catch (java.io.IOException e6) {
                                            defpackage.hge.b("LottieFetchResult close failed ", e6);
                                        }
                                    }
                                    gzyVar = gzyVar2;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                heoVar = heoVar2;
                                if (heoVar != null) {
                                    try {
                                        heoVar.close();
                                    } catch (java.io.IOException e7) {
                                        defpackage.hge.b("LottieFetchResult close failed ", e7);
                                    }
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception e8) {
                            e = e8;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                }
                if (str3 != null && (obj2 = gzyVar.a) != null) {
                    defpackage.hcy.a.b(str3, (defpackage.gzh) obj2);
                }
                return gzyVar;
            }
        }, null);
    }

    public static java.lang.String g(android.content.Context context, int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("rawRes");
        sb.append(i2 != 32 ? "_day_" : "_night_");
        sb.append(i);
        return sb.toString();
    }

    public static defpackage.gzy h(java.io.InputStream inputStream, java.lang.String str) {
        appx appxVar = new appx(aoov.aN(inputStream));
        java.lang.String[] strArr = defpackage.hfz.a;
        return k(new hga(appxVar), str, true);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026d A[Catch: all -> 0x0287, TryCatch #3 {all -> 0x0287, blocks: (B:2:0x0000, B:8:0x0017, B:9:0x001e, B:12:0x0026, B:14:0x0032, B:58:0x012e, B:15:0x0037, B:17:0x0043, B:18:0x0048, B:20:0x0054, B:21:0x006c, B:24:0x0077, B:26:0x007f, B:28:0x0087, B:30:0x008f, B:32:0x0097, B:34:0x009f, B:35:0x00a4, B:53:0x00f4, B:55:0x00fe, B:56:0x011b, B:52:0x00e7, B:57:0x011f, B:61:0x0136, B:62:0x0144, B:63:0x014c, B:65:0x0152, B:66:0x016d, B:68:0x0173, B:73:0x0185, B:74:0x0196, B:75:0x019e, B:77:0x01a5, B:78:0x01b9, B:80:0x01bf, B:82:0x01d3, B:84:0x01df, B:85:0x01ff, B:87:0x0205, B:88:0x0214, B:90:0x021a, B:92:0x0228, B:94:0x023d, B:97:0x0247, B:98:0x0254, B:100:0x0265, B:102:0x026d, B:103:0x0275, B:6:0x000f, B:105:0x027c), top: B:117:0x0000, inners: #1, #5 }] */
    public static defpackage.gzy i(android.content.Context context, java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        defpackage.gzh gzhVarA;
        defpackage.gzt gztVar;
        try {
            java.util.HashMap map = new java.util.HashMap();
            java.util.HashMap map2 = new java.util.HashMap();
            defpackage.gzy gzyVar = null;
            if (str == null) {
                gzhVarA = null;
            } else {
                try {
                    gzhVarA = defpackage.hcy.a.a(str);
                } catch (java.io.IOException e) {
                    gzyVar = new defpackage.gzy((java.lang.Throwable) e);
                }
            }
            if (gzhVarA != null) {
                gzyVar = new defpackage.gzy(gzhVarA);
            } else {
                java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                java.lang.Object obj = null;
                while (nextEntry != null) {
                    java.lang.String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        appx appxVar = new appx(aoov.aN(zipInputStream));
                        java.lang.String[] strArr = defpackage.hfz.a;
                        obj = k(new hga(appxVar), null, false).a;
                    } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                        java.lang.String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], android.graphics.BitmapFactory.decodeStream(zipInputStream));
                    } else if (name.contains(".ttf") || name.contains(".otf")) {
                        java.lang.String[] strArrSplit2 = name.split("/");
                        java.lang.String str2 = strArrSplit2[strArrSplit2.length - 1];
                        java.lang.String str3 = str2.split("\\.")[0];
                        java.io.File file = new java.io.File(context.getCacheDir(), str2);
                        new java.io.FileOutputStream(file);
                        try {
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = zipInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                android.graphics.Typeface typefaceCreateFromFile = android.graphics.Typeface.createFromFile(file);
                                if (!file.delete()) {
                                    defpackage.hge.a("Failed to delete temp font file " + file.getAbsolutePath() + '.');
                                }
                                map2.put(str3, typefaceCreateFromFile);
                            } catch (java.lang.Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            defpackage.hge.b(a.bD(str2, str3, "Unable to save font ", " to the temporary file: ", ". "), th3);
                        }
                    } else {
                        zipInputStream.closeEntry();
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    gzyVar = new defpackage.gzy((java.lang.Throwable) new java.lang.IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str4 = (java.lang.String) entry.getKey();
                        java.util.Iterator it = ((defpackage.gzh) obj).d().values().iterator();
                        do {
                            if (!it.hasNext()) {
                                gztVar = null;
                                break;
                            }
                            gztVar = (defpackage.gzt) it.next();
                        } while (!gztVar.d.equals(str4));
                        if (gztVar != null) {
                            gztVar.f = defpackage.hgm.d((android.graphics.Bitmap) entry.getValue(), gztVar.a, gztVar.b);
                        }
                    }
                    for (java.util.Map.Entry entry2 : map2.entrySet()) {
                        boolean z = false;
                        for (defpackage.kgo kgoVar : ((defpackage.gzh) obj).d.values()) {
                            if (((java.lang.String) kgoVar.b).equals(entry2.getKey())) {
                                kgoVar.c = (android.graphics.Typeface) entry2.getValue();
                                z = true;
                            }
                        }
                        if (!z) {
                            defpackage.hge.a("Parsed font for " + ((java.lang.String) entry2.getKey()) + " however it was not found in the animation.");
                        }
                    }
                    if (map.isEmpty()) {
                        java.util.Iterator it2 = ((defpackage.gzh) obj).d().entrySet().iterator();
                        while (it2.hasNext()) {
                            defpackage.gzt gztVar2 = (defpackage.gzt) ((java.util.Map.Entry) it2.next()).getValue();
                            if (gztVar2 != null) {
                                java.lang.String str5 = gztVar2.d;
                                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                                options.inScaled = true;
                                options.inDensity = 160;
                                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                                    try {
                                        byte[] bArrDecode = android.util.Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                                        gztVar2.f = defpackage.hgm.d(android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), gztVar2.a, gztVar2.b);
                                    } catch (java.lang.IllegalArgumentException e2) {
                                        defpackage.hge.b("data URL did not have correct base64 format.", e2);
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            defpackage.hcy.a.b(str, (defpackage.gzh) obj);
                        }
                        gzyVar = new defpackage.gzy(obj);
                    } else {
                        if (str != null) {
                            defpackage.hcy.a.b(str, (defpackage.gzh) obj);
                        }
                        gzyVar = new defpackage.gzy(obj);
                    }
                }
            }
            java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
            mni.bg(zipInputStream);
            return gzyVar;
        } catch (java.lang.Throwable th4) {
            java.lang.ThreadLocal threadLocal2 = defpackage.hgm.a;
            mni.bg(zipInputStream);
            throw th4;
        }
    }

    public static void j() {
        java.util.ArrayList arrayList = new java.util.ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((defpackage.hab) arrayList.get(i)).a();
        }
    }

    private static defpackage.gzy k(defpackage.hfz hfzVar, java.lang.String str, boolean z) {
        defpackage.gzy gzyVar;
        defpackage.gzh gzhVarA;
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        float f4;
        float f5;
        try {
            try {
                if (str == null) {
                    gzhVarA = null;
                } else {
                    try {
                        gzhVarA = defpackage.hcy.a.a(str);
                    } catch (java.lang.Exception e) {
                        gzyVar = new defpackage.gzy((java.lang.Throwable) e);
                    }
                }
                if (gzhVarA != null) {
                    gzyVar = new defpackage.gzy(gzhVarA);
                } else {
                    defpackage.kvt kvtVar = defpackage.hfk.a;
                    java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                    float f6 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
                    adb adbVar = new adb(10);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.HashMap map = new java.util.HashMap();
                    java.util.HashMap map2 = new java.util.HashMap();
                    java.util.HashMap map3 = new java.util.HashMap();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    aed aedVar = new aed((byte[]) null);
                    defpackage.gzh gzhVar = new defpackage.gzh();
                    hfzVar.h();
                    int iB = 0;
                    float fA = 0.0f;
                    int iB2 = 0;
                    float fA2 = 0.0f;
                    float fA3 = 0.0f;
                    while (hfzVar.n()) {
                        int i3 = 4;
                        switch (hfzVar.q(defpackage.hfk.a)) {
                            case 0:
                                iB2 = hfzVar.b();
                                f6 = f6;
                                fA = fA;
                                break;
                            case 1:
                                f = f6;
                                f2 = fA;
                                i = iB2;
                                iB = hfzVar.b();
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 2:
                                i = iB2;
                                fA = (float) hfzVar.a();
                                f6 = f6;
                                iB2 = i;
                                break;
                            case 3:
                                f = f6;
                                f2 = fA;
                                i = iB2;
                                fA2 = ((float) hfzVar.a()) - 0.01f;
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 4:
                                f = f6;
                                f2 = fA;
                                i = iB2;
                                fA3 = (float) hfzVar.a();
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 5:
                                f = f6;
                                f2 = fA;
                                i = iB2;
                                java.lang.String[] strArrSplit = hfzVar.f().split("\\.");
                                int i4 = java.lang.Integer.parseInt(strArrSplit[0]);
                                int i5 = java.lang.Integer.parseInt(strArrSplit[1]);
                                int i6 = java.lang.Integer.parseInt(strArrSplit[2]);
                                if (i4 < 4 || (i4 <= 4 && (i5 < 4 || (i5 <= 4 && i6 < 0)))) {
                                    gzhVar.e("Lottie only supports bodymovin >= 4.4.0");
                                }
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 6:
                                f = f6;
                                f2 = fA;
                                i = iB2;
                                hfzVar.g();
                                int i7 = 0;
                                while (hfzVar.n()) {
                                    defpackage.hei heiVarA = defpackage.hfj.a(hfzVar, gzhVar);
                                    if (heiVarA.t == 3) {
                                        i7++;
                                    }
                                    arrayList.add(heiVarA);
                                    adbVar.g(heiVarA.d, heiVarA);
                                    if (i7 > 4) {
                                        defpackage.hge.a("You have " + i7 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                                    }
                                }
                                hfzVar.i();
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 7:
                                f = f6;
                                f2 = fA;
                                hfzVar.g();
                                while (hfzVar.n()) {
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    adb adbVar2 = new adb(10);
                                    hfzVar.h();
                                    int iB3 = 0;
                                    int iB4 = 0;
                                    java.lang.String strF = null;
                                    java.lang.String strF2 = null;
                                    java.lang.String strF3 = null;
                                    while (hfzVar.n()) {
                                        int iQ = hfzVar.q(defpackage.hfk.b);
                                        if (iQ == 0) {
                                            i2 = iB2;
                                            strF = hfzVar.f();
                                        } else if (iQ == 1) {
                                            hfzVar.g();
                                            while (hfzVar.n()) {
                                                defpackage.hei heiVarA2 = defpackage.hfj.a(hfzVar, gzhVar);
                                                adbVar2.g(heiVarA2.d, heiVarA2);
                                                arrayList3.add(heiVarA2);
                                                iB2 = iB2;
                                            }
                                            i2 = iB2;
                                            hfzVar.i();
                                        } else if (iQ == 2) {
                                            iB3 = hfzVar.b();
                                        } else if (iQ == 3) {
                                            iB4 = hfzVar.b();
                                        } else if (iQ == i3) {
                                            strF2 = hfzVar.f();
                                        } else if (iQ != 5) {
                                            hfzVar.l();
                                            hfzVar.m();
                                            i2 = iB2;
                                        } else {
                                            strF3 = hfzVar.f();
                                        }
                                        iB2 = i2;
                                        i3 = 4;
                                    }
                                    int i8 = iB2;
                                    hfzVar.j();
                                    if (strF2 != null) {
                                        defpackage.gzt gztVar = new defpackage.gzt(iB3, iB4, strF, strF2, strF3);
                                        map2.put(gztVar.c, gztVar);
                                    } else {
                                        map.put(strF, arrayList3);
                                    }
                                    iB2 = i8;
                                    i3 = 4;
                                }
                                i = iB2;
                                hfzVar.i();
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 8:
                                f = f6;
                                float f7 = fA;
                                hfzVar.h();
                                while (hfzVar.n()) {
                                    if (hfzVar.q(defpackage.hfk.c) != 0) {
                                        hfzVar.l();
                                        hfzVar.m();
                                    } else {
                                        hfzVar.g();
                                        while (hfzVar.n()) {
                                            defpackage.kvt kvtVar2 = defpackage.hfc.a;
                                            hfzVar.h();
                                            java.lang.String strF4 = null;
                                            java.lang.String strF5 = null;
                                            java.lang.String strF6 = null;
                                            while (hfzVar.n()) {
                                                int iQ2 = hfzVar.q(defpackage.hfc.a);
                                                if (iQ2 != 0) {
                                                    f3 = f7;
                                                    if (iQ2 == 1) {
                                                        strF5 = hfzVar.f();
                                                    } else if (iQ2 == 2) {
                                                        strF6 = hfzVar.f();
                                                    } else if (iQ2 != 3) {
                                                        hfzVar.l();
                                                        hfzVar.m();
                                                    } else {
                                                        hfzVar.a();
                                                    }
                                                } else {
                                                    f3 = f7;
                                                    strF4 = hfzVar.f();
                                                }
                                                f7 = f3;
                                            }
                                            float f8 = f7;
                                            hfzVar.j();
                                            defpackage.kgo kgoVar = new defpackage.kgo(strF4, strF5, strF6);
                                            map3.put(kgoVar.d, kgoVar);
                                            f7 = f8;
                                        }
                                        hfzVar.i();
                                        f7 = f7;
                                    }
                                }
                                f2 = f7;
                                hfzVar.j();
                                i = iB2;
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 9:
                                f = f6;
                                f4 = fA;
                                hfzVar.g();
                                while (hfzVar.n()) {
                                    defpackage.kvt kvtVar3 = defpackage.hfb.a;
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                    hfzVar.h();
                                    double dA = 0.0d;
                                    char cCharAt = 0;
                                    java.lang.String strF7 = null;
                                    java.lang.String strF8 = null;
                                    while (hfzVar.n()) {
                                        int iQ3 = hfzVar.q(defpackage.hfb.a);
                                        if (iQ3 == 0) {
                                            cCharAt = hfzVar.f().charAt(0);
                                        } else if (iQ3 == 1) {
                                            hfzVar.a();
                                        } else if (iQ3 == 2) {
                                            dA = hfzVar.a();
                                        } else if (iQ3 == 3) {
                                            strF7 = hfzVar.f();
                                        } else if (iQ3 == 4) {
                                            strF8 = hfzVar.f();
                                        } else if (iQ3 != 5) {
                                            hfzVar.l();
                                            hfzVar.m();
                                        } else {
                                            hfzVar.h();
                                            while (hfzVar.n()) {
                                                if (hfzVar.q(defpackage.hfb.b) != 0) {
                                                    hfzVar.l();
                                                    hfzVar.m();
                                                } else {
                                                    hfzVar.g();
                                                    while (hfzVar.n()) {
                                                        arrayList4.add((defpackage.hea) defpackage.hex.a(hfzVar, gzhVar));
                                                    }
                                                    hfzVar.i();
                                                }
                                            }
                                            hfzVar.j();
                                        }
                                    }
                                    hfzVar.j();
                                    defpackage.hcv hcvVar = new defpackage.hcv(arrayList4, cCharAt, dA, strF7, strF8);
                                    aedVar.f(hcvVar.hashCode(), hcvVar);
                                }
                                hfzVar.i();
                                f2 = f4;
                                i = iB2;
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            case 10:
                                hfzVar.g();
                                while (hfzVar.n()) {
                                    hfzVar.h();
                                    java.lang.String strF9 = null;
                                    float fA4 = 0.0f;
                                    while (true) {
                                        f5 = f6;
                                        if (hfzVar.n()) {
                                            int iQ4 = hfzVar.q(defpackage.hfk.d);
                                            if (iQ4 != 0) {
                                                if (iQ4 == 1) {
                                                    fA4 = (float) hfzVar.a();
                                                } else if (iQ4 != 2) {
                                                    hfzVar.l();
                                                    hfzVar.m();
                                                } else {
                                                    hfzVar.a();
                                                }
                                                f6 = f5;
                                            } else {
                                                strF9 = hfzVar.f();
                                            }
                                            fA = fA;
                                            f6 = f5;
                                        }
                                    }
                                    hfzVar.j();
                                    arrayList2.add(new aeve(strF9, fA4));
                                    fA = fA;
                                    f6 = f5;
                                }
                                f = f6;
                                f4 = fA;
                                hfzVar.i();
                                f2 = f4;
                                i = iB2;
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                            default:
                                f = f6;
                                f2 = fA;
                                i = iB2;
                                hfzVar.l();
                                hfzVar.m();
                                f6 = f;
                                fA = f2;
                                iB2 = i;
                                break;
                        }
                    }
                    float f9 = f6;
                    android.graphics.Rect rect = new android.graphics.Rect(0, 0, (int) (iB2 * f9), (int) (iB * f9));
                    float f10 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
                    gzhVar.i = rect;
                    gzhVar.j = fA;
                    gzhVar.k = fA2;
                    gzhVar.l = fA3;
                    gzhVar.h = arrayList;
                    gzhVar.g = adbVar;
                    gzhVar.a = map;
                    gzhVar.b = map2;
                    gzhVar.c = f10;
                    gzhVar.f = aedVar;
                    gzhVar.d = map3;
                    gzhVar.e = arrayList2;
                    if (str != null) {
                        defpackage.hcy.a.b(str, gzhVar);
                    }
                    gzyVar = new defpackage.gzy(gzhVar);
                }
                if (z) {
                    java.lang.ThreadLocal threadLocal2 = defpackage.hgm.a;
                    try {
                        hfzVar.close();
                    } catch (java.lang.Exception unused) {
                    }
                }
                return gzyVar;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.ThreadLocal threadLocal3 = defpackage.hgm.a;
                    try {
                        hfzVar.close();
                    } catch (java.lang.Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (java.lang.RuntimeException e2) {
            throw e2;
        }
    }

    private static java.lang.Boolean l(appa appaVar) {
        return m(appaVar, d);
    }

    private static java.lang.Boolean m(appa appaVar, byte[] bArr) {
        try {
            appx appxVar = new appx(new appq(appaVar));
            for (byte b2 : bArr) {
                if (appxVar.d() != b2) {
                    return java.lang.Boolean.FALSE;
                }
            }
            appxVar.close();
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception unused) {
            int i = defpackage.hge.a;
            return java.lang.Boolean.FALSE;
        } catch (java.lang.NoSuchMethodError unused2) {
            return java.lang.Boolean.FALSE;
        }
    }
}
