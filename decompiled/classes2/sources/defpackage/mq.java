package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mq implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public mq(alg algVar, int i) {
        this.$cid = i;
        this.a = algVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v51, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v53, types: [dpf, java.lang.Object] */
    public final java.lang.Object a() {
        java.lang.Object obj;
        cpm cpmVar;
        java.lang.Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                return new nf(new defpackage.jd(this.a, 11, objArr == true ? 1 : 0));
            case 1:
                fyd fydVar = new fyd();
                ((defpackage.mr) this.a).fd().a(fydVar);
                return fydVar;
            case 2:
                return ((alg) this.a).h();
            case 3:
                defpackage.agx agxVar = (defpackage.agx) this.a;
                if (!agxVar.e) {
                    ahj ahjVar = agxVar.b;
                    if (ahjVar.i() && agxVar.d.k()) {
                        java.util.List listB = agxVar.b();
                        int size = listB.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                obj = listB.get(i);
                                if (!((defpackage.agy) obj).q()) {
                                    i++;
                                }
                            } else {
                                obj = null;
                            }
                        }
                        defpackage.agy agyVar = (defpackage.agy) obj;
                        if (agyVar != null) {
                            aku akuVar = agyVar.d().d;
                            if (akuVar instanceof aku) {
                                aku akuVar2 = akuVar;
                                aoov.an(ahjVar.a, (aolr) null, 0, new defpackage.amg(agxVar, new aku(akuVar2.a, akuVar2.b, new cpm(amd.a())), (aoln) null, 1), 3);
                            }
                            agxVar.e = true;
                        }
                    }
                }
                return (cpm) agxVar.d.d();
            case 4:
                return java.lang.Float.valueOf(defpackage.wx.a(this.a.c()));
            case 5:
                defpackage.akr akrVar = (defpackage.akr) this.a;
                alg algVar = akrVar.c;
                akrVar.d = algVar != null ? algVar.d() : 0L;
                return aojh.a;
            case 6:
            case 7:
                ((air) this.a).d = false;
                return aojh.a;
            case 8:
                ?? r9 = this.a;
                any anyVar = (ans) cfo.G((dan) r9, anu.a);
                if (!(anyVar instanceof any)) {
                    java.util.Objects.toString(anyVar);
                    defpackage.avo.c("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: ".concat(java.lang.String.valueOf(anyVar)));
                }
                amk amkVar = (amk) r9;
                any anyVar2 = amkVar.c;
                amkVar.c = anyVar;
                if (anyVar2 != null && !aooh.n(amkVar.c, anyVar2)) {
                    amkVar.s();
                }
                return aojh.a;
            case 9:
                aomy aomyVar = ((defpackage.anb) this.a).k;
                if (aomyVar != null) {
                    aomyVar.a();
                }
                return java.lang.Boolean.TRUE;
            case 10:
                ((defpackage.aoa) this.a).d();
                return aojh.a;
            case 11:
                cpmVar = new cpm(((defpackage.aoa) this.a).l);
                return cpmVar;
            case 12:
                cxi cxiVar = (cxi) ((defpackage.aoa) this.a).k.a();
                cpmVar = new cpm(cxiVar != null ? cxiVar.k(0L) : 9205357640488583168L);
                return cpmVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return java.lang.Float.valueOf(((defpackage.aom) this.a).a.c());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Float.valueOf(((defpackage.aom) this.a).a.b());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.aon aonVar = (defpackage.aon) this.a;
                return java.lang.Boolean.valueOf(aonVar.c() < aonVar.b());
            case 16:
                return java.lang.Boolean.valueOf(((defpackage.aon) this.a).c() > 0);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ?? r10 = this.a;
                amo amoVar = (amo) cfo.G((dan) r10, aoj.a);
                aop aopVar = (aop) r10;
                aopVar.a = amoVar;
                amo amoVar2 = aopVar.a;
                aopVar.b = amoVar2 != null ? amoVar2.a() : null;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return java.lang.Float.valueOf(this.a.dl(125.0f));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.apy apyVar = (defpackage.apy) this.a;
                java.lang.Object objI = apyVar.i();
                if (objI != null) {
                    return objI;
                }
                float fC = apyVar.c();
                if (java.lang.Float.isNaN(fC)) {
                    return apyVar.h();
                }
                float fC2 = apyVar.p().c(apyVar.h());
                if (java.lang.Float.isNaN(fC2) || fC == fC2) {
                    return apyVar.h();
                }
                java.lang.Object objE = apyVar.p().e(fC);
                return objE == null ? apyVar.h() : objE;
            default:
                defpackage.apy apyVar2 = (defpackage.apy) this.a;
                float fC3 = apyVar2.p().c(apyVar2.j());
                float fC4 = apyVar2.p().c(apyVar2.k()) - fC3;
                float fAbs = java.lang.Math.abs(fC4);
                float f = 1.0f;
                if (!java.lang.Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fE = (apyVar2.e() - fC3) / fC4;
                    if (fE < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fE <= 0.999999f) {
                        f = fE;
                    }
                }
                return java.lang.Float.valueOf(f);
        }
    }

    public /* synthetic */ mq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
