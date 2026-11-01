package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bjp implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bjp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x037c  */
    /* JADX WARN: Type inference failed for: r0v32, types: [aonj, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.dkw dkwVar;
        defpackage.dpf dpfVar;
        boolean z = true;
        defpackage.dkw dkwVar2 = null;
        switch (this.$cid) {
            case 0:
                java.util.List list = (java.util.List) obj;
                defpackage.bjr bjrVar = (defpackage.bjr) this.a;
                defpackage.bjc bjcVarD = bjrVar.d();
                defpackage.dkz dkzVar = bjrVar.b;
                float[] fArr = defpackage.crp.a;
                defpackage.dkz dkzVarY = defpackage.dkz.y(dkzVar, defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u), 0L, null, null, 0L, 0, 0L, 16777214);
                defpackage.dpq dpqVar = bjcVarD.l;
                if (dpqVar == null || (dpfVar = bjcVarD.h) == null) {
                    dkwVar = null;
                } else {
                    defpackage.dji djiVar = new defpackage.dji(bjcVarD.a);
                    if (bjcVarD.o == null || bjcVarD.k == null) {
                        dkwVar = null;
                    } else {
                        long j = bjcVarD.m & (-8589934589L);
                        defpackage.aokc aokcVar = defpackage.aokc.a;
                        dkwVar = new defpackage.dkw(new defpackage.dkv(djiVar, dkzVarY, aokcVar, bjcVarD.f, bjcVarD.e, bjcVarD.d, dpfVar, dpqVar, bjcVarD.p, bjcVarD.c, j), new defpackage.djy(new defpackage.djz(djiVar, dkzVarY, aokcVar, dpfVar, bjcVarD.p, bjcVarD.e, bjcVarD.c), j, bjcVarD.f, bjcVarD.d), bjcVarD.j);
                    }
                }
                if (dkwVar != null) {
                    list.add(dkwVar);
                    dkwVar2 = dkwVar;
                }
                return java.lang.Boolean.valueOf(dkwVar2 != null);
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.bjn bjnVar = (defpackage.bjn) this.a;
                bjm bjmVar = bjnVar.i;
                if (bjmVar == null) {
                    z = false;
                } else {
                    defpackage.aonj aonjVar = bjnVar.h;
                    if (aonjVar != null) {
                        aonjVar.a(bjmVar);
                    }
                    bjm bjmVar2 = bjnVar.i;
                    if (bjmVar2 != null) {
                        bjmVar2.c = zBooleanValue;
                    }
                    bjnVar.k();
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                java.lang.String str = ((defpackage.dji) obj).c;
                defpackage.bjr bjrVar2 = (defpackage.bjr) this.a;
                bjq bjqVar = bjrVar2.j;
                if (bjqVar == null) {
                    bjq bjqVar2 = new bjq(bjrVar2.a, str);
                    defpackage.bjc bjcVar = new defpackage.bjc(str, bjrVar2.b, bjrVar2.k, bjrVar2.c, bjrVar2.d, bjrVar2.e, bjrVar2.f, bjrVar2.g);
                    bjcVar.e(bjrVar2.d().h);
                    bjqVar2.c = bjcVar;
                    bjrVar2.j = bjqVar2;
                } else if (!defpackage.aooh.n(str, bjqVar.a)) {
                    bjqVar.a = str;
                    defpackage.bjc bjcVar2 = bjqVar.c;
                    if (bjcVar2 != null) {
                        bjcVar2.g(str, bjrVar2.b, bjrVar2.k, bjrVar2.c, bjrVar2.d, bjrVar2.e, bjrVar2.f, bjrVar2.g);
                    }
                }
                bjrVar2.h();
                return java.lang.Boolean.TRUE;
            case 3:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                defpackage.bjr bjrVar3 = (defpackage.bjr) this.a;
                bjq bjqVar3 = bjrVar3.j;
                if (bjqVar3 == null) {
                    z = false;
                } else {
                    bjqVar3.b = zBooleanValue2;
                    bjrVar3.h();
                }
                return java.lang.Boolean.valueOf(z);
            case 4:
                ((defpackage.czb) obj).s((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 5:
                byu byuVar = (defpackage.ddh) obj;
                defpackage.aooh.d(byuVar, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                byu byuVar2 = byuVar;
                byuVar2.b = true;
                byuVar2.a.a(this.a);
                defpackage.den.s(byuVar2);
                return java.lang.Boolean.FALSE;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.kaw kawVar = (defpackage.kaw) defpackage.den.aa((defpackage.cje) obj, defpackage.cca.a);
                java.lang.Object obj2 = this.a;
                if (!(obj2 instanceof defpackage.cex)) {
                    return null;
                }
                java.lang.Object obj3 = kawVar.a;
                while (obj3 != null) {
                    android.view.View view = (android.view.View) obj3;
                    java.lang.Object tag = view.getTag(((defpackage.cex) obj2).a());
                    if (tag != null) {
                        return tag;
                    }
                    java.lang.Object objD = defpackage.dzp.d(view);
                    obj3 = objD instanceof android.view.View ? (android.view.View) objD : null;
                }
                return null;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aozj aozjVar = defpackage.cds.j;
                ((defpackage.cbb) this.a).a(obj);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                java.util.concurrent.CancellationException cancellationExceptionL = defpackage.aodc.l("Recomposer effect job completed", th);
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.cds) obj4).b) {
                    defpackage.aoub aoubVar = ((defpackage.cds) obj4).c;
                    if (aoubVar != null) {
                        ((defpackage.cds) obj4).k.e(defpackage.cdm.b);
                        aoubVar.s(cancellationExceptionL);
                        ((defpackage.cds) obj4).g = null;
                        aoubVar.p(new defpackage.bly(obj4, th, 16));
                    } else {
                        ((defpackage.cds) obj4).d = cancellationExceptionL;
                        ((defpackage.cds) obj4).k.e(defpackage.cdm.a);
                    }
                }
                return defpackage.aojh.a;
            case 9:
                defpackage.cec cecVar = (defpackage.cec) this.a;
                defpackage.aowv aowvVar = cecVar.c;
                if (aowvVar == null) {
                    defpackage.aooh.g();
                }
                if (!defpackage.aooh.n(cecVar.c, aowvVar)) {
                    defpackage.cdh.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                defpackage.ady adyVar = cecVar.e;
                java.lang.Object obj5 = cecVar.b;
                if (adyVar != null) {
                    if (obj5 != null) {
                        defpackage.cdh.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    adyVar.j(obj);
                } else if (obj5 == null) {
                    cecVar.b = obj;
                } else {
                    defpackage.ady adyVar2 = defpackage.adz.a;
                    defpackage.ady adyVar3 = new defpackage.ady(6);
                    adyVar3.j(obj5);
                    adyVar3.j(obj);
                    cecVar.e = adyVar3;
                    cecVar.b = null;
                }
                return defpackage.aojh.a;
            case 10:
                defpackage.cjx cjxVar = ((defpackage.cjw) this.a).c;
                return java.lang.Boolean.valueOf(cjxVar != null ? cjxVar.e(obj) : true);
            case 11:
                defpackage.aonj aonjVar2 = defpackage.ckw.a;
                defpackage.cko ckoVar = (defpackage.cko) this.a.a((defpackage.ckv) obj);
                synchronized (defpackage.ckw.b) {
                    defpackage.ckw.c = defpackage.ckw.c.d(ckoVar.v());
                }
                return ckoVar;
            case 12:
                java.lang.Object obj6 = this.a;
                synchronized (((defpackage.clk) obj6).e) {
                    defpackage.clj cljVar = ((defpackage.clk) obj6).f;
                    if (cljVar == null) {
                        defpackage.aooh.g();
                    }
                    java.lang.Object obj7 = cljVar.b;
                    if (obj7 == null) {
                        defpackage.aooh.g();
                    }
                    int i = cljVar.c;
                    defpackage.ado adoVar = cljVar.h;
                    if (adoVar == null) {
                        adoVar = new defpackage.ado(6);
                        cljVar.h = adoVar;
                        cljVar.e().n(obj7, adoVar);
                    }
                    cljVar.g(obj, i, obj7, adoVar);
                }
                return defpackage.aojh.a;
            case 13:
                defpackage.cra craVar = (defpackage.cra) obj;
                defpackage.cre creVar = (defpackage.cre) this.a;
                craVar.w(creVar.a);
                craVar.x(creVar.b);
                craVar.o(creVar.c);
                craVar.C(0.0f);
                craVar.y(creVar.f);
                craVar.v(creVar.i);
                craVar.r(creVar.j);
                craVar.B(creVar.k);
                craVar.z(creVar.l);
                craVar.s(creVar.m);
                craVar.p(creVar.n);
                craVar.A(creVar.o);
                craVar.t(creVar.p);
                craVar.q(creVar.q);
                craVar.u(creVar.s);
                return defpackage.aojh.a;
            case 14:
                double dDoubleValue = ((java.lang.Double) obj).doubleValue();
                defpackage.csb csbVar = (defpackage.csb) this.a;
                return java.lang.Double.valueOf(defpackage.aooc.p(csbVar.k.a(dDoubleValue), csbVar.e, csbVar.f));
            case 15:
                double dDoubleValue2 = ((java.lang.Double) obj).doubleValue();
                defpackage.csb csbVar2 = (defpackage.csb) this.a;
                return java.lang.Double.valueOf(csbVar2.n.a(defpackage.aooc.p(dDoubleValue2, csbVar2.e, csbVar2.f)));
            case 16:
                java.lang.Object obj8 = this.a;
                defpackage.csj csjVar = (defpackage.csj) obj;
                defpackage.cso csoVar = (defpackage.cso) obj8;
                defpackage.cpx cpxVar = csoVar.t;
                if (csoVar.e && csoVar.q && cpxVar != null) {
                    defpackage.csg csgVarQ = csjVar.q();
                    long jA = csgVarQ.a();
                    csgVarQ.b().g();
                    try {
                        csgVarQ.c.t(cpxVar);
                        ((defpackage.cso) obj8).f(csjVar);
                    } finally {
                        csgVarQ.b().e();
                        csgVarQ.h(jA);
                    }
                } else {
                    csoVar.f(csjVar);
                }
                return defpackage.aojh.a;
            case 17:
                defpackage.czb.B((defpackage.czb) obj, (defpackage.czc) this.a, 0, 0);
                return defpackage.aojh.a;
            case 18:
                ((defpackage.adq) this.a).q((defpackage.cmu) obj);
                return java.lang.Boolean.TRUE;
            case 19:
                defpackage.aomy aomyVar = (defpackage.aomy) obj;
                defpackage.deg degVar = (defpackage.deg) this.a;
                android.os.Handler handler = degVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    aomyVar.a();
                } else {
                    android.os.Handler handler2 = degVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new jd(aomyVar, 18, (byte[]) null));
                    }
                }
                return defpackage.aojh.a;
            default:
                int i2 = ((cok) obj).a;
                defpackage.cou couVar = ((defpackage.deg) this.a).F;
                defpackage.cpg cpgVarB = couVar.b();
                if (cpgVarB == null || !cpgVarB.a || !couVar.a.i(i2)) {
                    defpackage.aoot aootVar = new defpackage.aoot();
                    aootVar.a = java.lang.Boolean.FALSE;
                    defpackage.cpg cpgVarB2 = couVar.b();
                    java.lang.Boolean boolD = couVar.d(i2, couVar.a.g(), new bxc(aootVar, i2, 3));
                    if ((!defpackage.aooh.n(boolD, java.lang.Boolean.TRUE) || cpgVarB2 == couVar.b()) && boolD != null && aootVar.a != null && boolD.booleanValue()) {
                        ((java.lang.Boolean) aootVar.a).booleanValue();
                    }
                }
                return defpackage.aojh.a;
        }
    }
}
