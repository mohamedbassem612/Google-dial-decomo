package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class isx {
    public final defpackage.isw a;
    private final defpackage.itb b;

    public isx(defpackage.itb itbVar, defpackage.isw iswVar) {
        aooh.f(itbVar, "vote");
        aooh.f(iswVar, "reason");
        this.b = itbVar;
        this.a = iswVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.isx) {
            defpackage.isx isxVar = (defpackage.isx) obj;
            if (this.b == isxVar.b && this.a == isxVar.a) {
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
