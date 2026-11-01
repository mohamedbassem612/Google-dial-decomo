package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzv implements java.io.Closeable, agxy {
    public final agxk a;
    final /* synthetic */ defpackage.agzw b;
    private final java.util.concurrent.Executor c;
    private final defpackage.agyz d;
    private final java.util.concurrent.atomic.AtomicBoolean e;
    private boolean f;

    public agzv(defpackage.agzw agzwVar, defpackage.agyz agyzVar, java.util.concurrent.Executor executor) {
        j$.util.Objects.requireNonNull(agzwVar);
        this.b = agzwVar;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = false;
        this.d = agyzVar;
        this.c = executor;
        this.a = agyzVar.a();
    }

    public final void a(agxx agxxVar) {
        if (agxxVar.c.ordinal() == 0) {
            boolean andSet = this.e.getAndSet(true);
            if (afec.g()) {
                b();
            } else {
                if (andSet) {
                    return;
                }
                this.c.execute(ahqx.h(new defpackage.agdr(this, 16)));
            }
        }
    }

    public final void b() {
        afec.c();
        if (this.f) {
            return;
        }
        defpackage.agzw agzwVar = this.b;
        if (agzwVar.e == null || !agzwVar.c) {
            return;
        }
        if (this.e.getAndSet(false)) {
            defpackage.agwm agwmVar = agzwVar.e;
            defpackage.agyz agyzVar = this.d;
            afec.c();
            defpackage.agzd agzdVar = (defpackage.agzd) agwmVar;
            defpackage.agzh agzhVar = agzdVar.b;
            if (agzhVar.b == null) {
                throw new defpackage.agzg();
            }
            emx emxVar = agzhVar.a;
            if (!emxVar.P().a().equals(emq.d) && !emxVar.P().a().equals(emq.e)) {
                throw new defpackage.agzf();
            }
            defpackage.agzq agzqVar = agzhVar.b;
            defpackage.agza agzaVar = agzdVar.a;
            afec.c();
            defpackage.amdx amdxVar = (defpackage.amdx) agzqVar.b.get(agzaVar);
            ahvr.bZ(amdxVar != null, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
            afec.c();
            ahvr.cj(amdxVar.a, "LocalSubscriptionStateReference used after free.");
            defpackage.agzr agzrVar = (defpackage.agzr) amdxVar.a;
            amdxVar.a = new defpackage.agzr(ahyn.h(agyzVar), agzrVar.b, agzrVar.c, agzrVar.d);
            afec.c();
            agzqVar.d.execute(ahqx.h(new defpackage.agrz(agzqVar, amdxVar, 5)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        afec.c();
        this.f = true;
    }
}
