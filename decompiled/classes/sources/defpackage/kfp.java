package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kfp implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupStartupAfterPackageReplacedListener");
    public final defpackage.zjx b;
    private final defpackage.aoss c;
    private final defpackage.afhf d;

    public kfp(defpackage.zjx zjxVar, defpackage.aoss aossVar, defpackage.afhf afhfVar) {
        defpackage.aooh.f(zjxVar, "dialerTikTokWorkManager");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(afhfVar, "protoDataStore");
        this.b = zjxVar;
        this.c = aossVar;
        this.d = afhfVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.c, 0, new defpackage.mev(this, (defpackage.aoln) null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.kfo kfoVar;
        if (aolnVar instanceof defpackage.kfo) {
            kfoVar = (defpackage.kfo) aolnVar;
            int i = kfoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfoVar.c = i - Integer.MIN_VALUE;
            } else {
                kfoVar = new defpackage.kfo(this, aolnVar);
            }
        } else {
            kfoVar = new defpackage.kfo(this, aolnVar);
        }
        java.lang.Object objD = kfoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kfoVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarC = this.d.c();
            defpackage.aooh.e(ajcqVarC, "getData(...)");
            kfoVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarC, kfoVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(((defpackage.kfq) objD).b);
    }
}
