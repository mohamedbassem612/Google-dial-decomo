package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byj implements defpackage.drr {
    private final long b;
    private final dpf c;
    private final defpackage.bqy d;
    private final int e;
    private final aonn g;
    private final int f = 0;
    public final ccp a = new androidx.compose.runtime.ParcelableSnapshotMutableState(new crg(mni.bj(0.5f, 0.5f)), cdu.c);

    public byj(long j, dpf dpfVar, defpackage.bqy bqyVar, int i, aonn aonnVar) {
        this.b = j;
        this.c = dpfVar;
        this.d = bqyVar;
        this.e = i;
        this.g = aonnVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab A[LOOP:1: B:26:0x00ab->B:38:0x00e2, LOOP_START, PHI: r7
      0x00ab: PHI (r7v11 int) = (r7v1 int), (r7v16 int) binds: [B:25:0x00a9, B:38:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2 A[EDGE_INSN: B:35:0x00d2->B:40:0x00e6 BREAK  A[LOOP:1: B:26:0x00ab->B:38:0x00e2]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9 A[EDGE_INSN: B:36:0x00d9->B:40:0x00e6 BREAK  A[LOOP:1: B:26:0x00ab->B:38:0x00e2]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2 A[LOOP:1: B:26:0x00ab->B:38:0x00e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[EDGE_INSN: B:39:0x00e5->B:40:0x00e6 BREAK  A[LOOP:1: B:26:0x00ab->B:38:0x00e2]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5 A[SYNTHETIC] */
    @Override // defpackage.drr
    public final long a(dpo dpoVar, long j, dpq dpqVar, long j2) {
        char c;
        int i;
        long j3;
        int iA;
        acm acmVar;
        int i2;
        int i3;
        int iW;
        dpo dpoVarI;
        int i4;
        int i5;
        float fMax;
        int i6;
        int i7;
        float fMax2;
        int i8;
        int i9;
        int i10;
        int i11;
        int iA2;
        int i12;
        int i13;
        int i14;
        defpackage.brk brkVar = new defpackage.brk(dpoVar, j, j2, dpqVar);
        defpackage.bqy bqyVar = this.d;
        java.lang.Object objA = bqyVar.b.a(brkVar);
        java.lang.Object objA2 = bqyVar.c.a(brkVar);
        long j4 = this.b;
        char c2 = ' ';
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j4 >> 32)) + 0.0f;
        dpf dpfVar = this.c;
        int iDp = dpfVar.dp(fIntBitsToFloat) * (dpqVar == dpq.a ? 1 : -1);
        long j5 = 4294967295L;
        int iDp2 = dpfVar.dp(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)) + 0.0f);
        acm acmVar2 = (acm) objA;
        aopq aopqVarC = aooc.C(0, acmVar2.b);
        int i15 = ((aopo) aopqVarC).a;
        int i16 = ((aopo) aopqVarC).b;
        if (i15 <= i16) {
            while (true) {
                c = c2;
                iA = acmVar2.a(i15) + iDp;
                j3 = j5;
                if (iA < 0 || ((int) (j2 >> c)) + iA > ((int) (j >> c))) {
                    if (i15 == acmVar2.b - 1) {
                        int i17 = (int) (j >> c);
                        int i18 = (int) (j2 >> c);
                        if (i18 < i17) {
                            i = 0;
                            iA = aooc.w(iA, 0, i17 - i18);
                            break;
                        }
                        iA = cmh.k.a(i18, i17, dpqVar);
                    } else {
                        i = 0;
                        if (i15 != i16) {
                            i15++;
                            c2 = c;
                            j5 = j3;
                        }
                    }
                }
                i = 0;
                break;
            }
            acmVar = (acm) objA2;
            aopq aopqVarC2 = aooc.C(i, acmVar.b);
            i2 = ((aopo) aopqVarC2).a;
            i3 = ((aopo) aopqVarC2).b;
            if (i2 <= i3) {
                iW = i;
                break;
            }
            while (true) {
                iA2 = acmVar.a(i2) + iDp2;
                i12 = this.e;
                if (iA2 >= i12 && ((int) (j2 & j3)) + iA2 <= ((int) (j & j3)) - i12) {
                    iW = iA2;
                    break;
                }
                if (i2 != acmVar.b - 1) {
                    if (i2 == i3) {
                        iW = i;
                        break;
                    }
                    i2++;
                } else {
                    i13 = (int) (j2 & j3);
                    i14 = (int) (j & j3);
                    if (i13 < i14 - (i12 << 1)) {
                        iW = aooc.w(iA2, i12, (i14 - i12) - i13);
                        break;
                    }
                    iW = cmh.n.a(i13, i14);
                    break;
                }
            }
            long j6 = (((long) iA) << c) | (((long) iW) & j3);
            dpoVarI = dfd.i(j6, j2);
            i4 = dpoVarI.b;
            i5 = dpoVar.d;
            int i19 = defpackage.brj.a;
            if (i4 >= i5) {
                fMax = 0.0f;
            } else {
                i10 = dpoVarI.d;
                i11 = dpoVar.b;
                if (i10 <= i11) {
                    fMax = 1.0f;
                } else if (dpoVarI.b() == 0) {
                    fMax = 0.0f;
                } else {
                    fMax = (((java.lang.Math.max(i11, i4) + java.lang.Math.min(i5, i10)) / 2) - i4) / dpoVarI.b();
                }
            }
            i6 = dpoVarI.c;
            i7 = dpoVar.e;
            if (i6 >= i7) {
                fMax2 = 0.0f;
            } else {
                i8 = dpoVarI.e;
                i9 = dpoVar.c;
                if (i8 <= i9) {
                    fMax2 = 1.0f;
                } else if (dpoVarI.a() == 0) {
                    fMax2 = 0.0f;
                } else {
                    fMax2 = (((java.lang.Math.max(i9, i6) + java.lang.Math.min(i7, i8)) / 2) - i6) / dpoVarI.a();
                }
            }
            this.a.b(new crg(mni.bj(fMax, fMax2)));
            this.g.a(dpoVar, dfd.i(j6, j2));
            return j6;
        }
        c = ' ';
        i = 0;
        j3 = 4294967295L;
        iA = i;
        acmVar = (acm) objA2;
        aopq aopqVarC3 = aooc.C(i, acmVar.b);
        i2 = ((aopo) aopqVarC3).a;
        i3 = ((aopo) aopqVarC3).b;
        if (i2 <= i3) {
            iW = i;
            break;
        }
        while (true) {
            iA2 = acmVar.a(i2) + iDp2;
            i12 = this.e;
            if (iA2 >= i12) {
                if (i2 != acmVar.b - 1) {
                    if (i2 == i3) {
                        iW = i;
                        break;
                    }
                    i2++;
                } else {
                    i13 = (int) (j2 & j3);
                    i14 = (int) (j & j3);
                    if (i13 < i14 - (i12 << 1)) {
                        iW = aooc.w(iA2, i12, (i14 - i12) - i13);
                        break;
                    }
                    iW = cmh.n.a(i13, i14);
                    break;
                }
            } else if (i2 != acmVar.b - 1) {
                if (i2 == i3) {
                    iW = i;
                    break;
                }
                i2++;
            } else {
                i13 = (int) (j2 & j3);
                i14 = (int) (j & j3);
                if (i13 < i14 - (i12 << 1)) {
                    iW = aooc.w(iA2, i12, (i14 - i12) - i13);
                    break;
                }
                iW = cmh.n.a(i13, i14);
                break;
            }
        }
        long j7 = (((long) iA) << c) | (((long) iW) & j3);
        dpoVarI = dfd.i(j7, j2);
        i4 = dpoVarI.b;
        i5 = dpoVar.d;
        int i110 = defpackage.brj.a;
        if (i4 >= i5) {
            fMax = 0.0f;
        } else {
            i10 = dpoVarI.d;
            i11 = dpoVar.b;
            if (i10 <= i11) {
                fMax = 1.0f;
            } else if (dpoVarI.b() == 0) {
                fMax = 0.0f;
            } else {
                fMax = (((java.lang.Math.max(i11, i4) + java.lang.Math.min(i5, i10)) / 2) - i4) / dpoVarI.b();
            }
        }
        i6 = dpoVarI.c;
        i7 = dpoVar.e;
        if (i6 >= i7) {
            fMax2 = 0.0f;
        } else {
            i8 = dpoVarI.e;
            i9 = dpoVar.c;
            if (i8 <= i9) {
                fMax2 = 1.0f;
            } else if (dpoVarI.a() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((java.lang.Math.max(i9, i6) + java.lang.Math.min(i7, i8)) / 2) - i6) / dpoVarI.a();
            }
        }
        this.a.b(new crg(mni.bj(fMax, fMax2)));
        this.g.a(dpoVar, dfd.i(j7, j2));
        return j7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.byj) {
            defpackage.byj byjVar = (defpackage.byj) obj;
            if (anty.ah(this.b, byjVar.b) && aooh.n(this.c, byjVar.c) && aooh.n(this.d, byjVar.d) && this.e == byjVar.e) {
                int i = byjVar.f;
                if (aooh.n(this.g, byjVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((anty.M(this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 961) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + defpackage.dpj.a(this.b) + ", density=" + this.c + ", dropdownMenuAnchorPosition=" + this.d + ", verticalMargin=" + this.e + ", horizontalMargin=0, onPositionCalculated=" + this.g + ')';
    }
}
