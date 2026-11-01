package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ln extends android.util.Property {
    public ln(java.lang.Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Float.valueOf(((android.support.v7.widget.SwitchCompat) obj).j);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        ((android.support.v7.widget.SwitchCompat) obj).h(((java.lang.Float) obj2).floatValue());
    }
}
