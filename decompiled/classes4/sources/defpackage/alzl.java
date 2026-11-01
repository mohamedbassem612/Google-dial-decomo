package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzl implements defpackage.aljv {
    private final defpackage.aljz a;
    private final defpackage.allj b;
    private j$.util.Optional c = j$.util.Optional.empty();

    public alzl(defpackage.aljz aljzVar, defpackage.alli alliVar) {
        this.a = aljzVar;
        this.b = alliVar.a(defpackage.allh.s.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_EXPERIMENT_SUMMARY, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_STATE_UPDATE, defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_ROBOCALL_DETECTED, defpackage.alnb.EVENT_STOP_BOT_SPEECH, new defpackage.alnb[]{defpackage.alnb.EVENT_SPAM_AUDIO_MATCH, defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING, defpackage.alnb.EVENT_QUICK_REPLY_CHIPS_READY, defpackage.alnb.EVENT_COMPACT_MODEL_OUTPUT});
    }

    @Override // defpackage.allg
    public final /* synthetic */ void b(defpackage.almy almyVar) {
        defpackage.alpv.k(this, almyVar);
    }

    @Override // defpackage.aljv
    public final defpackage.alsi c(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alox.b;
        almzVar.c(apdiVar);
        if (((alaa) almzVar).n.l((alac) apdiVar.a)) {
            return anty.aG(almzVar);
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        defpackage.aljz aljzVar = this.a;
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 2) {
            return defpackage.aknx.o(almyVar);
        }
        if (iOrdinal == 5) {
            return defpackage.aknx.C(almyVar, ((defpackage.alzm) aljzVar).a);
        }
        if (iOrdinal == 36) {
            return defpackage.aknx.y(almzVar, ((defpackage.alzm) aljzVar).b);
        }
        if (iOrdinal == 40) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.alot.c;
            almzVar2.c(apdiVar2);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar2.a);
            if (objJ == null) {
                objJ = apdiVar2.b;
            } else {
                apdiVar2.c(objJ);
            }
            aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.alot) objJ).b).map(new defpackage.alyz(12)).flatMap(new defpackage.alyz(13)).map(new defpackage.alyz(14)).collect(aido.a);
            akzz akzzVarM = defpackage.alsi.a.m();
            apdi apdiVar3 = defpackage.alwp.b;
            akzz akzzVarM2 = defpackage.alwp.a.m();
            apdi apdiVar4 = defpackage.alwg.c;
            akzx akzxVarM = defpackage.alwg.a.m();
            akzxVarM.aS(aifyVar);
            akzzVarM2.bV(apdiVar4, (defpackage.alwg) akzxVarM.p());
            akzzVarM.bV(apdiVar3, akzzVarM2.p());
            return akzzVarM.p();
        }
        if (iOrdinal == 79) {
            return defpackage.aknx.B(almyVar);
        }
        if (iOrdinal == 30) {
            return defpackage.aknx.v();
        }
        if (iOrdinal != 31) {
            if (iOrdinal == 33) {
                return defpackage.aknx.w();
            }
            if (iOrdinal != 34) {
                return defpackage.alsi.a;
            }
            akzz akzzVarM3 = defpackage.alsi.a.m();
            apdi apdiVar5 = defpackage.alsl.c;
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar6 = defpackage.alog.b;
            almzVar3.c(apdiVar6);
            java.lang.Object objJ2 = ((alaa) almzVar3).n.j((alac) apdiVar6.a);
            if (objJ2 == null) {
                objJ2 = apdiVar6.b;
            } else {
                apdiVar6.c(objJ2);
            }
            akzzVarM3.bV(apdiVar5, (defpackage.alsl) objJ2);
            return akzzVarM3.p();
        }
        akzz akzzVarM4 = defpackage.alsi.a.m();
        apdi apdiVar7 = defpackage.alwp.b;
        akzz akzzVarM5 = defpackage.alwp.a.m();
        apdi apdiVar8 = defpackage.alwu.e;
        akzx akzxVarM2 = defpackage.alwu.a.m();
        akzm akzmVar = almyVar.d;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        akzxVarM2.u();
        defpackage.alwu alwuVar = (defpackage.alwu) akzxVarM2.b;
        j$.util.Objects.requireNonNull(akzmVar);
        alwuVar.c = akzmVar;
        alwuVar.b |= 1;
        java.lang.String str = almyVar.f;
        akzxVarM2.u();
        defpackage.alwu alwuVar2 = (defpackage.alwu) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        alwuVar2.b |= 2;
        alwuVar2.d = str;
        akzzVarM5.bV(apdiVar8, (defpackage.alwu) akzxVarM2.p());
        akzzVarM4.bV(apdiVar7, akzzVarM5.p());
        return akzzVarM4.p();
    }

    @Override // defpackage.aljv
    public final void g(defpackage.alro alroVar) {
        this.b.b(this.a.a(alroVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [alle, java.lang.Object] */
    @Override // defpackage.aljv
    public final void h(defpackage.alsi alsiVar) {
        j$.util.Optional optional = this.c;
        defpackage.alui aluiVar = new defpackage.alui(alsiVar, 11);
        if (true == optional.isPresent()) {
            optional.get().a(aluiVar.a);
        }
    }

    @Override // defpackage.aljv
    public final void i(java.lang.String str) {
        ((defpackage.alzm) this.a).a = j$.util.Optional.of(str);
    }

    @Override // defpackage.aljv
    public final void j(defpackage.alle alleVar) {
        this.c = j$.util.Optional.of(alleVar);
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
