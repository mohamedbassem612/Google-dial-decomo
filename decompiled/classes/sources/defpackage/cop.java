package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cop {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public cop(defpackage.gii giiVar, defpackage.aomy aomyVar) {
        this.e = giiVar;
        this.b = aomyVar;
        defpackage.gim gimVar = new defpackage.gim(new defpackage.aogc((byte[]) null, (byte[]) null), new defpackage.ddz(this, 17));
        this.d = gimVar;
        this.c = new defpackage.aaha(gimVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dcv, java.lang.Object] */
    public final void a() {
        if (this.a) {
            return;
        }
        this.b.D(new coo(this, 0));
        this.a = true;
    }

    public final void b() {
        ((defpackage.cuz) this.e).a();
    }

    public final void c() {
        if (this.a) {
            return;
        }
        ((defpackage.adb) ((defpackage.kaw) this.d).a).f();
        ((defpackage.cuz) this.e).b();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    public final int d(wj wjVar, defpackage.cvv cvvVar, boolean z) throws java.lang.Throwable {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        java.lang.Object obj;
        int i4;
        boolean z4;
        int i5;
        long[] jArr;
        long[] jArr2;
        java.lang.Object[] objArr;
        int i6;
        int i7;
        boolean z5;
        defpackage.cve cveVar;
        java.lang.Object obj2;
        boolean z6;
        long j;
        long jL;
        boolean z7;
        defpackage.cop copVar = this;
        if (copVar.a) {
            return 0;
        }
        boolean z8 = true;
        try {
            copVar.a = true;
            java.lang.Object obj3 = copVar.d;
            ?? r7 = wjVar.b;
            defpackage.adb adbVar = new defpackage.adb(r7.size());
            int size = r7.size();
            int i8 = 0;
            ?? r8 = r7;
            while (i8 < size) {
                cvo cvoVar = (cvo) r8.get(i8);
                java.lang.Object obj4 = ((defpackage.kaw) obj3).a;
                long j2 = cvoVar.a;
                cvn cvnVar = (cvn) ((defpackage.adb) obj4).d(j2);
                if (cvnVar == null) {
                    z6 = z8;
                    j = cvoVar.b;
                    jL = cvoVar.d;
                    z7 = false;
                } else {
                    z6 = z8;
                    j = cvnVar.a;
                    jL = cvvVar.l(cvnVar.b);
                    z7 = z6;
                }
                long j3 = jL;
                long j4 = j;
                long j5 = cvoVar.b;
                long j6 = cvoVar.d;
                boolean z9 = cvoVar.e;
                adbVar.g(j2, new cvm(j2, j5, j6, z9, cvoVar.f, j4, j3, z7, false, cvoVar.g, cvoVar.i, cvoVar.j, cvoVar.k, cvoVar.l, cvoVar.m));
                if (z9) {
                    ((defpackage.adb) obj4).g(j2, new cvn(j5, cvoVar.c));
                } else {
                    ((defpackage.adb) obj4).h(j2);
                }
                i8++;
                r8 = r8;
                size = size;
                obj3 = obj3;
                z8 = z6;
            }
            boolean z10 = z8;
            aae aaeVar = new aae(adbVar, wjVar);
            java.lang.Object obj5 = aaeVar.b;
            int iB = ((defpackage.adb) obj5).b();
            int i9 = 0;
            while (true) {
                if (i9 >= iB) {
                    z3 = z10;
                    break;
                }
                cvm cvmVar = (cvm) ((defpackage.adb) obj5).e(i9);
                if (cvmVar.d || cvmVar.h) {
                    z3 = false;
                    break;
                }
                i9++;
            }
            boolean z11 = (!(aaeVar.c() == 5 ? false : z10)) | z3;
            int iB2 = ((defpackage.adb) obj5).b();
            int i10 = 0;
            while (i10 < iB2) {
                try {
                    cvm cvmVar2 = (cvm) ((defpackage.adb) obj5).e(i10);
                    if (z11 || defpackage.uu.r(cvmVar2)) {
                        java.lang.Object obj6 = copVar.b;
                        long j7 = cvmVar2.c;
                        ?? r10 = copVar.c;
                        ((defpackage.dbk) obj6).D(j7, (defpackage.dax) r10, cvmVar2.i, true);
                        if (r10.isEmpty()) {
                            obj = obj5;
                            i4 = iB2;
                            z4 = z11;
                            i5 = i10;
                        } else {
                            java.lang.Object obj7 = copVar.e;
                            long j8 = cvmVar2.a;
                            boolean zR = defpackage.uu.r(cvmVar2);
                            defpackage.cve cveVar2 = ((defpackage.cuz) obj7).f;
                            int iA = ((defpackage.dax) r10).a();
                            defpackage.cve cveVar3 = cveVar2;
                            boolean z12 = z10;
                            int i11 = 0;
                            while (i11 < iA) {
                                defpackage.cmv cmvVarC = ((defpackage.dax) r10).get(i11);
                                java.lang.Object obj8 = obj5;
                                if (cmvVarC.D) {
                                    i7 = iB2;
                                    cmvVarC.C = new bxq(obj7, cmvVarC, 5);
                                    if (z12) {
                                        cveVar = cveVar3;
                                        defpackage.cfc cfcVar = cveVar.d;
                                        z5 = z11;
                                        java.lang.Object[] objArr2 = cfcVar.a;
                                        int i12 = cfcVar.b;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= i12) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = objArr2[i13];
                                            int i14 = i12;
                                            if (defpackage.aooh.n(((defpackage.cvd) obj2).a, cmvVarC)) {
                                                break;
                                            }
                                            i13++;
                                            i12 = i14;
                                        }
                                        defpackage.cvd cvdVar = (defpackage.cvd) obj2;
                                        if (cvdVar != null) {
                                            cvdVar.b = z10;
                                            cvdVar.c.g(j8);
                                            if (zR) {
                                                defpackage.acx acxVar = ((defpackage.cuz) obj7).h;
                                                java.lang.Object objA = acxVar.a(j8);
                                                if (objA == null) {
                                                    objA = new defpackage.adq(16);
                                                    acxVar.h(j8, objA);
                                                }
                                                ((defpackage.adq) objA).q(cvdVar);
                                            }
                                            cveVar3 = cvdVar;
                                            i10 = i10;
                                            z12 = true;
                                        }
                                    } else {
                                        z5 = z11;
                                        cveVar = cveVar3;
                                    }
                                    defpackage.cvd cvdVar2 = new defpackage.cvd(cmvVarC);
                                    cvdVar2.c.g(j8);
                                    if (zR) {
                                        defpackage.acx acxVar2 = ((defpackage.cuz) obj7).h;
                                        java.lang.Object objA2 = acxVar2.a(j8);
                                        if (objA2 == null) {
                                            objA2 = new defpackage.adq(16);
                                            acxVar2.h(j8, objA2);
                                        }
                                        ((defpackage.adq) objA2).q(cvdVar2);
                                    } else {
                                        i10 = i10;
                                    }
                                    cveVar.d.n(cvdVar2);
                                    cveVar3 = cvdVar2;
                                    z12 = false;
                                } else {
                                    i7 = iB2;
                                    z5 = z11;
                                    i10 = i10;
                                }
                                i11++;
                                iB2 = i7;
                                obj5 = obj8;
                                z11 = z5;
                                i10 = i10;
                                z10 = true;
                            }
                            obj = obj5;
                            i4 = iB2;
                            z4 = z11;
                            i5 = i10;
                            if (zR) {
                                defpackage.acx acxVar3 = ((defpackage.cuz) obj7).h;
                                long[] jArr3 = acxVar3.b;
                                java.lang.Object[] objArr3 = acxVar3.c;
                                long[] jArr4 = acxVar3.a;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i15 = 0;
                                    while (true) {
                                        long j9 = jArr4[i15];
                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i16 = i15 - length;
                                            int i17 = 0;
                                            while (true) {
                                                jArr = jArr4;
                                                i6 = 8 - ((~i16) >>> 31);
                                                if (i17 >= i6) {
                                                    break;
                                                }
                                                if ((j9 & 255) < 128) {
                                                    int i18 = (i15 << 3) + i17;
                                                    long j10 = jArr3[i18];
                                                    defpackage.adq adqVar = (defpackage.adq) objArr3[i18];
                                                    defpackage.cfc cfcVar2 = cveVar2.d;
                                                    java.lang.Object[] objArr4 = cfcVar2.a;
                                                    int i19 = 0;
                                                    for (int i20 = cfcVar2.b; i19 < i20; i20 = i20) {
                                                        ((defpackage.cvd) objArr4[i19]).b(j10, adqVar);
                                                        i19++;
                                                    }
                                                }
                                                j9 >>= 8;
                                                i17++;
                                                jArr4 = jArr;
                                                jArr3 = jArr3;
                                                objArr3 = objArr3;
                                            }
                                            jArr2 = jArr3;
                                            objArr = objArr3;
                                            if (i6 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                            jArr2 = jArr3;
                                            objArr = objArr3;
                                        }
                                        if (i15 == length) {
                                            break;
                                        }
                                        i15++;
                                        jArr4 = jArr;
                                        jArr3 = jArr2;
                                        objArr3 = objArr;
                                    }
                                }
                            }
                            ((defpackage.cuz) obj7).h.g();
                            ((defpackage.dax) r10).clear();
                        }
                    } else {
                        obj = obj5;
                        i4 = iB2;
                        z4 = z11;
                        i5 = i10;
                    }
                    i10 = i5 + 1;
                    z10 = true;
                    copVar = this;
                    iB2 = i4;
                    obj5 = obj;
                    z11 = z4;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z2 = false;
                    copVar = this;
                    copVar.a = z2;
                    throw th;
                }
            }
            java.lang.Object obj9 = obj5;
            java.lang.Object obj10 = copVar.e;
            defpackage.cve cveVar4 = ((defpackage.cuz) obj10).f;
            if (cveVar4.c((defpackage.adb) obj9, ((defpackage.cuz) obj10).a, aaeVar, z)) {
                ((defpackage.cuz) obj10).b = true;
                defpackage.cfc cfcVar3 = cveVar4.d;
                java.lang.Object[] objArr5 = cfcVar3.a;
                int i21 = cfcVar3.b;
                boolean z13 = false;
                for (int i22 = 0; i22 < i21; i22++) {
                    z13 = ((defpackage.cvd) objArr5[i22]).e(aaeVar, z) || z13;
                }
                java.lang.Object[] objArr6 = cfcVar3.a;
                int i23 = cfcVar3.b;
                boolean z14 = false;
                for (int i24 = 0; i24 < i23; i24++) {
                    z14 = ((defpackage.cvd) objArr6[i24]).d(aaeVar) || z14;
                }
                cveVar4.f();
                i = (z14 || z13) ? 1 : 0;
                ((defpackage.cuz) obj10).b = false;
                if (((defpackage.cuz) obj10).e) {
                    ((defpackage.cuz) obj10).e = false;
                    defpackage.adq adqVar2 = ((defpackage.cuz) obj10).g;
                    int i25 = adqVar2.b;
                    for (int i26 = 0; i26 < i25; i26++) {
                        ((defpackage.cuz) obj10).c((defpackage.cmv) adqVar2.c(i26));
                    }
                    adqVar2.l();
                }
                if (((defpackage.cuz) obj10).c) {
                    ((defpackage.cuz) obj10).c = false;
                    ((defpackage.cuz) obj10).b();
                }
                if (((defpackage.cuz) obj10).d) {
                    ((defpackage.cuz) obj10).d = false;
                    ((defpackage.cuz) obj10).a();
                }
            } else {
                i = 0;
            }
            if (aaeVar.a) {
                i2 = 0;
                break;
            }
            int iB3 = ((defpackage.adb) obj9).b();
            int i27 = 0;
            while (true) {
                if (i27 >= iB3) {
                    i2 = 0;
                    break;
                }
                cvm cvmVar3 = (cvm) ((defpackage.adb) obj9).e(i27);
                if (defpackage.uu.w(cvmVar3) && cvmVar3.c()) {
                    i2 = 1;
                    break;
                }
                i27++;
            }
            int iB4 = ((defpackage.adb) obj9).b();
            for (int i28 = 0; i28 < iB4; i28++) {
                if (((cvm) ((defpackage.adb) obj9).e(i28)).c()) {
                    i3 = 1;
                    copVar.a = false;
                    return i | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            copVar.a = false;
            return i | (i2 << 1) | (i3 << 2);
        } catch (java.lang.Throwable th2) {
            th = th2;
            z2 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ifa, java.lang.Object] */
    public final void e(defpackage.aw awVar) {
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        if (!this.a) {
            this.a = true;
            ?? r1 = this.d;
            defpackage.iez iezVar = (defpackage.iez) this.e;
            r1.g(iezVar.t());
            iezVar.g(r1);
            ((defpackage.cm) this.c).P().c(new defpackage.roe(this, 1));
        }
        awVar.P().c(new defpackage.ief(this, awVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aomy, java.lang.Object] */
    public final void f() {
        ?? r0 = this.e;
        if (r0.P().a() != defpackage.emq.b) {
            throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.a) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.a();
        r0.P().c(new defpackage.mm(this, 6));
        this.a = true;
    }

    public cop(defpackage.dbk dbkVar) {
        this.b = dbkVar;
        this.e = new defpackage.cuz(dbkVar.o());
        this.d = new defpackage.kaw((short[]) null);
        this.c = new defpackage.dax();
    }

    public cop(defpackage.cou couVar, defpackage.dcv dcvVar) {
        this.c = couVar;
        this.b = dcvVar;
        defpackage.ady adyVar = defpackage.adz.a;
        this.d = new defpackage.ady(6);
        this.e = new defpackage.ady(6);
    }

    public cop(defpackage.iez iezVar, defpackage.rlv rlvVar, defpackage.az azVar) {
        if (iezVar == null) {
            defpackage.aooh.i("audioPlayer");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (azVar == null) {
            defpackage.aooh.i("fragmentActivity");
        }
        this.e = iezVar;
        this.b = rlvVar;
        this.c = azVar;
        this.d = new defpackage.iee(this);
    }
}
