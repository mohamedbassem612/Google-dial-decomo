package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijs extends aomh implements aonn {
    final /* synthetic */ defpackage.ijt a;
    final /* synthetic */ defpackage.ihu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijs(defpackage.ijt ijtVar, defpackage.ihu ihuVar, aoln aolnVar) {
        super(2, aolnVar);
        this.a = ijtVar;
        this.b = ihuVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        defpackage.ijt ijtVar = this.a;
        akzx akzxVar = ijtVar.b;
        defpackage.ihu ihuVar = this.b;
        aooh.f(ihuVar, "<this>");
        akzx akzxVarM = amog.a.m();
        aooh.f(akzxVarM, "builder");
        boolean z = ihuVar.c;
        akzxVarM.u();
        amog amogVar = akzxVarM.b;
        amogVar.b |= 1;
        amogVar.c = z;
        if ((ihuVar.b & 1) != 0) {
            defpackage.iht ihtVarB = defpackage.iht.b(ihuVar.d);
            if (ihtVarB == null) {
                ihtVarB = defpackage.iht.UNRECOGNIZED;
            }
            akzxVarM.u();
            amog amogVar2 = akzxVarM.b;
            amogVar2.d = ihtVarB.a();
            amogVar2.b |= 2;
        }
        if ((ihuVar.b & 2) != 0) {
            defpackage.igi igiVar = ihuVar.e;
            if (igiVar == null) {
                igiVar = defpackage.igi.b;
            }
            aooh.e(igiVar, "getPreconditionsCheckResult(...)");
            aooh.f(igiVar, "value");
            akzxVarM.u();
            amog amogVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(igiVar);
            amogVar3.e = igiVar;
            amogVar3.b |= 4;
        }
        if ((ihuVar.b & 4) != 0) {
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarM.b.f);
            aooh.e(listUnmodifiableList, "getIndividualModelStartResultsList(...)");
            new alct(listUnmodifiableList);
            defpackage.igx igxVar = ihuVar.f;
            if (igxVar == null) {
                igxVar = defpackage.igx.a;
            }
            alat<defpackage.igv> alatVar = igxVar.c;
            aooh.e(alatVar, "getIndividualModelStartResultsList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
            for (defpackage.igv igvVar : alatVar) {
                aooh.c(igvVar);
                aooh.f(igvVar, "<this>");
                akzx akzxVarM2 = amof.a.m();
                aooh.f(akzxVarM2, "builder");
                if (igvVar.e) {
                    akzx akzxVarM3 = amoe.a.m();
                    aooh.f(akzxVarM3, "builder");
                    amoe amoeVarP = akzxVarM3.p();
                    aooh.e(amoeVarP, "build(...)");
                    amoe amoeVar = amoeVarP;
                    aooh.f(amoeVar, "value");
                    akzxVarM2.u();
                    amof amofVar = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(amoeVar);
                    amofVar.c = amoeVar;
                    amofVar.b = 1;
                } else {
                    int i = igvVar.c;
                    if (i == 2) {
                        int iAV = a.aV(((java.lang.Integer) igvVar.d).intValue());
                        if (iAV == 0) {
                            iAV = 1;
                        }
                        akzxVarM2.u();
                        amof amofVar2 = akzxVarM2.b;
                        amofVar2.c = java.lang.Integer.valueOf(defpackage.hmr.c(iAV));
                        amofVar2.b = 2;
                    } else if (i == 3) {
                        int iD = defpackage.hhv.d(((java.lang.Integer) igvVar.d).intValue());
                        if (iD == 0) {
                            iD = 1;
                        }
                        akzxVarM2.u();
                        amof amofVar3 = akzxVarM2.b;
                        amofVar3.c = java.lang.Integer.valueOf(defpackage.hhv.c(iD));
                        amofVar3.b = 3;
                    } else if (i == 4) {
                        int iD2 = defpackage.hhe.d(((java.lang.Integer) igvVar.d).intValue());
                        if (iD2 == 0) {
                            iD2 = 1;
                        }
                        akzxVarM2.u();
                        amof amofVar4 = akzxVarM2.b;
                        amofVar4.c = java.lang.Integer.valueOf(defpackage.hhe.c(iD2));
                        amofVar4.b = 4;
                    } else if (i == 5) {
                        int iAV2 = a.aV(((java.lang.Integer) igvVar.d).intValue());
                        if (iAV2 == 0) {
                            iAV2 = 1;
                        }
                        akzxVarM2.u();
                        amof amofVar5 = akzxVarM2.b;
                        amofVar5.c = java.lang.Integer.valueOf(defpackage.hhv.b(iAV2));
                        amofVar5.b = 5;
                    }
                }
                amof amofVarP = akzxVarM2.p();
                aooh.e(amofVarP, "build(...)");
                arrayList.add(amofVarP);
            }
            akzxVarM.u();
            amog amogVar4 = akzxVarM.b;
            alat alatVar2 = amogVar4.f;
            if (!alatVar2.c()) {
                amogVar4.f = alad.J(alatVar2);
            }
            akyl.i(arrayList, amogVar4.f);
        }
        amog amogVarP = akzxVarM.p();
        aooh.e(amogVarP, "build(...)");
        amog amogVar5 = amogVarP;
        akzxVar.u();
        amoi amoiVar = akzxVar.b;
        amoi amoiVar2 = amoi.a;
        j$.util.Objects.requireNonNull(amogVar5);
        alat alatVar3 = amoiVar.b;
        if (!alatVar3.c()) {
            amoiVar.b = alad.J(alatVar3);
        }
        amoiVar.b.add(amogVar5);
        ijtVar.b = akzxVar;
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ijs(this.a, this.b, aolnVar);
    }
}
