package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class oxn implements android.view.animation.Interpolator {
    private final android.view.animation.Interpolator a;
    private final android.view.animation.Interpolator b;
    private final android.view.animation.Interpolator c;

    public oxn(android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2, android.view.animation.Interpolator interpolator3) {
        this.a = interpolator;
        this.b = interpolator2;
        this.c = interpolator3;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float interpolation = this.c.getInterpolation(f);
        return ((1.0f - interpolation) * this.a.getInterpolation(f)) + (interpolation * this.b.getInterpolation(f));
    }
}
