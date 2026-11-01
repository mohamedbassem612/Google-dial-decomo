package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jsj {
    public final spa a;
    public final long b;

    public jsj(spa spaVar, long j) {
        this.a = spaVar;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jsj) {
            defpackage.jsj jsjVar = (defpackage.jsj) obj;
            if (this.a.equals(jsjVar.a) && this.b == jsjVar.b) {
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
        return "DatabaseEntry{callerIdFeedbackInfo=" + java.lang.String.valueOf(this.a) + ", timestamp=" + this.b + '}';
    }

    public jsj() {
        throw null;
    }
}
