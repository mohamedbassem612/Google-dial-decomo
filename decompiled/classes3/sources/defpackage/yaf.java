package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yaf implements defpackage.xvb {
    private static final java.lang.String[] a = {"_data"};
    private final android.content.Context b;
    private final defpackage.xzp c;
    private final defpackage.xzp d;
    private final android.net.Uri e;
    private final int f;
    private final int g;
    private final defpackage.xus h;
    private final java.lang.Class i;
    private volatile boolean j;
    private volatile defpackage.xvb k;

    public yaf(android.content.Context context, defpackage.xzp xzpVar, defpackage.xzp xzpVar2, android.net.Uri uri, int i, int i2, defpackage.xus xusVar, java.lang.Class cls) {
        this.b = context.getApplicationContext();
        this.c = xzpVar;
        this.d = xzpVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = xusVar;
        this.i = cls;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return this.i;
    }

    @Override // defpackage.xvb
    public final void d() {
        this.j = true;
        defpackage.xvb xvbVar = this.k;
        if (xvbVar != null) {
            xvbVar.d();
        }
    }

    @Override // defpackage.xvb
    public final void e() {
        defpackage.xvb xvbVar = this.k;
        if (xvbVar != null) {
            xvbVar.e();
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [xvb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) throws java.lang.Throwable {
        ucm ucmVarB;
        java.lang.Throwable th;
        try {
            android.database.Cursor cursor = null;
            if (android.os.Environment.isExternalStorageLegacy()) {
                defpackage.xzp xzpVar = this.c;
                android.net.Uri uri = this.e;
                try {
                    android.database.Cursor cursorQuery = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (android.text.TextUtils.isEmpty(string)) {
                                    throw new java.io.FileNotFoundException(a.bH(uri, "File path was empty in media store for: "));
                                }
                                java.io.File file = new java.io.File(string);
                                cursorQuery.close();
                                ucmVarB = xzpVar.b(file, this.f, this.g, this.h);
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new java.io.FileNotFoundException(a.bH(uri, "Failed to media store entry for: "));
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } else {
                ucmVarB = this.d.b(this.e, this.f, this.g, this.h);
            }
            ?? r2 = ucmVarB != null ? ucmVarB.c : 0;
            if (r2 == 0) {
                xvaVar.f(new java.lang.IllegalArgumentException("Failed to build fetcher for: " + java.lang.String.valueOf(this.e)));
                return;
            }
            this.k = r2;
            if (this.j) {
                d();
            } else {
                r2.g(xsmVar, xvaVar);
            }
        } catch (java.io.FileNotFoundException e) {
            xvaVar.f(e);
        }
    }
}
