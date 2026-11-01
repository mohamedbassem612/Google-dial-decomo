package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtz extends defpackage.xtw {
    public final java.lang.Object a;
    private final defpackage.xub b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public xtz(defpackage.xub xubVar, java.lang.Object obj) throws aois {
        this.b = xubVar;
        this.a = obj;
        int iOrdinal = xubVar.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            throw new aois();
        }
    }

    @Override // defpackage.xtw
    public final defpackage.xub a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xtz) {
            defpackage.xtz xtzVar = (defpackage.xtz) obj;
            if (this.b == xtzVar.b && aooh.n(this.a, xtzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Resource(status=" + this.b + ", resource=" + this.a + ')';
    }
}
