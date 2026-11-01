package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tla implements oql {
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/hats/SharpieHatsRule");
    public final defpackage.rju b;
    private final aoss c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final int g;
    private final apni h;

    public tla(aoss aossVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, int i, aazc aazcVar, defpackage.rju rjuVar, apni apniVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "sharpieHatsTriggerIdForPreprod");
        aooh.f(aoinVar2, "sharpieHatsTriggerIdForProd");
        aooh.f(aoinVar3, "sharpieHatsEndCallThresholdMillis");
        aooh.f(aazcVar, "clock");
        aooh.f(apniVar, "androidJobs");
        this.c = aossVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = aoinVar3;
        this.g = 5;
        this.b = rjuVar;
        this.h = apniVar;
    }

    public final oqt a() {
        return oqt.l;
    }

    public final aify b() {
        return aify.p(oqu.f);
    }

    public final aify c() {
        this.h.i(aoov.am(this.c, 0, new defpackage.tkx(this, (aoln) null, 0), 3));
        return aify.p(oqt.q);
    }

    public final java.lang.String d() {
        return "main.hats_container";
    }

    public final java.lang.String e() {
        java.lang.Object objA = this.e.a();
        aooh.e(objA, "get(...)");
        return (java.lang.String) objA;
    }

    public final ajcq f(oqi oqiVar) {
        return aosv.F(this.c, 0, new defpackage.tkz(oqiVar, this, (aoln) null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.tky tkyVar;
        if (aolnVar instanceof defpackage.tky) {
            tkyVar = (defpackage.tky) aolnVar;
            int i = tkyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkyVar.c = i - Integer.MIN_VALUE;
            } else {
                tkyVar = new defpackage.tky(this, aolnVar);
            }
        } else {
            tkyVar = new defpackage.tky(this, aolnVar);
        }
        java.lang.Object objD = tkyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tkyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.rju rjuVar = this.b;
            tkyVar.c = 1;
            objD = rjuVar.d(tkyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        alcf alcfVar = (alcf) objD;
        if (aooh.n(alcfVar, alcf.a)) {
            return java.lang.Boolean.FALSE;
        }
        j$.time.Instant instantOfEpochSecond = j$.time.Instant.ofEpochSecond(alcfVar.b, alcfVar.c);
        aoin aoinVar = this.f;
        j$.time.Instant instantNow = j$.time.Instant.now();
        java.lang.Object objA = aoinVar.a();
        aooh.e(objA, "get(...)");
        return instantOfEpochSecond.isBefore(instantNow.minusMillis(((java.lang.Number) objA).longValue())) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }
}
