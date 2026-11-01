package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fpk {
    public final int a;
    public final int b;
    public final float c;

    private fpk(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static defpackage.fpk a(int i) {
        int i2 = i >> 13;
        if (i2 == 0) {
            return null;
        }
        return new defpackage.fpk(i2, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.fpk)) {
            return false;
        }
        defpackage.fpk fpkVar = (defpackage.fpk) obj;
        return this.a == fpkVar.a && this.b == fpkVar.b && java.lang.Float.compare(this.c, fpkVar.c) == 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
