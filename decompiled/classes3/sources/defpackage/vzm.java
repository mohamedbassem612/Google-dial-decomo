package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzm {
    public final j$.util.Optional a;
    public final long b;

    public vzm(j$.util.Optional optional, long j) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null callWaitTimeInfo");
        }
        this.a = optional;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vzm) {
            defpackage.vzm vzmVar = (defpackage.vzm) obj;
            if (this.a.equals(vzmVar.a) && this.b == vzmVar.b) {
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
        return "WaitTimeInfoHolder{callWaitTimeInfo=" + this.a.toString() + ", version=" + this.b + '}';
    }

    public vzm() {
        throw null;
    }
}
