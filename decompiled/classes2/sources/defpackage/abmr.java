package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abmr {
    public final dkz a;
    public final int b;
    public final boolean c;

    public abmr(dkz dkzVar, int i, boolean z) {
        aooh.f(dkzVar, "style");
        this.a = dkzVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abmr) {
            defpackage.abmr abmrVar = (defpackage.abmr) obj;
            if (aooh.n(this.a, abmrVar.a) && this.b == abmrVar.b && this.c == abmrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "TextFlowResult(style=" + this.a + ", maxLines=" + this.b + ", overflow=" + this.c + ')';
    }
}
