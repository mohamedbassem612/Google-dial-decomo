package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wiu {
    public final java.lang.String a;
    public final long b;

    public wiu(java.lang.String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wiu) {
            defpackage.wiu wiuVar = (defpackage.wiu) obj;
            if (aooh.n(this.a, wiuVar.a) && this.b == wiuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "TrackedDtmfOption(dtmf=" + this.a + ", timeReceivedMillis=" + this.b + ')';
    }
}
