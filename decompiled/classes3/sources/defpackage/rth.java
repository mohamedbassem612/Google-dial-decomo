package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rth implements defpackage.rtj {
    public final rrz a;
    public final defpackage.rsl b;

    public rth(rrz rrzVar, defpackage.rsl rslVar) {
        aooh.f(rrzVar, "marquee");
        this.a = rrzVar;
        this.b = rslVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rth) {
            defpackage.rth rthVar = (defpackage.rth) obj;
            if (aooh.n(this.a, rthVar.a) && aooh.n(this.b, rthVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Data(marquee=" + this.a + ", uiModel=" + this.b + ')';
    }
}
