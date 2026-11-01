package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class oyb implements android.view.animation.Interpolator {
    private final float a;
    private final android.animation.TimeInterpolator b;

    public oyb(android.content.Context context) {
        this.a = mni.cA(context, 1.0f);
        this.b = wsc.bq(context, defpackage.urq.EASING_STANDARD);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float interpolation;
        float f2 = f * 1833.0f;
        if (f2 > 583.0f && f2 < 750.0f) {
            interpolation = this.b.getInterpolation(((-583.0f) + f2) / 167.0f);
        } else if (f2 < 750.0f || f2 > 1583.0f) {
            interpolation = (f2 <= 1583.0f || f2 >= 1833.0f) ? 0.0f : 1.0f - this.b.getInterpolation(((-1583.0f) + f2) / 250.0f);
        } else {
            interpolation = 1.0f;
        }
        return (float) (((double) (this.a * interpolation)) * java.lang.Math.sin(f2 * 30.0f * interpolation));
    }
}
