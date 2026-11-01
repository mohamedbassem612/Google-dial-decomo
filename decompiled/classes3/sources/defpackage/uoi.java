package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uoi implements aonn {
    public final /* synthetic */ defpackage.uoo a;

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        aopw aopwVar;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
            defpackage.uoo uooVar = this.a;
            ttj ttjVarB = uooVar.b();
            java.lang.Object objA = uooVar.l.a();
            aooh.e(objA, "get(...)");
            boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
            java.lang.Object objA2 = uooVar.m.a();
            aooh.e(objA2, "get(...)");
            boolean zBooleanValue2 = ((java.lang.Boolean) objA2).booleanValue();
            java.lang.Object objA3 = uooVar.n.a();
            aooh.e(objA3, "get(...)");
            boolean zBooleanValue3 = ((java.lang.Boolean) objA3).booleanValue();
            java.lang.Object objA4 = uooVar.o.a();
            aooh.e(objA4, "get(...)");
            boolean zBooleanValue4 = ((java.lang.Boolean) objA4).booleanValue();
            boolean zD = cavVar.D(uooVar);
            java.lang.Object objG = cavVar.g();
            if (zD || objG == cau.a) {
                objG = new ovt(uooVar, 20, (char[]) null, (byte[]) null);
                cavVar.w(objG);
            }
            aomy aomyVar = (aomy) objG;
            boolean zD2 = cavVar.D(uooVar);
            java.lang.Object objG2 = cavVar.g();
            if (zD2 || objG2 == cau.a) {
                objG2 = new defpackage.uon((java.lang.Object) uooVar, 1, (byte[]) null);
                cavVar.w(objG2);
            }
            aomy aomyVar2 = (aomy) objG2;
            boolean zD3 = cavVar.D(uooVar);
            java.lang.Object objG3 = cavVar.g();
            if (zD3 || objG3 == cau.a) {
                objG3 = new defpackage.uom(uooVar);
                cavVar.w(objG3);
            }
            aonj aonjVar = (aonj) objG3;
            boolean zD4 = cavVar.D(uooVar);
            java.lang.Object objG4 = cavVar.g();
            if (zD4 || objG4 == cau.a) {
                objG4 = new defpackage.sba((java.lang.Object) uooVar, 4, (int[]) null);
                cavVar.w(objG4);
            }
            aonj aonjVar2 = (aonj) objG4;
            boolean zD5 = cavVar.D(uooVar);
            java.lang.Object objG5 = cavVar.g();
            if (zD5 || objG5 == cau.a) {
                objG5 = new defpackage.uon(uooVar, 0);
                cavVar.w(objG5);
            }
            aomy aomyVar3 = (aomy) objG5;
            if (uooVar.w.g().isEmpty()) {
                cavVar.u(-1150030097);
                boolean zD6 = cavVar.D(uooVar);
                java.lang.Object objG6 = cavVar.g();
                if (zD6 || objG6 == cau.a) {
                    objG6 = new defpackage.uon((java.lang.Object) uooVar, 2, (char[]) null);
                    cavVar.w(objG6);
                }
                aopwVar = (aopw) objG6;
                cavVar.o();
            } else {
                cavVar.u(-1150007685);
                cavVar.o();
                aopwVar = null;
            }
            aomy aomyVar4 = (aomy) aopwVar;
            boolean zD7 = cavVar.D(uooVar);
            java.lang.Object objG7 = cavVar.g();
            if (zD7 || objG7 == cau.a) {
                objG7 = new gfw(uooVar, 5, (boolean[]) null);
                cavVar.w(objG7);
            }
            aonn aonnVar = (aonn) objG7;
            boolean zD8 = cavVar.D(uooVar);
            java.lang.Object objG8 = cavVar.g();
            if (zD8 || objG8 == cau.a) {
                objG8 = new defpackage.uon((java.lang.Object) uooVar, 3, (short[]) null);
                cavVar.w(objG8);
            }
            aais.aK(ttjVarB, false, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar4, aonnVar, (aomy) objG8, (aomy) null, (aomy) null, cavVar, 0, 0, 49154);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
