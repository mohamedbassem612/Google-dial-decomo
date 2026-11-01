package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class get {
    final int a;
    final int b;
    final java.lang.String c;

    public get(androidx.preference.Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.A;
        this.b = preference.B;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.get)) {
            return false;
        }
        defpackage.get getVar = (defpackage.get) obj;
        return this.a == getVar.a && this.b == getVar.b && android.text.TextUtils.equals(this.c, getVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
