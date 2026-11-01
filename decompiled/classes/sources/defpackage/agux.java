package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agux {
    public final long a;
    public final java.util.concurrent.TimeUnit b;

    public agux(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("Null timeUnit");
        }
        this.b = timeUnit;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agux) {
            defpackage.agux aguxVar = (defpackage.agux) obj;
            if (this.a == aguxVar.a && this.b.equals(aguxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TimeUnitPair{duration=" + this.a + ", timeUnit=" + this.b.toString() + '}';
    }

    public agux() {
        throw null;
    }
}
