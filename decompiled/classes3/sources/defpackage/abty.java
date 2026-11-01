package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abty implements defpackage.abuo {
    public final defpackage.abuf a;
    public final java.lang.Long b;

    public abty(defpackage.abuf abufVar, java.lang.Long l) {
        this.a = abufVar;
        this.b = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abty) {
            defpackage.abty abtyVar = (defpackage.abty) obj;
            if (this.a == abtyVar.a && aooh.n(this.b, abtyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final java.lang.String toString() {
        return "CallingCardCreateSuccessResponse(callingCardRequestStatus=" + this.a + ", callingCardId=" + this.b + ')';
    }
}
