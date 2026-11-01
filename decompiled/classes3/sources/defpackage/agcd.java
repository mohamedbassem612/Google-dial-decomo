package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcd extends defpackage.aftt {
    public agcd() {
        super(null);
    }

    @Override // defpackage.aftt
    public final void i(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        android.graphics.RectF rectFH = h(tabLayout, view);
        float fA = f < 0.5f ? afpc.a(1.0f, 0.0f, 0.0f, 0.5f, f) : afpc.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFH.left, drawable.getBounds().top, (int) rectFH.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fA * 255.0f));
    }
}
