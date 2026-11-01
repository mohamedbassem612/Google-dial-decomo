package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nju {
    public final java.lang.String a;
    public final long b;
    private final long c;

    public nju(java.lang.String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nju) {
            defpackage.nju njuVar = (defpackage.nju) obj;
            if (aooh.n(this.a, njuVar.a) && this.b == njuVar.b && this.c == njuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + anty.M(this.c);
    }

    public final java.lang.String toString() {
        return "DobbyTranscriptionResult(transcript=" + this.a + ", startTimeUsec=" + this.b + ", endTimeUsec=" + this.c + ')';
    }
}
