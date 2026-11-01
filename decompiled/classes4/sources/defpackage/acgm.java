package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class acgm {
    private static final defpackage.acgc a = new defpackage.acgc();

    /* JADX WARN: Code duplicated, block: B:102:0x025a  */
    /* JADX WARN: Code duplicated, block: B:104:0x025e  */
    /* JADX WARN: Code duplicated, block: B:168:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0199  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0215  */
    /* JADX WARN: Code duplicated, block: B:92:0x021c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0233  */
    /* JADX WARN: Code duplicated, block: B:97:0x024e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0252  */
    public static defpackage.akhl a(defpackage.aksx aksxVar) {
        defpackage.aktu aktuVar;
        akzx akzxVarM;
        java.util.Iterator it;
        defpackage.akts aktsVar;
        defpackage.akkl akklVar;
        alat alatVar;
        akzx akzxVarM2;
        akzm akzmVar;
        akzm akzmVar2;
        akzm akzmVar3;
        akzm akzmVar4;
        akzm akzmVar5;
        akzm akzmVar6;
        defpackage.aktu aktuVar2 = aksxVar.m;
        if (aktuVar2 == null) {
            aktuVar2 = defpackage.aktu.a;
        }
        defpackage.akts aktsVar2 = aktuVar2.d;
        if (aktsVar2 == null) {
            aktsVar2 = defpackage.akts.a;
        }
        akzx akzxVarM3 = defpackage.akhl.a.m();
        defpackage.akhq akhqVar = defpackage.akhq.a;
        akzx akzxVarM4 = akhqVar.m();
        defpackage.aktq aktqVar = aktsVar2.i;
        if (aktqVar == null) {
            aktqVar = defpackage.aktq.a;
        }
        int i = (int) aktqVar.c;
        akzxVarM4.u();
        ((defpackage.akhq) akzxVarM4.b).b = i;
        akzxVarM3.u();
        defpackage.akhl akhlVar = (defpackage.akhl) akzxVarM3.b;
        defpackage.akhq akhqVar2 = (defpackage.akhq) akzxVarM4.p();
        j$.util.Objects.requireNonNull(akhqVar2);
        akhlVar.c = akhqVar2;
        akhlVar.b |= 1;
        if (((aksxVar.c == 25 ? (defpackage.aksz) aksxVar.d : defpackage.aksz.a).b & 1) != 0) {
            defpackage.akup akupVar = (aksxVar.c == 25 ? (defpackage.aksz) aksxVar.d : defpackage.aksz.a).c;
            if (akupVar == null) {
                akupVar = defpackage.akup.a;
            }
            defpackage.akhq akhqVar3 = ((defpackage.akhl) akzxVarM3.b).c;
            if (akhqVar3 != null) {
                akhqVar = akhqVar3;
            }
            akzx akzxVarP = akhqVar.p();
            alak alakVar = akupVar.h;
            akzxVarP.u();
            defpackage.akhq akhqVar4 = (defpackage.akhq) akzxVarP.b;
            alak alakVar2 = akhqVar4.c;
            if (!alakVar2.c()) {
                akhqVar4.c = alad.H(alakVar2);
            }
            akyl.i(alakVar, akhqVar4.c);
            akzxVarM3.u();
            defpackage.akhl akhlVar2 = (defpackage.akhl) akzxVarM3.b;
            defpackage.akhq akhqVar5 = (defpackage.akhq) akzxVarP.p();
            j$.util.Objects.requireNonNull(akhqVar5);
            akhlVar2.c = akhqVar5;
            akhlVar2.b |= 1;
            if (akmr.f(akupVar.c) != 8) {
                defpackage.akjx akjxVarApply = a.apply(akupVar);
                akzxVarM3.u();
                defpackage.akhl akhlVar3 = (defpackage.akhl) akzxVarM3.b;
                j$.util.Objects.requireNonNull(akjxVarApply);
                akhlVar3.h = akjxVarApply;
                akhlVar3.b |= 8;
            }
        }
        if ((aksxVar.b & 32) != 0) {
            long j = aksxVar.h;
            akzxVarM3.u();
            defpackage.akhl akhlVar4 = (defpackage.akhl) akzxVarM3.b;
            akhlVar4.b |= 512;
            akhlVar4.k = j;
        }
        defpackage.aktu aktuVar3 = aksxVar.m;
        if (aktuVar3 == null) {
            aktuVar3 = defpackage.aktu.a;
        }
        if (aktuVar3.c.isEmpty()) {
            int i2 = aktsVar2.b;
            if ((i2 & 1) != 0 || (i2 & 16) != 0 || (i2 & 4) != 0 || !aktsVar2.g.isEmpty()) {
                aktuVar = aksxVar.m;
                if (aktuVar == null) {
                    aktuVar = defpackage.aktu.a;
                }
                akzxVarM = defpackage.akkl.a.m();
                it = aktuVar.c.iterator();
                while (it.hasNext()) {
                    java.lang.Object objApply = defpackage.acgj.a.apply((defpackage.aktt) it.next());
                    akzxVarM.u();
                    akklVar = (defpackage.akkl) akzxVarM.b;
                    j$.util.Objects.requireNonNull(objApply);
                    alatVar = akklVar.c;
                    if (!alatVar.c()) {
                        akklVar.c = alad.J(alatVar);
                    }
                    akklVar.c.add(objApply);
                }
                if ((aktuVar.b & 1) != 0) {
                    ahyc ahycVar = defpackage.acgj.b;
                    aktsVar = aktuVar.d;
                    if (aktsVar == null) {
                        aktsVar = defpackage.akts.a;
                    }
                    java.lang.Object objApply2 = ahycVar.apply(aktsVar);
                    akzxVarM.u();
                    defpackage.akkl akklVar2 = (defpackage.akkl) akzxVarM.b;
                    j$.util.Objects.requireNonNull(objApply2);
                    akklVar2.d = (defpackage.akkj) objApply2;
                    akklVar2.b |= 1;
                }
                defpackage.akkl akklVar3 = (defpackage.akkl) akzxVarM.p();
                akzxVarM3.u();
                defpackage.akhl akhlVar5 = (defpackage.akhl) akzxVarM3.b;
                j$.util.Objects.requireNonNull(akklVar3);
                akhlVar5.g = akklVar3;
                akhlVar5.b |= 4;
            }
        } else {
            aktuVar = aksxVar.m;
            if (aktuVar == null) {
                aktuVar = defpackage.aktu.a;
            }
            akzxVarM = defpackage.akkl.a.m();
            it = aktuVar.c.iterator();
            while (it.hasNext()) {
                java.lang.Object objApply3 = defpackage.acgj.a.apply((defpackage.aktt) it.next());
                akzxVarM.u();
                akklVar = (defpackage.akkl) akzxVarM.b;
                j$.util.Objects.requireNonNull(objApply3);
                alatVar = akklVar.c;
                if (!alatVar.c()) {
                    akklVar.c = alad.J(alatVar);
                }
                akklVar.c.add(objApply3);
            }
            if ((aktuVar.b & 1) != 0) {
                ahyc ahycVar2 = defpackage.acgj.b;
                aktsVar = aktuVar.d;
                if (aktsVar == null) {
                    aktsVar = defpackage.akts.a;
                }
                java.lang.Object objApply4 = ahycVar2.apply(aktsVar);
                akzxVarM.u();
                defpackage.akkl akklVar4 = (defpackage.akkl) akzxVarM.b;
                j$.util.Objects.requireNonNull(objApply4);
                akklVar4.d = (defpackage.akkj) objApply4;
                akklVar4.b |= 1;
            }
            defpackage.akkl akklVar5 = (defpackage.akkl) akzxVarM.p();
            akzxVarM3.u();
            defpackage.akhl akhlVar6 = (defpackage.akhl) akzxVarM3.b;
            j$.util.Objects.requireNonNull(akklVar5);
            akhlVar6.g = akklVar5;
            akhlVar6.b |= 4;
        }
        defpackage.aktq aktqVar2 = aktsVar2.i;
        if (((aktqVar2 == null ? defpackage.aktq.a : aktqVar2).b & 2) != 0) {
            if (aktqVar2 == null) {
                aktqVar2 = defpackage.aktq.a;
            }
            akzxVarM2 = defpackage.akhp.a.m();
            boolean z = aktqVar2.f;
            akzxVarM2.u();
            defpackage.akhp akhpVar = (defpackage.akhp) akzxVarM2.b;
            akhpVar.b |= 2;
            akhpVar.e = z;
            akzmVar = aldf.a;
            if ((aktqVar2.b & 4) != 0) {
                defpackage.akho akhoVar = defpackage.akho.a;
                akzx akzxVarM5 = akhoVar.m();
                akzxVarM5.u();
                ((defpackage.akho) akzxVarM5.b).c = defpackage.akky.d(8);
                akzmVar5 = aktqVar2.e;
                if (akzmVar5 == null) {
                    akzmVar5 = akzm.a;
                }
                akzxVarM5.u();
                defpackage.akho akhoVar2 = (defpackage.akho) akzxVarM5.b;
                j$.util.Objects.requireNonNull(akzmVar5);
                akhoVar2.d = akzmVar5;
                akhoVar2.b |= 1;
                akzxVarM2.aC(akzxVarM5);
                akzx akzxVarM6 = akhoVar.m();
                akzxVarM6.u();
                ((defpackage.akho) akzxVarM6.b).c = defpackage.akky.d(3);
                akzmVar6 = aktqVar2.e;
                if (akzmVar6 == null) {
                    akzmVar6 = akzm.a;
                }
                akzxVarM6.u();
                defpackage.akho akhoVar3 = (defpackage.akho) akzxVarM6.b;
                j$.util.Objects.requireNonNull(akzmVar6);
                akhoVar3.d = akzmVar6;
                akhoVar3.b |= 1;
                akzxVarM2.aC(akzxVarM6);
                akzmVar = aktqVar2.e;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
            }
            if ((aktqVar2.b & 2) != 0) {
                akzx akzxVarM7 = defpackage.akho.a.m();
                akzxVarM7.u();
                ((defpackage.akho) akzxVarM7.b).c = defpackage.akky.d(4);
                akzmVar2 = aktqVar2.d;
                if (akzmVar2 == null) {
                    akzmVar2 = akzm.a;
                }
                akzxVarM7.u();
                defpackage.akho akhoVar4 = (defpackage.akho) akzxVarM7.b;
                j$.util.Objects.requireNonNull(akzmVar2);
                akhoVar4.d = akzmVar2;
                akhoVar4.b |= 1;
                akzxVarM2.aC(akzxVarM7);
                if ((aktqVar2.b & 4) == 0) {
                    akzmVar3 = aktqVar2.d;
                    if (akzmVar3 == null) {
                        akzmVar3 = akzm.a;
                    }
                    akzmVar = akzmVar3;
                } else {
                    akzmVar4 = aktqVar2.d;
                    if (akzmVar4 == null) {
                        akzmVar4 = akzm.a;
                    }
                    if (akmr.i(akzmVar, akzmVar4) > 0) {
                        akzmVar3 = aktqVar2.d;
                        if (akzmVar3 == null) {
                            akzmVar3 = akzm.a;
                        }
                        akzmVar = akzmVar3;
                    }
                }
            }
            akzxVarM2.u();
            defpackage.akhp akhpVar2 = (defpackage.akhp) akzxVarM2.b;
            j$.util.Objects.requireNonNull(akzmVar);
            akhpVar2.d = akzmVar;
            akhpVar2.b |= 1;
            defpackage.akhp akhpVar3 = (defpackage.akhp) akzxVarM2.p();
            akzxVarM3.u();
            defpackage.akhl akhlVar7 = (defpackage.akhl) akzxVarM3.b;
            j$.util.Objects.requireNonNull(akhpVar3);
            akhlVar7.j = akhpVar3;
            akhlVar7.b |= 256;
        } else if (((aktqVar2 == null ? defpackage.aktq.a : aktqVar2).b & 4) != 0) {
            if (aktqVar2 == null) {
                aktqVar2 = defpackage.aktq.a;
            }
            akzxVarM2 = defpackage.akhp.a.m();
            boolean z2 = aktqVar2.f;
            akzxVarM2.u();
            defpackage.akhp akhpVar4 = (defpackage.akhp) akzxVarM2.b;
            akhpVar4.b |= 2;
            akhpVar4.e = z2;
            akzmVar = aldf.a;
            if ((aktqVar2.b & 4) != 0) {
                defpackage.akho akhoVar5 = defpackage.akho.a;
                akzx akzxVarM8 = akhoVar5.m();
                akzxVarM8.u();
                ((defpackage.akho) akzxVarM8.b).c = defpackage.akky.d(8);
                akzmVar5 = aktqVar2.e;
                if (akzmVar5 == null) {
                    akzmVar5 = akzm.a;
                }
                akzxVarM8.u();
                defpackage.akho akhoVar6 = (defpackage.akho) akzxVarM8.b;
                j$.util.Objects.requireNonNull(akzmVar5);
                akhoVar6.d = akzmVar5;
                akhoVar6.b |= 1;
                akzxVarM2.aC(akzxVarM8);
                akzx akzxVarM9 = akhoVar5.m();
                akzxVarM9.u();
                ((defpackage.akho) akzxVarM9.b).c = defpackage.akky.d(3);
                akzmVar6 = aktqVar2.e;
                if (akzmVar6 == null) {
                    akzmVar6 = akzm.a;
                }
                akzxVarM9.u();
                defpackage.akho akhoVar7 = (defpackage.akho) akzxVarM9.b;
                j$.util.Objects.requireNonNull(akzmVar6);
                akhoVar7.d = akzmVar6;
                akhoVar7.b |= 1;
                akzxVarM2.aC(akzxVarM9);
                akzmVar = aktqVar2.e;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
            }
            if ((aktqVar2.b & 2) != 0) {
                akzx akzxVarM10 = defpackage.akho.a.m();
                akzxVarM10.u();
                ((defpackage.akho) akzxVarM10.b).c = defpackage.akky.d(4);
                akzmVar2 = aktqVar2.d;
                if (akzmVar2 == null) {
                    akzmVar2 = akzm.a;
                }
                akzxVarM10.u();
                defpackage.akho akhoVar8 = (defpackage.akho) akzxVarM10.b;
                j$.util.Objects.requireNonNull(akzmVar2);
                akhoVar8.d = akzmVar2;
                akhoVar8.b |= 1;
                akzxVarM2.aC(akzxVarM10);
                if ((aktqVar2.b & 4) == 0) {
                    akzmVar3 = aktqVar2.d;
                    if (akzmVar3 == null) {
                        akzmVar3 = akzm.a;
                    }
                    akzmVar = akzmVar3;
                } else {
                    akzmVar4 = aktqVar2.d;
                    if (akzmVar4 == null) {
                        akzmVar4 = akzm.a;
                    }
                    if (akmr.i(akzmVar, akzmVar4) > 0) {
                        akzmVar3 = aktqVar2.d;
                        if (akzmVar3 == null) {
                            akzmVar3 = akzm.a;
                        }
                        akzmVar = akzmVar3;
                    }
                }
            }
            akzxVarM2.u();
            defpackage.akhp akhpVar5 = (defpackage.akhp) akzxVarM2.b;
            j$.util.Objects.requireNonNull(akzmVar);
            akhpVar5.d = akzmVar;
            akhpVar5.b |= 1;
            defpackage.akhp akhpVar6 = (defpackage.akhp) akzxVarM2.p();
            akzxVarM3.u();
            defpackage.akhl akhlVar8 = (defpackage.akhl) akzxVarM3.b;
            j$.util.Objects.requireNonNull(akhpVar6);
            akhlVar8.j = akhpVar6;
            akhlVar8.b |= 256;
        }
        if ((aktsVar2.b & 8) != 0) {
            defpackage.aksp akspVar = aktsVar2.f;
            if (akspVar == null) {
                akspVar = defpackage.aksp.a;
            }
            akzx akzxVarM11 = defpackage.akit.a.m();
            java.util.Iterator it2 = akspVar.b.iterator();
            while (it2.hasNext()) {
                java.lang.Object objApply5 = acfx.a.apply((aksn) it2.next());
                akzxVarM11.u();
                defpackage.akit akitVar = (defpackage.akit) akzxVarM11.b;
                j$.util.Objects.requireNonNull(objApply5);
                alat alatVar2 = akitVar.b;
                if (!alatVar2.c()) {
                    akitVar.b = alad.J(alatVar2);
                }
                akitVar.b.add(objApply5);
            }
            defpackage.akit akitVar2 = (defpackage.akit) akzxVarM11.p();
            akzxVarM3.u();
            defpackage.akhl akhlVar9 = (defpackage.akhl) akzxVarM3.b;
            j$.util.Objects.requireNonNull(akitVar2);
            akhlVar9.f = akitVar2;
            akhlVar9.b |= 2;
        }
        if ((aksxVar.b & 32768) != 0) {
            alcf alcfVarD = aldi.d(aksxVar.j);
            akzxVarM3.u();
            defpackage.akhl akhlVar10 = (defpackage.akhl) akzxVarM3.b;
            j$.util.Objects.requireNonNull(alcfVarD);
            akhlVar10.i = alcfVarD;
            akhlVar10.b |= 64;
        }
        if ((aksxVar.b & 1048576) != 0) {
            defpackage.aktg aktgVar = aksxVar.l;
            if (aktgVar == null) {
                aktgVar = defpackage.aktg.a;
            }
            akzx akzxVarM12 = defpackage.akjy.a.m();
            if ((aktgVar.b & 1) != 0) {
                double d = aktgVar.c;
                akzxVarM12.u();
                defpackage.akjy akjyVar = (defpackage.akjy) akzxVarM12.b;
                akjyVar.b |= 1;
                akjyVar.c = d;
            }
            defpackage.akjy akjyVar2 = (defpackage.akjy) akzxVarM12.p();
            akzxVarM3.u();
            defpackage.akhl akhlVar11 = (defpackage.akhl) akzxVarM3.b;
            j$.util.Objects.requireNonNull(akjyVar2);
            akhlVar11.l = akjyVar2;
            akhlVar11.b |= 1024;
        }
        if ((aksxVar.b & 16) != 0) {
            defpackage.aksv aksvVar = aksxVar.g;
            if (aksvVar == null) {
                aksvVar = defpackage.aksv.a;
            }
            defpackage.aksy aksyVar = aksvVar.b;
            if (aksyVar == null) {
                aksyVar = defpackage.aksy.a;
            }
            java.lang.String str = aksyVar.b;
            akzxVarM3.u();
            defpackage.akhl akhlVar12 = (defpackage.akhl) akzxVarM3.b;
            j$.util.Objects.requireNonNull(str);
            akhlVar12.d = str;
        }
        for (defpackage.aksu aksuVar : aksxVar.p) {
            akzx akzxVarM13 = defpackage.akhk.a.m();
            int i3 = aksuVar.b;
            akzxVarM13.u();
            ((defpackage.akhk) akzxVarM13.b).b = i3;
            akzxVarM3.u();
            defpackage.akhl akhlVar13 = (defpackage.akhl) akzxVarM3.b;
            defpackage.akhk akhkVar = (defpackage.akhk) akzxVarM13.p();
            j$.util.Objects.requireNonNull(akhkVar);
            alat alatVar3 = akhlVar13.e;
            if (!alatVar3.c()) {
                akhlVar13.e = alad.J(alatVar3);
            }
            akhlVar13.e.add(akhkVar);
        }
        defpackage.aksq aksqVar = aksxVar.r;
        if (aksqVar == null) {
            aksqVar = defpackage.aksq.a;
        }
        int iAR = a.aR(aksqVar.b);
        if (iAR == 0 || iAR != 2) {
            defpackage.akjx akjxVar = ((defpackage.akhl) akzxVarM3.b).h;
            if (akjxVar == null) {
                akjxVar = defpackage.akjx.a;
            }
            akzx akzxVarP2 = akjxVar.p();
            akzxVarP2.u();
            defpackage.akjx akjxVar2 = (defpackage.akjx) akzxVarP2.b;
            akjxVar2.b |= 4;
            akjxVar2.f = true;
            akzxVarM3.u();
            defpackage.akhl akhlVar14 = (defpackage.akhl) akzxVarM3.b;
            defpackage.akjx akjxVar3 = (defpackage.akjx) akzxVarP2.p();
            j$.util.Objects.requireNonNull(akjxVar3);
            akhlVar14.h = akjxVar3;
            akhlVar14.b |= 8;
        }
        return (defpackage.akhl) akzxVarM3.p();
    }
}
