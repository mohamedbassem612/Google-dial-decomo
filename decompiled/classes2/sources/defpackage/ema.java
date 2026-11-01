package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ema {
    private static final long b = mni.bj(0.0f, 0.0f);
    public static final float a = 3.1415927f;

    public static final float a(float f, float f2) {
        return (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
    }

    public static final long b(float f, float f2) {
        float fA = a(f, f2);
        if (fA > 0.0f) {
            return mni.bj(f / fA, f2 / fA);
        }
        throw new java.lang.IllegalArgumentException("Required distance greater than zero");
    }

    public static final long c(long j) {
        return mni.bj(-defpackage.akf.i(j), defpackage.akf.h(j));
    }

    public static /* synthetic */ long d(float f, float f2) {
        double d = f2;
        return defpackage.akf.m(defpackage.akf.n(mni.bj((float) java.lang.Math.cos(d), (float) java.lang.Math.sin(d)), f), b);
    }
}
