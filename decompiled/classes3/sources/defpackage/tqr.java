package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqr {
    public final aoss a;
    public final aoin b;
    public aosy c;
    public java.lang.Boolean d;
    public long e;
    public final ahda f;
    private final zpz g;
    private final defpackage.tqf h;

    public tqr(aoss aossVar, zpz zpzVar, aazc aazcVar, aoin aoinVar, defpackage.tnq tnqVar, defpackage.rai raiVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aazcVar, "clock");
        aooh.f(raiVar, "preconditionsCheckerFactory");
        this.a = aossVar;
        this.g = zpzVar;
        this.b = aoinVar;
        this.h = raiVar.r(tnqVar);
        this.f = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tqq tqqVar;
        if (aolnVar instanceof defpackage.tqq) {
            tqqVar = (defpackage.tqq) aolnVar;
            int i = tqqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqqVar.c = i - Integer.MIN_VALUE;
            } else {
                tqqVar = new defpackage.tqq(this, aolnVar);
            }
        } else {
            tqqVar = new defpackage.tqq(this, aolnVar);
        }
        java.lang.Object objA = tqqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tqqVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.tqf tqfVar = this.h;
            tqqVar.c = 1;
            objA = tqfVar.a(tqqVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        this.e = aazc.b();
        return java.lang.Boolean.valueOf(aooh.n(objA, defpackage.tqg.a));
    }

    public final void b() {
        aosy aosyVarAm = aoov.am(this.a, 0, new defpackage.tpd(this, (aoln) null, 4), 3);
        this.g.a(aosv.C(aosyVarAm));
        this.c = aosyVarAm;
    }
}
