package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mta {
    public final defpackage.mte a;
    public final defpackage.msz b;

    public mta(defpackage.mte mteVar, defpackage.msz mszVar) {
        aooh.f(mteVar, "vote");
        aooh.f(mszVar, "reason");
        this.a = mteVar;
        this.b = mszVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mta) {
            defpackage.mta mtaVar = (defpackage.mta) obj;
            if (this.a == mtaVar.a && this.b == mtaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VoteWithReason(vote=" + this.a + ", reason=" + this.b + ')';
    }
}
