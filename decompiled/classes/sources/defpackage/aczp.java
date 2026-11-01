package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aczp implements defpackage.aczw {
    public final android.content.Context a;
    public final defpackage.acxa b;
    private final java.util.concurrent.Executor c;
    private final defpackage.acvl d;
    private final defpackage.afhf e;

    public aczp(android.content.Context context, defpackage.acxa acxaVar, defpackage.afhf afhfVar, java.util.concurrent.Executor executor, defpackage.acvl acvlVar) {
        this.a = context;
        this.b = acxaVar;
        this.e = afhfVar;
        this.c = executor;
        this.d = acvlVar;
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq a() {
        return this.e.a(new aczn(6), this.c);
    }

    public final defpackage.ajcq b(aczc aczcVar, int i) {
        defpackage.ajcq ajcqVarB;
        if (i > aczcVar.d) {
            return defpackage.aiql.z(java.lang.Boolean.TRUE);
        }
        aczc aczcVarA = aczc.a(i);
        int iOrdinal = aczcVarA.ordinal();
        if (iOrdinal == 1) {
            defpackage.afhf afhfVar = this.e;
            aczo aczoVar = new aczo(this, 0);
            java.util.concurrent.Executor executor = this.c;
            ajcqVarB = adcs.e(afhfVar.a(aczoVar, executor)).f(new aczn(7), executor).b(java.io.IOException.class, new acym(this, 16), executor);
        } else if (iOrdinal != 2) {
            ajcqVarB = defpackage.aiql.y(new java.lang.UnsupportedOperationException("Upgrade to version " + aczcVarA.name() + "not supported!"));
        } else {
            defpackage.afhf afhfVar2 = this.e;
            acym acymVar = new acym(this, 19);
            java.util.concurrent.Executor executor2 = this.c;
            ajcqVarB = adcs.e(afhfVar2.a(acymVar, executor2)).f(new aczn(5), executor2).b(java.io.IOException.class, new acym(this, 20), executor2);
        }
        return defpackage.ahvr.I(ajcqVarB, new lgl(this, i, aczcVar, 3), this.c);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq c() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayList());
        defpackage.wym wymVar = new defpackage.wym(this, atomicReference, 15, null);
        defpackage.afhf afhfVar = this.e;
        java.util.concurrent.Executor executor = this.c;
        return defpackage.ahvr.H(afhfVar.a(wymVar, executor), new aczo(atomicReference, 1), executor);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq d() {
        android.content.Context context = this.a;
        if (!defpackage.afsq.aD(context)) {
            int i = defpackage.adbe.a;
            defpackage.afsq.aF(context);
            defpackage.afsq.aE(context, aczc.a(this.d.g()));
            return defpackage.aiql.z(java.lang.Boolean.FALSE);
        }
        aczc aczcVarA = aczc.a(this.d.g());
        defpackage.acxa acxaVar = this.b;
        aczc aczcVarAC = defpackage.afsq.aC(context, acxaVar);
        int i2 = aczcVarA.d;
        int i3 = aczcVarAC.d;
        if (i2 == i3) {
            return defpackage.aiql.z(java.lang.Boolean.TRUE);
        }
        if (i2 >= i3) {
            adcs adcsVarE = adcs.e(b(aczcVarA, i3 + 1));
            acze aczeVar = new acze(this, aczcVarA, 4, (byte[]) null);
            java.util.concurrent.Executor executor = this.c;
            return adcsVarE.d(java.lang.Exception.class, aczeVar, executor).g(new acze(this, aczcVarA, 5, (byte[]) null), executor);
        }
        defpackage.adbe.e("%s Cannot migrate back from value %s to %s. Clear everything!", "ProtoDataStoreSharedFilesMetadata", aczcVarAC, aczcVarA);
        new java.lang.Exception("Downgraded file key from " + aczcVarAC.toString() + " to " + aczcVarA.toString() + '.');
        acxaVar.a();
        defpackage.afsq.aE(context, aczcVarA);
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq e(acwe acweVar) {
        return defpackage.ahvr.H(f(new defpackage.aile(acweVar)), new acym(acweVar, 17), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq f(defpackage.aihd aihdVar) {
        return defpackage.ahvr.H(this.e.c(), new defpackage.wym(this, aihdVar, 13, null), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq g(acwe acweVar) {
        defpackage.ahyc acymVar = new acym(defpackage.afsq.ac(acweVar, this.a, this.b), 18);
        java.util.concurrent.Executor executor = this.c;
        return adcs.e(this.e.a(acymVar, executor)).f(new aczn(3), executor).b(java.io.IOException.class, new aczn(4), executor);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq h(acwe acweVar, acwg acwgVar) {
        defpackage.wym wymVar = new defpackage.wym(defpackage.afsq.ac(acweVar, this.a, this.b), acwgVar, 14);
        java.util.concurrent.Executor executor = this.c;
        return adcs.e(this.e.a(wymVar, executor)).f(new aczn(0), executor).b(java.io.IOException.class, new aczn(2), executor);
    }

    public final void i(aczc aczcVar) {
        android.content.Context context = this.a;
        defpackage.acxa acxaVar = this.b;
        if (defpackage.afsq.aC(context, acxaVar).d == aczcVar.d || defpackage.afsq.aE(context, aczcVar)) {
            return;
        }
        defpackage.adbe.b(defpackage.a.bG((byte) 46, aczcVar, "Failed to commit migration version to disk. Fail to set target version to "));
        new java.lang.Exception(defpackage.a.bG((byte) 46, aczcVar, "Fail to set target version "));
        acxaVar.a();
    }
}
