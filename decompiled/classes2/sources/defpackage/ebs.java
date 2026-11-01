package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ebs extends defpackage.ebu {
    private static final float[] f = new float[100];
    private final android.graphics.drawable.GradientDrawable g;
    private final int[] h;
    private int i;

    static {
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        for (int i = 99; i >= 0; i--) {
            f[i] = pathInterpolator.getInterpolation((99 - i) / 99.0f);
        }
    }

    public ebs(int i) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        this.g = gradientDrawable;
        float[] fArr = f;
        int length = fArr.length;
        int[] iArr = new int[100];
        this.h = iArr;
        this.i = 0;
        gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM);
        if (this.i != i) {
            this.i = i;
            for (int i2 = 99; i2 >= 0; i2--) {
                iArr[i2] = android.graphics.Color.argb((int) (fArr[i2] * android.graphics.Color.alpha(i)), android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
            }
            android.graphics.drawable.GradientDrawable gradientDrawable2 = this.g;
            gradientDrawable2.setColors(iArr);
            defpackage.ebt ebtVar = this.b;
            ebtVar.d = gradientDrawable2;
            defpackage.ebw ebwVar = ebtVar.g;
            if (ebwVar != null) {
                ((android.view.View) ebwVar.b).setBackground(gradientDrawable2);
            }
        }
    }

    @Override // defpackage.ebu
    public final int c(int i) {
        return (int) (i * 1.2f);
    }

    @Override // defpackage.ebu
    public final void b() {
    }
}
