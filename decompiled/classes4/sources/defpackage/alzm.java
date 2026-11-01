package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzm implements defpackage.aljz {
    public j$.util.Optional a;
    public final aihd b;

    public alzm() {
        aihd aihdVar = defpackage.alma.a;
        this.a = j$.util.Optional.empty();
        this.b = aihdVar;
    }

    @Override // defpackage.aljz
    public final /* synthetic */ defpackage.almz a(java.lang.Object obj) {
        defpackage.alro alroVar = (defpackage.alro) obj;
        apdi apdiVar = defpackage.alqv.f;
        alroVar.c(apdiVar);
        if (((alaa) alroVar).n.l((alac) apdiVar.a)) {
            return defpackage.aknx.h(alroVar);
        }
        apdi apdiVar2 = defpackage.altb.b;
        alroVar.c(apdiVar2);
        if (((alaa) alroVar).n.l((alac) apdiVar2.a)) {
            return defpackage.aknx.D();
        }
        apdi apdiVar3 = defpackage.alqy.f;
        alroVar.c(apdiVar3);
        if (((alaa) alroVar).n.l((alac) apdiVar3.a)) {
            return defpackage.aknx.j(alroVar);
        }
        apdi apdiVar4 = defpackage.alqx.d;
        alroVar.c(apdiVar4);
        if (((alaa) alroVar).n.l((alac) apdiVar4.a)) {
            return defpackage.aknx.i(alroVar);
        }
        apdi apdiVar5 = defpackage.alsr.b;
        alroVar.c(apdiVar5);
        if (((alaa) alroVar).n.l((alac) apdiVar5.a)) {
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_RINGING_STARTED;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
            akzzVarM.bV(defpackage.alok.b, defpackage.alok.a);
            return akzzVarM.p();
        }
        apdi apdiVar6 = defpackage.alsq.d;
        alroVar.c(apdiVar6);
        akzs akzsVar = ((alaa) alroVar).n;
        alac alacVar = (alac) apdiVar6.a;
        if (akzsVar.l(alacVar)) {
            akzz akzzVarM2 = defpackage.almz.a.m();
            defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_RINGING_ENDED;
            akzzVarM2.u();
            defpackage.almz almzVar2 = akzzVarM2.b;
            almzVar2.c = alnbVar2.aN;
            almzVar2.b |= 1;
            apdi apdiVar7 = defpackage.aloj.e;
            akzx akzxVarM = defpackage.aloj.a.m();
            akzm akzmVarC = aldf.c(alroVar.c);
            akzxVarM.u();
            defpackage.aloj alojVar = (defpackage.aloj) akzxVarM.b;
            j$.util.Objects.requireNonNull(akzmVarC);
            alojVar.c = akzmVarC;
            alojVar.b |= 1;
            alroVar.c(apdiVar6);
            java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar6.b;
            } else {
                apdiVar6.c(objJ);
            }
            defpackage.alsp alspVarB = defpackage.alsp.b(((defpackage.alsq) objJ).c);
            if (alspVarB == null) {
                alspVarB = defpackage.alsp.UNKNOWN;
            }
            akzxVarM.u();
            defpackage.aloj alojVar2 = (defpackage.aloj) akzxVarM.b;
            alojVar2.d = alspVarB.e;
            alojVar2.b |= 2;
            akzzVarM2.bV(apdiVar7, (defpackage.aloj) akzxVarM.p());
            return akzzVarM2.p();
        }
        apdi apdiVar8 = defpackage.alsu.f;
        alroVar.c(apdiVar8);
        akzs akzsVar2 = ((alaa) alroVar).n;
        alac alacVar2 = (alac) apdiVar8.a;
        if (akzsVar2.l(alacVar2)) {
            alroVar.c(apdiVar8);
            java.lang.Object objJ2 = ((alaa) alroVar).n.j(alacVar2);
            if (objJ2 == null) {
                objJ2 = apdiVar8.b;
            } else {
                apdiVar8.c(objJ2);
            }
            akzz akzzVarM3 = defpackage.almz.a.m();
            defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_SCOOBY_SPAM_SIGNAL;
            akzzVarM3.u();
            defpackage.almz almzVar3 = akzzVarM3.b;
            almzVar3.c = alnbVar3.aN;
            almzVar3.b |= 1;
            akzzVarM3.bV(defpackage.alow.b, (defpackage.alsu) objJ2);
            return akzzVarM3.p();
        }
        apdi apdiVar9 = defpackage.alsc.b;
        alroVar.c(apdiVar9);
        if (((alaa) alroVar).n.l((alac) apdiVar9.a)) {
            return defpackage.aknx.e();
        }
        apdi apdiVar10 = defpackage.alsd.b;
        alroVar.c(apdiVar10);
        if (((alaa) alroVar).n.l((alac) apdiVar10.a)) {
            return defpackage.aknx.f();
        }
        apdi apdiVar11 = alrc.f;
        alroVar.c(apdiVar11);
        if (((alaa) alroVar).n.l((alac) apdiVar11.a)) {
            return defpackage.aknx.l(alroVar);
        }
        apdi apdiVar12 = defpackage.alsk.d;
        alroVar.c(apdiVar12);
        if (((alaa) alroVar).n.l((alac) apdiVar12.a)) {
            return defpackage.aknx.n(alroVar);
        }
        apdi apdiVar13 = defpackage.alrr.e;
        alroVar.c(apdiVar13);
        return ((alaa) alroVar).n.l((alac) apdiVar13.a) ? defpackage.aknx.m(alroVar) : defpackage.almz.a;
    }
}
