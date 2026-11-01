package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xzl implements defpackage.xvb {
    private static final java.lang.String[] a = {"_data"};
    private final android.content.Context b;
    private final android.net.Uri c;

    public xzl(android.content.Context context, android.net.Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return java.io.File.class;
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        android.database.Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        java.lang.String string = null;
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (java.lang.Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (android.text.TextUtils.isEmpty(string)) {
            xvaVar.f(new java.io.FileNotFoundException("Failed to find file path for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.c)))));
        } else {
            xvaVar.c(new java.io.File(string));
        }
    }

    @Override // defpackage.xvb
    public final void d() {
    }

    @Override // defpackage.xvb
    public final void e() {
    }
}
