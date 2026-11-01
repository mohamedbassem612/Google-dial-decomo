package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftd extends android.util.Property {
    public aftd(java.lang.Class cls) {
        super(cls, "paddingEnd");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((android.view.View) obj).getPaddingEnd());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), ((java.lang.Float) obj2).intValue(), view.getPaddingBottom());
    }
}
