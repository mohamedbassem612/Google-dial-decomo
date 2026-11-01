package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzc implements defpackage.xvb {
    private final /* synthetic */ int $cid;
    private java.lang.Object a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public xzc(android.net.Uri uri, defpackage.zlr zlrVar, int i) {
        this.$cid = i;
        this.c = uri;
        this.b = zlrVar;
    }

    public static defpackage.xzc c(android.content.Context context, android.net.Uri uri, defpackage.xvu xvuVar) {
        return new defpackage.xzc(uri, new defpackage.zlr(defpackage.xrr.b(context).c.a().b(), xvuVar, defpackage.xrr.b(context).e, context.getContentResolver()), 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzd] */
    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return this.$cid != 0 ? java.io.InputStream.class : this.c.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xzd] */
    @Override // defpackage.xvb
    public final void e() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        try {
            if (i != 0) {
                if (obj == null) {
                } else {
                    ((java.io.InputStream) obj).close();
                }
            } else if (obj == null) {
            } else {
                this.c.c(obj);
            }
        } catch (java.io.IOException unused) {
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        int i = this.$cid;
        return defpackage.xuc.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e A[Catch: FileNotFoundException -> 0x00fc, TryCatch #9 {FileNotFoundException -> 0x00fc, blocks: (B:4:0x0009, B:11:0x0027, B:25:0x0048, B:27:0x004e, B:29:0x0059, B:31:0x0063, B:32:0x0067, B:40:0x009f, B:60:0x00e8, B:61:0x00ee, B:57:0x00e4, B:35:0x0073, B:36:0x009a, B:23:0x0044, B:65:0x00f8, B:66:0x00fb, B:41:0x00a3, B:48:0x00c9, B:50:0x00cf), top: B:96:0x0009, inners: #3, #11 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f A[Catch: FileNotFoundException -> 0x00fc, TRY_LEAVE, TryCatch #9 {FileNotFoundException -> 0x00fc, blocks: (B:4:0x0009, B:11:0x0027, B:25:0x0048, B:27:0x004e, B:29:0x0059, B:31:0x0063, B:32:0x0067, B:40:0x009f, B:60:0x00e8, B:61:0x00ee, B:57:0x00e4, B:35:0x0073, B:36:0x009a, B:23:0x0044, B:65:0x00f8, B:66:0x00fb, B:41:0x00a3, B:48:0x00c9, B:50:0x00cf), top: B:96:0x0009, inners: #3, #11 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[Catch: FileNotFoundException -> 0x00fc, TryCatch #9 {FileNotFoundException -> 0x00fc, blocks: (B:4:0x0009, B:11:0x0027, B:25:0x0048, B:27:0x004e, B:29:0x0059, B:31:0x0063, B:32:0x0067, B:40:0x009f, B:60:0x00e8, B:61:0x00ee, B:57:0x00e4, B:35:0x0073, B:36:0x009a, B:23:0x0044, B:65:0x00f8, B:66:0x00fb, B:41:0x00a3, B:48:0x00c9, B:50:0x00cf), top: B:96:0x0009, inners: #3, #11 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8 A[Catch: FileNotFoundException -> 0x00fc, TryCatch #9 {FileNotFoundException -> 0x00fc, blocks: (B:4:0x0009, B:11:0x0027, B:25:0x0048, B:27:0x004e, B:29:0x0059, B:31:0x0063, B:32:0x0067, B:40:0x009f, B:60:0x00e8, B:61:0x00ee, B:57:0x00e4, B:35:0x0073, B:36:0x009a, B:23:0x0044, B:65:0x00f8, B:66:0x00fb, B:41:0x00a3, B:48:0x00c9, B:50:0x00cf), top: B:96:0x0009, inners: #3, #11 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00f5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:246), block:B:63:0x00f5 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, xzd] */
    /* JADX WARN: Type inference failed for: r12v0, types: [xva] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, xvu] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) throws java.lang.Throwable {
        java.lang.SecurityException e;
        android.database.Cursor cursorA;
        ?? r5;
        java.lang.String string;
        java.io.InputStream xvhVar;
        int iE;
        java.lang.Object obj;
        java.io.File file;
        if (this.$cid == 0) {
            try {
                java.lang.Object objB = this.c.b((java.io.File) this.b);
                this.a = objB;
                xvaVar.c(objB);
                return;
            } catch (java.io.FileNotFoundException e2) {
                if (android.util.Log.isLoggable("FileLoader", 3)) {
                    android.util.Log.d("FileLoader", "Failed to open file", e2);
                }
                xvaVar.f(e2);
                return;
            }
        }
        try {
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.c;
            ?? r4 = 0;
            java.io.InputStream inputStreamOpenInputStream = null;
            try {
                try {
                    cursorA = ((defpackage.zlr) obj2).c.a((android.net.Uri) obj3);
                    if (cursorA != null) {
                        try {
                            if (cursorA.moveToFirst()) {
                                string = cursorA.getString(0);
                                cursorA.close();
                            } else {
                                cursorA.close();
                                string = null;
                            }
                        } catch (java.lang.SecurityException e3) {
                            e = e3;
                            if (android.util.Log.isLoggable("ThumbStreamOpener", 3)) {
                                android.util.Log.d("ThumbStreamOpener", a.bH(obj3, "Failed to query for thumbnail for Uri: "), e);
                            }
                            if (cursorA != null) {
                            }
                            string = null;
                            if (android.text.TextUtils.isEmpty(string)) {
                                xvhVar = null;
                            } else {
                                file = new java.io.File(string);
                                if (file.exists()) {
                                    xvhVar = null;
                                } else {
                                    xvhVar = null;
                                }
                            }
                            if (xvhVar != null) {
                                java.lang.Object obj4 = this.b;
                                obj = this.c;
                                try {
                                    try {
                                        inputStreamOpenInputStream = ((android.content.ContentResolver) ((defpackage.zlr) obj4).b).openInputStream((android.net.Uri) obj);
                                        iE = defpackage.xff.E(((defpackage.zlr) obj4).a, inputStreamOpenInputStream, (defpackage.xxt) ((defpackage.zlr) obj4).d);
                                        if (inputStreamOpenInputStream != null) {
                                            try {
                                                inputStreamOpenInputStream.close();
                                            } catch (java.io.IOException unused) {
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        if (0 != 0) {
                                            try {
                                                r4.close();
                                            } catch (java.io.IOException unused2) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (java.io.IOException | java.lang.NullPointerException e4) {
                                    if (android.util.Log.isLoggable("ThumbStreamOpener", 3)) {
                                        android.util.Log.d("ThumbStreamOpener", a.bH(obj, "Failed to open uri: "), e4);
                                    }
                                    if (inputStreamOpenInputStream != null) {
                                        try {
                                            inputStreamOpenInputStream.close();
                                        } catch (java.io.IOException unused3) {
                                        }
                                    }
                                    iE = -1;
                                }
                            } else {
                                iE = -1;
                            }
                            if (iE != -1) {
                                xvhVar = new defpackage.xvh(xvhVar, iE);
                            }
                            this.a = xvhVar;
                            xvaVar.c(xvhVar);
                        }
                    } else {
                        string = null;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r4 = r5;
                    if (r4 != 0) {
                        r4.close();
                    }
                    throw th;
                }
            } catch (java.lang.SecurityException e5) {
                e = e5;
                cursorA = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
            if (android.text.TextUtils.isEmpty(string)) {
                file = new java.io.File(string);
                if (file.exists() || file.length() <= 0) {
                    xvhVar = null;
                } else {
                    android.net.Uri uriFromFile = android.net.Uri.fromFile(file);
                    try {
                        xvhVar = ((android.content.ContentResolver) ((defpackage.zlr) obj2).b).openInputStream(uriFromFile);
                    } catch (java.lang.NullPointerException e6) {
                        throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("NPE opening uri: " + java.lang.String.valueOf(obj3) + " -> " + java.lang.String.valueOf(uriFromFile)).initCause(e6));
                    }
                }
            } else {
                xvhVar = null;
            }
            if (xvhVar != null) {
                java.lang.Object obj5 = this.b;
                obj = this.c;
                inputStreamOpenInputStream = ((android.content.ContentResolver) ((defpackage.zlr) obj5).b).openInputStream((android.net.Uri) obj);
                iE = defpackage.xff.E(((defpackage.zlr) obj5).a, inputStreamOpenInputStream, (defpackage.xxt) ((defpackage.zlr) obj5).d);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
            } else {
                iE = -1;
            }
            if (iE != -1) {
                xvhVar = new defpackage.xvh(xvhVar, iE);
            }
            this.a = xvhVar;
            xvaVar.c(xvhVar);
        } catch (java.io.FileNotFoundException e7) {
            if (android.util.Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                android.util.Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e7);
            }
            xvaVar.f(e7);
        }
    }

    public xzc(java.io.File file, defpackage.xzd xzdVar, int i) {
        this.$cid = i;
        this.b = file;
        this.c = xzdVar;
    }

    @Override // defpackage.xvb
    public final void d() {
    }
}
