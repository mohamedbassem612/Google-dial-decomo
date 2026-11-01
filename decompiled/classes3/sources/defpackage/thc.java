package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thc {
    public final defpackage.tgy a;
    public final java.util.List b;

    public thc(defpackage.tgy tgyVar, java.util.List list) {
        this.a = tgyVar;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.thc) {
            defpackage.thc thcVar = (defpackage.thc) obj;
            if (aooh.n(this.a, thcVar.a) && aooh.n(this.b, thcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.tgy tgyVar = this.a;
        return ((tgyVar == null ? 0 : tgyVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SearchSubSectionState(header=" + this.a + ", items=" + this.b + ')';
    }
}
