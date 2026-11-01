package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bqs {
    public final long a;
    public final defpackage.elk b;

    public bqs(long j, defpackage.elk elkVar) {
        this.a = j;
        this.b = elkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bqs) {
            defpackage.bqs bqsVar = (defpackage.bqs) obj;
            if (anty.ah(this.a, bqsVar.a) && aooh.n(this.b, bqsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PointNRound(o=" + cpm.c(this.a) + ", r=" + this.b + ')';
    }
}
