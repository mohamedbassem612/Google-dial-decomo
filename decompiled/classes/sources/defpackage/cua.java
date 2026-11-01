package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cua extends defpackage.sl {
    public final java.lang.String a;
    public final java.util.List b;
    public final int c;
    public final defpackage.cqd d;
    public final float e;
    public final defpackage.cqd f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public cua(java.lang.String str, java.util.List list, int i, defpackage.cqd cqdVar, float f, defpackage.cqd cqdVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = cqdVar;
        this.e = f;
        this.f = cqdVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.cua cuaVar = (defpackage.cua) obj;
            if (defpackage.aooh.n(this.a, cuaVar.a) && defpackage.aooh.n(this.d, cuaVar.d) && this.e == cuaVar.e && defpackage.aooh.n(this.f, cuaVar.f) && this.g == cuaVar.g && this.h == cuaVar.h && this.i == cuaVar.i && this.j == cuaVar.j && this.k == cuaVar.k && this.l == cuaVar.l && this.m == cuaVar.m && this.n == cuaVar.n && this.c == cuaVar.c && defpackage.aooh.n(this.b, cuaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.cqd cqdVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (cqdVar != null ? cqdVar.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31;
        defpackage.cqd cqdVar2 = this.f;
        return ((((((((((((((((((iHashCode2 + (cqdVar2 != null ? cqdVar2.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + java.lang.Float.floatToIntBits(this.m)) * 31) + java.lang.Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
