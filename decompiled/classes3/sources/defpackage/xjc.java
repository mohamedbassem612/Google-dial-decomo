package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xjc implements defpackage.xiy {
    private final defpackage.xiy a;
    private java.lang.Long b;

    public xjc(defpackage.xiy xiyVar) {
        this.a = xiyVar;
    }

    @Override // defpackage.xiy
    public final void a(defpackage.xiw xiwVar) {
        long jD = xiwVar.d();
        java.lang.Long l = this.b;
        if (l == null || jD != l.longValue()) {
            this.b = java.lang.Long.valueOf(xiwVar.d());
            this.a.a(xiwVar);
        }
    }
}
