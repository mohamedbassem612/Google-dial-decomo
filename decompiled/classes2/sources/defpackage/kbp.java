package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbp implements defpackage.kbu {
    public final defpackage.jyf a;
    public final defpackage.jyg b;

    public kbp(defpackage.jyf jyfVar, defpackage.jyg jygVar) {
        aooh.f(jyfVar, "chipKey");
        this.a = jyfVar;
        this.b = jygVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kbp) {
            defpackage.kbp kbpVar = (defpackage.kbp) obj;
            if (this.a == kbpVar.a && aooh.n(this.b, kbpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ChipClick(chipKey=" + this.a + ", onClickContext=" + this.b + ')';
    }
}
