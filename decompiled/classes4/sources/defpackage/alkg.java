package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkg implements defpackage.allg {
    private static final aihd a = aihd.v(defpackage.alnb.EVENT_SAY_INITIATED_TIMING, defpackage.alnb.EVENT_END_SAY_TIMING, defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_AUDIO_TICK, defpackage.alnb.EVENT_RINGING_STARTED, defpackage.alnb.EVENT_RINGING_ENDED, new defpackage.alnb[]{defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING});
    private final defpackage.allj b;
    private boolean c;
    private boolean d = false;
    private boolean e = false;
    private j$.util.Optional f = j$.util.Optional.empty();
    private j$.time.Instant g = j$.time.Instant.EPOCH;
    private j$.time.Instant h = j$.time.Instant.EPOCH;
    private j$.time.Instant i = j$.time.Instant.EPOCH;
    private j$.time.Instant j = j$.time.Instant.EPOCH;
    private j$.time.Instant k = j$.time.Instant.EPOCH;
    private j$.time.Duration l = j$.time.Duration.ZERO;

    public alkg(defpackage.alli alliVar) {
        this.b = alliVar.a(defpackage.allh.h.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return a;
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        boolean zIsBefore = false;
        if (iOrdinal != 1) {
            if (iOrdinal != 31) {
                if (iOrdinal == 83) {
                    defpackage.almz almzVar2 = almyVar.h;
                    if (almzVar2 == null) {
                        almzVar2 = defpackage.almz.a;
                    }
                    apdi apdiVar = defpackage.almf.b;
                    almzVar2.c(apdiVar);
                    java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
                    if (objJ == null) {
                        objJ = apdiVar.b;
                    } else {
                        apdiVar.c(objJ);
                    }
                    this.k = j$.time.Instant.ofEpochMilli(((defpackage.aljk) objJ).b);
                    return;
                }
                if (iOrdinal == 11) {
                    if (this.f.isEmpty()) {
                        this.f = j$.util.Optional.of(this.k);
                    }
                    this.d = true;
                    this.g = this.k;
                    return;
                }
                if (iOrdinal == 12) {
                    this.h = this.k;
                    this.d = false;
                    return;
                }
                if (iOrdinal == 19) {
                    this.e = true;
                    this.i = this.k;
                    return;
                } else if (iOrdinal != 20) {
                    defpackage.almz almzVar3 = almyVar.h;
                    if (almzVar3 == null) {
                        almzVar3 = defpackage.almz.a;
                    }
                    defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar3.c);
                    if (alnbVarB2 == null) {
                        alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
                    }
                    throw new java.lang.UnsupportedOperationException(java.lang.String.format("Consumed event type %s is unsupported in this processor", alnbVarB2.name()));
                }
            }
            this.j = this.k;
            this.e = false;
            return;
        }
        defpackage.almz almzVar4 = almyVar.h;
        if (almzVar4 == null) {
            almzVar4 = defpackage.almz.a;
        }
        apdi apdiVar2 = defpackage.alnj.f;
        almzVar4.c(apdiVar2);
        akzs akzsVar = ((alaa) almzVar4).n;
        alac alacVar = (alac) apdiVar2.a;
        java.lang.Object objJ2 = akzsVar.j(alacVar);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        alqu alquVar = ((defpackage.alnj) objJ2).c;
        if (alquVar == null) {
            alquVar = alqu.a;
        }
        if (alquVar.c == 1) {
            akzx akzxVarM = defpackage.alpd.a.m();
            defpackage.almz almzVar5 = almyVar.h;
            if (almzVar5 == null) {
                almzVar5 = defpackage.almz.a;
            }
            almzVar5.c(apdiVar2);
            java.lang.Object objJ3 = ((alaa) almzVar5).n.j(alacVar);
            if (objJ3 == null) {
                objJ3 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ3);
            }
            alqu alquVar2 = ((defpackage.alnj) objJ3).c;
            if (alquVar2 == null) {
                alquVar2 = alqu.a;
            }
            j$.time.Instant instantA = aizp.a(alquVar2.f);
            if (this.d) {
                zIsBefore = this.g.isBefore(instantA);
            } else if (this.e) {
                zIsBefore = this.i.isBefore(instantA);
            } else if ((this.c && (this.f.isEmpty() || ((j$.time.Instant) this.f.get()).isAfter(instantA))) || this.h.plus(this.l).isAfter(instantA) || this.j.plus(this.l).isAfter(instantA)) {
                zIsBefore = true;
            }
            akzxVarM.u();
            defpackage.alpd alpdVar = (defpackage.alpd) akzxVarM.b;
            alpdVar.b |= 1;
            alpdVar.c = zIsBefore;
            defpackage.alpd alpdVar2 = (defpackage.alpd) akzxVarM.p();
            defpackage.allj alljVar = this.b;
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_EXTRACTION_TIMING_SIGNALS;
            akzzVarM.u();
            defpackage.almz almzVar6 = akzzVarM.b;
            almzVar6.c = alnbVar.aN;
            almzVar6.b |= 1;
            akzzVarM.bV(defpackage.alpd.d, alpdVar2);
            alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        akzm akzmVar = almlVar.l;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        this.l = ajsz.dJ(akzmVar);
        this.c = almlVar.x;
        this.g = j$.time.Instant.EPOCH;
        this.h = j$.time.Instant.EPOCH;
        this.k = j$.time.Instant.EPOCH;
        this.d = false;
        this.e = false;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
