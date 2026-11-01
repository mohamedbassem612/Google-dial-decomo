package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acob implements aclu {
    public final defpackage.acnm a;
    public final defpackage.acly b;
    private final defpackage.afpl c;

    public acob(defpackage.acnm acnmVar, defpackage.acly aclyVar, defpackage.afpl afplVar) {
        this.a = acnmVar;
        this.b = aclyVar;
        this.c = afplVar;
    }

    public final ajcq a(aclw aclwVar) {
        java.lang.String strF;
        ahyn ahynVarH;
        final aclv aclvVar = (acnl) aclwVar.a;
        acmi acmiVarE = abrz.e(aclvVar);
        apdi apdiVar = defpackage.acod.a;
        acmiVarE.c(apdiVar);
        akzs akzsVar = ((alaa) acmiVarE).n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            acmi acmiVarE2 = abrz.e(aclvVar);
            acmiVarE2.c(apdiVar);
            java.lang.Object objJ = ((alaa) acmiVarE2).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            strF = ((defpackage.acoc) objJ).b;
        } else {
            strF = this.a.f(aclvVar);
        }
        java.lang.String str = strF;
        if (str.isEmpty()) {
            return aiql.z((java.lang.Object) null);
        }
        defpackage.acnm acnmVar = this.a;
        zzl zzlVar = (zzl) acnmVar.c(aclvVar).e();
        ajcq ajcqVar = aclwVar.b;
        ajcq ajcqVarD = acnmVar.d(aclvVar, ajcqVar);
        ajcq ajcqVarG = acnmVar.g();
        ajcq ajcqVarE = acnmVar.e(aclvVar, ajcqVar);
        defpackage.afpl afplVar = this.c;
        final ajcq ajcqVarZ = aiql.z((java.lang.Object) null);
        final alaa alaaVar = ((acnl) aclvVar).c.a;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        ((defpackage.afpl) afplVar.b).s(alaaVar, ((acmh) alaaVar).d, null, arrayList);
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        ((defpackage.afpl) afplVar.a).s(alaaVar, ((acmh) alaaVar).d, null, arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        arrayList3.add(ajcqVarZ);
        anpu anpuVarAa = aiql.aa(arrayList3);
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: acoh
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                akzx akzxVarM = defpackage.aiva.a.m();
                akzxVarM.u();
                defpackage.aiva aivaVar = (defpackage.aiva) akzxVarM.b;
                acnl acnlVar = aclvVar;
                aiwd aiwdVar = acnlVar.a;
                j$.util.Objects.requireNonNull(aiwdVar);
                aivaVar.c = aiwdVar;
                aivaVar.b |= 1;
                if (!acnlVar.e) {
                    aiwd aiwdVarAt = aaoo.at(acnlVar, true);
                    ahvr.bZ(aiwdVarAt != null, "No Parent Event");
                    akzxVarM.u();
                    defpackage.aiva aivaVar2 = (defpackage.aiva) akzxVarM.b;
                    j$.util.Objects.requireNonNull(aiwdVarAt);
                    aivaVar2.e = aiwdVarAt;
                    aivaVar2.b |= 2;
                }
                acmi acmiVarE3 = abrz.e(acnlVar);
                apdi apdiVar2 = defpackage.acol.a;
                acmiVarE3.c(apdiVar2);
                if (((alaa) acmiVarE3).n.l((alac) apdiVar2.a)) {
                    akzx akzxVarM2 = defpackage.aivb.a.m();
                    aiwc aiwcVar = acmiVarE3.d;
                    if (aiwcVar == null) {
                        aiwcVar = aiwc.a;
                    }
                    aiwd aiwdVar2 = aiwcVar.e;
                    if (aiwdVar2 == null) {
                        aiwdVar2 = aiwd.a;
                    }
                    akzxVarM2.u();
                    defpackage.aivb aivbVar = (defpackage.aivb) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(aiwdVar2);
                    aivbVar.c = aiwdVar2;
                    aivbVar.b |= 1;
                    akzxVarM.u();
                    defpackage.aiva aivaVar3 = (defpackage.aiva) akzxVarM.b;
                    defpackage.aivb aivbVar2 = (defpackage.aivb) akzxVarM2.p();
                    j$.util.Objects.requireNonNull(aivbVar2);
                    aivaVar3.h = aivbVar2;
                    aivaVar3.b |= 128;
                }
                aiwc aiwcVar2 = abrz.f(acnlVar).d;
                if (aiwcVar2 == null) {
                    aiwcVar2 = aiwc.a;
                }
                acmh acmhVar = alaaVar;
                albg albgVar = (akzz) aivx.a.m();
                albgVar.u();
                aivx aivxVar = ((akzz) albgVar).b;
                j$.util.Objects.requireNonNull(aiwcVar2);
                aivxVar.c = aiwcVar2;
                aivxVar.b |= 1;
                int iAm = aiql.am(acmhVar.c);
                if (iAm == 0) {
                    iAm = 1;
                }
                albgVar.u();
                aivx aivxVar2 = ((akzz) albgVar).b;
                aivxVar2.b |= 16;
                aivxVar2.e = iAm - 1;
                int iAm2 = aiql.am(acmhVar.c);
                if (iAm2 == 0) {
                    iAm2 = 1;
                }
                albgVar.u();
                aivx aivxVar3 = ((akzz) albgVar).b;
                aivxVar3.b |= 16;
                aivxVar3.e = iAm2 - 1;
                java.util.Iterator it = acmhVar.d.iterator();
                while (it.hasNext()) {
                    switch (((java.lang.Integer) it.next()).intValue()) {
                        case 100000001:
                            apdi apdiVar3 = defpackage.acnf.a;
                            acmhVar.c(apdiVar3);
                            java.lang.Object objJ2 = ((alaa) acmhVar).n.j((alac) apdiVar3.a);
                            if (objJ2 == null) {
                                objJ2 = apdiVar3.b;
                            } else {
                                apdiVar3.c(objJ2);
                            }
                            int iAS = a.aS(((defpackage.acng) objJ2).b);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            albgVar.u();
                            aivx aivxVar4 = ((akzz) albgVar).b;
                            aivxVar4.b |= 32;
                            aivxVar4.f = iAS - 1;
                            break;
                        case 100000002:
                            apdi apdiVar4 = defpackage.acnf.b;
                            acmhVar.c(apdiVar4);
                            java.lang.Object objJ3 = ((alaa) acmhVar).n.j((alac) apdiVar4.a);
                            if (objJ3 == null) {
                                objJ3 = apdiVar4.b;
                            } else {
                                apdiVar4.c(objJ3);
                            }
                            int iAQ = a.aQ(((aixi) objJ3).b);
                            if (iAQ == 0) {
                                iAQ = 1;
                            }
                            albgVar.u();
                            aivx aivxVar5 = ((akzz) albgVar).b;
                            aivxVar5.b |= 64;
                            aivxVar5.g = iAQ - 1;
                            break;
                        case 100000003:
                            apdi apdiVar5 = defpackage.acoi.b;
                            acmhVar.c(apdiVar5);
                            java.lang.Object objJ4 = ((alaa) acmhVar).n.j((alac) apdiVar5.a);
                            if (objJ4 == null) {
                                objJ4 = apdiVar5.b;
                            } else {
                                apdiVar5.c(objJ4);
                            }
                            int i = ((defpackage.acnz) objJ4).b;
                            albgVar.u();
                            aivx aivxVar6 = ((akzz) albgVar).b;
                            aivxVar6.b |= 128;
                            aivxVar6.h = i;
                            break;
                    }
                }
                albg albgVar2 = (akzz) aiuz.a.m();
                long j = acnlVar.d;
                java.util.List list = arrayList;
                if (!list.isEmpty()) {
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((defpackage.acnr) aiql.H((ajcq) it2.next())).a(albgVar2);
                    }
                }
                java.util.List list2 = arrayList2;
                albgVar.u();
                aivx aivxVar7 = ((akzz) albgVar).b;
                aiuz aiuzVarP = albgVar2.p();
                j$.util.Objects.requireNonNull(aiuzVarP);
                aivxVar7.j = aiuzVarP;
                aivxVar7.b |= 16384;
                if (!list2.isEmpty()) {
                    java.util.Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((defpackage.acnr) aiql.H((ajcq) it3.next())).a(albgVar);
                    }
                }
                akzx[] akzxVarArr = (akzz[]) aiql.H(ajcqVarZ);
                if (akzxVarArr != null) {
                    for (akzx akzxVar : akzxVarArr) {
                        albgVar.u();
                        aivx aivxVar8 = ((akzz) albgVar).b;
                        aivy aivyVarP = akzxVar.p();
                        j$.util.Objects.requireNonNull(aivyVarP);
                        alat alatVar = aivxVar8.i;
                        if (!alatVar.c()) {
                            aivxVar8.i = alad.J(alatVar);
                        }
                        aivxVar8.i.add(aivyVarP);
                    }
                }
                aivx aivxVarP = albgVar.p();
                akzxVarM.u();
                defpackage.aiva aivaVar4 = (defpackage.aiva) akzxVarM.b;
                j$.util.Objects.requireNonNull(aivxVarP);
                aivaVar4.f = aivxVarP;
                aivaVar4.b |= 16;
                return (defpackage.aiva) akzxVarM.p();
            }
        };
        ajbm ajbmVar = ajbm.a;
        ajcq ajcqVarB = anpuVarAa.b(callable, ajbmVar);
        acmi acmiVarF = ((acnl) aclvVar).e ? abrz.f(aclvVar) : abrz.e(aclvVar);
        apdi apdiVar2 = defpackage.acnv.a;
        acmiVarF.c(apdiVar2);
        akzs akzsVar2 = ((alaa) acmiVarF).n;
        alac alacVar2 = (alac) apdiVar2.a;
        if (akzsVar2.l(alacVar2)) {
            acmiVarF.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) acmiVarF).n.j(alacVar2);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            ahynVarH = ahyn.h(java.lang.Integer.valueOf(((defpackage.acnu) objJ2).b));
        } else {
            acnmVar.a(aclvVar);
            ahynVarH = ahwt.a;
        }
        return aiql.ab(new ajcq[]{ajcqVarD, ajcqVarB, ajcqVarG, ajcqVarE}).c(ahqx.b(new defpackage.acoa(this, str, zzlVar, ajcqVarD, ajcqVarB, ahynVarH, ajcqVarG, (acnl) aclvVar, ajcqVarE, aclwVar, 0)), ajbmVar);
    }

    public final java.util.Set b() {
        return new aile(acnl.class);
    }
}
