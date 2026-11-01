package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nhy implements defpackage.ihn {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbySodaListener");
    public final aoss b;
    public final defpackage.nej c;
    public final defpackage.mqt d;
    public final defpackage.nbr e;
    public final defpackage.mfz f;
    public final defpackage.kpb g;
    public final defpackage.nhq h;
    public final aoin i;
    public final aoin j;
    public boolean k;
    public java.lang.String l;
    public final ptx m;
    public final defpackage.ogj n;
    private final aoss o;
    private final rlv p;
    private final ruc q;
    private final zjm r;
    private final ahda s;

    public nhy(aoss aossVar, aoss aossVar2, defpackage.nej nejVar, defpackage.mqt mqtVar, defpackage.nbr nbrVar, defpackage.ogj ogjVar, defpackage.mfz mfzVar, defpackage.kpb kpbVar, zjm zjmVar, rlv rlvVar, ptx ptxVar, defpackage.nhq nhqVar, aoin aoinVar, aoin aoinVar2, ruc rucVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        aooh.f(nejVar, "dobbyLifecycleController");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(kpbVar, "callNotesTranscriptBuilder");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(ptxVar, "callProperties");
        aooh.f(nhqVar, "session");
        aooh.f(aoinVar, "dobbyAsyncCallController");
        aooh.f(aoinVar2, "enableCslSodaPartialsForBargeIn");
        aooh.f(rucVar, "metrics");
        this.o = aossVar;
        this.b = aossVar2;
        this.c = nejVar;
        this.d = mqtVar;
        this.e = nbrVar;
        this.n = ogjVar;
        this.f = mfzVar;
        this.g = kpbVar;
        this.r = zjmVar;
        this.p = rlvVar;
        this.m = ptxVar;
        this.h = nhqVar;
        this.i = aoinVar;
        this.j = aoinVar2;
        this.q = rucVar;
        this.s = new ahda((byte[]) null);
        this.l = "";
    }

    public static final alro k(alqv alqvVar) {
        akzz akzzVarM = alro.a.m();
        akzzVarM.bV(alqv.f, alqvVar);
        alro alroVarP = akzzVarM.p();
        aooh.e(alroVarP, "build(...)");
        return alroVarP;
    }

    private final java.lang.Object l(aenj aenjVar, aonj aonjVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.o, this.s, new defpackage.nht(pez.aR(this.q, ruc.bh, aenjVar, new defpackage.kqu(aonjVar, (aoln) null, 15, (char[]) null)), (aoln) null, 0)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.ihn
    public final java.lang.Object a(defpackage.igd igdVar, tvx tvxVar, aoln aolnVar) {
        java.lang.Object objL = l(ruc.bk, new nhv(this, tvxVar, (aoln) null, 1), aolnVar);
        return objL != aolu.a ? aojh.a : objL;
    }

    @Override // defpackage.ihn
    public final java.lang.Object b(defpackage.igd igdVar, twj twjVar, aoln aolnVar) {
        java.lang.Object objL = l(ruc.bj, new defpackage.nhw(this, twjVar, null), aolnVar);
        return objL != aolu.a ? aojh.a : objL;
    }

    @Override // defpackage.ihn
    public final java.lang.Object c(defpackage.igd igdVar, twj twjVar, aoln aolnVar) {
        java.lang.Object objL = l(ruc.bi, new defpackage.nhx(this, twjVar, null), aolnVar);
        return objL != aolu.a ? aojh.a : objL;
    }

    @Override // defpackage.ihn
    public final java.lang.Object d(twg twgVar, aoln aolnVar) {
        java.lang.Object objL = l(ruc.bm, new defpackage.bhp(twgVar, this, (aoln) null, 20), aolnVar);
        return objL != aolu.a ? aojh.a : objL;
    }

    @Override // defpackage.ihn
    public final /* synthetic */ java.lang.Object e() {
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(twj twjVar, aoln aolnVar) {
        defpackage.nhr nhrVar;
        if (aolnVar instanceof defpackage.nhr) {
            nhrVar = (defpackage.nhr) aolnVar;
            int i = nhrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhrVar.c = i - Integer.MIN_VALUE;
            } else {
                nhrVar = new defpackage.nhr(this, aolnVar);
            }
        } else {
            nhrVar = new defpackage.nhr(this, aolnVar);
        }
        java.lang.Object objI = nhrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhrVar.c;
        if (i2 == 0) {
            aooc.af(objI);
            nhrVar.d = twjVar;
            nhrVar.c = 1;
            objI = i(nhrVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            twjVar = nhrVar.d;
            aooc.af(objI);
        }
        if (!((java.lang.Boolean) objI).booleanValue() || aooh.n(this.l, "")) {
            return twjVar;
        }
        int size = aoov.S(this.l, new java.lang.String[]{" "}, 0).size();
        amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        java.lang.String strCr = (java.lang.String) (amldVar.b == 2 ? (amla) amldVar.c : amla.a).b.get(0);
        aooh.e(strCr, "getPartialText(...)");
        java.util.List listS = aoov.S(strCr, new java.lang.String[]{" "}, 0);
        if (size <= listS.size()) {
            strCr = ajsz.cr(ajsz.bR(listS, size), " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
        }
        uzx uzxVarCi = wsc.ci(twjVar.p());
        zoe zoeVarA = defpackage.ajee.A(uzxVarCi.D().p());
        zoe zoeVarB = defpackage.ajee.B(zoeVarA.R().p());
        java.lang.Object obj = zoeVarB.a;
        akzz akzzVar = (akzz) obj;
        amld amldVar2 = akzzVar.b;
        amla amlaVar = amldVar2.b == 2 ? (amla) amldVar2.c : amla.a;
        aooh.e(amlaVar, "getPartialResult(...)");
        akzz akzzVarP = amlaVar.p();
        aooh.f(akzzVarP, "builder");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzzVarP.b.b);
        aooh.e(listUnmodifiableList, "getPartialTextList(...)");
        new alct(listUnmodifiableList);
        aooh.f(strCr, "value");
        akzzVarP.u();
        amla amlaVar2 = akzzVarP.b;
        j$.util.Objects.requireNonNull(strCr);
        alat alatVar = amlaVar2.b;
        if (!alatVar.c()) {
            amlaVar2.b = alad.J(alatVar);
        }
        amlaVar2.b.set(0, strCr);
        amla amlaVarP = akzzVarP.p();
        aooh.e(amlaVarP, "build(...)");
        amla amlaVar3 = amlaVarP;
        aooh.f(amlaVar3, "value");
        ((akzx) obj).u();
        amld amldVar3 = akzzVar.b;
        j$.util.Objects.requireNonNull(amlaVar3);
        amldVar3.c = amlaVar3;
        amldVar3.b = 2;
        zoeVarA.T(zoeVarB.U());
        uzxVarCi.E(zoeVarA.S());
        return uzxVarCi.C();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(twj twjVar, aoln aolnVar) {
        defpackage.nhs nhsVar;
        if (aolnVar instanceof defpackage.nhs) {
            nhsVar = (defpackage.nhs) aolnVar;
            int i = nhsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhsVar.c = i - Integer.MIN_VALUE;
            } else {
                nhsVar = new defpackage.nhs(this, aolnVar);
            }
        } else {
            nhsVar = new defpackage.nhs(this, aolnVar);
        }
        java.lang.Object objI = nhsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhsVar.c;
        if (i2 == 0) {
            aooc.af(objI);
            nhsVar.d = twjVar;
            nhsVar.c = 1;
            objI = i(nhsVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            twjVar = nhsVar.d;
            aooc.af(objI);
        }
        if (!((java.lang.Boolean) objI).booleanValue() || aooh.n(this.l, "")) {
            return twjVar;
        }
        amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        amkw amkwVar = amldVar.b == 1 ? (amkw) amldVar.c : amkw.a;
        aooh.e(amkwVar, "getFinalResult(...)");
        if (amkwVar.c.size() != 0) {
            int size = aoov.S(this.l, new java.lang.String[]{" "}, 0).size();
            java.lang.String strCr = (java.lang.String) amkwVar.c.get(0);
            aooh.e(strCr, "getHypothesis(...)");
            java.util.List listS = aoov.S(strCr, new java.lang.String[]{" "}, 0);
            if (size <= listS.size() && size != 0) {
                this.p.o(rmx.xf);
                strCr = ajsz.cr(ajsz.bR(listS, size), " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
            }
            uzx uzxVarCi = wsc.ci(twjVar.p());
            zoe zoeVarA = defpackage.ajee.A(uzxVarCi.D().p());
            zoe zoeVarB = defpackage.ajee.B(zoeVarA.R().p());
            akzz akzzVarP = amkwVar.p();
            aooh.f(akzzVarP, "builder");
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzzVarP.b.c);
            aooh.e(listUnmodifiableList, "getHypothesisList(...)");
            new alct(listUnmodifiableList);
            aooh.f(strCr, "value");
            akzzVarP.u();
            amkw amkwVar2 = akzzVarP.b;
            j$.util.Objects.requireNonNull(strCr);
            alat alatVar = amkwVar2.c;
            if (!alatVar.c()) {
                amkwVar2.c = alad.J(alatVar);
            }
            amkwVar2.c.set(0, strCr);
            amkw amkwVarP = akzzVarP.p();
            aooh.e(amkwVarP, "build(...)");
            amkw amkwVar3 = amkwVarP;
            aooh.f(amkwVar3, "value");
            java.lang.Object obj = zoeVarB.a;
            ((akzx) obj).u();
            amld amldVar2 = ((akzz) obj).b;
            j$.util.Objects.requireNonNull(amkwVar3);
            amldVar2.c = amkwVar3;
            amldVar2.b = 1;
            zoeVarA.T(zoeVarB.U());
            uzxVarCi.E(zoeVarA.S());
            twjVar = uzxVarCi.C();
        }
        twj twjVar2 = twjVar;
        this.l = "";
        return twjVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.nhu nhuVar;
        if (aolnVar instanceof defpackage.nhu) {
            nhuVar = (defpackage.nhu) aolnVar;
            int i = nhuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhuVar.c = i - Integer.MIN_VALUE;
            } else {
                nhuVar = new defpackage.nhu(this, aolnVar);
            }
        } else {
            nhuVar = new defpackage.nhu(this, aolnVar);
        }
        java.lang.Object objA = nhuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhuVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.ogj ogjVar = this.n;
            nhuVar.c = 1;
            objA = ogjVar.a(nhuVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        int iOrdinal = nmoVarB.ordinal();
        if (iOrdinal != 14 && iOrdinal != 15) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final java.lang.Object j(aoln aolnVar) {
        j$.util.Optional optionalG = this.r.g();
        aooh.e(optionalG, "getFeature(...)");
        defpackage.irl irlVar = (defpackage.irl) aooh.q(optionalG);
        return (irlVar == null || !irlVar.e()) ? java.lang.Boolean.FALSE : i(aolnVar);
    }

    @Override // defpackage.ihn
    public final java.lang.Object y(amle amleVar, aoln aolnVar) {
        java.lang.Object objL = l(ruc.bl, new nhv(this, amleVar, (aoln) null, 0), aolnVar);
        return objL != aolu.a ? aojh.a : objL;
    }
}
