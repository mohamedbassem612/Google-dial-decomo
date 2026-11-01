package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaub implements defpackage.aaun, defpackage.aaui, defpackage.aauh, defpackage.aaue {
    public final defpackage.aaua a;
    public final defpackage.aauq b;
    private final java.util.concurrent.Executor c;

    public aaub(java.util.concurrent.Executor executor, defpackage.aaua aauaVar, defpackage.aauq aauqVar) {
        this.c = executor;
        this.a = aauaVar;
        this.b = aauqVar;
    }

    @Override // defpackage.aauh
    public final void a(java.lang.Exception exc) {
        this.b.r(exc);
    }

    @Override // defpackage.aaue
    public final void b() {
        this.b.u();
    }

    @Override // defpackage.aaun
    public final void c(defpackage.aaum aaumVar) {
        this.c.execute(new defpackage.an(this, aaumVar, 16));
    }

    @Override // defpackage.aaui
    public final void d(java.lang.Object obj) {
        this.b.s(obj);
    }
}
