package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cnn implements android.view.View.OnAttachStateChangeListener, defpackage.emj {
    public static final /* synthetic */ int h = 0;
    public final defpackage.deg a;
    public boolean c;
    public final java.lang.Runnable d;
    public final defpackage.aco e;
    public defpackage.nf g;
    private final defpackage.aomy i;
    private defpackage.aco l;
    private long m;
    private defpackage.enr n;
    private final java.util.List j = new java.util.ArrayList();
    public int f = 1;
    public boolean b = true;
    private final defpackage.aowi k = defpackage.aooh.H(1, 0, null, 6);

    public cnn(defpackage.deg degVar, defpackage.aomy aomyVar) {
        this.a = degVar;
        this.i = aomyVar;
        new android.os.Handler(android.os.Looper.getMainLooper());
        defpackage.aco acoVar = defpackage.acp.a;
        if (acoVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        }
        this.l = acoVar;
        this.e = new defpackage.aco(6);
        defpackage.dij dijVarA = degVar.p.a();
        if (acoVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        }
        this.g = new defpackage.nf(dijVarA, acoVar);
        this.d = new java.lang.Runnable() { // from class: cnl
            /* JADX WARN: Code duplicated, block: B:139:0x02f3 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:140:0x02f5 A[Catch: all -> 0x0317, LOOP:8: B:129:0x02b1->B:140:0x02f5, LOOP_END, TryCatch #1 {all -> 0x0317, blocks: (B:9:0x001c, B:12:0x0035, B:14:0x0041, B:16:0x004b, B:18:0x0051, B:20:0x0065, B:22:0x0070, B:28:0x0085, B:30:0x0094, B:32:0x00a4, B:35:0x00b5, B:37:0x00c1, B:39:0x00cb, B:41:0x00d1, B:43:0x00e6, B:47:0x00ee, B:49:0x0106, B:51:0x0114, B:53:0x011e, B:55:0x0124, B:57:0x0138, B:59:0x0140, B:63:0x014d, B:65:0x0151, B:62:0x0148, B:67:0x0160, B:118:0x0265, B:72:0x0171, B:76:0x0182, B:79:0x019b, B:81:0x01aa, B:83:0x01b6, B:85:0x01bc, B:87:0x01d2, B:89:0x01de, B:93:0x01ef, B:95:0x01f5, B:97:0x01fd, B:101:0x020a, B:103:0x020e, B:105:0x0214, B:108:0x0227, B:100:0x0205, B:92:0x01e8, B:114:0x0242, B:115:0x024d, B:116:0x0257, B:124:0x028b, B:126:0x029c, B:129:0x02b1, B:131:0x02bd, B:133:0x02ca, B:135:0x02d0, B:136:0x02e9, B:140:0x02f5, B:141:0x02f8, B:145:0x0313, B:146:0x0316, B:31:0x0099), top: B:152:0x001c, inners: #0 }] */
            /* JADX WARN: Code duplicated, block: B:180:0x02f8 A[EDGE_INSN: B:180:0x02f8->B:141:0x02f8 BREAK  A[LOOP:8: B:129:0x02b1->B:140:0x02f5], SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                long j;
                long j2;
                long j3;
                long j4;
                defpackage.aco acoVar2;
                int[] iArr;
                long[] jArr;
                defpackage.aco acoVar3;
                int[] iArr2;
                long[] jArr2;
                long j5;
                int i;
                long j6;
                int i2;
                int i3;
                long[] jArr3;
                defpackage.dji djiVar;
                long j7;
                char c2;
                long j8;
                defpackage.cnn cnnVar = this.a;
                if (cnnVar.n()) {
                    defpackage.deg degVar2 = cnnVar.a;
                    int i4 = 0;
                    if (!degVar2.isAttachedToWindow()) {
                        cnnVar.c = false;
                        return;
                    }
                    android.os.Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        degVar2.w(true);
                        defpackage.aco acoVar4 = cnnVar.e;
                        int[] iArr3 = acoVar4.b;
                        long[] jArr4 = acoVar4.a;
                        int length = jArr4.length - 2;
                        char c3 = 7;
                        long j9 = -9187201950435737472L;
                        int i5 = 8;
                        if (length >= 0) {
                            int i6 = 0;
                            j2 = 128;
                            while (true) {
                                long j10 = jArr4[i6];
                                j3 = 255;
                                if ((((~j10) << c3) & j10 & j9) != j9) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j10 & 255) < 128) {
                                            c2 = c3;
                                            int i9 = iArr3[(i6 << 3) + i8];
                                            j8 = j9;
                                            if (!cnnVar.h().b(i9)) {
                                                cnnVar.j(i9);
                                                cnnVar.k();
                                            }
                                        } else {
                                            c2 = c3;
                                            j8 = j9;
                                        }
                                        j10 >>= 8;
                                        i8++;
                                        c3 = c2;
                                        j9 = j8;
                                    }
                                    c = c3;
                                    j = j9;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    c = c3;
                                    j = j9;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                c3 = c;
                                j9 = j;
                            }
                        } else {
                            c = 7;
                            j = -9187201950435737472L;
                            j2 = 128;
                            j3 = 255;
                        }
                        android.os.Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            cnnVar.o(degVar2.p.a(), cnnVar.g);
                            android.os.Trace.endSection();
                            defpackage.aco acoVarH = cnnVar.h();
                            int[] iArr4 = acoVarH.b;
                            long[] jArr5 = acoVarH.a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j11 = jArr5[i10];
                                    if ((((~j11) << c) & j11 & j) != j) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        int i12 = i4;
                                        while (i12 < i11) {
                                            if ((j11 & j3) < j2) {
                                                int i13 = iArr4[(i10 << 3) + i12];
                                                defpackage.nf nfVar = (defpackage.nf) cnnVar.e.a(i13);
                                                defpackage.ajwz ajwzVar = (defpackage.ajwz) acoVarH.a(i13);
                                                java.lang.Object obj = ajwzVar != null ? ajwzVar.c : null;
                                                if (obj == null) {
                                                    defpackage.cwh.b("no value for specified key");
                                                    throw new defpackage.aoiq();
                                                }
                                                if (nfVar == null) {
                                                    defpackage.die dieVar = ((defpackage.dij) obj).b;
                                                    defpackage.adw adwVar = dieVar.c;
                                                    j6 = j2;
                                                    java.lang.Object[] objArr = adwVar.b;
                                                    long[] jArr6 = adwVar.a;
                                                    int i14 = i5;
                                                    int length3 = jArr6.length - 2;
                                                    acoVar3 = acoVarH;
                                                    iArr2 = iArr4;
                                                    if (length3 >= 0) {
                                                        while (true) {
                                                            long j12 = jArr6[i4];
                                                            j5 = j11;
                                                            if ((((~j12) << c) & j12 & j) != j) {
                                                                int i15 = 8 - ((~(i4 - length3)) >>> 31);
                                                                for (int i16 = 0; i16 < i15; i16++) {
                                                                    if ((j12 & j3) < j6) {
                                                                        j7 = j12;
                                                                        defpackage.dip dipVar = (defpackage.dip) objArr[(i4 << 3) + i16];
                                                                        defpackage.dip dipVar2 = defpackage.din.D;
                                                                        if (defpackage.aooh.n(dipVar, dipVar2)) {
                                                                            java.util.List list = (java.util.List) dieVar.g(dipVar2);
                                                                            cnnVar.l(((defpackage.dij) obj).c, java.lang.String.valueOf(list != null ? (defpackage.dji) (list.isEmpty() ? null : list.get(0)) : null));
                                                                        }
                                                                    } else {
                                                                        j7 = j12;
                                                                    }
                                                                    j12 = j7 >> i14;
                                                                }
                                                                i2 = i14;
                                                                if (i15 != i2) {
                                                                    jArr2 = jArr5;
                                                                    i = i12;
                                                                }
                                                            }
                                                            if (i4 != length3) {
                                                                i4++;
                                                                j11 = j5;
                                                                i14 = 8;
                                                            }
                                                        }
                                                    } else {
                                                        j5 = j11;
                                                    }
                                                    jArr2 = jArr5;
                                                    i = i12;
                                                    i2 = 8;
                                                    break;
                                                }
                                                acoVar3 = acoVarH;
                                                iArr2 = iArr4;
                                                j5 = j11;
                                                j6 = j2;
                                                defpackage.die dieVar2 = ((defpackage.dij) obj).b;
                                                defpackage.adw adwVar2 = dieVar2.c;
                                                java.lang.Object[] objArr2 = adwVar2.b;
                                                long[] jArr7 = adwVar2.a;
                                                int length4 = jArr7.length - 2;
                                                if (length4 >= 0) {
                                                    int i17 = 0;
                                                    while (true) {
                                                        long j13 = jArr7[i17];
                                                        long[] jArr8 = jArr7;
                                                        java.lang.Object[] objArr3 = objArr2;
                                                        if ((((~j13) << c) & j13 & j) != j) {
                                                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                                                            int i19 = 0;
                                                            while (i19 < i18) {
                                                                if ((j13 & j3) < j6) {
                                                                    i3 = i19;
                                                                    defpackage.dip dipVar3 = (defpackage.dip) objArr3[(i17 << 3) + i19];
                                                                    jArr3 = jArr5;
                                                                    defpackage.dip dipVar4 = defpackage.din.D;
                                                                    if (defpackage.aooh.n(dipVar3, dipVar4)) {
                                                                        java.util.List list2 = (java.util.List) ((defpackage.die) nfVar.a).g(dipVar4);
                                                                        if (list2 != null) {
                                                                            djiVar = (defpackage.dji) (list2.isEmpty() ? null : list2.get(0));
                                                                        } else {
                                                                            i12 = i12;
                                                                            djiVar = null;
                                                                        }
                                                                        java.util.List list3 = (java.util.List) dieVar2.g(dipVar4);
                                                                        defpackage.dji djiVar2 = list3 != null ? (defpackage.dji) (list3.isEmpty() ? null : list3.get(0)) : null;
                                                                        if (!defpackage.aooh.n(djiVar, djiVar2)) {
                                                                            cnnVar.l(((defpackage.dij) obj).c, java.lang.String.valueOf(djiVar2));
                                                                        }
                                                                    }
                                                                    j13 >>= 8;
                                                                    i19 = i3 + 1;
                                                                    jArr5 = jArr3;
                                                                    i12 = i12;
                                                                } else {
                                                                    i3 = i19;
                                                                    jArr3 = jArr5;
                                                                }
                                                                i12 = i12;
                                                                j13 >>= 8;
                                                                i19 = i3 + 1;
                                                                jArr5 = jArr3;
                                                                i12 = i12;
                                                            }
                                                            jArr2 = jArr5;
                                                            i = i12;
                                                            if (i18 != 8) {
                                                                i2 = 8;
                                                                break;
                                                            }
                                                        } else {
                                                            jArr2 = jArr5;
                                                            i = i12;
                                                        }
                                                        if (i17 != length4) {
                                                            i17++;
                                                            objArr2 = objArr3;
                                                            jArr7 = jArr8;
                                                            jArr5 = jArr2;
                                                            i12 = i;
                                                        }
                                                    }
                                                } else {
                                                    jArr2 = jArr5;
                                                    i = i12;
                                                }
                                                i2 = 8;
                                                break;
                                                break;
                                            } else {
                                                acoVar3 = acoVarH;
                                                iArr2 = iArr4;
                                                jArr2 = jArr5;
                                                j5 = j11;
                                                i = i12;
                                                j6 = j2;
                                                i2 = i5;
                                            }
                                            j11 = j5 >> i2;
                                            i12 = i + 1;
                                            i5 = i2;
                                            j2 = j6;
                                            acoVarH = acoVar3;
                                            iArr4 = iArr2;
                                            jArr5 = jArr2;
                                            i4 = 0;
                                        }
                                        acoVar2 = acoVarH;
                                        iArr = iArr4;
                                        jArr = jArr5;
                                        j4 = j2;
                                        if (i11 != i5) {
                                            break;
                                        }
                                    } else {
                                        acoVar2 = acoVarH;
                                        iArr = iArr4;
                                        jArr = jArr5;
                                        j4 = j2;
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j2 = j4;
                                    acoVarH = acoVar2;
                                    iArr4 = iArr;
                                    jArr5 = jArr;
                                    i4 = 0;
                                    i5 = 8;
                                }
                            } else {
                                j4 = j2;
                            }
                            defpackage.aco acoVar5 = cnnVar.e;
                            acoVar5.f();
                            defpackage.aco acoVarH2 = cnnVar.h();
                            int[] iArr5 = acoVarH2.b;
                            java.lang.Object[] objArr4 = acoVarH2.c;
                            long[] jArr9 = acoVarH2.a;
                            int length5 = jArr9.length - 2;
                            if (length5 >= 0) {
                                int i20 = 0;
                                while (true) {
                                    long j14 = jArr9[i20];
                                    if ((((~j14) << c) & j14 & j) == j) {
                                        if (i20 != length5) {
                                            break;
                                            break;
                                        }
                                        i20++;
                                    } else {
                                        int i21 = 8 - ((~(i20 - length5)) >>> 31);
                                        long j15 = j14;
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            if ((j15 & j3) < j4) {
                                                int i23 = (i20 << 3) + i22;
                                                acoVar5.g(iArr5[i23], new defpackage.nf((defpackage.dij) ((defpackage.ajwz) objArr4[i23]).c, cnnVar.h()));
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i21 != 8) {
                                            break;
                                        } else if (i20 != length5) {
                                            break;
                                        } else {
                                            i20++;
                                        }
                                    }
                                }
                            }
                            cnnVar.g = new defpackage.nf(cnnVar.a.p.a(), cnnVar.h());
                            cnnVar.c = false;
                            android.os.Trace.endSection();
                        } catch (java.lang.Throwable th) {
                            android.os.Trace.endSection();
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        android.os.Trace.endSection();
                        throw th2;
                    }
                }
            }
        };
    }

    private final void p(defpackage.dij dijVar, defpackage.aonn aonnVar) {
        java.util.List listL = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
        int size = listL.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = listL.get(i2);
            if (h().b(((defpackage.dij) obj).c)) {
                aonnVar.a(java.lang.Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    private final void q() {
        defpackage.enr enrVar = this.n;
        if (enrVar != null) {
            java.util.List list = this.j;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.cno cnoVar = (defpackage.cno) list.get(i);
                if (cnoVar.b - 1 != 0) {
                    android.view.autofill.AutofillId autofillIdH = enrVar.h(cnoVar.a);
                    if (autofillIdH != null) {
                        da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(enrVar.a), autofillIdH);
                    }
                } else {
                    defpackage.kaw kawVar = cnoVar.c;
                    if (kawVar != null) {
                        da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(enrVar.a), (android.view.ViewStructure) kawVar.a);
                    }
                }
            }
            da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(enrVar.a), aa$.ExternalSyntheticApiModelOutline0.m(((defpackage.kaw) j$.util.Objects.requireNonNull(new defpackage.kaw(aa$.ExternalSyntheticApiModelOutline0.m((android.view.View) enrVar.b)))).a), new long[]{Long.MIN_VALUE});
            list.clear();
        }
    }

    private final void r(defpackage.dij dijVar) {
        if (n()) {
            j(dijVar.c);
            java.util.List listL = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
            int size = listL.size();
            for (int i = 0; i < size; i++) {
                r((defpackage.dij) listL.get(i));
            }
        }
    }

    @Override // defpackage.emj
    public final void e(defpackage.emx emxVar) {
        this.n = (defpackage.enr) this.i.a();
        m(-1, this.a.p.a());
        q();
    }

    @Override // defpackage.emj
    public final void f(defpackage.emx emxVar) {
        r(this.a.p.a());
        q();
        this.n = null;
    }

    public final android.os.Handler g() {
        return this.a.getHandler();
    }

    public final defpackage.aco h() {
        if (this.b) {
            this.b = false;
            defpackage.deg degVar = this.a;
            this.l = defpackage.dil.c(degVar.p, new defpackage.ckc(5));
            this.m = java.lang.System.currentTimeMillis();
        }
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0055
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(defpackage.aoln r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cnm
            if (r0 == 0) goto L13
            r0 = r8
            cnm r0 = (defpackage.cnm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnm r0 = new cnm
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            aovx r2 = r0.d
            defpackage.aooc.af(r8)
            goto L43
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            aovx r2 = r0.d
            defpackage.aooc.af(r8)
            goto L4d
        L3a:
            defpackage.aooc.af(r8)
            aowi r8 = r7.k
            aovx r2 = r8.A()
        L43:
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto L81
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r2.b()
            boolean r8 = r7.n()
            if (r8 == 0) goto L61
            r7.q()
        L61:
            android.os.Handler r8 = r7.g()
            boolean r5 = r7.c
            if (r5 != 0) goto L72
            if (r8 == 0) goto L72
            r7.c = r4
            java.lang.Runnable r5 = r7.d
            r8.post(r5)
        L72:
            r0.d = r2
            r0.c = r3
            r5 = 100
            java.lang.Object r8 = defpackage.aosv.j(r5, r0)
            if (r8 != r1) goto L43
            goto L81
        L7f:
            aojh r1 = defpackage.aojh.a
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnn.i(aoln):java.lang.Object");
    }

    public final void j(int i) {
        this.j.add(new defpackage.cno(i, this.m, 2, null));
    }

    public final void k() {
        this.k.b(defpackage.aojh.a);
    }

    public final void l(int i, java.lang.String str) {
        defpackage.enr enrVar = this.n;
        if (enrVar != null) {
            android.view.autofill.AutofillId autofillIdH = enrVar.h(i);
            if (autofillIdH != null) {
                da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(enrVar.a), autofillIdH, str);
            } else {
                defpackage.cwh.b("Invalid content capture ID");
                throw new defpackage.aoiq();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    public final void m(int i, defpackage.dij dijVar) {
        defpackage.dhr dhrVar;
        defpackage.aonj aonjVar;
        defpackage.kaw kawVar;
        java.lang.Object objH;
        defpackage.cpn cpnVarA;
        java.lang.String strE;
        defpackage.aonj aonjVar2;
        if (n()) {
            defpackage.die dieVar = dijVar.b;
            java.lang.Boolean bool = (java.lang.Boolean) dieVar.g(defpackage.din.F);
            if (this.f == 1 && defpackage.aooh.n(bool, java.lang.Boolean.TRUE)) {
                defpackage.dhr dhrVar2 = (defpackage.dhr) dieVar.g(defpackage.did.m);
                if (dhrVar2 != null && (aonjVar2 = (defpackage.aonj) dhrVar2.b) != null) {
                }
            } else if (this.f == 2 && defpackage.aooh.n(bool, java.lang.Boolean.FALSE) && (dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.m)) != null && (aonjVar = (defpackage.aonj) dhrVar.b) != null) {
            }
            int i2 = dijVar.c;
            defpackage.enr enrVar = this.n;
            if (enrVar != null) {
                defpackage.kaw kawVar2 = new defpackage.kaw(aa$.ExternalSyntheticApiModelOutline0.m(this.a));
                defpackage.dij dijVarJ = dijVar.j();
                if (dijVarJ != null) {
                    objH = enrVar.h(dijVarJ.c);
                    if (objH == null) {
                        kawVar = null;
                    }
                } else {
                    objH = kawVar2.a;
                }
                defpackage.kaw kawVar3 = new defpackage.kaw(da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(enrVar.a), aa$.ExternalSyntheticApiModelOutline0.m(objH), i2));
                if (dieVar.f(defpackage.din.N)) {
                    kawVar = null;
                } else {
                    android.view.ViewStructure viewStructure = (android.view.ViewStructure) kawVar3.a;
                    android.os.Bundle extras = viewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong("android.view.contentcapture.EventTimestamp", this.m);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                    }
                    java.lang.String str = (java.lang.String) dieVar.g(defpackage.din.B);
                    if (str != null) {
                        viewStructure.setId(i2, null, null, str);
                    }
                    java.lang.Boolean bool2 = (java.lang.Boolean) dieVar.g(defpackage.din.n);
                    if (bool2 != null) {
                        bool2.booleanValue();
                        kawVar3.an("android.widget.ViewGroup");
                    }
                    java.util.List list = (java.util.List) dieVar.g(defpackage.din.D);
                    if (list != null) {
                        kawVar3.an("android.widget.TextView");
                        kawVar3.ao(defpackage.dpy.c(list, "\n", null, null, null, 62));
                    }
                    defpackage.dji djiVar = (defpackage.dji) dieVar.g(defpackage.din.H);
                    if (djiVar != null) {
                        kawVar3.an("android.widget.EditText");
                        kawVar3.ao(djiVar);
                    }
                    java.util.List list2 = (java.util.List) dieVar.g(defpackage.din.a);
                    if (list2 != null) {
                        viewStructure.setContentDescription(defpackage.dpy.c(list2, "\n", null, null, null, 62));
                    }
                    defpackage.dib dibVar = (defpackage.dib) dieVar.g(defpackage.din.A);
                    if (dibVar != null && (strE = defpackage.dff.e(dibVar.a)) != null) {
                        kawVar3.an(strE);
                    }
                    defpackage.dkw dkwVarD = defpackage.dff.d(dieVar);
                    if (dkwVarD != null) {
                        defpackage.dkv dkvVar = dkwVarD.a;
                        long jG = dkvVar.b.g() & 4294967295L;
                        defpackage.dpt[] dptVarArr = defpackage.dps.a;
                        defpackage.dpf dpfVar = dkvVar.g;
                        viewStructure.setTextStyle(java.lang.Float.intBitsToFloat((int) jG) * dpfVar.a() * dpfVar.b(), 0, 0, 0);
                    }
                    defpackage.dck dckVarF = dijVar.f();
                    if (dckVarF == null) {
                        cpnVarA = defpackage.cpn.a;
                    } else {
                        defpackage.dck dckVar = true == dckVarF.u() ? dckVarF : null;
                        if (dckVar != null) {
                            cpnVarA = dijVar.a(dckVar);
                        } else {
                            cpnVarA = defpackage.cpn.a;
                        }
                    }
                    float f = cpnVarA.d;
                    float f2 = cpnVarA.b;
                    float f3 = cpnVarA.e;
                    float f4 = cpnVarA.c;
                    viewStructure.setDimens((int) f2, (int) f4, 0, 0, (int) (f - f2), (int) (f3 - f4));
                    kawVar = kawVar3;
                }
            } else {
                kawVar = null;
            }
            if (kawVar != null) {
                this.j.add(new defpackage.cno(i2, this.m, 1, kawVar));
            }
            p(dijVar, new defpackage.bae(this, 10));
        }
    }

    public final boolean n() {
        return this.n != null;
    }

    public final void o(defpackage.dij dijVar, defpackage.nf nfVar) {
        p(dijVar, new defpackage.bec(nfVar, this, 6));
        java.util.List listL = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
        int size = listL.size();
        for (int i = 0; i < size; i++) {
            defpackage.dij dijVar2 = (defpackage.dij) listL.get(i);
            defpackage.aco acoVarH = h();
            int i2 = dijVar2.c;
            if (acoVarH.b(i2)) {
                defpackage.aco acoVar = this.e;
                if (acoVar.b(i2)) {
                    java.lang.Object objA = acoVar.a(i2);
                    if (objA == null) {
                        defpackage.cwh.b("node not present in pruned tree before this change");
                        throw new defpackage.aoiq();
                    }
                    o(dijVar2, (defpackage.nf) objA);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.os.Handler handlerG = g();
        if (handlerG != null) {
            handlerG.removeCallbacks(this.d);
        }
        this.n = null;
    }

    @Override // defpackage.emj
    public final /* synthetic */ void a(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void b(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void fn(defpackage.emx emxVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
