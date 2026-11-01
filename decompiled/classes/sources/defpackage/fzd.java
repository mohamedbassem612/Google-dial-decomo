package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzd {
    public final defpackage.gaa a;
    public final defpackage.gaa b;
    public final defpackage.gaa c;
    public final defpackage.gab d;

    public fzd(defpackage.gaa gaaVar, defpackage.gaa gaaVar2, defpackage.gaa gaaVar3, defpackage.gab gabVar) {
        if (gaaVar == null) {
            defpackage.aooh.i("refresh");
        }
        if (gaaVar2 == null) {
            defpackage.aooh.i("prepend");
        }
        if (gaaVar3 == null) {
            defpackage.aooh.i("append");
        }
        if (gabVar == null) {
            defpackage.aooh.i("source");
        }
        this.a = gaaVar;
        this.b = gaaVar2;
        this.c = gaaVar3;
        this.d = gabVar;
        boolean z = gabVar.f;
        boolean z2 = gabVar.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fzd fzdVar = (defpackage.fzd) obj;
            if (defpackage.aooh.n(this.a, fzdVar.a) && defpackage.aooh.n(this.b, fzdVar.b) && defpackage.aooh.n(this.c, fzdVar.c) && defpackage.aooh.n(this.d, fzdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=null)";
    }
}
