package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ybc extends defpackage.ybe {
    @Override // defpackage.ybe
    public final float a(int i, int i2, int i3, int i4) {
        if (h) {
            return java.lang.Math.min(i3 / i, i4 / i2);
        }
        int iMax = java.lang.Math.max(i2 / i4, i / i3);
        if (iMax == 0) {
            return 1.0f;
        }
        return 1.0f / java.lang.Integer.highestOneBit(iMax);
    }

    @Override // defpackage.ybe
    public final int b(int i, int i2, int i3, int i4) {
        return h ? 2 : 1;
    }
}
