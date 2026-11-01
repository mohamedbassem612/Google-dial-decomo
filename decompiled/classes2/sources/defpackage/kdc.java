package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kdc {
    public final kiu a;
    public final java.util.List b;
    public final java.util.List c;

    public kdc(kiu kiuVar, java.util.List list, java.util.List list2) {
        aooh.f(kiuVar, "coalescedRow");
        this.a = kiuVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kdc) {
            defpackage.kdc kdcVar = (defpackage.kdc) obj;
            if (aooh.n(this.a, kdcVar.a) && aooh.n(this.b, kdcVar.b) && aooh.n(this.c, kdcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogUiModel(coalescedRow=" + this.a + ", icons=" + this.b + ", chips=" + this.c + ')';
    }
}
