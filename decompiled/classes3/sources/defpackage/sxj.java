package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxj {
    public final defpackage.sxi a;
    private final lnm b;

    public sxj(lnm lnmVar, defpackage.sxi sxiVar) {
        aooh.f(lnmVar, "vote");
        aooh.f(sxiVar, "reason");
        this.b = lnmVar;
        this.a = sxiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sxj) {
            defpackage.sxj sxjVar = (defpackage.sxj) obj;
            if (this.b == sxjVar.b && this.a == sxjVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VoteWithReason(vote=" + this.b + ", reason=" + this.a + ')';
    }
}
