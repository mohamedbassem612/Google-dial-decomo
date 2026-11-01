package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blf {
    public static final dip a = new dip("SelectionHandleInfo");

    public static final long a(long j) {
        int i = (int) (j & 4294967295L);
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) - 1.0f)) & 4294967295L);
    }

    public static final boolean b(int i, boolean z) {
        if (i == 1) {
            if (!z) {
                return true;
            }
            z = true;
        }
        return i == 2 && z;
    }
}
