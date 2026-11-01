package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afm {
    public final defpackage.cmj a;
    public final defpackage.aonj b;
    public final defpackage.ajl c;
    public final boolean d;

    public afm(defpackage.cmj cmjVar, defpackage.aonj aonjVar, defpackage.ajl ajlVar, boolean z) {
        this.a = cmjVar;
        this.b = aonjVar;
        this.c = ajlVar;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afm) {
            defpackage.afm afmVar = (defpackage.afm) obj;
            if (defpackage.aooh.n(this.a, afmVar.a) && this.b == afmVar.b && defpackage.aooh.n(this.c, afmVar.c) && this.d == afmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + defpackage.anty.L(this.d);
    }

    public final java.lang.String toString() {
        return "ChangeSizeConfig(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ')';
    }
}
