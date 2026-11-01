package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ahs {
    public final aii a;
    public long b;

    public ahs(aii aiiVar, long j) {
        this.a = aiiVar;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ahs) {
            defpackage.ahs ahsVar = (defpackage.ahs) obj;
            if (aooh.n(this.a, ahsVar.a) && anty.ah(this.b, ahsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + dpp.a(this.b) + ')';
    }
}
