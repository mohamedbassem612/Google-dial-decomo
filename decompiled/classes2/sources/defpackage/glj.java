package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glj extends android.util.Property {
    public glj(java.lang.Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int i = defpackage.gll.b;
        return java.lang.Float.valueOf(fn$.ExternalSyntheticApiModelOutline0.m((android.view.View) obj));
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        int i = defpackage.gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m((android.view.View) obj, fFloatValue);
    }
}
