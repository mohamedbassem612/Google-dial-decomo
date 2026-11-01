package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpd implements android.animation.TypeEvaluator {
    public static final java.lang.Integer a(float f, java.lang.Integer num, java.lang.Integer num2) {
        int iIntValue = num.intValue();
        int i = iIntValue >> 24;
        int iIntValue2 = num2.intValue();
        int i2 = iIntValue2 >> 24;
        float fPow = (float) java.lang.Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) java.lang.Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) java.lang.Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) java.lang.Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) java.lang.Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) java.lang.Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float f2 = (i & 255) / 255.0f;
        return java.lang.Integer.valueOf((java.lang.Math.round((f2 + (f * (((i2 & 255) / 255.0f) - f2))) * 255.0f) << 24) | (java.lang.Math.round(((float) java.lang.Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (java.lang.Math.round(((float) java.lang.Math.pow(fPow2 + ((fPow5 - fPow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | java.lang.Math.round(((float) java.lang.Math.pow(fPow3 + ((fPow6 - fPow3) * f), 0.45454545454545453d)) * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ java.lang.Object evaluate(float f, java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }
}
