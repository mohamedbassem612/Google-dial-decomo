package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elv {
    public final float a;
    public final defpackage.elq b;

    public elv(float f, defpackage.elq elqVar) {
        aooh.f(elqVar, "feature");
        this.a = f;
        this.b = elqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.elv) {
            defpackage.elv elvVar = (defpackage.elv) obj;
            if (java.lang.Float.compare(this.a, elvVar.a) == 0 && aooh.n(this.b, elvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
