package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aauf implements defpackage.aaun {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;
    private final java.util.concurrent.Executor c;

    public aauf(java.util.concurrent.Executor executor, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = new java.lang.Object();
        this.c = executor;
        this.b = obj;
    }

    @Override // defpackage.aaun
    public final void c(defpackage.aaum aaumVar) {
        int i = this.$cid;
        if (i == 0) {
            synchronized (this.a) {
            }
            this.c.execute(new defpackage.an(this, aaumVar, 17));
            return;
        }
        if (i == 1) {
            this.c.execute(new defpackage.an(this, aaumVar, 15, (byte[]) null));
            return;
        }
        if (i != 2) {
            if (aaumVar.k()) {
                synchronized (this.a) {
                }
                this.c.execute(new defpackage.an(this, aaumVar, 18, (char[]) null));
                return;
            }
            return;
        }
        if (aaumVar.k() || ((defpackage.aauq) aaumVar).c) {
            return;
        }
        synchronized (this.a) {
        }
        this.c.execute(new wdm(this, aaumVar, 19));
    }

    public aauf(java.util.concurrent.Executor executor, defpackage.aaua aauaVar, defpackage.aauq aauqVar, int i) {
        this.$cid = i;
        this.c = executor;
        this.b = aauaVar;
        this.a = aauqVar;
    }
}
