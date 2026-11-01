package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbj extends defpackage.clt {
    public static final java.lang.Object a = new java.lang.Object();
    public long b;
    public int c;
    public defpackage.ado d;
    public java.lang.Object e;
    public int f;

    public cbj(long j) {
        super(j);
        defpackage.ado adoVar = defpackage.adp.a;
        if (adoVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        }
        this.d = adoVar;
        this.e = a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[PHI: r13
      0x00d4: PHI (r13v1 int) = (r13v0 int), (r13v2 int) binds: [B:31:0x00a7, B:39:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7 A[Catch: all -> 0x0150, LOOP:3: B:30:0x009a->B:43:0x00d7, LOOP_END, TryCatch #0 {all -> 0x0150, blocks: (B:13:0x002a, B:16:0x0037, B:18:0x0047, B:19:0x004c, B:21:0x0055, B:23:0x005f, B:25:0x0071, B:27:0x0075, B:30:0x009a, B:32:0x00a9, B:34:0x00b3, B:36:0x00b9, B:37:0x00c9, B:47:0x00f3, B:51:0x0111, B:43:0x00d7, B:46:0x00e5, B:57:0x0130, B:59:0x013d), top: B:72:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2 A[EDGE_INSN: B:81:0x00e2->B:45:0x00e2 BREAK  A[LOOP:3: B:30:0x009a->B:43:0x00d7], SYNTHETIC] */
    public final int a(defpackage.cbk cbkVar, defpackage.cko ckoVar) {
        defpackage.ado adoVar;
        int i;
        int i2;
        long[] jArr;
        int i3;
        java.lang.Object[] objArr;
        int[] iArr;
        int i4;
        long[] jArr2;
        int[] iArr2;
        long j;
        defpackage.clt cltVarE;
        synchronized (defpackage.ckw.b) {
            adoVar = this.d;
        }
        int i5 = 7;
        if (adoVar.d()) {
            defpackage.cfc cfcVarA = defpackage.ckh.a();
            java.lang.Object[] objArr2 = cfcVarA.a;
            int i6 = cfcVarA.b;
            for (int i7 = 0; i7 < i6; i7++) {
                ((defpackage.ckj) objArr2[i7]).b(cbkVar);
            }
            defpackage.cki ckiVar = defpackage.cki.a;
            try {
                java.lang.Object[] objArr3 = adoVar.b;
                int[] iArr3 = adoVar.c;
                long[] jArr3 = adoVar.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i8 = 7;
                    int i9 = 0;
                    while (true) {
                        long j2 = jArr3[i9];
                        if ((((~j2) << i5) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = i9 - length;
                            i3 = i5;
                            int i11 = 0;
                            while (true) {
                                i4 = 8 - ((~i10) >>> 31);
                                if (i11 >= i4) {
                                    break;
                                }
                                if ((j2 & 255) < 128) {
                                    int i12 = (i9 << 3) + i11;
                                    int i13 = 8;
                                    defpackage.clr clrVar = (defpackage.clr) objArr3[i12];
                                    jArr2 = jArr3;
                                    if (iArr3[i12] == 1) {
                                        if (clrVar instanceof defpackage.cbk) {
                                            defpackage.cbk cbkVar2 = (defpackage.cbk) clrVar;
                                            defpackage.cbj cbjVarC = cbkVar2.c((defpackage.cbj) defpackage.ckw.e(cbkVar2.b, ckoVar), ckoVar, false, cbkVar2.a);
                                            defpackage.ado adoVar2 = cbjVarC.d;
                                            java.lang.Object[] objArr4 = adoVar2.b;
                                            long[] jArr4 = adoVar2.a;
                                            int length2 = jArr4.length - 2;
                                            if (length2 >= 0) {
                                                iArr2 = iArr3;
                                                int i14 = 0;
                                                while (true) {
                                                    long j3 = jArr4[i14];
                                                    j = j2;
                                                    int iIdentityHashCode = i8;
                                                    if ((((~j3) << i3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                        for (int i16 = 0; i16 < i15; i16++) {
                                                            if ((j3 & 255) < 128) {
                                                                iIdentityHashCode = (iIdentityHashCode * 31) + java.lang.System.identityHashCode((defpackage.clr) objArr4[(i14 << 3) + i16]);
                                                            }
                                                            j3 >>= i13;
                                                        }
                                                        if (i15 != i13) {
                                                            i8 = iIdentityHashCode;
                                                            break;
                                                        }
                                                        i8 = iIdentityHashCode;
                                                        if (i14 != length2) {
                                                            break;
                                                        }
                                                        i14++;
                                                        j2 = j;
                                                        i13 = 8;
                                                    } else {
                                                        i8 = iIdentityHashCode;
                                                        if (i14 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i14++;
                                                        j2 = j;
                                                        i13 = 8;
                                                    }
                                                }
                                            } else {
                                                iArr2 = iArr3;
                                                j = j2;
                                            }
                                            cltVarE = cbjVarC;
                                        } else {
                                            iArr2 = iArr3;
                                            j = j2;
                                            cltVarE = defpackage.ckw.e(clrVar.d(), ckoVar);
                                        }
                                        int iIdentityHashCode2 = ((i8 * 31) + java.lang.System.identityHashCode(cltVarE)) * 31;
                                        long j4 = cltVarE.g;
                                        i8 = iIdentityHashCode2 + ((int) (j4 ^ (j4 >>> 32)));
                                    }
                                    j2 = j >> 8;
                                    i11++;
                                    jArr3 = jArr2;
                                    objArr3 = objArr3;
                                    iArr3 = iArr2;
                                } else {
                                    jArr2 = jArr3;
                                }
                                objArr3 = objArr3;
                                iArr2 = iArr3;
                                j = j2;
                                j2 = j >> 8;
                                i11++;
                                jArr3 = jArr2;
                                objArr3 = objArr3;
                                iArr3 = iArr2;
                            }
                            jArr = jArr3;
                            objArr = objArr3;
                            iArr = iArr3;
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i3 = i5;
                            objArr = objArr3;
                            iArr = iArr3;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        i5 = i3;
                        jArr3 = jArr;
                        objArr3 = objArr;
                        iArr3 = iArr;
                    }
                    i5 = i8;
                }
                defpackage.aojh aojhVar = defpackage.aojh.a;
                java.lang.Object[] objArr5 = cfcVarA.a;
                i = cfcVarA.b;
                for (int i17 = 0; i2 < i; i2++) {
                    ((defpackage.ckj) objArr5[i2]).a(cbkVar, aojhVar);
                }
            } finally {
                java.lang.Object[] objArr6 = cfcVarA.a;
                i = cfcVarA.b;
                for (i2 = 0; i2 < i; i2++) {
                    ((defpackage.ckj) objArr6[i2]).a(cbkVar, ckiVar);
                }
            }
        }
        return i5;
    }

    @Override // defpackage.clt
    public final defpackage.clt b(long j) {
        return new defpackage.cbj(j);
    }

    @Override // defpackage.clt
    public final void c(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        }
        defpackage.cbj cbjVar = (defpackage.cbj) cltVar;
        this.d = cbjVar.d;
        this.e = cbjVar.e;
        this.f = cbjVar.f;
    }

    public final boolean d(defpackage.cbk cbkVar, defpackage.cko ckoVar) {
        boolean z;
        boolean z2;
        synchronized (defpackage.ckw.b) {
            z = false;
            z2 = (this.b == ckoVar.v() && this.c == ckoVar.h()) ? false : true;
        }
        if (this.e != a && (!z2 || this.f == a(cbkVar, ckoVar))) {
            z = true;
        }
        if (z && z2) {
            synchronized (defpackage.ckw.b) {
                this.b = ckoVar.v();
                this.c = ckoVar.h();
            }
        }
        return z;
    }
}
