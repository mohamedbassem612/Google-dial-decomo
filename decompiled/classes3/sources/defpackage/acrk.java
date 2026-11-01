package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acrk {
    public final defpackage.acrt a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final aiq p;
    public final aiq q;
    public final aiq r;
    public final aiq s;
    public final aiq t;
    public final aiq u;
    public final aiq v;
    public final long w;
    public final int x;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ acrk(defpackage.acrt acrtVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, aiq aiqVar, aiq aiqVar2, aiq aiqVar3, aiq aiqVar4, aiq aiqVar5, int i) {
        long j;
        int i2;
        int i3;
        aiq aiqVarBw;
        int i4;
        int i5;
        ajh ajhVar;
        int i6;
        aiq aiqVarBw2;
        int i7;
        ajr ajrVarBw;
        float f14;
        aiq aiqVarBw3;
        defpackage.acrt acrtVar2 = (i & 1) != 0 ? defpackage.acrt.a : acrtVar;
        float f15 = (i & 2) != 0 ? 180.0f : f;
        float f16 = (i & 4) != 0 ? 270.0f : f2;
        float f17 = (i & 16) != 0 ? 0.0f : f3;
        float f18 = (i & 32) != 0 ? 0.5f : f4;
        float f19 = (i & 64) != 0 ? 0.5f : f5;
        float f20 = (i & 128) != 0 ? 0.5f : f6;
        float f21 = (i & 256) != 0 ? 0.5f : f7;
        float f22 = (i & 512) != 0 ? 0.5f : f8;
        float f23 = (i & 1024) != 0 ? 0.5f : f9;
        float f24 = (i & 2048) != 0 ? 0.5f : f10;
        float f25 = (i & 4096) != 0 ? 0.5f : f11;
        float f26 = (i & 8192) != 0 ? 1.0f : f12;
        float f27 = (i & 16384) != 0 ? 1.0f : f13;
        defpackage.acrt acrtVar3 = acrtVar2;
        aiq aiqVarBw4 = (32768 & i) != 0 ? den.bw(den.bv(5000, 0, ajk.d, 2), 1, 0L, 4) : aiqVar;
        float f28 = f18;
        if ((i & 65536) != 0) {
            j = 0;
            i2 = 4;
            i3 = 1;
            aiqVarBw = den.bw(den.bv(3000, 0, (ajh) null, 6), 1, 0L, 4);
        } else {
            j = 0;
            i2 = 4;
            i3 = 1;
            aiqVarBw = aiqVar2;
        }
        aiq aiqVar6 = aiqVarBw;
        float f29 = f17;
        float f30 = f26;
        if ((i & 131072) != 0) {
            i4 = 3000;
            i5 = 6;
            ajhVar = null;
            i6 = 0;
            aiqVarBw2 = den.bw(den.bv(3000, 0, (ajh) null, 6), i3, j, i2);
        } else {
            i4 = 3000;
            i5 = 6;
            ajhVar = null;
            i6 = 0;
            aiqVarBw2 = aiqVar3;
        }
        aiq aiqVarBw5 = (i & 262144) != 0 ? den.bw(den.bv(i4, i6, ajhVar, i5), i3, j, i2) : aiqVar4;
        if ((i & 524288) != 0) {
            i7 = 2;
            ajrVarBw = den.bw(den.bv(5000, i6, ajk.d, 2), i3, j, i2);
        } else {
            i7 = 2;
            ajrVarBw = null;
        }
        if ((i & 1048576) != 0) {
            aiqVarBw3 = den.bw(den.bv(2500, i6, ajk.d, i7), i7, j, i2);
            f14 = f20;
        } else {
            f14 = f20;
            aiqVarBw3 = null;
        }
        aiq aiqVarBw6 = (i & 2097152) != 0 ? den.bw(den.bv(8000, i6, (ajh) null, 6), 1, j, i2) : aiqVar5;
        this(acrtVar3, f15, f16, 0.0f, f29, f28, f19, f14, f21, f22, f23, f24, f25, f30, f27, aiqVarBw4, aiqVar6, aiqVarBw2, aiqVarBw5, ajrVarBw, aiqVarBw3, aiqVarBw6, cfd.S(), 120);
    }

    public static final defpackage.acrk a(defpackage.acrt acrtVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, aiq aiqVar, aiq aiqVar2, aiq aiqVar3, aiq aiqVar4, aiq aiqVar5, aiq aiqVar6, aiq aiqVar7, long j, int i) {
        aooh.f(acrtVar, "rotationMode");
        aooh.f(aiqVar, "rotationSpec");
        aooh.f(aiqVar2, "sweepOffsetSpec");
        aooh.f(aiqVar3, "sweepApertureMultiplierSpec");
        aooh.f(aiqVar4, "sweepYVarianceSpec");
        aooh.f(aiqVar5, "distortionSpec");
        aooh.f(aiqVar6, "wobbleSpec");
        aooh.f(aiqVar7, "oscillatingSpec");
        return new defpackage.acrk(acrtVar, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, aiqVar, aiqVar2, aiqVar3, aiqVar4, aiqVar5, aiqVar6, aiqVar7, j, i);
    }

    public static /* synthetic */ defpackage.acrk b(defpackage.acrk acrkVar, aiq aiqVar, aiq aiqVar2, aiq aiqVar3, aiq aiqVar4, aiq aiqVar5, aiq aiqVar6, aiq aiqVar7, int i, int i2) {
        float f;
        int i3;
        defpackage.acrt acrtVar = (i2 & 1) != 0 ? acrkVar.a : null;
        float f2 = (i2 & 2) != 0 ? acrkVar.b : 0.0f;
        float f3 = (i2 & 4) != 0 ? acrkVar.c : 0.0f;
        float f4 = (i2 & 8) != 0 ? acrkVar.d : 0.0f;
        float f5 = (i2 & 16) != 0 ? acrkVar.e : 0.0f;
        float f6 = (i2 & 32) != 0 ? acrkVar.f : 0.0f;
        float f7 = (i2 & 64) != 0 ? acrkVar.g : 0.0f;
        float f8 = (i2 & 128) != 0 ? acrkVar.h : 0.0f;
        float f9 = (i2 & 256) != 0 ? acrkVar.i : 0.0f;
        float f10 = (i2 & 512) != 0 ? acrkVar.j : 0.0f;
        float f11 = (i2 & 1024) != 0 ? acrkVar.k : 0.0f;
        float f12 = (i2 & 2048) != 0 ? acrkVar.l : 0.0f;
        float f13 = (i2 & 4096) != 0 ? acrkVar.m : 0.0f;
        float f14 = (i2 & 8192) != 0 ? acrkVar.n : 0.0f;
        defpackage.acrt acrtVar2 = acrtVar;
        float f15 = (i2 & 16384) != 0 ? acrkVar.o : 0.0f;
        aiq aiqVar8 = (32768 & i2) != 0 ? acrkVar.p : aiqVar;
        aiq aiqVar9 = (i2 & 65536) != 0 ? acrkVar.q : aiqVar2;
        aiq aiqVar10 = (i2 & 131072) != 0 ? acrkVar.r : aiqVar3;
        aiq aiqVar11 = (i2 & 262144) != 0 ? acrkVar.s : aiqVar4;
        aiq aiqVar12 = (i2 & 524288) != 0 ? acrkVar.t : aiqVar5;
        aiq aiqVar13 = (i2 & 1048576) != 0 ? acrkVar.u : aiqVar6;
        aiq aiqVar14 = (i2 & 2097152) != 0 ? acrkVar.v : aiqVar7;
        aiq aiqVar15 = aiqVar8;
        long j = (i2 & 4194304) != 0 ? acrkVar.w : 0L;
        if ((i2 & 8388608) != 0) {
            f = f12;
            i3 = acrkVar.x;
        } else {
            f = f12;
            i3 = i;
        }
        return a(acrtVar2, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f, f13, f14, f15, aiqVar15, aiqVar9, aiqVar10, aiqVar11, aiqVar12, aiqVar13, aiqVar14, j, i3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acrk) {
            defpackage.acrk acrkVar = (defpackage.acrk) obj;
            if (this.a == acrkVar.a && this.b == acrkVar.b && this.c == acrkVar.c && this.d == acrkVar.d && this.e == acrkVar.e && this.f == acrkVar.f && this.g == acrkVar.g && this.h == acrkVar.h && this.i == acrkVar.i && this.j == acrkVar.j && this.k == acrkVar.k && this.l == acrkVar.l && this.m == acrkVar.m && this.n == acrkVar.n && this.o == acrkVar.o && aooh.n(this.p, acrkVar.p) && aooh.n(this.q, acrkVar.q) && aooh.n(this.r, acrkVar.r) && aooh.n(this.s, acrkVar.s) && aooh.n(this.t, acrkVar.t) && aooh.n(this.u, acrkVar.u) && aooh.n(this.v, acrkVar.v) && anty.ah(this.w, acrkVar.w) && this.x == acrkVar.x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + java.lang.Float.floatToIntBits(this.m)) * 31) + java.lang.Float.floatToIntBits(this.n)) * 31) + java.lang.Float.floatToIntBits(this.o)) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + anty.M(this.w)) * 31) + this.x;
    }

    private acrk(defpackage.acrt acrtVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, aiq aiqVar, aiq aiqVar2, aiq aiqVar3, aiq aiqVar4, aiq aiqVar5, aiq aiqVar6, aiq aiqVar7, long j, int i) {
        aooh.f(acrtVar, "rotationMode");
        aooh.f(aiqVar, "rotationSpec");
        aooh.f(aiqVar2, "sweepOffsetSpec");
        aooh.f(aiqVar3, "sweepApertureMultiplierSpec");
        aooh.f(aiqVar4, "sweepYVarianceSpec");
        aooh.f(aiqVar5, "distortionSpec");
        aooh.f(aiqVar6, "wobbleSpec");
        aooh.f(aiqVar7, "oscillatingSpec");
        this.a = acrtVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = f11;
        this.m = f12;
        this.n = f13;
        this.o = f14;
        this.p = aiqVar;
        this.q = aiqVar2;
        this.r = aiqVar3;
        this.s = aiqVar4;
        this.t = aiqVar5;
        this.u = aiqVar6;
        this.v = aiqVar7;
        this.w = j;
        this.x = i;
    }

    public acrk() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, 16777215);
    }
}
