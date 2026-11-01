package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aluo implements defpackage.allg {
    private final defpackage.allj a;
    private boolean b;

    public aluo(defpackage.alli alliVar) {
        aooh.f(alliVar, "publisherFactory");
        this.a = alliVar.a("AGENTIC_CALL_SCREEN_ASR_PROCESSOR");
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarR = aihd.r(defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_AGENTIC_LLM_ACTIVE);
        aooh.e(aihdVarR, "of(...)");
        return aihdVarR;
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        aooh.f(almyVar, "event");
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        aooh.e(almzVar, "getData(...)");
        int i = almzVar.c;
        defpackage.alnb alnbVarB = defpackage.alnb.b(i);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB == defpackage.alnb.EVENT_AGENTIC_LLM_ACTIVE) {
            this.b = true;
            return;
        }
        if (this.b) {
            defpackage.alnb alnbVarB2 = defpackage.alnb.b(i);
            if (alnbVarB2 == null) {
                alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
            }
            if (alnbVarB2 == defpackage.alnb.EVENT_ASR_RESULT) {
                apdi apdiVar = defpackage.alnj.f;
                aooh.e(apdiVar, "genericAsrResultEvent");
                defpackage.alnj alnjVar = (defpackage.alnj) akmr.x(almzVar, apdiVar);
                if (alnjVar != null) {
                    alqu alquVar = alnjVar.c;
                    if (alquVar == null) {
                        alquVar = alqu.a;
                    }
                    if (alquVar != null) {
                        int i2 = alquVar.c;
                        if (i2 == 1) {
                            java.lang.String strB = defpackage.alph.b(alquVar);
                            aooh.c(strB);
                            if (strB.length() == 0 || defpackage.alph.d(alquVar, 0.5d)) {
                                return;
                            }
                            xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                            xtqVarO.ah(defpackage.alnb.EVENT_ASR_COMPLETE_SENTENCE);
                            apdi apdiVar2 = defpackage.alvl.f;
                            aooh.e(apdiVar2, "asrCompleteSentenceEvent");
                            akzx akzxVarM = defpackage.alvl.a.m();
                            aooh.f(akzxVarM, "builder");
                            aooh.f(strB, "value");
                            akzxVarM.u();
                            defpackage.alvl alvlVar = (defpackage.alvl) akzxVarM.b;
                            j$.util.Objects.requireNonNull(strB);
                            alvlVar.b |= 1;
                            alvlVar.c = strB;
                            long j = alquVar.f;
                            akzxVarM.u();
                            defpackage.alvl alvlVar2 = (defpackage.alvl) akzxVarM.b;
                            alvlVar2.b |= 2;
                            alvlVar2.d = j;
                            long j2 = alquVar.e;
                            akzxVarM.u();
                            defpackage.alvl alvlVar3 = (defpackage.alvl) akzxVarM.b;
                            alvlVar3.b |= 4;
                            alvlVar3.e = j2;
                            alad aladVarP = akzxVarM.p();
                            aooh.e(aladVarP, "build(...)");
                            xtqVarO.ax(apdiVar2, (defpackage.alvl) aladVarP);
                            this.a.a(xtqVarO.ag(), almyVar);
                            return;
                        }
                        if (i2 != 2 || ((defpackage.alqr) alquVar.d).b.size() == 0) {
                            return;
                        }
                        java.lang.String strB2 = defpackage.alph.b(alquVar);
                        aooh.c(strB2);
                        if (strB2.length() != 0) {
                            boolean z = !defpackage.alph.d(alquVar, 0.5d);
                            xtq xtqVarO2 = defpackage.alpv.o(defpackage.almz.a.m());
                            xtqVarO2.ah(defpackage.alnb.EVENT_ASR_PARTIAL_CHUNK);
                            apdi apdiVar3 = defpackage.alvm.f;
                            aooh.e(apdiVar3, "asrPartialChunkEvent");
                            akzx akzxVarM2 = defpackage.alvm.a.m();
                            aooh.f(akzxVarM2, "builder");
                            aooh.f(strB2, "value");
                            akzxVarM2.u();
                            defpackage.alvm alvmVar = (defpackage.alvm) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(strB2);
                            alvmVar.b |= 1;
                            alvmVar.c = strB2;
                            akzxVarM2.u();
                            defpackage.alvm alvmVar2 = (defpackage.alvm) akzxVarM2.b;
                            alvmVar2.b |= 2;
                            alvmVar2.d = z;
                            long j3 = alquVar.e;
                            akzxVarM2.u();
                            defpackage.alvm alvmVar3 = (defpackage.alvm) akzxVarM2.b;
                            alvmVar3.b |= 4;
                            alvmVar3.e = j3;
                            alad aladVarP2 = akzxVarM2.p();
                            aooh.e(aladVarP2, "build(...)");
                            xtqVarO2.ax(apdiVar3, (defpackage.alvm) aladVarP2);
                            this.a.a(xtqVarO2.ag(), almyVar);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.b = false;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
