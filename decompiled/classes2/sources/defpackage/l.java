package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class l {
    private static int h = 1000;
    public defpackage.j[] c;
    public final defpackage.hiv g;
    int a = 0;
    public final defpackage.k b = new defpackage.k();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private defpackage.m[] l = new defpackage.m[h];
    private int m = 0;
    private defpackage.j[] n = new defpackage.j[32];

    public l() {
        this.c = null;
        this.c = new defpackage.j[32];
        r();
        this.g = new defpackage.hiv();
    }

    public static defpackage.j b(defpackage.l lVar, defpackage.m mVar, defpackage.m mVar2, int i, float f, defpackage.m mVar3, defpackage.m mVar4, int i2, boolean z) {
        defpackage.j jVarA = lVar.a();
        jVarA.d(mVar, mVar2, i, f, mVar3, mVar4, i2);
        if (z) {
            defpackage.m mVarD = lVar.d();
            defpackage.m mVarD2 = lVar.d();
            mVarD.c = 4;
            mVarD2.c = 4;
            jVarA.c(mVarD, mVarD2);
        }
        return jVarA;
    }

    public static defpackage.j c(defpackage.l lVar, defpackage.m mVar, defpackage.m mVar2, int i, boolean z) {
        defpackage.j jVarA = lVar.a();
        jVarA.h(mVar, mVar2, i);
        if (z) {
            lVar.k(jVarA, 1);
        }
        return jVarA;
    }

    public static final int p(java.lang.Object obj) {
        defpackage.m mVar = ((defpackage.n) obj).f;
        if (mVar != null) {
            return (int) (mVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i << 1;
        this.i = i;
        this.c = (defpackage.j[]) java.util.Arrays.copyOf(this.c, i);
        defpackage.hiv hivVar = this.g;
        hivVar.c = (defpackage.m[]) java.util.Arrays.copyOf((java.lang.Object[]) hivVar.c, this.i);
        int i2 = this.i;
        this.d = new boolean[i2];
        this.j = i2;
        this.k = i2;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            defpackage.j[] jVarArr = this.c;
            if (i >= jVarArr.length) {
                return;
            }
            defpackage.j jVar = jVarArr[i];
            if (jVar != null) {
                ((aogy) this.g.b).q(jVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final defpackage.m s(int i) {
        defpackage.m mVar = (defpackage.m) ((aogy) this.g.a).p();
        if (mVar == null) {
            mVar = new defpackage.m(i);
        } else {
            mVar.b();
            mVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 << 1;
            h = i4;
            this.l = (defpackage.m[]) java.util.Arrays.copyOf(this.l, i4);
        }
        defpackage.m[] mVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        mVarArr[i5] = mVar;
        return mVar;
    }

    public final defpackage.j a() {
        defpackage.hiv hivVar = this.g;
        defpackage.j jVar = (defpackage.j) ((aogy) hivVar.b).p();
        if (jVar == null) {
            return new defpackage.j(hivVar);
        }
        jVar.a = null;
        defpackage.i iVar = jVar.d;
        iVar.e = -1;
        iVar.f = -1;
        iVar.g = false;
        iVar.a = 0;
        jVar.b = 0.0f;
        jVar.e = false;
        return jVar;
    }

    public final defpackage.m d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        defpackage.m mVarS = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        mVarS.a = i;
        ((defpackage.m[]) this.g.c)[i] = mVarS;
        return mVarS;
    }

    public final defpackage.m e(java.lang.Object obj) {
        defpackage.m mVar;
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        defpackage.n nVar = (defpackage.n) obj;
        defpackage.m mVar2 = nVar.f;
        if (mVar2 == null) {
            nVar.e();
            mVar = nVar.f;
        } else {
            mVar = mVar2;
        }
        int i = mVar.a;
        if (i == -1) {
            int i2 = this.a + 1;
            this.a = i2;
            this.e++;
            mVar.a = i2;
            mVar.h = 1;
            ((defpackage.m[]) this.g.c)[i2] = mVar;
        } else if (i > this.a || ((defpackage.m[]) this.g.c)[i] == null) {
            if (i != -1) {
                mVar.b();
            }
            int i3 = this.a + 1;
            this.a = i3;
            this.e++;
            mVar.a = i3;
            mVar.h = 1;
            ((defpackage.m[]) this.g.c)[i3] = mVar;
        }
        return mVar;
    }

    public final defpackage.m f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        defpackage.m mVarS = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        mVarS.a = i;
        ((defpackage.m[]) this.g.c)[i] = mVarS;
        return mVarS;
    }

    public final void g(defpackage.j jVar) {
        defpackage.j[] jVarArr;
        if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
            q();
        }
        if (!jVar.e) {
            if (this.f > 0) {
                defpackage.i iVar = jVar.d;
                defpackage.j[] jVarArr2 = this.c;
                int i = iVar.e;
                loop0: while (true) {
                    int i2 = 0;
                    while (true) {
                        if (i == -1 || i2 >= iVar.a) {
                            break loop0;
                        }
                        defpackage.hiv hivVar = iVar.h;
                        defpackage.m mVar = ((defpackage.m[]) hivVar.c)[iVar.b[i]];
                        if (mVar.b != -1) {
                            float f = iVar.d[i];
                            iVar.c(mVar);
                            defpackage.j jVar2 = jVarArr2[mVar.b];
                            if (!jVar2.e) {
                                defpackage.i iVar2 = jVar2.d;
                                int i3 = iVar2.e;
                                for (int i4 = 0; i3 != -1 && i4 < iVar2.a; i4++) {
                                    iVar.e(((defpackage.m[]) hivVar.c)[iVar2.b[i3]], iVar2.d[i3] * f);
                                    i3 = iVar2.c[i3];
                                }
                            }
                            jVar.b += jVar2.b * f;
                            jVar2.a.a(jVar);
                            i = iVar.e;
                        } else {
                            i = iVar.c[i];
                            i2++;
                        }
                    }
                }
                if (iVar.a == 0) {
                    jVar.e = true;
                }
            }
            float f2 = jVar.b;
            if (f2 < 0.0f) {
                jVar.b = -f2;
                defpackage.i iVar3 = jVar.d;
                int i5 = iVar3.e;
                for (int i6 = 0; i5 != -1 && i6 < iVar3.a; i6++) {
                    float[] fArr = iVar3.d;
                    fArr[i5] = -fArr[i5];
                    i5 = iVar3.c[i5];
                }
            }
            defpackage.i iVar4 = jVar.d;
            int i7 = iVar4.e;
            defpackage.m mVar2 = null;
            int i8 = 0;
            defpackage.m mVar3 = null;
            while (true) {
                if (i7 == -1 || i8 >= iVar4.a) {
                    if (mVar3 == null) {
                        break;
                    }
                    mVar2 = mVar3;
                    break;
                }
                float[] fArr2 = iVar4.d;
                float f3 = fArr2[i7];
                if (f3 < 0.0f) {
                    if (f3 > -0.001f) {
                        fArr2[i7] = 0.0f;
                        f3 = 0.0f;
                    }
                } else if (f3 < 0.001f) {
                    fArr2[i7] = 0.0f;
                    f3 = 0.0f;
                }
                if (f3 != 0.0f) {
                    defpackage.m mVar4 = ((defpackage.m[]) iVar4.h.c)[iVar4.b[i7]];
                    if (mVar4.h == 1) {
                        if (f3 < 0.0f) {
                            mVar2 = mVar4;
                            break;
                        } else if (mVar3 == null) {
                            mVar3 = mVar4;
                        }
                    } else if (f3 < 0.0f && (mVar2 == null || mVar4.c < mVar2.c)) {
                        mVar2 = mVar4;
                    }
                }
                i7 = iVar4.c[i7];
                i8++;
            }
            if (mVar2 != null) {
                jVar.a(mVar2);
            }
            if (iVar4.a == 0) {
                jVar.e = true;
            }
            defpackage.m mVar5 = jVar.a;
            if (mVar5 == null) {
                return;
            }
            if (mVar5.h != 1 && jVar.b < 0.0f) {
                return;
            }
        }
        defpackage.j jVar3 = this.c[this.f];
        if (jVar3 != null) {
            ((aogy) this.g.b).q(jVar3);
        }
        if (!jVar.e) {
            jVar.b();
        }
        defpackage.j[] jVarArr3 = this.c;
        int i9 = this.f;
        jVarArr3[i9] = jVar;
        defpackage.m mVar6 = jVar.a;
        mVar6.b = i9;
        this.f = i9 + 1;
        int i10 = mVar6.g;
        if (i10 > 0) {
            while (true) {
                jVarArr = this.n;
                int length = jVarArr.length;
                if (length >= i10) {
                    break;
                } else {
                    this.n = new defpackage.j[length << 1];
                }
            }
            for (int i11 = 0; i11 < i10; i11++) {
                jVarArr[i11] = jVar.a.f[i11];
            }
            for (int i12 = 0; i12 < i10; i12++) {
                defpackage.j jVar4 = jVarArr[i12];
                if (jVar4 != jVar) {
                    jVar4.d.g(jVar4, jVar);
                    jVar4.b();
                }
            }
        }
    }

    public final void h(defpackage.m mVar, int i) {
        int i2 = mVar.b;
        if (i2 != -1) {
            defpackage.j jVar = this.c[i2];
            if (jVar.e) {
                jVar.b = i;
                return;
            }
            defpackage.j jVarA = a();
            jVarA.g(mVar, i);
            g(jVarA);
            return;
        }
        float f = i;
        defpackage.j jVarA2 = a();
        jVarA2.a = mVar;
        mVar.d = f;
        jVarA2.b = f;
        jVarA2.e = true;
        g(jVarA2);
    }

    public final void i(defpackage.m mVar, defpackage.m mVar2, int i, int i2) {
        defpackage.j jVarA = a();
        defpackage.m mVarF = f();
        mVarF.c = i2;
        jVarA.i(mVar, mVar2, mVarF, i);
        g(jVarA);
    }

    public final void j(defpackage.m mVar, defpackage.m mVar2, int i, int i2) {
        defpackage.j jVarA = a();
        defpackage.m mVarF = f();
        mVarF.c = i2;
        jVarA.j(mVar, mVar2, mVarF, i);
        g(jVarA);
    }

    public final void k(defpackage.j jVar, int i) {
        jVar.d.f(d(), i);
    }

    public final void l() {
        defpackage.hiv hivVar;
        int i = 0;
        while (true) {
            hivVar = this.g;
            defpackage.m[] mVarArr = (defpackage.m[]) hivVar.c;
            if (i >= mVarArr.length) {
                break;
            }
            defpackage.m mVar = mVarArr[i];
            if (mVar != null) {
                mVar.b();
            }
            i++;
        }
        java.lang.Object obj = hivVar.a;
        defpackage.m[] mVarArr2 = this.l;
        int i2 = this.m;
        int length = mVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.m mVar2 = mVarArr2[i3];
            aogy aogyVar = (aogy) obj;
            int i4 = aogyVar.a;
            if (i4 < 256) {
                ((java.lang.Object[]) aogyVar.b)[i4] = mVar2;
                aogyVar.a = i4 + 1;
            }
        }
        this.m = 0;
        java.util.Arrays.fill((java.lang.Object[]) hivVar.c, (java.lang.Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(defpackage.m mVar, defpackage.m mVar2, int i, float f, defpackage.m mVar3, defpackage.m mVar4, int i2) {
        defpackage.j jVarA = a();
        jVarA.d(mVar, mVar2, i, f, mVar3, mVar4, i2);
        defpackage.m mVarD = d();
        defpackage.m mVarD2 = d();
        mVarD.c = 4;
        mVarD2.c = 4;
        jVarA.c(mVarD, mVarD2);
        g(jVarA);
    }

    public final void n(defpackage.m mVar, defpackage.m mVar2, int i, int i2) {
        defpackage.j jVarA = a();
        jVarA.h(mVar, mVar2, i);
        defpackage.m mVarD = d();
        defpackage.m mVarD2 = d();
        mVarD.c = i2;
        mVarD2.c = i2;
        jVarA.c(mVarD, mVarD2);
        g(jVarA);
    }

    public final void o(defpackage.k kVar) {
        for (int i = 0; i < this.f; i++) {
            defpackage.j jVar = this.c[i];
            if (jVar.a.h != 1 && jVar.b < 0.0f) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        defpackage.j jVar2 = this.c[i5];
                        if (jVar2.a.h != 1 && jVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                defpackage.m mVar = ((defpackage.m[]) this.g.c)[i6];
                                float fA = jVar2.d.a(mVar);
                                if (fA > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = mVar.e[i7] / fA;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    defpackage.j jVar3 = this.c[i2];
                    jVar3.a.b = -1;
                    jVar3.a(((defpackage.m[]) this.g.c)[i3]);
                    jVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(jVar3);
                    }
                    kVar.a(this);
                }
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            defpackage.j jVar4 = this.c[i9];
            if (jVar4.a.h != 1 && jVar4.b < 0.0f) {
                return;
            }
        }
    }
}
