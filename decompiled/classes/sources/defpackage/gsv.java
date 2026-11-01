package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gsv {
    private final long a;
    private final long b;

    public gsv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.aooh.n(getClass(), obj.getClass())) {
            defpackage.gsv gsvVar = (defpackage.gsv) obj;
            if (gsvVar.a == this.a && gsvVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (defpackage.anty.M(this.a) * 31) + defpackage.anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
