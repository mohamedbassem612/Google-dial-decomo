package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcc extends defpackage.aftt {
    public agcc() {
        super(null);
    }

    private static float X(float f) {
        return (float) java.lang.Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    private static float c(float f) {
        return (float) (1.0d - java.lang.Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    @Override // defpackage.aftt
    public final void i(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        float fX;
        float fC;
        android.graphics.RectF rectFH = h(tabLayout, view);
        android.graphics.RectF rectFH2 = h(tabLayout, view2);
        if (rectFH.left < rectFH2.left) {
            fX = c(f);
            fC = X(f);
        } else {
            fX = X(f);
            fC = c(f);
        }
        drawable.setBounds(afpc.b((int) rectFH.left, (int) rectFH2.left, fX), drawable.getBounds().top, afpc.b((int) rectFH.right, (int) rectFH2.right, fC), drawable.getBounds().bottom);
    }
}
