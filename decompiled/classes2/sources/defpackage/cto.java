package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cto extends cts {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public cto(float f, float f2, float f3, float f4) {
        super(true, false);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cto) {
            defpackage.cto ctoVar = (defpackage.cto) obj;
            if (java.lang.Float.compare(this.a, ctoVar.a) == 0 && java.lang.Float.compare(this.b, ctoVar.b) == 0 && java.lang.Float.compare(this.c, ctoVar.c) == 0 && java.lang.Float.compare(this.d, ctoVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RelativeReflectiveCurveTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ')';
    }
}
