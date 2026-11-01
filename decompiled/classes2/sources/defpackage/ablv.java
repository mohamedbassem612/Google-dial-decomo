package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ablv implements abmb {
    public final java.util.List a;
    private final java.lang.String b;

    public ablv(java.util.List list) {
        aooh.f(list, "items");
        this.b = null;
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ablv) {
            defpackage.ablv ablvVar = (defpackage.ablv) obj;
            java.lang.String str = ablvVar.b;
            if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.a, ablvVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Section(title=null, items=" + this.a + ')';
    }
}
