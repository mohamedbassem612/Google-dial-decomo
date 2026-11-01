package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dka {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final defpackage.djb g;

    public dka(defpackage.djb djbVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.g = djbVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = f2;
    }

    public final float a(float f) {
        return f + this.e;
    }

    public final int b() {
        return this.b - this.a;
    }

    public final int c(int i) {
        return i + this.a;
    }

    public final int d(int i) {
        return i + this.c;
    }

    public final int e(int i) {
        int i2 = this.a;
        return defpackage.aooc.w(i, i2, this.b) - i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dka) {
            defpackage.dka dkaVar = (defpackage.dka) obj;
            if (defpackage.aooh.n(this.g, dkaVar.g) && this.a == dkaVar.a && this.b == dkaVar.b && this.c == dkaVar.c && this.d == dkaVar.d && java.lang.Float.compare(this.e, dkaVar.e) == 0 && java.lang.Float.compare(this.f, dkaVar.f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i) {
        return i - this.c;
    }

    public final defpackage.cpn g(defpackage.cpn cpnVar) {
        return cpnVar.g(((long) java.lang.Float.floatToRawIntBits(this.e)) & 4294967295L);
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.a + ", endIndex=" + this.b + ", startLineIndex=" + this.c + ", endLineIndex=" + this.d + ", top=" + this.e + ", bottom=" + this.f + ')';
    }
}
