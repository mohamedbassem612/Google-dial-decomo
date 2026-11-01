package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ckw {
    public static long d;
    public static java.util.List f;
    public static java.util.List g;
    public static final defpackage.ckf h;
    private static final defpackage.civ l;
    public static final defpackage.aonj a = new defpackage.ckc(3);
    public static final defpackage.ajxw i = new defpackage.ajxw();
    public static final defpackage.ajxw j = new defpackage.ajxw();
    public static final defpackage.ajxw k = new defpackage.ajxw();
    public static final java.lang.Object b = new java.lang.Object();
    public static defpackage.ckv c = defpackage.ckv.a;
    public static final defpackage.ckt e = new defpackage.ckt();
    private static final defpackage.diu m = new defpackage.diu(null);

    static {
        d = 2L;
        defpackage.aokc aokcVar = defpackage.aokc.a;
        f = aokcVar;
        g = aokcVar;
        long j2 = d;
        d = 1 + j2;
        h = new defpackage.ckf(j2, defpackage.ckv.a);
        l = new defpackage.civ();
    }

    public static final defpackage.cko a(defpackage.cko ckoVar, defpackage.aonj aonjVar, boolean z) {
        boolean z2 = ckoVar instanceof defpackage.ckk;
        if (!z2 && ckoVar != null) {
            return new defpackage.clx(ckoVar, aonjVar, false, z);
        }
        defpackage.clw clwVar = !z ? (defpackage.clw) j.k() : null;
        if (clwVar != null) {
            clwVar.D(z2 ? (defpackage.ckk) ckoVar : null, aonjVar, false, z);
        } else {
            clwVar = new defpackage.clw(z2 ? (defpackage.ckk) ckoVar : null, aonjVar, null, false, z);
        }
        return clwVar;
    }

    public static final defpackage.cko b() {
        defpackage.cko ckoVar = (defpackage.cko) i.i();
        return ckoVar == null ? h : ckoVar;
    }

    public static final defpackage.cko c(defpackage.cko ckoVar) {
        if (ckoVar.r()) {
            return null;
        }
        defpackage.cly clyVar = (defpackage.cly) k.k();
        if (clyVar != null) {
            clyVar.a = ckoVar;
            clyVar.j = false;
        } else {
            clyVar = new defpackage.cly(ckoVar);
        }
        return clyVar;
    }

    public static final defpackage.ckv d(defpackage.ckv ckvVar, long j2, long j3) {
        while (defpackage.aooh.b(j2, j3) < 0) {
            ckvVar = ckvVar.d(j2);
            j2++;
        }
        return ckvVar;
    }

    public static final defpackage.clt e(defpackage.clt cltVar, defpackage.cko ckoVar) {
        defpackage.clt cltVarJ;
        defpackage.clt cltVarJ2 = j(cltVar, ckoVar.v(), ckoVar.x());
        if (cltVarJ2 != null) {
            return cltVarJ2;
        }
        synchronized (b) {
            cltVarJ = j(cltVar, ckoVar.v(), ckoVar.x());
        }
        if (cltVarJ != null) {
            return cltVarJ;
        }
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final defpackage.clt f(defpackage.clt cltVar, defpackage.clr clrVar) {
        defpackage.clt cltVarJ;
        defpackage.cko ckoVarB = b();
        defpackage.clt cltVarJ2 = j(cltVar, ckoVarB.v(), ckoVarB.x());
        if (cltVarJ2 != null) {
            return cltVarJ2;
        }
        synchronized (b) {
            defpackage.cko ckoVarB2 = b();
            defpackage.clt cltVarD = clrVar.d();
            if (cltVarD == null) {
                defpackage.aooh.h("null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.current");
            }
            cltVarJ = j(cltVarD, ckoVarB2.v(), ckoVarB2.x());
        }
        if (cltVarJ != null) {
            return cltVarJ;
        }
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final defpackage.clt g(defpackage.clt cltVar, defpackage.clr clrVar) {
        long jA = e.a(d) - 1;
        defpackage.ckv ckvVar = defpackage.ckv.a;
        defpackage.clt cltVar2 = null;
        defpackage.clt cltVar3 = null;
        for (defpackage.clt cltVarD = clrVar.d(); cltVarD != null; cltVarD = cltVarD.h) {
            long j2 = cltVarD.g;
            if (j2 != 0) {
                if (w(jA, j2, ckvVar)) {
                    if (cltVar3 == null) {
                        cltVar3 = cltVarD;
                    } else if (defpackage.aooh.b(cltVarD.g, cltVar3.g) >= 0) {
                        cltVar2 = cltVar3;
                        break;
                    }
                }
            }
            cltVar2 = cltVarD;
            break;
        }
        if (cltVar2 != null) {
            cltVar2.g = Long.MAX_VALUE;
            return cltVar2;
        }
        defpackage.clt cltVarB = cltVar.b(Long.MAX_VALUE);
        cltVarB.h = clrVar.d();
        clrVar.e(cltVarB);
        return cltVarB;
    }

    public static final defpackage.clt h(defpackage.clt cltVar, defpackage.clr clrVar, defpackage.cko ckoVar, defpackage.clt cltVar2) {
        defpackage.clt cltVarG;
        if (ckoVar.r()) {
            ckoVar.n(clrVar);
        }
        long jV = ckoVar.v();
        if (cltVar2.g == jV) {
            return cltVar2;
        }
        synchronized (b) {
            cltVarG = g(cltVar, clrVar);
        }
        cltVarG.g = jV;
        ckoVar.n(clrVar);
        return cltVarG;
    }

    public static final defpackage.clt i(defpackage.clt cltVar, defpackage.clr clrVar) {
        defpackage.clt cltVarJ;
        defpackage.cko ckoVarB = b();
        defpackage.aonj aonjVarI = ckoVarB.i();
        if (aonjVarI != null) {
            aonjVarI.a(clrVar);
        }
        defpackage.clt cltVarJ2 = j(cltVar, ckoVarB.v(), ckoVarB.x());
        if (cltVarJ2 != null) {
            return cltVarJ2;
        }
        synchronized (b) {
            defpackage.cko ckoVarB2 = b();
            defpackage.clt cltVarD = clrVar.d();
            if (cltVarD == null) {
                defpackage.aooh.h("null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            }
            cltVarJ = j(cltVarD, ckoVarB2.v(), ckoVarB2.x());
            if (cltVarJ == null) {
                throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return cltVarJ;
    }

    public static final defpackage.clt j(defpackage.clt cltVar, long j2, defpackage.ckv ckvVar) {
        defpackage.clt cltVar2 = null;
        while (cltVar != null) {
            if (w(j2, cltVar.g, ckvVar) && (cltVar2 == null || defpackage.aooh.b(cltVar2.g, cltVar.g) < 0)) {
                cltVar2 = cltVar;
            }
            cltVar = cltVar.h;
        }
        if (cltVar2 != null) {
            return cltVar2;
        }
        return null;
    }

    public static final defpackage.clt k(defpackage.clt cltVar, defpackage.clr clrVar, defpackage.cko ckoVar) {
        defpackage.clt cltVarG;
        defpackage.clt cltVarJ;
        if (ckoVar.r()) {
            ckoVar.n(clrVar);
        }
        long jV = ckoVar.v();
        defpackage.clt cltVarJ2 = j(cltVar, jV, ckoVar.x());
        if (cltVarJ2 == null) {
            synchronized (b) {
                defpackage.cko ckoVarB = b();
                defpackage.clt cltVarD = clrVar.d();
                if (cltVarD == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
                }
                cltVarJ = j(cltVarD, ckoVarB.v(), ckoVarB.x());
                if (cltVarJ == null) {
                    throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
            cltVarJ2 = cltVarJ;
        }
        if (cltVarJ2.g == ckoVar.v()) {
            return cltVarJ2;
        }
        synchronized (b) {
            defpackage.clt cltVarJ3 = j(clrVar.d(), jV, ckoVar.x());
            if (cltVarJ3 == null) {
                throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
            if (cltVarJ3.g != jV) {
                cltVarG = g(cltVarJ3, clrVar);
                cltVarG.c(cltVarJ3);
                cltVarG.g = ckoVar.v();
            } else {
                cltVarG = cltVarJ3;
            }
        }
        ckoVar.n(clrVar);
        return cltVarG;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[LOOP:1: B:27:0x0053->B:38:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x008d A[EDGE_INSN: B:55:0x008d->B:39:0x008d BREAK  A[LOOP:1: B:27:0x0053->B:38:0x008a], SYNTHETIC] */
    public static final java.lang.Object l(defpackage.aonj aonjVar) {
        defpackage.ady adyVar;
        java.lang.Object objM;
        int i2;
        defpackage.ckf ckfVar = h;
        synchronized (b) {
            adyVar = ckfVar.g;
            if (adyVar != null) {
                l.addAndGet(1);
            }
            objM = m(ckfVar, aonjVar);
        }
        if (adyVar != null) {
            try {
                java.util.List list = f;
                defpackage.cff cffVar = new defpackage.cff(adyVar);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((defpackage.aonn) list.get(i3)).a(cffVar, ckfVar);
                }
                l.addAndGet(-1);
            } catch (java.lang.Throwable th) {
                l.addAndGet(-1);
                throw th;
            }
        }
        synchronized (b) {
            q();
            if (adyVar != null) {
                java.lang.Object[] objArr = adyVar.b;
                long[] jArr = adyVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = ~(i4 - length);
                            int i6 = 0;
                            while (true) {
                                i2 = 8 - (i5 >>> 31);
                                if (i6 >= i2) {
                                    break;
                                }
                                if ((255 & j2) < 128) {
                                    s((defpackage.clr) objArr[(i4 << 3) + i6]);
                                }
                                j2 >>= 8;
                                i6++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i4 != length) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        return objM;
    }

    public static final java.lang.Object m(defpackage.ckf ckfVar, defpackage.aonj aonjVar) {
        java.lang.Object objA = aonjVar.a(c);
        long j2 = d;
        d = 1 + j2;
        ckfVar.i = j2;
        ckfVar.h = c;
        ckfVar.c = 0;
        ckfVar.g = null;
        ckfVar.z();
        return objA;
    }

    public static final java.util.Map n(long j2, defpackage.ckk ckkVar, defpackage.ckv ckvVar) {
        long[] jArr;
        long j3;
        defpackage.ckv ckvVar2;
        long[] jArr2;
        char c2;
        long j4;
        defpackage.clt cltVarJ;
        defpackage.ady adyVarS = ckkVar.s();
        if (adyVarS != null) {
            long jV = ckkVar.v();
            defpackage.ckv ckvVarC = ckkVar.x().d(jV).c(ckkVar.d);
            java.lang.Object[] objArr = adyVarS.b;
            long[] jArr3 = adyVarS.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                java.util.HashMap map = null;
                while (true) {
                    long j5 = jArr3[i2];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            int i5 = 8 - ((~i3) >>> 31);
                            if (i4 >= i5) {
                                jArr = jArr3;
                                j3 = jV;
                                ckvVar2 = ckvVarC;
                                if (i5 == 8) {
                                    break;
                                }
                                return map;
                            }
                            if ((j5 & 255) < 128) {
                                defpackage.clr clrVar = (defpackage.clr) objArr[(i2 << 3) + i4];
                                defpackage.clt cltVarD = clrVar.d();
                                jArr2 = jArr3;
                                c2 = '\b';
                                defpackage.clt cltVarJ2 = j(cltVarD, j2, ckvVar);
                                j4 = jV;
                                if (cltVarJ2 != null && (cltVarJ = j(cltVarD, j4, ckvVarC)) != null && !defpackage.aooh.n(cltVarJ2, cltVarJ)) {
                                    defpackage.clt cltVarJ3 = j(cltVarD, j4, ckkVar.x());
                                    if (cltVarJ3 == null) {
                                        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                    }
                                    defpackage.clt cltVarG = clrVar.g(cltVarJ, cltVarJ2, cltVarJ3);
                                    if (cltVarG != null) {
                                        if (map == null) {
                                            map = new java.util.HashMap();
                                        }
                                        map.put(cltVarJ2, cltVarG);
                                    }
                                }
                                j5 >>= c2;
                                i4++;
                                jV = j4;
                                ckvVarC = ckvVarC;
                                jArr3 = jArr2;
                            } else {
                                jArr2 = jArr3;
                                c2 = '\b';
                                j4 = jV;
                            }
                            j5 >>= c2;
                            i4++;
                            jV = j4;
                            ckvVarC = ckvVarC;
                            jArr3 = jArr2;
                        }
                    } else {
                        jArr = jArr3;
                        j3 = jV;
                        ckvVar2 = ckvVarC;
                    }
                    if (i2 == length) {
                        return map;
                    }
                    i2++;
                    jV = j3;
                    ckvVarC = ckvVar2;
                    jArr3 = jArr;
                }
            }
        }
        return null;
    }

    public static final defpackage.aonj o(defpackage.aonj aonjVar, defpackage.aonj aonjVar2, boolean z) {
        if (true != z) {
            aonjVar2 = null;
        }
        if (aonjVar == null || aonjVar2 == null || aonjVar == aonjVar2) {
            return aonjVar == null ? aonjVar2 : aonjVar;
        }
        return new defpackage.bet(aonjVar, aonjVar2, 4);
    }

    public static final defpackage.aonj p(defpackage.aonj aonjVar, defpackage.aonj aonjVar2) {
        if (aonjVar == null || aonjVar2 == null || aonjVar == aonjVar2) {
            return aonjVar == null ? aonjVar2 : aonjVar;
        }
        return new defpackage.bet(aonjVar, aonjVar2, 5);
    }

    public static final void q() {
        defpackage.diu diuVar = m;
        int i2 = diuVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            defpackage.cjk cjkVar = ((defpackage.cjk[]) diuVar.c)[i3];
            java.lang.Object obj = cjkVar != null ? cjkVar.get() : null;
            if (obj != null && v((defpackage.clr) obj)) {
                if (i4 != i3) {
                    ((defpackage.cjk[]) diuVar.c)[i4] = cjkVar;
                    int[] iArr = (int[]) diuVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((defpackage.cjk[]) diuVar.c)[i5] = null;
            ((int[]) diuVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            diuVar.a = i4;
        }
    }

    public static final void r(defpackage.cko ckoVar, defpackage.clr clrVar) {
        ckoVar.q(ckoVar.h() + 1);
        defpackage.aonj aonjVarK = ckoVar.k();
        if (aonjVarK != null) {
            aonjVarK.a(clrVar);
        }
    }

    public static final void s(defpackage.clr clrVar) {
        if (v(clrVar)) {
            defpackage.diu diuVar = m;
            int i2 = diuVar.a;
            int iIdentityHashCode = java.lang.System.identityHashCode(clrVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = diuVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) diuVar.b)[i6];
                        if (i7 >= iIdentityHashCode) {
                            if (i7 <= iIdentityHashCode) {
                                defpackage.cjk cjkVar = ((defpackage.cjk[]) diuVar.c)[i6];
                                if (clrVar == (cjkVar != null ? cjkVar.get() : null)) {
                                    i3 = i6;
                                    break;
                                }
                                i3 = i6 - 1;
                                while (true) {
                                    if (i3 >= 0 && ((int[]) diuVar.b)[i3] == iIdentityHashCode) {
                                        defpackage.cjk cjkVar2 = ((defpackage.cjk[]) diuVar.c)[i3];
                                        if ((cjkVar2 != null ? cjkVar2.get() : null) == clrVar) {
                                            break;
                                        } else {
                                            i3--;
                                        }
                                    } else {
                                        i6++;
                                        int i8 = diuVar.a;
                                        while (true) {
                                            if (i6 >= i8) {
                                                i5 = diuVar.a;
                                            } else if (((int[]) diuVar.b)[i6] == iIdentityHashCode) {
                                                defpackage.cjk cjkVar3 = ((defpackage.cjk[]) diuVar.c)[i6];
                                                if ((cjkVar3 != null ? cjkVar3.get() : null) == clrVar) {
                                                    i3 = i6;
                                                    break;
                                                }
                                                i6++;
                                            } else {
                                                i3 = -(i6 + 1);
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = i6 - 1;
                            }
                        } else {
                            i5 = i6 + 1;
                        }
                    }
                    i3 = -(i5 + 1);
                    break;
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            java.lang.Object obj = diuVar.c;
            int length = ((defpackage.cjk[]) obj).length;
            if (i2 == length) {
                int i11 = length << 1;
                defpackage.cjk[] cjkVarArr = new defpackage.cjk[i11];
                int[] iArr = new int[i11];
                java.lang.System.arraycopy(obj, i9, cjkVarArr, i10, i2 - i9);
                java.lang.System.arraycopy(diuVar.c, 0, cjkVarArr, 0, i9);
                defpackage.ajsz.db((int[]) diuVar.b, iArr, i10, i9, i2);
                defpackage.ajsz.df((int[]) diuVar.b, iArr, 0, i9, 6);
                diuVar.c = cjkVarArr;
                diuVar.b = iArr;
            } else {
                java.lang.System.arraycopy(obj, i9, obj, i10, i2 - i9);
                int[] iArr2 = (int[]) diuVar.b;
                defpackage.ajsz.db(iArr2, iArr2, i10, i9, i2);
            }
            ((defpackage.cjk[]) diuVar.c)[i9] = new defpackage.cjk(clrVar);
            ((int[]) diuVar.b)[i9] = iIdentityHashCode;
            diuVar.a++;
        }
    }

    public static final void t(defpackage.cko ckoVar) {
        java.lang.Long lValueOf;
        if (c.e(ckoVar.v())) {
            return;
        }
        long jV = ckoVar.v();
        boolean z = ckoVar.j;
        defpackage.ckk ckkVar = ckoVar instanceof defpackage.ckk ? (defpackage.ckk) ckoVar : null;
        java.lang.Object objValueOf = ckkVar != null ? java.lang.Boolean.valueOf(ckkVar.f) : "read-only";
        synchronized (b) {
            lValueOf = java.lang.Long.valueOf(e.a(-1L));
        }
        throw new java.lang.IllegalStateException("Snapshot is not open: snapshotId=" + jV + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf);
    }

    public static final void u() {
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean v(defpackage.clr clrVar) {
        defpackage.clt cltVar;
        long jA = e.a(d);
        defpackage.clt cltVar2 = null;
        int i2 = 0;
        defpackage.clt cltVarD = null;
        for (defpackage.clt cltVarD2 = clrVar.d(); cltVarD2 != null; cltVarD2 = cltVarD2.h) {
            long j2 = cltVarD2.g;
            if (j2 != 0) {
                if (defpackage.aooh.b(j2, jA) >= 0) {
                    i2++;
                } else if (cltVar2 == null) {
                    i2++;
                    cltVar2 = cltVarD2;
                } else {
                    if (defpackage.aooh.b(j2, cltVar2.g) < 0) {
                        cltVar = cltVarD2;
                    } else {
                        cltVar = cltVar2;
                        cltVar2 = cltVarD2;
                    }
                    if (cltVarD == null) {
                        cltVarD = clrVar.d();
                        defpackage.clt cltVar3 = cltVarD;
                        while (true) {
                            if (cltVarD == null) {
                                cltVarD = cltVar3;
                                break;
                            }
                            long j3 = cltVarD.g;
                            if (defpackage.aooh.b(j3, jA) >= 0) {
                                break;
                            }
                            if (defpackage.aooh.b(cltVar3.g, j3) < 0) {
                                cltVar3 = cltVarD;
                            }
                            cltVarD = cltVarD.h;
                        }
                    }
                    cltVar.g = 0L;
                    cltVar.c(cltVarD);
                }
            }
        }
        return i2 > 1;
    }

    private static final boolean w(long j2, long j3, defpackage.ckv ckvVar) {
        return (j3 == 0 || defpackage.aooh.b(j3, j2) > 0 || ckvVar.e(j3)) ? false : true;
    }
}
