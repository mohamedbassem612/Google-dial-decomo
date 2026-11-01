package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aenc implements defpackage.aemh {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;
    private final java.lang.Object c;

    public aenc(java.util.concurrent.ExecutorService executorService, defpackage.ahzi ahziVar, int i) {
        this.$cid = i;
        this.b = new java.util.concurrent.atomic.AtomicReference();
        this.c = defpackage.aiql.r(executorService);
        this.a = defpackage.ahvr.bI(ahziVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final defpackage.ajcq h(defpackage.ahyc ahycVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) this.b;
        if (atomicReference.get() != null) {
            return (defpackage.ajcq) ahycVar.apply((defpackage.aemh) atomicReference.get());
        }
        java.lang.Object obj = this.a;
        j$.util.Objects.requireNonNull(obj);
        return defpackage.ahrv.g(defpackage.ahvr.F(new defpackage.vcz(obj, 11), this.c)).i(new defpackage.adpx(this, ahycVar, 3), defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ajct, java.lang.Object] */
    private final void i(java.lang.Runnable runnable) {
        if (((java.util.concurrent.atomic.AtomicReference) this.b).get() != null) {
            runnable.run();
        } else {
            this.c.execute(defpackage.ahqx.h(new aekf(this, runnable, 3)));
        }
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq a() {
        return this.$cid != 0 ? h(new adfe(13)) : ((defpackage.ahpz) this.b).j(true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aemh, java.lang.Object] */
    @Override // defpackage.aemh
    public final defpackage.ajcq b(java.lang.String str) {
        if (this.$cid != 0) {
            return h(new adek(str, 9));
        }
        defpackage.ahpz ahpzVar = (defpackage.ahpz) this.b;
        defpackage.ajcq ajcqVarB = ahpzVar.d.b(str);
        defpackage.ahvr.J(ajcqVarB, new aenf(ahpzVar), defpackage.ajbm.INSTANCE);
        return ajcqVarB;
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq c() {
        return this.$cid != 0 ? h(new defpackage.adcu(11)) : ((defpackage.ahpz) this.b).j(false);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aemh, java.lang.Object] */
    @Override // defpackage.aemh
    public final void d(aemg aemgVar) {
        if (this.$cid != 0) {
            i(new aekf(this, aemgVar, 4, (byte[]) null));
        } else {
            this.a.d(aemgVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aemh, java.lang.Object] */
    @Override // defpackage.aemh
    public final void e(aemg aemgVar) {
        if (this.$cid != 0) {
            i(new aekf(this, aemgVar, 2, (byte[]) null));
        } else {
            this.a.e(aemgVar);
        }
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq f(java.lang.String str, int i) {
        return this.$cid != 0 ? h(new uqy(str, i, 4)) : ((defpackage.ahpz) this.c).k(true, str, i);
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq g(java.lang.String str, int i) {
        return this.$cid != 0 ? h(new uqy(str, i, 5)) : ((defpackage.ahpz) this.c).k(false, str, i);
    }

    public aenc(defpackage.aemh aemhVar, int i, defpackage.adai adaiVar, java.lang.String str, int i2) {
        this.$cid = i2;
        this.a = aemhVar;
        this.b = new defpackage.ahpz(aemhVar, i, adaiVar, str);
        this.c = new defpackage.ahpz(aemhVar, i, adaiVar, str);
    }
}
