package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class oxy extends android.util.FloatProperty {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxy(defpackage.oyc oycVar) {
        super("translateYDownOnly");
        j$.util.Objects.requireNonNull(oycVar);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((android.view.View) obj).getTranslationY());
    }

    @Override // android.util.FloatProperty
    public final /* bridge */ /* synthetic */ void setValue(java.lang.Object obj, float f) {
        android.view.View view = (android.view.View) obj;
        if (f > view.getTranslationY()) {
            view.setTranslationY(f);
        }
    }
}
