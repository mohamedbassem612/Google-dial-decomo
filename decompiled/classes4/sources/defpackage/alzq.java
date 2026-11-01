package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzq implements defpackage.aljz {
    private final /* synthetic */ int $cid;
    public j$.util.Optional a = j$.util.Optional.empty();
    public final aihd b = defpackage.alma.a;

    public alzq(int i, byte[] bArr) {
        this.$cid = i;
    }

    @Override // defpackage.aljz
    public final /* synthetic */ defpackage.almz a(java.lang.Object obj) {
        if (this.$cid != 0) {
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
            apdi apdiVar5 = defpackage.alsc.b;
            alroVar.c(apdiVar5);
            if (((alaa) alroVar).n.l((alac) apdiVar5.a)) {
                return defpackage.aknx.e();
            }
            apdi apdiVar6 = defpackage.alsd.b;
            alroVar.c(apdiVar6);
            return ((alaa) alroVar).n.l((alac) apdiVar6.a) ? defpackage.aknx.f() : defpackage.almz.a;
        }
        defpackage.alro alroVar2 = (defpackage.alro) obj;
        apdi apdiVar7 = defpackage.alqv.f;
        alroVar2.c(apdiVar7);
        if (((alaa) alroVar2).n.l((alac) apdiVar7.a)) {
            return defpackage.aknx.h(alroVar2);
        }
        apdi apdiVar8 = defpackage.altb.b;
        alroVar2.c(apdiVar8);
        if (((alaa) alroVar2).n.l((alac) apdiVar8.a)) {
            return defpackage.aknx.D();
        }
        apdi apdiVar9 = defpackage.alqy.f;
        alroVar2.c(apdiVar9);
        if (((alaa) alroVar2).n.l((alac) apdiVar9.a)) {
            return defpackage.aknx.j(alroVar2);
        }
        apdi apdiVar10 = defpackage.alqx.d;
        alroVar2.c(apdiVar10);
        if (((alaa) alroVar2).n.l((alac) apdiVar10.a)) {
            return defpackage.aknx.i(alroVar2);
        }
        apdi apdiVar11 = defpackage.alsu.f;
        alroVar2.c(apdiVar11);
        akzs akzsVar = ((alaa) alroVar2).n;
        alac alacVar = (alac) apdiVar11.a;
        if (!akzsVar.l(alacVar)) {
            apdi apdiVar12 = alrc.f;
            alroVar2.c(apdiVar12);
            if (((alaa) alroVar2).n.l((alac) apdiVar12.a)) {
                return defpackage.aknx.l(alroVar2);
            }
            apdi apdiVar13 = defpackage.alrr.e;
            alroVar2.c(apdiVar13);
            if (((alaa) alroVar2).n.l((alac) apdiVar13.a)) {
                return defpackage.aknx.m(alroVar2);
            }
            apdi apdiVar14 = defpackage.alwr.d;
            alroVar2.c(apdiVar14);
            return ((alaa) alroVar2).n.l((alac) apdiVar14.a) ? defpackage.aknx.k(alroVar2) : defpackage.almz.a;
        }
        alroVar2.c(apdiVar11);
        java.lang.Object objJ = ((alaa) alroVar2).n.j(alacVar);
        if (objJ == null) {
            objJ = apdiVar11.b;
        } else {
            apdiVar11.c(objJ);
        }
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_SCOOBY_SPAM_SIGNAL;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alow.b, (defpackage.alsu) objJ);
        return akzzVarM.p();
    }

    public alzq(int i) {
        this.$cid = i;
    }
}
