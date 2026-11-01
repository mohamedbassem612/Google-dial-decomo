package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dfe {
    public static final android.view.MotionEvent a(long j, long j2, int i, int i2, android.view.MotionEvent.PointerProperties[] pointerPropertiesArr, android.view.MotionEvent.PointerCoords[] pointerCoordsArr, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9) {
        android.view.MotionEvent motionEventM = rp$.ExternalSyntheticApiModelOutline0.m(j, j2, i, i2, pointerPropertiesArr, pointerCoordsArr, i3, i4, f, f2, i5, i6, i7, 0, i8, i9);
        aooh.c(motionEventM);
        return motionEventM;
    }

    public static final boolean b(float f, float f2, long j, float f3, float f4) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        return ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f5 * f5) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    public static final boolean c(cpx cpxVar, float f, float f2) {
        cpn cpnVar = new cpn(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        cpx cpxVar2 = new cpx((byte[]) null);
        cpxVar2.t(cpnVar);
        cpx cpxVar3 = new cpx((byte[]) null);
        cpxVar3.r(cpxVar, cpxVar2, 1);
        boolean zIsEmpty = cpxVar3.a.isEmpty();
        cpxVar3.k();
        cpxVar2.k();
        return !zIsEmpty;
    }
}
