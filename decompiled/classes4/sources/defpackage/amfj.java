package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amfj implements defpackage.aljz {
    private final /* synthetic */ int $cid;

    public amfj(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aljz
    public final /* synthetic */ defpackage.almz a(java.lang.Object obj) {
        if (this.$cid != 0) {
            apdi apdiVar = defpackage.ambe.b;
            alaa alaaVar = (alaa) obj;
            alaaVar.c(apdiVar);
            return alaaVar.n.l((alac) apdiVar.a) ? defpackage.alpv.j((defpackage.amal) obj) : defpackage.almz.a;
        }
        apdi apdiVar2 = defpackage.ambd.b;
        alaa alaaVar2 = (alaa) obj;
        alaaVar2.c(apdiVar2);
        akzs akzsVar = alaaVar2.n;
        alac alacVar = (alac) apdiVar2.a;
        if (akzsVar.l(alacVar)) {
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_RECOGNITION_MODEL_RESULT;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
            apdi apdiVar3 = defpackage.aloh.b;
            alaaVar2.c(apdiVar2);
            java.lang.Object objJ = alaaVar2.n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar2.b;
            } else {
                apdiVar2.c(objJ);
            }
            akzzVarM.bV(apdiVar3, (defpackage.amaz) objJ);
            return akzzVarM.p();
        }
        apdi apdiVar4 = defpackage.ambc.b;
        alaaVar2.c(apdiVar4);
        akzs akzsVar2 = alaaVar2.n;
        alac alacVar2 = (alac) apdiVar4.a;
        if (akzsVar2.l(alacVar2)) {
            akzz akzzVarM2 = defpackage.almz.a.m();
            defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_RECOGNITION_HUMAN_INTENT_EXTRACTION;
            akzzVarM2.u();
            defpackage.almz almzVar2 = akzzVarM2.b;
            almzVar2.c = alnbVar2.aN;
            almzVar2.b |= 1;
            apdi apdiVar5 = defpackage.alnm.i;
            alaaVar2.c(apdiVar4);
            java.lang.Object objJ2 = alaaVar2.n.j(alacVar2);
            if (objJ2 == null) {
                objJ2 = apdiVar4.b;
            } else {
                apdiVar4.c(objJ2);
            }
            akzzVarM2.bV(apdiVar5, (defpackage.alnm) objJ2);
            return akzzVarM2.p();
        }
        apdi apdiVar6 = defpackage.ambb.b;
        alaaVar2.c(apdiVar6);
        akzs akzsVar3 = alaaVar2.n;
        alac alacVar3 = (alac) apdiVar6.a;
        if (!akzsVar3.l(alacVar3)) {
            apdi apdiVar7 = defpackage.ambe.b;
            alaaVar2.c(apdiVar7);
            return alaaVar2.n.l((alac) apdiVar7.a) ? defpackage.alpv.j((defpackage.amal) obj) : defpackage.almz.a;
        }
        akzz akzzVarM3 = defpackage.almz.a.m();
        defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_ENDPOINTER_RESULT;
        akzzVarM3.u();
        defpackage.almz almzVar3 = akzzVarM3.b;
        almzVar3.c = alnbVar3.aN;
        almzVar3.b |= 1;
        apdi apdiVar8 = defpackage.almw.b;
        alaaVar2.c(apdiVar6);
        java.lang.Object objJ3 = alaaVar2.n.j(alacVar3);
        if (objJ3 == null) {
            objJ3 = apdiVar6.b;
        } else {
            apdiVar6.c(objJ3);
        }
        akzzVarM3.bV(apdiVar8, (defpackage.amax) objJ3);
        return akzzVarM3.p();
    }
}
