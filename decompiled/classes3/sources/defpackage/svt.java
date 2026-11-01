package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svt {
    public final aosy a;
    public final j$.time.Instant b;

    public svt(aosy aosyVar, j$.time.Instant instant) {
        this.a = aosyVar;
        this.b = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.svt) {
            defpackage.svt svtVar = (defpackage.svt) obj;
            if (aooh.n(this.a, svtVar.a) && aooh.n(this.b, svtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        j$.time.Instant instant = this.b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }

    public final java.lang.String toString() {
        return "CallDataEntry(deferredValue=" + this.a + ", expirationTime=" + this.b + ')';
    }
}
