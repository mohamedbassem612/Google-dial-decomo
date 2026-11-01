package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aftq extends android.util.FloatProperty {
    public aftq() {
        super("interpolation");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object obj) {
        int[] iArr = com.google.android.material.focus.FocusRingDrawable.a;
        return java.lang.Float.valueOf(((com.google.android.material.focus.FocusRingDrawable) obj).b);
    }

    @Override // android.util.FloatProperty
    public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj, float f) {
        com.google.android.material.focus.FocusRingDrawable focusRingDrawable = (com.google.android.material.focus.FocusRingDrawable) obj;
        int[] iArr = com.google.android.material.focus.FocusRingDrawable.a;
        focusRingDrawable.b = f;
        focusRingDrawable.invalidateSelf();
    }
}
