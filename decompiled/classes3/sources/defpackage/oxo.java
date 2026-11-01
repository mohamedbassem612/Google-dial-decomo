package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class oxo implements android.view.animation.Interpolator {
    private final float a;
    private final float b;
    private final float c;

    public oxo(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return ((f * this.a) * this.b) / this.c;
    }
}
