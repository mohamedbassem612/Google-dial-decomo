package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zam {
    public final java.util.Set a;
    public final defpackage.zan b;

    public zam(java.util.Set set, defpackage.zan zanVar) {
        this.a = set;
        this.b = zanVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zam) {
            defpackage.zam zamVar = (defpackage.zam) obj;
            if (defpackage.aooh.n(this.a, zamVar.a) && defpackage.aooh.n(this.b, zamVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CuiMultiEventEnd(cuiEvents=" + this.a + ", semanticEventData=" + this.b + ')';
    }
}
