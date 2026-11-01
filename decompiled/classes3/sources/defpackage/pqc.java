package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqc implements crd {
    private final /* synthetic */ int $cid;
    public static final defpackage.pqc b = new defpackage.pqc(1);
    public static final defpackage.pqc a = new defpackage.pqc(0);

    private pqc(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final cqx a(long j, dpq dpqVar, dpf dpfVar) throws aois {
        float f;
        if (this.$cid != 0) {
            float fA = cpp.a(j) / 2.0f;
            long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fA)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA)) & 4294967295L);
            return new cqw(cdh.s(cdh.x(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
        }
        aooh.f(dpqVar, "layoutDirection");
        aooh.f(dpfVar, "density");
        float fDl = dpfVar.dl(6.0f);
        float fDl2 = dpfVar.dl(2.0f);
        float fDl3 = dpfVar.dl(4.0f);
        float fDl4 = dpfVar.dl(28.0f);
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        cpn cpnVarV = cdh.v(0L, (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i2))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - fDl)) & 4294967295L));
        long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(fDl4)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fDl4)) & 4294967295L);
        cpo cpoVarR = cdh.r(cpnVarV.b, cpnVarV.c, cpnVarV.d, cpnVarV.e, java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
        cpx cpxVar = new cpx((byte[]) null);
        cpxVar.q(cpoVarR, 2);
        cpx cpxVar2 = new cpx((byte[]) null);
        float f2 = fDl4 + fDl;
        float fS = aooc.s(java.lang.Float.intBitsToFloat(i2) * pez.A(dpqVar), f2, java.lang.Float.intBitsToFloat(i2) - f2);
        cpxVar2.f(fS, java.lang.Float.intBitsToFloat(i) - fDl);
        cpn cpnVarW = cdh.w((((long) java.lang.Float.floatToRawIntBits((pez.B(dpqVar) * fDl) + fS)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - fDl)) & 4294967295L), fDl);
        int iOrdinal = dpqVar.ordinal();
        if (iOrdinal == 0) {
            f = 180.0f;
        } else {
            if (iOrdinal != 1) {
                throw new aois();
            }
            f = 0.0f;
        }
        cpxVar2.p(cpnVarW, f, pez.B(dpqVar) * (-90.0f));
        cpxVar2.i(pez.B(dpqVar) * fDl3, 0.0f);
        cpxVar2.p(cdh.w((((long) java.lang.Float.floatToRawIntBits(fS + ((fDl + fDl3) * pez.B(dpqVar)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - fDl2)) & 4294967295L), fDl2), 90.0f, pez.B(dpqVar) * (-90.0f));
        cpxVar2.i(0.0f, -fDl3);
        cpxVar2.c();
        cpx cpxVar3 = new cpx((byte[]) null);
        if (cpxVar3.r(cpxVar, cpxVar2, 2)) {
            return new cqu(cpxVar3);
        }
        throw new java.lang.IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
    }
}
