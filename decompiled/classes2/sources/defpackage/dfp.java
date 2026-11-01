package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dfp {
    public static final defpackage.dfp a = new defpackage.dfp(0, 0);
    public final long b;
    public final long c;

    public dfp(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dfp) {
            defpackage.dfp dfpVar = (defpackage.dfp) obj;
            if (anty.ah(this.b, dfpVar.b) && anty.ah(this.c, dfpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.b) * 31) + anty.M(this.c);
    }
}
