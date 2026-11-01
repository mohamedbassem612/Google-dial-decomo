package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bai {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException("All weights <= 0 should have placeables");
    }

    public static final void c(defpackage.bbk bbkVar, cmw cmwVar, final defpackage.bcl bclVar, ayy ayyVar, awh awhVar, awa awaVar, ars arsVar, boolean z, amn amnVar, bdn bdnVar, aonj aonjVar, cav cavVar, int i, int i2) {
        int i3;
        awh awhVar2;
        ars arsVar2;
        boolean z2;
        amn amnVar2;
        bdn bdnVar2;
        bdn bdnVar3;
        amn amnVar3;
        boolean z3;
        int i4 = i & 6;
        cbt cbtVarB = cavVar.b(-1784484862);
        if (i4 == 0) {
            i3 = (true != cbtVarB.B(bbkVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cbtVarB.B(bclVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cbtVarB.B(ayyVar) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if ((i & 196608) == 0) {
            awhVar2 = awhVar;
            i5 |= true != cbtVarB.B(awhVar2) ? 65536 : 131072;
        } else {
            awhVar2 = awhVar;
        }
        if ((1572864 & i) == 0) {
            i5 |= true != cbtVarB.B(awaVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = i5 | 100663296;
        if ((805306368 & i) == 0) {
            i6 = i5 | 369098752;
        }
        int i7 = i6;
        int i8 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            i8 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if (cbtVarB.H(((306783379 & i7) == 306783378 && (i8 & 19) == 18) ? false : true, i7 & 1)) {
            int i9 = i8 & (-15);
            int i10 = i7 >> 18;
            int i11 = (-1908408321) & i7;
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                ars arsVarBf = den.bf(cbtVarB);
                amn amnVarA = aoj.a(cbtVarB);
                int i12 = ((i11 >> 6) & 14) | 48;
                arsVar = arsVarBf;
                boolean z4 = (((i12 & 14) ^ 6) > 4 && cbtVarB.B(bclVar)) || (i12 & 6) == 4;
                java.lang.Object objR = cbtVar.R();
                if (z4 || objR == cau.a) {
                    objR = new bcy(new bde() { // from class: bbq
                        public final int a() {
                            return wi.d(bclVar.i());
                        }
                    });
                    cbtVar.ab(objR);
                }
                bdnVar3 = (bcy) objR;
                amnVar3 = amnVarA;
                z3 = true;
            } else {
                cbtVarB.s();
                amnVar3 = amnVar;
                bdnVar3 = bdnVar;
                z3 = z;
            }
            ars arsVar3 = arsVar;
            cbtVarB.l();
            int i13 = (i7 & 14) | ((i11 >> 15) & 112);
            boolean z5 = ((((i13 & 14) ^ 6) > 4 && cbtVarB.B(bbkVar)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) > 32 && cbtVarB.B(awaVar)) || (i13 & 48) == 32);
            java.lang.Object objR2 = cbtVar.R();
            if (z5 || objR2 == cau.a) {
                objR2 = new defpackage.bbm(new axo(awaVar, 2));
                cbtVar.ab(objR2);
            }
            int i14 = i11 >> 3;
            int i15 = ((i9 << 3) & 896) | (i10 & 14);
            defpackage.bbm bbmVar = (defpackage.bbm) objR2;
            awh awhVar3 = awhVar2;
            vn.c(cmwVar, bclVar, bbmVar, ayyVar, arsVar3, z3, amnVar3, awhVar3, awaVar, bdnVar3, aonjVar, cbtVarB, (i14 & 14) | 196608 | (i14 & 112) | (i7 & 7168) | (i7 & 57344) | (i14 & 29360128) | ((i11 << 12) & 1879048192), i15);
            amnVar2 = amnVar3;
            bdnVar2 = bdnVar3;
            z2 = z3;
            arsVar2 = arsVar3;
        } else {
            cbtVarB.s();
            arsVar2 = arsVar;
            z2 = z;
            amnVar2 = amnVar;
            bdnVar2 = bdnVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bby(bbkVar, cmwVar, bclVar, ayyVar, awhVar, awaVar, arsVar2, z2, amnVar2, bdnVar2, aonjVar, i, i2, 1);
        }
    }

    public static final boolean d(dgk dgkVar, defpackage.cvm cvmVar, defpackage.cvm cvmVar2) {
        return cpm.a(mni.aM(cvmVar.c, cvmVar2.c)) < defpackage.ro.g(dgkVar, cvmVar.i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[LOOP:0: B:18:0x0049->B:21:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:17:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(cwc r7, aoln r8) {
        /*
            boolean r0 = r8 instanceof defpackage.bkw
            if (r0 == 0) goto L13
            r0 = r8
            bkw r0 = (defpackage.bkw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bkw r0 = new bkw
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            aolu r1 = aolu.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cwc r7 = r0.c
            aooc.af(r8)
            goto L40
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            aooc.af(r8)
        L34:
            cvg r8 = defpackage.cvg.b
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 == r1) goto L5b
        L40:
            cvf r8 = (cvf) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5a
            java.lang.Object r6 = r2.get(r5)
            cvm r6 = (defpackage.cvm) r6
            boolean r6 = uu.q(r6)
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L49
        L5a:
            r1 = r8
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bai.e(cwc, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:13:0x002a, B:29:0x0091, B:31:0x0099, B:33:0x00a6, B:35:0x00b2, B:36:0x00b5, B:37:0x00b8, B:38:0x00bc, B:18:0x003c, B:23:0x0061, B:25:0x0065, B:27:0x006f, B:21:0x0046), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6 A[Catch: CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:13:0x002a, B:29:0x0091, B:31:0x0099, B:33:0x00a6, B:35:0x00b2, B:36:0x00b5, B:37:0x00b8, B:38:0x00bc, B:18:0x003c, B:23:0x0061, B:25:0x0065, B:27:0x006f, B:21:0x0046), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[Catch: CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:13:0x002a, B:29:0x0091, B:31:0x0099, B:33:0x00a6, B:35:0x00b2, B:36:0x00b5, B:37:0x00b8, B:38:0x00bc, B:18:0x003c, B:23:0x0061, B:25:0x0065, B:27:0x006f, B:21:0x0046), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: CancellationException -> 0x00c2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:13:0x002a, B:29:0x0091, B:31:0x0099, B:33:0x00a6, B:35:0x00b2, B:36:0x00b5, B:37:0x00b8, B:38:0x00bc, B:18:0x003c, B:23:0x0061, B:25:0x0065, B:27:0x006f, B:21:0x0046), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object f(cwc cwcVar, defpackage.bgw bgwVar, cvf cvfVar, aoln aolnVar) {
        defpackage.bkz bkzVar;
        defpackage.cvm cvmVar;
        java.util.List list;
        int size;
        int i;
        defpackage.cvm cvmVar2;
        if (aolnVar instanceof defpackage.bkz) {
            bkzVar = (defpackage.bkz) aolnVar;
            int i2 = bkzVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bkzVar.b = i2 - Integer.MIN_VALUE;
            } else {
                bkzVar = new defpackage.bkz(aolnVar);
            }
        } else {
            bkzVar = new defpackage.bkz(aolnVar);
        }
        java.lang.Object objK = bkzVar.a;
        aolu aoluVar = aolu.a;
        int i3 = bkzVar.b;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    defpackage.cvm cvmVar3 = bkzVar.d;
                    bgwVar = bkzVar.e;
                    cwc cwcVar2 = bkzVar.c;
                    aooc.af(objK);
                    cvmVar = cvmVar3;
                    cwcVar = cwcVar2;
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bgwVar = bkzVar.e;
                    cwcVar = bkzVar.c;
                    aooc.af(objK);
                }
                if (((java.lang.Boolean) objK).booleanValue()) {
                    list = cwcVar.p().a;
                    size = list.size();
                    for (i = 0; i < size; i++) {
                        cvmVar2 = (defpackage.cvm) list.get(i);
                        if (uu.s(cvmVar2)) {
                            cvmVar2.b();
                        }
                    }
                    bgwVar.d();
                } else {
                    bgwVar.a();
                }
                return aojh.a;
            }
            aooc.af(objK);
            cvmVar = (defpackage.cvm) ajsz.bE(cvfVar.a);
            long j = cvmVar.a;
            bkzVar.c = cwcVar;
            bkzVar.e = (defpackage.bji) bgwVar;
            bkzVar.d = cvmVar;
            bkzVar.b = 1;
            objK = defpackage.ro.k(cwcVar, j, bkzVar);
            if (objK == aoluVar) {
                return aoluVar;
            }
            defpackage.cvm cvmVar4 = (defpackage.cvm) objK;
            if (cvmVar4 != null && d(cwcVar.q(), cvmVar, cvmVar4)) {
                bgwVar.c(cvmVar4.c, defpackage.bld.a);
                long j2 = cvmVar4.a;
                defpackage.bgf bgfVar = new defpackage.bgf(bgwVar, 19);
                bkzVar.c = cwcVar;
                bkzVar.e = (defpackage.bji) bgwVar;
                bkzVar.d = null;
                bkzVar.b = 2;
                objK = defpackage.ro.n(cwcVar, j2, bgfVar, bkzVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objK).booleanValue()) {
                    list = cwcVar.p().a;
                    size = list.size();
                    while (i < size) {
                        cvmVar2 = (defpackage.cvm) list.get(i);
                        if (uu.s(cvmVar2)) {
                            cvmVar2.b();
                        }
                    }
                    bgwVar.d();
                } else {
                    bgwVar.a();
                }
            }
            return aojh.a;
        } catch (java.util.concurrent.CancellationException e) {
            bgwVar.a();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00db A[Catch: CancellationException -> 0x0104, TryCatch #1 {CancellationException -> 0x0104, blocks: (B:13:0x002b, B:43:0x00d3, B:45:0x00db, B:47:0x00e8, B:49:0x00f4, B:50:0x00f7, B:51:0x00fa, B:52:0x00fe, B:29:0x0094, B:31:0x0098, B:32:0x009a, B:34:0x009e, B:35:0x00a4, B:37:0x00a8, B:38:0x00ae, B:40:0x00b2, B:41:0x00b7, B:23:0x0050, B:25:0x005e, B:27:0x0063, B:26:0x0061), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[Catch: CancellationException -> 0x0104, TryCatch #1 {CancellationException -> 0x0104, blocks: (B:13:0x002b, B:43:0x00d3, B:45:0x00db, B:47:0x00e8, B:49:0x00f4, B:50:0x00f7, B:51:0x00fa, B:52:0x00fe, B:29:0x0094, B:31:0x0098, B:32:0x009a, B:34:0x009e, B:35:0x00a4, B:37:0x00a8, B:38:0x00ae, B:40:0x00b2, B:41:0x00b7, B:23:0x0050, B:25:0x005e, B:27:0x0063, B:26:0x0061), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[Catch: CancellationException -> 0x0104, TryCatch #1 {CancellationException -> 0x0104, blocks: (B:13:0x002b, B:43:0x00d3, B:45:0x00db, B:47:0x00e8, B:49:0x00f4, B:50:0x00f7, B:51:0x00fa, B:52:0x00fe, B:29:0x0094, B:31:0x0098, B:32:0x009a, B:34:0x009e, B:35:0x00a4, B:37:0x00a8, B:38:0x00ae, B:40:0x00b2, B:41:0x00b7, B:23:0x0050, B:25:0x005e, B:27:0x0063, B:26:0x0061), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe A[Catch: CancellationException -> 0x0104, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0104, blocks: (B:13:0x002b, B:43:0x00d3, B:45:0x00db, B:47:0x00e8, B:49:0x00f4, B:50:0x00f7, B:51:0x00fa, B:52:0x00fe, B:29:0x0094, B:31:0x0098, B:32:0x009a, B:34:0x009e, B:35:0x00a4, B:37:0x00a8, B:38:0x00ae, B:40:0x00b2, B:41:0x00b7, B:23:0x0050, B:25:0x005e, B:27:0x0063, B:26:0x0061), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object g(cwc cwcVar, defpackage.bgw bgwVar, cvf cvfVar, int i, aoln aolnVar) {
        defpackage.bla blaVar;
        long j;
        aoos aoosVar;
        java.util.List list;
        int size;
        int i2;
        defpackage.cvm cvmVar;
        if (aolnVar instanceof defpackage.bla) {
            blaVar = (defpackage.bla) aolnVar;
            int i3 = blaVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                blaVar.d = i3 - Integer.MIN_VALUE;
            } else {
                blaVar = new defpackage.bla(aolnVar);
            }
        } else {
            blaVar = new defpackage.bla(aolnVar);
        }
        java.lang.Object objT = blaVar.c;
        aolu aoluVar = aolu.a;
        int i4 = blaVar.d;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    long j2 = blaVar.b;
                    i = blaVar.a;
                    aoosVar = blaVar.f;
                    defpackage.bji bjiVar = blaVar.g;
                    cwc cwcVar2 = blaVar.e;
                    try {
                        aooc.af(objT);
                        j = j2;
                        bgwVar = bjiVar;
                        cwcVar = cwcVar2;
                    } catch (java.util.concurrent.CancellationException e) {
                        e = e;
                        bgwVar = bjiVar;
                        bgwVar.a();
                        throw e;
                    }
                } else {
                    if (i4 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bgwVar = blaVar.g;
                    cwcVar = blaVar.e;
                    aooc.af(objT);
                }
                if (((java.lang.Boolean) objT).booleanValue()) {
                    list = cwcVar.p().a;
                    size = list.size();
                    for (i2 = 0; i2 < size; i2++) {
                        cvmVar = (defpackage.cvm) list.get(i2);
                        if (uu.s(cvmVar)) {
                            cvmVar.b();
                        }
                    }
                    bgwVar.d();
                } else {
                    bgwVar.a();
                }
                return aojh.a;
            }
            aooc.af(objT);
            defpackage.cvm cvmVar2 = (defpackage.cvm) ajsz.bE(cvfVar.a);
            j = cvmVar2.a;
            bgwVar.c(cvmVar2.c, i > 2 ? defpackage.bkr.c : defpackage.bkr.b);
            aoosVar = new aoos();
            aoosVar.a = 9205357640488583168L;
            long jD = cwcVar.q().d();
            defpackage.blb blbVar = new defpackage.blb(j, aoosVar, null);
            blaVar.e = cwcVar;
            blaVar.g = (defpackage.bji) bgwVar;
            blaVar.f = aoosVar;
            blaVar.a = i;
            blaVar.b = j;
            blaVar.d = 1;
            objT = cwcVar.t(jD, blbVar, blaVar);
            if (objT == aoluVar) {
                return aoluVar;
            }
            defpackage.bkb bkbVar = (defpackage.bkb) objT;
            if (bkbVar == null) {
                bkbVar = defpackage.bkb.c;
            }
            if (bkbVar == defpackage.bkb.d) {
                bgwVar.a();
                return aojh.a;
            }
            if (bkbVar == defpackage.bkb.a) {
                bgwVar.d();
                return aojh.a;
            }
            if (bkbVar == defpackage.bkb.b) {
                bgwVar.b(aoosVar.a);
            }
            defpackage.bgf bgfVar = new defpackage.bgf(bgwVar, 20);
            blaVar.e = cwcVar;
            blaVar.g = (defpackage.bji) bgwVar;
            blaVar.f = null;
            blaVar.a = i;
            blaVar.b = j;
            blaVar.d = 2;
            objT = defpackage.ro.n(cwcVar, j, bgfVar, blaVar);
            if (objT == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objT).booleanValue()) {
                list = cwcVar.p().a;
                size = list.size();
                while (i2 < size) {
                    cvmVar = (defpackage.cvm) list.get(i2);
                    if (uu.s(cvmVar)) {
                        cvmVar.b();
                    }
                }
                bgwVar.d();
            } else {
                bgwVar.a();
            }
            return aojh.a;
        } catch (java.util.concurrent.CancellationException e2) {
            e = e2;
        }
    }

    public static final java.lang.Object h(cvr cvrVar, defpackage.bjj bjjVar, defpackage.bgw bgwVar, aoln aolnVar) {
        java.lang.Object objD = defpackage.ro.d(cvrVar, new defpackage.bkx(new defpackage.bjz(cvrVar.r()), bjjVar, bgwVar, null), aolnVar);
        return objD != aolu.a ? aojh.a : objD;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:18:0x0049, B:34:0x009f, B:36:0x00a7, B:38:0x00b3, B:40:0x00bf), top: B:83:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:18:0x0049, B:34:0x009f, B:36:0x00a7, B:38:0x00b3, B:40:0x00bf), top: B:83:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #0 {all -> 0x00ca, blocks: (B:18:0x0049, B:34:0x009f, B:36:0x00a7, B:38:0x00b3, B:40:0x00bf), top: B:83:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0144 A[Catch: all -> 0x015a, TryCatch #1 {all -> 0x015a, blocks: (B:13:0x0036, B:64:0x012c, B:66:0x0134, B:68:0x0138, B:70:0x0144, B:72:0x0150), top: B:85:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0150 A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #1 {all -> 0x015a, blocks: (B:13:0x0036, B:64:0x012c, B:66:0x0134, B:68:0x0138, B:70:0x0144, B:72:0x0150), top: B:85:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00c2 A[SYNTHETIC] */
    public static final java.lang.Object i(cwc cwcVar, defpackage.bjj bjjVar, defpackage.bjz bjzVar, cvf cvfVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.bky bkyVar;
        defpackage.bks bksVar;
        defpackage.bjj bjjVar2;
        aoop aoopVar;
        defpackage.bjj bjjVar3;
        java.util.List list;
        int size;
        defpackage.cvm cvmVar;
        java.util.List list2;
        int size2;
        defpackage.cvm cvmVar2;
        cwc cwcVar2 = cwcVar;
        if (aolnVar instanceof defpackage.bky) {
            bkyVar = (defpackage.bky) aolnVar;
            int i = bkyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkyVar.b = i - Integer.MIN_VALUE;
            } else {
                bkyVar = new defpackage.bky(aolnVar);
            }
        } else {
            bkyVar = new defpackage.bky(aolnVar);
        }
        defpackage.bky bkyVar2 = bkyVar;
        java.lang.Object objN = bkyVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = bkyVar2.b;
        int i3 = 0;
        if (i2 == 0) {
            aooc.af(objN);
            defpackage.cvm cvmVar3 = (defpackage.cvm) cvfVar.a.get(0);
            if ((cvfVar.d & 1) != 0) {
                long j = cvmVar3.c;
                cxi cxiVar = (cxi) bjjVar.c.a();
                if (cxiVar != null) {
                    defpackage.blz blzVar = bjjVar.d;
                    if (cxiVar.u()) {
                        if (blzVar.g(cxiVar, j, bjjVar.a, defpackage.bkr.a, false)) {
                            bjjVar.a = j;
                        }
                        if (bjjVar.b()) {
                            try {
                                cvmVar3.b();
                                long j2 = cvmVar3.a;
                                defpackage.bgf bgfVar = new defpackage.bgf(bjjVar, 18);
                                bkyVar2.d = cwcVar2;
                                bkyVar2.e = bjjVar;
                                bkyVar2.b = 1;
                                objN = defpackage.ro.n(cwcVar2, j2, bgfVar, bkyVar2);
                                if (objN == aoluVar) {
                                    return aoluVar;
                                }
                                bjjVar3 = bjjVar;
                                if (((java.lang.Boolean) objN).booleanValue()) {
                                    list = cwcVar2.p().a;
                                    size = list.size();
                                    while (i3 < size) {
                                        cvmVar = (defpackage.cvm) list.get(i3);
                                        if (uu.s(cvmVar)) {
                                            cvmVar.b();
                                        }
                                        i3++;
                                    }
                                }
                                bjjVar3.a();
                            } catch (java.lang.Throwable th) {
                                th = th;
                                bjjVar3 = bjjVar;
                                bjjVar3.a();
                                throw th;
                            }
                        }
                    }
                }
            } else {
                int i4 = bjzVar.a;
                if (i4 != 1) {
                    bksVar = i4 != 2 ? defpackage.bkr.c : defpackage.bkr.b;
                } else {
                    bksVar = defpackage.bkr.a;
                }
                defpackage.bks bksVar2 = bksVar;
                long j3 = cvmVar3.c;
                cxi cxiVar2 = (cxi) bjjVar.c.a();
                if (cxiVar2 != null) {
                    defpackage.blz blzVar2 = bjjVar.d;
                    if (cxiVar2.u()) {
                        blzVar2.e(cxiVar2, j3, bksVar2, false);
                        bjjVar.a = j3;
                        if (bjjVar.b()) {
                            try {
                                aoopVar = new aoop();
                                aoopVar.a = !aooh.n(bksVar2, defpackage.bkr.a);
                                long j4 = cvmVar3.a;
                                afx afxVar = new afx(bjjVar, bksVar2, aoopVar, 6, (char[]) null);
                                bkyVar2.d = cwcVar2;
                                bkyVar2.e = bjjVar;
                                bkyVar2.c = aoopVar;
                                bkyVar2.b = 2;
                                objN = defpackage.ro.n(cwcVar2, j4, afxVar, bkyVar2);
                                if (objN == aoluVar) {
                                    return aoluVar;
                                }
                                bjjVar2 = bjjVar;
                                if (((java.lang.Boolean) objN).booleanValue()) {
                                    list2 = cwcVar2.p().a;
                                    size2 = list2.size();
                                    while (i3 < size2) {
                                        cvmVar2 = (defpackage.cvm) list2.get(i3);
                                        if (uu.s(cvmVar2)) {
                                            cvmVar2.b();
                                        }
                                        i3++;
                                    }
                                }
                                bjjVar2.a();
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                bjjVar2 = bjjVar;
                                bjjVar2.a();
                                throw th;
                            }
                        }
                    }
                }
            }
        } else if (i2 == 1) {
            bjjVar3 = bkyVar2.e;
            cwcVar2 = bkyVar2.d;
            try {
                aooc.af(objN);
                if (((java.lang.Boolean) objN).booleanValue()) {
                    list = cwcVar2.p().a;
                    size = list.size();
                    while (i3 < size) {
                        cvmVar = (defpackage.cvm) list.get(i3);
                        if (uu.s(cvmVar)) {
                            cvmVar.b();
                        }
                        i3++;
                    }
                }
                bjjVar3.a();
            } catch (java.lang.Throwable th3) {
                th = th3;
                bjjVar3.a();
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aoop aoopVar2 = bkyVar2.c;
            bjjVar2 = bkyVar2.e;
            cwc cwcVar3 = bkyVar2.d;
            try {
                aooc.af(objN);
                aoopVar = aoopVar2;
                cwcVar2 = cwcVar3;
                if (((java.lang.Boolean) objN).booleanValue() && aoopVar.a) {
                    list2 = cwcVar2.p().a;
                    size2 = list2.size();
                    while (i3 < size2) {
                        cvmVar2 = (defpackage.cvm) list2.get(i3);
                        if (uu.s(cvmVar2)) {
                            cvmVar2.b();
                        }
                        i3++;
                    }
                }
                bjjVar2.a();
            } catch (java.lang.Throwable th4) {
                th = th4;
                bjjVar2.a();
                throw th;
            }
        }
        return aojh.a;
    }

    public static final void j(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        cbt cbtVarB = cavVar.b(1949207773);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmwVar = cmw.c;
            java.lang.Object[] objArr = new java.lang.Object[0];
            ckb ckbVar = defpackage.bmb.a;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new nu(20);
                cbtVar.ab(objR);
            }
            k(cmwVar, (defpackage.bmb) cfd.n(objArr, ckbVar, (aomy) objR, cbtVarB, 384), aonnVar, cbtVarB, (i2 & 14) | 64 | ((i2 << 6) & 7168));
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar, aonnVar, i, 15);
        }
    }

    public static final void k(cmw cmwVar, defpackage.bmb bmbVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cbt cbtVarB = cavVar.b(-1922770793);
        if ((i & 6) == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(bmbVar) : cbtVarB.D(bmbVar)) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != cbtVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cbtVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            java.lang.Object[] objArr = new java.lang.Object[0];
            ckb ckbVar = defpackage.blz.a;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new nu(19);
                cbtVar.ab(objR);
            }
            defpackage.blz blzVar = (defpackage.blz) cfd.n(objArr, ckbVar, (aomy) objR, cbtVarB, 384);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.blw(blzVar);
                cbtVar.ab(objR2);
            }
            defpackage.blw blwVar = (defpackage.blw) objR2;
            cbtVarB.u(714821931);
            cbtVar.W(false);
            kaw kawVar = (kaw) cbtVarB.e(dfo.c);
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                objR3 = cbp.a(aols.a, cbtVarB);
                cbtVar.ab(objR3);
            }
            aoss aossVar = (aoss) objR3;
            blwVar.q = (kaw) cbtVarB.e(dfo.h);
            boolean zB = cbtVarB.B(aossVar) | cbtVarB.B(kawVar);
            java.lang.Object objR4 = cbtVar.R();
            if (zB || objR4 == obj) {
                objR4 = new defpackage.aum(aossVar, kawVar, 19, null);
                cbtVar.ab(objR4);
            }
            blwVar.c = (aonj) objR4;
            blwVar.p = (defpackage.wt) cbtVarB.e(dfo.l);
            blwVar.t(bmbVar.a());
            int i4 = i3 & 112;
            boolean zD = (i4 == 32 || ((i3 & 64) != 0 && cbtVarB.D(bmbVar))) | cbtVarB.D(blwVar);
            java.lang.Object objR5 = cbtVar.R();
            if (zD || objR5 == obj) {
                objR5 = new defpackage.aum(bmbVar, blwVar, 20, null);
                cbtVar.ab(objR5);
            }
            blwVar.b = new bly(blwVar, (aonj) objR5, 1);
            cbtVarB.u(715702610);
            defpackage.bkm bkmVar = defpackage.bkm.b;
            dnx dnxVar = (dnx) cbtVarB.e(dfo.k);
            aonp aonpVar = defpackage.bkk.a;
            cbtVarB.u(430530635);
            android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
            aolr aolrVar = (aolr) cbtVarB.e(defpackage.bkk.b);
            boolean zB2 = cbtVarB.B(aolrVar) | cbtVarB.B(context) | cbtVarB.B(dnxVar);
            java.lang.Object objR6 = cbtVar.R();
            if (zB2 || objR6 == obj) {
                objR6 = defpackage.bkk.a.a(aolrVar, context, bkmVar, dnxVar);
                cbtVar.ab(objR6);
            }
            cbtVar.W(false);
            blwVar.m = (defpackage.bkj) objR6;
            cbtVar.W(false);
            blwVar.j = aossVar;
            blwVar.B();
            cmw cmwVarN = cmw.c;
            defpackage.bll bllVar = new defpackage.bll(blwVar, 0);
            aojh aojhVar = aojh.a;
            cmw cmwVarA = un.i(cvy.a(defpackage.rv.j(defpackage.rv.k(defpackage.rx.B(vn.e(cvy.a(cmwVarN, aojhVar, new defpackage.blu(blwVar, bllVar, 0)), new defpackage.bln(blwVar, 3)), blwVar.d), new defpackage.bln(blwVar, 4))), 8675309, new defpackage.bil(new defpackage.bln(blwVar, 5), 4)), new defpackage.bls(blwVar)).a(cvy.a(cmwVarN, aojhVar, new defpackage.bil(blwVar, 5)));
            if (blwVar.z() && blwVar.A() && !blwVar.C()) {
                cmwVarN = cfo.n(cmwVarN, new defpackage.ant(blwVar, 3));
            }
            defpackage.li.h(cmwVarA.a(cmwVarN).a(new defpackage.big(new axo(blwVar, 9))), cfo.j(464404577, new defpackage.ata(blwVar, blzVar, aonnVar, 3), cbtVarB), cbtVarB, 48);
            boolean zD2 = (i4 == 32 || ((i3 & 64) != 0 && cbtVarB.D(bmbVar))) | cbtVarB.D(blwVar);
            java.lang.Object objR7 = cbtVar.R();
            if (zD2 || objR7 == obj) {
                objR7 = new defpackage.aum(bmbVar, blwVar, 18, null);
                cbtVar.ab(objR7);
            }
            cbp.b(bmbVar, blwVar, (aonj) objR7, cbtVarB);
            boolean zD3 = cbtVarB.D(blwVar);
            java.lang.Object objR8 = cbtVar.R();
            if (zD3 || objR8 == obj) {
                objR8 = new defpackage.bgf(blwVar, 17);
                cbtVar.ab(objR8);
            }
            cbp.c(blwVar, (aonj) objR8, cbtVarB);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz((java.lang.Object) cmwVar, (java.lang.Object) bmbVar, (java.lang.Object) aonnVar, i, 8, (byte[]) null);
        }
    }
}
