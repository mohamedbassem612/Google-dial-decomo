package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agw {
    public static final defpackage.oq a = new defpackage.oq(new nu(4));

    public static final long a(cxi cxiVar, cxi cxiVar2, long j) {
        cpn cpnVarQ = cxiVar2.q(cxiVar, false);
        float f = cpnVarQ.b;
        float fIntBitsToFloat = (cpnVarQ.d - f) * java.lang.Float.intBitsToFloat((int) (j >> 32));
        float f2 = cpnVarQ.c;
        float fIntBitsToFloat2 = (cpnVarQ.e - f2) * java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(f + fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2 + fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long b(long j, long j2, float f) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        return (((long) java.lang.Float.floatToRawIntBits((((java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat(i)) * f) + java.lang.Float.intBitsToFloat(i)) + dpn.a(0L))) << 32) | (((long) java.lang.Float.floatToRawIntBits(((java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat(i2)) * f) + java.lang.Float.intBitsToFloat(i2) + dpn.b(0L))) & 4294967295L);
    }
}
