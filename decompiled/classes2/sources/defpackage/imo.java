package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class imo implements iju {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelAvailability");
    public final defpackage.imh b;
    private final aolr c;
    private final aoss d;
    private final defpackage.iml e;
    private final twp f;

    public imo(aolr aolrVar, aoss aossVar, twp twpVar, defpackage.imh imhVar, defpackage.iml imlVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(imlVar, "sodaLocaleState");
        this.c = aolrVar;
        this.d = aossVar;
        this.f = twpVar;
        this.b = imhVar;
        this.e = imlVar;
    }

    public final java.lang.Object a(defpackage.igr igrVar, java.lang.String str, aoln aolnVar) {
        return aoov.aj(this.c, new defpackage.hyq(str, this, igrVar, (aoln) null, 4), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.igr igrVar, java.lang.String str, aoln aolnVar) {
        defpackage.imm immVar;
        aoot aootVar;
        java.lang.Object objB;
        defpackage.igr igrVar2;
        aoot aootVar2;
        defpackage.ihm ihmVar;
        aoot aootVar3;
        defpackage.heq heqVarY;
        java.lang.Boolean bool;
        defpackage.iho ihoVar;
        defpackage.heq heqVarY2;
        java.lang.Boolean bool2;
        if (aolnVar instanceof defpackage.imm) {
            immVar = (defpackage.imm) aolnVar;
            int i = immVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                immVar.d = i - Integer.MIN_VALUE;
            } else {
                immVar = new defpackage.imm(this, aolnVar);
            }
        } else {
            immVar = new defpackage.imm(this, aolnVar);
        }
        java.lang.Object objC = immVar.b;
        aolu aoluVar = aolu.a;
        int i2 = immVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aoot aootVar4 = immVar.f;
                str = immVar.e;
                defpackage.igr igrVar3 = (defpackage.igr) immVar.a;
                aooc.af(objC);
                aootVar = aootVar4;
                igrVar = igrVar3;
                objB = objC;
            } else {
                if (i2 == 2) {
                    aootVar2 = immVar.f;
                    str = immVar.e;
                    igrVar2 = (defpackage.igr) immVar.a;
                    aooc.af(objC);
                    if (!aooh.n(objC, str)) {
                        defpackage.heq heqVarY3 = defpackage.hhe.y(defpackage.igo.a.m());
                        heqVarY3.o(false);
                        heqVarY3.q(defpackage.iho.SODA_AVAILABILITY_FAILURE_LOCALE_MISMATCH);
                        return heqVarY3.m();
                    }
                    if (igrVar2.b == 4) {
                        ihmVar = (defpackage.ihm) igrVar2.c;
                    } else {
                        ihmVar = defpackage.ihm.a;
                    }
                    if ((ihmVar.b & 16) != 0) {
                        aoov.an(this.d, (aolr) null, 0, new defpackage.iiw(this, igrVar2, (aoln) null, 7), 3);
                    }
                    if (!aooh.n(str, "mul")) {
                        immVar.a = aootVar2;
                        immVar.e = null;
                        immVar.f = null;
                        immVar.d = 3;
                        objC = c(str, igrVar2, immVar);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        aootVar3 = aootVar2;
                    }
                    heqVarY = defpackage.hhe.y(defpackage.igo.a.m());
                    heqVarY.o(true);
                    bool = (java.lang.Boolean) aootVar2.a;
                    if (bool != null) {
                        heqVarY.n(bool.booleanValue());
                    }
                    return heqVarY.m();
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aootVar3 = (aoot) immVar.a;
                aooc.af(objC);
            }
            ihoVar = (defpackage.iho) objC;
            if (ihoVar != null) {
                heqVarY2 = defpackage.hhe.y(defpackage.igo.a.m());
                heqVarY2.o(false);
                bool2 = (java.lang.Boolean) aootVar3.a;
                if (bool2 != null) {
                    heqVarY2.n(bool2.booleanValue());
                }
                heqVarY2.q(ihoVar);
                return heqVarY2.m();
            }
            aootVar2 = aootVar3;
            heqVarY = defpackage.hhe.y(defpackage.igo.a.m());
            heqVarY.o(true);
            bool = (java.lang.Boolean) aootVar2.a;
            if (bool != null) {
                heqVarY.n(bool.booleanValue());
            }
            return heqVarY.m();
        }
        aooc.af(objC);
        if (igrVar.b != 4) {
            throw new java.lang.IllegalArgumentException("provided model config is not a SODA config");
        }
        aootVar = new aoot();
        defpackage.iml imlVar = this.e;
        immVar.a = igrVar;
        immVar.e = str;
        immVar.f = aootVar;
        immVar.d = 1;
        objB = imlVar.b(immVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        if (objB != null) {
            defpackage.iml imlVar2 = this.e;
            immVar.a = igrVar;
            immVar.e = str;
            immVar.f = aootVar;
            immVar.d = 2;
            java.lang.Object objB2 = imlVar2.b(immVar);
            if (objB2 == aoluVar) {
                return aoluVar;
            }
            igrVar2 = igrVar;
            aootVar2 = aootVar;
            objC = objB2;
            if (!aooh.n(objC, str)) {
                defpackage.heq heqVarY4 = defpackage.hhe.y(defpackage.igo.a.m());
                heqVarY4.o(false);
                heqVarY4.q(defpackage.iho.SODA_AVAILABILITY_FAILURE_LOCALE_MISMATCH);
                return heqVarY4.m();
            }
        } else {
            igrVar2 = igrVar;
            aootVar2 = aootVar;
        }
        if (igrVar2.b == 4) {
            ihmVar = (defpackage.ihm) igrVar2.c;
        } else {
            ihmVar = defpackage.ihm.a;
        }
        if ((ihmVar.b & 16) != 0) {
            aoov.an(this.d, (aolr) null, 0, new defpackage.iiw(this, igrVar2, (aoln) null, 7), 3);
        }
        if (!aooh.n(str, "mul")) {
            immVar.a = aootVar2;
            immVar.e = null;
            immVar.f = null;
            immVar.d = 3;
            objC = c(str, igrVar2, immVar);
            if (objC != aoluVar) {
                return aoluVar;
            }
            aootVar3 = aootVar2;
            ihoVar = (defpackage.iho) objC;
            if (ihoVar != null) {
                heqVarY2 = defpackage.hhe.y(defpackage.igo.a.m());
                heqVarY2.o(false);
                bool2 = (java.lang.Boolean) aootVar3.a;
                if (bool2 != null) {
                    heqVarY2.n(bool2.booleanValue());
                }
                heqVarY2.q(ihoVar);
                return heqVarY2.m();
            }
            aootVar2 = aootVar3;
        }
        heqVarY = defpackage.hhe.y(defpackage.igo.a.m());
        heqVarY.o(true);
        bool = (java.lang.Boolean) aootVar2.a;
        if (bool != null) {
            heqVarY.n(bool.booleanValue());
        }
        return heqVarY.m();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e6  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        if (r5 == 0) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r25, defpackage.igr r26, aoln r27) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imo.c(java.lang.String, igr, aoln):java.lang.Object");
    }
}
