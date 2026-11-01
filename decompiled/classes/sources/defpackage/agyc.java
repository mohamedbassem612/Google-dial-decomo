package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agyc {
    public final defpackage.agxi a;
    public final long b;
    public final defpackage.agxp c;
    public final defpackage.agxs d;
    public final int e;
    public final j$.time.Instant f;

    public agyc(defpackage.agxi agxiVar, long j, defpackage.agxp agxpVar, defpackage.agxs agxsVar, int i, j$.time.Instant instant) {
        this.a = agxiVar;
        this.b = j;
        this.c = agxpVar;
        this.d = agxsVar;
        this.e = i;
        if (instant == null) {
            throw new java.lang.NullPointerException("Null epochTimeAtStart");
        }
        this.f = instant;
    }

    public final defpackage.agyc a(defpackage.agxi agxiVar, j$.time.Instant instant) {
        long j = this.b;
        defpackage.ahvr.bZ(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        return new defpackage.agyc(agxiVar, j + 1, new defpackage.agxp(0L), new defpackage.agxs(0L), 0, instant);
    }

    public final boolean b(defpackage.agyc agycVar) {
        long j = this.b;
        if (j == Long.MIN_VALUE) {
            throw new java.lang.IllegalStateException();
        }
        if (equals(agycVar) && this != agycVar) {
            throw new java.lang.IllegalStateException();
        }
        long j2 = agycVar.b;
        if (j < j2) {
            return true;
        }
        if (j == j2) {
            defpackage.agxp agxpVar = this.c;
            if (agxpVar.a < agycVar.c.a) {
                return true;
            }
            defpackage.agxs agxsVar = this.d;
            if (agxsVar.a < agycVar.d.a) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.e > 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agyc) {
            defpackage.agyc agycVar = (defpackage.agyc) obj;
            if (this.a.equals(agycVar.a) && this.b == agycVar.b && this.c.equals(agycVar.c) && this.d.equals(agycVar.d) && this.e == agycVar.e && this.f.equals(agycVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        j$.time.Instant instant = this.f;
        defpackage.agxs agxsVar = this.d;
        defpackage.agxp agxpVar = this.c;
        return "SubscribeSequenceState{dataSource=" + this.a.toString() + ", index=" + this.b + ", fetchTaskIdentifier=" + agxpVar.toString() + ", loadTaskIdentifier=" + agxsVar.toString() + ", loadAttempts=" + this.e + ", epochTimeAtStart=" + instant.toString() + '}';
    }

    public agyc() {
        throw null;
    }
}
