package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amfc implements defpackage.aluc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public amfc(defpackage.alje aljeVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljeVar);
        this.a = aljeVar;
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [alle, java.lang.Object] */
    @Override // defpackage.aluc
    public final void a(defpackage.alsi alsiVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                defpackage.alje aljeVar = (defpackage.alje) this.a;
                aljeVar.h.b(alsiVar, aljeVar.b.a());
                aljeVar.c.b(new achb(alsiVar, 17));
                return;
            }
            apdi apdiVar = defpackage.amah.e;
            alsiVar.c(apdiVar);
            akzs akzsVar = ((alaa) alsiVar).n;
            alac alacVar = (alac) apdiVar.a;
            if (akzsVar.l(alacVar)) {
                java.lang.Object obj = this.a;
                akzz akzzVarM = defpackage.almz.a.m();
                defpackage.alnb alnbVar = defpackage.alnb.EVENT_AUDIO_DETECTION;
                akzzVarM.u();
                defpackage.almz almzVar = akzzVarM.b;
                almzVar.c = alnbVar.aN;
                almzVar.b |= 1;
                apdi apdiVar2 = defpackage.almc.b;
                alsiVar.c(apdiVar);
                java.lang.Object objJ = ((alaa) alsiVar).n.j(alacVar);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                defpackage.amfh amfhVar = (defpackage.amfh) obj;
                defpackage.allj alljVar = amfhVar.a;
                akzzVarM.bV(apdiVar2, (defpackage.amah) objJ);
                alljVar.a((defpackage.almz) akzzVarM.p(), amfhVar.d);
            }
            j$.util.Optional optional = ((defpackage.amfh) this.a).c;
            defpackage.amdj amdjVar = new defpackage.amdj(alsiVar, 5);
            if (true == optional.isPresent()) {
                optional.get().a(amdjVar.a);
                return;
            }
            return;
        }
        defpackage.amfd amfdVar = (defpackage.amfd) this.a;
        amfdVar.e.b(alsiVar, amfdVar.g);
        apdi apdiVar3 = defpackage.amah.e;
        alsiVar.c(apdiVar3);
        akzs akzsVar2 = ((alaa) alsiVar).n;
        alac alacVar2 = (alac) apdiVar3.a;
        if (akzsVar2.l(alacVar2)) {
            alsiVar.c(apdiVar3);
            java.lang.Object objJ2 = ((alaa) alsiVar).n.j(alacVar2);
            if (objJ2 == null) {
                objJ2 = apdiVar3.b;
            } else {
                apdiVar3.c(objJ2);
            }
            defpackage.amag amagVarB = defpackage.amag.b(((defpackage.amah) objJ2).c);
            if (amagVarB == null) {
                amagVarB = defpackage.amag.NOTIFY_USER;
            }
            defpackage.amfd.b.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingResultHandler$AgentEventListener", "onOutboundEvent", 522, "VisualCallingResultHandler.java").y("Got event from HoldDetectionHandler: %s", amagVarB);
            if (amagVarB == defpackage.amag.NOTIFY_USER && amfdVar.c) {
                alsiVar.c(apdiVar3);
                java.lang.Object objJ3 = ((alaa) alsiVar).n.j(alacVar2);
                if (objJ3 == null) {
                    objJ3 = apdiVar3.b;
                } else {
                    apdiVar3.c(objJ3);
                }
                akzm akzmVar = ((defpackage.amah) objJ3).d;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                amfdVar.k(defpackage.amfd.l(amfdVar.d.a(), 2, ajsz.dH(ajsz.dJ(akzmVar).plus(ajsz.dJ(defpackage.amfd.a)))), true);
                return;
            }
            if (amagVarB == defpackage.amag.HOLD_DETECTED && amfdVar.f) {
                amfdVar.j = 2;
                amfdVar.k(defpackage.amfd.m(amfdVar.d.a(), amfdVar.j), true);
                return;
            }
            if (amagVarB == defpackage.amag.CONNECTING_TO_AGENT && amfdVar.f) {
                amfdVar.k(defpackage.amfd.l(amfdVar.d.a(), 3, aldf.a), true);
                return;
            }
            if (amagVarB == defpackage.amag.MUSIC_STARTED && amfdVar.i) {
                amfdVar.a(true);
            } else if (amagVarB == defpackage.amag.MUSIC_STOPPED && amfdVar.i) {
                amfdVar.a(false);
            }
        }
    }

    @Override // defpackage.aluc
    public final void b(java.lang.String str) {
        if (this.$cid == 1) {
            defpackage.alje aljeVar = (defpackage.alje) this.a;
            defpackage.aljg aljgVar = aljeVar.b;
            defpackage.amgv amgvVar = aljeVar.h;
            int iA = aljgVar.a();
            akzx akzxVarM = defpackage.altn.a.m();
            akzxVarM.u();
            defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            altnVar.b = 11;
            altnVar.c = str;
            amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(iA));
            aljeVar.c.c(aljeVar.f, str);
        }
    }

    public amfc(defpackage.amfd amfdVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(amfdVar);
        this.a = amfdVar;
    }

    public amfc(defpackage.amfh amfhVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(amfhVar);
        this.a = amfhVar;
    }
}
