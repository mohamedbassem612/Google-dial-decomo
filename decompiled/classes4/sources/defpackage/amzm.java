package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class amzm extends defpackage.amzl implements java.util.concurrent.Executor, ajat {
    private final amyz b;
    private final amzw c;
    private final amyz d;
    private volatile defpackage.amzv e = null;

    protected amzm(amyz amyzVar, amzw amzwVar, amyz amyzVar2) {
        aooc.ao(amyzVar);
        this.b = amyzVar;
        this.c = amzwVar;
        aooc.ao(amyzVar2);
        this.d = amyzVar2;
    }

    @java.lang.Deprecated
    public final ajcq a(java.lang.Object obj) {
        this.e.c();
        try {
            return b(obj);
        } finally {
            this.e.b();
        }
    }

    protected abstract ajcq b(java.lang.Object obj);

    protected abstract ajcq c();

    @Override // defpackage.amzl
    protected final ajcq dS() {
        this.e = ((defpackage.anaa) this.b.a()).a(this.c);
        this.e.d();
        try {
            ajcq ajcqVarC = c();
            this.e.g();
            ajcq ajcqVarG = ajan.g(ajcqVarC, this, this);
            this.e.f(ajcqVarG);
            return ajcqVarG;
        } catch (java.lang.Throwable th) {
            this.e.g();
            throw th;
        }
    }

    @Override // java.util.concurrent.Executor
    @java.lang.Deprecated
    public final void execute(java.lang.Runnable runnable) {
        this.e.h();
        ((java.util.concurrent.Executor) this.d.a()).execute(runnable);
    }
}
