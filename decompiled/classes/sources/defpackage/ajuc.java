package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajuc implements defpackage.ajwe {
    private static final java.lang.Object a = new java.lang.Object();
    private volatile java.lang.Object b = a;
    private volatile defpackage.ajwe c;

    public ajuc(defpackage.ajwe ajweVar) {
        this.c = ajweVar;
    }

    @Override // defpackage.ajwe
    public final java.lang.Object a() {
        java.lang.Object objA = this.b;
        java.lang.Object obj = a;
        if (objA == obj) {
            synchronized (this) {
                objA = this.b;
                if (objA == obj) {
                    objA = this.c.a();
                    this.b = objA;
                    this.c = null;
                }
            }
        }
        return objA;
    }
}
