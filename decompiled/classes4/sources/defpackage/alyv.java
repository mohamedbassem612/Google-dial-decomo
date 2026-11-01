package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alyv implements defpackage.aljv {
    private final defpackage.aljz a;
    private final defpackage.allj b;
    private j$.util.Optional c = j$.util.Optional.empty();

    public alyv(defpackage.aljz aljzVar, defpackage.alli alliVar) {
        this.a = aljzVar;
        this.b = alliVar.a(defpackage.allh.n.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_EXPERIMENT_SUMMARY, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_SMART_REPLY_OPTIONS, defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT_DARK_LAUNCH, defpackage.alnb.EVENT_COMPACT_MODEL_OUTPUT, defpackage.alnb.EVENT_STOP_BOT_SPEECH, new defpackage.alnb[]{defpackage.alnb.EVENT_ROBOCALL_DETECTED, defpackage.alnb.EVENT_SET_TTS_VOICE, defpackage.alnb.EVENT_LLM_FEATURE_AVAILABLE, defpackage.alnb.EVENT_LLM_FEATURE_DOWNLOADING, defpackage.alnb.EVENT_LLM_FEATURE_MISSING, defpackage.alnb.EVENT_LLM_INFERENCE_RESULT, defpackage.alnb.EVENT_LLM_INFERENCE_REQUEST, defpackage.alnb.EVENT_LLM_CANCEL_REQUEST, defpackage.alnb.EVENT_EXTRACTION_RESULT, defpackage.alnb.EVENT_SMART_REPLY_LLM_ACTIVE});
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
        apdi apdiVar = defpackage.alol.f;
        almzVar.c(apdiVar);
        if (((alaa) almzVar).n.l((alac) apdiVar.a)) {
            return defpackage.aknx.C(almyVar, (j$.util.Optional) ((defpackage.alyw) this.a).a);
        }
        apdi apdiVar2 = defpackage.aloz.b;
        almzVar.c(apdiVar2);
        akzs akzsVar = ((alaa) almzVar).n;
        alac alacVar = (alac) apdiVar2.a;
        if (akzsVar.l(alacVar)) {
            almzVar.c(apdiVar2);
            java.lang.Object objJ = ((alaa) almzVar).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar2.b;
            } else {
                apdiVar2.c(objJ);
            }
            akzz akzzVarM = defpackage.alsi.a.m();
            apdi apdiVar3 = defpackage.alwp.b;
            akzz akzzVarM2 = defpackage.alwp.a.m();
            akzzVarM2.bV(defpackage.alyf.e, (defpackage.alyf) objJ);
            akzzVarM.bV(apdiVar3, akzzVarM2.p());
            return akzzVarM.p();
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 3) {
            return defpackage.aknx.z(almzVar);
        }
        if (iOrdinal == 30) {
            return defpackage.aknx.v();
        }
        if (iOrdinal == 36) {
            return defpackage.aknx.x(almzVar);
        }
        if (iOrdinal == 45) {
            return defpackage.aknx.u();
        }
        if (iOrdinal == 47) {
            return defpackage.aknx.A(almzVar);
        }
        if (iOrdinal == 49) {
            return defpackage.aknx.q();
        }
        if (iOrdinal == 51) {
            return defpackage.aknx.p();
        }
        if (iOrdinal == 65) {
            return defpackage.aknx.r();
        }
        if (iOrdinal == 79) {
            return defpackage.aknx.B(almyVar);
        }
        if (iOrdinal != 32) {
            if (iOrdinal == 33) {
                return defpackage.aknx.w();
            }
            switch (iOrdinal) {
                case 61:
                    akzz akzzVarM3 = defpackage.alsi.a.m();
                    apdi apdiVar4 = defpackage.alst.d;
                    apdi apdiVar5 = defpackage.alop.b;
                    almzVar.c(apdiVar5);
                    java.lang.Object objJ2 = ((alaa) almzVar).n.j((alac) apdiVar5.a);
                    if (objJ2 == null) {
                        objJ2 = apdiVar5.b;
                    } else {
                        apdiVar5.c(objJ2);
                    }
                    akzzVarM3.bV(apdiVar4, (defpackage.alst) objJ2);
                    return akzzVarM3.p();
                case 62:
                    return defpackage.aknx.s();
                case 63:
                    return defpackage.aknx.t();
                default:
                    return defpackage.alsi.a;
            }
        }
        akzx akzxVarM = defpackage.alxb.a.m();
        apdi apdiVar6 = defpackage.alnf.k;
        almzVar.c(apdiVar6);
        java.lang.Object objJ3 = ((alaa) almzVar).n.j((alac) apdiVar6.a);
        if (objJ3 == null) {
            objJ3 = apdiVar6.b;
        } else {
            apdiVar6.c(objJ3);
        }
        defpackage.almm almmVar = ((defpackage.alnf) objJ3).i;
        if (almmVar == null) {
            almmVar = defpackage.almm.a;
        }
        java.lang.String str = almmVar.c;
        akzxVarM.u();
        defpackage.alxb alxbVar = (defpackage.alxb) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alxbVar.b |= 1;
        alxbVar.c = str;
        defpackage.alxb alxbVar2 = (defpackage.alxb) akzxVarM.p();
        akzz akzzVarM4 = defpackage.alsi.a.m();
        apdi apdiVar7 = defpackage.alwp.b;
        akzz akzzVarM5 = defpackage.alwp.a.m();
        akzzVarM5.bV(defpackage.alxb.d, alxbVar2);
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
        defpackage.alui aluiVar = new defpackage.alui(alsiVar, 9);
        if (true == optional.isPresent()) {
            optional.get().a(aluiVar.a);
        }
    }

    @Override // defpackage.aljv
    public final void i(java.lang.String str) {
        ((defpackage.alyw) this.a).a = j$.util.Optional.of(str);
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
