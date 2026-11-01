package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afsr {
    private static final int b = 5;
    public final boolean a;
    private final int c;
    private final int d;
    private final int e;
    private final float f;

    public afsr(android.content.Context context) {
        boolean z = defpackage.agab.z(context.getTheme(), 2130969330, false);
        android.util.TypedValue typedValueX = defpackage.agab.x(context.getTheme(), 2130969329);
        java.lang.Integer numValueOf = typedValueX != null ? java.lang.Integer.valueOf(defpackage.agab.ac(context, typedValueX)) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        android.util.TypedValue typedValueX2 = defpackage.agab.x(context.getTheme(), 2130969328);
        java.lang.Integer numValueOf2 = typedValueX2 != null ? java.lang.Integer.valueOf(defpackage.agab.ac(context, typedValueX2)) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        android.util.TypedValue typedValueX3 = defpackage.agab.x(context.getTheme(), 2130969105);
        java.lang.Integer numValueOf3 = typedValueX3 != null ? java.lang.Integer.valueOf(defpackage.agab.ac(context, typedValueX3)) : null;
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.c = iIntValue;
        this.d = iIntValue2;
        this.e = iIntValue3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        float f2 = this.f;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : java.lang.Math.min(((((float) java.lang.Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = android.graphics.Color.alpha(i);
        int iAb = defpackage.agab.ab(defpackage.dwm.h(i, 255), this.c, fMin);
        if (fMin > 0.0f && (i2 = this.d) != 0) {
            iAb = defpackage.dwm.g(defpackage.dwm.h(i2, b), iAb);
        }
        return defpackage.dwm.h(iAb, iAlpha);
    }

    public final int b(int i, float f) {
        if (!this.a) {
            return i;
        }
        int i2 = defpackage.dwm.a;
        return ((16777215 & i) | (-16777216)) == this.e ? a(i, f) : i;
    }
}
