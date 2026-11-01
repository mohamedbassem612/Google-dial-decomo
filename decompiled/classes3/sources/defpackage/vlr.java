package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vlr {
    public final j$.util.Optional a;
    public final j$.util.Optional b;

    public vlr(j$.util.Optional optional, j$.util.Optional optional2) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null data");
        }
        this.a = optional;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null failure");
        }
        this.b = optional2;
    }

    static defpackage.vlr a(java.lang.Object obj) {
        return new defpackage.vlr(j$.util.Optional.of(obj), j$.util.Optional.empty());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vlr) {
            defpackage.vlr vlrVar = (defpackage.vlr) obj;
            if (this.a.equals(vlrVar.a) && this.b.equals(vlrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.b;
        return "Response{data=" + this.a.toString() + ", failure=" + optional.toString() + '}';
    }

    public vlr() {
        throw null;
    }
}
