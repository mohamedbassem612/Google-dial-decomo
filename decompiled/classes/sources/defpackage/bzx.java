package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bzx {
    public final boolean a;
    public final float b;
    public final defpackage.cqi c;
    public final defpackage.bzw d;
    public final defpackage.bzr e;
    public final defpackage.bzt f;
    public final defpackage.bzn g;

    public bzx(boolean z, float f, defpackage.cqi cqiVar, defpackage.bzw bzwVar, defpackage.bzr bzrVar, defpackage.bzt bztVar, defpackage.bzn bznVar) {
        this.a = z;
        this.b = f;
        this.c = cqiVar;
        this.d = bzwVar;
        this.e = bzrVar;
        this.f = bztVar;
        this.g = bznVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bzx) {
            defpackage.bzx bzxVar = (defpackage.bzx) obj;
            if (this.a == bzxVar.a && java.lang.Float.compare(this.b, bzxVar.b) == 0 && defpackage.aooh.n(this.c, bzxVar.c) && defpackage.aooh.n(this.d, bzxVar.d) && defpackage.aooh.n(this.e, bzxVar.e) && defpackage.aooh.n(this.f, bzxVar.f) && defpackage.aooh.n(this.g, bzxVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((defpackage.anty.L(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }
}
