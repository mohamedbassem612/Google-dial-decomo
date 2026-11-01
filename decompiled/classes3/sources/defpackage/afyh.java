package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afyh {
    public java.lang.Object a;
    public java.lang.Object b;
    public final java.lang.Object c;

    public afyh(defpackage.afyi afyiVar, float[] fArr, float[] fArr2) {
        j$.util.Objects.requireNonNull(afyiVar);
        float[] fArr3 = new float[2];
        this.a = fArr3;
        this.b = new float[2];
        java.lang.System.arraycopy(fArr, 0, fArr3, 0, 2);
        java.lang.System.arraycopy(fArr2, 0, this.b, 0, 2);
        this.c = new android.graphics.Matrix();
    }

    final void a(float f) {
        float[] fArr = (float[]) this.b;
        double dAtan2 = java.lang.Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        float[] fArr2 = (float[]) this.a;
        double d = (float) dAtan2;
        double d2 = f;
        fArr2[0] = (float) (((double) fArr2[0]) + (java.lang.Math.cos(d) * d2));
        float[] fArr3 = (float[]) this.a;
        fArr3[1] = (float) (((double) fArr3[1]) + (d2 * java.lang.Math.sin(d)));
    }

    final void b(float f) {
        float[] fArr = (float[]) this.b;
        float fAtan2 = (float) java.lang.Math.atan2(fArr[1], fArr[0]);
        float[] fArr2 = (float[]) this.a;
        double d = fAtan2;
        double d2 = f;
        fArr2[0] = (float) (((double) fArr2[0]) + (java.lang.Math.cos(d) * d2));
        float[] fArr3 = (float[]) this.a;
        fArr3[1] = (float) (((double) fArr3[1]) + (d2 * java.lang.Math.sin(d)));
    }

    public final void c() {
        java.util.Arrays.fill((float[]) this.a, 0.0f);
        java.util.Arrays.fill((float[]) this.b, 0.0f);
        ((float[]) this.b)[0] = 1.0f;
        ((android.graphics.Matrix) this.c).reset();
    }

    public final void d(float f) {
        android.graphics.Matrix matrix = (android.graphics.Matrix) this.c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.a);
        matrix.mapPoints((float[]) this.b);
    }

    final void e(float f) {
        float[] fArr = (float[]) this.a;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = (float[]) this.b;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    final void f(float f) {
        float[] fArr = (float[]) this.a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public final void g(java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewFindViewById = ((defpackage.rhe) this.c).N().findViewById(2131427481);
        if (lottieAnimationViewFindViewById instanceof com.android.dialer.widget.logoview.LogoView) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, (com.android.dialer.widget.logoview.LogoView) lottieAnimationViewFindViewById);
        } else if (lottieAnimationViewFindViewById instanceof com.airbnb.lottie.LottieAnimationView) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer2, lottieAnimationViewFindViewById);
        }
    }

    public afyh(defpackage.afyi afyiVar) {
        j$.util.Objects.requireNonNull(afyiVar);
        this.a = new float[2];
        this.b = new float[]{1.0f, 0.0f};
        this.c = new android.graphics.Matrix();
    }

    public afyh(defpackage.afyi afyiVar, defpackage.afyh afyhVar) {
        this(afyiVar, (float[]) afyhVar.a, (float[]) afyhVar.b);
    }

    public afyh(defpackage.rhe rheVar) {
        this.b = j$.util.Optional.empty();
        this.a = j$.util.Optional.empty();
        this.c = rheVar;
    }
}
