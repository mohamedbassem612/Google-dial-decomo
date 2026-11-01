package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class arp {
    public static final aono a = new defpackage.aro((aoln) null, 1, (byte[]) null);
    public static final aono b = new defpackage.aro(null, 0);

    public static final float a(long j, aso asoVar) {
        return java.lang.Float.intBitsToFloat((int) (asoVar == aso.a ? j & 4294967295L : j >> 32));
    }

    public static final long b(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return mni.bj(java.lang.Float.isNaN(java.lang.Float.intBitsToFloat(i)) ? 0.0f : java.lang.Float.intBitsToFloat(i), java.lang.Float.isNaN(java.lang.Float.intBitsToFloat(i2)) ? 0.0f : java.lang.Float.intBitsToFloat(i2));
    }

    public static final boolean c(aso asoVar, float f) {
        if (asoVar == aso.b) {
            if (f <= 30.0f) {
                return true;
            }
        } else if (f > 30.0f && f <= 90.0f) {
            return true;
        }
        return false;
    }
}
