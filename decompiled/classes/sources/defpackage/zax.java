package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zax implements defpackage.zaw {
    public final java.lang.Integer a;
    public final defpackage.zal b;
    public final defpackage.mce c;

    public zax(java.lang.Integer num, defpackage.mce mceVar, defpackage.zal zalVar) {
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
        if (obj instanceof defpackage.zax) {
            defpackage.zax zaxVar = (defpackage.zax) obj;
            if (defpackage.aooh.n(this.a, zaxVar.a) && defpackage.aooh.n(this.c, zaxVar.c) && defpackage.aooh.n(this.b, zaxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        defpackage.mce mceVar = this.c;
        int iHashCode2 = mceVar == null ? 0 : mceVar.hashCode();
        int i = iHashCode * 31;
        defpackage.zal zalVar = this.b;
        return ((i + iHashCode2) * 31) + (zalVar != null ? zalVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OnlyLogIfAllowed(semanticEventId=" + this.a + ", cuiEvent=" + this.c + ", cuiError=" + this.b + ')';
    }

    public zax() {
        this(null, null, null);
    }
}
