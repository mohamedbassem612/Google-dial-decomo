package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mbi implements defpackage.mbh {
    public final java.lang.Integer a;
    public final zal b;
    public final mce c;

    public mbi(java.lang.Integer num, mce mceVar, zal zalVar) {
        this.a = num;
        this.c = mceVar;
        this.b = zalVar;
        if (num == null && mceVar == null && zalVar == null) {
            throw new java.lang.IllegalArgumentException("At least one parameter must be non-null.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mbi) {
            defpackage.mbi mbiVar = (defpackage.mbi) obj;
            if (aooh.n(this.a, mbiVar.a) && aooh.n(this.c, mbiVar.c) && aooh.n(this.b, mbiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        mce mceVar = this.c;
        int iHashCode2 = mceVar == null ? 0 : mceVar.hashCode();
        int i = iHashCode * 31;
        zal zalVar = this.b;
        return ((i + iHashCode2) * 31) + (zalVar != null ? zalVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OnlyLogIfAllowed(semanticEventId=" + this.a + ", cuiEvent=" + this.c + ", cuiError=" + this.b + ')';
    }

    public mbi() {
        this(null, null, null);
    }
}
