package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aauj implements aaun, aaui, aauh, aaue {
    public final defpackage.aaul a;
    private final java.util.concurrent.Executor b;
    private final aauq c;

    public aauj(java.util.concurrent.Executor executor, defpackage.aaul aaulVar, aauq aauqVar) {
        this.b = executor;
        this.a = aaulVar;
        this.c = aauqVar;
    }

    public final void a(java.lang.Exception exc) {
        this.c.r(exc);
    }

    public final void b() {
        this.c.u();
    }

    public final void c(aaum aaumVar) {
        this.b.execute(new defpackage.wdm(this, aaumVar, 20));
    }

    public final void d(java.lang.Object obj) {
        this.c.s(obj);
    }
}
