package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ckv implements java.lang.Iterable, defpackage.aoow {
    public static final defpackage.ckv a = new defpackage.ckv(0, 0, 0, null);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    private ckv(long j, long j2, long j3, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r5 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ckv a(defpackage.ckv r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            ckv r2 = defpackage.ckv.a
            if (r1 == r2) goto L93
            if (r0 == r2) goto L2e
            long r3 = r1.d
            long r10 = r0.d
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L47
            long[] r5 = r1.e
            long[] r8 = r0.e
            if (r5 != r8) goto L47
            long r3 = r0.b
            long r12 = r1.b
            long r12 = ~r12
            long r14 = r0.c
            r16 = 0
            long r6 = r1.c
            long r5 = ~r6
            long r12 = r12 & r3
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            long r5 = r5 & r14
            if (r1 != 0) goto L30
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r1 != 0) goto L32
        L2e:
            r0 = r2
            goto L93
        L30:
            r16 = r12
        L32:
            int r1 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 != 0) goto L3c
            if (r8 == 0) goto L93
        L3c:
            r8 = r5
            ckv r5 = new ckv
            r12 = 0
            r6 = r16
            r5.<init>(r6, r8, r10, r12)
            r0 = r5
            goto L93
        L47:
            r16 = 0
            long[] r2 = r1.e
            r5 = 0
            if (r2 == 0) goto L5b
            r6 = r5
        L4f:
            int r7 = r2.length
            if (r6 >= r7) goto L5b
            r7 = r2[r6]
            ckv r0 = r0.b(r7)
            int r6 = r6 + 1
            goto L4f
        L5b:
            long r6 = r1.c
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r8 = 1
            r10 = 64
            if (r2 == 0) goto L78
            r2 = r5
        L66:
            if (r2 >= r10) goto L78
            long r11 = r8 << r2
            long r11 = r11 & r6
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L75
            long r11 = (long) r2
            long r11 = r11 + r3
            ckv r0 = r0.b(r11)
        L75:
            int r2 = r2 + 1
            goto L66
        L78:
            long r1 = r1.b
            int r6 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r6 == 0) goto L93
        L7e:
            if (r5 >= r10) goto L93
            long r6 = r8 << r5
            long r6 = r6 & r1
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 == 0) goto L90
            long r6 = (long) r5
            long r6 = r6 + r3
            r11 = 64
            long r6 = r6 + r11
            ckv r0 = r0.b(r6)
        L90:
            int r5 = r5 + 1
            goto L7e
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckv.a(ckv):ckv");
    }

    public final defpackage.ckv b(long j) {
        long[] jArr;
        int iP;
        long[] jArr2;
        long j2;
        defpackage.ckv ckvVar;
        long j3;
        long j4;
        long j5;
        long j6 = this.d;
        long j7 = j - j6;
        if (defpackage.aooh.b(j7, 0L) >= 0 && defpackage.aooh.b(j7, 64L) < 0) {
            long j8 = 1 << ((int) j7);
            long j9 = this.c;
            if ((j9 & j8) == 0) {
                return this;
            }
            long j10 = ~j8;
            long j11 = this.b;
            long j12 = j9 & j10;
            if (j11 != 0) {
                j4 = j12;
                j5 = j11;
            } else {
                if (j12 == 0) {
                    if (this.e != null) {
                        j5 = 0;
                        j4 = 0;
                    }
                    return a;
                }
                j5 = 0;
                j4 = j12;
            }
            ckvVar = new defpackage.ckv(j5, j4, j6, this.e);
            return ckvVar;
        }
        if (defpackage.aooh.b(j7, 64L) >= 0 && defpackage.aooh.b(j7, 128L) < 0) {
            long j13 = 1 << (((int) j7) - 64);
            long j14 = this.b;
            if ((j14 & j13) == 0) {
                return this;
            }
            long j15 = j14 & (~j13);
            if (j15 == 0) {
                if (this.c != 0 || this.e != null) {
                    j3 = 0;
                }
                return a;
            }
            j3 = j15;
            ckvVar = new defpackage.ckv(j3, this.c, j6, this.e);
            return ckvVar;
        }
        if (defpackage.aooh.b(j7, 0L) >= 0 || (jArr = this.e) == null || (iP = defpackage.cfo.p(jArr, j)) < 0) {
            return this;
        }
        int length = jArr.length;
        int i = length - 1;
        if (i == 0) {
            jArr2 = null;
        } else {
            long[] jArr3 = new long[i];
            if (iP > 0) {
                defpackage.ajsz.dc(jArr, jArr3, 0, 0, iP);
            }
            if (iP < i) {
                defpackage.ajsz.dc(jArr, jArr3, iP, iP + 1, length);
            }
            jArr2 = jArr3;
        }
        long j16 = this.b;
        if (j16 == 0) {
            if (this.c != 0 || jArr2 != null) {
                j2 = 0;
            }
            return a;
        }
        j2 = j16;
        ckvVar = new defpackage.ckv(j2, this.c, j6, jArr2);
        return ckvVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[ADDED_TO_REGION, LOOP:1: B:31:0x006a->B:35:0x007a, LOOP_START, PHI: r1 r12
      0x006a: PHI (r1v5 ckv) = (r1v4 ckv), (r1v6 ckv) binds: [B:30:0x0068, B:35:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r12v3 int) = (r12v0 int), (r12v4 int) binds: [B:30:0x0068, B:35:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089 A[LOOP:2: B:40:0x0086->B:42:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1 A[ADDED_TO_REGION, LOOP:4: B:53:0x00b1->B:57:0x00c1, LOOP_START, PHI: r0 r12
      0x00b1: PHI (r0v4 ckv) = (r0v3 ckv), (r0v5 ckv) binds: [B:52:0x00af, B:57:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:52:0x00af, B:57:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public final defpackage.ckv c(defpackage.ckv ckvVar) {
        int i;
        long[] jArr;
        long j;
        long j2;
        int i2;
        int i3;
        long j3;
        long j4;
        int i4;
        defpackage.ckv ckvVarD = this;
        defpackage.ckv ckvVarD2 = ckvVar;
        defpackage.ckv ckvVar2 = a;
        if (ckvVarD2 == ckvVar2) {
            return ckvVarD;
        }
        if (ckvVarD != ckvVar2) {
            long j5 = ckvVarD2.d;
            long j6 = ckvVarD.d;
            if (j5 == j6) {
                long[] jArr2 = ckvVarD2.e;
                long[] jArr3 = ckvVarD.e;
                if (jArr2 == jArr3) {
                    long j7 = ckvVarD.b;
                    long j8 = ckvVarD2.b;
                    long j9 = j7 | j8;
                    long j10 = ckvVarD.c;
                    long j11 = ckvVarD2.c;
                    long j12 = j10 | j11;
                    if (j9 == j7 && j12 == j10) {
                        return ckvVarD;
                    }
                    if (j9 != j8 || j12 != j11) {
                        return new defpackage.ckv(j9, j12, j6, jArr3);
                    }
                } else {
                    i = 0;
                    if (ckvVarD.e == null) {
                        jArr = ckvVarD2.e;
                        if (jArr != null) {
                            for (long j13 : jArr) {
                                ckvVarD = ckvVarD.d(j13);
                            }
                        }
                        j = ckvVarD2.c;
                        if (j != 0) {
                            for (i2 = 0; i2 < 64; i2++) {
                                if (((1 << i2) & j) != 0) {
                                    ckvVarD = ckvVarD.d(((long) i2) + j5);
                                }
                            }
                        }
                        j2 = ckvVarD2.b;
                        if (j2 != 0) {
                            return ckvVarD;
                        }
                        while (i < 64) {
                            if (((1 << i) & j2) != 0) {
                                ckvVarD = ckvVarD.d(((long) i) + j5 + 64);
                            }
                            i++;
                        }
                        return ckvVarD;
                    }
                    j3 = ckvVarD.c;
                    if (j3 != 0) {
                        for (i4 = 0; i4 < 64; i4++) {
                            if (((1 << i4) & j3) != 0) {
                                ckvVarD2 = ckvVarD2.d(((long) i4) + j6);
                            }
                        }
                    }
                    j4 = ckvVarD.b;
                    if (j4 != 0) {
                        while (i < 64) {
                            if (((1 << i) & j4) != 0) {
                                ckvVarD2 = ckvVarD2.d(((long) i) + j6 + 64);
                            }
                            i++;
                        }
                    }
                }
            } else {
                i = 0;
                if (ckvVarD.e == null) {
                    jArr = ckvVarD2.e;
                    if (jArr != null) {
                        while (i3 < jArr.length) {
                            ckvVarD = ckvVarD.d(j13);
                        }
                    }
                    j = ckvVarD2.c;
                    if (j != 0) {
                        while (i2 < 64) {
                            if (((1 << i2) & j) != 0) {
                                ckvVarD = ckvVarD.d(((long) i2) + j5);
                            }
                        }
                    }
                    j2 = ckvVarD2.b;
                    if (j2 != 0) {
                        return ckvVarD;
                    }
                    while (i < 64) {
                        if (((1 << i) & j2) != 0) {
                            ckvVarD = ckvVarD.d(((long) i) + j5 + 64);
                        }
                        i++;
                    }
                    return ckvVarD;
                }
                j3 = ckvVarD.c;
                if (j3 != 0) {
                    while (i4 < 64) {
                        if (((1 << i4) & j3) != 0) {
                            ckvVarD2 = ckvVarD2.d(((long) i4) + j6);
                        }
                    }
                }
                j4 = ckvVarD.b;
                if (j4 != 0) {
                    while (i < 64) {
                        if (((1 << i) & j4) != 0) {
                            ckvVarD2 = ckvVarD2.d(((long) i) + j6 + 64);
                        }
                        i++;
                    }
                }
            }
        }
        return ckvVarD2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    public final defpackage.ckv d(long j) {
        long j2;
        int i;
        long j3;
        long[] jArr;
        long j4 = this.d;
        long j5 = j - j4;
        long j6 = 1;
        if (defpackage.aooh.b(j5, 0L) >= 0 && defpackage.aooh.b(j5, 64L) < 0) {
            long j7 = 1 << ((int) j5);
            long j8 = this.c;
            return (j8 & j7) == 0 ? new defpackage.ckv(this.b, j8 | j7, j4, this.e) : this;
        }
        if (defpackage.aooh.b(j5, 64L) >= 0 && defpackage.aooh.b(j5, 128L) < 0) {
            long j9 = 1 << (((int) j5) - 64);
            long j10 = this.b;
            return (j10 & j9) == 0 ? new defpackage.ckv(j10 | j9, this.c, j4, this.e) : this;
        }
        if (defpackage.aooh.b(j5, 128L) < 0) {
            long[] jArr2 = this.e;
            if (jArr2 == null) {
                return new defpackage.ckv(this.b, this.c, j4, new long[]{j});
            }
            int iP = defpackage.cfo.p(jArr2, j);
            if (iP >= 0) {
                return this;
            }
            int length = jArr2.length;
            long[] jArr3 = new long[length + 1];
            int i2 = -(iP + 1);
            defpackage.ajsz.dc(jArr2, jArr3, 0, 0, i2);
            defpackage.ajsz.dc(jArr2, jArr3, i2 + 1, i2, length);
            jArr3[i2] = j;
            return new defpackage.ckv(this.b, this.c, j4, jArr3);
        }
        long j11 = this.b;
        if (j11 != 0) {
            j2 = 0;
        } else {
            if (this.c == 0 && this.e == null) {
                long j12 = (j / 64) << 6;
                return new defpackage.ckv(0L, 1 << ((int) (j - j12)), j12, null);
            }
            j11 = 0;
            j2 = 0;
        }
        long j13 = this.c;
        long j14 = j / 64;
        char c = 6;
        long j15 = (j14 - 1) << 6;
        ni niVar = null;
        while (true) {
            char c2 = c;
            if (defpackage.aooh.b(j4, j15) >= 0) {
                j6 = j6;
                i = 0;
                j3 = j4;
                break;
            }
            if (j13 != j2) {
                ni niVar2 = niVar == null ? new ni(this.e) : niVar;
                int i3 = 0;
                while (i3 < 64) {
                    long j16 = j4;
                    if ((j13 & (j6 << i3)) != j2) {
                        ((defpackage.acw) niVar2.a).b(j16 + ((long) i3));
                    }
                    i3++;
                    j4 = j16;
                }
                niVar = niVar2;
            } else {
                j6 = j6;
            }
            long j17 = j4;
            i = 0;
            if (j11 == j2) {
                j3 = j14 << c2;
                j13 = j2;
                break;
            }
            j4 = j17 + 64;
            j13 = j11;
            j11 = j2;
            c = c2;
            j6 = j6;
        }
        ni niVar3 = niVar;
        int i4 = (int) (j - j3);
        if (i4 < 64) {
            j13 |= j6 << i4;
        } else {
            j11 |= j6 << (i4 - 64);
        }
        long j18 = j11;
        if (niVar3 == null) {
            jArr = this.e;
        } else {
            defpackage.acw acwVar = (defpackage.acw) niVar3.a;
            int i5 = acwVar.b;
            if (i5 == 0) {
                jArr = null;
            } else {
                jArr = new long[i5];
                long[] jArr4 = acwVar.a;
                for (int i6 = i; i6 < i5; i6++) {
                    jArr[i6] = jArr4[i6];
                }
            }
            if (jArr == null) {
                jArr = this.e;
            }
        }
        return new defpackage.ckv(j18, j13, j3, jArr);
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.d;
        if (defpackage.aooh.b(j2, 0L) < 0 || defpackage.aooh.b(j2, 64L) >= 0) {
            if (defpackage.aooh.b(j2, 64L) < 0 || defpackage.aooh.b(j2, 128L) >= 0) {
                if (defpackage.aooh.b(j2, 0L) > 0 || (jArr = this.e) == null || defpackage.cfo.p(jArr, j) < 0) {
                    return false;
                }
            } else if (((1 << (((int) j2) - 64)) & this.b) == 0) {
                return false;
            }
        } else if (((1 << ((int) j2)) & this.c) == 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new aoka(new cku(this, (defpackage.aoln) null), 3).a();
    }

    public final java.lang.String toString() throws java.io.IOException {
        java.lang.String string = super.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (obj == null || (obj instanceof java.lang.CharSequence)) {
                sb.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb.append(((java.lang.Character) obj).charValue());
            } else {
                sb.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb.append((java.lang.CharSequence) "");
        return string + " [" + sb.toString() + ']';
    }
}
