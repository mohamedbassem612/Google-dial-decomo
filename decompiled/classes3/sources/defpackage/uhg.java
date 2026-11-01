package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uhg {
    public final ajcq a;
    public final long b;

    public uhg(ajcq ajcqVar, long j) {
        this.a = ajcqVar;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uhg) {
            defpackage.uhg uhgVar = (defpackage.uhg) obj;
            if (this.a.equals(uhgVar.a) && this.b == uhgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "PatronusLookupCacheEntry{lookupResult=" + java.lang.String.valueOf(this.a) + ", lookupTimeMillis=" + this.b + '}';
    }

    public uhg() {
        throw null;
    }
}
