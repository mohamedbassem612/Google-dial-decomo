package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsr implements ahth {
    public final java.lang.String a;
    public final long b;
    public final boolean c;

    public wsr(java.lang.String str, long j, boolean z) {
        aooh.f(str, "dtmfTones");
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wsr) {
            defpackage.wsr wsrVar = (defpackage.wsr) obj;
            if (aooh.n(this.a, wsrVar.a) && this.b == wsrVar.b && this.c == wsrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "DtmfOptionSelectedEvent(dtmfTones=" + this.a + ", itemId=" + this.b + ", isClickAhead=" + this.c + ')';
    }
}
