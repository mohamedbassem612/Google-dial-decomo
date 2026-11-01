package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpl {
    public static final java.lang.String a = "gpl";
    public final defpackage.gpk b;
    public final defpackage.gpi c;
    public final defpackage.goj d;
    public final defpackage.gnw e;

    public gpl(defpackage.gpk gpkVar, defpackage.gpi gpiVar, defpackage.goj gojVar, defpackage.gnw gnwVar) {
        this.b = gpkVar;
        this.c = gpiVar;
        this.d = gojVar;
        this.e = gnwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gpl) {
            defpackage.gpl gplVar = (defpackage.gpl) obj;
            if (defpackage.aooh.n(this.b, gplVar.b) && defpackage.aooh.n(this.c, gplVar.c) && defpackage.aooh.n(this.d, gplVar.d) && defpackage.aooh.n(this.e, gplVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "gpl:{splitType=" + this.b + ", layoutDir=" + this.c + ", animationParams=" + this.d + ", dividerAttributes=" + this.e + " }";
    }
}
