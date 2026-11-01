package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzs {
    public final int a;
    public final defpackage.gds b;

    public fzs(int i, defpackage.gds gdsVar) {
        defpackage.aooh.f(gdsVar, "hint");
        this.a = i;
        this.b = gdsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.fzs) {
            defpackage.fzs fzsVar = (defpackage.fzs) obj;
            if (this.a == fzsVar.a && defpackage.aooh.n(this.b, fzsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
