package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class clk {
    public final defpackage.aonj a;
    public boolean c;
    public defpackage.clj f;
    private defpackage.apnt j;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(null);
    private final defpackage.aonn g = new defpackage.bae(this, 9);
    private final defpackage.aonj h = new defpackage.bjp(this, 12);
    public final defpackage.cfc d = new defpackage.cfc(new defpackage.clj[16]);
    public final java.lang.Object e = new java.lang.Object();
    private long i = -1;

    public clk(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    public final void a() {
        synchronized (this.e) {
            defpackage.cfc cfcVar = this.d;
            java.lang.Object[] objArr = cfcVar.a;
            int i = cfcVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.clj cljVar = (defpackage.clj) objArr[i2];
                cljVar.f().k();
                cljVar.e().k();
                cljVar.j.k();
                cljVar.k.k();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    public final void b(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        synchronized (this.e) {
            defpackage.cfc cfcVar = this.d;
            int i4 = cfcVar.b;
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                defpackage.clj cljVar = (defpackage.clj) cfcVar.a[i5];
                defpackage.ado adoVar = (defpackage.ado) cljVar.e().i(obj);
                if (adoVar != null) {
                    java.lang.Object[] objArr = adoVar.b;
                    int[] iArr = adoVar.c;
                    long[] jArr = adoVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            i = i5;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = i7 - length;
                                i2 = i6;
                                int i9 = 0;
                                while (true) {
                                    int i10 = i8;
                                    i3 = 8 - ((~i8) >>> 31);
                                    if (i9 >= i3) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i11 = (i7 << 3) + i9;
                                        java.lang.Object obj2 = objArr[i11];
                                        int i12 = iArr[i11];
                                        cljVar.b(obj, obj2);
                                    }
                                    j >>= 8;
                                    i9++;
                                    i8 = i10;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                            } else {
                                i2 = i6;
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            i5 = i;
                            i6 = i2;
                        }
                    } else {
                        i = i5;
                        i2 = i6;
                    }
                } else {
                    i = i5;
                    i2 = i6;
                }
                if (cljVar.c()) {
                    if (i2 > 0) {
                        java.lang.Object[] objArr2 = cfcVar.a;
                        objArr2[i - i2] = objArr2[i];
                    }
                    i6 = i2;
                } else {
                    i6 = i2 + 1;
                }
                i5 = i + 1;
            }
            java.lang.Object[] objArr3 = cfcVar.a;
            int i13 = i4 - i6;
            if (objArr3 == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(objArr3, i13, i4, (java.lang.Object) null);
            cfcVar.b = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v0, types: [cfc] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [clj] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [long] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aomy aomyVar) {
        ?? r6;
        defpackage.clj cljVar;
        long j;
        ?? r10;
        ?? r28;
        defpackage.aonj aonjVar2;
        ?? r12;
        ?? r11;
        ?? r29;
        defpackage.cko clwVar;
        defpackage.cko ckoVarW;
        defpackage.cko ckoVarB;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        long j3;
        int i5;
        long id = java.lang.Thread.currentThread().getId();
        synchronized (this.e) {
            defpackage.clj cljVar2 = this.f;
            java.lang.Object obj2 = null;
            defpackage.aonj aonjVar3 = cljVar2 != null ? cljVar2.a : null;
            r6 = cljVar2;
            if (aonjVar3 != aonjVar) {
                defpackage.cfc cfcVar = this.d;
                java.lang.Object[] objArr = cfcVar.a;
                int i6 = cfcVar.b;
                for (int i7 = 0; i7 < i6; i7++) {
                    java.lang.Object obj3 = objArr[i7];
                    if (((defpackage.clj) obj3).a == aonjVar) {
                        obj2 = obj3;
                        break;
                    }
                }
                defpackage.clj cljVar3 = (defpackage.clj) obj2;
                if (cljVar3 == null) {
                    if (aonjVar == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                    }
                    defpackage.aoov.f(aonjVar, 1);
                    cljVar3 = new defpackage.clj(aonjVar);
                    cfcVar.n(cljVar3);
                }
                r6 = cljVar3;
            }
            cljVar = this.f;
            j = this.i;
        }
        if (j != -1 && j != id) {
            defpackage.cdh.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + id + ", name=" + java.lang.Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            try {
                synchronized (this.e) {
                    try {
                        this.f = r6;
                        this.i = id;
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                }
                defpackage.aonj aonjVar4 = this.h;
                java.lang.Object obj4 = r6.b;
                defpackage.ado adoVar = r6.h;
                int i8 = r6.c;
                r6.b = obj;
                r6.h = (defpackage.ado) r6.e().a(obj);
                ?? r13 = -1;
                r13 = -1;
                if (r6.c == -1) {
                    long jV = defpackage.ckw.b().v();
                    r6.c = (int) (jV ^ (jV >>> 32));
                }
                defpackage.ckj ckjVar = r6.d;
                ?? A = defpackage.ckh.a();
                A.n(ckjVar);
                try {
                    if (aonjVar4 == null) {
                        aomyVar.a();
                        r11 = A;
                        A = A;
                    } else {
                        defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
                        if (ckoVar instanceof defpackage.clw) {
                            try {
                                defpackage.clw clwVar2 = (defpackage.clw) ckoVar;
                                r28 = A;
                                try {
                                    r29 = r28;
                                    if (clwVar2.n == java.lang.Thread.currentThread().getId()) {
                                        defpackage.aonj aonjVar5 = clwVar2.l;
                                        defpackage.aonj aonjVar6 = clwVar2.m;
                                        if (aonjVar5 != null && aonjVar4 != aonjVar5) {
                                            try {
                                                defpackage.bet betVar = new defpackage.bet(aonjVar4, aonjVar5, 4);
                                                aonjVar2 = betVar;
                                                r12 = betVar;
                                            } catch (java.lang.Throwable th2) {
                                                defpackage.clw clwVar3 = (defpackage.clw) ckoVar;
                                                clwVar3.l = aonjVar5;
                                                clwVar3.m = aonjVar6;
                                                throw th2;
                                            }
                                        }
                                        r12 = A;
                                        r12 = A;
                                        aonjVar2 = aonjVar4;
                                        aonjVar2 = aonjVar4;
                                        clwVar2.l = aonjVar2;
                                        clwVar2.m = aonjVar6;
                                        aomyVar.a();
                                        clwVar2.l = aonjVar5;
                                        clwVar2.m = aonjVar6;
                                        r11 = r28;
                                        r13 = aonjVar6;
                                        A = r12;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    r10 = r28;
                                    r10.c(r10.b - 1);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r28 = A;
                            }
                        } else {
                            r29 = A;
                        }
                        try {
                            try {
                                if (ckoVar == null || (ckoVar instanceof defpackage.ckk)) {
                                    defpackage.clw clwVar4 = (defpackage.clw) defpackage.ckw.j.k();
                                    if (clwVar4 != null) {
                                        clwVar4.D((defpackage.ckk) ckoVar, aonjVar4, true, false);
                                        ckoVarB = clwVar4;
                                    } else {
                                        r10 = r29;
                                        try {
                                            r10 = r10;
                                            clwVar = new defpackage.clw((defpackage.ckk) ckoVar, aonjVar4, null, true, false);
                                            ckoVarW = clwVar.w();
                                            aomyVar.a();
                                            defpackage.ckw.i.j(ckoVarW);
                                            clwVar.d();
                                            r11 = r10;
                                            r13 = clwVar;
                                            A = ckoVarW;
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                            r10.c(r10.b - 1);
                                            throw th;
                                        }
                                    }
                                } else {
                                    ckoVarB = ckoVar.b(aonjVar4);
                                }
                                aomyVar.a();
                                defpackage.ckw.i.j(ckoVarW);
                                clwVar.d();
                                r11 = r10;
                                r13 = clwVar;
                                A = ckoVarW;
                            } catch (java.lang.Throwable th6) {
                                try {
                                    defpackage.ckw.i.j(ckoVarW);
                                    throw th6;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    try {
                                        clwVar.d();
                                        throw th;
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        r10.c(r10.b - 1);
                                        throw th;
                                    }
                                }
                            }
                            ckoVarW = clwVar.w();
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                        }
                        r10 = r29;
                        clwVar = ckoVarB;
                    }
                    r11.c(r11.b - 1);
                    java.lang.Object obj5 = r6.b;
                    if (obj5 == null) {
                        defpackage.aooh.g();
                    }
                    int i9 = r6.c;
                    defpackage.ado adoVar2 = r6.h;
                    if (adoVar2 != null) {
                        try {
                            long[] jArr = adoVar2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                int i11 = i9;
                                while (true) {
                                    long j4 = jArr[i10];
                                    j2 = j;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = ~(i10 - length);
                                        int i13 = 0;
                                        while (true) {
                                            i2 = 8 - (i12 >>> 31);
                                            if (i13 >= i2) {
                                                break;
                                            }
                                            if ((j4 & 255) < 128) {
                                                int i14 = (i10 << 3) + i13;
                                                i3 = i12;
                                                try {
                                                    java.lang.Object obj6 = adoVar2.b[i14];
                                                    i4 = i13;
                                                    j3 = j4;
                                                    i5 = i11;
                                                    if (adoVar2.c[i14] != i5) {
                                                        r6.b(obj5, obj6);
                                                        adoVar2.g(i14);
                                                    }
                                                } catch (java.lang.Throwable th10) {
                                                    th = th10;
                                                }
                                            } else {
                                                i3 = i12;
                                                i4 = i13;
                                                j3 = j4;
                                                i5 = i11;
                                            }
                                            i11 = i5;
                                            i13 = i4 + 1;
                                            j4 = j3 >> 8;
                                            i12 = i3;
                                            th = th10;
                                            r6 = j2;
                                            synchronized (this.e) {
                                                this.f = cljVar;
                                                this.i = r6;
                                            }
                                            throw th;
                                        }
                                        i = i11;
                                        if (i2 != 8) {
                                            break;
                                        }
                                    } else {
                                        i = i11;
                                    }
                                    if (i10 == length) {
                                        break;
                                    }
                                    i10++;
                                    i11 = i;
                                    j = j2;
                                }
                            } else {
                                j2 = j;
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    r6.b = obj4;
                    r6.h = adoVar;
                    r6.c = i8;
                    synchronized (this.e) {
                        this.f = cljVar;
                        this.i = j2;
                    }
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    r10 = A;
                }
            } catch (java.lang.Throwable th13) {
                throw th13;
            }
        } catch (java.lang.Throwable th14) {
            th = th14;
            r6 = j;
        }
    }

    public final void d() {
        this.j = defpackage.cfd.V(this.g);
    }

    public final void e() {
        defpackage.apnt apntVar = this.j;
        if (apntVar != null) {
            apntVar.u();
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0257 A[DONT_INVERT, PHI: r25
      0x0257: PHI (r25v51 boolean) = (r25v50 boolean), (r25v52 boolean) binds: [B:119:0x022f, B:127:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x0259 A[Catch: all -> 0x026d, LOOP:10: B:118:0x0225->B:129:0x0259, LOOP_END, TryCatch #7 {all -> 0x026d, blocks: (B:90:0x0178, B:92:0x0182, B:102:0x01be, B:96:0x018d, B:97:0x0196, B:98:0x01a4, B:108:0x01e5, B:109:0x01f5, B:111:0x020f, B:113:0x0215, B:115:0x0219, B:118:0x0225, B:120:0x0231, B:122:0x023d, B:124:0x0243, B:125:0x024d, B:129:0x0259, B:130:0x025c, B:131:0x0265), top: B:428:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0272  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fe A[PHI: r11 r25 r29 r30 r34 r35 r36 r37 r38 r45
      0x02fe: PHI (r11v7 clj) = (r11v5 clj), (r11v8 clj), (r11v8 clj), (r11v8 clj) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r25v39 boolean) = (r25v37 boolean), (r25v40 boolean), (r25v40 boolean), (r25v43 boolean) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r29v23 int) = (r29v24 int), (r29v28 int), (r29v28 int), (r29v28 int) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r30v13 long) = (r30v14 long), (r30v15 long), (r30v15 long), (r30v15 long) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r34v7 java.util.Set) = (r34v8 java.util.Set), (r34v10 java.util.Set), (r34v10 java.util.Set), (r34v10 java.util.Set) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r35v7 java.lang.Object[]) = (r35v8 java.lang.Object[]), (r35v10 java.lang.Object[]), (r35v10 java.lang.Object[]), (r35v10 java.lang.Object[]) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r36v7 int) = (r36v8 int), (r36v10 int), (r36v10 int), (r36v10 int) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r37v10 int) = (r37v11 int), (r37v13 int), (r37v13 int), (r37v13 int) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r38v6 long[]) = (r38v7 long[]), (r38v9 long[]), (r38v9 long[]), (r38v9 long[]) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      0x02fe: PHI (r45v7 int) = (r45v8 int), (r45v10 int), (r45v10 int), (r45v10 int) binds: [B:166:0x02f2, B:145:0x029b, B:149:0x02aa, B:460:0x02fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:259:0x04eb A[DONT_INVERT, PHI: r25
      0x04eb: PHI (r25v15 boolean) = (r25v14 boolean), (r25v16 boolean) binds: [B:250:0x04c3, B:258:0x04e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:260:0x04ed A[Catch: all -> 0x0505, LOOP:24: B:249:0x04b9->B:260:0x04ed, LOOP_END, TryCatch #2 {all -> 0x0505, blocks: (B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7), top: B:419:0x038f, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:288:0x0555 A[DONT_INVERT, PHI: r25
      0x0555: PHI (r25v7 boolean) = (r25v6 boolean), (r25v8 boolean) binds: [B:279:0x052c, B:287:0x0553] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:289:0x0557 A[Catch: all -> 0x0787, LOOP:22: B:278:0x0522->B:289:0x0557, LOOP_END, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:329:0x0634 A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0638 A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:333:0x0643  */
    /* JADX WARN: Code duplicated, block: B:336:0x0650 A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x065c A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:340:0x0662 A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x0670 A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x0680  */
    /* JADX WARN: Code duplicated, block: B:345:0x068c  */
    /* JADX WARN: Code duplicated, block: B:349:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:350:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:352:0x06b1 A[Catch: all -> 0x0787, LOOP:13: B:334:0x0644->B:352:0x06b1, LOOP_END, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x06ba A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x06c6 A[Catch: all -> 0x0787, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:358:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:385:0x074c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:386:0x074e A[Catch: all -> 0x0787, LOOP:15: B:372:0x070a->B:386:0x074e, LOOP_END, TryCatch #5 {all -> 0x0787, blocks: (B:46:0x00b6, B:48:0x00bc, B:168:0x0300, B:52:0x00cc, B:54:0x00d0, B:56:0x00d6, B:141:0x0288, B:142:0x028a, B:138:0x0283, B:144:0x0297, B:146:0x029d, B:148:0x02a1, B:151:0x02ad, B:153:0x02b9, B:155:0x02c5, B:157:0x02cb, B:158:0x02d5, B:163:0x02e3, B:164:0x02e6, B:174:0x0334, B:292:0x0567, B:294:0x056b, B:296:0x0573, B:298:0x057e, B:300:0x0599, B:302:0x05b4, B:304:0x05c6, B:311:0x05e3, B:312:0x05e9, B:309:0x05dc, B:327:0x062a, B:329:0x0634, B:331:0x0638, B:334:0x0644, B:336:0x0650, B:338:0x065c, B:340:0x0662, B:342:0x0670, B:344:0x0684, B:346:0x0692, B:352:0x06b1, B:391:0x0765, B:353:0x06ba, B:355:0x06c6, B:356:0x06cf, B:315:0x05ed, B:317:0x05f1, B:326:0x0627, B:363:0x06e6, B:364:0x06e9, B:318:0x05f7, B:320:0x0601, B:321:0x0609, B:365:0x06ea, B:367:0x06fa, B:369:0x06fe, B:372:0x070a, B:374:0x0716, B:376:0x0723, B:378:0x0729, B:380:0x0734, B:381:0x073d, B:382:0x0742, B:386:0x074e, B:387:0x0751, B:389:0x0757, B:390:0x0760, B:392:0x076d, B:176:0x0358, B:177:0x036a, B:179:0x0370, B:181:0x0378, B:183:0x0382, B:185:0x0386, B:187:0x038c, B:266:0x0502, B:271:0x050c, B:273:0x0512, B:275:0x0516, B:278:0x0522, B:280:0x052e, B:282:0x053b, B:284:0x0541, B:285:0x054b, B:289:0x0557, B:290:0x055a, B:268:0x0506, B:269:0x0509, B:307:0x05ce, B:308:0x05d5, B:188:0x038f, B:190:0x0395, B:192:0x0399, B:195:0x03a5, B:197:0x03b1, B:199:0x03bd, B:201:0x03c3, B:203:0x03d1, B:204:0x03d4, B:206:0x03e0, B:208:0x03e6, B:210:0x03ea, B:213:0x03fe, B:215:0x040c, B:217:0x0418, B:219:0x041e, B:221:0x042e, B:233:0x046a, B:226:0x043f, B:227:0x0444, B:228:0x0452, B:239:0x048b, B:240:0x0495, B:242:0x04a3, B:244:0x04a9, B:246:0x04ad, B:249:0x04b9, B:251:0x04c5, B:253:0x04d1, B:255:0x04d7, B:256:0x04e1, B:260:0x04ed, B:261:0x04f0, B:262:0x04f7, B:323:0x061d, B:325:0x0624, B:360:0x06df, B:361:0x06e4, B:324:0x0621), top: B:425:0x00b6, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:433:0x0796 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x0280 A[EDGE_INSN: B:464:0x0280->B:137:0x0280 BREAK  A[LOOP:10: B:118:0x0225->B:129:0x0259], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0765 A[EDGE_INSN: B:471:0x0765->B:391:0x0765 BREAK  A[LOOP:13: B:334:0x0644->B:352:0x06b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0765 A[EDGE_INSN: B:472:0x0765->B:391:0x0765 BREAK  A[LOOP:13: B:334:0x0644->B:352:0x06b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0765 A[EDGE_INSN: B:477:0x0765->B:391:0x0765 BREAK  A[LOOP:15: B:372:0x070a->B:386:0x074e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0563 A[EDGE_INSN: B:506:0x0563->B:291:0x0563 BREAK  A[LOOP:22: B:278:0x0522->B:289:0x0557], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0501 A[EDGE_INSN: B:512:0x0501->B:265:0x0501 BREAK  A[LOOP:24: B:249:0x04b9->B:260:0x04ed], SYNTHETIC] */
    public final boolean f() throws java.lang.Throwable {
        boolean z;
        java.util.Set set;
        java.lang.Object obj;
        boolean z2;
        int i;
        java.lang.Object[] objArr;
        java.util.Set set2;
        int i2;
        boolean z3;
        java.util.Iterator it;
        boolean z4;
        long[] jArr;
        java.lang.Object[] objArr2;
        java.util.Iterator it2;
        long[] jArr2;
        java.lang.Object[] objArr3;
        long j;
        char c;
        int i3;
        java.lang.Object[] objArr4;
        int i4;
        defpackage.bev bevVar;
        int i5;
        defpackage.cko clwVar;
        defpackage.cko ckoVarW;
        java.lang.Object objA;
        java.lang.Object objA2;
        java.lang.Object[] objArr5;
        long[] jArr3;
        int length;
        int i6;
        long j2;
        int i7;
        int i8;
        java.lang.Object obj2;
        java.lang.Object objA3;
        long[] jArr4;
        int i9;
        long j3;
        int i10;
        int i11;
        long[] jArr5;
        int i12;
        int i13;
        java.lang.Object[] objArr6;
        java.util.Set set3;
        int i14;
        defpackage.clj cljVar;
        boolean z5;
        int i15;
        long[] jArr6;
        long j4;
        int i16;
        defpackage.clj cljVar2;
        int i17;
        java.lang.Object objSubList;
        this = this;
        synchronized (this.e) {
            z = this.c;
        }
        int i18 = 0;
        if (z) {
            return false;
        }
        boolean z6 = false;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
            java.lang.Object obj3 = atomicReference.get();
            if (obj3 == null) {
                set = null;
            } else {
                if (obj3 instanceof java.util.Set) {
                    set = (java.util.Set) obj3;
                } else {
                    if (!(obj3 instanceof java.util.List)) {
                        defpackage.cax.a("Unexpected notification");
                        throw new defpackage.aoiq();
                    }
                    java.util.List list = (java.util.List) obj3;
                    set = (java.util.Set) list.get(i18);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    if (defpackage.anty.Q(atomicReference, obj3, objSubList)) {
                    }
                }
                objSubList = null;
                if (defpackage.anty.Q(atomicReference, obj3, objSubList)) {
                }
            }
            if (set == null) {
                return z6;
            }
            java.lang.Object obj4 = this.e;
            synchronized (obj4) {
                try {
                    defpackage.cfc cfcVar = this.d;
                    java.lang.Object[] objArr7 = cfcVar.a;
                    int i19 = cfcVar.b;
                    int i20 = i18;
                    while (i20 < i19) {
                        defpackage.clj cljVar3 = (defpackage.clj) objArr7[i20];
                        defpackage.adw adwVar = cljVar3.j;
                        defpackage.adw adwVar2 = cljVar3.k;
                        defpackage.adw adwVarF = cljVar3.f();
                        defpackage.ady adyVar = cljVar3.i;
                        if (set instanceof defpackage.cff) {
                            defpackage.ady adyVar2 = ((defpackage.cff) set).a;
                            int i21 = 8;
                            java.lang.Object[] objArr8 = adyVar2.b;
                            long[] jArr7 = adyVar2.a;
                            int length2 = jArr7.length - 2;
                            if (length2 >= 0) {
                                int i22 = 0;
                                z3 = false;
                                while (true) {
                                    long j5 = jArr7[i22];
                                    z2 = z6;
                                    obj = obj4;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j5 & 255) < 128) {
                                                j3 = j5;
                                                try {
                                                    java.lang.Object obj5 = objArr8[(i22 << 3) + i24];
                                                    if (obj5 instanceof defpackage.cls) {
                                                        i10 = i24;
                                                        if (!((defpackage.cls) obj5).j(2)) {
                                                        }
                                                        j5 = j3 >> i14;
                                                        i24 = i10 + 1;
                                                        i21 = i14;
                                                        set = set3;
                                                        objArr7 = objArr6;
                                                        i19 = i13;
                                                        i22 = i12;
                                                        jArr7 = jArr5;
                                                        i20 = i11;
                                                    } else {
                                                        i10 = i24;
                                                    }
                                                    if (cljVar3.e || !defpackage.adw.f(adwVar, obj5)) {
                                                        i13 = i19;
                                                        i12 = i22;
                                                        jArr5 = jArr7;
                                                        objArr6 = objArr7;
                                                        set3 = set;
                                                        i11 = i20;
                                                    } else {
                                                        cljVar3.e = true;
                                                        try {
                                                            java.lang.Object objA4 = adwVar.a(obj5);
                                                            if (objA4 == null) {
                                                                i13 = i19;
                                                                i12 = i22;
                                                                jArr5 = jArr7;
                                                                objArr6 = objArr7;
                                                                set3 = set;
                                                                i11 = i20;
                                                                cljVar = cljVar3;
                                                                cljVar3 = cljVar;
                                                                z5 = false;
                                                            } else {
                                                                if (objA4 instanceof defpackage.ady) {
                                                                    defpackage.ady adyVar3 = (defpackage.ady) objA4;
                                                                    java.lang.Object[] objArr9 = adyVar3.b;
                                                                    long[] jArr8 = adyVar3.a;
                                                                    int length3 = jArr8.length - 2;
                                                                    if (length3 >= 0) {
                                                                        objArr6 = objArr7;
                                                                        set3 = set;
                                                                        int i25 = 0;
                                                                        while (true) {
                                                                            long j6 = jArr8[i25];
                                                                            i13 = i19;
                                                                            i12 = i22;
                                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                                                                                int i27 = 0;
                                                                                while (i27 < i26) {
                                                                                    if ((j6 & 255) < 128) {
                                                                                        i15 = i27;
                                                                                        defpackage.ckg ckgVar = (defpackage.ckg) objArr9[(i25 << 3) + i27];
                                                                                        if (ckgVar == null) {
                                                                                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.IndirectState<kotlin.Any?>");
                                                                                        }
                                                                                        jArr6 = jArr7;
                                                                                        if (ckgVar.b(adwVar2.a(ckgVar))) {
                                                                                            java.lang.Object objA5 = adwVarF.a(ckgVar);
                                                                                            if (objA5 != null) {
                                                                                                if (objA5 instanceof defpackage.ady) {
                                                                                                    defpackage.ady adyVar4 = (defpackage.ady) objA5;
                                                                                                    java.lang.Object[] objArr10 = adyVar4.b;
                                                                                                    long[] jArr9 = adyVar4.a;
                                                                                                    int length4 = jArr9.length - 2;
                                                                                                    if (length4 >= 0) {
                                                                                                        j4 = j6;
                                                                                                        int i28 = 0;
                                                                                                        while (true) {
                                                                                                            long j7 = jArr9[i28];
                                                                                                            i16 = i20;
                                                                                                            cljVar2 = cljVar3;
                                                                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                                                int i29 = 8 - ((~(i28 - length4)) >>> 31);
                                                                                                                for (int i30 = 0; i30 < i29; i30++) {
                                                                                                                    if ((j7 & 255) < 128) {
                                                                                                                        try {
                                                                                                                            adyVar.j(objArr10[(i28 << 3) + i30]);
                                                                                                                            z3 = true;
                                                                                                                        } catch (java.lang.Throwable th) {
                                                                                                                            th = th;
                                                                                                                            cljVar3 = cljVar2;
                                                                                                                            cljVar3.e = false;
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    j7 >>= i21;
                                                                                                                }
                                                                                                                i17 = i21;
                                                                                                                if (i29 != i17) {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            if (i28 != length4) {
                                                                                                                i28++;
                                                                                                                cljVar3 = cljVar2;
                                                                                                                i20 = i16;
                                                                                                                i21 = 8;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    j4 = j6;
                                                                                                    i16 = i20;
                                                                                                    cljVar2 = cljVar3;
                                                                                                    adyVar.j(objA5);
                                                                                                    i17 = 8;
                                                                                                    z3 = true;
                                                                                                }
                                                                                            }
                                                                                            i21 = i17;
                                                                                            cljVar3 = cljVar2;
                                                                                            i20 = i16;
                                                                                            i27 = i15 + 1;
                                                                                            j6 = j4 >> i17;
                                                                                            jArr7 = jArr6;
                                                                                        } else {
                                                                                            j4 = j6;
                                                                                            i16 = i20;
                                                                                            cljVar2 = cljVar3;
                                                                                            cljVar2.a().n(ckgVar);
                                                                                        }
                                                                                        i17 = 8;
                                                                                        i21 = i17;
                                                                                        cljVar3 = cljVar2;
                                                                                        i20 = i16;
                                                                                        i27 = i15 + 1;
                                                                                        j6 = j4 >> i17;
                                                                                        jArr7 = jArr6;
                                                                                    } else {
                                                                                        i15 = i27;
                                                                                        jArr6 = jArr7;
                                                                                    }
                                                                                    j4 = j6;
                                                                                    i16 = i20;
                                                                                    cljVar2 = cljVar3;
                                                                                    i17 = 8;
                                                                                    i21 = i17;
                                                                                    cljVar3 = cljVar2;
                                                                                    i20 = i16;
                                                                                    i27 = i15 + 1;
                                                                                    j6 = j4 >> i17;
                                                                                    jArr7 = jArr6;
                                                                                }
                                                                                jArr5 = jArr7;
                                                                                i11 = i20;
                                                                                cljVar = cljVar3;
                                                                                if (i26 == i21) {
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            }
                                                                            jArr5 = jArr7;
                                                                            i11 = i20;
                                                                            cljVar = cljVar3;
                                                                            if (i25 == length3) {
                                                                                break;
                                                                            }
                                                                            i25++;
                                                                            i19 = i13;
                                                                            i22 = i12;
                                                                            jArr7 = jArr5;
                                                                            cljVar3 = cljVar;
                                                                            i20 = i11;
                                                                            i21 = 8;
                                                                        }
                                                                    } else {
                                                                        i13 = i19;
                                                                        i12 = i22;
                                                                        jArr5 = jArr7;
                                                                        objArr6 = objArr7;
                                                                        set3 = set;
                                                                        i11 = i20;
                                                                        cljVar = cljVar3;
                                                                    }
                                                                } else {
                                                                    i13 = i19;
                                                                    i12 = i22;
                                                                    jArr5 = jArr7;
                                                                    objArr6 = objArr7;
                                                                    set3 = set;
                                                                    i11 = i20;
                                                                    cljVar = cljVar3;
                                                                    defpackage.ckg ckgVar2 = (defpackage.ckg) objA4;
                                                                    if (ckgVar2.b(adwVar2.a(ckgVar2))) {
                                                                        java.lang.Object objA6 = adwVarF.a(ckgVar2);
                                                                        if (objA6 == null) {
                                                                            break;
                                                                        }
                                                                        if (objA6 instanceof defpackage.ady) {
                                                                            defpackage.ady adyVar5 = (defpackage.ady) objA6;
                                                                            java.lang.Object[] objArr11 = adyVar5.b;
                                                                            long[] jArr10 = adyVar5.a;
                                                                            int length5 = jArr10.length - 2;
                                                                            if (length5 >= 0) {
                                                                                int i31 = 0;
                                                                                while (true) {
                                                                                    long j8 = jArr10[i31];
                                                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                        if (i31 != length5) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        i31++;
                                                                                    } else {
                                                                                        int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                                                        for (int i33 = 0; i33 < i32; i33++) {
                                                                                            if ((j8 & 255) < 128) {
                                                                                                adyVar.j(objArr11[(i31 << 3) + i33]);
                                                                                                z3 = true;
                                                                                            }
                                                                                            j8 >>= 8;
                                                                                        }
                                                                                        if (i32 != 8) {
                                                                                            break;
                                                                                        }
                                                                                        if (i31 != length5) {
                                                                                            break;
                                                                                        }
                                                                                        i31++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            adyVar.j(objA6);
                                                                            cljVar3 = cljVar;
                                                                            z5 = false;
                                                                            z3 = true;
                                                                        }
                                                                    } else {
                                                                        cljVar.a().n(ckgVar2);
                                                                    }
                                                                }
                                                                cljVar3 = cljVar;
                                                                z5 = false;
                                                            }
                                                            cljVar3.e = z5;
                                                        } catch (java.lang.Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                    java.lang.Object objA7 = adwVarF.a(obj5);
                                                    if (objA7 == null) {
                                                        i14 = 8;
                                                        break;
                                                    }
                                                    if (objA7 instanceof defpackage.ady) {
                                                        defpackage.ady adyVar6 = (defpackage.ady) objA7;
                                                        java.lang.Object[] objArr12 = adyVar6.b;
                                                        long[] jArr11 = adyVar6.a;
                                                        int length6 = jArr11.length - 2;
                                                        if (length6 < 0) {
                                                            i14 = 8;
                                                            break;
                                                            break;
                                                        }
                                                        int i34 = 0;
                                                        while (true) {
                                                            long j9 = jArr11[i34];
                                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i35 = 8 - ((~(i34 - length6)) >>> 31);
                                                                for (int i36 = 0; i36 < i35; i36++) {
                                                                    if ((j9 & 255) < 128) {
                                                                        adyVar.j(objArr12[(i34 << 3) + i36]);
                                                                        z3 = true;
                                                                    }
                                                                    j9 >>= 8;
                                                                }
                                                                if (i35 != 8) {
                                                                    i14 = 8;
                                                                    break;
                                                                }
                                                            }
                                                            if (i34 == length6) {
                                                                i14 = 8;
                                                                break;
                                                                break;
                                                            }
                                                            i34++;
                                                        }
                                                    } else {
                                                        adyVar.j(objA7);
                                                        i14 = 8;
                                                        z3 = true;
                                                    }
                                                    j5 = j3 >> i14;
                                                    i24 = i10 + 1;
                                                    i21 = i14;
                                                    set = set3;
                                                    objArr7 = objArr6;
                                                    i19 = i13;
                                                    i22 = i12;
                                                    jArr7 = jArr5;
                                                    i20 = i11;
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    throw th;
                                                }
                                            } else {
                                                j3 = j5;
                                                i10 = i24;
                                            }
                                            i13 = i19;
                                            i12 = i22;
                                            jArr5 = jArr7;
                                            objArr6 = objArr7;
                                            set3 = set;
                                            i11 = i20;
                                            i14 = 8;
                                            break;
                                            j5 = j3 >> i14;
                                            i24 = i10 + 1;
                                            i21 = i14;
                                            set = set3;
                                            objArr7 = objArr6;
                                            i19 = i13;
                                            i22 = i12;
                                            jArr7 = jArr5;
                                            i20 = i11;
                                        }
                                        i = i19;
                                        int i37 = i22;
                                        jArr4 = jArr7;
                                        objArr = objArr7;
                                        set2 = set;
                                        i2 = i20;
                                        if (i23 != i21) {
                                            break;
                                        }
                                        i9 = i37;
                                    } else {
                                        i = i19;
                                        jArr4 = jArr7;
                                        objArr = objArr7;
                                        set2 = set;
                                        i2 = i20;
                                        i9 = i22;
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i22 = i9 + 1;
                                    obj4 = obj;
                                    z6 = z2;
                                    set = set2;
                                    objArr7 = objArr;
                                    i19 = i;
                                    jArr7 = jArr4;
                                    i20 = i2;
                                    i21 = 8;
                                }
                            } else {
                                z2 = z6;
                                obj = obj4;
                                i = i19;
                                objArr = objArr7;
                                set2 = set;
                                i2 = i20;
                                z3 = false;
                            }
                        } else {
                            z2 = z6;
                            obj = obj4;
                            i = i19;
                            objArr = objArr7;
                            set2 = set;
                            i2 = i20;
                            java.util.Iterator it3 = set2.iterator();
                            z3 = false;
                            while (it3.hasNext()) {
                                java.lang.Object next = it3.next();
                                if (!(next instanceof defpackage.cls) || ((defpackage.cls) next).j(2)) {
                                    if (cljVar3.e || !defpackage.adw.f(adwVar, next)) {
                                        it = it3;
                                    } else {
                                        cljVar3.e = true;
                                        try {
                                            java.lang.Object objA8 = adwVar.a(next);
                                            if (objA8 == null) {
                                                it = it3;
                                                z4 = false;
                                            } else {
                                                if (objA8 instanceof defpackage.ady) {
                                                    defpackage.ady adyVar7 = (defpackage.ady) objA8;
                                                    java.lang.Object[] objArr13 = adyVar7.b;
                                                    long[] jArr12 = adyVar7.a;
                                                    int length7 = jArr12.length - 2;
                                                    if (length7 >= 0) {
                                                        int i38 = 0;
                                                        while (true) {
                                                            long j10 = jArr12[i38];
                                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                                int i40 = 0;
                                                                while (i40 < i39) {
                                                                    if ((j10 & 255) < 128) {
                                                                        defpackage.ckg ckgVar3 = (defpackage.ckg) objArr13[(i38 << 3) + i40];
                                                                        if (ckgVar3 == null) {
                                                                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.IndirectState<kotlin.Any?>");
                                                                        }
                                                                        it2 = it3;
                                                                        if (ckgVar3.b(adwVar2.a(ckgVar3))) {
                                                                            java.lang.Object objA9 = adwVarF.a(ckgVar3);
                                                                            if (objA9 != null) {
                                                                                if (objA9 instanceof defpackage.ady) {
                                                                                    defpackage.ady adyVar8 = (defpackage.ady) objA9;
                                                                                    java.lang.Object[] objArr14 = adyVar8.b;
                                                                                    long[] jArr13 = adyVar8.a;
                                                                                    jArr2 = jArr12;
                                                                                    int length8 = jArr13.length - 2;
                                                                                    if (length8 >= 0) {
                                                                                        objArr3 = objArr13;
                                                                                        int i41 = 0;
                                                                                        while (true) {
                                                                                            long j11 = jArr13[i41];
                                                                                            j = j10;
                                                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                                int i42 = 8 - ((~(i41 - length8)) >>> 31);
                                                                                                int i43 = 0;
                                                                                                while (i43 < i42) {
                                                                                                    if ((j11 & 255) < 128) {
                                                                                                        adyVar.j(objArr14[(i41 << 3) + i43]);
                                                                                                        z3 = true;
                                                                                                    }
                                                                                                    i43++;
                                                                                                    j11 >>= 8;
                                                                                                }
                                                                                                if (i42 != 8) {
                                                                                                    c = '\b';
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (i41 != length8) {
                                                                                                i41++;
                                                                                                j10 = j;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    jArr2 = jArr12;
                                                                                    objArr3 = objArr13;
                                                                                    j = j10;
                                                                                    adyVar.j(objA9);
                                                                                    c = '\b';
                                                                                    z3 = true;
                                                                                }
                                                                                i40++;
                                                                                j10 = j >> c;
                                                                                it3 = it2;
                                                                                jArr12 = jArr2;
                                                                                objArr13 = objArr3;
                                                                            }
                                                                            objArr3 = objArr13;
                                                                            j = j10;
                                                                        } else {
                                                                            jArr2 = jArr12;
                                                                            objArr3 = objArr13;
                                                                            j = j10;
                                                                            cljVar3.a().n(ckgVar3);
                                                                        }
                                                                        c = '\b';
                                                                        i40++;
                                                                        j10 = j >> c;
                                                                        it3 = it2;
                                                                        jArr12 = jArr2;
                                                                        objArr13 = objArr3;
                                                                    } else {
                                                                        it2 = it3;
                                                                    }
                                                                    jArr2 = jArr12;
                                                                    objArr3 = objArr13;
                                                                    j = j10;
                                                                    c = '\b';
                                                                    i40++;
                                                                    j10 = j >> c;
                                                                    it3 = it2;
                                                                    jArr12 = jArr2;
                                                                    objArr13 = objArr3;
                                                                }
                                                                it = it3;
                                                                jArr = jArr12;
                                                                objArr2 = objArr13;
                                                                if (i39 == 8) {
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            it = it3;
                                                            jArr = jArr12;
                                                            objArr2 = objArr13;
                                                            if (i38 == length7) {
                                                                break;
                                                            }
                                                            i38++;
                                                            it3 = it;
                                                            jArr12 = jArr;
                                                            objArr13 = objArr2;
                                                        }
                                                    } else {
                                                        it = it3;
                                                    }
                                                } else {
                                                    it = it3;
                                                    defpackage.ckg ckgVar4 = (defpackage.ckg) objA8;
                                                    if (ckgVar4.b(adwVar2.a(ckgVar4))) {
                                                        java.lang.Object objA10 = adwVarF.a(ckgVar4);
                                                        if (objA10 == null) {
                                                            break;
                                                        }
                                                        if (objA10 instanceof defpackage.ady) {
                                                            defpackage.ady adyVar9 = (defpackage.ady) objA10;
                                                            java.lang.Object[] objArr15 = adyVar9.b;
                                                            long[] jArr14 = adyVar9.a;
                                                            int length9 = jArr14.length - 2;
                                                            if (length9 >= 0) {
                                                                int i44 = 0;
                                                                while (true) {
                                                                    long j12 = jArr14[i44];
                                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        if (i44 != length9) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i44++;
                                                                    } else {
                                                                        int i45 = 8 - ((~(i44 - length9)) >>> 31);
                                                                        for (int i46 = 0; i46 < i45; i46++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                adyVar.j(objArr15[(i44 << 3) + i46]);
                                                                                z3 = true;
                                                                            }
                                                                            j12 >>= 8;
                                                                        }
                                                                        if (i45 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i44 != length9) {
                                                                            break;
                                                                        }
                                                                        i44++;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            adyVar.j(objA10);
                                                            z4 = false;
                                                            z3 = true;
                                                        }
                                                    } else {
                                                        cljVar3.a().n(ckgVar4);
                                                    }
                                                }
                                                z4 = false;
                                            }
                                            cljVar3.e = z4;
                                        } catch (java.lang.Throwable th4) {
                                            cljVar3.e = false;
                                            throw th4;
                                        }
                                    }
                                    java.lang.Object objA11 = adwVarF.a(next);
                                    if (objA11 != null) {
                                        if (objA11 instanceof defpackage.ady) {
                                            defpackage.ady adyVar10 = (defpackage.ady) objA11;
                                            java.lang.Object[] objArr16 = adyVar10.b;
                                            long[] jArr15 = adyVar10.a;
                                            int length10 = jArr15.length - 2;
                                            if (length10 >= 0) {
                                                int i47 = 0;
                                                while (true) {
                                                    long j13 = jArr15[i47];
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i47 != length10) {
                                                            break;
                                                            break;
                                                        }
                                                        i47++;
                                                    } else {
                                                        int i48 = 8 - ((~(i47 - length10)) >>> 31);
                                                        long j14 = j13;
                                                        for (int i49 = 0; i49 < i48; i49++) {
                                                            if ((j14 & 255) < 128) {
                                                                adyVar.j(objArr16[(i47 << 3) + i49]);
                                                                z3 = true;
                                                            }
                                                            j14 >>= 8;
                                                        }
                                                        if (i48 != 8) {
                                                            break;
                                                        }
                                                        if (i47 != length10) {
                                                            break;
                                                        }
                                                        i47++;
                                                    }
                                                }
                                            }
                                        } else {
                                            adyVar.j(objA11);
                                            it3 = it;
                                            z3 = true;
                                        }
                                    }
                                    it3 = it;
                                }
                            }
                        }
                        if (!cljVar3.e && cljVar3.a().b != 0) {
                            defpackage.cfc cfcVarA = cljVar3.a();
                            java.lang.Object[] objArr17 = cfcVarA.a;
                            int i50 = cfcVarA.b;
                            int i51 = 0;
                            while (i51 < i50) {
                                defpackage.ckg ckgVar5 = (defpackage.ckg) objArr17[i51];
                                defpackage.adw adwVarE = cljVar3.e();
                                long jV = defpackage.ckw.b().v();
                                int i52 = (int) (jV ^ (jV >>> 32));
                                int i53 = 6;
                                if (ckgVar5 instanceof defpackage.cbg) {
                                    defpackage.cfg.b(adwVar, ckgVar5);
                                    defpackage.bet betVar = new defpackage.bet(cljVar3, ckgVar5, i53, null);
                                    defpackage.bev bevVar2 = new defpackage.bev(cljVar3, ckgVar5, 5);
                                    defpackage.ajxw ajxwVar = defpackage.ckw.i;
                                    defpackage.cko ckoVar = (defpackage.cko) ajxwVar.i();
                                    try {
                                        try {
                                            if (ckoVar instanceof defpackage.clw) {
                                                defpackage.clw clwVar2 = (defpackage.clw) ckoVar;
                                                bevVar = bevVar2;
                                                if (clwVar2.n == java.lang.Thread.currentThread().getId()) {
                                                    defpackage.aonj aonjVar = clwVar2.l;
                                                    defpackage.aonj aonjVar2 = clwVar2.m;
                                                    if (aonjVar != null && betVar != aonjVar) {
                                                        try {
                                                            betVar = new defpackage.bet(betVar, aonjVar, 4);
                                                        } catch (java.lang.Throwable th5) {
                                                            defpackage.clw clwVar3 = (defpackage.clw) ckoVar;
                                                            clwVar3.l = aonjVar;
                                                            clwVar3.m = aonjVar2;
                                                            throw th5;
                                                        }
                                                    }
                                                    clwVar2.l = betVar;
                                                    clwVar2.m = aonjVar2;
                                                    bevVar.a();
                                                    clwVar2.l = aonjVar;
                                                    clwVar2.m = aonjVar2;
                                                    i5 = 0;
                                                }
                                                objA = cljVar3.f().a(ckgVar5);
                                                if (objA == null) {
                                                    i3 = i50;
                                                    objArr4 = objArr17;
                                                    i4 = i51;
                                                } else if (objA instanceof defpackage.ady) {
                                                    defpackage.ady adyVar11 = (defpackage.ady) objA;
                                                    objArr5 = adyVar11.b;
                                                    jArr3 = adyVar11.a;
                                                    length = jArr3.length - 2;
                                                    if (length >= 0) {
                                                        i6 = i5;
                                                        while (true) {
                                                            j2 = jArr3[i6];
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                i7 = 8 - ((~(i6 - length)) >>> 31);
                                                                i8 = 0;
                                                                while (i8 < i7) {
                                                                    if ((j2 & 255) < 128) {
                                                                        obj2 = objArr5[(i6 << 3) + i8];
                                                                        objA3 = adwVarE.a(obj2);
                                                                        if (objA3 == null) {
                                                                            defpackage.ado adoVar = new defpackage.ado(6);
                                                                            adwVarE.n(obj2, adoVar);
                                                                            objA3 = adoVar;
                                                                        }
                                                                        ((defpackage.ado) objA3).i(ckgVar5, i52);
                                                                    } else {
                                                                        objArr17 = objArr17;
                                                                        i51 = i51;
                                                                    }
                                                                    j2 >>= 8;
                                                                    i8++;
                                                                    i50 = i50;
                                                                    objArr17 = objArr17;
                                                                    i51 = i51;
                                                                }
                                                                i3 = i50;
                                                                objArr4 = objArr17;
                                                                i4 = i51;
                                                                if (i7 == 8) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i3 = i50;
                                                                objArr4 = objArr17;
                                                                i4 = i51;
                                                            }
                                                            if (i6 != length) {
                                                                break;
                                                            }
                                                            i6++;
                                                            i50 = i3;
                                                            objArr17 = objArr4;
                                                            i51 = i4;
                                                        }
                                                    } else {
                                                        i3 = i50;
                                                        objArr4 = objArr17;
                                                        i4 = i51;
                                                    }
                                                } else {
                                                    i3 = i50;
                                                    objArr4 = objArr17;
                                                    i4 = i51;
                                                    objA2 = adwVarE.a(objA);
                                                    if (objA2 == null) {
                                                        objA2 = new defpackage.ado(6);
                                                        adwVarE.n(objA, objA2);
                                                    }
                                                    ((defpackage.ado) objA2).i(ckgVar5, i52);
                                                }
                                            } else {
                                                bevVar = bevVar2;
                                            }
                                            bevVar.a();
                                            ajxwVar.j(ckoVarW);
                                            clwVar.d();
                                            objA = cljVar3.f().a(ckgVar5);
                                            if (objA == null) {
                                                i3 = i50;
                                                objArr4 = objArr17;
                                                i4 = i51;
                                            } else if (objA instanceof defpackage.ady) {
                                                defpackage.ady adyVar12 = (defpackage.ady) objA;
                                                objArr5 = adyVar12.b;
                                                jArr3 = adyVar12.a;
                                                length = jArr3.length - 2;
                                                if (length >= 0) {
                                                    i6 = i5;
                                                    while (true) {
                                                        j2 = jArr3[i6];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            i7 = 8 - ((~(i6 - length)) >>> 31);
                                                            i8 = 0;
                                                            while (i8 < i7) {
                                                                if ((j2 & 255) < 128) {
                                                                    obj2 = objArr5[(i6 << 3) + i8];
                                                                    objA3 = adwVarE.a(obj2);
                                                                    if (objA3 == null) {
                                                                        defpackage.ado adoVar2 = new defpackage.ado(6);
                                                                        adwVarE.n(obj2, adoVar2);
                                                                        objA3 = adoVar2;
                                                                    }
                                                                    ((defpackage.ado) objA3).i(ckgVar5, i52);
                                                                } else {
                                                                    objArr17 = objArr17;
                                                                    i51 = i51;
                                                                }
                                                                j2 >>= 8;
                                                                i8++;
                                                                i50 = i50;
                                                                objArr17 = objArr17;
                                                                i51 = i51;
                                                            }
                                                            i3 = i50;
                                                            objArr4 = objArr17;
                                                            i4 = i51;
                                                            if (i7 == 8) {
                                                                break;
                                                                break;
                                                            }
                                                        } else {
                                                            i3 = i50;
                                                            objArr4 = objArr17;
                                                            i4 = i51;
                                                        }
                                                        if (i6 != length) {
                                                            break;
                                                            break;
                                                        }
                                                        i6++;
                                                        i50 = i3;
                                                        objArr17 = objArr4;
                                                        i51 = i4;
                                                    }
                                                } else {
                                                    i3 = i50;
                                                    objArr4 = objArr17;
                                                    i4 = i51;
                                                }
                                            } else {
                                                i3 = i50;
                                                objArr4 = objArr17;
                                                i4 = i51;
                                                objA2 = adwVarE.a(objA);
                                                if (objA2 == null) {
                                                    objA2 = new defpackage.ado(6);
                                                    adwVarE.n(objA, objA2);
                                                }
                                                ((defpackage.ado) objA2).i(ckgVar5, i52);
                                            }
                                        } catch (java.lang.Throwable th6) {
                                            defpackage.ckw.i.j(ckoVarW);
                                            throw th6;
                                        }
                                        ckoVarW = clwVar.w();
                                    } catch (java.lang.Throwable th7) {
                                        clwVar.d();
                                        throw th7;
                                    }
                                    if (ckoVar == null || (ckoVar instanceof defpackage.ckk)) {
                                        defpackage.clw clwVar4 = (defpackage.clw) defpackage.ckw.j.k();
                                        if (clwVar4 != null) {
                                            i5 = 0;
                                            clwVar4.D((defpackage.ckk) ckoVar, betVar, true, false);
                                            clwVar = clwVar4;
                                        } else {
                                            i5 = 0;
                                            clwVar = new defpackage.clw((defpackage.ckk) ckoVar, betVar, null, true, false);
                                        }
                                    } else {
                                        i5 = 0;
                                        clwVar = ckoVar.b(betVar);
                                    }
                                } else {
                                    i3 = i50;
                                    objArr4 = objArr17;
                                    i4 = i51;
                                    java.lang.Object objA12 = cljVar3.f().a(ckgVar5);
                                    if (objA12 != null) {
                                        if (objA12 instanceof defpackage.ady) {
                                            defpackage.ady adyVar13 = (defpackage.ady) objA12;
                                            java.lang.Object[] objArr18 = adyVar13.b;
                                            long[] jArr16 = adyVar13.a;
                                            int length11 = jArr16.length - 2;
                                            if (length11 >= 0) {
                                                int i54 = 0;
                                                while (true) {
                                                    long j15 = jArr16[i54];
                                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i54 != length11) {
                                                            break;
                                                            break;
                                                        }
                                                        i54++;
                                                    } else {
                                                        int i55 = 8 - ((~(i54 - length11)) >>> 31);
                                                        long j16 = j15;
                                                        for (int i56 = 0; i56 < i55; i56++) {
                                                            if ((j16 & 255) < 128) {
                                                                java.lang.Object obj6 = objArr18[(i54 << 3) + i56];
                                                                java.lang.Object objA13 = adwVarE.a(obj6);
                                                                if (objA13 == null) {
                                                                    objA13 = new defpackage.ado(6);
                                                                    adwVarE.n(obj6, objA13);
                                                                }
                                                                cljVar3.g(ckgVar5, i52, obj6, (defpackage.ado) objA13);
                                                            }
                                                            j16 >>= 8;
                                                        }
                                                        if (i55 != 8) {
                                                            break;
                                                        }
                                                        if (i54 != length11) {
                                                            break;
                                                        }
                                                        i54++;
                                                    }
                                                }
                                            }
                                        } else {
                                            java.lang.Object objA14 = adwVarE.a(objA12);
                                            if (objA14 == null) {
                                                objA14 = new defpackage.ado(6);
                                                adwVarE.n(objA12, objA14);
                                            }
                                            cljVar3.g(ckgVar5, i52, objA12, (defpackage.ado) objA14);
                                        }
                                    }
                                }
                                i51 = i4 + 1;
                                i50 = i3;
                                objArr17 = objArr4;
                            }
                            cljVar3.a().g();
                        }
                        z6 = z3 || z2;
                        i20 = i2 + 1;
                        obj4 = obj;
                        set = set2;
                        objArr7 = objArr;
                        i19 = i;
                    }
                    i18 = 0;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    obj = obj4;
                }
            }
        }
    }
}
