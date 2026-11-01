package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adfr {
    private final java.lang.String a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.ajcq c;
    private final java.util.concurrent.Executor d;
    private volatile defpackage.ajcq e;
    private volatile defpackage.ajcq f;

    public adfr(java.lang.String str, java.util.concurrent.Executor executor) {
        this.a = str;
        this.d = executor;
        defpackage.ajdd ajddVar = new defpackage.ajdd(new java.lang.IllegalStateException(java.lang.String.valueOf(str).concat(" is not initialized")));
        this.c = ajddVar;
        this.f = ajddVar;
    }

    public final synchronized defpackage.ajcq a(defpackage.ahzi ahziVar) {
        if (this.f.isDone() && !defpackage.abrz.A(this.f)) {
            defpackage.ajcq ajcqVar = (defpackage.ajcq) ahziVar.eZ();
            this.e = ajcqVar;
            defpackage.ajcq ajcqVar2 = this.e;
            defpackage.jtv jtvVar = new defpackage.jtv(this, ajcqVar, 13);
            java.util.concurrent.Executor executor = this.d;
            int i = defpackage.ajan.c;
            defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar2, jtvVar);
            ajcqVar2.c(ajamVar, defpackage.aiql.t(executor, ajamVar));
            this.f = ajamVar;
        }
        return this.f;
    }

    public final void b() {
        defpackage.ahvr.cc(d(), "%s is not initialized", this.a);
    }

    public final synchronized void c(defpackage.ajcq ajcqVar) {
        if (ajcqVar == this.e) {
            this.b.set(true);
        }
    }

    public final boolean d() {
        return this.b.get();
    }
}
