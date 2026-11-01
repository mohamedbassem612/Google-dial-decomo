package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmb {
    public static final defpackage.fmb a = new defpackage.fmb(0, 0);
    public final long b;
    public final long c;

    public fmb(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fmb fmbVar = (defpackage.fmb) obj;
            if (this.b == fmbVar.b && this.c == fmbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }

    public final java.lang.String toString() {
        return "[timeUs=" + this.b + ", position=" + this.c + ']';
    }
}
