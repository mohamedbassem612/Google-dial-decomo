package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amdp {
    public static final defpackage.amdp a;
    public static final defpackage.amdp b;
    public static final defpackage.amdp c;
    public static final defpackage.amdp d;
    public final float e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;
    public final double m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    static {
        defpackage.amdo amdoVarA = a();
        amdoVarA.i(0.51f);
        amdoVarA.d();
        amdoVarA.e(0.3f);
        amdoVarA.n(8);
        amdoVarA.m(0.51f);
        amdoVarA.h(3);
        amdoVarA.g();
        amdoVarA.l(0);
        amdoVarA.f(5);
        amdoVarA.c(0.0d);
        a = amdoVarA.a();
        defpackage.amdo amdoVarA2 = a();
        amdoVarA2.i(0.3f);
        amdoVarA2.d();
        amdoVarA2.e(0.3f);
        amdoVarA2.n(8);
        amdoVarA2.m(0.49f);
        amdoVarA2.h(0);
        amdoVarA2.g();
        amdoVarA2.l(2);
        amdoVarA2.f(5);
        amdoVarA2.c(0.0d);
        b = amdoVarA2.a();
        defpackage.amdo amdoVarA3 = a();
        amdoVarA3.i(0.3f);
        amdoVarA3.d();
        amdoVarA3.e(0.3f);
        amdoVarA3.n(6);
        amdoVarA3.m(0.51f);
        amdoVarA3.h(0);
        amdoVarA3.g();
        amdoVarA3.l(1);
        amdoVarA3.f(5);
        amdoVarA3.c(0.0d);
        c = amdoVarA3.a();
        defpackage.amdo amdoVarA4 = a();
        amdoVarA4.i(0.8f);
        amdoVarA4.d();
        amdoVarA4.e(0.4f);
        amdoVarA4.n(8);
        amdoVarA4.m(0.61f);
        amdoVarA4.h(5);
        amdoVarA4.g();
        amdoVarA4.l(0);
        amdoVarA4.f(1);
        amdoVarA4.c(0.20999999344348907d);
        amdoVarA4.b(true);
        d = amdoVarA4.a();
    }

    public amdp(float f, int i, float f2, int i2, float f3, int i3, int i4, int i5, double d2, int i6, boolean z, boolean z2, boolean z3) {
        this.e = f;
        this.f = i;
        this.g = f2;
        this.h = i2;
        this.i = f3;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = d2;
        this.n = i6;
        this.o = z;
        this.p = z2;
        this.q = z3;
    }

    public static defpackage.amdo a() {
        defpackage.amdo amdoVar = new defpackage.amdo();
        amdoVar.b(false);
        amdoVar.k(false);
        amdoVar.j(false);
        return amdoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amdp) {
            defpackage.amdp amdpVar = (defpackage.amdp) obj;
            if (java.lang.Float.floatToIntBits(this.e) == java.lang.Float.floatToIntBits(amdpVar.e) && this.f == amdpVar.f) {
                if (java.lang.Float.floatToIntBits(this.g) == java.lang.Float.floatToIntBits(amdpVar.g) && this.h == amdpVar.h) {
                    if (java.lang.Float.floatToIntBits(this.i) == java.lang.Float.floatToIntBits(amdpVar.i) && this.j == amdpVar.j && this.k == amdpVar.k && this.l == amdpVar.l) {
                        if (java.lang.Double.doubleToLongBits(this.m) == java.lang.Double.doubleToLongBits(amdpVar.m) && this.n == amdpVar.n && this.o == amdpVar.o && this.p == amdpVar.p && this.q == amdpVar.q) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((java.lang.Float.floatToIntBits(this.e) ^ 1000003) * 1000003) ^ this.f) * 1000003) ^ java.lang.Float.floatToIntBits(this.g)) * 1000003) ^ this.h) * 1000003) ^ java.lang.Float.floatToIntBits(this.i);
        double d2 = this.m;
        long jDoubleToLongBits = (java.lang.Double.doubleToLongBits(d2) >>> 32) ^ java.lang.Double.doubleToLongBits(d2);
        return (((((((((((((((iFloatToIntBits * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ this.n) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true == this.q ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "MatchProcessorParams{minMatchRatio=" + this.e + ", maxConsecutiveErrors=" + this.f + ", maxCostToMatchWords=" + this.g + ", suffixTokensToCompare=" + this.h + ", suffixMinMatchRatio=" + this.i + ", minAsrTokens=" + this.j + ", maxIgnorableOnlineItemWords=" + this.k + ", suffixAsrTokensToIgnore=" + this.l + ", maxAmbiguityMatchCostDiff=" + this.m + ", maxDroppedCachePrefixWordCount=" + this.n + ", isRematch=" + this.o + ", splitUrls=" + this.p + ", splitDigits=" + this.q + '}';
    }

    public amdp() {
        throw null;
    }
}
