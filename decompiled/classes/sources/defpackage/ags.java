package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ags {
    public final float a;
    public final long b;
    public final defpackage.ajl c;

    public ags(float f, long j, defpackage.ajl ajlVar) {
        this.a = f;
        this.b = j;
        this.c = ajlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ags) {
            defpackage.ags agsVar = (defpackage.ags) obj;
            if (this.a == agsVar.a && defpackage.anty.ah(this.b, agsVar.b) && defpackage.aooh.n(this.c, agsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + defpackage.anty.M(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ScaleConfig(scale=" + this.a + ", transformOrigin=" + defpackage.crg.a(this.b) + ", animationSpec=" + this.c + ')';
    }
}
