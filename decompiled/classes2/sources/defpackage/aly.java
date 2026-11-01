package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aly implements defpackage.als {
    public final int a;
    private final acm b;
    private final aco c;
    private final ajh d;
    private final int e;
    private int[] f = defpackage.alr.a;
    private float[] g;
    private aiw h;
    private aiw i;
    private aiw j;
    private aiw k;
    private float[] l;
    private float[] m;
    private defpackage.ni n;

    public aly(acm acmVar, aco acoVar, int i, ajh ajhVar, int i2) {
        this.b = acmVar;
        this.c = acoVar;
        this.a = i;
        this.d = ajhVar;
        this.e = i2;
        float[] fArr = defpackage.alr.b;
        this.g = fArr;
        this.l = fArr;
        this.m = fArr;
        this.n = defpackage.alr.c;
    }

    private final float h(int i) {
        return i(j(i), i, false);
    }

    private final float i(int i, int i2, boolean z) {
        ajh ajhVar;
        float f;
        acm acmVar = this.b;
        if (i >= acmVar.b - 1) {
            f = i2;
        } else {
            int iA = acmVar.a(i);
            int iA2 = acmVar.a(i + 1);
            if (i2 == iA) {
                f = iA;
            } else {
                int i3 = iA2 - iA;
                defpackage.alx alxVar = (defpackage.alx) this.c.a(iA);
                if (alxVar == null || (ajhVar = alxVar.b) == null) {
                    ajhVar = this.d;
                }
                float f2 = i3;
                float fA = ajhVar.a((i2 - iA) / f2);
                if (z) {
                    return fA;
                }
                f = (f2 * fA) + iA;
            }
        }
        return f / 1000.0f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    private final int j(int i) {
        int i2;
        acm acmVar = this.b;
        int i3 = acmVar.b;
        if (i3 < 0) {
            throw new java.lang.IndexOutOfBoundsException(a.bf(i3, i3, "fromIndex (0) and toIndex (", ") must be in range 0.."));
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = acmVar.a[i2];
            if (i6 < i) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i) {
                    if (i2 < -1) {
                        return -(i2 + 2);
                    }
                    return i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = -(i5 + 1);
        if (i2 < -1) {
            return -(i2 + 2);
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[LOOP:5: B:46:0x00cc->B:47:0x00ce, LOOP_END] */
    private final void k(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aiw aiwVar4;
        float[] fArr;
        int i;
        float[] fArr2;
        defpackage.ni niVar = this.n;
        defpackage.ni niVar2 = defpackage.alr.c;
        aiw aiwVar5 = this.h;
        boolean z = niVar != niVar2;
        if (aiwVar5 == null) {
            this.h = aiwVar.c();
            this.i = aiwVar3.c();
            acm acmVar = this.b;
            int i2 = acmVar.b;
            float[] fArr3 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr3[i3] = acmVar.a(i3) / 1000.0f;
            }
            this.g = fArr3;
            int i4 = acmVar.b;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = ((defpackage.alx) this.c.a(acmVar.a(i5))) != null ? 0 : this.e;
                z |= !(i6 == 0);
                iArr[i5] = i6;
            }
            this.f = iArr;
        }
        if (z) {
            if (this.n != niVar2 && aooh.n(this.j, aiwVar) && aooh.n(this.k, aiwVar2)) {
                return;
            }
            this.j = aiwVar;
            this.k = aiwVar2;
            int iB = (aiwVar.b() & 1) + aiwVar.b();
            this.l = new float[iB];
            this.m = new float[iB];
            acm acmVar2 = this.b;
            int i7 = acmVar2.b;
            float[][] fArr4 = new float[i7][];
            for (int i8 = 0; i8 < i7; i8++) {
                int iA = acmVar2.a(i8);
                defpackage.alx alxVar = (defpackage.alx) this.c.a(iA);
                if (iA != 0) {
                    if (iA == this.a || alxVar != null) {
                        if (alxVar == null) {
                            aooh.g();
                        }
                        aiwVar4 = alxVar.a;
                        fArr = new float[iB];
                        for (i = 0; i < iB; i++) {
                            fArr[i] = aiwVar4.a(i);
                        }
                        fArr2 = fArr;
                    } else {
                        fArr2 = new float[iB];
                        for (int i9 = 0; i9 < iB; i9++) {
                            fArr2[i9] = aiwVar2.a(i9);
                        }
                    }
                } else if (alxVar == null) {
                    fArr2 = new float[iB];
                    for (int i10 = 0; i10 < iB; i10++) {
                        fArr2[i10] = aiwVar.a(i10);
                    }
                } else {
                    iA = 0;
                    if (iA == this.a) {
                        if (alxVar == null) {
                            aooh.g();
                        }
                        aiwVar4 = alxVar.a;
                        fArr = new float[iB];
                        while (i < iB) {
                            fArr[i] = aiwVar4.a(i);
                        }
                        fArr2 = fArr;
                    } else {
                        if (alxVar == null) {
                            aooh.g();
                        }
                        aiwVar4 = alxVar.a;
                        fArr = new float[iB];
                        while (i < iB) {
                            fArr[i] = aiwVar4.a(i);
                        }
                        fArr2 = fArr;
                    }
                }
                fArr4[i8] = fArr2;
            }
            this.n = new defpackage.ni(this.f, this.g, fArr4);
        }
    }

    @Override // defpackage.alp
    public final /* synthetic */ long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return defpackage.yj.a(this);
    }

    @Override // defpackage.alp
    public final /* synthetic */ aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return d(defpackage.yj.a(this), aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aiw aiwVar4;
        aiw aiwVar5;
        int iA = (int) defpackage.alr.a(this, j / 1000000);
        aco acoVar = this.c;
        defpackage.alx alxVar = (defpackage.alx) acoVar.a(iA);
        if (alxVar != null) {
            return alxVar.a;
        }
        if (iA >= this.a) {
            return aiwVar2;
        }
        if (iA <= 0) {
            return aiwVar;
        }
        k(aiwVar, aiwVar2, aiwVar3);
        aiw aiwVar6 = this.h;
        if (aiwVar6 == null) {
            aooh.g();
        }
        int i = 0;
        if (this.n != defpackage.alr.c) {
            float fH = h(iA);
            float[] fArr = this.l;
            defpackage.aiz[][] aizVarArr = (defpackage.aiz[][]) this.n.a;
            int length = aizVarArr.length;
            float f = aizVarArr[0][0].a;
            int i2 = length - 1;
            float f2 = aizVarArr[i2][0].b;
            int length2 = fArr.length;
            if (fH >= f && fH <= f2) {
                boolean z = false;
                for (defpackage.aiz[] aizVarArr2 : aizVarArr) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2 - 1; i4 += 2) {
                        defpackage.aiz aizVar = aizVarArr2[i3];
                        if (fH <= aizVar.b) {
                            int i5 = i4 + 1;
                            if (aizVar.g) {
                                fArr[i4] = aizVar.c(fH);
                                fArr[i5] = aizVar.d(fH);
                            } else {
                                aizVar.e(fH);
                                fArr[i4] = aizVar.h + (aizVar.e * aizVar.c);
                                fArr[i5] = aizVar.i + (aizVar.f * aizVar.d);
                            }
                            z = true;
                        }
                        i3++;
                    }
                    if (z) {
                        break;
                    }
                }
            } else {
                int i6 = length2 - 1;
                if (fH > f2) {
                    f = f2;
                } else {
                    i2 = 0;
                }
                float f3 = fH - f;
                int i7 = 0;
                int i8 = 0;
                while (i7 < i6) {
                    int i9 = i7 + 1;
                    defpackage.aiz aizVar2 = aizVarArr[i2][i8];
                    if (aizVar2.g) {
                        fArr[i7] = aizVar2.c(f) + (aizVar2.h * f3);
                        fArr[i9] = aizVar2.d(f) + (aizVar2.i * f3);
                    } else {
                        aizVar2.e(f);
                        fArr[i7] = aizVar2.h + (aizVar2.e * aizVar2.c) + (aizVar2.a() * f3);
                        fArr[i9] = aizVar2.i + (aizVar2.f * aizVar2.d) + (aizVar2.b() * f3);
                    }
                    i7 += 2;
                    i8++;
                }
            }
            int length3 = fArr.length;
            while (i < length3) {
                aiwVar6.e(i, fArr[i]);
                i++;
            }
        } else {
            int iJ = j(iA);
            float fI = i(iJ, iA, true);
            acm acmVar = this.b;
            defpackage.alx alxVar2 = (defpackage.alx) acoVar.a(acmVar.a(iJ));
            if (alxVar2 != null && (aiwVar5 = alxVar2.a) != null) {
                aiwVar = aiwVar5;
            }
            defpackage.alx alxVar3 = (defpackage.alx) acoVar.a(acmVar.a(iJ + 1));
            if (alxVar3 != null && (aiwVar4 = alxVar3.a) != null) {
                aiwVar2 = aiwVar4;
            }
            int iB = aiwVar6.b();
            while (i < iB) {
                aiwVar6.e(i, (aiwVar.a(i) * (1.0f - fI)) + (aiwVar2.a(i) * fI));
                i++;
            }
        }
        return aiwVar6;
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        long jA = defpackage.alr.a(this, j / 1000000);
        if (jA < 0) {
            return aiwVar3;
        }
        k(aiwVar, aiwVar2, aiwVar3);
        aiw aiwVar4 = this.i;
        if (aiwVar4 == null) {
            aooh.g();
        }
        int i = 0;
        if (this.n != defpackage.alr.c) {
            float fH = h((int) jA);
            float[] fArr = this.m;
            defpackage.aiz[][] aizVarArr = (defpackage.aiz[][]) this.n.a;
            float f = aizVarArr[0][0].a;
            float f2 = aizVarArr[aizVarArr.length - 1][0].b;
            if (fH < f) {
                fH = f;
            }
            if (fH <= f2) {
                f2 = fH;
            }
            int length = fArr.length;
            boolean z = false;
            for (defpackage.aiz[] aizVarArr2 : aizVarArr) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length - 1) {
                    defpackage.aiz aizVar = aizVarArr2[i3];
                    if (f2 <= aizVar.b) {
                        int i4 = i2 + 1;
                        if (aizVar.g) {
                            fArr[i2] = aizVar.h;
                            fArr[i4] = aizVar.i;
                        } else {
                            aizVar.e(f2);
                            fArr[i2] = aizVar.a();
                            fArr[i4] = aizVar.b();
                        }
                        z = true;
                    }
                    i2 += 2;
                    i3++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                aiwVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            aiw aiwVarC = c(((-1) + jA) * 1000000, aiwVar, aiwVar2, aiwVar3);
            aiw aiwVarC2 = c(jA * 1000000, aiwVar, aiwVar2, aiwVar3);
            int iB = aiwVarC.b();
            while (i < iB) {
                aiwVar4.e(i, (aiwVarC.a(i) - aiwVarC2.a(i)) * 1000.0f);
                i++;
            }
        }
        return aiwVar4;
    }

    @Override // defpackage.alp
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.als
    public final int f() {
        return 0;
    }

    @Override // defpackage.als
    public final int g() {
        return this.a;
    }
}
