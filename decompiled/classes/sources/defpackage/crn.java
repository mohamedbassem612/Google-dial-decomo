package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class crn {
    public final java.lang.String a;
    public final long b;
    public final int c;

    public crn(java.lang.String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public float c(float f, float f2, float f3) {
        throw null;
    }

    public long d(float f, float f2, float f3) {
        throw null;
    }

    public long e(float f, float f2, float f3, float f4, defpackage.crn crnVar) {
        throw null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.crn crnVar = (defpackage.crn) obj;
            if (this.c == crnVar.c && defpackage.aooh.n(this.a, crnVar.a) && this.b == crnVar.b) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ((int) (this.b ^ 3))) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return this.a + " (id=" + this.c + ", model=" + defpackage.crm.a(this.b) + ')';
    }
}
