package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzp implements defpackage.aljv {
    private final /* synthetic */ int $cid;
    private final defpackage.aljz a;
    private final defpackage.allj b;
    private j$.util.Optional c = j$.util.Optional.empty();

    public alzp(defpackage.aljz aljzVar, defpackage.alli alliVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = aljzVar;
        this.b = alliVar.a(defpackage.allh.S.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aihd.s(defpackage.alnb.EVENT_EXPERIMENT_SUMMARY, defpackage.alnb.EVENT_CALL_MENU_STATE, defpackage.alnb.EVENT_CALL_MENU_STATE_PARSING_RESULT) : aihd.u(defpackage.alnb.EVENT_EXPERIMENT_SUMMARY, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_STATE_UPDATE, defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_STOP_BOT_SPEECH);
        }
        return aihd.v(defpackage.alnb.EVENT_EXPERIMENT_SUMMARY, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_STATE_UPDATE, defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_ROBOCALL_DETECTED, defpackage.alnb.EVENT_STOP_BOT_SPEECH, new defpackage.alnb[]{defpackage.alnb.EVENT_SPAM_AUDIO_MATCH, defpackage.alnb.EVENT_COMPACT_MODEL_OUTPUT});
    }

    @Override // defpackage.allg
    public final /* synthetic */ void b(defpackage.almy almyVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.alpv.k(this, almyVar);
        } else if (i != 1) {
            defpackage.alpv.k(this, almyVar);
        } else {
            defpackage.alpv.k(this, almyVar);
        }
    }

    @Override // defpackage.aljv
    public final defpackage.alsi c(defpackage.almy almyVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                defpackage.almz almzVar = almyVar.h;
                if (almzVar == null) {
                    almzVar = defpackage.almz.a;
                }
                defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
                if (alnbVarB == null) {
                    alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                }
                defpackage.aljz aljzVar = this.a;
                int iOrdinal = alnbVarB.ordinal();
                if (iOrdinal == 5) {
                    return defpackage.aknx.C(almyVar, ((defpackage.alzq) aljzVar).a);
                }
                if (iOrdinal != 33) {
                    return iOrdinal != 36 ? defpackage.alsi.a : defpackage.aknx.y(almzVar, ((defpackage.alzq) aljzVar).b);
                }
                return defpackage.aknx.w();
            }
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.almr.b;
            almzVar2.c(apdiVar);
            akzs akzsVar = ((alaa) almzVar2).n;
            alac alacVar = (alac) apdiVar.a;
            if (!akzsVar.l(alacVar)) {
                defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
                if (alnbVarB2 == null) {
                    alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
                }
                return alnbVarB2.equals(defpackage.alnb.EVENT_EXPERIMENT_SUMMARY) ? defpackage.aknx.x(almzVar2) : defpackage.alsi.a;
            }
            akzz akzzVarM = defpackage.alsi.a.m();
            apdi apdiVar2 = defpackage.amgq.g;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            akzzVarM.bV(apdiVar2, (defpackage.amgq) objJ);
            return akzzVarM.p();
        }
        defpackage.almz almzVar3 = almyVar.h;
        if (almzVar3 == null) {
            almzVar3 = defpackage.almz.a;
        }
        apdi apdiVar3 = defpackage.alox.b;
        almzVar3.c(apdiVar3);
        if (((alaa) almzVar3).n.l((alac) apdiVar3.a)) {
            return anty.aG(almzVar3);
        }
        defpackage.alnb alnbVarB3 = defpackage.alnb.b(almzVar3.c);
        if (alnbVarB3 == null) {
            alnbVarB3 = defpackage.alnb.EVENT_UNKNOWN;
        }
        defpackage.aljz aljzVar2 = this.a;
        int iOrdinal2 = alnbVarB3.ordinal();
        if (iOrdinal2 == 2) {
            return defpackage.aknx.o(almyVar);
        }
        if (iOrdinal2 == 5) {
            return defpackage.aknx.C(almyVar, ((defpackage.alzq) aljzVar2).a);
        }
        if (iOrdinal2 == 30) {
            return defpackage.aknx.v();
        }
        if (iOrdinal2 == 33) {
            return defpackage.aknx.w();
        }
        if (iOrdinal2 == 36) {
            return defpackage.aknx.y(almzVar3, ((defpackage.alzq) aljzVar2).b);
        }
        if (iOrdinal2 != 40) {
            return iOrdinal2 != 79 ? defpackage.alsi.a : defpackage.aknx.B(almyVar);
        }
        defpackage.almz almzVar4 = almyVar.h;
        if (almzVar4 == null) {
            almzVar4 = defpackage.almz.a;
        }
        apdi apdiVar4 = defpackage.alot.c;
        almzVar4.c(apdiVar4);
        java.lang.Object objJ2 = ((alaa) almzVar4).n.j((alac) apdiVar4.a);
        if (objJ2 == null) {
            objJ2 = apdiVar4.b;
        } else {
            apdiVar4.c(objJ2);
        }
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.alot) objJ2).b).map(new defpackage.alyz(19)).flatMap(new defpackage.alyz(20)).map(new defpackage.alzr(1)).collect(aido.a);
        akzz akzzVarM2 = defpackage.alsi.a.m();
        apdi apdiVar5 = defpackage.alwp.b;
        akzz akzzVarM3 = defpackage.alwp.a.m();
        apdi apdiVar6 = defpackage.alwg.c;
        akzx akzxVarM = defpackage.alwg.a.m();
        akzxVarM.aS(aifyVar);
        akzzVarM3.bV(apdiVar6, (defpackage.alwg) akzxVarM.p());
        akzzVarM2.bV(apdiVar5, akzzVarM3.p());
        return akzzVarM2.p();
    }

    @Override // defpackage.aljv
    public final void g(defpackage.alro alroVar) {
        int i = this.$cid;
        if (i == 0) {
            this.b.b(this.a.a(alroVar));
            return;
        }
        defpackage.aljz aljzVar = this.a;
        if (i != 1) {
            this.b.b(aljzVar.a(alroVar));
        } else {
            this.b.b(aljzVar.a(alroVar));
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [alle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [alle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [alle, java.lang.Object] */
    @Override // defpackage.aljv
    public final void h(defpackage.alsi alsiVar) {
        int i = this.$cid;
        if (i == 0) {
            j$.util.Optional optional = this.c;
            defpackage.alui aluiVar = new defpackage.alui(alsiVar, 13);
            if (true == optional.isPresent()) {
                optional.get().a(aluiVar.a);
                return;
            }
            return;
        }
        j$.util.Optional optional2 = this.c;
        if (i != 1) {
            defpackage.amdj amdjVar = new defpackage.amdj(alsiVar, 6);
            if (true == optional2.isPresent()) {
                optional2.get().a(amdjVar.a);
                return;
            }
            return;
        }
        defpackage.alui aluiVar2 = new defpackage.alui(alsiVar, 3);
        if (true == optional2.isPresent()) {
            optional2.get().a(aluiVar2.a);
        }
    }

    @Override // defpackage.aljv
    public final void i(java.lang.String str) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.alzq) this.a).a = j$.util.Optional.of(str);
        } else if (i == 1) {
            ((defpackage.alzq) this.a).a = j$.util.Optional.of(str);
        }
    }

    @Override // defpackage.aljv
    public final void j(defpackage.alle alleVar) {
        int i = this.$cid;
        if (i == 0) {
            this.c = j$.util.Optional.of(alleVar);
        } else if (i != 1) {
            this.c = j$.util.Optional.of(alleVar);
        } else {
            this.c = j$.util.Optional.of(alleVar);
        }
    }

    public alzp(defpackage.aljz aljzVar, defpackage.alli alliVar, int i) {
        this.$cid = i;
        this.a = aljzVar;
        this.b = alliVar.a(defpackage.allh.w.name());
    }

    public alzp(defpackage.aljz aljzVar, defpackage.alli alliVar, int i, char[] cArr) {
        this.$cid = i;
        this.a = aljzVar;
        this.b = alliVar.a(defpackage.allh.E.name());
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
    }
}
