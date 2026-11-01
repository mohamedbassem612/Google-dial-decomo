package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afss extends android.util.Property {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afss(defpackage.afst afstVar, java.lang.Class cls) {
        super(cls, "LABEL_OPACITY_PROPERTY");
        j$.util.Objects.requireNonNull(afstVar);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) obj;
        int iAlpha = android.graphics.Color.alpha(extendedFloatingActionButton.A());
        return java.lang.Float.valueOf(iAlpha != 0 ? android.graphics.Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / iAlpha : 0.0f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) obj;
        java.lang.Float f = (java.lang.Float) obj2;
        if (f.floatValue() == 1.0f) {
            extendedFloatingActionButton.B(extendedFloatingActionButton.y);
            return;
        }
        int iA = extendedFloatingActionButton.A();
        float fAlpha = android.graphics.Color.alpha(iA);
        float fFloatValue = f.floatValue();
        android.animation.TimeInterpolator timeInterpolator = afpc.a;
        extendedFloatingActionButton.B(android.content.res.ColorStateList.valueOf(dwm.h(iA, java.lang.Math.round((fFloatValue * (fAlpha + 0.0f)) + 0.0f))));
    }
}
