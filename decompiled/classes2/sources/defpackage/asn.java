package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class asn implements defpackage.asx {
    public final aomy a;

    public asn(aomy aomyVar) {
        this.a = aomyVar;
    }

    @Override // defpackage.asx
    public final long a(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        boolean zBooleanValue = ((java.lang.Boolean) this.a.a()).booleanValue();
        float f = true != zBooleanValue ? fIntBitsToFloat : 0.0f;
        if (true != zBooleanValue) {
            fIntBitsToFloat = 0.0f;
        }
        return (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
    }

    @Override // defpackage.asx
    public final long b(long j) {
        boolean zBooleanValue = ((java.lang.Boolean) this.a.a()).booleanValue();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat = 0.0f;
        if (java.lang.Math.abs(java.lang.Float.intBitsToFloat(i)) >= java.lang.Math.abs(java.lang.Float.intBitsToFloat(i2))) {
            if (zBooleanValue) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat(i);
            }
        } else if (!zBooleanValue) {
            fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
        }
        return java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
    }
}
