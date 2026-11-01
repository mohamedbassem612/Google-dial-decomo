package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csm extends defpackage.den {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final cpy e;

    public /* synthetic */ csm(float f, float f2, int i, int i2, int i3) {
        this.a = 1 == (i3 & 1) ? 0.0f : f;
        this.b = (i3 & 2) != 0 ? 4.0f : f2;
        this.c = (i3 & 4) != 0 ? 0 : i;
        this.d = (i3 & 8) != 0 ? 0 : i2;
        this.e = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.csm) {
            defpackage.csm csmVar = (defpackage.csm) obj;
            if (this.a == csmVar.a && this.b == csmVar.b && this.c == csmVar.c && this.d == csmVar.d) {
                cpy cpyVar = csmVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.c;
        java.lang.String str2 = "Round";
        if (i == 0) {
            str = "Butt";
        } else {
            str = i == 1 ? "Round" : "Square";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 != 1) {
            str2 = "Bevel";
        }
        float f = this.b;
        return "Stroke(width=" + this.a + ", miter=" + f + ", cap=" + str + ", join=" + str2 + ", pathEffect=null)";
    }

    public csm() {
        this(0.0f, 0.0f, 0, 0, 31);
    }
}
