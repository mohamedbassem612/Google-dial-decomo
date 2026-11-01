package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rmo implements defpackage.rlv {
    public final defpackage.zzd a;
    public final defpackage.rmp b;
    public final defpackage.zdi c;
    private final defpackage.ajct d;
    private final android.content.Context e;
    private final defpackage.rmb f;
    private final j$.util.Optional g;
    private final defpackage.agsm h;
    private final defpackage.adnp i;
    private final defpackage.ttj j;
    private final defpackage.ipc k;
    private final defpackage.rsr l;

    public rmo(defpackage.ajct ajctVar, android.content.Context context, defpackage.zzd zzdVar, defpackage.rmp rmpVar, defpackage.rmb rmbVar, defpackage.adnp adnpVar, defpackage.ipc ipcVar, defpackage.ttj ttjVar, j$.util.Optional optional, defpackage.zdi zdiVar, defpackage.rsr rsrVar, defpackage.agsm agsmVar) {
        this.d = ajctVar;
        context.getClass();
        this.e = context;
        this.a = zzdVar;
        this.b = rmpVar;
        this.f = rmbVar;
        this.i = adnpVar;
        this.k = ipcVar;
        this.j = ttjVar;
        this.g = optional;
        this.c = zdiVar;
        this.l = rsrVar;
        this.h = agsmVar;
    }

    @Override // defpackage.rlv
    public final void A(defpackage.amsg amsgVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amsgVar);
        ampvVar.q = amsgVar;
        ampvVar.b |= 1073741824;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void B(defpackage.amsq amsqVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amsqVar);
        ampvVar.m = amsqVar;
        ampvVar.b |= 16777216;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void C(int i) {
        defpackage.akzx akzxVarH = H();
        defpackage.akzx akzxVarM = defpackage.amqq.a.m();
        akzxVarM.u();
        defpackage.amqq amqqVar = (defpackage.amqq) akzxVarM.b;
        amqqVar.c = i - 1;
        amqqVar.b |= 2;
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.amqq amqqVar2 = (defpackage.amqq) akzxVarM.r();
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amqqVar2);
        ampvVar.e = amqqVar2;
        ampvVar.b |= 4;
        G((defpackage.ampv) akzxVarH.r());
        this.b.C(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.rlv
    public final void D(int i, java.lang.String str, amra amraVar) {
        defpackage.adnp adnpVar = this.i;
        defpackage.ajcq ajcqVarV = ((defpackage.ahbv) adnpVar.b).v(str, "US");
        defpackage.ajas ajasVarB = defpackage.ahqx.b(new plx(adnpVar, 6));
        defpackage.ajwr ajwrVar = (defpackage.ajwr) adnpVar.a;
        ?? r0 = adnpVar.c;
        defpackage.ajcq ajcqVarE = ajwrVar.e(ajasVarB, r0);
        defpackage.agsm.i(735, defpackage.ahrv.g(defpackage.ahvr.ak(ajcqVarV, ajcqVarE).o(new qfb(ajcqVarV, ajcqVarE, 10), r0)).h(new rwg(this, i, amraVar, 1), this.d), "fail to log RemoteNumberInteractionEvent", new java.lang.Object[0]);
    }

    @Override // defpackage.rlv
    public final void E(android.widget.QuickContactBadge quickContactBadge, int i) {
        quickContactBadge.setOnTouchListener(new rmm(this, i));
    }

    public final defpackage.zzu F() {
        return new defpackage.abtl(this.e, new defpackage.absv(new defpackage.apdz()));
    }

    public final void G(defpackage.ampv ampvVar) {
        this.c.d(this.a.h(ampvVar, F()));
    }

    public final defpackage.akzx H() {
        defpackage.akzx akzxVarM = defpackage.ampv.a.m();
        defpackage.ampw ampwVarBd = this.k.bd();
        akzxVarM.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarM.b;
        j$.util.Objects.requireNonNull(ampwVarBd);
        ampvVar.s = ampwVarBd;
        ampvVar.c |= 1;
        j$.util.Optional optional = this.g;
        optional.isPresent();
        j$.util.Optional optionalP = ((defpackage.zzx) optional.get()).p();
        optionalP.getClass();
        j$.util.Objects.requireNonNull(akzxVarM);
        defpackage.jyv jyvVar = new defpackage.jyv(akzxVarM, 12);
        if (true == optionalP.isPresent()) {
            defpackage.amtg amtgVar = (defpackage.amtg) optionalP.get();
            defpackage.akzx akzxVar = (defpackage.akzx) jyvVar.a;
            akzxVar.u();
            defpackage.ampv ampvVar2 = (defpackage.ampv) akzxVar.b;
            j$.util.Objects.requireNonNull(amtgVar);
            ampvVar2.r = amtgVar;
            ampvVar2.b |= Integer.MIN_VALUE;
        }
        return akzxVarM;
    }

    @Override // defpackage.rlv
    public final void a(defpackage.ysv ysvVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(ysvVar);
        ampvVar.G = ysvVar;
        ampvVar.c |= 131072;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void b(rlu rluVar) {
        defpackage.akzx akzxVarH = H();
        defpackage.akzx akzxVarM = defpackage.amnt.a.m();
        defpackage.ampq ampqVarA = this.f.a();
        akzxVarM.u();
        defpackage.amnt amntVar = (defpackage.amnt) akzxVarM.b;
        j$.util.Objects.requireNonNull(ampqVarA);
        amntVar.c = ampqVarA;
        amntVar.b |= 1;
        defpackage.akzx akzxVarM2 = amns.a.m();
        akzxVarM2.u();
        amns amnsVar = akzxVarM2.b;
        amnsVar.b |= 2;
        amnsVar.d = rluVar.a;
        akzxVarM2.u();
        amns amnsVar2 = akzxVarM2.b;
        amnsVar2.b |= 1;
        amnsVar2.c = rluVar.b;
        akzxVarM.u();
        defpackage.amnt amntVar2 = (defpackage.amnt) akzxVarM.b;
        amns amnsVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(amnsVarR);
        amntVar2.d = amnsVarR;
        amntVar2.b |= 4;
        akzxVarM.u();
        defpackage.amnt amntVar3 = (defpackage.amnt) akzxVarM.b;
        amntVar3.b |= 8;
        amntVar3.e = rluVar.c;
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.amnt amntVar4 = (defpackage.amnt) akzxVarM.r();
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amntVar4);
        ampvVar.g = amntVar4;
        ampvVar.b |= 64;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void c(defpackage.amod amodVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amodVar);
        ampvVar.t = amodVar;
        ampvVar.c |= 2;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void d(defpackage.amoj amojVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amojVar);
        ampvVar.w = amojVar;
        ampvVar.c |= 64;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void e(defpackage.amol amolVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amolVar);
        ampvVar.H = amolVar;
        ampvVar.c |= 524288;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void f(defpackage.amon amonVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amonVar);
        ampvVar.B = amonVar;
        ampvVar.c |= 4096;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void g(defpackage.amoo amooVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amooVar);
        ampvVar.k = amooVar;
        ampvVar.b |= 2097152;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void h(defpackage.rmw rmwVar, java.lang.String str, long j) {
        defpackage.akzx akzxVarH = H();
        defpackage.akzx akzxVarV = defpackage.ttj.V(str, j, this.f.a());
        akzxVarV.u();
        defpackage.amqo amqoVar = (defpackage.amqo) akzxVarV.b;
        defpackage.amqo amqoVar2 = defpackage.amqo.a;
        amqoVar.c = rmwVar.lo;
        amqoVar.b |= 1;
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.amqo amqoVar3 = (defpackage.amqo) akzxVarV.r();
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amqoVar3);
        ampvVar.f = amqoVar3;
        ampvVar.b |= 8;
        this.h.g(defpackage.ahvr.H(this.l.as(), new rmn(this, akzxVarH, rmwVar, str, j), this.d), 10L, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // defpackage.rlv
    public final void i(defpackage.ampf ampfVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(ampfVar);
        ampvVar.h = ampfVar;
        ampvVar.b |= 65536;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void j(defpackage.amph amphVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amphVar);
        ampvVar.E = amphVar;
        ampvVar.c |= 32768;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void k(defpackage.ampi ampiVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(ampiVar);
        ampvVar.D = ampiVar;
        ampvVar.c |= 16384;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void l(defpackage.ampk ampkVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(ampkVar);
        ampvVar.F = ampkVar;
        ampvVar.c |= 65536;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void m(defpackage.ampt amptVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amptVar);
        ampvVar.x = amptVar;
        ampvVar.c |= 128;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void n(defpackage.rmw rmwVar) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(732, rmwVar.name(), defpackage.ahot.a, true);
        try {
            defpackage.akzx akzxVarH = H();
            defpackage.akzx akzxVarU = defpackage.ttj.U(this.f.a());
            akzxVarU.u();
            defpackage.amqo amqoVar = (defpackage.amqo) akzxVarU.b;
            defpackage.amqo amqoVar2 = defpackage.amqo.a;
            amqoVar.c = rmwVar.lo;
            amqoVar.b |= 1;
            akzxVarH.u();
            defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
            defpackage.amqo amqoVar3 = (defpackage.amqo) akzxVarU.r();
            defpackage.ampv ampvVar2 = defpackage.ampv.a;
            j$.util.Objects.requireNonNull(amqoVar3);
            ampvVar.f = amqoVar3;
            ampvVar.b |= 8;
            defpackage.ajcq ajcqVarAs = this.l.as();
            defpackage.rml rmlVar = new defpackage.rml(this, akzxVarH, rmwVar, 3);
            defpackage.ajct ajctVar = this.d;
            long j = defpackage.ahqx.a;
            defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), rmlVar);
            int i = defpackage.ajan.c;
            defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarAs, ahqvVar);
            ajcqVarAs.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
            this.h.g(ajamVar, 10L, java.util.concurrent.TimeUnit.SECONDS);
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rlv
    public final void o(defpackage.rmx rmxVar) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(733, rmxVar.name(), defpackage.ahot.a, true);
        try {
            defpackage.akzx akzxVarH = H();
            defpackage.akzx akzxVarU = defpackage.ttj.U(this.f.a());
            akzxVarU.u();
            defpackage.amqo amqoVar = (defpackage.amqo) akzxVarU.b;
            defpackage.amqo amqoVar2 = defpackage.amqo.a;
            amqoVar.d = rmxVar.Bo;
            amqoVar.b |= 2;
            akzxVarH.u();
            defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
            defpackage.amqo amqoVar3 = (defpackage.amqo) akzxVarU.r();
            defpackage.ampv ampvVar2 = defpackage.ampv.a;
            j$.util.Objects.requireNonNull(amqoVar3);
            ampvVar.f = amqoVar3;
            ampvVar.b |= 8;
            defpackage.ajcq ajcqVarAs = this.l.as();
            defpackage.rml rmlVar = new defpackage.rml(this, akzxVarH, rmxVar, 2);
            defpackage.ajct ajctVar = this.d;
            long j = defpackage.ahqx.a;
            defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), rmlVar);
            int i = defpackage.ajan.c;
            defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarAs, ahqvVar);
            ajcqVarAs.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
            this.h.g(ajamVar, 10L, java.util.concurrent.TimeUnit.SECONDS);
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rlv
    public final void p(defpackage.rmx rmxVar, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(734, rmxVar.name(), defpackage.ahot.a, true);
        try {
            defpackage.akzx akzxVarU = defpackage.ttj.U(this.f.a());
            akzxVarU.u();
            defpackage.amqo amqoVar = (defpackage.amqo) akzxVarU.b;
            defpackage.amqo amqoVar2 = defpackage.amqo.a;
            amqoVar.d = rmxVar.Bo;
            amqoVar.b |= 2;
            if (optional.isPresent() || optional2.isPresent() || optional3.isPresent()) {
                defpackage.akzx akzxVarM = defpackage.ampu.a.m();
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.jyv jyvVar = new defpackage.jyv(akzxVarM, 13);
                if (true == optional.isPresent()) {
                    java.lang.Object obj = optional.get();
                    java.lang.Object obj2 = jyvVar.a;
                    int iIntValue = ((java.lang.Integer) obj).intValue();
                    ((defpackage.akzx) obj2).u();
                    defpackage.ampu ampuVar = (defpackage.ampu) ((defpackage.akzx) obj2).b;
                    ampuVar.b |= 2;
                    ampuVar.d = iIntValue;
                }
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.jyv jyvVar2 = new defpackage.jyv(akzxVarM, 10);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj3 = optional2.get();
                    java.lang.Object obj4 = jyvVar2.a;
                    int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                    ((defpackage.akzx) obj4).u();
                    defpackage.ampu ampuVar2 = (defpackage.ampu) ((defpackage.akzx) obj4).b;
                    ampuVar2.b |= 1;
                    ampuVar2.c = iIntValue2;
                }
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.jyv jyvVar3 = new defpackage.jyv(akzxVarM, 11);
                if (true == optional3.isPresent()) {
                    java.lang.Object obj5 = optional3.get();
                    java.lang.Object obj6 = jyvVar3.a;
                    int iIntValue3 = ((java.lang.Integer) obj5).intValue();
                    ((defpackage.akzx) obj6).u();
                    defpackage.ampu ampuVar3 = (defpackage.ampu) ((defpackage.akzx) obj6).b;
                    ampuVar3.b |= 4;
                    ampuVar3.e = iIntValue3;
                }
                akzxVarU.u();
                defpackage.amqo amqoVar3 = (defpackage.amqo) akzxVarU.b;
                defpackage.ampu ampuVar4 = (defpackage.ampu) akzxVarM.r();
                j$.util.Objects.requireNonNull(ampuVar4);
                amqoVar3.i = ampuVar4;
                amqoVar3.b |= 64;
            }
            defpackage.akzx akzxVarH = H();
            akzxVarH.u();
            defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
            defpackage.amqo amqoVar4 = (defpackage.amqo) akzxVarU.r();
            defpackage.ampv ampvVar2 = defpackage.ampv.a;
            j$.util.Objects.requireNonNull(amqoVar4);
            ampvVar.f = amqoVar4;
            ampvVar.b |= 8;
            defpackage.ajcq ajcqVarAs = this.l.as();
            defpackage.rml rmlVar = new defpackage.rml(this, akzxVarH, rmxVar, 0);
            defpackage.ajct ajctVar = this.d;
            long j = defpackage.ahqx.a;
            defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), rmlVar);
            int i = defpackage.ajan.c;
            defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarAs, ahqvVar);
            ajcqVarAs.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
            this.h.g(ajamVar, 10L, java.util.concurrent.TimeUnit.SECONDS);
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rlv
    public final void q(defpackage.amqt amqtVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amqtVar);
        ampvVar.p = amqtVar;
        ampvVar.b |= 536870912;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void r(defpackage.amqy amqyVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amqyVar);
        ampvVar.u = amqyVar;
        ampvVar.c |= 4;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void s(defpackage.amrh amrhVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amrhVar);
        ampvVar.i = amrhVar;
        ampvVar.b |= 131072;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void t(defpackage.amrm amrmVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amrmVar);
        ampvVar.y = amrmVar;
        ampvVar.c |= 256;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void u(defpackage.amrp amrpVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amrpVar);
        ampvVar.I = amrpVar;
        ampvVar.c |= 1048576;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void v(defpackage.amrq amrqVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amrqVar);
        ampvVar.o = amrqVar;
        ampvVar.b |= 268435456;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void w(defpackage.amru amruVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amruVar);
        ampvVar.v = amruVar;
        ampvVar.c |= 32;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void x(defpackage.amrw amrwVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amrwVar);
        ampvVar.j = amrwVar;
        ampvVar.b |= 1048576;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void y(defpackage.amry amryVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amryVar);
        ampvVar.n = amryVar;
        ampvVar.b |= 134217728;
        G((defpackage.ampv) akzxVarH.r());
    }

    @Override // defpackage.rlv
    public final void z(defpackage.amsa amsaVar) {
        defpackage.akzx akzxVarH = H();
        akzxVarH.u();
        defpackage.ampv ampvVar = (defpackage.ampv) akzxVarH.b;
        defpackage.ampv ampvVar2 = defpackage.ampv.a;
        j$.util.Objects.requireNonNull(amsaVar);
        ampvVar.z = amsaVar;
        ampvVar.c |= 1024;
        G((defpackage.ampv) akzxVarH.r());
    }
}
