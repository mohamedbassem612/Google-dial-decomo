package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxs extends android.util.Property {
    public afxs(java.lang.Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int[] iArr = defpackage.afxt.a;
        return java.lang.Float.valueOf(((defpackage.afxt) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        int[] iArr = defpackage.afxt.a;
        ((defpackage.afxt) obj).h = fFloatValue;
    }
}
