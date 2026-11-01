package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csx {
    public static int a;
    public static final java.lang.Object b;
    public static final defpackage.sl m;
    public final java.lang.String c = "";
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final defpackage.ctx h;
    public final long i;
    public final int j;
    public final boolean k;
    public final int l;

    static {
        defpackage.sl slVar = new defpackage.sl();
        m = slVar;
        b = slVar;
    }

    public csx(float f, float f2, float f3, float f4, defpackage.ctx ctxVar, long j, int i, boolean z, int i2) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = ctxVar;
        this.i = j;
        this.j = i;
        this.k = z;
        this.l = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.csx) {
            defpackage.csx csxVar = (defpackage.csx) obj;
            if (defpackage.aooh.n(this.c, csxVar.c) && java.lang.Float.compare(this.d, csxVar.d) == 0 && java.lang.Float.compare(this.e, csxVar.e) == 0 && this.f == csxVar.f && this.g == csxVar.g && defpackage.aooh.n(this.h, csxVar.h) && this.i == csxVar.i && this.j == csxVar.j && this.k == csxVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + this.h.hashCode();
        int i = true != this.k ? 1237 : 1231;
        long j = this.i;
        return (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.j) * 31) + i;
    }
}
