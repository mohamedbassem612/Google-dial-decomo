package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class o {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public java.lang.Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    defpackage.o ab;
    defpackage.o ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final defpackage.n i;
    final defpackage.n j;
    final defpackage.n k;
    final defpackage.n l;
    final defpackage.n m;
    final defpackage.n n;
    final defpackage.n o;
    final defpackage.n p;
    public final java.util.ArrayList q;
    public defpackage.o r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public o() {
        defpackage.n nVar = new defpackage.n(this, 2);
        this.i = nVar;
        defpackage.n nVar2 = new defpackage.n(this, 3);
        this.j = nVar2;
        defpackage.n nVar3 = new defpackage.n(this, 4);
        this.k = nVar3;
        defpackage.n nVar4 = new defpackage.n(this, 5);
        this.l = nVar4;
        defpackage.n nVar5 = new defpackage.n(this, 6);
        this.m = nVar5;
        defpackage.n nVar6 = new defpackage.n(this, 8);
        this.n = nVar6;
        defpackage.n nVar7 = new defpackage.n(this, 9);
        this.o = nVar7;
        this.p = new defpackage.n(this, 7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(nVar);
        arrayList.add(nVar2);
        arrayList.add(nVar3);
        arrayList.add(nVar4);
        arrayList.add(nVar6);
        arrayList.add(nVar7);
        arrayList.add(nVar5);
    }

    private final void A(defpackage.l lVar, boolean z, boolean z2, defpackage.n nVar, defpackage.n nVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        defpackage.m mVarE = lVar.e(nVar);
        defpackage.m mVarE2 = lVar.e(nVar2);
        defpackage.m mVarE3 = lVar.e(nVar.b);
        defpackage.m mVarE4 = lVar.e(nVar2.b);
        int iA = nVar.a();
        int iA2 = nVar2.a();
        int i8 = this.K;
        boolean z5 = i8 != 8;
        int i9 = i8 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (mVarE3 == null) {
            if (mVarE4 == null) {
                defpackage.j jVarA = lVar.a();
                jVarA.g(mVarE, i);
                lVar.g(jVarA);
                if (z3) {
                    return;
                }
                if (z) {
                    lVar.g(defpackage.l.c(lVar, mVarE2, mVarE, i4, true));
                    return;
                } else {
                    if (z6) {
                        lVar.g(defpackage.l.c(lVar, mVarE2, mVarE, i9, false));
                        return;
                    }
                    defpackage.j jVarA2 = lVar.a();
                    jVarA2.g(mVarE2, i2);
                    lVar.g(jVarA2);
                    return;
                }
            }
            defpackage.j jVarA3 = lVar.a();
            jVarA3.h(mVarE2, mVarE4, -iA2);
            lVar.g(jVarA3);
            if (z) {
                lVar.g(defpackage.l.c(lVar, mVarE2, mVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                defpackage.j jVarA4 = lVar.a();
                jVarA4.h(mVarE2, mVarE, i9);
                lVar.g(jVarA4);
                return;
            } else {
                defpackage.j jVarA5 = lVar.a();
                jVarA5.g(mVarE, i);
                lVar.g(jVarA5);
                return;
            }
        }
        if (mVarE4 == null) {
            defpackage.j jVarA6 = lVar.a();
            jVarA6.h(mVarE, mVarE3, iA);
            lVar.g(jVarA6);
            if (z) {
                lVar.g(defpackage.l.c(lVar, mVarE2, mVarE, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                defpackage.j jVarA7 = lVar.a();
                jVarA7.h(mVarE2, mVarE, i9);
                lVar.g(jVarA7);
                return;
            } else {
                defpackage.j jVarA8 = lVar.a();
                jVarA8.g(mVarE2, i2);
                lVar.g(jVarA8);
                return;
            }
        }
        if (!z6) {
            int i10 = i6;
            if (z3) {
                lVar.i(mVarE, mVarE3, iA, 3);
                lVar.j(mVarE2, mVarE4, -iA2, 3);
                lVar.g(defpackage.l.b(lVar, mVarE, mVarE3, iA, f, mVarE4, mVarE2, iA2, true));
                return;
            }
            if (z4) {
                return;
            }
            int i11 = -iA2;
            if (i5 == 1) {
                if (i10 <= i9) {
                    i10 = i9;
                }
                if (i7 > 0) {
                    if (i7 < i10) {
                        i10 = i7;
                    } else {
                        lVar.j(mVarE2, mVarE, i7, 3);
                    }
                }
                lVar.n(mVarE2, mVarE, i10, 3);
                lVar.i(mVarE, mVarE3, iA, 2);
                lVar.j(mVarE2, mVarE4, i11, 2);
                lVar.m(mVarE, mVarE3, iA, f, mVarE4, mVarE2, iA2);
                return;
            }
            if (i10 != 0 || i7 != 0) {
                if (i7 > 0) {
                    lVar.j(mVarE2, mVarE, i7, 3);
                }
                lVar.i(mVarE, mVarE3, iA, 2);
                lVar.j(mVarE2, mVarE4, i11, 2);
                lVar.m(mVarE, mVarE3, iA, f, mVarE4, mVarE2, iA2);
                return;
            }
            defpackage.j jVarA9 = lVar.a();
            jVarA9.h(mVarE, mVarE3, iA);
            lVar.g(jVarA9);
            defpackage.j jVarA10 = lVar.a();
            jVarA10.h(mVarE2, mVarE4, i11);
            lVar.g(jVarA10);
            return;
        }
        if (z) {
            lVar.g(defpackage.l.c(lVar, mVarE2, mVarE, i4, true));
        } else {
            defpackage.j jVarA11 = lVar.a();
            jVarA11.h(mVarE2, mVarE, i9);
            lVar.g(jVarA11);
        }
        int i12 = nVar.h;
        if (i12 != nVar2.h) {
            int i13 = -iA2;
            if (i12 == 2) {
                defpackage.j jVarA12 = lVar.a();
                jVarA12.h(mVarE, mVarE3, iA);
                lVar.g(jVarA12);
                defpackage.m mVarF = lVar.f();
                defpackage.j jVarA13 = lVar.a();
                jVarA13.j(mVarE2, mVarE4, mVarF, i13);
                lVar.g(jVarA13);
                return;
            }
            defpackage.m mVarF2 = lVar.f();
            defpackage.j jVarA14 = lVar.a();
            jVarA14.i(mVarE, mVarE3, mVarF2, iA);
            lVar.g(jVarA14);
            defpackage.j jVarA15 = lVar.a();
            jVarA15.h(mVarE2, mVarE4, i13);
            lVar.g(jVarA15);
            return;
        }
        if (mVarE3 == mVarE4) {
            lVar.g(defpackage.l.b(lVar, mVarE, mVarE3, 0, 0.5f, mVarE4, mVarE2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i14 = -iA2;
        int i15 = nVar.i;
        defpackage.m mVarF3 = lVar.f();
        defpackage.j jVarA16 = lVar.a();
        jVarA16.i(mVarE, mVarE3, mVarF3, iA);
        if (i15 != 2) {
            lVar.k(jVarA16, (int) (-jVarA16.d.a(mVarF3)));
        }
        lVar.g(jVarA16);
        int i16 = nVar2.i;
        defpackage.m mVarF4 = lVar.f();
        defpackage.j jVarA17 = lVar.a();
        jVarA17.j(mVarE2, mVarE4, mVarF4, i14);
        if (i16 != 2) {
            lVar.k(jVarA17, (int) (-jVarA17.d.a(mVarF4)));
        }
        lVar.g(jVarA17);
        lVar.g(defpackage.l.b(lVar, mVarE, mVarE3, iA, f, mVarE4, mVarE2, iA2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int iMax;
        int i = this.t;
        if (this.ae != 3) {
            return i;
        }
        int i2 = this.d;
        int i3 = this.g;
        if (i2 == 1) {
            iMax = java.lang.Math.max(i3, i);
        } else if (i3 > 0) {
            this.t = i3;
            iMax = i3;
        } else {
            iMax = 0;
        }
        int i4 = this.h;
        return (i4 <= 0 || i4 >= iMax) ? iMax : i4;
    }

    public final int f() {
        int iMax;
        int i = this.s;
        if (this.ad != 3) {
            return i;
        }
        int i2 = this.c;
        int i3 = this.e;
        if (i2 == 1) {
            iMax = java.lang.Math.max(i3, i);
        } else if (i3 > 0) {
            this.s = i3;
            iMax = i3;
        } else {
            iMax = 0;
        }
        int i4 = this.f;
        return (i4 <= 0 || i4 >= iMax) ? iMax : i4;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void k(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void l(int i) {
        if (i < 0) {
            i = 0;
        }
        this.E = i;
    }

    public final void m(int i) {
        if (i < 0) {
            i = 0;
        }
        this.D = i;
    }

    public void n(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void o(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void p(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void q() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s + i;
        int i4 = this.t + i2;
        this.af = i;
        this.ag = i2;
        this.y = i3 - i;
        this.z = i4 - i2;
    }

    public final boolean r() {
        return this.C > 0;
    }

    public final boolean s() {
        return this.r == null;
    }

    public defpackage.n t(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final java.lang.String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ')';
    }

    public final void u(int i, defpackage.o oVar, int i2, int i3, int i4) {
        t(i).d(oVar.t(i2), i3, i4, 2, 0, true);
    }

    public final void v(int i) {
        this.ad = i;
        if (i == 2) {
            p(this.F);
        }
    }

    public final void w(int i) {
        this.ae = i;
        if (i == 2) {
            j(this.G);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:141:0x0204  */
    /* JADX WARN: Code duplicated, block: B:151:0x0263  */
    /* JADX WARN: Code duplicated, block: B:152:0x029c  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:182:0x031e  */
    /* JADX WARN: Code duplicated, block: B:185:0x033f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0376  */
    /* JADX WARN: Code duplicated, block: B:189:0x0386  */
    /* JADX WARN: Code duplicated, block: B:198:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:203:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:204:0x0408  */
    /* JADX WARN: Code duplicated, block: B:206:0x040f  */
    /* JADX WARN: Code duplicated, block: B:207:0x041c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0423  */
    /* JADX WARN: Code duplicated, block: B:212:0x042a  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r0v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
    	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:280)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1685)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:637)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5, types: [o] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [o] */
    /* JADX WARN: Type inference failed for: r43v0, types: [o] */
    public void x(defpackage.l lVar) {
        boolean z;
        boolean z2;
        int i;
        defpackage.n nVar;
        int i2;
        float f;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        defpackage.m mVar;
        defpackage.m mVar2;
        defpackage.n nVar2;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        int i6;
        int i7;
        boolean z9;
        defpackage.m mVar3;
        defpackage.l lVar2;
        ?? r0;
        defpackage.j jVarA;
        int i8;
        defpackage.m mVar4;
        defpackage.m mVar5;
        int i9;
        int i10;
        defpackage.m mVar6;
        defpackage.n nVar3;
        defpackage.n nVar4;
        int i11;
        boolean z10;
        defpackage.n nVar5;
        defpackage.m mVarE;
        defpackage.m mVarE2;
        defpackage.m mVarE3;
        defpackage.m mVarE4;
        defpackage.n nVar6;
        boolean z11;
        defpackage.n nVar7;
        boolean z12;
        defpackage.o oVar;
        defpackage.o oVar2;
        defpackage.o oVar3;
        defpackage.o oVar4;
        defpackage.o oVar5;
        defpackage.o oVar6;
        defpackage.l lVar3 = lVar;
        defpackage.n nVar8 = this.j;
        defpackage.n nVar9 = this.i;
        defpackage.n nVar10 = this.l;
        defpackage.n nVar11 = this.k;
        defpackage.m mVarE5 = lVar3.e(nVar9);
        defpackage.m mVarE6 = lVar3.e(nVar11);
        defpackage.m mVarE7 = lVar3.e(nVar8);
        defpackage.m mVarE8 = lVar3.e(nVar10);
        defpackage.n nVar12 = this.m;
        defpackage.m mVarE9 = lVar3.e(nVar12);
        defpackage.o oVar7 = this.r;
        if (oVar7 != null) {
            defpackage.n nVar13 = nVar9.b;
            if ((nVar13 == null || nVar13.b != nVar9) && ((nVar6 = nVar11.b) == null || nVar6.b != nVar11)) {
                z11 = false;
            } else {
                ((defpackage.p) oVar7).A(this, 0);
                z11 = true;
            }
            defpackage.n nVar14 = nVar8.b;
            if ((nVar14 == null || nVar14.b != nVar8) && ((nVar7 = nVar10.b) == null || nVar7.b != nVar10)) {
                z12 = false;
            } else {
                ((defpackage.p) this.r).A(this, 1);
                z12 = true;
            }
            defpackage.o oVar8 = this.r;
            if (oVar8.ad != 2 || z11) {
                z11 = z11;
            } else {
                defpackage.n nVar15 = nVar9.b;
                if (nVar15 == null || (oVar6 = nVar15.a) != oVar8) {
                    defpackage.m mVarE10 = lVar3.e(oVar8.i);
                    defpackage.j jVarA2 = lVar3.a();
                    jVarA2.i(mVarE5, mVarE10, lVar3.f(), 0);
                    lVar3.g(jVarA2);
                } else if (oVar6 == oVar8) {
                    nVar9.i = 2;
                }
                defpackage.n nVar16 = nVar11.b;
                if (nVar16 == null || (oVar5 = nVar16.a) != (oVar4 = this.r)) {
                    defpackage.m mVarE11 = lVar3.e(this.r.k);
                    defpackage.j jVarA3 = lVar3.a();
                    jVarA3.i(mVarE11, mVarE6, lVar3.f(), 0);
                    lVar3.g(jVarA3);
                } else if (oVar5 == oVar4) {
                    nVar11.i = 2;
                }
            }
            defpackage.o oVar9 = this.r;
            if (oVar9.ae == 2 && !z12) {
                defpackage.n nVar17 = nVar8.b;
                if (nVar17 == null || (oVar3 = nVar17.a) != oVar9) {
                    defpackage.m mVarE12 = lVar3.e(oVar9.j);
                    defpackage.j jVarA4 = lVar3.a();
                    jVarA4.i(mVarE7, mVarE12, lVar3.f(), 0);
                    lVar3.g(jVarA4);
                } else if (oVar3 == oVar9) {
                    nVar8.i = 2;
                }
                defpackage.n nVar18 = nVar10.b;
                if (nVar18 == null || (oVar2 = nVar18.a) != (oVar = this.r)) {
                    defpackage.m mVarE13 = lVar3.e(this.r.l);
                    defpackage.j jVarA5 = lVar3.a();
                    jVarA5.i(mVarE13, mVarE8, lVar3.f(), 0);
                    lVar3.g(jVarA5);
                } else if (oVar2 == oVar) {
                    nVar10.i = 2;
                }
            }
            z2 = z12;
            z = z11;
        } else {
            z = false;
            z2 = false;
        }
        int i12 = this.s;
        int i13 = this.D;
        int i14 = i12 < i13 ? i13 : i12;
        int i15 = this.t;
        boolean z13 = z;
        int i16 = this.E;
        int i17 = i15 >= i16 ? i15 : i16;
        int i18 = this.ad;
        boolean z14 = i18 != 3;
        int i19 = this.ae;
        boolean z15 = i19 != 3;
        if (!z14 && nVar9 != null && nVar11 != null && (nVar9.b == null || nVar11.b == null)) {
            z14 = true;
        }
        if (z15 || nVar8 == null || nVar10 == null) {
            i = i14;
        } else {
            defpackage.n nVar19 = nVar8.b;
            i = i14;
            if ((nVar19 == null || nVar10.b == null) && (this.C == 0 || (nVar12 != null && (nVar19 == null || nVar12.b == null)))) {
                z15 = true;
            }
        }
        int i20 = this.v;
        float f2 = this.u;
        if (f2 > 0.0f) {
            nVar = nVar10;
            if (this.K != 8) {
                int i21 = 3;
                if (i18 != 3) {
                    if (i18 == i21) {
                        i = (int) (i15 * f2);
                        f = f2;
                        i17 = i17;
                        i3 = 2;
                        i2 = 0;
                        z3 = false;
                        z14 = true;
                    } else if (i19 == i21) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        i17 = (int) (i12 * f2);
                        f = f2;
                        i = i;
                        i3 = 2;
                        i2 = 1;
                        z3 = false;
                        z15 = true;
                    }
                } else if (i19 == 3) {
                    if (z14) {
                        if (z15) {
                            i2 = i20;
                            f = f2;
                            i3 = 2;
                            i18 = 3;
                        } else {
                            f = f2;
                            i3 = 2;
                            i18 = 3;
                            i2 = 0;
                        }
                    } else if (z15) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        f = f2;
                        i3 = 2;
                        i18 = 3;
                        i2 = 1;
                    } else {
                        i2 = i20;
                        f = f2;
                        i3 = 2;
                        i18 = 3;
                    }
                    z3 = true;
                } else {
                    i18 = 3;
                    i21 = 3;
                    if (i18 == i21) {
                        i = (int) (i15 * f2);
                        f = f2;
                        i17 = i17;
                        i3 = 2;
                        i2 = 0;
                        z3 = false;
                        z14 = true;
                    } else if (i19 == i21) {
                        if (i20 == -1) {
                            f2 = 1.0f / f2;
                        }
                        i17 = (int) (i12 * f2);
                        f = f2;
                        i = i;
                        i3 = 2;
                        i2 = 1;
                        z3 = false;
                        z15 = true;
                    }
                }
            }
            if (z3 || !(i2 == 0 || i2 == -1)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i18 == i3 || !(this instanceof defpackage.p)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (this.a != i3) {
                i4 = i17;
                mVar = mVarE7;
                mVar2 = mVarE8;
                nVar2 = nVar12;
                mVarE9 = mVarE9;
                z6 = false;
            } else if (z4 || nVar9.b == null || nVar11.b == null) {
                mVarE9 = mVarE9;
                z6 = false;
                int i22 = this.w;
                i4 = i17;
                mVar = mVarE7;
                mVar2 = mVarE8;
                nVar2 = nVar12;
                lVar3 = lVar;
                A(lVar3, z5, z14, nVar9, nVar11, i22, i22 + i, i, i13, this.H, z4, z13, this.c, this.e, this.f);
            } else {
                defpackage.m mVarE14 = lVar3.e(nVar9);
                defpackage.m mVarE15 = lVar3.e(nVar11);
                defpackage.m mVarE16 = lVar3.e(nVar9.b);
                defpackage.m mVarE17 = lVar3.e(nVar11.b);
                lVar3.i(mVarE14, mVarE16, nVar9.a(), 3);
                lVar3.j(mVarE15, mVarE17, -nVar11.a(), 3);
                if (z13) {
                    z6 = false;
                } else {
                    z6 = false;
                    lVar3.m(mVarE14, mVarE16, nVar9.a(), this.H, mVarE17, mVarE15, nVar11.a());
                }
                lVar3 = lVar;
                i4 = i17;
                mVar = mVarE7;
                mVar2 = mVarE8;
                nVar2 = nVar12;
            }
            if (this.b != 2) {
                if (this.ae == 2 || !(this instanceof defpackage.p)) {
                    z7 = z6;
                } else {
                    z7 = true;
                }
                i5 = i2;
                if (z3 || !(i5 == 1 || i5 == -1)) {
                    z8 = z6;
                } else {
                    z8 = true;
                }
                i6 = this.C;
                if (i6 > 0) {
                    mVar6 = mVar;
                    lVar3.n(mVarE9, mVar6, i6, 5);
                    nVar3 = nVar2;
                    if (nVar3.b != null) {
                        i11 = this.C;
                        nVar4 = nVar3;
                    } else {
                        nVar4 = nVar;
                        i11 = i4;
                    }
                    if (z8) {
                        if (nVar8.b != null) {
                            nVar5 = nVar;
                            if (nVar5.b != null) {
                                mVarE = lVar3.e(nVar8);
                                mVarE2 = lVar3.e(nVar5);
                                mVarE3 = lVar3.e(nVar8.b);
                                mVarE4 = lVar3.e(nVar5.b);
                                lVar3.i(mVarE, mVarE3, nVar8.a(), 3);
                                lVar3.j(mVarE2, mVarE4, -nVar5.a(), 3);
                                if (!z2) {
                                    lVar.m(mVarE, mVarE3, nVar8.a(), this.I, mVarE4, mVarE2, nVar5.a());
                                }
                                lVar2 = lVar;
                                r0 = this;
                                i7 = i5;
                                mVar3 = mVar6;
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = z6;
                    }
                    int i23 = this.x;
                    lVar2 = lVar;
                    i7 = i5;
                    A(lVar2, z7, z15, nVar8, nVar4, i23, i23 + i11, i11, this.E, this.I, z10, z2, this.d, this.g, this.h);
                    lVar2.n(mVar2, mVar6, i4, 5);
                    r0 = this;
                    mVar3 = mVar6;
                } else {
                    i7 = i5;
                    boolean z16 = z2;
                    boolean z17 = z15;
                    defpackage.n nVar20 = nVar;
                    defpackage.m mVar7 = mVar;
                    defpackage.m mVar8 = mVar2;
                    if (!z8) {
                        z9 = z6;
                    } else if (r30.b != null || nVar20.b == null) {
                        z9 = true;
                    } else {
                        defpackage.m mVarE18 = lVar3.e(r30);
                        defpackage.m mVarE19 = lVar3.e(nVar20);
                        defpackage.m mVarE20 = lVar3.e(r30.b);
                        defpackage.m mVarE21 = lVar3.e(nVar20.b);
                        lVar3.i(mVarE18, mVarE20, r30.a(), 3);
                        lVar3.j(mVarE19, mVarE21, -nVar20.a(), 3);
                        if (!z16) {
                            lVar.m(mVarE18, mVarE20, r30.a(), this.I, mVarE21, mVarE19, nVar20.a());
                        }
                        lVar2 = lVar;
                        r0 = this;
                        mVar3 = mVar7;
                        mVar2 = mVar8;
                    }
                    int i24 = this.x;
                    int i25 = this.E;
                    float f3 = this.I;
                    int i26 = this.d;
                    mVar2 = mVar8;
                    int i27 = this.g;
                    mVar3 = mVar7;
                    int i28 = this.h;
                    lVar2 = lVar;
                    ?? r1 = this;
                    r1.A(lVar2, z7, z17, r30, nVar20, i24, i24 + i4, i4, i25, f3, z9, z16, i26, i27, i28);
                    r0 = r1;
                }
                if (z3) {
                    jVarA = lVar2.a();
                    i8 = i7;
                    if (i8 == 0) {
                        jVarA.e(mVarE6, mVarE5, mVar2, mVar3, f);
                        lVar2.g(jVarA);
                        return;
                    }
                    mVar4 = mVar3;
                    mVar5 = mVar2;
                    if (i8 == 1) {
                        jVarA.e(mVar5, mVar4, mVarE6, mVarE5, f);
                        lVar2.g(jVarA);
                        return;
                    }
                    i9 = r0.e;
                    if (i9 > 0) {
                        lVar2.i(mVarE6, mVarE5, i9, 3);
                    }
                    i10 = r0.g;
                    if (i10 > 0) {
                        lVar2.i(mVar5, mVar4, i10, 3);
                    }
                    jVarA.e(mVarE6, mVarE5, mVar5, mVar4, f);
                    defpackage.m mVarD = lVar2.d();
                    defpackage.m mVarD2 = lVar2.d();
                    mVarD.c = 4;
                    mVarD2.c = 4;
                    jVarA.c(mVarD, mVarD2);
                    lVar2.g(jVarA);
                }
            }
        }
        nVar = nVar10;
        i2 = i20;
        f = f2;
        i17 = i17;
        i = i;
        i3 = 2;
        z3 = false;
        if (z3) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (i18 == i3) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (this.a != i3) {
            i4 = i17;
            mVar = mVarE7;
            mVar2 = mVarE8;
            nVar2 = nVar12;
            mVarE9 = mVarE9;
            z6 = false;
        } else if (z4) {
            mVarE9 = mVarE9;
            z6 = false;
            int i29 = this.w;
            i4 = i17;
            mVar = mVarE7;
            mVar2 = mVarE8;
            nVar2 = nVar12;
            lVar3 = lVar;
            A(lVar3, z5, z14, nVar9, nVar11, i29, i29 + i, i, i13, this.H, z4, z13, this.c, this.e, this.f);
        } else {
            mVarE9 = mVarE9;
            z6 = false;
            int i210 = this.w;
            i4 = i17;
            mVar = mVarE7;
            mVar2 = mVarE8;
            nVar2 = nVar12;
            lVar3 = lVar;
            A(lVar3, z5, z14, nVar9, nVar11, i210, i210 + i, i, i13, this.H, z4, z13, this.c, this.e, this.f);
        }
        if (this.b != 2) {
            if (this.ae == 2) {
                z7 = z6;
            } else {
                z7 = z6;
            }
            i5 = i2;
            if (z3) {
                z8 = z6;
            } else {
                z8 = z6;
            }
            i6 = this.C;
            if (i6 > 0) {
                mVar6 = mVar;
                lVar3.n(mVarE9, mVar6, i6, 5);
                nVar3 = nVar2;
                if (nVar3.b != null) {
                    i11 = this.C;
                    nVar4 = nVar3;
                } else {
                    nVar4 = nVar;
                    i11 = i4;
                }
                if (z8) {
                    if (nVar8.b != null) {
                        nVar5 = nVar;
                        if (nVar5.b != null) {
                            mVarE = lVar3.e(nVar8);
                            mVarE2 = lVar3.e(nVar5);
                            mVarE3 = lVar3.e(nVar8.b);
                            mVarE4 = lVar3.e(nVar5.b);
                            lVar3.i(mVarE, mVarE3, nVar8.a(), 3);
                            lVar3.j(mVarE2, mVarE4, -nVar5.a(), 3);
                            if (!z2) {
                                lVar.m(mVarE, mVarE3, nVar8.a(), this.I, mVarE4, mVarE2, nVar5.a());
                            }
                            lVar2 = lVar;
                            r0 = this;
                            i7 = i5;
                            mVar3 = mVar6;
                        }
                    }
                    z10 = true;
                } else {
                    z10 = z6;
                }
                int i211 = this.x;
                lVar2 = lVar;
                i7 = i5;
                A(lVar2, z7, z15, nVar8, nVar4, i211, i211 + i11, i11, this.E, this.I, z10, z2, this.d, this.g, this.h);
                lVar2.n(mVar2, mVar6, i4, 5);
                r0 = this;
                mVar3 = mVar6;
            } else {
                i7 = i5;
                boolean z18 = z2;
                boolean z19 = z15;
                defpackage.n nVar21 = nVar;
                defpackage.m mVar9 = mVar;
                defpackage.m mVar10 = mVar2;
                if (!z8) {
                    if (r30.b != null) {
                    }
                    z9 = true;
                } else {
                    z9 = z6;
                }
                int i212 = this.x;
                int i213 = this.E;
                float f4 = this.I;
                int i214 = this.d;
                mVar2 = mVar10;
                int i215 = this.g;
                mVar3 = mVar9;
                int i216 = this.h;
                lVar2 = lVar;
                ?? r2 = this;
                r2.A(lVar2, z7, z19, r30, nVar21, i212, i212 + i4, i4, i213, f4, z9, z18, i214, i215, i216);
                r0 = r2;
            }
            if (z3) {
                jVarA = lVar2.a();
                i8 = i7;
                if (i8 == 0) {
                    jVarA.e(mVarE6, mVarE5, mVar2, mVar3, f);
                    lVar2.g(jVarA);
                    return;
                }
                mVar4 = mVar3;
                mVar5 = mVar2;
                if (i8 == 1) {
                    jVarA.e(mVar5, mVar4, mVarE6, mVarE5, f);
                    lVar2.g(jVarA);
                    return;
                }
                i9 = r0.e;
                if (i9 > 0) {
                    lVar2.i(mVarE6, mVarE5, i9, 3);
                }
                i10 = r0.g;
                if (i10 > 0) {
                    lVar2.i(mVar5, mVar4, i10, 3);
                }
                jVarA.e(mVarE6, mVarE5, mVar5, mVar4, f);
                defpackage.m mVarD3 = lVar2.d();
                defpackage.m mVarD4 = lVar2.d();
                mVarD3.c = 4;
                mVarD4.c = 4;
                jVarA.c(mVarD3, mVarD4);
                lVar2.g(jVarA);
            }
        }
    }

    public void y() {
        int i;
        int i2;
        int iP = defpackage.l.p(this.i);
        int iP2 = defpackage.l.p(this.j);
        int iP3 = defpackage.l.p(this.k) - iP;
        int iP4 = defpackage.l.p(this.l) - iP2;
        this.w = iP;
        this.x = iP2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && iP3 < (i2 = this.s)) {
            iP3 = i2;
        }
        if (this.ae == 1 && iP4 < (i = this.t)) {
            iP4 = i;
        }
        this.s = iP3;
        this.t = iP4;
        int i3 = this.E;
        if (iP4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (iP3 < i4) {
            this.s = i4;
        }
    }

    public void z(defpackage.hiv hivVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}
