package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeor {
    public final java.util.logging.Level a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;

    public aeor(java.util.logging.Level level, java.lang.String str, java.lang.String str2, long j) {
        this.a = level;
        if (str == null) {
            throw new java.lang.NullPointerException("Null logFormat");
        }
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeor) {
            defpackage.aeor aeorVar = (defpackage.aeor) obj;
            if (this.a.equals(aeorVar.a) && this.b.equals(aeorVar.b) && this.c.equals(aeorVar.c) && this.d == aeorVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + ", threadId=" + this.d + '}';
    }

    public aeor() {
        throw null;
    }
}
