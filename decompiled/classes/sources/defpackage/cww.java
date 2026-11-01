package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cww implements cwy {
    private final /* synthetic */ int $cid;

    public cww(int i) {
        this.$cid = i;
    }

    public final long a(long j, long j2) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        int i = this.$cid;
        if (i == 0) {
            float fK = defpackage.cwh.k(j, j2);
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fK);
            iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fK);
        } else if (i == 1) {
            float fMax = java.lang.Math.max(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fMax);
            iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fMax);
        } else {
            if (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= java.lang.Float.intBitsToFloat((int) (j2 >> 32)) && java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                return 4575657222473777152L;
            }
            float fK2 = defpackage.cwh.k(j, j2);
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fK2);
            iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fK2);
        }
        return (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
    }
}
