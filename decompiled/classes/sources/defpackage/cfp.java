package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfp {
    public final defpackage.cfm a;
    public int[] b;
    public java.lang.Object[] c;
    public java.util.ArrayList d;
    public java.util.HashMap e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public defpackage.aco s;
    public defpackage.aco t;
    private defpackage.acm u;
    private final defpackage.appu v;
    private final defpackage.appu w;
    private final defpackage.appu x;

    public cfp(defpackage.cfm cfmVar) {
        this.a = cfmVar;
        this.b = cfmVar.a;
        this.c = cfmVar.c;
        this.d = cfmVar.h;
        this.e = cfmVar.i;
        this.s = cfmVar.j;
        int i = cfmVar.b;
        this.f = i;
        this.g = (this.b.length / 5) - i;
        int i2 = cfmVar.d;
        this.j = i2;
        this.k = this.c.length - i2;
        this.l = i;
        this.v = new defpackage.appu(null, null);
        this.w = new defpackage.appu(null, null);
        this.x = new defpackage.appu(null, null);
        this.p = i;
        this.q = -1;
    }

    private final int Z(int[] iArr, int i) {
        return d(iArr, i) + java.lang.Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int aa(int[] iArr, int i) {
        return ab(iArr[(h(i) * 5) + 2]);
    }

    private final int ab(int i) {
        return i <= -2 ? g() + i + 2 : i;
    }

    private final int ac(int i, int i2) {
        return i >= i2 ? -((g() - i) + 2) : i;
    }

    private final void ad() {
        this.w.g((f() - this.g) - this.p);
    }

    private final void ae() {
        this.p = (f() - this.g) - this.w.e();
    }

    private final void af(java.lang.Object obj) {
        if (this.m > 0) {
            C(1, this.q);
        }
        java.lang.Object[] objArr = this.c;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        java.lang.Object obj2 = objArr[e(i)];
        if (i2 > this.i) {
            defpackage.cax.b("Writing to an invalid slot");
        }
        this.c[e(this.h - 1)] = obj;
    }

    public final void A(int i, int i2, int i3) {
        int iAc = ac(i, this.f);
        while (i3 < i2) {
            int[] iArr = this.b;
            iArr[(h(i3) * 5) + 2] = iAc;
            int i4 = iArr[(h(i3) * 5) + 3] + i3;
            A(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void B(int i) {
        if (i > 0) {
            int i2 = this.o;
            E(i2);
            int i3 = this.f;
            int i4 = this.g;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = java.lang.Math.max(java.lang.Math.max(length << 1, i5 + i), 32);
                int i6 = iMax * 5;
                int i7 = iMax - i5;
                int[] iArr2 = new int[i6];
                defpackage.ajsz.db(iArr, iArr2, 0, 0, i3 * 5);
                defpackage.ajsz.db(iArr, iArr2, (i3 + i7) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i7;
            }
            int i8 = this.p;
            if (i8 >= i3) {
                this.p = i8 + i;
            }
            int i9 = i3 + i;
            this.f = i9;
            this.g = i4 - i;
            int iC = i5 > 0 ? c(i2 + i) : 0;
            int i10 = this.l >= i3 ? this.j : 0;
            int i11 = this.k;
            int length2 = this.c.length;
            if (iC > i10) {
                iC = -(((length2 - i11) - iC) + 1);
            }
            for (int i12 = i3; i12 < i9; i12++) {
                this.b[(i12 * 5) + 4] = iC;
            }
            int i13 = this.l;
            if (i13 >= i3) {
                this.l = i13 + i;
            }
        }
    }

    public final void C(int i, int i2) {
        if (i > 0) {
            F(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                java.lang.Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = java.lang.Math.max(java.lang.Math.max(length << 1, i5 + i), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i3);
                java.lang.System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.i;
            if (i9 >= i3) {
                this.i = i9 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final void D(int i) {
        int iH = h(i) * 5;
        int[] iArr = this.b;
        int i2 = iH + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = (i3 & (-134217729)) | 134217728;
            iArr[i2] = i4;
            if ((i4 & 67108864) == 0) {
                O(l(i));
            }
        }
    }

    public final void E(int i) {
        defpackage.cfh cfhVar;
        int i2;
        defpackage.cfh cfhVar2;
        int i3;
        int i4;
        int i5 = this.g;
        int i6 = this.f;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iF = f() - this.g;
                java.util.ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iA = defpackage.cfo.a(arrayList, i6, iF); iA < this.d.size() && (i3 = (cfhVar2 = (defpackage.cfh) this.d.get(iA)).a) < 0 && (i4 = i3 + iF) < i; iA++) {
                        cfhVar2.a = i4;
                    }
                } else {
                    for (int iA2 = defpackage.cfo.a(arrayList, i, iF); iA2 < this.d.size() && (i2 = (cfhVar = (defpackage.cfh) this.d.get(iA2)).a) >= 0; iA2++) {
                        cfhVar.a = -(iF - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                int i10 = i7 + i8;
                if (i < i6) {
                    defpackage.ajsz.db(iArr, iArr, i10, i7, i9);
                } else {
                    defpackage.ajsz.db(iArr, iArr, i9, i8 + i9, i10);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iF2 = f();
            if (i6 >= iF2) {
                defpackage.cax.b("Check failed");
            }
            while (i6 < iF2) {
                int i11 = (i6 * 5) + 2;
                int i12 = this.b[i11];
                int iAc = ac(ab(i12), i);
                if (iAc != i12) {
                    this.b[i11] = iAc;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f = i;
    }

    public final void F(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            java.lang.Object[] objArr = this.c;
            if (i < i4) {
                java.lang.System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                java.lang.System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = java.lang.Math.min(i2 + 1, g());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iH = h(iMin);
                int iH2 = h(i5);
                int i7 = this.f;
                while (iH < iH2) {
                    int i8 = (iH * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        defpackage.cax.b("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iH++;
                    if (iH == i7) {
                        iH += this.g;
                    }
                }
            } else {
                int iH3 = h(i5);
                int iH4 = h(iMin);
                while (iH3 < iH4) {
                    int i10 = (iH3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        defpackage.cax.b("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iH3++;
                    if (iH3 == this.f) {
                        iH3 += this.g;
                    }
                }
            }
            this.l = iMin;
        }
        this.j = i;
    }

    public final void G() {
        int i;
        defpackage.acm acmVar = this.u;
        if (acmVar != null) {
            while (acmVar.b != 0) {
                int iA = defpackage.cfk.a(acmVar);
                int iH = h(iA) * 5;
                int iJ = iA + 1;
                int iJ2 = j(iA) + iA;
                while (true) {
                    if (iJ >= iJ2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(h(iJ) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iJ += j(iJ);
                    }
                }
                int[] iArr = this.b;
                int i2 = iH + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i3 & (-67108865)) | (i << 26);
                    int iL = l(iA);
                    if (iL >= 0) {
                        defpackage.cfk.b(acmVar, iL);
                    }
                }
            }
        }
    }

    public final void H(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            F(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            java.lang.Object[] objArr = this.c;
            if (objArr == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(objArr, i, i5, (java.lang.Object) null);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final void I() {
        int i = this.p;
        this.o = i;
        this.h = d(this.b, h(i));
    }

    public final void J() {
        if (this.m != 0) {
            defpackage.cax.b("Key must be supplied when inserting");
        }
        java.lang.Object obj = defpackage.cau.a;
        L(0, obj, false, obj);
    }

    public final void K(int i, java.lang.Object obj) {
        L(i, obj, false, defpackage.cau.a);
    }

    public final void L(int i, java.lang.Object obj, boolean z, java.lang.Object obj2) {
        int i2;
        defpackage.appu appuVar = this.x;
        int i3 = this.q;
        int i4 = this.m;
        appuVar.g(this.n);
        if (i4 > 0) {
            int i5 = this.o;
            int iD = d(this.b, h(i5));
            B(1);
            this.h = iD;
            this.i = iD;
            int iH = h(i5);
            java.lang.Object obj3 = defpackage.cau.a;
            int i6 = obj != obj3 ? 1 : 0;
            int i7 = (z || obj2 == obj3) ? 0 : 1;
            int i8 = this.k;
            int i9 = this.j;
            int length = this.c.length;
            if (iD > i9) {
                iD = -(((length - i8) - iD) + 1);
            }
            if (iD >= 0 && this.l < i5) {
                iD = -(((length - i8) - iD) + 1);
            }
            int[] iArr = this.b;
            int i10 = this.q;
            int i11 = iH * 5;
            iArr[i11] = i;
            iArr[i11 + 1] = ((z ? 1 : 0) << 30) | (i6 << 29) | (i7 << 28);
            iArr[i11 + 2] = i10;
            iArr[i11 + 3] = 0;
            iArr[i11 + 4] = iD;
            int i12 = (z ? 1 : 0) + i6 + i7;
            if (i12 > 0) {
                C(i12, i5);
                java.lang.Object[] objArr = this.c;
                int i13 = this.h;
                if (z) {
                    objArr[i13] = obj2;
                    i13++;
                }
                if (i6 != 0) {
                    objArr[i13] = obj;
                    i13++;
                }
                if (i7 != 0) {
                    objArr[i13] = obj2;
                    i13++;
                }
                this.h = i13;
            }
            this.n = 0;
            i2 = i5 + 1;
            this.q = i5;
            this.o = i2;
            if (i3 >= 0 && Y(i3) != null) {
                throw null;
            }
        } else {
            this.v.g(i3);
            ad();
            int i14 = this.o;
            int iH2 = h(i14);
            int i15 = iH2 * 5;
            if (!defpackage.aooh.n(obj2, defpackage.cau.a)) {
                if (z) {
                    P(this.o, obj2);
                } else {
                    N(obj2);
                }
            }
            this.h = n(this.b, iH2);
            this.i = d(this.b, h(this.o + 1));
            int[] iArr2 = this.b;
            this.n = iArr2[i15 + 1] & 67108863;
            this.q = i14;
            this.o = i14 + 1;
            i2 = i14 + iArr2[i15 + 3];
        }
        this.p = i2;
    }

    public final void M(int i, java.lang.Object obj) {
        L(i, obj, true, defpackage.cau.a);
    }

    public final void N(java.lang.Object obj) {
        int iH = h(this.o);
        if ((this.b[(iH * 5) + 1] & 268435456) == 0) {
            defpackage.cax.b("Updating the data of a group that was not created with a data slot");
        }
        this.c[e(Z(this.b, iH))] = obj;
    }

    public final void O(int i) {
        if (i >= 0) {
            defpackage.acm acmVar = this.u;
            if (acmVar == null) {
                acmVar = new defpackage.acm(16);
                this.u = acmVar;
            }
            defpackage.cfk.b(acmVar, i);
        }
    }

    public final void P(int i, java.lang.Object obj) {
        int iH = h(i);
        int[] iArr = this.b;
        if (iH >= iArr.length || (iArr[(iH * 5) + 1] & 1073741824) == 0) {
            defpackage.cax.b(defpackage.a.bs(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[e(d(this.b, iH))] = obj;
    }

    public final boolean Q(defpackage.cfh cfhVar, defpackage.cfh cfhVar2) {
        int iA = a(cfhVar);
        int i = this.b[(iA * 5) + 3] + iA;
        int i2 = cfhVar2.a;
        return iA <= i2 && i2 < i;
    }

    public final boolean R(int i, int i2) {
        int iF;
        int iJ;
        if (i2 == this.q) {
            iF = this.p;
        } else {
            defpackage.appu appuVar = this.v;
            if (i2 > appuVar.d(0)) {
                iJ = j(i2);
            } else {
                int[] iArr = (int[]) appuVar.b;
                int iMin = java.lang.Math.min(iArr.length, appuVar.a);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iJ = j(i2);
                } else {
                    iF = (f() - this.g) - ((int[]) this.w.b)[i3];
                }
            }
            iF = iJ + i2;
        }
        return i > i2 && i < iF;
    }

    public final boolean S(int i) {
        return (this.b[(h(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean T() {
        if (this.m != 0) {
            defpackage.cax.b("Cannot remove group while inserting");
        }
        int i = this.o;
        int i2 = this.h;
        int iD = d(this.b, h(i));
        int iM = m();
        if (Y(this.q) != null && q(i) != null) {
            throw null;
        }
        defpackage.acm acmVar = this.u;
        if (acmVar != null) {
            while (true) {
                int i3 = acmVar.b;
                if (i3 != 0) {
                    if (i3 == 0) {
                        defpackage.un.d("IntList is empty.");
                    }
                    if (acmVar.a[0] < i) {
                        break;
                    }
                    defpackage.cfk.a(acmVar);
                } else {
                    break;
                }
            }
        }
        boolean zU = U(i, this.o - i);
        H(iD, this.h - iD, i - 1);
        this.o = i;
        this.h = i2;
        this.n -= iM;
        return zU;
    }

    public final boolean U(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            java.util.ArrayList arrayList = this.d;
            E(i);
            if (!arrayList.isEmpty()) {
                java.util.HashMap map = this.e;
                int i3 = i + i2;
                int iA = defpackage.cfo.a(this.d, i3, f() - this.g);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    defpackage.cfh cfhVar = (defpackage.cfh) this.d.get(iA);
                    int iA2 = a(cfhVar);
                    if (iA2 < i) {
                        break;
                    }
                    if (iA2 < i3) {
                        cfhVar.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.f = i;
            this.g += i2;
            int i6 = this.l;
            if (i6 > i) {
                this.l = java.lang.Math.max(i, i6 - i2);
            }
            int i7 = this.p;
            if (i7 >= this.f) {
                this.p = i7 - i2;
            }
            int i8 = this.q;
            if (i8 >= 0 && (this.b[(h(i8) * 5) + 1] & 67108864) != 0) {
                O(i8);
            }
        }
        return z;
    }

    public final void V() {
        defpackage.adq adqVar;
        int i = this.m;
        int i2 = this.o;
        int i3 = this.p;
        int i4 = this.q;
        int iH = h(i4) * 5;
        int i5 = i2 - i4;
        int i6 = this.n;
        int i7 = iH + 1;
        int i8 = this.b[i7] & 1073741824;
        int i9 = iH + 3;
        int iD = 0;
        if (i > 0) {
            defpackage.aco acoVar = this.t;
            if (acoVar != null && (adqVar = (defpackage.adq) acoVar.a(i4)) != null) {
                java.lang.Object[] objArr = adqVar.a;
                int i10 = adqVar.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    af(objArr[i11]);
                }
            }
            int[] iArr = this.b;
            iArr[i9] = i5;
            iArr[i7] = (iArr[i7] & (-67108864)) | i6;
            defpackage.appu appuVar = this.x;
            if (i8 != 0) {
                i6 = 1;
            }
            this.n = appuVar.e() + i6;
            int iAa = aa(this.b, i4);
            this.q = iAa;
            int iG = iAa < 0 ? g() : h(iAa + 1);
            iD = iG >= 0 ? d(this.b, iG) : 0;
            this.h = iD;
            this.i = iD;
            return;
        }
        if (i2 != i3) {
            defpackage.cax.b("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i12 = iArr2[i9];
        int i13 = iArr2[i7] & 67108863;
        iArr2[i9] = i5;
        iArr2[i7] = (iArr2[i7] & (-67108864)) | i6;
        int iE = this.v.e();
        ae();
        this.q = iE;
        int iAa2 = aa(this.b, i4);
        int iE2 = this.x.e();
        this.n = iE2;
        if (iAa2 == iE) {
            this.n = iE2 + (i8 == 0 ? i6 - i13 : 0);
            return;
        }
        int i14 = i5 - i12;
        int i15 = i8 != 0 ? 0 : i6 - i13;
        if (i14 != 0 || i15 != 0) {
            while (iAa2 != 0 && iAa2 != iE) {
                if (i15 == 0) {
                    if (i14 == 0) {
                        break;
                    } else {
                        i15 = 0;
                    }
                }
                int iH2 = h(iAa2) * 5;
                if (i14 != 0) {
                    int[] iArr3 = this.b;
                    int i16 = iH2 + 3;
                    iArr3[i16] = iArr3[i16] + i14;
                }
                int i17 = iH2 + 1;
                if (i15 != 0) {
                    int[] iArr4 = this.b;
                    int i18 = iArr4[i17];
                    iArr4[i17] = (i18 & (-67108864)) | ((i18 & 67108863) + i15);
                }
                int[] iArr5 = this.b;
                if ((iArr5[i17] & 1073741824) != 0) {
                    i15 = 0;
                }
                iAa2 = aa(iArr5, iAa2);
            }
            iD = i15;
        }
        this.n += iD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final void W(defpackage.cfm cfmVar, int i) {
        ?? r13;
        if (this.m <= 0) {
            defpackage.cax.b("Check failed");
        }
        boolean z = false;
        if (i == 0) {
            if (this.o == 0 && this.a.b == 0) {
                int[] iArr = cfmVar.a;
                int i2 = iArr[3];
                int i3 = cfmVar.b;
                if (i2 == i3) {
                    int[] iArr2 = this.b;
                    java.lang.Object[] objArr = this.c;
                    java.util.ArrayList arrayList = this.d;
                    java.util.HashMap map = this.e;
                    defpackage.aco acoVar = this.s;
                    java.lang.Object[] objArr2 = cfmVar.c;
                    int i4 = cfmVar.d;
                    java.util.HashMap map2 = cfmVar.i;
                    defpackage.aco acoVar2 = cfmVar.j;
                    this.b = iArr;
                    this.c = objArr2;
                    this.d = cfmVar.h;
                    this.f = i3;
                    this.g = (iArr.length / 5) - i3;
                    this.j = i4;
                    this.k = objArr2.length - i4;
                    this.l = i3;
                    this.e = map2;
                    this.s = acoVar2;
                    cfmVar.i(iArr2, 0, objArr, 0, arrayList, map, acoVar);
                    return;
                }
            }
            r13 = z;
        } else {
            r13 = i;
        }
        defpackage.cfp cfpVarF = cfmVar.f();
        try {
            defpackage.den.Y(cfpVarF, r13 == true ? 1 : 0, this, true, true, false);
            boolean z2 = true;
        } finally {
            cfpVarF.x(z);
        }
    }

    public final void X(java.lang.Object obj) {
        if (this.m <= 0 || this.h == this.j) {
            af(obj);
            return;
        }
        defpackage.aco acoVar = this.t;
        if (acoVar == null) {
            acoVar = new defpackage.aco(6);
        }
        this.t = acoVar;
        int i = this.q;
        java.lang.Object objA = acoVar.a(i);
        if (objA == null) {
            objA = new defpackage.adq(16);
            acoVar.g(i, objA);
        }
        ((defpackage.adq) objA).q(obj);
    }

    public final rr Y(int i) {
        defpackage.cfh cfhVarQ;
        java.util.HashMap map = this.e;
        if (map == null || (cfhVarQ = q(i)) == null) {
            return null;
        }
        return (rr) map.get(cfhVarQ);
    }

    public final int a(defpackage.cfh cfhVar) {
        int i = cfhVar.a;
        return i < 0 ? i + g() : i;
    }

    public final int b(int i, int i2) {
        int iJ = j(i) + i;
        int i3 = i + 1;
        int i4 = 0;
        while (i3 < iJ && i4 < i2) {
            int iH = h(i3);
            int[] iArr = this.b;
            int i5 = iH * 5;
            i3 += iArr[i5 + 3];
            if (i3 < iJ && (iArr[i5 + 1] & 536870912) == 0) {
                i4++;
            }
        }
        return i3;
    }

    public final int c(int i) {
        return d(this.b, h(i));
    }

    public final int d(int[] iArr, int i) {
        if (i >= f()) {
            return this.c.length - this.k;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.k) + i2 + 1 : i2;
    }

    public final int e(int i) {
        return i + (this.k * (i < this.j ? 0 : 1));
    }

    public final int f() {
        return this.b.length / 5;
    }

    public final int g() {
        return f() - this.g;
    }

    public final int h(int i) {
        return i + (this.g * (i < this.f ? 0 : 1));
    }

    public final int i(int i) {
        return this.b[h(i) * 5];
    }

    public final int j(int i) {
        return this.b[(h(i) * 5) + 3];
    }

    public final int k(int i) {
        return this.b[(h(i) * 5) + 1] & 67108863;
    }

    public final int l(int i) {
        return aa(this.b, i);
    }

    public final int m() {
        int i = this.o;
        int iH = h(i) * 5;
        int[] iArr = this.b;
        int i2 = i + iArr[iH + 3];
        this.o = i2;
        this.h = d(iArr, h(i2));
        int i3 = this.b[iH + 1];
        if ((1073741824 & i3) == 0) {
            return 67108863 & i3;
        }
        return 1;
    }

    public final int n(int[] iArr, int i) {
        if (i >= f()) {
            return this.c.length - this.k;
        }
        int iD = defpackage.cfo.d(iArr, i);
        return iD < 0 ? (this.c.length - this.k) + iD + 1 : iD;
    }

    public final int o(int i) {
        return n(this.b, h(i));
    }

    public final defpackage.cfh p(int i) {
        java.util.ArrayList arrayList = this.d;
        int iC = defpackage.cfo.c(arrayList, i, g());
        if (iC >= 0) {
            return (defpackage.cfh) arrayList.get(iC);
        }
        if (i > this.f) {
            i = -(g() - i);
        }
        defpackage.cfh cfhVar = new defpackage.cfh(i);
        arrayList.add(-(iC + 1), cfhVar);
        return cfhVar;
    }

    public final defpackage.cfh q(int i) {
        if (i < 0 || i >= g()) {
            return null;
        }
        return defpackage.cfo.e(this.d, i, g());
    }

    public final java.lang.Object r(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        return (iArr[(iH * 5) + 1] & 268435456) != 0 ? this.c[Z(iArr, iH)] : defpackage.cau.a;
    }

    public final java.lang.Object s(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        if ((iArr[(iH * 5) + 1] & 536870912) != 0) {
            return this.c[defpackage.cfo.b(iArr, iH)];
        }
        return null;
    }

    public final java.lang.Object t(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        if ((iArr[(iH * 5) + 1] & 1073741824) != 0) {
            return this.c[e(d(iArr, iH))];
        }
        return null;
    }

    public final java.lang.String toString() {
        int i = this.o;
        int i2 = this.p;
        int iG = g();
        int i3 = this.f;
        return "SlotWriter(current = " + i + " end=" + i2 + " size = " + iG + " gap=" + i3 + '-' + (this.g + i3) + ')';
    }

    public final java.lang.Object u(int i, int i2, java.lang.Object obj) {
        int iN = n(this.b, h(i));
        int iD = d(this.b, h(i + 1));
        int i3 = iN + i2;
        if (i3 < iN || i3 >= iD) {
            defpackage.cax.b(defpackage.a.bf(i, i2, "Write to an invalid slot index ", " for group "));
        }
        int iE = e(i3);
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj2 = objArr[iE];
        objArr[iE] = obj;
        return obj2;
    }

    public final void v(int i) {
        if (i < 0) {
            defpackage.cax.b("Cannot seek backwards");
        }
        if (this.m > 0) {
            defpackage.cdh.b("Cannot call seek() while inserting");
        }
        if (i != 0) {
            int i2 = this.o + i;
            int i3 = this.q;
            if (i2 < i3 || i2 > this.p) {
                defpackage.cax.b("Cannot seek outside the current group (" + i3 + '-' + this.p + ')');
            }
            this.o = i2;
            int iD = d(this.b, h(i2));
            this.h = iD;
            this.i = iD;
        }
    }

    public final void w() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            ad();
        }
    }

    public final void x(boolean z) {
        this.r = true;
        if (z && this.v.a == 0) {
            E(g());
            F(this.c.length - this.k, this.f);
            int i = this.j;
            int i2 = this.k + i;
            java.lang.Object[] objArr = this.c;
            if (objArr == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(objArr, i, i2, (java.lang.Object) null);
            G();
        }
        defpackage.cfm cfmVar = this.a;
        int[] iArr = this.b;
        int i3 = this.f;
        java.lang.Object[] objArr2 = this.c;
        int i4 = this.j;
        java.util.ArrayList arrayList = this.d;
        java.util.HashMap map = this.e;
        defpackage.aco acoVar = this.s;
        if (!cfmVar.f) {
            defpackage.cdh.a("Unexpected writer close()");
        }
        cfmVar.f = false;
        cfmVar.i(iArr, i3, objArr2, i4, arrayList, map, acoVar);
    }

    public final void y() {
        if (this.m <= 0) {
            defpackage.cdh.b("Unbalanced begin/end insert");
        }
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            if (this.x.a != this.v.a) {
                defpackage.cax.b("startGroup/endGroup mismatch while inserting");
            }
            ae();
        }
    }

    public final void z(int i) {
        if (this.m > 0) {
            defpackage.cax.b("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.q;
        if (i2 != i) {
            if (i < i2 || i >= this.p) {
                defpackage.cax.b(defpackage.a.bf(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.o;
            int i4 = this.h;
            int i5 = this.i;
            this.o = i;
            J();
            this.o = i3;
            this.h = i4;
            this.i = i5;
        }
    }
}
