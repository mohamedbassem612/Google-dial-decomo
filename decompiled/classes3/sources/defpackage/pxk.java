package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxk {
    public final defpackage.pxl a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;

    public pxk(defpackage.pxl pxlVar, j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = pxlVar;
        this.b = optional;
        this.c = optional2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pxk) {
            defpackage.pxk pxkVar = (defpackage.pxk) obj;
            if (this.a.equals(pxkVar.a) && this.b.equals(pxkVar.b) && this.c.equals(pxkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.c;
        j$.util.Optional optional2 = this.b;
        return "InCallDialogConfig{displayModel=" + java.lang.String.valueOf(this.a) + ", positiveClickListener=" + java.lang.String.valueOf(optional2) + ", negativeClickListener=" + java.lang.String.valueOf(optional) + '}';
    }

    public pxk() {
        throw null;
    }
}
