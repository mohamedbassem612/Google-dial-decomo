package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class goj {
    public final defpackage.goh a;
    public final defpackage.goi b;
    public final defpackage.goi c;
    public final defpackage.goi d;

    public goj(defpackage.goh gohVar, defpackage.goi goiVar, defpackage.goi goiVar2, defpackage.goi goiVar3) {
        this.a = gohVar;
        this.b = goiVar;
        this.c = goiVar2;
        this.d = goiVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.goj) {
            defpackage.goj gojVar = (defpackage.goj) obj;
            if (defpackage.aooh.n(this.a, gojVar.a) && defpackage.aooh.n(this.b, gojVar.b) && defpackage.aooh.n(this.c, gojVar.c) && defpackage.aooh.n(this.d, gojVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "goj:{animationBackground=" + this.a + ", openAnimation=" + this.b + ", closeAnimation=" + this.c + ", changeAnimation=" + this.d + " }";
    }
}
