package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byy implements defpackage.elu {
    final /* synthetic */ float[] a;

    public byy(float[] fArr) {
        this.a = fArr;
    }

    @Override // defpackage.elu
    public final long a(float f, float f2) {
        long jA = cqt.a(this.a, (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L));
        return mni.bj(java.lang.Float.intBitsToFloat((int) (jA >> 32)), java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)));
    }
}
