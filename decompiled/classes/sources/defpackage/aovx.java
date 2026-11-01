package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovx implements defpackage.aovq {
    public java.lang.Object a = defpackage.aowg.p;
    public defpackage.aosc b;
    final /* synthetic */ defpackage.aowe c;

    public aovx(defpackage.aowe aoweVar) {
        this.c = aoweVar;
    }

    @Override // defpackage.aovq
    public final void E(defpackage.apbi apbiVar, int i) {
        defpackage.aosc aoscVar = this.b;
        if (aoscVar != null) {
            aoscVar.E(apbiVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x013d A[PHI: r1 r12
      0x013d: PHI (r1v9 java.lang.Boolean) = (r1v8 java.lang.Boolean), (r1v18 java.lang.Boolean) binds: [B:75:0x0135, B:70:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r12v2 bli) = (r12v1 bli), (r12v6 bli) binds: [B:75:0x0135, B:70:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    public final java.lang.Object a(defpackage.aoln aolnVar) throws java.lang.Throwable {
        bli bliVar;
        java.lang.Boolean bool;
        bli bliVar2;
        boolean z = true;
        if (this.a == defpackage.aowg.p || this.a == defpackage.aowg.l) {
            defpackage.aowe aoweVar = this.c;
            defpackage.aorq aorqVar = aoweVar.e;
            defpackage.aown aownVar = (defpackage.aown) aorqVar.a;
            while (!aoweVar.y()) {
                defpackage.aorp aorpVar = aoweVar.c;
                long jB = aorpVar.b();
                long j = defpackage.aowg.b;
                long j2 = jB / j;
                int i = (int) (jB % j);
                if (aownVar.b != j2) {
                    defpackage.aown aownVarR = aoweVar.r(j2, aownVar);
                    if (aownVarR != null) {
                        aownVar = aownVarR;
                    } else {
                        continue;
                    }
                }
                defpackage.aowe aoweVar2 = aoweVar;
                java.lang.Object objN = aoweVar2.n(aownVar, i, jB, null);
                defpackage.apcm apcmVar = defpackage.aowg.m;
                if (objN == apcmVar) {
                    throw new java.lang.IllegalStateException("unreachable");
                }
                defpackage.apcm apcmVar2 = defpackage.aowg.o;
                if (objN == apcmVar2) {
                    if (jB < aoweVar2.h()) {
                        aownVar.o();
                    }
                    aoweVar = aoweVar2;
                } else {
                    defpackage.apcm apcmVar3 = defpackage.aowg.n;
                    if (objN == apcmVar3) {
                        defpackage.aosc aoscVarAf = defpackage.aoov.af(defpackage.ajsz.ap(aolnVar));
                        try {
                            this.b = aoscVarAf;
                            java.lang.Object objN2 = aoweVar2.n(aownVar, i, jB, this);
                            if (objN2 == apcmVar) {
                                E(aownVar, i);
                            } else {
                                defpackage.aosc aoscVar = null;
                                if (objN2 == apcmVar2) {
                                    if (jB < aoweVar2.h()) {
                                        aownVar.o();
                                    }
                                    defpackage.aown aownVar2 = (defpackage.aown) aorqVar.a;
                                    while (true) {
                                        if (aoweVar2.y()) {
                                            defpackage.aosc aoscVar2 = this.b;
                                            if (aoscVar2 == null) {
                                                defpackage.aooh.g();
                                            }
                                            this.b = aoscVar;
                                            this.a = defpackage.aowg.l;
                                            java.lang.Throwable thO = aoweVar2.o();
                                            if (thO == null) {
                                                aoscVar2.w(java.lang.Boolean.FALSE);
                                            } else {
                                                if (defpackage.aosu.b && (aoscVar2 instanceof defpackage.aome)) {
                                                    thO = defpackage.apcl.a(thO, aoscVar2);
                                                }
                                                aoscVar2.w(defpackage.aooc.ae(thO));
                                            }
                                        } else {
                                            long jB2 = aorpVar.b();
                                            long j3 = jB2 / j;
                                            aorpVar = aorpVar;
                                            int i2 = (int) (jB2 % j);
                                            if (aownVar2.b != j3) {
                                                defpackage.aown aownVarR2 = aoweVar2.r(j3, aownVar2);
                                                if (aownVarR2 != null) {
                                                    aownVar2 = aownVarR2;
                                                } else {
                                                    aoscVar = null;
                                                }
                                            }
                                            bliVar = null;
                                            java.lang.Object objN3 = aoweVar2.n(aownVar2, i2, jB2, this);
                                            if (objN3 == apcmVar) {
                                                E(aownVar2, i2);
                                            } else if (objN3 == apcmVar2) {
                                                if (jB2 < aoweVar2.h()) {
                                                    aownVar2.o();
                                                }
                                                aoscVar = null;
                                            } else {
                                                if (objN3 == apcmVar3) {
                                                    throw new java.lang.IllegalStateException("unexpected");
                                                }
                                                aownVar2.o();
                                                this.a = objN3;
                                                this.b = null;
                                                bool = java.lang.Boolean.TRUE;
                                                defpackage.aonj aonjVar = aoweVar2.a;
                                                if (aonjVar != null) {
                                                    bliVar2 = new bli(aonjVar, objN3, 18, (byte[]) null);
                                                } else {
                                                    bliVar2 = bliVar;
                                                }
                                                aoscVarAf.e(bool, bliVar2);
                                            }
                                        }
                                    }
                                } else {
                                    bliVar = null;
                                    aownVar.o();
                                    this.a = objN2;
                                    this.b = null;
                                    bool = java.lang.Boolean.TRUE;
                                    defpackage.aonj aonjVar2 = aoweVar2.a;
                                    if (aonjVar2 != null) {
                                        bliVar2 = new bli(aonjVar2, objN2, 18, (byte[]) null);
                                    } else {
                                        bliVar2 = bliVar;
                                    }
                                    aoscVarAf.e(bool, bliVar2);
                                }
                            }
                            java.lang.Object objK = aoscVarAf.k();
                            if (objK != defpackage.aolu.a || aolnVar != null) {
                                return objK;
                            }
                            defpackage.aooh.i("frame");
                            return objK;
                        } catch (java.lang.Throwable th) {
                            aoscVarAf.B();
                            throw th;
                        }
                    }
                    aownVar.o();
                    this.a = objN;
                }
            }
            this.a = defpackage.aowg.l;
            java.lang.Throwable thO2 = aoweVar.o();
            if (thO2 != null) {
                throw defpackage.apcl.b(thO2);
            }
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final java.lang.Object b() throws java.lang.Throwable {
        java.lang.Object obj = this.a;
        defpackage.apcm apcmVar = defpackage.aowg.p;
        if (obj == apcmVar) {
            throw new java.lang.IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = apcmVar;
        if (obj != defpackage.aowg.l) {
            return obj;
        }
        throw defpackage.apcl.b(this.c.p());
    }
}
