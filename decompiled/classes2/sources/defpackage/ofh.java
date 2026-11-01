package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofh {
    private static final aimz a = aimz.i("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions");
    private final defpackage.ofc b;
    private final pgi c;

    public ofh(pgi pgiVar, defpackage.ofc ofcVar) {
        aooh.f(ofcVar, "inCallLogger");
        this.c = pgiVar;
        this.b = ofcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(amzg amzgVar, aoln aolnVar) {
        defpackage.off offVar;
        if (aolnVar instanceof defpackage.off) {
            offVar = (defpackage.off) aolnVar;
            int i = offVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                offVar.c = i - Integer.MIN_VALUE;
            } else {
                offVar = new defpackage.off(this, aolnVar);
            }
        } else {
            offVar = new defpackage.off(this, aolnVar);
        }
        java.lang.Object objD = offVar.a;
        aolu aoluVar = aolu.a;
        int i2 = offVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarD = amzgVar.d();
            offVar.c = 1;
            objD = aosv.D(ajcqVarD, offVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        spe speVarA = sns.a((spo) objD);
        return java.lang.Boolean.valueOf(speVarA != null && speVarA.b.size() > 0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ofg ofgVar;
        boolean zBooleanValue;
        defpackage.ofc ofcVar;
        java.lang.Object objF;
        boolean z;
        defpackage.ofc ofcVar2;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.ofg) {
            ofgVar = (defpackage.ofg) aolnVar;
            int i = ofgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofgVar.d = i - Integer.MIN_VALUE;
            } else {
                ofgVar = new defpackage.ofg(this, aolnVar);
            }
        } else {
            ofgVar = new defpackage.ofg(this, aolnVar);
        }
        java.lang.Object objH = ofgVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ofgVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objH);
            } else if (i2 == 2) {
                zBooleanValue = ofgVar.a;
                aooc.af(objH);
                ofcVar = this.b;
                pgi pgiVar = this.c;
                ofgVar.e = ofcVar;
                ofgVar.a = zBooleanValue;
                ofgVar.d = 3;
                objF = pgiVar.f(ofgVar);
                if (objF != aoluVar) {
                    return aoluVar;
                }
                objH = objF;
                z = zBooleanValue;
                ofcVar2 = ofcVar;
                ofgVar.e = null;
                ofgVar.a = z;
                ofgVar.d = 4;
                objA = ahvr.ag(ofcVar2.a, ofcVar2.e, new defpackage.ofa(ofcVar2, (amql) objH, (aoln) null, 0)).a(ofgVar);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                z = ofgVar.a;
                ofcVar2 = ofgVar.e;
                aooc.af(objH);
                ofgVar.e = null;
                ofgVar.a = z;
                ofgVar.d = 4;
                objA = ahvr.ag(ofcVar2.a, ofcVar2.e, new defpackage.ofa(ofcVar2, (amql) objH, (aoln) null, 0)).a(ofgVar);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = ofgVar.a;
                aooc.af(objH);
            }
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objH);
        pgi pgiVar2 = this.c;
        ofgVar.d = 1;
        objH = pgiVar2.h(ofgVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        zBooleanValue = ((java.lang.Boolean) objH).booleanValue();
        defpackage.ofc ofcVar3 = this.b;
        ofgVar.a = zBooleanValue;
        ofgVar.d = 2;
        java.lang.Object objA2 = ahvr.ag(ofcVar3.a, ofcVar3.e, new defpackage.jcm(ofcVar3, zBooleanValue, (aoln) null, 3)).a(ofgVar);
        if (objA2 != aoluVar) {
            objA2 = aojh.a;
        }
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        ofcVar = this.b;
        pgi pgiVar3 = this.c;
        ofgVar.e = ofcVar;
        ofgVar.a = zBooleanValue;
        ofgVar.d = 3;
        objF = pgiVar3.f(ofgVar);
        if (objF != aoluVar) {
            return aoluVar;
        }
        objH = objF;
        z = zBooleanValue;
        ofcVar2 = ofcVar;
        ofgVar.e = null;
        ofgVar.a = z;
        ofgVar.d = 4;
        objA = ahvr.ag(ofcVar2.a, ofcVar2.e, new defpackage.ofa(ofcVar2, (amql) objH, (aoln) null, 0)).a(ofgVar);
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        if (objA == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:38:0x0121  */
    /* JADX WARN: Code duplicated, block: B:42:0x0138  */
    /* JADX WARN: Code duplicated, block: B:43:0x0155  */
    /* JADX WARN: Code duplicated, block: B:47:0x016c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0189  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0211  */
    /* JADX WARN: Code duplicated, block: B:63:0x022e  */
    /* JADX WARN: Code duplicated, block: B:67:0x024e  */
    /* JADX WARN: Code duplicated, block: B:68:0x026a  */
    /* JADX WARN: Code duplicated, block: B:72:0x028a  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x02db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.lang.Object, ofd] */
    /* JADX WARN: Type inference failed for: r9v48, types: [ofd] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, ofd] */
    public final java.lang.Object c(defpackage.hkl hklVar, aoln aolnVar) {
        defpackage.ofe ofeVar;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        if (aolnVar instanceof defpackage.ofe) {
            ofeVar = (defpackage.ofe) aolnVar;
            int i = ofeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofeVar.d = i - Integer.MIN_VALUE;
            } else {
                ofeVar = new defpackage.ofe(this, aolnVar);
            }
        } else {
            ofeVar = new defpackage.ofe(this, aolnVar);
        }
        java.lang.Object objB = ofeVar.b;
        aolu aoluVar = aolu.a;
        boolean z = false;
        switch (ofeVar.d) {
            case 0:
                aooc.af(objB);
                java.lang.Object objAr = aooc.ar(hklVar, defpackage.ofd.class);
                aooh.e(objAr, "get(...)");
                defpackage.ofd ofdVar = (defpackage.ofd) objAr;
                ofeVar.a = ofdVar;
                ofeVar.d = 1;
                objB = b(ofeVar);
                r9 = ofdVar;
                if (objB == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objB).booleanValue()) {
                    ajcq ajcqVarAM = r9.aM();
                    ofeVar.a = r9;
                    ofeVar.d = 2;
                    objB = aosv.D(ajcqVarAM, ofeVar);
                    if (objB == aoluVar) {
                        r10 = r9;
                        return aoluVar;
                    }
                    r10 = r9;
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 60, "ExpressoSharedPreconditions.kt").v("call is RTT call, not showing expresso");
                    } else {
                        ajcq ajcqVarAG = r10.aG();
                        ofeVar.a = r10;
                        ofeVar.d = 3;
                        objB = aosv.D(ajcqVarAG, ofeVar);
                        if (objB == aoluVar) {
                            r11 = r10;
                            return aoluVar;
                        }
                        r11 = r10;
                        if (((java.lang.Boolean) objB).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 67, "ExpressoSharedPreconditions.kt").v("call is emergency call, not showing expresso");
                        } else {
                            ajcq ajcqVarAH = r11.aH();
                            ofeVar.a = r11;
                            ofeVar.d = 4;
                            objB = aosv.D(ajcqVarAH, ofeVar);
                            if (objB == aoluVar) {
                                r12 = r11;
                                return aoluVar;
                            }
                            r12 = r11;
                            if (((java.lang.Boolean) objB).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 74, "ExpressoSharedPreconditions.kt").v("call is emergency callback, not showing expresso");
                            } else {
                                ajcq ajcqVarAS = r12.aS();
                                ofeVar.a = r12;
                                ofeVar.d = 5;
                                objB = aosv.D(ajcqVarAS, ofeVar);
                                if (objB == aoluVar) {
                                    r13 = r12;
                                    return aoluVar;
                                }
                                r13 = r12;
                                if (((java.lang.Boolean) objB).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 81, "ExpressoSharedPreconditions.kt").v("call is video call, not showing expresso");
                                } else {
                                    ajcq ajcqVarAy = r13.ay();
                                    ofeVar.a = r13;
                                    ofeVar.d = 6;
                                    objB = aosv.D(ajcqVarAy, ofeVar);
                                    if (objB == aoluVar) {
                                        r14 = r13;
                                        return aoluVar;
                                    }
                                    r14 = r13;
                                    if (((java.lang.Boolean) aooh.p((j$.util.Optional) objB, java.lang.Boolean.FALSE)).booleanValue()) {
                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 90, "ExpressoSharedPreconditions.kt").v("call is business number, not showing expresso");
                                    } else {
                                        ajcq ajcqVarAU = r14.aU();
                                        ofeVar.a = r14;
                                        ofeVar.d = 7;
                                        objB = aosv.D(ajcqVarAU, ofeVar);
                                        if (objB == aoluVar) {
                                            r15 = r14;
                                            return aoluVar;
                                        }
                                        r15 = r14;
                                        if (((java.lang.Boolean) objB).booleanValue()) {
                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                                        } else {
                                            ajcq ajcqVarAC = r15.aC();
                                            ofeVar.a = r15;
                                            ofeVar.d = 8;
                                            objB = aosv.D(ajcqVarAC, ofeVar);
                                            if (objB == aoluVar) {
                                                r16 = r15;
                                                return aoluVar;
                                            }
                                            r16 = r15;
                                            if (((java.lang.Boolean) objB).booleanValue()) {
                                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                                            } else {
                                                ajcq ajcqVarAF = r16.aF();
                                                ofeVar.a = r16;
                                                ofeVar.d = 9;
                                                objB = aosv.D(ajcqVarAF, ofeVar);
                                                if (objB == aoluVar) {
                                                    r17 = r16;
                                                    return aoluVar;
                                                }
                                                r17 = r16;
                                                if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                                                } else {
                                                    ajcq ajcqVarAD = r17.aD();
                                                    ofeVar.a = r17;
                                                    ofeVar.d = 10;
                                                    objB = aosv.D(ajcqVarAD, ofeVar);
                                                    if (objB == aoluVar) {
                                                        r18 = r17;
                                                        return aoluVar;
                                                    }
                                                    r18 = r17;
                                                    if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                                                    } else {
                                                        amzg amzgVarBZ = r18.bZ();
                                                        ofeVar.a = null;
                                                        ofeVar.d = 11;
                                                        objB = a(amzgVarBZ, ofeVar);
                                                        if (objB == aoluVar) {
                                                            return aoluVar;
                                                        }
                                                        if (((java.lang.Boolean) objB).booleanValue()) {
                                                            z = true;
                                                        } else {
                                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 53, "ExpressoSharedPreconditions.kt").v("the feature is disabled by settings.");
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                java.lang.Object obj = ofeVar.a;
                aooc.af(objB);
                r9 = obj;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 53, "ExpressoSharedPreconditions.kt").v("the feature is disabled by settings.");
                } else {
                    ajcq ajcqVarAM2 = r9.aM();
                    ofeVar.a = r9;
                    ofeVar.d = 2;
                    objB = aosv.D(ajcqVarAM2, ofeVar);
                    if (objB == aoluVar) {
                        r10 = r9;
                        return aoluVar;
                    }
                    r10 = r9;
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 60, "ExpressoSharedPreconditions.kt").v("call is RTT call, not showing expresso");
                    } else {
                        ajcq ajcqVarAG2 = r10.aG();
                        ofeVar.a = r10;
                        ofeVar.d = 3;
                        objB = aosv.D(ajcqVarAG2, ofeVar);
                        if (objB == aoluVar) {
                            r11 = r10;
                            return aoluVar;
                        }
                        r11 = r10;
                        if (((java.lang.Boolean) objB).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 67, "ExpressoSharedPreconditions.kt").v("call is emergency call, not showing expresso");
                        } else {
                            ajcq ajcqVarAH2 = r11.aH();
                            ofeVar.a = r11;
                            ofeVar.d = 4;
                            objB = aosv.D(ajcqVarAH2, ofeVar);
                            if (objB == aoluVar) {
                                r12 = r11;
                                return aoluVar;
                            }
                            r12 = r11;
                            if (((java.lang.Boolean) objB).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 74, "ExpressoSharedPreconditions.kt").v("call is emergency callback, not showing expresso");
                            } else {
                                ajcq ajcqVarAS2 = r12.aS();
                                ofeVar.a = r12;
                                ofeVar.d = 5;
                                objB = aosv.D(ajcqVarAS2, ofeVar);
                                if (objB == aoluVar) {
                                    r13 = r12;
                                    return aoluVar;
                                }
                                r13 = r12;
                                if (((java.lang.Boolean) objB).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 81, "ExpressoSharedPreconditions.kt").v("call is video call, not showing expresso");
                                } else {
                                    ajcq ajcqVarAy2 = r13.ay();
                                    ofeVar.a = r13;
                                    ofeVar.d = 6;
                                    objB = aosv.D(ajcqVarAy2, ofeVar);
                                    if (objB == aoluVar) {
                                        r14 = r13;
                                        return aoluVar;
                                    }
                                    r14 = r13;
                                    if (((java.lang.Boolean) aooh.p((j$.util.Optional) objB, java.lang.Boolean.FALSE)).booleanValue()) {
                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 90, "ExpressoSharedPreconditions.kt").v("call is business number, not showing expresso");
                                    } else {
                                        ajcq ajcqVarAU2 = r14.aU();
                                        ofeVar.a = r14;
                                        ofeVar.d = 7;
                                        objB = aosv.D(ajcqVarAU2, ofeVar);
                                        if (objB == aoluVar) {
                                            r15 = r14;
                                            return aoluVar;
                                        }
                                        r15 = r14;
                                        if (((java.lang.Boolean) objB).booleanValue()) {
                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                                        } else {
                                            ajcq ajcqVarAC2 = r15.aC();
                                            ofeVar.a = r15;
                                            ofeVar.d = 8;
                                            objB = aosv.D(ajcqVarAC2, ofeVar);
                                            if (objB == aoluVar) {
                                                r16 = r15;
                                                return aoluVar;
                                            }
                                            r16 = r15;
                                            if (((java.lang.Boolean) objB).booleanValue()) {
                                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                                            } else {
                                                ajcq ajcqVarAF2 = r16.aF();
                                                ofeVar.a = r16;
                                                ofeVar.d = 9;
                                                objB = aosv.D(ajcqVarAF2, ofeVar);
                                                if (objB == aoluVar) {
                                                    r17 = r16;
                                                    return aoluVar;
                                                }
                                                r17 = r16;
                                                if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                                                } else {
                                                    ajcq ajcqVarAD2 = r17.aD();
                                                    ofeVar.a = r17;
                                                    ofeVar.d = 10;
                                                    objB = aosv.D(ajcqVarAD2, ofeVar);
                                                    if (objB == aoluVar) {
                                                        r18 = r17;
                                                        return aoluVar;
                                                    }
                                                    r18 = r17;
                                                    if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                                                    } else {
                                                        amzg amzgVarBZ2 = r18.bZ();
                                                        ofeVar.a = null;
                                                        ofeVar.d = 11;
                                                        objB = a(amzgVarBZ2, ofeVar);
                                                        if (objB == aoluVar) {
                                                            return aoluVar;
                                                        }
                                                        if (((java.lang.Boolean) objB).booleanValue()) {
                                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                                        } else {
                                                            z = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                java.lang.Object obj2 = ofeVar.a;
                aooc.af(objB);
                r10 = obj2;
                r10 = r9;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 60, "ExpressoSharedPreconditions.kt").v("call is RTT call, not showing expresso");
                } else {
                    ajcq ajcqVarAG3 = r10.aG();
                    ofeVar.a = r10;
                    ofeVar.d = 3;
                    objB = aosv.D(ajcqVarAG3, ofeVar);
                    if (objB == aoluVar) {
                        r11 = r10;
                        return aoluVar;
                    }
                    r11 = r10;
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 67, "ExpressoSharedPreconditions.kt").v("call is emergency call, not showing expresso");
                    } else {
                        ajcq ajcqVarAH3 = r11.aH();
                        ofeVar.a = r11;
                        ofeVar.d = 4;
                        objB = aosv.D(ajcqVarAH3, ofeVar);
                        if (objB == aoluVar) {
                            r12 = r11;
                            return aoluVar;
                        }
                        r12 = r11;
                        if (((java.lang.Boolean) objB).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 74, "ExpressoSharedPreconditions.kt").v("call is emergency callback, not showing expresso");
                        } else {
                            ajcq ajcqVarAS3 = r12.aS();
                            ofeVar.a = r12;
                            ofeVar.d = 5;
                            objB = aosv.D(ajcqVarAS3, ofeVar);
                            if (objB == aoluVar) {
                                r13 = r12;
                                return aoluVar;
                            }
                            r13 = r12;
                            if (((java.lang.Boolean) objB).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 81, "ExpressoSharedPreconditions.kt").v("call is video call, not showing expresso");
                            } else {
                                ajcq ajcqVarAy3 = r13.ay();
                                ofeVar.a = r13;
                                ofeVar.d = 6;
                                objB = aosv.D(ajcqVarAy3, ofeVar);
                                if (objB == aoluVar) {
                                    r14 = r13;
                                    return aoluVar;
                                }
                                r14 = r13;
                                if (((java.lang.Boolean) aooh.p((j$.util.Optional) objB, java.lang.Boolean.FALSE)).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 90, "ExpressoSharedPreconditions.kt").v("call is business number, not showing expresso");
                                } else {
                                    ajcq ajcqVarAU3 = r14.aU();
                                    ofeVar.a = r14;
                                    ofeVar.d = 7;
                                    objB = aosv.D(ajcqVarAU3, ofeVar);
                                    if (objB == aoluVar) {
                                        r15 = r14;
                                        return aoluVar;
                                    }
                                    r15 = r14;
                                    if (((java.lang.Boolean) objB).booleanValue()) {
                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                                    } else {
                                        ajcq ajcqVarAC3 = r15.aC();
                                        ofeVar.a = r15;
                                        ofeVar.d = 8;
                                        objB = aosv.D(ajcqVarAC3, ofeVar);
                                        if (objB == aoluVar) {
                                            r16 = r15;
                                            return aoluVar;
                                        }
                                        r16 = r15;
                                        if (((java.lang.Boolean) objB).booleanValue()) {
                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                                        } else {
                                            ajcq ajcqVarAF3 = r16.aF();
                                            ofeVar.a = r16;
                                            ofeVar.d = 9;
                                            objB = aosv.D(ajcqVarAF3, ofeVar);
                                            if (objB == aoluVar) {
                                                r17 = r16;
                                                return aoluVar;
                                            }
                                            r17 = r16;
                                            if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                                            } else {
                                                ajcq ajcqVarAD3 = r17.aD();
                                                ofeVar.a = r17;
                                                ofeVar.d = 10;
                                                objB = aosv.D(ajcqVarAD3, ofeVar);
                                                if (objB == aoluVar) {
                                                    r18 = r17;
                                                    return aoluVar;
                                                }
                                                r18 = r17;
                                                if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                                                } else {
                                                    amzg amzgVarBZ3 = r18.bZ();
                                                    ofeVar.a = null;
                                                    ofeVar.d = 11;
                                                    objB = a(amzgVarBZ3, ofeVar);
                                                    if (objB == aoluVar) {
                                                        return aoluVar;
                                                    }
                                                    if (((java.lang.Boolean) objB).booleanValue()) {
                                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                                    } else {
                                                        z = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                java.lang.Object obj3 = ofeVar.a;
                aooc.af(objB);
                r11 = obj3;
                r11 = r10;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 67, "ExpressoSharedPreconditions.kt").v("call is emergency call, not showing expresso");
                } else {
                    ajcq ajcqVarAH4 = r11.aH();
                    ofeVar.a = r11;
                    ofeVar.d = 4;
                    objB = aosv.D(ajcqVarAH4, ofeVar);
                    if (objB == aoluVar) {
                        r12 = r11;
                        return aoluVar;
                    }
                    r12 = r11;
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 74, "ExpressoSharedPreconditions.kt").v("call is emergency callback, not showing expresso");
                    } else {
                        ajcq ajcqVarAS4 = r12.aS();
                        ofeVar.a = r12;
                        ofeVar.d = 5;
                        objB = aosv.D(ajcqVarAS4, ofeVar);
                        if (objB == aoluVar) {
                            r13 = r12;
                            return aoluVar;
                        }
                        r13 = r12;
                        if (((java.lang.Boolean) objB).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 81, "ExpressoSharedPreconditions.kt").v("call is video call, not showing expresso");
                        } else {
                            ajcq ajcqVarAy4 = r13.ay();
                            ofeVar.a = r13;
                            ofeVar.d = 6;
                            objB = aosv.D(ajcqVarAy4, ofeVar);
                            if (objB == aoluVar) {
                                r14 = r13;
                                return aoluVar;
                            }
                            r14 = r13;
                            if (((java.lang.Boolean) aooh.p((j$.util.Optional) objB, java.lang.Boolean.FALSE)).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 90, "ExpressoSharedPreconditions.kt").v("call is business number, not showing expresso");
                            } else {
                                ajcq ajcqVarAU4 = r14.aU();
                                ofeVar.a = r14;
                                ofeVar.d = 7;
                                objB = aosv.D(ajcqVarAU4, ofeVar);
                                if (objB == aoluVar) {
                                    r15 = r14;
                                    return aoluVar;
                                }
                                r15 = r14;
                                if (((java.lang.Boolean) objB).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                                } else {
                                    ajcq ajcqVarAC4 = r15.aC();
                                    ofeVar.a = r15;
                                    ofeVar.d = 8;
                                    objB = aosv.D(ajcqVarAC4, ofeVar);
                                    if (objB == aoluVar) {
                                        r16 = r15;
                                        return aoluVar;
                                    }
                                    r16 = r15;
                                    if (((java.lang.Boolean) objB).booleanValue()) {
                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                                    } else {
                                        ajcq ajcqVarAF4 = r16.aF();
                                        ofeVar.a = r16;
                                        ofeVar.d = 9;
                                        objB = aosv.D(ajcqVarAF4, ofeVar);
                                        if (objB == aoluVar) {
                                            r17 = r16;
                                            return aoluVar;
                                        }
                                        r17 = r16;
                                        if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                                        } else {
                                            ajcq ajcqVarAD4 = r17.aD();
                                            ofeVar.a = r17;
                                            ofeVar.d = 10;
                                            objB = aosv.D(ajcqVarAD4, ofeVar);
                                            if (objB == aoluVar) {
                                                r18 = r17;
                                                return aoluVar;
                                            }
                                            r18 = r17;
                                            if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                                            } else {
                                                amzg amzgVarBZ4 = r18.bZ();
                                                ofeVar.a = null;
                                                ofeVar.d = 11;
                                                objB = a(amzgVarBZ4, ofeVar);
                                                if (objB == aoluVar) {
                                                    return aoluVar;
                                                }
                                                if (((java.lang.Boolean) objB).booleanValue()) {
                                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                                } else {
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 4:
                java.lang.Object obj4 = ofeVar.a;
                aooc.af(objB);
                r12 = obj4;
                r12 = r11;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 74, "ExpressoSharedPreconditions.kt").v("call is emergency callback, not showing expresso");
                } else {
                    ajcq ajcqVarAS5 = r12.aS();
                    ofeVar.a = r12;
                    ofeVar.d = 5;
                    objB = aosv.D(ajcqVarAS5, ofeVar);
                    if (objB == aoluVar) {
                        r13 = r12;
                        return aoluVar;
                    }
                    r13 = r12;
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 81, "ExpressoSharedPreconditions.kt").v("call is video call, not showing expresso");
                    } else {
                        ajcq ajcqVarAy5 = r13.ay();
                        ofeVar.a = r13;
                        ofeVar.d = 6;
                        objB = aosv.D(ajcqVarAy5, ofeVar);
                        if (objB == aoluVar) {
                            r14 = r13;
                            return aoluVar;
                        }
                        r14 = r13;
                        if (((java.lang.Boolean) aooh.p((j$.util.Optional) objB, java.lang.Boolean.FALSE)).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 90, "ExpressoSharedPreconditions.kt").v("call is business number, not showing expresso");
                        } else {
                            ajcq ajcqVarAU5 = r14.aU();
                            ofeVar.a = r14;
                            ofeVar.d = 7;
                            objB = aosv.D(ajcqVarAU5, ofeVar);
                            if (objB == aoluVar) {
                                r15 = r14;
                                return aoluVar;
                            }
                            r15 = r14;
                            if (((java.lang.Boolean) objB).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                            } else {
                                ajcq ajcqVarAC5 = r15.aC();
                                ofeVar.a = r15;
                                ofeVar.d = 8;
                                objB = aosv.D(ajcqVarAC5, ofeVar);
                                if (objB == aoluVar) {
                                    r16 = r15;
                                    return aoluVar;
                                }
                                r16 = r15;
                                if (((java.lang.Boolean) objB).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                                } else {
                                    ajcq ajcqVarAF5 = r16.aF();
                                    ofeVar.a = r16;
                                    ofeVar.d = 9;
                                    objB = aosv.D(ajcqVarAF5, ofeVar);
                                    if (objB == aoluVar) {
                                        r17 = r16;
                                        return aoluVar;
                                    }
                                    r17 = r16;
                                    if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                                    } else {
                                        ajcq ajcqVarAD5 = r17.aD();
                                        ofeVar.a = r17;
                                        ofeVar.d = 10;
                                        objB = aosv.D(ajcqVarAD5, ofeVar);
                                        if (objB == aoluVar) {
                                            r18 = r17;
                                            return aoluVar;
                                        }
                                        r18 = r17;
                                        if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                                        } else {
                                            amzg amzgVarBZ5 = r18.bZ();
                                            ofeVar.a = null;
                                            ofeVar.d = 11;
                                            objB = a(amzgVarBZ5, ofeVar);
                                            if (objB == aoluVar) {
                                                return aoluVar;
                                            }
                                            if (((java.lang.Boolean) objB).booleanValue()) {
                                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                            } else {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 5:
                java.lang.Object obj5 = ofeVar.a;
                aooc.af(objB);
                r13 = obj5;
                r13 = r12;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 81, "ExpressoSharedPreconditions.kt").v("call is video call, not showing expresso");
                } else {
                    ajcq ajcqVarAy6 = r13.ay();
                    ofeVar.a = r13;
                    ofeVar.d = 6;
                    objB = aosv.D(ajcqVarAy6, ofeVar);
                    if (objB == aoluVar) {
                        r14 = r13;
                        return aoluVar;
                    }
                    r14 = r13;
                    if (((java.lang.Boolean) aooh.p((j$.util.Optional) objB, java.lang.Boolean.FALSE)).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 90, "ExpressoSharedPreconditions.kt").v("call is business number, not showing expresso");
                    } else {
                        ajcq ajcqVarAU6 = r14.aU();
                        ofeVar.a = r14;
                        ofeVar.d = 7;
                        objB = aosv.D(ajcqVarAU6, ofeVar);
                        if (objB == aoluVar) {
                            r15 = r14;
                            return aoluVar;
                        }
                        r15 = r14;
                        if (((java.lang.Boolean) objB).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                        } else {
                            ajcq ajcqVarAC6 = r15.aC();
                            ofeVar.a = r15;
                            ofeVar.d = 8;
                            objB = aosv.D(ajcqVarAC6, ofeVar);
                            if (objB == aoluVar) {
                                r16 = r15;
                                return aoluVar;
                            }
                            r16 = r15;
                            if (((java.lang.Boolean) objB).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                            } else {
                                ajcq ajcqVarAF6 = r16.aF();
                                ofeVar.a = r16;
                                ofeVar.d = 9;
                                objB = aosv.D(ajcqVarAF6, ofeVar);
                                if (objB == aoluVar) {
                                    r17 = r16;
                                    return aoluVar;
                                }
                                r17 = r16;
                                if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                                } else {
                                    ajcq ajcqVarAD6 = r17.aD();
                                    ofeVar.a = r17;
                                    ofeVar.d = 10;
                                    objB = aosv.D(ajcqVarAD6, ofeVar);
                                    if (objB == aoluVar) {
                                        r18 = r17;
                                        return aoluVar;
                                    }
                                    r18 = r17;
                                    if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                                    } else {
                                        amzg amzgVarBZ6 = r18.bZ();
                                        ofeVar.a = null;
                                        ofeVar.d = 11;
                                        objB = a(amzgVarBZ6, ofeVar);
                                        if (objB == aoluVar) {
                                            return aoluVar;
                                        }
                                        if (((java.lang.Boolean) objB).booleanValue()) {
                                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                        } else {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 6:
                java.lang.Object obj6 = ofeVar.a;
                aooc.af(objB);
                r14 = obj6;
                r14 = r13;
                if (((java.lang.Boolean) aooh.p((j$.util.Optional) objB, java.lang.Boolean.FALSE)).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 90, "ExpressoSharedPreconditions.kt").v("call is business number, not showing expresso");
                } else {
                    ajcq ajcqVarAU7 = r14.aU();
                    ofeVar.a = r14;
                    ofeVar.d = 7;
                    objB = aosv.D(ajcqVarAU7, ofeVar);
                    if (objB == aoluVar) {
                        r15 = r14;
                        return aoluVar;
                    }
                    r15 = r14;
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                    } else {
                        ajcq ajcqVarAC7 = r15.aC();
                        ofeVar.a = r15;
                        ofeVar.d = 8;
                        objB = aosv.D(ajcqVarAC7, ofeVar);
                        if (objB == aoluVar) {
                            r16 = r15;
                            return aoluVar;
                        }
                        r16 = r15;
                        if (((java.lang.Boolean) objB).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                        } else {
                            ajcq ajcqVarAF7 = r16.aF();
                            ofeVar.a = r16;
                            ofeVar.d = 9;
                            objB = aosv.D(ajcqVarAF7, ofeVar);
                            if (objB == aoluVar) {
                                r17 = r16;
                                return aoluVar;
                            }
                            r17 = r16;
                            if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                            } else {
                                ajcq ajcqVarAD7 = r17.aD();
                                ofeVar.a = r17;
                                ofeVar.d = 10;
                                objB = aosv.D(ajcqVarAD7, ofeVar);
                                if (objB == aoluVar) {
                                    r18 = r17;
                                    return aoluVar;
                                }
                                r18 = r17;
                                if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                                } else {
                                    amzg amzgVarBZ7 = r18.bZ();
                                    ofeVar.a = null;
                                    ofeVar.d = 11;
                                    objB = a(amzgVarBZ7, ofeVar);
                                    if (objB == aoluVar) {
                                        return aoluVar;
                                    }
                                    if (((java.lang.Boolean) objB).booleanValue()) {
                                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                    } else {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 7:
                java.lang.Object obj7 = ofeVar.a;
                aooc.af(objB);
                r15 = obj7;
                r15 = r14;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 97, "ExpressoSharedPreconditions.kt").v("call is voicemail number, not showing expresso");
                } else {
                    ajcq ajcqVarAC8 = r15.aC();
                    ofeVar.a = r15;
                    ofeVar.d = 8;
                    objB = aosv.D(ajcqVarAC8, ofeVar);
                    if (objB == aoluVar) {
                        r16 = r15;
                        return aoluVar;
                    }
                    r16 = r15;
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                    } else {
                        ajcq ajcqVarAF8 = r16.aF();
                        ofeVar.a = r16;
                        ofeVar.d = 9;
                        objB = aosv.D(ajcqVarAF8, ofeVar);
                        if (objB == aoluVar) {
                            r17 = r16;
                            return aoluVar;
                        }
                        r17 = r16;
                        if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                        } else {
                            ajcq ajcqVarAD8 = r17.aD();
                            ofeVar.a = r17;
                            ofeVar.d = 10;
                            objB = aosv.D(ajcqVarAD8, ofeVar);
                            if (objB == aoluVar) {
                                r18 = r17;
                                return aoluVar;
                            }
                            r18 = r17;
                            if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                            } else {
                                amzg amzgVarBZ8 = r18.bZ();
                                ofeVar.a = null;
                                ofeVar.d = 11;
                                objB = a(amzgVarBZ8, ofeVar);
                                if (objB == aoluVar) {
                                    return aoluVar;
                                }
                                if (((java.lang.Boolean) objB).booleanValue()) {
                                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 8:
                java.lang.Object obj8 = ofeVar.a;
                aooc.af(objB);
                r16 = obj8;
                r16 = r15;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 104, "ExpressoSharedPreconditions.kt").v("call is conference call, not showing expresso");
                } else {
                    ajcq ajcqVarAF9 = r16.aF();
                    ofeVar.a = r16;
                    ofeVar.d = 9;
                    objB = aosv.D(ajcqVarAF9, ofeVar);
                    if (objB == aoluVar) {
                        r17 = r16;
                        return aoluVar;
                    }
                    r17 = r16;
                    if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                    } else {
                        ajcq ajcqVarAD9 = r17.aD();
                        ofeVar.a = r17;
                        ofeVar.d = 10;
                        objB = aosv.D(ajcqVarAD9, ofeVar);
                        if (objB == aoluVar) {
                            r18 = r17;
                            return aoluVar;
                        }
                        r18 = r17;
                        if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                        } else {
                            amzg amzgVarBZ9 = r18.bZ();
                            ofeVar.a = null;
                            ofeVar.d = 11;
                            objB = a(amzgVarBZ9, ofeVar);
                            if (objB == aoluVar) {
                                return aoluVar;
                            }
                            if (((java.lang.Boolean) objB).booleanValue()) {
                                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                java.lang.Object obj9 = ofeVar.a;
                aooc.af(objB);
                r17 = obj9;
                r17 = r16;
                if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 111, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to xatu, not showing expresso");
                } else {
                    ajcq ajcqVarAD10 = r17.aD();
                    ofeVar.a = r17;
                    ofeVar.d = 10;
                    objB = aosv.D(ajcqVarAD10, ofeVar);
                    if (objB == aoluVar) {
                        r18 = r17;
                        return aoluVar;
                    }
                    r18 = r17;
                    if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                    } else {
                        amzg amzgVarBZ10 = r18.bZ();
                        ofeVar.a = null;
                        ofeVar.d = 11;
                        objB = a(amzgVarBZ10, ofeVar);
                        if (objB == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objB).booleanValue()) {
                            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                        } else {
                            z = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 10:
                java.lang.Object obj10 = ofeVar.a;
                aooc.af(objB);
                r18 = obj10;
                r18 = r17;
                if (((java.lang.Boolean) ((j$.util.Optional) objB).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 118, "ExpressoSharedPreconditions.kt").v("call is eligible to upgrade to atlas, not showing expresso");
                } else {
                    amzg amzgVarBZ11 = r18.bZ();
                    ofeVar.a = null;
                    ofeVar.d = 11;
                    objB = a(amzgVarBZ11, ofeVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objB).booleanValue()) {
                        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                    } else {
                        z = true;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 11:
                aooc.af(objB);
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/preconditions/ExpressoSharedPreconditions", "arePreconditionsSatisfied", 125, "ExpressoSharedPreconditions.kt").v("the feature is disabled by non-contact.");
                } else {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
