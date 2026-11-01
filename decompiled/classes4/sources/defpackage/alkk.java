package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkk implements defpackage.allg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/FlowSignalsProcessor");
    public final defpackage.aljq b;
    public final defpackage.alqf g;
    private final defpackage.allj h;
    private boolean l;
    private j$.util.Optional m;
    private j$.util.Optional n;
    private j$.util.Optional o;
    private boolean p;
    private boolean t;
    private boolean v;
    private java.lang.Boolean w;
    private final java.util.List i = new java.util.ArrayList();
    private final java.util.List j = new java.util.ArrayList();
    public j$.time.Duration c = j$.time.Duration.ZERO;
    private j$.util.Optional k = j$.util.Optional.empty();
    private j$.time.Duration q = j$.time.Duration.ofMillis(1500);
    private j$.time.Duration r = j$.time.Duration.ofSeconds(3);
    private java.lang.String s = "";
    public j$.time.Duration d = j$.time.Duration.ofMillis(1500);
    private j$.time.Duration u = j$.time.Duration.ofSeconds(3);
    public java.lang.String e = "";
    private boolean x = false;
    private java.lang.String y = "";
    public java.lang.String f = "";

    public alkk(defpackage.alli alliVar, defpackage.alqf alqfVar, defpackage.aljq aljqVar) {
        this.h = alliVar.a(defpackage.allh.i.name());
        this.g = alqfVar;
        this.b = aljqVar;
    }

    private final aify l(alqu alquVar) {
        return (aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(this.j), j$.util.stream.Stream.-CC.of(alquVar)).collect(aido.a);
    }

    private final j$.util.Optional m(java.lang.String str) {
        return j$.util.Collection.-EL.stream(this.i).filter(new abdh(str, 20)).map(new defpackage.alki(0)).findFirst();
    }

    private final void n() {
        this.g.d(this.e);
        this.e = "";
    }

    private final void o() {
        this.g.d(this.s);
        this.s = "";
    }

    private final void p() {
        if (this.w.booleanValue()) {
            this.q = this.r;
            this.d = this.u;
        }
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_END_SAY_TIMING, defpackage.alnb.EVENT_AUDIO_TICK, defpackage.alnb.EVENT_ENDPOINT_SPEECH_START, defpackage.alnb.EVENT_SAY, new defpackage.alnb[]{defpackage.alnb.EVENT_RINGING_ENDED, defpackage.alnb.EVENT_QUICK_REPLY_CHIP_CLICKED, defpackage.alnb.EVENT_FLOW_OUTPUT});
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        this.b.c(almzVar);
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        int i = 2;
        if (iOrdinal == 1) {
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alnj.f;
            almzVar3.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar3).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            alqu alquVar = ((defpackage.alnj) objJ).c;
            if (alquVar == null) {
                alquVar = alqu.a;
            }
            int i2 = alquVar.c;
            if ((i2 == 1 || i2 == 2) && !defpackage.alph.c(alquVar)) {
                java.lang.String str = almyVar.e;
                this.y = str;
                if (alquVar.c == 1) {
                    this.x = false;
                    this.f = str;
                }
            }
            if (alquVar.c == 1) {
                this.i.add(almyVar);
                if (defpackage.alph.c(alquVar)) {
                    this.y = this.f;
                    this.x = false;
                }
            }
            if (this.p && alquVar.c == 2) {
                o();
            }
            if (this.t && (defpackage.alph.c(alquVar) || alquVar.c == 1)) {
                n();
            }
            if (alquVar.c != 1 || this.l) {
                return;
            }
            j$.util.Optional optional = this.k;
            whq whqVar = new whq(this, almyVar, 4);
            if (true == optional.isPresent()) {
                ((defpackage.alkk) whqVar.a).j((defpackage.almy) whqVar.b, (defpackage.almi) optional.get());
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            defpackage.alqf alqfVar = this.g;
            alqfVar.a(this.s);
            this.s = "";
            akzx akzxVarM = defpackage.alng.a.m();
            j$.util.Optional optionalM = m(almyVar.f);
            whq whqVar2 = new whq(this, akzxVarM, 5, (byte[]) null);
            if (true == optionalM.isPresent()) {
                java.lang.Object obj = optionalM.get();
                ((defpackage.alkk) whqVar2.b).k((akzx) whqVar2.a, (defpackage.almz) obj);
            }
            defpackage.alkj alkjVar = new defpackage.alkj(akzxVarM, almyVar);
            if (this.p) {
                j$.util.Optional optionalM2 = m(almyVar.f);
                if (true == optionalM2.isPresent()) {
                    defpackage.almz almzVar4 = (defpackage.almz) optionalM2.get();
                    apdi apdiVar2 = defpackage.alnj.f;
                    almzVar4.c(apdiVar2);
                    java.lang.Object objJ2 = ((alaa) almzVar4).n.j((alac) apdiVar2.a);
                    if (objJ2 == null) {
                        objJ2 = apdiVar2.b;
                    } else {
                        apdiVar2.c(objJ2);
                    }
                    alqu alquVar2 = ((defpackage.alnj) objJ2).c;
                    if (alquVar2 == null) {
                        alquVar2 = alqu.a;
                    }
                    optionalM2 = j$.util.Optional.ofNullable(aizp.a(alquVar2.f));
                }
                defpackage.xbz xbzVar = new defpackage.xbz(this, 9);
                if (true == optionalM2.isPresent()) {
                    optionalM2 = j$.util.Optional.ofNullable(j$.time.Duration.between((j$.time.Instant) optionalM2.get(), j$.time.Instant.ofEpochMilli(((defpackage.alkk) xbzVar.a).c.toMillis())));
                }
                if (optionalM2.isPresent()) {
                    try {
                        this.s = alqfVar.c(new defpackage.alkh(this, i), alkjVar, this.q.minus((j$.time.Duration) optionalM2.get()));
                        return;
                    } catch (defpackage.aljs e) {
                        a.by(a.c(), "Setting a timer to publish a FlowSignals event failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/FlowSignalsProcessor", "consumeIntentExtractionEvent", (char) 331, "FlowSignalsProcessor.java", e);
                        return;
                    }
                }
            }
            c(alkjVar);
            return;
        }
        if (iOrdinal == 4) {
            defpackage.almz almzVar5 = almyVar.h;
            if (almzVar5 == null) {
                almzVar5 = defpackage.almz.a;
            }
            apdi apdiVar3 = defpackage.alnf.k;
            almzVar5.c(apdiVar3);
            java.lang.Object objJ3 = ((alaa) almzVar5).n.j((alac) apdiVar3.a);
            if (objJ3 == null) {
                objJ3 = apdiVar3.b;
            } else {
                apdiVar3.c(objJ3);
            }
            defpackage.alsy alsyVarB = defpackage.alsy.b(((defpackage.alnf) objJ3).g);
            if (alsyVarB == null) {
                alsyVarB = defpackage.alsy.NO_ACTION;
            }
            if (alsyVarB.equals(defpackage.alsy.START_TAKING_MESSAGE)) {
                p();
                return;
            }
            return;
        }
        if (iOrdinal == 12) {
            if (this.l || !this.m.isEmpty()) {
                return;
            }
            this.m = j$.util.Optional.of(j$.time.Instant.ofEpochMilli(this.c.toMillis()));
            j$.util.Optional optional2 = this.k;
            whq whqVar3 = new whq(this, almyVar, 6);
            if (true == optional2.isPresent()) {
                ((defpackage.alkk) whqVar3.a).i((defpackage.almy) whqVar3.b, (defpackage.almi) optional2.get());
                return;
            }
            return;
        }
        if (iOrdinal != 20) {
            if (iOrdinal == 26) {
                if (this.p && this.v) {
                    this.x = true;
                    o();
                    return;
                }
                return;
            }
            if (iOrdinal != 35) {
                if (iOrdinal == 83) {
                    defpackage.almz almzVar6 = almyVar.h;
                    if (almzVar6 == null) {
                        almzVar6 = defpackage.almz.a;
                    }
                    apdi apdiVar4 = defpackage.almf.b;
                    almzVar6.c(apdiVar4);
                    java.lang.Object objJ4 = ((alaa) almzVar6).n.j((alac) apdiVar4.a);
                    if (objJ4 == null) {
                        objJ4 = apdiVar4.b;
                    } else {
                        apdiVar4.c(objJ4);
                    }
                    this.c = j$.time.Duration.ofMillis(((defpackage.aljk) objJ4).b);
                    return;
                }
                return;
            }
        }
        p();
    }

    public final void c(defpackage.alkj alkjVar) {
        defpackage.almy almyVar = alkjVar.a;
        int i = 0;
        boolean z = !this.v ? almyVar.f.equals(this.y) : !this.x && almyVar.f.equals(this.y);
        if (!z || !this.t) {
            h(alkjVar, z);
            return;
        }
        try {
            defpackage.allj alljVar = this.h;
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_POSSIBLY_INCOMPLETE;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
            alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
            n();
            this.e = this.g.c(new defpackage.alkh(this, i), alkjVar, this.d);
        } catch (defpackage.aljs e) {
            a.by(a.c(), "Setting a timer to publish a possibly incomplete IntentExtraction event failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/FlowSignalsProcessor", "checkCompletnessAndPublishFlowSignalsEvent", (char) 484, "FlowSignalsProcessor.java", e);
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.s = "";
        this.p = almlVar.h;
        if ((almlVar.b & 16) != 0) {
            akzm akzmVar = almlVar.i;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            this.q = ajsz.dJ(akzmVar);
        }
        if ((almlVar.b & 32) != 0) {
            akzm akzmVar2 = almlVar.j;
            if (akzmVar2 == null) {
                akzmVar2 = akzm.a;
            }
            this.r = ajsz.dJ(akzmVar2);
        }
        this.v = almlVar.m;
        this.c = j$.time.Duration.ZERO;
        this.x = false;
        this.y = "";
        this.f = "";
        this.j.clear();
        int i = almlVar.c;
        if (i == 13) {
            this.k = j$.util.Optional.of(i == 13 ? (defpackage.almi) almlVar.d : defpackage.almi.a);
        }
        this.m = j$.util.Optional.empty();
        this.n = j$.util.Optional.empty();
        this.o = j$.util.Optional.empty();
        if ((almlVar.b & 512) != 0) {
            this.t = almlVar.o;
        } else {
            apdi apdiVar = defpackage.alyb.n;
            almlVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) almlVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            this.t = ((defpackage.alyb) objJ).h;
        }
        if ((almlVar.b & 1024) != 0) {
            akzm akzmVar3 = almlVar.p;
            if (akzmVar3 == null) {
                akzmVar3 = akzm.a;
            }
            this.d = ajsz.dJ(akzmVar3);
        }
        if ((almlVar.b & 2048) != 0) {
            akzm akzmVar4 = almlVar.q;
            if (akzmVar4 == null) {
                akzmVar4 = akzm.a;
            }
            this.u = ajsz.dJ(akzmVar4);
        }
        apdi apdiVar2 = defpackage.alwn.r;
        alqkVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) alqkVar).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        this.w = java.lang.Boolean.valueOf(((defpackage.alwn) objJ2).d);
    }

    public final /* synthetic */ void g(defpackage.almz almzVar) {
        apdi apdiVar = defpackage.alnj.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        alqu alquVar = ((defpackage.alnj) objJ).c;
        if (alquVar == null) {
            alquVar = alqu.a;
        }
        this.j.add(alquVar);
    }

    public final void h(defpackage.alkj alkjVar, boolean z) {
        defpackage.almy almyVar = alkjVar.a;
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnm.i;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alnm alnmVar = (defpackage.alnm) objJ;
        if (!alnmVar.f) {
            java.lang.String str = almyVar.f;
            if (z) {
                j$.util.Optional optionalM = m(str);
                defpackage.alju aljuVar = new defpackage.alju(this, 9);
                if (true == optionalM.isPresent()) {
                    ((defpackage.alkk) aljuVar.a).g((defpackage.almz) optionalM.get());
                }
            } else {
                this.j.clear();
            }
        }
        defpackage.allj alljVar = this.h;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_SIGNALS;
        akzzVarM.u();
        defpackage.almz almzVar2 = akzzVarM.b;
        almzVar2.c = alnbVar.aN;
        almzVar2.b |= 1;
        akzx akzxVar = alkjVar.b;
        apdi apdiVar2 = defpackage.alng.f;
        akzxVar.u();
        defpackage.alng alngVar = (defpackage.alng) akzxVar.b;
        alngVar.b |= 4;
        alngVar.d = z;
        boolean z2 = alnmVar.f;
        akzxVar.u();
        defpackage.alng alngVar2 = (defpackage.alng) akzxVar.b;
        alngVar2.b |= 8;
        alngVar2.e = z2;
        akzzVarM.bV(apdiVar2, (defpackage.alng) akzxVar.p());
        alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final void i(defpackage.almy almyVar, defpackage.almi almiVar) {
        if (this.n.isEmpty() || this.o.isEmpty() || this.m.isEmpty()) {
            return;
        }
        j$.time.Duration durationBetween = j$.time.Duration.between((j$.time.temporal.Temporal) this.n.get(), (j$.time.temporal.Temporal) this.o.get());
        j$.time.Duration durationBetween2 = j$.time.Duration.between((j$.time.temporal.Temporal) this.n.get(), (j$.time.temporal.Temporal) this.m.get());
        akzm akzmVar = almiVar.b;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        if (durationBetween.compareTo(ajsz.dJ(akzmVar)) >= 0) {
            if (((j$.time.Instant) this.n.get()).isBefore((j$.time.Instant) this.m.get())) {
                akzm akzmVar2 = almiVar.c;
                if (akzmVar2 == null) {
                    akzmVar2 = akzm.a;
                }
                if (durationBetween2.compareTo(ajsz.dJ(akzmVar2)) >= 0) {
                    defpackage.allj alljVar = this.h;
                    akzz akzzVarM = defpackage.almz.a.m();
                    defpackage.alnb alnbVar = defpackage.alnb.EVENT_ROBOCALL_DETECTED;
                    akzzVarM.u();
                    defpackage.almz almzVar = akzzVarM.b;
                    almzVar.c = alnbVar.aN;
                    almzVar.b |= 1;
                    alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
                    this.l = true;
                }
            }
        }
    }

    public final void j(defpackage.almy almyVar, defpackage.almi almiVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnj.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        alqu alquVar = ((defpackage.alnj) objJ).c;
        if (alquVar == null) {
            alquVar = alqu.a;
        }
        aify aifyVarL = l(alquVar);
        if (defpackage.alph.e(aifyVarL)) {
            return;
        }
        this.n = j$.util.Optional.of(aizp.a(((alqu) aifyVarL.get(0)).e));
        this.o = j$.util.Optional.of(aizp.a(alquVar.f));
        i(almyVar, almiVar);
    }

    public final /* synthetic */ void k(akzx akzxVar, defpackage.almz almzVar) {
        apdi apdiVar = defpackage.alnj.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        alqu alquVar = ((defpackage.alnj) objJ).c;
        if (alquVar == null) {
            alquVar = alqu.a;
        }
        boolean zE = defpackage.alph.e(l(alquVar));
        akzxVar.u();
        defpackage.alng alngVar = (defpackage.alng) akzxVar.b;
        defpackage.alng alngVar2 = defpackage.alng.a;
        alngVar.b |= 2;
        alngVar.c = zE;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
