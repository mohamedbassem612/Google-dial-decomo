package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elm {
    public final float a;
    public final defpackage.elv b;
    public final defpackage.elv c;

    public elm(float f, defpackage.elv elvVar, defpackage.elv elvVar2) {
        aooh.f(elvVar, "f1");
        aooh.f(elvVar2, "f2");
        this.a = f;
        this.b = elvVar;
        this.c = elvVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.elm) {
            defpackage.elm elmVar = (defpackage.elm) obj;
            if (java.lang.Float.compare(this.a, elmVar.a) == 0 && aooh.n(this.b, elmVar.b) && aooh.n(this.c, elmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "DistanceVertex(distance=" + this.a + ", f1=" + this.b + ", f2=" + this.c + ')';
    }
}
