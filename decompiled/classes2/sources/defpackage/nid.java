package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nid {
    public final aeun a;
    public final aenj b;

    public nid(aeun aeunVar, aenj aenjVar) {
        this.a = aeunVar;
        this.b = aenjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nid) {
            defpackage.nid nidVar = (defpackage.nid) obj;
            if (aooh.n(this.a, nidVar.a) && aooh.n(this.b, nidVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LocalTimerMetrics(timerEvent=" + this.a + ", timerName=" + this.b + ')';
    }
}
