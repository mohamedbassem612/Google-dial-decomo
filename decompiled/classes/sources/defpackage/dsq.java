package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dsq {
    public static boolean a = false;
    public static long b;
    public final defpackage.ajxw j;
    private final defpackage.dsp r;
    private defpackage.dsp s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private defpackage.dst[] p = new defpackage.dst[1000];
    private int q = 0;
    defpackage.dsp[] e = new defpackage.dsp[32];

    public dsq() {
        t();
        defpackage.ajxw ajxwVar = new defpackage.ajxw((byte[]) null);
        this.j = ajxwVar;
        this.r = new defpackage.dss(ajxwVar);
        this.s = new defpackage.dsp(ajxwVar);
    }

    public static final int o(java.lang.Object obj) {
        defpackage.dst dstVar = ((defpackage.dsx) obj).h;
        if (dstVar != null) {
            return (int) (dstVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(defpackage.dsp dspVar) {
        int i;
        if (dspVar.d) {
            dspVar.a.d(this, dspVar.b);
        } else {
            defpackage.dsp[] dspVarArr = this.e;
            int i2 = this.i;
            dspVarArr[i2] = dspVar;
            defpackage.dst dstVar = dspVar.a;
            dstVar.d = i2;
            this.i = i2 + 1;
            dstVar.e(this, dspVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    java.lang.System.out.println("WTF");
                }
                defpackage.dsp dspVar2 = this.e[i3];
                if (dspVar2 != null && dspVar2.d) {
                    dspVar2.a.d(this, dspVar2.b);
                    ((defpackage.aaaj) this.j.a).i(dspVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        defpackage.dsp[] dspVarArr2 = this.e;
                        int i6 = i4 - 1;
                        defpackage.dsp dspVar3 = dspVarArr2[i4];
                        dspVarArr2[i6] = dspVar3;
                        defpackage.dst dstVar2 = dspVar3.a;
                        if (dstVar2.d == i4) {
                            dstVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            defpackage.dsp dspVar = this.e[i];
            dspVar.a.f = dspVar.b;
        }
    }

    private final void s() {
        int i = this.l << 1;
        this.l = i;
        this.e = (defpackage.dsp[]) java.util.Arrays.copyOf(this.e, i);
        defpackage.ajxw ajxwVar = this.j;
        ajxwVar.c = (defpackage.dst[]) java.util.Arrays.copyOf((java.lang.Object[]) ajxwVar.c, this.l);
        int i2 = this.l;
        this.n = new boolean[i2];
        this.m = i2;
        this.o = i2;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            defpackage.dsp dspVar = this.e[i];
            if (dspVar != null) {
                ((defpackage.aaaj) this.j.a).i(dspVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(defpackage.dsp dspVar) {
        defpackage.dso dsoVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            if (i3 >= (this.h << 1)) {
                return;
            }
            defpackage.dst dstVar = dspVar.a;
            if (dstVar != null) {
                this.n[dstVar.c] = true;
            }
            defpackage.dst dstVarK = dspVar.k(this.n);
            if (dstVarK != null) {
                boolean[] zArr = this.n;
                int i4 = dstVarK.c;
                if (zArr[i4]) {
                    return;
                }
                zArr[i4] = true;
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.i; i6++) {
                    defpackage.dsp dspVar2 = this.e[i6];
                    if (dspVar2.a.n != 1 && !dspVar2.d && (i = (dsoVar = dspVar2.e).e) != -1) {
                        for (int i7 = 0; i != -1 && i7 < dsoVar.a; i7++) {
                            if (dsoVar.b[i] == dstVarK.c) {
                                float fA = dspVar2.e.a(dstVarK);
                                if (fA >= 0.0f) {
                                    break;
                                }
                                float f2 = (-dspVar2.b) / fA;
                                if (f2 >= f) {
                                    break;
                                }
                                i5 = i6;
                                f = f2;
                                break;
                            }
                            i = dsoVar.c[i];
                        }
                    }
                }
                if (i5 >= 0) {
                    defpackage.dsp dspVar3 = this.e[i5];
                    dspVar3.a.d = -1;
                    dspVar3.b(dstVarK);
                    defpackage.dst dstVar2 = dspVar3.a;
                    dstVar2.d = i5;
                    dstVar2.e(this, dspVar3);
                }
                z = false;
            }
        }
    }

    private final defpackage.dst v(int i) {
        defpackage.dst dstVar = (defpackage.dst) ((defpackage.aaaj) this.j.b).h();
        if (dstVar == null) {
            dstVar = new defpackage.dst(i);
            dstVar.n = i;
        } else {
            dstVar.c();
            dstVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 << 1;
            this.k = i4;
            this.p = (defpackage.dst[]) java.util.Arrays.copyOf(this.p, i4);
        }
        defpackage.dst[] dstVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        dstVarArr[i5] = dstVar;
        return dstVar;
    }

    public final defpackage.dsp a() {
        defpackage.ajxw ajxwVar = this.j;
        defpackage.dsp dspVar = (defpackage.dsp) ((defpackage.aaaj) ajxwVar.a).h();
        if (dspVar == null) {
            dspVar = new defpackage.dsp(ajxwVar);
            b++;
        } else {
            dspVar.a = null;
            dspVar.e.f();
            dspVar.b = 0.0f;
            dspVar.d = false;
        }
        defpackage.dst.a++;
        return dspVar;
    }

    public final defpackage.dst b(java.lang.Object obj) {
        defpackage.dst dstVar;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        defpackage.dsx dsxVar = (defpackage.dsx) obj;
        defpackage.dst dstVar2 = dsxVar.h;
        if (dstVar2 == null) {
            dsxVar.i();
            dstVar = dsxVar.h;
        } else {
            dstVar = dstVar2;
        }
        int i = dstVar.c;
        if (i == -1) {
            int i2 = this.d + 1;
            this.d = i2;
            this.h++;
            dstVar.c = i2;
            dstVar.n = 1;
            ((defpackage.dst[]) this.j.c)[i2] = dstVar;
        } else if (i > this.d || ((defpackage.dst[]) this.j.c)[i] == null) {
            if (i != -1) {
                dstVar.c();
            }
            int i3 = this.d + 1;
            this.d = i3;
            this.h++;
            dstVar.c = i3;
            dstVar.n = 1;
            ((defpackage.dst[]) this.j.c)[i3] = dstVar;
        }
        return dstVar;
    }

    public final defpackage.dst c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        defpackage.dst dstVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        dstVarV.c = i;
        ((defpackage.dst[]) this.j.c)[i] = dstVarV;
        return dstVarV;
    }

    public final void d(defpackage.dst dstVar, defpackage.dst dstVar2, int i, float f, defpackage.dst dstVar3, defpackage.dst dstVar4, int i2, int i3) {
        defpackage.dsp dspVarA = a();
        if (dstVar2 == dstVar3) {
            dspVarA.e.g(dstVar, 1.0f);
            dspVarA.e.g(dstVar4, 1.0f);
            dspVarA.e.g(dstVar2, -2.0f);
        } else if (f == 0.5f) {
            dspVarA.e.g(dstVar, 1.0f);
            dspVarA.e.g(dstVar2, -1.0f);
            dspVarA.e.g(dstVar3, -1.0f);
            dspVarA.e.g(dstVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                dspVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            dspVarA.e.g(dstVar, -1.0f);
            dspVarA.e.g(dstVar2, 1.0f);
            dspVarA.b = i;
        } else if (f >= 1.0f) {
            dspVarA.e.g(dstVar4, -1.0f);
            dspVarA.e.g(dstVar3, 1.0f);
            dspVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            dspVarA.e.g(dstVar, f2);
            dspVarA.e.g(dstVar2, -f2);
            dspVarA.e.g(dstVar3, -f);
            dspVarA.e.g(dstVar4, f);
            if (i > 0 || i2 > 0) {
                dspVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            dspVarA.f(this, i3);
        }
        e(dspVarA);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    public final void e(defpackage.dsp dspVar) {
        boolean z;
        boolean z2;
        defpackage.dst dstVarA;
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            s();
        }
        if (!dspVar.d) {
            if (this.e.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int i = dspVar.e.a;
                    for (int i2 = 0; i2 < i; i2++) {
                        defpackage.dst dstVarD = dspVar.e.d(i2);
                        if (dstVarD.d != -1 || dstVarD.g) {
                            dspVar.c.add(dstVarD);
                        } else {
                            boolean z4 = dstVarD.m;
                        }
                    }
                    java.util.ArrayList arrayList = dspVar.c;
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            defpackage.dst dstVar = (defpackage.dst) arrayList.get(i3);
                            if (dstVar.g) {
                                dspVar.c(this, dstVar, true);
                            } else {
                                boolean z5 = dstVar.m;
                                dspVar.d(this, this.e[dstVar.d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (dspVar.a != null && dspVar.e.a == 0) {
                    dspVar.d = true;
                    this.c = true;
                }
            }
            if (dspVar.e()) {
                return;
            }
            float f = dspVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                dspVar.b = -f;
                defpackage.dso dsoVar = dspVar.e;
                int i4 = dsoVar.e;
                for (int i5 = 0; i4 != -1 && i5 < dsoVar.a; i5++) {
                    float[] fArr = dsoVar.d;
                    fArr[i4] = -fArr[i4];
                    i4 = dsoVar.c[i4];
                }
            }
            int i6 = dspVar.e.a;
            float f3 = 0.0f;
            float f4 = 0.0f;
            defpackage.dst dstVar2 = null;
            defpackage.dst dstVar3 = null;
            int i7 = 0;
            boolean z6 = false;
            boolean z7 = false;
            while (i7 < i6) {
                float fB = dspVar.e.b(i7);
                defpackage.dst dstVarD2 = dspVar.e.d(i7);
                float f5 = f2;
                if (dstVarD2.n == 1) {
                    if (dstVar2 == null) {
                        if (dstVarD2.l <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        dstVar2 = dstVarD2;
                        f3 = fB;
                    } else {
                        if (f3 > fB) {
                            if (dstVarD2.l > 1) {
                                z6 = false;
                            }
                            dstVar2 = dstVarD2;
                            f3 = fB;
                        } else if (z6 || dstVarD2.l > 1) {
                        }
                        z6 = true;
                        dstVar2 = dstVarD2;
                        f3 = fB;
                    }
                } else if (dstVar2 == null) {
                    if (fB >= f5) {
                        dstVar2 = null;
                    } else {
                        if (dstVar3 != null) {
                            if (f4 > fB) {
                                if (dstVarD2.l > 1) {
                                    z7 = false;
                                }
                            } else if (z7 || dstVarD2.l > 1) {
                                dstVar2 = null;
                            }
                            z7 = true;
                        } else if (dstVarD2.l <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        dstVar3 = dstVarD2;
                        dstVar2 = null;
                        f4 = fB;
                    }
                }
                i7++;
                f2 = f5;
            }
            float f6 = f2;
            if (dstVar2 == null) {
                dstVar2 = dstVar3;
            }
            if (dstVar2 == null) {
                z = true;
            } else {
                dspVar.b(dstVar2);
                z = false;
            }
            if (dspVar.e.a == 0) {
                dspVar.d = true;
            }
            if (z) {
                if (this.h + 1 >= this.m) {
                    s();
                }
                defpackage.dst dstVarV = v(3);
                int i8 = this.d + 1;
                this.d = i8;
                this.h++;
                dstVarV.c = i8;
                defpackage.ajxw ajxwVar = this.j;
                ((defpackage.dst[]) ajxwVar.c)[i8] = dstVarV;
                dspVar.a = dstVarV;
                int i9 = this.i;
                q(dspVar);
                if (this.i == i9 + 1) {
                    defpackage.dsp dspVar2 = this.s;
                    dspVar2.a = null;
                    dspVar2.e.f();
                    int i10 = 0;
                    while (true) {
                        defpackage.dso dsoVar2 = dspVar.e;
                        if (i10 >= dsoVar2.a) {
                            break;
                        }
                        dspVar2.e.e(dsoVar2.d(i10), dspVar.e.b(i10), true);
                        i10++;
                    }
                    u(this.s);
                    if (dstVarV.d == -1) {
                        if (dspVar.a == dstVarV && (dstVarA = dspVar.a(null, dstVarV)) != null) {
                            dspVar.b(dstVarA);
                        }
                        if (!dspVar.d) {
                            dspVar.a.e(this, dspVar);
                        }
                        ((defpackage.aaaj) ajxwVar.a).i(dspVar);
                        this.i--;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            defpackage.dst dstVar4 = dspVar.a;
            if (dstVar4 == null) {
                return;
            }
            if ((dstVar4.n != 1 && dspVar.b < f6) || z2) {
                return;
            }
        }
        q(dspVar);
    }

    public final void f(defpackage.dst dstVar, int i) {
        int i2 = dstVar.d;
        if (i2 == -1) {
            dstVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                defpackage.dst dstVar2 = ((defpackage.dst[]) this.j.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            defpackage.dsp dspVarA = a();
            dspVarA.a = dstVar;
            dstVar.f = f;
            dspVarA.b = f;
            dspVarA.d = true;
            e(dspVarA);
            return;
        }
        defpackage.dsp dspVar = this.e[i2];
        if (dspVar.d) {
            dspVar.b = i;
            return;
        }
        if (dspVar.e.a == 0) {
            dspVar.d = true;
            dspVar.b = i;
            return;
        }
        defpackage.dsp dspVarA2 = a();
        if (i < 0) {
            dspVarA2.b = -i;
            dspVarA2.e.g(dstVar, 1.0f);
        } else {
            dspVarA2.b = i;
            dspVarA2.e.g(dstVar, -1.0f);
        }
        e(dspVarA2);
    }

    public final void g(defpackage.dst dstVar, defpackage.dst dstVar2, int i, int i2) {
        defpackage.dsp dspVarA = a();
        defpackage.dst dstVarC = c();
        dstVarC.e = 0;
        dspVarA.h(dstVar, dstVar2, dstVarC, i);
        if (i2 != 8) {
            i(dspVarA, (int) (-dspVarA.e.a(dstVarC)), i2);
        }
        e(dspVarA);
    }

    public final void h(defpackage.dst dstVar, defpackage.dst dstVar2, int i, int i2) {
        defpackage.dsp dspVarA = a();
        defpackage.dst dstVarC = c();
        dstVarC.e = 0;
        dspVarA.i(dstVar, dstVar2, dstVarC, i);
        if (i2 != 8) {
            i(dspVarA, (int) (-dspVarA.e.a(dstVarC)), i2);
        }
        e(dspVarA);
    }

    final void i(defpackage.dsp dspVar, int i, int i2) {
        dspVar.e.g(p(i2), i);
    }

    public final void j() {
        defpackage.dsp dspVar = this.r;
        if (dspVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(dspVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(dspVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        defpackage.ajxw ajxwVar;
        int i = 0;
        while (true) {
            ajxwVar = this.j;
            defpackage.dst[] dstVarArr = (defpackage.dst[]) ajxwVar.c;
            if (i >= dstVarArr.length) {
                break;
            }
            defpackage.dst dstVar = dstVarArr[i];
            if (dstVar != null) {
                dstVar.c();
            }
            i++;
        }
        java.lang.Object obj = ajxwVar.b;
        defpackage.dst[] dstVarArr2 = this.p;
        int i2 = this.q;
        int length = dstVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.dst dstVar2 = dstVarArr2[i3];
            defpackage.aaaj aaajVar = (defpackage.aaaj) obj;
            int i4 = aaajVar.a;
            if (i4 < 256) {
                ((java.lang.Object[]) aaajVar.b)[i4] = dstVar2;
                aaajVar.a = i4 + 1;
            }
        }
        this.q = 0;
        java.util.Arrays.fill((java.lang.Object[]) ajxwVar.c, (java.lang.Object) null);
        this.d = 0;
        defpackage.dss dssVar = (defpackage.dss) this.r;
        dssVar.f = 0;
        dssVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            defpackage.dsp dspVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new defpackage.dsp(ajxwVar);
    }

    final void l(defpackage.dsp dspVar) {
        boolean z;
        for (int i = 0; i < this.i; i++) {
            defpackage.dsp dspVar2 = this.e[i];
            if (dspVar2.a.n != 1) {
                float f = 0.0f;
                if (dspVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            defpackage.dsp dspVar3 = this.e[i5];
                            if (dspVar3.a.n != 1 && !dspVar3.d && dspVar3.b < f) {
                                int i7 = dspVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    defpackage.dst dstVarD = dspVar3.e.d(i8);
                                    float fA = dspVar3.e.a(dstVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = dstVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = dstVarD.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            defpackage.dsp dspVar4 = this.e[i3];
                            dspVar4.a.d = -1;
                            dspVar4.b(((defpackage.dst[]) this.j.c)[i4]);
                            defpackage.dst dstVar = dspVar4.a;
                            dstVar.d = i3;
                            dstVar.e(this, dspVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        u(dspVar);
        r();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final void m(defpackage.dst dstVar, defpackage.dst dstVar2, int i, int i2) {
        boolean z;
        if (i2 == 8) {
            if (dstVar2.g && dstVar.d == -1) {
                dstVar.d(this, dstVar2.f + i);
                return;
            }
            i2 = 8;
        }
        defpackage.dsp dspVarA = a();
        if (i == 0) {
            dspVarA.e.g(dstVar, -1.0f);
            dspVarA.e.g(dstVar2, 1.0f);
        } else {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            dspVarA.b = i;
            if (z) {
                dspVarA.e.g(dstVar, 1.0f);
                dspVarA.e.g(dstVar2, -1.0f);
            } else {
                dspVarA.e.g(dstVar, -1.0f);
                dspVarA.e.g(dstVar2, 1.0f);
            }
        }
        if (i2 != 8) {
            dspVarA.f(this, i2);
        }
        e(dspVarA);
    }

    public final void n(defpackage.dst dstVar, defpackage.dst dstVar2, defpackage.dst dstVar3, defpackage.dst dstVar4, float f) {
        defpackage.dsp dspVarA = a();
        dspVarA.g(dstVar, dstVar2, dstVar3, dstVar4, f);
        e(dspVarA);
    }

    public final defpackage.dst p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        defpackage.dst dstVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        dstVarV.c = i2;
        dstVarV.e = i;
        ((defpackage.dst[]) this.j.c)[i2] = dstVarV;
        defpackage.dss dssVar = (defpackage.dss) this.r;
        defpackage.dsr dsrVar = dssVar.g;
        dsrVar.a = dstVarV;
        java.util.Arrays.fill(dsrVar.a.i, 0.0f);
        dstVarV.i[dstVarV.e] = 1.0f;
        dssVar.l(dstVarV);
        return dstVarV;
    }
}
