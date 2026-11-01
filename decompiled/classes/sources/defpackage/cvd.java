package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cvd extends defpackage.cve {
    public final defpackage.cmv a;
    private defpackage.cxi g;
    private defpackage.cvf h;
    private defpackage.cvf i;
    private boolean j;
    public final defpackage.vm c = new defpackage.vm((byte[]) null);
    private final defpackage.adb f = new defpackage.adb(2);
    public boolean b = true;
    private boolean k = true;

    public cvd(defpackage.cmv cmvVar) {
        this.a = cmvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [cfc] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cfc] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cmv] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cmv] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void a() {
        defpackage.cfc cfcVar = this.d;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cvd) objArr[i2]).a();
        }
        ?? X = this.a;
        ?? cfcVar2 = 0;
        while (X != 0) {
            if (X instanceof defpackage.ddb) {
                ((defpackage.ddb) X).n();
            } else if ((X.u & 16) != 0 && (X instanceof defpackage.dap)) {
                defpackage.cmv cmvVar = ((defpackage.dap) X).F;
                int i3 = 0;
                cfcVar2 = cfcVar2;
                X = X;
                while (cmvVar != null) {
                    if ((cmvVar.u & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            cfcVar2 = cfcVar2;
                            X = cmvVar;
                        } else {
                            if (cfcVar2 == 0) {
                                cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                            }
                            if (X != 0) {
                                cfcVar2.n(X);
                            }
                            cfcVar2.n(cmvVar);
                            X = 0;
                        }
                    }
                    cmvVar = cmvVar.x;
                    cfcVar2 = cfcVar2;
                    X = X;
                }
                if (i3 != 1) {
                }
            }
            X = defpackage.cfo.x(cfcVar2);
        }
    }

    public final void b(long j, defpackage.adq adqVar) {
        defpackage.vm vmVar = this.c;
        if (vmVar.f(j) && !adqVar.e(this)) {
            vmVar.h(j);
            this.f.h(j);
        }
        defpackage.cfc cfcVar = this.d;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cvd) objArr[i2]).b(j, adqVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0310  */
    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cve
    public final boolean c(defpackage.adb adbVar, defpackage.cxi cxiVar, aae aaeVar, boolean z) {
        java.lang.Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        super.c(adbVar, cxiVar, aaeVar, z);
        ?? X = this.a;
        boolean z2 = true;
        if (!X.D) {
            return true;
        }
        ?? cfcVar = 0;
        while (X != 0) {
            if (X instanceof defpackage.ddb) {
                this.g = defpackage.cfo.B((defpackage.ddb) X, 16);
            } else if ((X.u & 16) != 0 && (X instanceof defpackage.dap)) {
                defpackage.cmv cmvVar = ((defpackage.dap) X).F;
                int i5 = 0;
                while (cmvVar != null) {
                    if ((cmvVar.u & 16) != 0) {
                        i5++;
                        if (i5 == 1) {
                            X = X;
                            cfcVar = cfcVar;
                            cfcVar = cfcVar;
                            X = cmvVar;
                        } else {
                            if (cfcVar == 0) {
                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                            }
                            if (X != 0) {
                                cfcVar.n(X);
                            }
                            cfcVar.n(cmvVar);
                            X = 0;
                        }
                    } else {
                        X = X;
                        cfcVar = cfcVar;
                    }
                    cmvVar = cmvVar.x;
                    X = X;
                    cfcVar = cfcVar;
                }
                if (i5 != 1) {
                    X = X;
                    cfcVar = cfcVar;
                } else {
                    X = X;
                    cfcVar = cfcVar;
                }
            }
            X = defpackage.cfo.x(cfcVar);
        }
        if (this.g == null) {
            return true;
        }
        int i6 = 0;
        for (int iB = adbVar.b(); i6 < iB; iB = iB) {
            long jC = adbVar.c(i6);
            cvm cvmVar = (cvm) adbVar.e(i6);
            if (this.c.f(jC)) {
                long j = cvmVar.g;
                long j2 = cvmVar.c;
                if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(cvmVar.a().size());
                    java.util.List listA = cvmVar.a();
                    int size = listA.size();
                    int i7 = 0;
                    while (i7 < size) {
                        int i8 = i7;
                        cuy cuyVar = (cuy) listA.get(i7);
                        java.util.List list = listA;
                        int i9 = i6;
                        long j3 = cuyVar.b;
                        long j4 = jC;
                        int i10 = size;
                        if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            long j5 = cuyVar.a;
                            defpackage.cxi cxiVar2 = this.g;
                            if (cxiVar2 == null) {
                                defpackage.aooh.g();
                            }
                            arrayList.add(new cuy(j5, cxiVar2.i(cxiVar, j3), cuyVar.c, cuyVar.d, cuyVar.e));
                        }
                        i7 = i8 + 1;
                        size = i10;
                        listA = list;
                        i6 = i9;
                        jC = j4;
                    }
                    i4 = i6;
                    long j6 = jC;
                    defpackage.adb adbVar2 = this.f;
                    defpackage.cxi cxiVar3 = this.g;
                    if (cxiVar3 == null) {
                        defpackage.aooh.g();
                    }
                    long jI = cxiVar3.i(cxiVar, j);
                    defpackage.cxi cxiVar4 = this.g;
                    if (cxiVar4 == null) {
                        defpackage.aooh.g();
                    }
                    cvm cvmVar2 = new cvm(cvmVar.a, cvmVar.b, cxiVar4.i(cxiVar, j2), cvmVar.d, cvmVar.e, cvmVar.f, jI, cvmVar.h, false, cvmVar.i, arrayList, cvmVar.j, cvmVar.k, cvmVar.l, cvmVar.m);
                    cvm cvmVar3 = cvmVar.n;
                    if (cvmVar3 == null) {
                        cvmVar3 = cvmVar;
                    }
                    cvmVar2.n = cvmVar3;
                    cvm cvmVar4 = cvmVar.n;
                    if (cvmVar4 != null) {
                        cvmVar = cvmVar4;
                    }
                    cvmVar2.n = cvmVar;
                    adbVar2.g(j6, cvmVar2);
                } else {
                    i4 = i6;
                }
            } else {
                i4 = i6;
            }
            i6 = i4 + 1;
            z2 = z2;
        }
        boolean z3 = z2;
        defpackage.adb adbVar3 = this.f;
        boolean zJ = adbVar3.j();
        defpackage.vm vmVar = this.c;
        if (zJ) {
            vmVar.a = 0;
            this.d.g();
            return z3;
        }
        int i11 = vmVar.a;
        while (true) {
            i11--;
            if (i11 < 0) {
                break;
            }
            if (!adbVar.i(((long[]) vmVar.b)[i11]) && i11 < (i3 = vmVar.a)) {
                int i12 = i3 - 1;
                int i13 = i11;
                while (i13 < i12) {
                    int i14 = i13 + 1;
                    long[] jArr = (long[]) vmVar.b;
                    jArr[i13] = jArr[i14];
                    i13 = i14;
                }
                vmVar.a--;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(adbVar3.b());
        int iB2 = adbVar3.b();
        for (int i15 = 0; i15 < iB2; i15++) {
            arrayList2.add(adbVar3.e(i15));
        }
        defpackage.cvf cvfVar = new defpackage.cvf(arrayList2, aaeVar);
        java.util.List list2 = cvfVar.a;
        int size2 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                obj = null;
                break;
            }
            java.lang.Object obj2 = list2.get(i16);
            if (aaeVar.b(((cvm) obj2).a)) {
                obj = obj2;
                break;
            }
            i16++;
        }
        cvm cvmVar5 = (cvm) obj;
        if (cvmVar5 != null) {
            if (!z) {
                this.b = false;
            } else if (!this.b && (cvmVar5.d || cvmVar5.h || aaeVar.c() == 5)) {
                defpackage.cxi cxiVar5 = this.g;
                if (cxiVar5 == null) {
                    defpackage.aooh.g();
                }
                long j7 = cvmVar5.c;
                long jH = cxiVar5.h();
                long j8 = jH >> 32;
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j7 >> 32));
                float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j7 & 4294967295L));
                this.b = ~(((fIntBitsToFloat > 0.0f ? 1 : (fIntBitsToFloat == 0.0f ? 0 : -1)) >>> 31) | (fIntBitsToFloat > ((float) ((int) j8)) ? z3 : 0) | ((fIntBitsToFloat2 > 0.0f ? 1 : (fIntBitsToFloat2 == 0.0f ? 0 : -1)) >>> 31) | (fIntBitsToFloat2 > ((float) ((int) (jH & 4294967295L))) ? z3 : 0));
            }
            boolean z4 = (aaeVar.c() == 5 || (i2 = cvfVar.e) == 10 || i2 == 11 || i2 == 12) ? z3 : false;
            boolean z5 = this.b;
            boolean z6 = this.j;
            if (z5 == z6) {
                i = cvfVar.e;
                if (i == 4 ? !(i != 5 || !z5 || !cvmVar5.d) : !(!z6 || this.k)) {
                    cvfVar.e = 3;
                }
            } else if (z4) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
                int size3 = arrayList2.size();
                int i17 = 0;
                while (i17 < size3) {
                    cvm cvmVar6 = (cvm) arrayList2.get(i17);
                    arrayList3.add(new cvm(cvmVar6.a, cvmVar6.b, cvmVar6.c, cvmVar6.d, cvmVar6.e, cvmVar6.f, cvmVar6.g, cvmVar6.h, cvmVar6.c(), cvmVar6.i, cvmVar6.a(), cvmVar6.j, cvmVar6.k, cvmVar6.l, cvmVar6.m));
                    i17++;
                    size3 = size3;
                    arrayList2 = arrayList2;
                }
                defpackage.cvf cvfVar2 = new defpackage.cvf(arrayList3, aaeVar);
                cvfVar2.e = z3 != this.b ? 5 : 4;
                this.i = cvfVar2;
            } else {
                int i18 = cvfVar.e;
                if (i18 == 3 || i18 == 4 || i18 == 5) {
                    cvfVar.e = true != z5 ? 5 : 4;
                } else {
                    i = cvfVar.e;
                    if (i == 4) {
                    }
                }
            }
        }
        this.h = cvfVar;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [cmv] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [cmv] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [cfc] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [cfc] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final boolean d(aae aaeVar) {
        boolean z;
        android.view.MotionEvent motionEventA;
        defpackage.dck dckVar;
        defpackage.dbk dbkVar;
        defpackage.adb adbVar = this.f;
        if (adbVar.j()) {
            z = false;
        } else {
            defpackage.cmv cmvVar = this.a;
            if (!cmvVar.D || (dckVar = cmvVar.z) == null || (dbkVar = dckVar.w) == null || !dbkVar.am()) {
                z = false;
            } else {
                defpackage.cvf cvfVar = this.h;
                if (cvfVar == null) {
                    defpackage.aooh.g();
                }
                defpackage.cxi cxiVar = this.g;
                if (cxiVar == null) {
                    defpackage.aooh.g();
                }
                long jH = cxiVar.h();
                ?? X = cmvVar;
                ?? cfcVar = 0;
                while (X != 0) {
                    if (X instanceof defpackage.ddb) {
                        ((defpackage.ddb) X).p(cvfVar, cvg.c, jH);
                    } else if ((X.u & 16) != 0 && (X instanceof defpackage.dap)) {
                        defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                        int i = 0;
                        while (cmvVar2 != null) {
                            if ((cmvVar2.u & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    X = X;
                                    cfcVar = cfcVar;
                                    cfcVar = cfcVar;
                                    X = cmvVar2;
                                } else {
                                    if (cfcVar == 0) {
                                        cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                    }
                                    if (X != 0) {
                                        cfcVar.n(X);
                                    }
                                    cfcVar.n(cmvVar2);
                                    X = 0;
                                }
                            } else {
                                X = X;
                                cfcVar = cfcVar;
                            }
                            cmvVar2 = cmvVar2.x;
                            X = X;
                            cfcVar = cfcVar;
                        }
                        if (i != 1) {
                            X = X;
                            cfcVar = cfcVar;
                        } else {
                            X = X;
                            cfcVar = cfcVar;
                        }
                    }
                    X = defpackage.cfo.x(cfcVar);
                }
                if (cmvVar.D) {
                    defpackage.cfc cfcVar2 = this.d;
                    java.lang.Object[] objArr = cfcVar2.a;
                    int i2 = cfcVar2.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((defpackage.cvd) objArr[i3]).d(aaeVar);
                    }
                }
                z = true;
            }
        }
        super.f();
        defpackage.cvf cvfVar2 = this.h;
        if (cvfVar2 != null) {
            this.j = this.b;
            java.util.List list = cvfVar2.a;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                cvm cvmVar = (cvm) list.get(i4);
                boolean z2 = cvmVar.d;
                long j = cvmVar.a;
                boolean z3 = (z2 || (aaeVar.b(j) && this.b)) ? false : true;
                int iC = aaeVar.c();
                boolean z4 = aaeVar.c() != 1 && ((motionEventA = aaeVar.a()) == null || aaeVar.c() == 1 || motionEventA.getActionMasked() != 1);
                if (z3 && (iC == 5 || !z4)) {
                    this.c.h(j);
                }
            }
            this.b = false;
            this.k = cvfVar2.e == 5;
        }
        adbVar.f();
        this.g = null;
        this.i = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38, types: [cfc] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [cfc] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [cfc] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [cmv] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [cmv] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [cmv] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [cmv] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [cmv] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [cmv] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [cfc] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean e(aae aaeVar, boolean z) {
        defpackage.dck dckVar;
        defpackage.dbk dbkVar;
        if (this.f.j()) {
            return false;
        }
        ?? X = this.a;
        if (!X.D || (dckVar = X.z) == null || (dbkVar = dckVar.w) == null || !dbkVar.am()) {
            return false;
        }
        defpackage.cvf cvfVar = this.h;
        if (cvfVar == null) {
            defpackage.aooh.g();
        }
        defpackage.cxi cxiVar = this.g;
        if (cxiVar == null) {
            defpackage.aooh.g();
        }
        long jH = cxiVar.h();
        defpackage.cvf cvfVar2 = this.i;
        if (cvfVar2 != null) {
            ?? X2 = X;
            ?? cfcVar = 0;
            while (X2 != 0) {
                if (X2 instanceof defpackage.ddb) {
                    ((defpackage.ddb) X2).p(cvfVar2, cvg.a, jH);
                } else if ((X2.u & 16) != 0 && (X2 instanceof defpackage.dap)) {
                    defpackage.cmv cmvVar = ((defpackage.dap) X2).F;
                    int i = 0;
                    while (cmvVar != null) {
                        if ((cmvVar.u & 16) != 0) {
                            i++;
                            if (i == 1) {
                                X2 = X2;
                                cfcVar = cfcVar;
                                cfcVar = cfcVar;
                                X2 = cmvVar;
                            } else {
                                if (cfcVar == 0) {
                                    cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                }
                                if (X2 != 0) {
                                    cfcVar.n(X2);
                                }
                                cfcVar.n(cmvVar);
                                X2 = 0;
                            }
                        } else {
                            X2 = X2;
                            cfcVar = cfcVar;
                        }
                        cmvVar = cmvVar.x;
                        X2 = X2;
                        cfcVar = cfcVar;
                    }
                    if (i != 1) {
                        X2 = X2;
                        cfcVar = cfcVar;
                    } else {
                        X2 = X2;
                        cfcVar = cfcVar;
                    }
                }
                X2 = defpackage.cfo.x(cfcVar);
            }
            if (X.D) {
                ?? X3 = X;
                ?? cfcVar2 = 0;
                while (X3 != 0) {
                    if (X3 instanceof defpackage.ddb) {
                        ((defpackage.ddb) X3).p(cvfVar2, cvg.b, jH);
                    } else if ((X3.u & 16) != 0 && (X3 instanceof defpackage.dap)) {
                        defpackage.cmv cmvVar2 = ((defpackage.dap) X3).F;
                        int i2 = 0;
                        while (cmvVar2 != null) {
                            if ((cmvVar2.u & 16) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    X3 = X3;
                                    cfcVar2 = cfcVar2;
                                    cfcVar2 = cfcVar2;
                                    X3 = cmvVar2;
                                } else {
                                    if (cfcVar2 == 0) {
                                        cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                    }
                                    if (X3 != 0) {
                                        cfcVar2.n(X3);
                                    }
                                    cfcVar2.n(cmvVar2);
                                    X3 = 0;
                                }
                            } else {
                                X3 = X3;
                                cfcVar2 = cfcVar2;
                            }
                            cmvVar2 = cmvVar2.x;
                            X3 = X3;
                            cfcVar2 = cfcVar2;
                        }
                        if (i2 != 1) {
                            X3 = X3;
                            cfcVar2 = cfcVar2;
                        } else {
                            X3 = X3;
                            cfcVar2 = cfcVar2;
                        }
                    }
                    X3 = defpackage.cfo.x(cfcVar2);
                }
            }
            if (X.D) {
                ?? X4 = X;
                ?? cfcVar3 = 0;
                while (X4 != 0) {
                    if (X4 instanceof defpackage.ddb) {
                        ((defpackage.ddb) X4).p(cvfVar2, cvg.c, jH);
                    } else if ((X4.u & 16) != 0 && (X4 instanceof defpackage.dap)) {
                        defpackage.cmv cmvVar3 = ((defpackage.dap) X4).F;
                        int i3 = 0;
                        while (cmvVar3 != null) {
                            if ((cmvVar3.u & 16) != 0) {
                                i3++;
                                if (i3 == 1) {
                                    X4 = X4;
                                    cfcVar3 = cfcVar3;
                                    cfcVar3 = cfcVar3;
                                    X4 = cmvVar3;
                                } else {
                                    if (cfcVar3 == 0) {
                                        cfcVar3 = new defpackage.cfc(new defpackage.cmv[16]);
                                    }
                                    if (X4 != 0) {
                                        cfcVar3.n(X4);
                                    }
                                    cfcVar3.n(cmvVar3);
                                    X4 = 0;
                                }
                            } else {
                                X4 = X4;
                                cfcVar3 = cfcVar3;
                            }
                            cmvVar3 = cmvVar3.x;
                            X4 = X4;
                            cfcVar3 = cfcVar3;
                        }
                        if (i3 != 1) {
                            X4 = X4;
                            cfcVar3 = cfcVar3;
                        } else {
                            X4 = X4;
                            cfcVar3 = cfcVar3;
                        }
                    }
                    X4 = defpackage.cfo.x(cfcVar3);
                }
            }
            this.i = null;
        }
        ?? X5 = X;
        ?? cfcVar4 = 0;
        while (X5 != 0) {
            if (X5 instanceof defpackage.ddb) {
                ((defpackage.ddb) X5).p(cvfVar, cvg.a, jH);
            } else if ((X5.u & 16) != 0 && (X5 instanceof defpackage.dap)) {
                defpackage.cmv cmvVar4 = ((defpackage.dap) X5).F;
                int i4 = 0;
                while (cmvVar4 != null) {
                    if ((cmvVar4.u & 16) != 0) {
                        i4++;
                        if (i4 == 1) {
                            X5 = X5;
                            cfcVar4 = cfcVar4;
                            cfcVar4 = cfcVar4;
                            X5 = cmvVar4;
                        } else {
                            if (cfcVar4 == 0) {
                                cfcVar4 = new defpackage.cfc(new defpackage.cmv[16]);
                            }
                            if (X5 != 0) {
                                cfcVar4.n(X5);
                            }
                            cfcVar4.n(cmvVar4);
                            X5 = 0;
                        }
                    } else {
                        X5 = X5;
                        cfcVar4 = cfcVar4;
                    }
                    cmvVar4 = cmvVar4.x;
                    X5 = X5;
                    cfcVar4 = cfcVar4;
                }
                if (i4 != 1) {
                    X5 = X5;
                    cfcVar4 = cfcVar4;
                } else {
                    X5 = X5;
                    cfcVar4 = cfcVar4;
                }
            }
            X5 = defpackage.cfo.x(cfcVar4);
        }
        if (X.D) {
            defpackage.cfc cfcVar5 = this.d;
            java.lang.Object[] objArr = cfcVar5.a;
            int i5 = cfcVar5.b;
            for (int i6 = 0; i6 < i5; i6++) {
                defpackage.cvd cvdVar = (defpackage.cvd) objArr[i6];
                if (this.g == null) {
                    defpackage.aooh.g();
                }
                cvdVar.e(aaeVar, z);
            }
        }
        if (X.D) {
            ?? cfcVar6 = 0;
            while (X != 0) {
                if (X instanceof defpackage.ddb) {
                    ((defpackage.ddb) X).p(cvfVar, cvg.b, jH);
                } else if ((X.u & 16) != 0 && (X instanceof defpackage.dap)) {
                    defpackage.cmv cmvVar5 = ((defpackage.dap) X).F;
                    int i7 = 0;
                    while (cmvVar5 != null) {
                        if ((cmvVar5.u & 16) != 0) {
                            i7++;
                            if (i7 == 1) {
                                X = X;
                                cfcVar6 = cfcVar6;
                                cfcVar6 = cfcVar6;
                                X = cmvVar5;
                            } else {
                                if (cfcVar6 == 0) {
                                    cfcVar6 = new defpackage.cfc(new defpackage.cmv[16]);
                                }
                                if (X != 0) {
                                    cfcVar6.n(X);
                                }
                                cfcVar6.n(cmvVar5);
                                X = 0;
                            }
                        } else {
                            X = X;
                            cfcVar6 = cfcVar6;
                        }
                        cmvVar5 = cmvVar5.x;
                        X = X;
                        cfcVar6 = cfcVar6;
                    }
                    if (i7 != 1) {
                        X = X;
                        cfcVar6 = cfcVar6;
                    } else {
                        X = X;
                        cfcVar6 = cfcVar6;
                    }
                }
                X = defpackage.cfo.x(cfcVar6);
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        return "Node(modifierNode=" + this.a + ", children=" + this.d + ", pointerIds=" + this.c + ')';
    }
}
