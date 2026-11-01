package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acnx implements aclu {
    public final defpackage.acnm a;
    public final defpackage.acly b;
    private final defpackage.vaa c;

    public acnx(defpackage.acnm acnmVar, defpackage.acly aclyVar, defpackage.vaa vaaVar) {
        this.a = acnmVar;
        this.b = aclyVar;
        this.c = vaaVar;
    }

    public final ajcq a(final aclw aclwVar) {
        java.lang.String strF;
        ahyn ahynVarH;
        ajcq ajcqVarC;
        ahoq ahoqVarW = ahvr.W(1255, "GIL:NVLGraftHandler");
        try {
            final aclv aclvVar = (acnk) aclwVar.a;
            acmi acmiVarE = abrz.e(aclvVar);
            apdi apdiVar = defpackage.acod.a;
            acmiVarE.c(apdiVar);
            akzs akzsVar = ((alaa) acmiVarE).n;
            java.lang.Object obj = apdiVar.a;
            if (akzsVar.l((alac) obj)) {
                acmi acmiVarE2 = abrz.e(aclvVar);
                acmiVarE2.c(apdiVar);
                java.lang.Object objJ = ((alaa) acmiVarE2).n.j((alac) obj);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                strF = ((defpackage.acoc) objJ).b;
            } else {
                strF = this.a.f(aclvVar);
            }
            final java.lang.String str = strF;
            if (str.isEmpty()) {
                ajcqVarC = aiql.z((java.lang.Object) null);
            } else {
                defpackage.acnm acnmVar = this.a;
                final zzl zzlVar = (zzl) acnmVar.c(aclvVar).e();
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.List<acmi> list = ((acnk) aclvVar).c;
                for (acmi acmiVar : list) {
                    apdi apdiVar2 = defpackage.acoz.a;
                    acmiVar.c(apdiVar2);
                    akzs akzsVar2 = ((alaa) acmiVar).n;
                    java.lang.Object obj2 = apdiVar2.a;
                    if (akzsVar2.l((alac) obj2)) {
                        acmiVar.c(apdiVar2);
                        java.lang.Object objJ2 = ((alaa) acmiVar).n.j((alac) obj2);
                        if (objJ2 == null) {
                            objJ2 = apdiVar2.b;
                        } else {
                            apdiVar2.c(objJ2);
                        }
                        hashSet.addAll(((defpackage.acoy) objJ2).b);
                    }
                }
                ajcq ajcqVar = aclwVar.b;
                final ajcq ajcqVarD = acnmVar.d(aclvVar, ajcqVar);
                final ajcq ajcqVarG = acnmVar.g();
                final ajcq ajcqVarE = acnmVar.e(aclvVar, ajcqVar);
                acmi acmiVarE3 = abrz.e(aclvVar);
                apdi apdiVar3 = defpackage.acnv.a;
                acmiVarE3.c(apdiVar3);
                akzs akzsVar3 = ((alaa) acmiVarE3).n;
                java.lang.Object obj3 = apdiVar3.a;
                if (akzsVar3.l((alac) obj3)) {
                    acmi acmiVarE4 = abrz.e(aclvVar);
                    acmiVarE4.c(apdiVar3);
                    java.lang.Object objJ3 = ((alaa) acmiVarE4).n.j((alac) obj3);
                    if (objJ3 == null) {
                        objJ3 = apdiVar3.b;
                    } else {
                        apdiVar3.c(objJ3);
                    }
                    ahynVarH = ahyn.h(java.lang.Integer.valueOf(((defpackage.acnu) objJ3).b));
                } else {
                    acnmVar.a(aclvVar);
                    ahynVarH = ahwt.a;
                }
                java.lang.Object obj4 = this.c.a;
                int size = list.size();
                akzx[] akzxVarArr = new akzz[size];
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i = size - 1;
                final ahyn ahynVar = ahynVarH;
                while (i >= 0) {
                    alaa alaaVar = (acmi) list.get(i);
                    akzx akzxVar = (akzz) aivy.a.m();
                    java.lang.Object obj5 = obj4;
                    aiwc aiwcVar = ((acmi) alaaVar).d;
                    if (aiwcVar == null) {
                        aiwcVar = aiwc.a;
                    }
                    int i2 = aiwcVar.d;
                    akzxVar.u();
                    java.util.HashSet hashSet2 = hashSet;
                    aivy aivyVar = ((akzz) akzxVar).b;
                    aivyVar.b |= 1;
                    aivyVar.c = i2;
                    akzxVarArr[i] = akzxVar;
                    int iAS = a.aS(((acmi) alaaVar).e);
                    if (iAS != 0 && iAS != 1) {
                        akzx akzxVar2 = akzxVarArr[i];
                        int iAS2 = a.aS(((acmi) alaaVar).e);
                        if (iAS2 == 0) {
                            iAS2 = 1;
                        }
                        akzxVar2.u();
                        aivy aivyVar2 = ((akzz) akzxVar2).b;
                        aivyVar2.i = iAS2 - 1;
                        aivyVar2.b |= 32;
                    }
                    if (((acmi) alaaVar).c.size() > 0) {
                        ((defpackage.afpl) obj5).s(alaaVar, ((acmi) alaaVar).c, akzxVarArr[i], arrayList);
                    }
                    i--;
                    obj4 = obj5;
                    hashSet = hashSet2;
                }
                final java.util.HashSet hashSet3 = hashSet;
                ajcq ajcqVarZ = arrayList.isEmpty() ? aiql.z(akzxVarArr) : aiql.aa(arrayList).b(new defpackage.wzc(arrayList, akzxVarArr, 15), ajbm.a);
                android.util.SparseIntArray sparseIntArray = ((acnk) aclvVar).d;
                anpu anpuVarAb = aiql.ab(new ajcq[]{ajcqVarZ});
                defpackage.wzc wzcVar = new defpackage.wzc(ajcqVarZ, sparseIntArray, 14, null);
                ajbm ajbmVar = ajbm.a;
                final ajcq ajcqVarB = anpuVarAb.b(wzcVar, ajbmVar);
                final ajcq ajcqVarZ2 = aiql.z(new java.util.HashMap());
                final ajcq ajcqVarB2 = aiql.ab(new ajcq[]{ajcqVarB, ajcqVarZ2}).b(new java.util.concurrent.Callable() { // from class: acog
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        int i3;
                        int i4;
                        int i5;
                        akzz[] akzzVarArr = (akzz[]) aiql.H(ajcqVarB);
                        java.util.Map map = (java.util.Map) aiql.H(ajcqVarZ2);
                        akzx akzxVarM = defpackage.aiva.a.m();
                        acnk acnkVar = aclvVar;
                        aiwd aiwdVar = acnkVar.a;
                        akzxVarM.u();
                        defpackage.aiva aivaVar = (defpackage.aiva) akzxVarM.b;
                        j$.util.Objects.requireNonNull(aiwdVar);
                        aivaVar.c = aiwdVar;
                        boolean z = true;
                        aivaVar.b |= 1;
                        akzx akzxVarM2 = defpackage.aivk.a.m();
                        java.util.List<defpackage.acnj> list2 = acnkVar.b;
                        for (defpackage.acnj acnjVar : list2) {
                            int i6 = acnjVar.b - 1;
                            int i7 = 3;
                            if (i6 != 0) {
                                aiwd aiwdVarAt = aaoo.at(acnjVar, z);
                                ahvr.cj(aiwdVarAt, "SHOW and HIDE grafts must have a parent.");
                                aaoo.av(aiwdVarAt, acnjVar, acnkVar, akzxVarM);
                                acmi acmiVarF = abrz.f(acnjVar);
                                akzx akzxVarM3 = defpackage.aivl.a.m();
                                aiwc aiwcVar2 = acmiVarF.d;
                                if (aiwcVar2 == null) {
                                    aiwcVar2 = aiwc.a;
                                }
                                akzxVarM3.u();
                                defpackage.aivl aivlVar = (defpackage.aivl) akzxVarM3.b;
                                j$.util.Objects.requireNonNull(aiwcVar2);
                                aivlVar.e = aiwcVar2;
                                aivlVar.d = 2;
                                if ((aiwdVarAt.b & 2) != 0) {
                                    akzxVarM3.u();
                                    defpackage.aivl aivlVar2 = (defpackage.aivl) akzxVarM3.b;
                                    j$.util.Objects.requireNonNull(aiwdVarAt);
                                    aivlVar2.c = aiwdVarAt;
                                    aivlVar2.b = 3;
                                    i5 = 1;
                                } else {
                                    aiwe aiweVar = aiwdVarAt.c;
                                    if (aiweVar == null) {
                                        aiweVar = aiwe.a;
                                    }
                                    akzxVarM3.u();
                                    defpackage.aivl aivlVar3 = (defpackage.aivl) akzxVarM3.b;
                                    j$.util.Objects.requireNonNull(aiweVar);
                                    aivlVar3.c = aiweVar;
                                    i5 = 1;
                                    aivlVar3.b = 1;
                                }
                                akzz akzzVarM = defpackage.aivj.a.m();
                                if (i6 == 0) {
                                    i7 = 4;
                                } else if (i6 == i5) {
                                    i7 = 2;
                                }
                                akzzVarM.u();
                                defpackage.aivj aivjVar = akzzVarM.b;
                                aivjVar.d = i7 - 1;
                                aivjVar.b |= 2;
                                defpackage.aivl aivlVar4 = (defpackage.aivl) akzxVarM3.p();
                                akzzVarM.u();
                                defpackage.aivj aivjVar2 = akzzVarM.b;
                                j$.util.Objects.requireNonNull(aivlVar4);
                                aivjVar2.c = aivlVar4;
                                aivjVar2.b |= 1;
                                if ((acmiVarF.b & 4) != 0) {
                                    long j = acmiVarF.f;
                                    akzzVarM.u();
                                    defpackage.aivj aivjVar3 = akzzVarM.b;
                                    aivjVar3.b |= 16;
                                    aivjVar3.f = j;
                                }
                                aaoo.aw(akzzVarM, (akzz[]) map.get(acnjVar));
                                akzxVarM2.au(akzzVarM.p());
                            } else {
                                acmi acmiVarF2 = abrz.f(acnjVar);
                                if ((acmiVarF2.b & 4) != 0) {
                                    aiwc aiwcVar3 = acmiVarF2.d;
                                    if (aiwcVar3 == null) {
                                        aiwcVar3 = aiwc.a;
                                    }
                                    akzz akzzVar = akzzVarArr[aiwcVar3.c];
                                    apdi apdiVar4 = defpackage.aivg.a;
                                    akzx akzxVarM4 = defpackage.aive.a.m();
                                    akzx akzxVarM5 = defpackage.aivf.a.m();
                                    long j2 = acmiVarF2.f / 1000;
                                    akzxVarM5.u();
                                    defpackage.aivf aivfVar = (defpackage.aivf) akzxVarM5.b;
                                    i3 = 1;
                                    aivfVar.b |= 1;
                                    aivfVar.c = j2;
                                    defpackage.aivf aivfVar2 = (defpackage.aivf) akzxVarM5.p();
                                    akzxVarM4.u();
                                    defpackage.aive aiveVar = (defpackage.aive) akzxVarM4.b;
                                    j$.util.Objects.requireNonNull(aivfVar2);
                                    aiveVar.c = aivfVar2;
                                    aiveVar.b |= 1;
                                    akzzVar.bV(apdiVar4, (defpackage.aive) akzxVarM4.p());
                                } else {
                                    i3 = 1;
                                }
                                aiwd aiwdVarAt2 = aaoo.at(acnjVar, false);
                                if (aiwdVarAt2 == null) {
                                    ahvr.bZ(list2.size() == i3, "Impressions must be in their own event.");
                                    acmi acmiVarE5 = abrz.e(acnkVar);
                                    apdi apdiVar5 = defpackage.acoj.a;
                                    acmiVarE5.c(apdiVar5);
                                    akzs akzsVar4 = ((alaa) acmiVarE5).n;
                                    alac alacVar = (alac) apdiVar5.a;
                                    if (akzsVar4.l(alacVar)) {
                                        acmiVarE5.c(apdiVar5);
                                        java.lang.Object objJ4 = ((alaa) acmiVarE5).n.j(alacVar);
                                        if (objJ4 == null) {
                                            objJ4 = apdiVar5.b;
                                        } else {
                                            apdiVar5.c(objJ4);
                                        }
                                        akzz akzzVarM2 = aivx.a.m();
                                        int i8 = ((defpackage.acny) objJ4).b;
                                        akzzVarM2.u();
                                        aivx aivxVar = akzzVarM2.b;
                                        aivxVar.b |= 4;
                                        aivxVar.d = i8;
                                        aivx aivxVarP = akzzVarM2.p();
                                        akzxVarM.u();
                                        defpackage.aiva aivaVar2 = (defpackage.aiva) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(aivxVarP);
                                        aivaVar2.f = aivxVarP;
                                        aivaVar2.b |= 16;
                                    }
                                    apdi apdiVar6 = defpackage.acoj.b;
                                    acmiVarE5.c(apdiVar6);
                                    akzs akzsVar5 = ((alaa) acmiVarE5).n;
                                    alac alacVar2 = (alac) apdiVar6.a;
                                    if (akzsVar5.l(alacVar2)) {
                                        acmiVarE5.c(apdiVar6);
                                        java.lang.Object objJ5 = ((alaa) acmiVarE5).n.j(alacVar2);
                                        if (objJ5 == null) {
                                            objJ5 = apdiVar6.b;
                                        } else {
                                            apdiVar6.c(objJ5);
                                        }
                                        aiwd aiwdVar2 = (aiwd) objJ5;
                                        akzxVarM.u();
                                        defpackage.aiva aivaVar3 = (defpackage.aiva) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(aiwdVar2);
                                        aivaVar3.e = aiwdVar2;
                                        aivaVar3.b |= 2;
                                    }
                                    akzzVarArr = akzzVarArr;
                                    aaoo.au(acnjVar.c(), false, akzzVarArr, acnkVar, map, akzxVarM, akzxVarM2);
                                } else {
                                    aiwc aiwcVar4 = ((acmi) acnjVar.a.get(1)).d;
                                    if (aiwcVar4 == null) {
                                        akzzVarArr = akzzVarArr;
                                        aiwcVar4 = aiwc.a;
                                    }
                                    akzzVarArr = akzzVarArr;
                                    ahvr.bY((aiwcVar4.b & 2048) != 0);
                                    akzz akzzVarM3 = defpackage.aivj.a.m();
                                    akzzVarM3.u();
                                    defpackage.aivj aivjVar4 = akzzVarM3.b;
                                    aivjVar4.d = 3;
                                    aivjVar4.b |= 2;
                                    defpackage.aivl aivlVar5 = defpackage.aivl.a;
                                    akzx akzxVarM6 = aivlVar5.m();
                                    akzxVarM6.u();
                                    defpackage.aivl aivlVar6 = (defpackage.aivl) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(aiwdVarAt2);
                                    aivlVar6.c = aiwdVarAt2;
                                    aivlVar6.b = 3;
                                    akzxVarM6.u();
                                    defpackage.aivl aivlVar7 = (defpackage.aivl) akzxVarM6.b;
                                    j$.util.Objects.requireNonNull(aiwcVar4);
                                    aivlVar7.e = aiwcVar4;
                                    aivlVar7.d = 2;
                                    defpackage.aivl aivlVar8 = (defpackage.aivl) akzxVarM6.p();
                                    akzzVarM3.u();
                                    defpackage.aivj aivjVar5 = akzzVarM3.b;
                                    j$.util.Objects.requireNonNull(aivlVar8);
                                    aivjVar5.c = aivlVar8;
                                    aivjVar5.b |= 1;
                                    aaoo.aw(akzzVarM3, (akzz[]) map.get(acnjVar));
                                    acmi acmiVarF3 = abrz.f(acnjVar);
                                    apdi apdiVar7 = defpackage.acoi.a;
                                    acmiVarF3.c(apdiVar7);
                                    boolean zL = ((alaa) acmiVarF3).n.l((alac) apdiVar7.a);
                                    if (zL) {
                                        akzzVarM3.u();
                                        defpackage.aivj aivjVar6 = akzzVarM3.b;
                                        aivjVar6.b |= 32;
                                        i4 = 1;
                                        aivjVar6.g = true;
                                    } else {
                                        i4 = 1;
                                    }
                                    aaoo.au(acnjVar.c(), zL, akzzVarArr, acnkVar, map, akzxVarM, akzxVarM2);
                                    if (list2.size() == i4) {
                                        akzxVarM2.au(akzzVarM3.p());
                                    } else {
                                        akzx akzxVarM7 = aivlVar5.m();
                                        aiwc aiwcVar5 = abrz.f(acnjVar).d;
                                        if (aiwcVar5 == null) {
                                            aiwcVar5 = aiwc.a;
                                        }
                                        akzxVarM7.u();
                                        defpackage.aivl aivlVar9 = (defpackage.aivl) akzxVarM7.b;
                                        j$.util.Objects.requireNonNull(aiwcVar5);
                                        aivlVar9.e = aiwcVar5;
                                        aivlVar9.d = 2;
                                        defpackage.aivl aivlVar10 = (defpackage.aivl) akzxVarM7.p();
                                        akzzVarM3.u();
                                        defpackage.aivj aivjVar7 = akzzVarM3.b;
                                        j$.util.Objects.requireNonNull(aivlVar10);
                                        aivjVar7.e = aivlVar10;
                                        aivjVar7.b |= 4;
                                        akzxVarM2.u();
                                        defpackage.aivk aivkVar = (defpackage.aivk) akzxVarM2.b;
                                        defpackage.aivj aivjVarP = akzzVarM3.p();
                                        j$.util.Objects.requireNonNull(aivjVarP);
                                        aivkVar.b();
                                        aivkVar.b.add(aivjVarP);
                                    }
                                    aaoo.av(aiwdVarAt2, acnjVar, acnkVar, akzxVarM);
                                }
                            }
                            z = true;
                        }
                        acmi acmiVarE6 = abrz.e(acnkVar);
                        apdi apdiVar8 = defpackage.acol.a;
                        acmiVarE6.c(apdiVar8);
                        if (((alaa) acmiVarE6).n.l((alac) apdiVar8.a)) {
                            akzx akzxVarM8 = defpackage.aivb.a.m();
                            aiwc aiwcVar6 = acmiVarE6.d;
                            if (aiwcVar6 == null) {
                                aiwcVar6 = aiwc.a;
                            }
                            aiwd aiwdVar3 = aiwcVar6.e;
                            if (aiwdVar3 == null) {
                                aiwdVar3 = aiwd.a;
                            }
                            akzxVarM8.u();
                            defpackage.aivb aivbVar = (defpackage.aivb) akzxVarM8.b;
                            j$.util.Objects.requireNonNull(aiwdVar3);
                            aivbVar.c = aiwdVar3;
                            aivbVar.b |= 1;
                            defpackage.aivb aivbVar2 = (defpackage.aivb) akzxVarM8.p();
                            akzxVarM.u();
                            defpackage.aiva aivaVar4 = (defpackage.aiva) akzxVarM.b;
                            j$.util.Objects.requireNonNull(aivbVar2);
                            aivaVar4.h = aivbVar2;
                            aivaVar4.b |= 128;
                        }
                        if (((defpackage.aivk) akzxVarM2.b).b.size() > 0) {
                            defpackage.aivk aivkVar2 = (defpackage.aivk) akzxVarM2.p();
                            akzxVarM.u();
                            defpackage.aiva aivaVar5 = (defpackage.aiva) akzxVarM.b;
                            j$.util.Objects.requireNonNull(aivkVar2);
                            aivaVar5.g = aivkVar2;
                            aivaVar5.b |= 64;
                        }
                        for (akzz akzzVar2 : akzzVarArr) {
                            akzxVarM.u();
                            defpackage.aiva aivaVar6 = (defpackage.aiva) akzxVarM.b;
                            aivy aivyVarP = akzzVar2.p();
                            j$.util.Objects.requireNonNull(aivyVarP);
                            alat alatVar = aivaVar6.d;
                            if (!alatVar.c()) {
                                aivaVar6.d = alad.J(alatVar);
                            }
                            aivaVar6.d.add(aivyVarP);
                        }
                        return (defpackage.aiva) akzxVarM.p();
                    }
                }, ajbmVar);
                ajcqVarC = aiql.ab(new ajcq[]{ajcqVarD, ajcqVarG, ajcqVarE, ajcqVarB2}).c(ahqx.b(new ajas() { // from class: acnw
                    public final ajcq a() {
                        int[] iArr = (int[]) aiql.H(ajcqVarE);
                        aclw aclwVar2 = aclwVar;
                        java.util.Set set = hashSet3;
                        if (iArr != null) {
                            set.addAll(aiql.U(iArr));
                        }
                        aclv aclvVar2 = aclvVar;
                        ajcq ajcqVar2 = ajcqVarG;
                        ahyn ahynVar2 = ahynVar;
                        ajcq ajcqVar3 = ajcqVarB2;
                        ajcq ajcqVar4 = ajcqVarD;
                        zzl zzlVar2 = zzlVar;
                        java.lang.String str2 = str;
                        defpackage.acnx acnxVar = this.a;
                        defpackage.agbc agbcVarA = defpackage.aclx.a();
                        agbcVarA.d(str2);
                        agbcVarA.b = zzlVar2;
                        agbcVarA.e((albh) aiql.H(ajcqVar4));
                        agbcVarA.g = (defpackage.aiva) aiql.H(ajcqVar3);
                        agbcVarA.e = (java.lang.Integer) ahynVar2.e();
                        agbcVarA.d = (int[]) aiql.H(ajcqVar2);
                        defpackage.acnm acnmVar2 = acnxVar.a;
                        acnmVar2.h(aclvVar2);
                        agbcVarA.a = 1;
                        acnmVar2.b(aclvVar2);
                        if (!set.isEmpty()) {
                            agbcVarA.c = aiql.W(set);
                        }
                        ahoq ahoqVarW2 = ahvr.W(1256, "GIL:ClearcutTransmitter");
                        try {
                            ajcq ajcqVarB3 = acnxVar.b.b(agbcVarA.c(), aclwVar2.b);
                            ahoqVarW2.a(ajcqVarB3);
                            ahoqVarW2.close();
                            return ajcqVarB3;
                        } catch (java.lang.Throwable th) {
                            try {
                                ahoqVarW2.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), ajbmVar);
                ahoqVarW.a(ajcqVarC);
            }
            ahoqVarW.close();
            return ajcqVarC;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final java.util.Set b() {
        return new aile(acnk.class);
    }
}
