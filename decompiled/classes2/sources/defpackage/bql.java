package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bql implements defpackage.cyk {
    private static final int f(cxf cxfVar, java.util.List list, int i, aonn aonnVar) {
        int iIntValue;
        int iIntValue2;
        java.util.List list2 = (java.util.List) list.get(0);
        java.util.List list3 = (java.util.List) list.get(1);
        java.util.List list4 = (java.util.List) list.get(2);
        java.util.List list5 = (java.util.List) list.get(3);
        java.util.List list6 = (java.util.List) list.get(4);
        int i2 = defpackage.bqg.a;
        int iO = defpackage.rq.o(i, cxfVar.dp(32.0f));
        cxe cxeVar = (cxe) ajsz.bG(list5);
        if (cxeVar != null) {
            iIntValue = ((java.lang.Number) aonnVar.a(cxeVar, java.lang.Integer.valueOf(iO))).intValue();
            iO = defpackage.rq.o(iO, cxeVar.d(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue = 0;
        }
        cxe cxeVar2 = (cxe) ajsz.bG(list6);
        if (cxeVar2 != null) {
            iIntValue2 = ((java.lang.Number) aonnVar.a(cxeVar2, java.lang.Integer.valueOf(iO))).intValue();
            iO = defpackage.rq.o(iO, cxeVar2.d(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue2 = 0;
        }
        cxe cxeVar3 = (cxe) ajsz.bG(list3);
        int iIntValue3 = cxeVar3 != null ? ((java.lang.Number) aonnVar.a(cxeVar3, java.lang.Integer.valueOf(iO))).intValue() : 0;
        cxe cxeVar4 = (cxe) ajsz.bG(list2);
        int iIntValue4 = cxeVar4 != null ? ((java.lang.Number) aonnVar.a(cxeVar4, java.lang.Integer.valueOf(iO))).intValue() : 0;
        cxe cxeVar5 = (cxe) ajsz.bG(list4);
        int iIntValue5 = cxeVar5 != null ? ((java.lang.Number) aonnVar.a(cxeVar5, java.lang.Integer.valueOf(iO))).intValue() : 0;
        int iF = defpackage.rk.f(iIntValue3 > 0, iIntValue5 > 0, defpackage.bqg.d(cxfVar, iIntValue5));
        float fA = defpackage.bqg.a(iF);
        return defpackage.bqg.b(cxfVar, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iF, cxfVar.dp(fA + fA + 0.0f), dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
    }

    private static final int g(cxf cxfVar, java.util.List list, int i, aonn aonnVar) {
        java.util.List list2 = (java.util.List) list.get(0);
        java.util.List list3 = (java.util.List) list.get(1);
        java.util.List list4 = (java.util.List) list.get(2);
        java.util.List list5 = (java.util.List) list.get(3);
        java.util.List list6 = (java.util.List) list.get(4);
        cxe cxeVar = (cxe) ajsz.bG(list5);
        int iIntValue = cxeVar != null ? ((java.lang.Number) aonnVar.a(cxeVar, java.lang.Integer.valueOf(i))).intValue() : 0;
        cxe cxeVar2 = (cxe) ajsz.bG(list6);
        int iIntValue2 = cxeVar2 != null ? ((java.lang.Number) aonnVar.a(cxeVar2, java.lang.Integer.valueOf(i))).intValue() : 0;
        cxe cxeVar3 = (cxe) ajsz.bG(list2);
        int iIntValue3 = cxeVar3 != null ? ((java.lang.Number) aonnVar.a(cxeVar3, java.lang.Integer.valueOf(i))).intValue() : 0;
        cxe cxeVar4 = (cxe) ajsz.bG(list3);
        int iIntValue4 = cxeVar4 != null ? ((java.lang.Number) aonnVar.a(cxeVar4, java.lang.Integer.valueOf(i))).intValue() : 0;
        cxe cxeVar5 = (cxe) ajsz.bG(list4);
        int iIntValue5 = cxeVar5 != null ? ((java.lang.Number) aonnVar.a(cxeVar5, java.lang.Integer.valueOf(i))).intValue() : 0;
        int i2 = defpackage.bqg.a;
        return defpackage.bqg.e(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, cxfVar.dp(32.0f), dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
    }

    @Override // defpackage.cyk
    public final int a(cxf cxfVar, java.util.List list, int i) {
        return f(cxfVar, list, i, defpackage.bqh.a);
    }

    @Override // defpackage.cyk
    public final int b(cxf cxfVar, java.util.List list, int i) {
        return g(cxfVar, list, i, defpackage.bqi.a);
    }

    @Override // defpackage.cyk
    public final int c(cxf cxfVar, java.util.List list, int i) {
        return f(cxfVar, list, i, defpackage.bqj.a);
    }

    @Override // defpackage.cyk
    public final int d(cxf cxfVar, java.util.List list, int i) {
        return g(cxfVar, list, i, defpackage.bqk.a);
    }

    @Override // defpackage.cyk
    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        java.util.List list2 = (java.util.List) list.get(0);
        java.util.List list3 = (java.util.List) list.get(1);
        java.util.List list4 = (java.util.List) list.get(2);
        java.util.List list5 = (java.util.List) list.get(3);
        java.util.List list6 = (java.util.List) list.get(4);
        long jK = dpd.k(j, 0, 0, 0, 0, 10);
        int i = defpackage.bqg.a;
        int iDp = cyiVar.dp(32.0f);
        cyd cydVar = (cyd) ajsz.bG(list5);
        int iF = cydVar != null ? cydVar.f(dpd.a(j)) : 0;
        cyd cydVar2 = (cyd) ajsz.bG(list6);
        int iF2 = cydVar2 != null ? cydVar2.f(dpd.a(j)) : 0;
        int iB = dpd.b(jK);
        int i2 = iF + iF2 + iDp;
        cyd cydVar3 = (cyd) ajsz.bG(list4);
        float fA = defpackage.bqg.a(defpackage.rk.f(ajsz.bG(list3) != null, ajsz.bG(list4) != null, defpackage.bqg.d(cyiVar, cydVar3 != null ? cydVar3.e(defpackage.rq.o(iB, i2)) : 0)));
        long jG = dpe.g(jK, -iDp, -cyiVar.dp(fA + fA + 0.0f));
        cyd cydVar4 = (cyd) ajsz.bG(list5);
        czc czcVarV = cydVar4 != null ? cydVar4.v(jG) : null;
        int iN = defpackage.rq.n(czcVarV);
        cyd cydVar5 = (cyd) ajsz.bG(list6);
        final czc czcVarV2 = cydVar5 != null ? cydVar5.v(dpe.g(jG, -iN, 0)) : null;
        int iN2 = iN + defpackage.rq.n(czcVarV2);
        cyd cydVar6 = (cyd) ajsz.bG(list2);
        final czc czcVarV3 = cydVar6 != null ? cydVar6.v(dpe.g(jG, -iN2, 0)) : null;
        int iM = defpackage.rq.m(czcVarV3);
        cyd cydVar7 = (cyd) ajsz.bG(list4);
        czc czcVarV4 = cydVar7 != null ? cydVar7.v(dpe.g(jG, -iN2, -iM)) : null;
        int iM2 = iM + defpackage.rq.m(czcVarV4);
        boolean z = (czcVarV4 == null || czcVarV4.dm(cwn.a) == czcVarV4.dm(cwn.b)) ? false : true;
        cyd cydVar8 = (cyd) ajsz.bG(list3);
        final czc czcVarV5 = cydVar8 != null ? cydVar8.v(dpe.g(jG, -iN2, -iM2)) : null;
        int iF3 = defpackage.rk.f(czcVarV5 != null, czcVarV4 != null, z);
        float fA2 = defpackage.bqg.a(iF3);
        final int iE = defpackage.bqg.e(defpackage.rq.n(czcVarV), defpackage.rq.n(czcVarV2), defpackage.rq.n(czcVarV3), defpackage.rq.n(czcVarV5), defpackage.rq.n(czcVarV4), iDp, j);
        final czc czcVar = czcVarV4;
        final int iB2 = defpackage.bqg.b(cyiVar, defpackage.rq.m(czcVarV), defpackage.rq.m(czcVarV2), defpackage.rq.m(czcVarV3), defpackage.rq.m(czcVarV5), defpackage.rq.m(czcVar), iF3, cyiVar.dp(fA2 + fA2 + 0.0f), j);
        final boolean zX = a.x(iF3, 3);
        final int iDp2 = cyiVar.dp(16.0f);
        final int iDp3 = cyiVar.dp(16.0f);
        final int iDp4 = cyiVar.dp(fA2);
        final czc czcVar2 = czcVarV;
        return den.z(cyiVar, iE, iB2, new aonj() { // from class: bqf
            public final java.lang.Object a(java.lang.Object obj) {
                int iA;
                czb czbVar = (czb) obj;
                int i3 = defpackage.bqg.a;
                czc czcVar3 = czcVar2;
                int i4 = iDp2;
                boolean z2 = zX;
                int iA2 = iDp4;
                int i5 = iB2;
                if (czcVar3 != null) {
                    czbVar.u(czcVar3, i4, z2 ? iA2 : cmh.n.a(czcVar3.b, i5), 0.0f);
                }
                czc czcVar4 = czcVar;
                czc czcVar5 = czcVarV5;
                czc czcVar6 = czcVarV3;
                int iN3 = i4 + defpackage.rq.n(czcVar3);
                if (z2) {
                    iA = iA2;
                } else {
                    iA = cmh.n.a(defpackage.rq.m(czcVar6) + defpackage.rq.m(czcVar5) + defpackage.rq.m(czcVar4), i5);
                }
                if (czcVar5 != null) {
                    czbVar.u(czcVar5, iN3, iA, 0.0f);
                }
                int iM3 = iA + defpackage.rq.m(czcVar5);
                if (czcVar6 != null) {
                    czbVar.u(czcVar6, iN3, iM3, 0.0f);
                }
                int iM4 = iM3 + defpackage.rq.m(czcVar6);
                if (czcVar4 != null) {
                    czbVar.u(czcVar4, iN3, iM4, 0.0f);
                }
                czc czcVar7 = czcVarV2;
                if (czcVar7 != null) {
                    int i6 = (iE - iDp3) - czcVar7.a;
                    if (!z2) {
                        iA2 = cmh.n.a(czcVar7.b, i5);
                    }
                    czbVar.u(czcVar7, i6, iA2, 0.0f);
                }
                return aojh.a;
            }
        });
    }
}
