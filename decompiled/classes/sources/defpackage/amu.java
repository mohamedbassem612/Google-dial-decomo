package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amu {
    public final float a;
    public final defpackage.cqd b;

    public amu(float f, defpackage.cqd cqdVar) {
        this.a = f;
        this.b = cqdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.amu) {
            defpackage.amu amuVar = (defpackage.amu) obj;
            if (java.lang.Float.compare(this.a, amuVar.a) == 0 && defpackage.aooh.n(this.b, amuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BorderStroke(width=" + defpackage.dpi.b(this.a) + ", brush=" + this.b + ')';
    }
}
