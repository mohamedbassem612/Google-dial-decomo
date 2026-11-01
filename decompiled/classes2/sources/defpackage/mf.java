package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class mf {
    private int a = -1;

    public static int a(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 << 1;
            i4 |= (-789517) & i5;
            i3 = i5 & 789516;
        }
        return i4 | (i3 << 2);
    }

    public static final void f(ld ldVar) {
        android.view.View view = ldVar.a;
        java.lang.Object tag = view.getTag(2131428425);
        if (tag instanceof java.lang.Float) {
            float fFloatValue = ((java.lang.Float) tag).floatValue();
            int i = dzs.a;
            view.setElevation(fFloatValue);
        }
        view.setTag(2131428425, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static final int g(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 >> 1;
            i4 |= (-3158065) & i5;
            i3 = i5 & 3158064;
        }
        return i4 | (i3 >> 2);
    }

    final int b(android.support.v7.widget.RecyclerView recyclerView, ld ldVar) {
        return g(c(ldVar), recyclerView.getLayoutDirection());
    }

    public abstract int c(ld ldVar);

    public final int d(android.support.v7.widget.RecyclerView recyclerView, int i, int i2, long j) {
        int dimensionPixelSize = this.a;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(2131166221);
            this.a = dimensionPixelSize;
        }
        int iAbs = java.lang.Math.abs(i2);
        int iSignum = (int) java.lang.Math.signum(i2);
        float fMin = java.lang.Math.min(1.0f, iAbs / i) - 1.0f;
        float f = j > 2000 ? 1.0f : j / 2000.0f;
        int i3 = (int) (((int) (iSignum * dimensionPixelSize * ((fMin * fMin * fMin * fMin * fMin) + 1.0f))) * f * f * f * f * f);
        if (i3 == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return i3;
    }

    public void e(ld ldVar, float f) {
        throw null;
    }
}
