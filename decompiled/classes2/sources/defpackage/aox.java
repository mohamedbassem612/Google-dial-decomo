package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aox {
    public final long a = -4294967296L;
    public final long b = -72057594037927936L;
    public final long c = -72057594037927936L;
    public final long d;
    public final long e;

    public aox(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.aox)) {
            defpackage.aox aoxVar = (defpackage.aox) obj;
            if (anty.ah(-4294967296L, -4294967296L) && anty.ah(-72057594037927936L, -72057594037927936L) && anty.ah(-72057594037927936L, -72057594037927936L) && anty.ah(this.d, aoxVar.d) && anty.ah(this.e, aoxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(-4294967296L) * 31;
        long j = this.e;
        return ((((((iM + anty.M(-72057594037927936L)) * 31) + anty.M(-72057594037927936L)) * 31) + anty.M(this.d)) * 31) + anty.M(j);
    }

    public final java.lang.String toString() {
        long j = this.e;
        long j2 = this.d;
        return "ContextMenuColors(backgroundColor=" + cqg.g(-4294967296L) + ", textColor=" + cqg.g(-72057594037927936L) + ", iconColor=" + cqg.g(-72057594037927936L) + ", disabledTextColor=" + cqg.g(j2) + ", disabledIconColor=" + cqg.g(j) + ')';
    }
}
