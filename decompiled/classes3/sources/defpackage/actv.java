package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class actv {
    public final java.lang.String a = "com.google.android.gms.fonts";
    public final java.lang.String b = "com.google.android.gms";
    private final java.util.List c = null;
    private final int d = 2130903057;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.actv) {
            defpackage.actv actvVar = (defpackage.actv) obj;
            if (aooh.n(this.a, actvVar.a) && aooh.n(this.b, actvVar.b)) {
                java.util.List list = actvVar.c;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    int i = actvVar.d;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + 2130903057;
    }
}
