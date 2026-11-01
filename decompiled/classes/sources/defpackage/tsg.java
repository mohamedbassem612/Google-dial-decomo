package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tsg {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService");
    public final defpackage.aoss b;
    public final defpackage.aoss c;
    public final defpackage.tsj d;
    public final defpackage.tmi e;
    public final android.net.ConnectivityManager f;
    public defpackage.aosy g;
    public defpackage.aoub h;
    public final defpackage.aonj i;
    public final android.net.ConnectivityManager.NetworkCallback j;
    public final defpackage.twp k;
    public final defpackage.yvh l;
    public final defpackage.zth m;
    public final defpackage.ajxw n;
    public final defpackage.aogc o;
    public final defpackage.apni p;
    public final defpackage.aogc q;
    private final defpackage.okw r;

    public tsg(defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.aogc aogcVar, defpackage.aogc aogcVar2, defpackage.tsj tsjVar, defpackage.twp twpVar, defpackage.tmi tmiVar, defpackage.okw okwVar, defpackage.ajxw ajxwVar, defpackage.zth zthVar, defpackage.yvh yvhVar, defpackage.apni apniVar, android.net.ConnectivityManager connectivityManager) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(aossVar2, "blockingScope");
        defpackage.aooh.f(aogcVar, "resultPropagator");
        defpackage.aooh.f(aogcVar2, "settings");
        defpackage.aooh.f(tmiVar, "dialerSharpieConfigProvider");
        defpackage.aooh.f(ajxwVar, "sharpieSettingsSingletonState");
        defpackage.aooh.f(apniVar, "androidJobs");
        this.b = aossVar;
        this.c = aossVar2;
        this.o = aogcVar;
        this.q = aogcVar2;
        this.d = tsjVar;
        this.k = twpVar;
        this.e = tmiVar;
        this.r = okwVar;
        this.n = ajxwVar;
        this.m = zthVar;
        this.l = yvhVar;
        this.p = apniVar;
        this.f = connectivityManager;
        this.i = new defpackage.aiuo(new jgn(this, (defpackage.aoln) null, 17));
        this.j = new tse(this);
    }

    public static final void h(defpackage.aogc aogcVar, defpackage.ajcq ajcqVar) {
        aogcVar.s(ajcqVar, defpackage.tsj.a);
    }

    public static /* synthetic */ void i(defpackage.tsg tsgVar, defpackage.aogc aogcVar) {
        tsgVar.g(aogcVar, defpackage.ajcm.a);
    }

    public final defpackage.ajcq a(trt trtVar) {
        tkz tkzVar = new tkz(this, trtVar, (defpackage.aoln) null, 11);
        defpackage.aoss aossVar = this.b;
        defpackage.ajcq ajcqVarF = defpackage.aosv.F(aossVar, 0, tkzVar, 3);
        h(this.o, ajcqVarF);
        defpackage.aoov.an(aossVar, null, 0, new tkz(trtVar, this, (defpackage.aoln) null, 10), 3);
        if (trv.a.b(trtVar)) {
            d();
        }
        return ajcqVarF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        tsd tsdVar;
        if (aolnVar instanceof tsd) {
            tsdVar = (tsd) aolnVar;
            int i = tsdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsdVar.c = i - Integer.MIN_VALUE;
            } else {
                tsdVar = new tsd(this, aolnVar);
            }
        } else {
            tsdVar = new tsd(this, aolnVar);
        }
        java.lang.Object objAj = tsdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tsdVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objAj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAj);
            }
            i(this, this.o);
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objAj);
        defpackage.yvh yvhVar = this.l;
        tsdVar.c = 1;
        objAj = defpackage.aoov.aj(yvhVar.b, new xtn(yvhVar, (defpackage.aoln) null, 4), tsdVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objAj).booleanValue();
        defpackage.ajxw ajxwVar = this.n;
        tsl tslVar = zBooleanValue ? tsl.c : tsl.d;
        tsdVar.c = 2;
        if (ajxwVar.d(tslVar, tsdVar) == aoluVar) {
            return aoluVar;
        }
        i(this, this.o);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0243  */
    /* JADX WARN: Code duplicated, block: B:28:0x0259  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(boolean z, defpackage.aoln aolnVar) {
        tsf tsfVar;
        ajyi ajyiVarN;
        ajyi ajyiVarL;
        ajyi ajyiVarM;
        ajyi ajyiVar;
        ajyi ajyiVar2;
        ajyi ajyiVar3;
        java.lang.Object objB;
        java.lang.Throwable thC;
        if (aolnVar instanceof tsf) {
            tsfVar = (tsf) aolnVar;
            int i = tsfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsfVar.c = i - Integer.MIN_VALUE;
            } else {
                tsfVar = new tsf(this, aolnVar);
            }
        } else {
            tsfVar = new tsf(this, aolnVar);
        }
        java.lang.Object objA = tsfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tsfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                ajyiVarM = tsfVar.g;
                ajyiVarL = tsfVar.e;
                ajyiVar = tsfVar.f;
                ajyiVar2 = tsfVar.d;
                ajyiVarN = tsfVar.i;
                ajyiVar3 = tsfVar.h;
                defpackage.aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objA);
                objB = ((defpackage.aoiw) objA).a;
            }
            thC = defpackage.aoiw.c(objB);
            if (thC == null) {
                ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService", "updateConsentAuditRecord$<anonymous>", 329, "SharpieSettingsDataService.kt")).v("Successfully logged Sharpie consent audit record");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.d()).k(thC).l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService", "updateConsentAuditRecord$<anonymous>", 331, "SharpieSettingsDataService.kt")).v("Failed to log Sharpie consent audit record");
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objA);
        ajyiVarN = aklu.n(akle.a.m());
        ajyi ajyiVarG = aklu.g(aklo.a.m());
        ajyiVarG.K(1124);
        ajyi ajyiVarI = aklu.i(aklm.a.m());
        defpackage.akzx akzxVarM = aklh.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akld akldVar = akld.a;
        ajyi ajyiVarF = akky.F(akldVar.m());
        ajyiVarF.ad();
        ajyiVarF.ac(2132020102);
        akld akldVarAb = ajyiVarF.ab();
        defpackage.aooh.f(akldVarAb, "value");
        akzxVarM.u();
        aklh aklhVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(akldVarAb);
        aklhVar.c = akldVarAb;
        aklhVar.b |= 1;
        ajyi ajyiVarF2 = akky.F(akldVar.m());
        ajyiVarF2.ad();
        ajyiVarF2.ac(2132020101);
        akld akldVarAb2 = ajyiVarF2.ab();
        defpackage.aooh.f(akldVarAb2, "value");
        akzxVarM.u();
        aklh aklhVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akldVarAb2);
        aklhVar2.d = akldVarAb2;
        aklhVar2.b |= 2;
        ajyi ajyiVarF3 = akky.F(akldVar.m());
        ajyiVarF3.ad();
        ajyiVarF3.ac(2132020109);
        akld akldVarAb3 = ajyiVarF3.ab();
        defpackage.aooh.f(akldVarAb3, "value");
        akzxVarM.u();
        aklh aklhVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akldVarAb3);
        aklhVar3.e = akldVarAb3;
        aklhVar3.b |= 4;
        ajyi ajyiVarF4 = akky.F(akldVar.m());
        ajyiVarF4.ad();
        ajyiVarF4.ac(2132020107);
        akld akldVarAb4 = ajyiVarF4.ab();
        defpackage.aooh.f(akldVarAb4, "value");
        akzxVarM.u();
        aklh aklhVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akldVarAb4);
        aklhVar4.f = akldVarAb4;
        aklhVar4.b |= 8;
        aklh aklhVarR = akzxVarM.r();
        defpackage.aooh.e(aklhVarR, "build(...)");
        aklh aklhVar5 = aklhVarR;
        defpackage.aooh.f(aklhVar5, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarI.a;
        akzxVar.u();
        aklm aklmVar = akzxVar.b;
        j$.util.Objects.requireNonNull(aklhVar5);
        aklmVar.d = aklhVar5;
        aklmVar.b |= 262144;
        ajyiVarG.J(ajyiVarI.N());
        ajyiVarN.aa(ajyiVarG.I());
        ajyi ajyiVarJ = aklu.j(aklk.a.m());
        ajyiVarJ.Q(622);
        ajyi ajyiVarK = aklu.k(akll.a.m());
        defpackage.akzx akzxVarM2 = aklg.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        ajyi ajyiVarH = aklu.h(akln.a.m());
        ajyiVarH.M(true != z ? 3 : 2);
        akln aklnVarL = ajyiVarH.L();
        defpackage.aooh.f(aklnVarL, "value");
        akzxVarM2.u();
        aklg aklgVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aklnVarL);
        aklgVar.c = aklnVarL;
        aklgVar.b |= 1;
        aklg aklgVarR = akzxVarM2.r();
        defpackage.aooh.e(aklgVarR, "build(...)");
        aklg aklgVar2 = aklgVarR;
        defpackage.aooh.f(aklgVar2, "value");
        defpackage.akzx akzxVar2 = (defpackage.akzx) ajyiVarK.a;
        akzxVar2.u();
        akll akllVar = akzxVar2.b;
        j$.util.Objects.requireNonNull(aklgVar2);
        akllVar.d = aklgVar2;
        akllVar.b |= 65536;
        ajyiVarJ.P(ajyiVarK.R());
        ajyiVarN.Y(ajyiVarJ.O());
        ajyiVarL = aklu.l(aklj.a.m());
        ajyiVarM = aklu.m(akli.a.m());
        defpackage.okw okwVar = this.r;
        tsfVar.h = ajyiVarN;
        tsfVar.i = ajyiVarN;
        tsfVar.d = ajyiVarL;
        tsfVar.f = ajyiVarM;
        tsfVar.e = ajyiVarL;
        tsfVar.g = ajyiVarM;
        tsfVar.c = 1;
        objA = okwVar.a(tsfVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        ajyiVar = ajyiVarM;
        ajyiVar2 = ajyiVarL;
        ajyiVar3 = ajyiVarN;
        ajyiVarM.V(oks.a(((oks) objA).a));
        ajyiVarL.T(ajyiVar.U());
        aklj akljVarS = ajyiVar2.S();
        ajyiVarN.X(akljVarS);
        ajyiVarN.Z(akljVarS);
        defpackage.okw okwVar2 = this.r;
        akle akleVarW = ajyiVar3.W();
        tsfVar.h = null;
        tsfVar.i = null;
        tsfVar.d = null;
        tsfVar.f = null;
        tsfVar.e = null;
        tsfVar.g = null;
        tsfVar.c = 2;
        objB = okwVar2.b(akleVarW, tsfVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        thC = defpackage.aoiw.c(objB);
        if (thC == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService", "updateConsentAuditRecord$<anonymous>", 329, "SharpieSettingsDataService.kt")).v("Successfully logged Sharpie consent audit record");
        } else {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(thC).l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService", "updateConsentAuditRecord$<anonymous>", 331, "SharpieSettingsDataService.kt")).v("Failed to log Sharpie consent audit record");
        }
        return defpackage.aojh.a;
    }

    public final void d() {
        defpackage.aoov.an(this.b, null, 0, new tpd(this, (defpackage.aoln) null, 9, (byte[]) null), 3);
    }

    public final void e() {
        i(this, this.o);
    }

    public final void f() {
        this.p.i(defpackage.aoov.an(this.c, null, 0, new tpd(this, (defpackage.aoln) null, 13, (boolean[]) null), 3));
    }

    public final void g(defpackage.aogc aogcVar, defpackage.ajcq ajcqVar) {
        aogcVar.t(ajcqVar, defpackage.tsj.a);
    }
}
