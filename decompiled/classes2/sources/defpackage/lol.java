package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lol {
    public final defpackage.lok a;
    public final int b;

    public lol(defpackage.lok lokVar, int i) {
        aooh.f(lokVar, "viewHolder");
        this.a = lokVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lol) {
            defpackage.lol lolVar = (defpackage.lol) obj;
            if (aooh.n(this.a, lolVar.a) && this.b == lolVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "BoundViewHolder(viewHolder=" + this.a + ", position=" + this.b + ')';
    }
}
