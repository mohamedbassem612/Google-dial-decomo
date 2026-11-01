package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qyf implements aonp {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ long b;

    public /* synthetic */ qyf(java.lang.String str, long j) {
        this.a = str;
        this.b = j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) throws aois {
        pez pezVar = (pez) obj2;
        cav cavVar = (cav) obj3;
        int iIntValue = ((java.lang.Integer) obj4).intValue();
        aooh.f((aer) obj, "$this$AnimatedContent");
        aooh.f(pezVar, "targetIconRes");
        if ((iIntValue & 48) == 0) {
            iIntValue |= true != cavVar.B(pezVar) ? 16 : 32;
        }
        if (cavVar.H((iIntValue & 145) != 144, iIntValue & 1)) {
            j$.util.Objects.checkIndex(0, 3);
            if (pezVar != null) {
                long j = this.b;
                java.lang.String str = this.a;
                if (pezVar instanceof defpackage.qyj) {
                    cavVar.u(725453091);
                    int i = ((defpackage.qyj) pezVar).a;
                    cmw cmwVarAY = den.aY(azm.c(cmw.c, 1.0f), 6.0f);
                    java.lang.Object objG = cavVar.g();
                    if (objG == cau.a) {
                        objG = new qks(9);
                        cavVar.w(objG);
                    }
                    pez.bI(i, str, j, dig.b(cmwVarAY, false, (aonj) objG), cavVar, 0);
                    cavVar.o();
                } else if (pezVar instanceof defpackage.qyi) {
                    cavVar.u(725759371);
                    css cssVarK = wv.k(((defpackage.qyi) pezVar).a, cavVar, 0);
                    cmw cmwVarAY2 = den.aY(azm.c(cmw.c, 1.0f), 14.0f);
                    java.lang.Object objG2 = cavVar.g();
                    if (objG2 == cau.a) {
                        objG2 = new qks(10);
                        cavVar.w(objG2);
                    }
                    aaoo.V(cssVarK, str, dig.b(cmwVarAY2, false, (aonj) objG2), j, cavVar, 8, 0);
                    cavVar.o();
                }
            }
            cavVar.u(-1639167876);
            cavVar.o();
            throw new aois();
        }
        cavVar.s();
        return aojh.a;
    }
}
