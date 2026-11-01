package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctu extends defpackage.ctt {
    public final defpackage.csv a;
    public java.lang.String b;
    public boolean c;
    public defpackage.aomy d;
    public final defpackage.ccp e;
    public final defpackage.ccp f;
    public float g;
    public float h;
    private defpackage.cst i;
    private long j;
    private int k;
    private boolean l;
    private defpackage.cqh m;
    private long n;
    private final defpackage.aonj o;
    private final defpackage.jxt p;

    public ctu(defpackage.csv csvVar, defpackage.jxt jxtVar) {
        this.a = csvVar;
        this.p = jxtVar;
        csvVar.e = new defpackage.clc(this, 7);
        this.b = "";
        this.c = true;
        this.j = 0L;
        this.k = 0;
        this.d = new bmt(7);
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, cduVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cpp(0L), cduVar);
        this.n = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.o = new defpackage.clc(this, 8);
    }

    @Override // defpackage.ctt
    public final void b(defpackage.csj csjVar) {
        g(csjVar, 1.0f, null);
    }

    public final long c() {
        return ((defpackage.cpp) this.f.a()).a;
    }

    public final defpackage.cqh d() {
        return (defpackage.cqh) this.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0218  */
    /* JADX WARN: Code duplicated, block: B:164:0x01b6 A[EDGE_INSN: B:164:0x01b6->B:80:0x01b6 BREAK  A[LOOP:0: B:63:0x0153->B:79:0x01b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b3 A[LOOP:0: B:63:0x0153->B:79:0x01b3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r5v22, types: [dpf, java.lang.Object] */
    public final void g(defpackage.csj csjVar, float f, defpackage.cqh cqhVar) {
        boolean z;
        long jCeil;
        long jCeil2;
        long j;
        long j2;
        boolean z2;
        defpackage.cpu cpuVar;
        boolean z3;
        defpackage.cqa cqaVar;
        defpackage.cqh cqhVarD;
        java.lang.Object cstVar;
        int i;
        char c;
        defpackage.csv csvVar = this.a;
        int i2 = (csvVar.a && csvVar.b != 16 && defpackage.cty.a(d()) && defpackage.cty.a(cqhVar)) ? 1 : 0;
        if (!this.l) {
            long j3 = this.n;
            if (j3 != 9205357640488583168L && j3 != csjVar.o()) {
                this.l = true;
                if (this.j != 0) {
                    this.i = null;
                }
            }
        }
        char c2 = ' ';
        int iRound = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
        int iRound2 = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)));
        defpackage.jxt jxtVar = this.p;
        if (jxtVar == null || this.l || iRound <= 0 || iRound2 <= 0) {
            z = false;
        } else if (java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - iRound) >= 0.01f) {
            z = false;
        } else if (java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) - iRound2) < 0.01f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jCeil = ((long) iRound) << 32;
            jCeil2 = iRound2;
        } else {
            jCeil = ((long) ((int) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))))) << 32;
            jCeil2 = (int) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)));
        }
        long j4 = jCeil | (jCeil2 & 4294967295L);
        defpackage.cst cstVar2 = this.i;
        if (z) {
            j = 4294967295L;
            if (cstVar2 != null && j4 == this.j && i2 == this.k) {
                c2 = ' ';
                j2 = j4;
                z2 = false;
            } else {
                j2 = j4;
                defpackage.ctv ctvVar = new defpackage.ctv(((defpackage.csx) jxtVar.a).l, java.lang.Float.floatToIntBits(jxtVar.c.a()), (int) (j4 >> 32), (int) (j4 & 4294967295L), i2);
                java.lang.Object obj = jxtVar.b;
                java.lang.Object obj2 = ((defpackage.vx) obj).b;
                synchronized (obj2) {
                    java.lang.Object obj3 = ((defpackage.vx) obj).a;
                    ddk ddkVar = (ddk) ((defpackage.adw) obj3).a(ctvVar);
                    cstVar = ddkVar != null ? ddkVar.get() : null;
                    if (cstVar != null) {
                        c2 = ' ';
                    } else {
                        if (((defpackage.adw) obj3).e >= 100) {
                            synchronized (obj2) {
                                long[] jArr = ((defpackage.adw) obj3).a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j5 = jArr[i3];
                                        int i4 = i3;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i4 != length) {
                                                break;
                                                break;
                                            }
                                            i3 = i4 + 1;
                                        } else {
                                            int i5 = (~(i4 - length)) >>> 31;
                                            long j6 = j5;
                                            int i6 = 0;
                                            while (true) {
                                                i = 8 - i5;
                                                if (i6 >= i) {
                                                    break;
                                                }
                                                if ((j6 & 255) < 128) {
                                                    int i7 = (i4 << 3) + i6;
                                                    c = '\b';
                                                    if (((ddk) ((defpackage.adw) obj3).c[i7]).get() == null) {
                                                        ((defpackage.adw) obj3).j(i7);
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    c = '\b';
                                                }
                                                j6 >>= c;
                                                i6++;
                                            }
                                            if (i != 8) {
                                                break;
                                            } else if (i4 != length) {
                                                break;
                                            } else {
                                                i3 = i4 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        cstVar = new defpackage.cst();
                        ((defpackage.adw) ((defpackage.vx) obj).a).n(ctvVar, new ddk(cstVar));
                    }
                }
                cstVar2 = (defpackage.cst) cstVar;
                z2 = cstVar2 != this.i;
                this.i = cstVar2;
                this.j = j2;
                this.k = i2;
            }
        } else {
            c2 = ' ';
            j = 4294967295L;
            j2 = j4;
            if (cstVar2 == null) {
                cstVar2 = new defpackage.cst();
                this.i = cstVar2;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z) {
            if (!this.c && this.n == csjVar.o() && !z2) {
                defpackage.cst cstVar3 = this.i;
                z3 = i2 != ((cstVar3 == null || (cpuVar = cstVar3.e) == null) ? 0 : cpuVar.a());
            }
        } else if (cstVar2.e == null) {
        }
        if (z3 || z2) {
            if (i2 == 1) {
                long jN = csvVar.b;
                if (defpackage.cqg.a(jN) != 1.0f) {
                    float fD = defpackage.cqg.d(jN);
                    float fC = defpackage.cqg.c(jN);
                    float fB = defpackage.cqg.b(jN);
                    float[] fArr = defpackage.crp.a;
                    jN = defpackage.cfd.N(fD, fC, fB, 1.0f, defpackage.crp.y[(int) (jN & 63)]);
                }
                cqaVar = new defpackage.cqa(jN, 5);
            } else {
                cqaVar = null;
            }
            this.m = cqaVar;
        }
        if (z3) {
            long j7 = j2 & j;
            int i8 = (int) (j2 >> c2);
            float fIntBitsToFloat = z ? i8 : java.lang.Float.intBitsToFloat((int) (csjVar.o() >> c2));
            int i9 = (int) j7;
            float fIntBitsToFloat2 = z ? i9 : java.lang.Float.intBitsToFloat((int) (csjVar.o() & j));
            this.g = fIntBitsToFloat / java.lang.Float.intBitsToFloat((int) (c() >> c2));
            this.h = fIntBitsToFloat2 / java.lang.Float.intBitsToFloat((int) (c() & j));
            defpackage.dpq dpqVarP = csjVar.p();
            defpackage.aonj aonjVar = this.o;
            defpackage.cpu cpuVar2 = cstVar2.e;
            defpackage.cqf cqfVarB = cstVar2.a;
            if (cpuVar2 == null || cqfVarB == null || i8 > cpuVar2.c() || i9 > cpuVar2.b() || cstVar2.c != i2) {
                float[] fArr2 = defpackage.crp.a;
                cpuVar2 = new defpackage.cpu(aa$.ExternalSyntheticApiModelOutline0.m((android.util.DisplayMetrics) null, i8, i9, defpackage.rz.g(i2), true, defpackage.cqp.c(defpackage.crp.e)));
                cqfVarB = defpackage.cpr.b(cpuVar2);
                cstVar2.e = cpuVar2;
                cstVar2.a = cqfVarB;
                cstVar2.c = i2;
            }
            cstVar2.b = j2;
            defpackage.csh cshVar = cstVar2.d;
            long jL = defpackage.dpy.l(j2);
            defpackage.csf csfVar = cshVar.a;
            defpackage.dpf dpfVar = csfVar.a;
            defpackage.dpq dpqVar = csfVar.b;
            defpackage.cqf cqfVar = csfVar.c;
            long j8 = csfVar.d;
            csfVar.a = csjVar;
            csfVar.b = dpqVarP;
            csfVar.c = cqfVarB;
            csfVar.d = jL;
            cqfVarB.g();
            defpackage.den.J(cshVar, -72057594037927936L, 0L, 0.0f, null, 62);
            aonjVar.a(cshVar);
            cqfVarB.e();
            csfVar.a = dpfVar;
            csfVar.b = dpqVar;
            csfVar.c = cqfVar;
            csfVar.d = j8;
            cpuVar2.d();
        }
        if (z3 || z2) {
            this.c = false;
            this.n = csjVar.o();
        }
        if (cqhVar != null) {
            cqhVarD = cqhVar;
        } else {
            cqhVarD = d() != null ? d() : this.m;
        }
        defpackage.cpu cpuVar3 = cstVar2.e;
        if (cpuVar3 == null) {
            defpackage.cwh.d("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        defpackage.den.L(csjVar, cpuVar3, cstVar2.b, 0L, f, cqhVarD, 0, 858);
    }

    public final java.lang.String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + java.lang.Float.intBitsToFloat((int) (c() >> 32)) + "\n\tviewportHeight: " + java.lang.Float.intBitsToFloat((int) (c() & 4294967295L)) + '\n';
    }
}
