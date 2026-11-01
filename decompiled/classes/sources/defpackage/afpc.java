package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afpc {
    public static final android.animation.TimeInterpolator a = new android.view.animation.LinearInterpolator();
    public static final android.animation.TimeInterpolator b = new defpackage.emd();
    public static final android.animation.TimeInterpolator c = new defpackage.emc();
    public static final android.animation.TimeInterpolator d = new defpackage.eme();
    public static final android.animation.TimeInterpolator e = new android.view.animation.DecelerateInterpolator();

    public static float a(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }

    public static int b(int i, int i2, float f) {
        return i + java.lang.Math.round(f * (i2 - i));
    }
}
