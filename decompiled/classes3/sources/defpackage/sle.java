package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sle {
    public static final aimz a = aimz.i("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer");
    public static final j$.time.Duration b = j$.time.Duration.ofMillis(100);
    public ok A;
    public ok B;
    public final cer C;
    public android.net.Uri D;
    public final agtk E;
    public final agtk F;
    public final java.lang.String G;
    public final defpackage.ryg H;
    public final aazc I;
    public final zjm J;
    public final defpackage.uhp K;
    public final gpd L;
    public final ahda M;
    public final heq N;
    public final apni O;
    private final defpackage.agyq P;
    private final aolr Q;
    public final aoin c;
    public final defpackage.abxn d;
    public final defpackage.skv e;
    public final aoss f;
    public final aoss g;
    public final aoss h;
    public final rlv i;
    public final android.content.Context j;
    public final ahhp k;
    public final aoin l;
    public final sjy m;
    public final aoin n;
    public final defpackage.smw o;
    public final aoin p;
    public final aoin q;
    public final agtj r;
    public final defpackage.sjh s;
    public final defpackage.sjl t;
    public final aoin u;
    public final aoin v;
    public final aoin w;
    public final aoin x;
    public j$.time.Instant y;
    public ok z;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:87:0x026e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [agxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [cer, java.lang.Object] */
    public sle(aoin aoinVar, defpackage.abxn abxnVar, defpackage.skv skvVar, defpackage.agyq agyqVar, defpackage.uhp uhpVar, aazc aazcVar, aoss aossVar, aoss aossVar2, aoss aossVar3, aolr aolrVar, apni apniVar, rlv rlvVar, heq heqVar, android.content.Context context, ahhp ahhpVar, aoin aoinVar2, sjy sjyVar, aoin aoinVar3, defpackage.smw smwVar, defpackage.ryg rygVar, aoin aoinVar4, aoin aoinVar5, defpackage.sjf sjfVar, agtj agtjVar, defpackage.sjh sjhVar, defpackage.sjl sjlVar, aoin aoinVar6, zjm zjmVar, gpd gpdVar, aoin aoinVar7, aoin aoinVar8, aoin aoinVar9) throws aois {
        defpackage.abxn abxnVar2;
        defpackage.abxt abxtVar;
        defpackage.uhp uhpVar2;
        defpackage.abmv abmvVar;
        defpackage.skp skpVar;
        aooh.f(aazcVar, "clock");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(aossVar2, "lightweightScope");
        aooh.f(aossVar3, "blockingScope");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(apniVar, "androidJobs");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(ahhpVar, "imageManager");
        aooh.f(aoinVar2, "enableContactsYourInfoFeatureRequestChanges");
        aooh.f(aoinVar4, "enablePatrickImageCaptureInternalStorage");
        aooh.f(sjfVar, "navigationAdapter");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(sjhVar, "navigationController");
        aooh.f(sjlVar, "viewModel");
        aooh.f(aoinVar6, "enableCallingCardViewModelRefactor");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.c = aoinVar;
        this.d = abxnVar;
        this.e = skvVar;
        this.P = agyqVar;
        this.K = uhpVar;
        this.I = aazcVar;
        this.f = aossVar;
        this.g = aossVar2;
        this.h = aossVar3;
        this.Q = aolrVar;
        this.O = apniVar;
        this.i = rlvVar;
        this.N = heqVar;
        this.j = context;
        this.k = ahhpVar;
        this.l = aoinVar2;
        this.m = sjyVar;
        this.n = aoinVar3;
        this.o = smwVar;
        this.H = rygVar;
        this.p = aoinVar4;
        this.q = aoinVar5;
        this.r = agtjVar;
        this.s = sjhVar;
        this.t = sjlVar;
        this.u = aoinVar6;
        this.J = zjmVar;
        this.L = gpdVar;
        this.v = aoinVar7;
        this.w = aoinVar8;
        this.x = aoinVar9;
        j$.time.Instant instant = j$.time.Instant.MIN;
        aooh.e(instant, "MIN");
        this.y = instant;
        if (((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
            abxtVar = sjlVar.a().c;
            abxnVar2 = abxnVar;
        } else {
            abxnVar2 = abxnVar;
            abxtVar = abxnVar2.d;
            abxtVar = abxtVar == null ? defpackage.abxt.a : abxtVar;
            aooh.c(abxtVar);
        }
        defpackage.abxp abxpVar = abxtVar.c;
        boolean z = true;
        if ((abxpVar == null ? defpackage.abxp.a : abxpVar).b == 1) {
            defpackage.abxp abxpVar2 = abxtVar.c;
            abxpVar2 = abxpVar2 == null ? defpackage.abxp.a : abxpVar2;
            defpackage.abxs abxsVar = abxpVar2.b == 1 ? (defpackage.abxs) abxpVar2.c : defpackage.abxs.a;
            aooh.e(abxsVar, "getFullScreenImage(...)");
            aooh.f(abxsVar, "fullScreenImage");
            uhpVar.z(new defpackage.rzt(abxsVar, 11));
        }
        int i = 4;
        if (((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
            uhpVar.l(sjlVar.a().g);
            defpackage.sjj sjjVar = sjlVar.a().e;
            aooh.f(sjjVar, "<this>");
            int iOrdinal = sjjVar.ordinal();
            if (iOrdinal == 0) {
                i = 2;
            } else if (iOrdinal == 1) {
                i = 3;
            } else if (iOrdinal != 2) {
                throw new aois();
            }
            uhpVar.C(i);
            uhpVar.r(sjlVar.a().h);
        } else {
            java.lang.String str = abxnVar2.c;
            aooh.e(str, "getContactName(...)");
            uhpVar.l(str);
            int iAR = a.aR(abxnVar2.g);
            int i2 = (iAR == 0 ? 1 : iAR) - 2;
            if (i2 == 1) {
                i = 3;
            } else if (i2 != 2) {
                i = 2;
            }
            uhpVar.C(i);
            uhpVar.r(abxnVar2.f);
        }
        defpackage.abxr abxrVar = abxtVar.d;
        if (((abxrVar == null ? defpackage.abxr.a : abxrVar).b & 1) != 0) {
            defpackage.abxr abxrVar2 = abxtVar.d;
            defpackage.amml ammlVar = (abxrVar2 == null ? defpackage.abxr.a : abxrVar2).c;
            ammlVar = ammlVar == null ? defpackage.amml.a : ammlVar;
            aooh.e(ammlVar, "getColor(...)");
            aooh.f(ammlVar, "color");
            uhpVar.z(new defpackage.rzt(ammlVar, 15));
            uhpVar.v(h(ammlVar));
        } else {
            java.lang.String strJ = uhpVar.j();
            if (strJ == null || strJ.length() == 0) {
                uhpVar.o(cfd.M(urg.c(skvVar.A(), 2130969057)));
            } else {
                float f = defpackage.smf.a;
                uhpVar.o(defpackage.smf.m << 32);
            }
        }
        if ((abxtVar.b & 2) != 0) {
            defpackage.abxr abxrVar3 = abxtVar.d;
            uhpVar.q((abxrVar3 == null ? defpackage.abxr.a : abxrVar3).d, (abxrVar3 == null ? defpackage.abxr.a : abxrVar3).e, (abxrVar3 == null ? defpackage.abxr.a : abxrVar3).f, (abxrVar3 == null ? defpackage.abxr.a : abxrVar3).g, (abxrVar3 == null ? defpackage.abxr.a : abxrVar3).h);
            uhpVar2 = uhpVar;
        } else {
            uhpVar2 = uhpVar;
        }
        defpackage.sko skoVarH = uhpVar2.h();
        if (skoVarH != null) {
            abmvVar = new defpackage.abmv(java.lang.Integer.valueOf(skoVarH.e), java.lang.Integer.valueOf(skoVarH.f), java.lang.Float.valueOf(skoVarH.c), java.lang.Float.valueOf(skoVarH.d), java.lang.Float.valueOf(skoVarH.g));
            abmvVar = true != abmvVar.a() ? null : abmvVar;
        }
        if (abmvVar == null) {
            z = false;
            break;
        }
        java.util.List<defpackage.sjz> list = defpackage.sjz.b;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (defpackage.sjz sjzVar : list) {
                int i3 = sjzVar.c.f;
                java.lang.Integer num = abmvVar.b;
                if (num != null && i3 == num.intValue() && aooh.k(sjzVar.c.g, abmvVar.e) && aooh.k(sjzVar.c.c, abmvVar.c)) {
                    int i4 = sjzVar.c.e;
                    java.lang.Integer num2 = abmvVar.a;
                    if (num2 != null && i4 == num2.intValue() && aooh.k(sjzVar.c.d, abmvVar.d)) {
                        z = false;
                        break;
                    }
                }
            }
        }
        uhpVar2.t(z);
        java.lang.Object obj = ((defpackage.whl) uhpVar2.i).a;
        if (aooh.n((obj == null || (skpVar = ((defpackage.skq) obj).a) == null) ? null : java.lang.Boolean.valueOf(skpVar.o), java.lang.Boolean.TRUE) && skoVarH != null) {
            uhpVar2.m(skoVarH);
        }
        if (this.J.g().isPresent() && ((java.lang.Boolean) this.l.a()).booleanValue() && this.t.c.c() == defpackage.sjg.e) {
            this.K.B();
        }
        this.C = agyqVar.a(2131428621, this.K.h).a;
        this.M = new ahda((byte[]) null);
        this.E = new defpackage.slc(this);
        this.F = new defpackage.sla(this);
        java.lang.String str2 = java.text.NumberFormat.getNumberInstance().format((java.lang.Object) 10);
        aooh.e(str2, "format(...)");
        this.G = str2;
    }

    public static final long h(defpackage.amml ammlVar) {
        akzv akzvVar = ammlVar.f;
        if (akzvVar == null) {
            akzvVar = akzv.a;
        }
        return cfd.M(((((int) (akzvVar.b * 255.0f)) & 255) << 24) | ((((int) (ammlVar.c * 255.0f)) & 255) << 16) | ((((int) (ammlVar.d * 255.0f)) & 255) << 8) | (((int) (ammlVar.e * 255.0f)) & 255));
    }

    public static final double i(defpackage.skn sknVar) {
        if (sknVar == null) {
            float f = defpackage.smf.a;
            return defpackage.smf.n;
        }
        defpackage.amml ammlVar = sknVar.f;
        if (ammlVar == null) {
            ammlVar = defpackage.amml.a;
        }
        aooh.e(ammlVar, "getSelectedFontColor(...)");
        int iL = cfd.L(h(ammlVar));
        float f2 = defpackage.smf.a;
        for (defpackage.slp slpVar : defpackage.smf.l) {
            int i = (int) slpVar.a;
            if (i - 50 <= iL && iL <= i + 50) {
                return slpVar.d;
            }
        }
        return defpackage.smf.n;
    }

    public final zas a() {
        return this.L.i((java.lang.String) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(ok okVar, aoln aolnVar) {
        defpackage.slb slbVar;
        if (aolnVar instanceof defpackage.slb) {
            slbVar = (defpackage.slb) aolnVar;
            int i = slbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                slbVar.c = i - Integer.MIN_VALUE;
            } else {
                slbVar = new defpackage.slb(this, aolnVar);
            }
        } else {
            slbVar = new defpackage.slb(this, aolnVar);
        }
        java.lang.Object objAj = slbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = slbVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            slbVar.d = (ap) okVar;
            slbVar.c = 1;
            objAj = aoov.aj(this.Q, new defpackage.sfo(this, (aoln) null, 6), slbVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            okVar = slbVar.d;
            aooc.af(objAj);
        }
        if (((java.lang.Boolean) objAj).booleanValue()) {
            d();
        } else {
            okVar.b("android.permission.CAMERA");
        }
        return aojh.a;
    }

    public final void c() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("patrickDataKey", defpackage.abxt.a.i());
        defpackage.skv skvVar = this.e;
        skvVar.H().setResult(-1, intent);
        skvVar.H().finish();
    }

    public final void d() {
        this.O.i(ahvr.ag(this.f, this.M, new mva(this, (aoln) null, 18)));
    }

    public final void e(android.net.Uri uri) {
        aoov.an(this.f, (aolr) null, 0, new defpackage.rka(this, uri, (aoln) null, 14), 3);
    }

    public final void f(android.net.Uri uri) {
        float f = defpackage.smf.a;
        this.t.f(new defpackage.aev(uri, defpackage.smf.m << 32, 9));
    }

    public final void g(java.lang.String str) {
        defpackage.agby.q(this.e.N(), str, -1).h();
    }
}
