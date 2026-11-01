package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class baz implements defpackage.bef {
    public final int a;
    public final java.util.List b;
    public final boolean c;
    public final int d;
    public final java.lang.Object e;
    public final defpackage.bdu f;
    public int g;
    public final int h;
    public final int i;
    public boolean j;
    public int k = Integer.MIN_VALUE;
    public int l;
    public final int[] m;
    private final defpackage.cmi n;
    private final defpackage.dpq o;
    private final boolean p;
    private final int q;
    private final int r;
    private final long s;
    private final long t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private int y;
    private final defpackage.cmn z;

    public baz(int i, java.util.List list, boolean z, defpackage.cmi cmiVar, defpackage.cmn cmnVar, defpackage.dpq dpqVar, boolean z2, int i2, int i3, int i4, long j, java.lang.Object obj, defpackage.bdu bduVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.n = cmiVar;
        this.z = cmnVar;
        this.o = dpqVar;
        this.p = z2;
        this.q = i2;
        this.d = i3;
        this.r = i4;
        this.s = j;
        this.e = obj;
        this.f = bduVar;
        this.t = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            defpackage.czc czcVar = (defpackage.czc) list.get(i6);
            boolean z3 = this.c;
            i5 += z3 ? czcVar.b : czcVar.a;
            iMax = java.lang.Math.max(iMax, !z3 ? czcVar.b : czcVar.a);
        }
        this.h = i5;
        this.i = iMax;
        this.m = new int[this.b.size() << 1];
        if (this.c) {
            this.x = this.r;
            this.v = i5;
            this.u = iMax;
            this.w = 0;
            return;
        }
        this.x = 0;
        this.v = iMax;
        this.u = i5;
        this.w = this.r;
    }

    private final int q(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    private final int r(defpackage.czc czcVar) {
        return this.c ? czcVar.b : czcVar.a;
    }

    @Override // defpackage.bef
    public final int a() {
        return this.u;
    }

    @Override // defpackage.bef
    public final int b() {
        return this.w;
    }

    @Override // defpackage.bef
    public final int c() {
        return this.a;
    }

    @Override // defpackage.bef
    public final int d() {
        return 0;
    }

    public final int e() {
        int i;
        int i2;
        if (this.c) {
            i = this.v;
            i2 = this.x;
        } else {
            i = this.u;
            i2 = this.w;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    @Override // defpackage.bef
    public final int f() {
        return 1;
    }

    @Override // defpackage.bef
    public final int g() {
        return this.v;
    }

    @Override // defpackage.bef
    public final int h() {
        return this.x;
    }

    @Override // defpackage.bef
    public final long i() {
        return this.t;
    }

    @Override // defpackage.bef
    public final long j(int i) {
        if (i == 0) {
            if (this.b.size() == 0) {
                boolean z = this.c;
                int i2 = this.g;
                return z ? ((long) i2) & 4294967295L : ((long) i2) << 32;
            }
            i = 0;
        }
        int[] iArr = this.m;
        int i3 = i << 1;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // defpackage.bef
    public final java.lang.Object k() {
        return this.e;
    }

    @Override // defpackage.bef
    public final java.util.List l() {
        return this.b;
    }

    @Override // defpackage.bef
    public final void m() {
        this.j = true;
    }

    public final void n(defpackage.czb czbVar, boolean z) {
        defpackage.cso csoVarE;
        char c;
        long j;
        long jIntValue;
        if (this.k == Integer.MIN_VALUE) {
            avo.c("position() should be called first");
        }
        java.util.List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.czc czcVar = (defpackage.czc) list.get(i);
            int iR = this.y - r(czcVar);
            int i2 = this.l;
            long j2 = j(i);
            defpackage.bfe bfeVarD = this.f.d(this.e, i);
            if (bfeVarD != null) {
                if (z) {
                    bfeVarD.l(j2);
                } else {
                    if (bfeVarD.a() != 9223372034707292159L) {
                        j2 = bfeVarD.a();
                    }
                    long jD = defpackage.dpn.d(j2, bfeVarD.b());
                    if ((q(j2) <= iR && q(jD) <= iR) || (q(j2) >= i2 && q(jD) >= i2)) {
                        bfeVarD.j();
                    }
                    j2 = jD;
                }
                csoVarE = bfeVarD.e();
            } else {
                csoVarE = null;
            }
            long jR = j2;
            defpackage.cso csoVar = csoVarE;
            if (this.p) {
                boolean z2 = this.c;
                int i3 = (int) (jR & 4294967295L);
                int i4 = (int) (jR >> 32);
                int i5 = this.k;
                jR = z2 ? (((long) i4) << 32) | (((long) ((i5 - i3) - r(czcVar))) & 4294967295L) : (((long) ((i5 - i4) - r(czcVar))) << 32) | (((long) i3) & 4294967295L);
            }
            long jD2 = defpackage.dpn.d(jR, this.s);
            if (z || bfeVarD == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                if (this.c || this.o != defpackage.dpq.b) {
                    c = ' ';
                    j = 4294967295L;
                    jIntValue = jD2;
                } else {
                    j = 4294967295L;
                    c = ' ';
                    jIntValue = (((long) java.lang.Integer.valueOf((((this.k + this.q) + this.d) - ((int) (jD2 >> 32))) - r(czcVar)).intValue()) << 32) | (((long) ((int) (jD2 & 4294967295L))) & 4294967295L);
                }
                bfeVarD.o(jIntValue);
            }
            if (this.c) {
                if (csoVar != null) {
                    czbVar.w(czcVar, jD2, csoVar, 0.0f);
                } else {
                    defpackage.czb.A(czbVar, czcVar, jD2, null, 6);
                }
            } else if (csoVar == null) {
                defpackage.aonj aonjVar = defpackage.czd.a;
                if (czbVar.p() == defpackage.dpq.a || czbVar.n() == 0) {
                    czbVar.r(czcVar);
                    czcVar.dg(defpackage.dpn.d(jD2, czcVar.e), 0.0f, aonjVar);
                } else {
                    czbVar.r(czcVar);
                    czcVar.dg(defpackage.dpn.d((((long) ((czbVar.n() - czcVar.a) - ((int) (jD2 >> c)))) << c) | (((long) ((int) (jD2 & j))) & j), czcVar.e), 0.0f, aonjVar);
                }
            } else if (czbVar.p() == defpackage.dpq.a || czbVar.n() == 0) {
                czbVar.r(czcVar);
                czcVar.y(defpackage.dpn.d(jD2, czcVar.e), 0.0f, csoVar);
            } else {
                czbVar.r(czcVar);
                czcVar.y(defpackage.dpn.d((((long) ((czbVar.n() - czcVar.a) - ((int) (jD2 >> c)))) << c) | (((long) ((int) (jD2 & j))) & j), czcVar.e), 0.0f, csoVar);
            }
        }
    }

    public final void o(int i, int i2, int i3) {
        int i4;
        this.g = i;
        boolean z = this.c;
        this.k = true != z ? i2 : i3;
        java.util.List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            defpackage.czc czcVar = (defpackage.czc) list.get(i5);
            int i6 = i5 << 1;
            int[] iArr = this.m;
            if (z) {
                defpackage.cmi cmiVar = this.n;
                if (cmiVar == null) {
                    avo.a("null horizontalAlignment when isVertical == true");
                    throw new defpackage.aoiq();
                }
                iArr[i6] = cmiVar.a(czcVar.a, i2, this.o);
                iArr[i6 + 1] = i;
                i4 = czcVar.b;
            } else {
                int i7 = i6 + 1;
                iArr[i6] = i;
                defpackage.cmn cmnVar = this.z;
                if (cmnVar == null) {
                    avo.a("null verticalAlignment when isVertical == false");
                    throw new defpackage.aoiq();
                }
                iArr[i7] = cmnVar.a(czcVar.b, i3);
                i4 = czcVar.a;
            }
            i += i4;
        }
        this.y = -this.q;
        this.l = this.k + this.d;
    }

    @Override // defpackage.bef
    public final void p(int i, int i2, int i3, int i4) {
        o(i, i3, i4);
    }
}
