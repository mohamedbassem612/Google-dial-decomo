package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hnx implements defpackage.hqs {
    public final aozh a;
    private final hpy b;
    private final aoss c;
    private final aoin d;
    private final zpm e;
    private final aozj f;

    public hnx(zpm zpmVar, hpy hpyVar, aoss aossVar, aoin aoinVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(hpyVar, "carInCallUpdateListener");
        aooh.f(aossVar, "lightweightScope");
        this.e = zpmVar;
        this.b = hpyVar;
        this.c = aossVar;
        this.d = aoinVar;
        aozj aozjVarA = aozk.a((java.lang.Object) null);
        this.f = aozjVarA;
        this.a = aozjVarA;
    }

    private final java.lang.Object g(apqr apqrVar, aoln aolnVar) {
        ajcq ajcqVarX = ((defpackage.hnn) apqrVar.a(defpackage.hnn.class)).lD().X();
        aosy aosyVarAm = aoov.am(this.c, 0, new defpackage.hnt(ajcqVarX, (aoln) null, 1), 3);
        aosyVarAm.p(new defpackage.aib(ajcqVarX, 14));
        return aosyVarAm.a(aolnVar);
    }

    @Override // defpackage.hqs
    public final aoxh a() {
        boolean zBooleanValue = ((java.lang.Boolean) this.d.a()).booleanValue();
        hpy hpyVar = this.b;
        if (!zBooleanValue) {
            return aoxo.a(aoyc.a(aoyc.a(hpyVar.a, new defpackage.hnt(this, (aoln) null, 0)), new defpackage.dqx(this, (aoln) null, 4)));
        }
        defpackage.hlh hlhVar = new defpackage.hlh(aoov.aD(hpyVar.a, -1), this, 4);
        defpackage.fxb fxbVar = new defpackage.fxb(2);
        aonj aonjVar = aoxo.a;
        aoov.f(fxbVar, 2);
        return aoxo.a(new defpackage.hlh(aoxo.b(hlhVar, aonjVar, fxbVar), this, 5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.hnu hnuVar;
        if (aolnVar instanceof defpackage.hnu) {
            hnuVar = (defpackage.hnu) aolnVar;
            int i = hnuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnuVar.c = i - Integer.MIN_VALUE;
            } else {
                hnuVar = new defpackage.hnu(this, aolnVar);
            }
        } else {
            hnuVar = new defpackage.hnu(this, aolnVar);
        }
        java.lang.Object obj = hnuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hnuVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            hnuVar.c = 1;
            if (ahre.a((aolr) null, hnuVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        boolean z = ahns.a;
        ahpe ahpeVarA = ahns.a();
        ahne ahneVar = ahpeVarA.e;
        if (ahneVar == null) {
            throw new java.lang.IllegalStateException("reactiveTraced should be used within TikTok provided CoroutineContext");
        }
        ahnd ahndVar = ahneVar.b;
        if (ahndVar == ahnd.b) {
            try {
                zpm zpmVar = this.e;
                j$.util.Optional optionalH = zpmVar.h();
                aooh.e(optionalH, "getPrimaryCallScope(...)");
                apqr apqrVar = (apqr) aooh.q(optionalH);
                j$.util.Optional optionalI = zpmVar.i();
                aooh.e(optionalI, "getSecondaryCallScope(...)");
                apqr apqrVar2 = (apqr) aooh.q(optionalI);
                aihd aihdVarB = zpmVar.b(zpo.d);
                return (apqrVar == null || !aihdVarB.contains(apqrVar) || apqrVar2 == null || aihdVarB.contains(apqrVar2)) ? apqrVar : apqrVar2;
            } catch (java.lang.Throwable th) {
                ahnn.b(th);
                throw th;
            }
        }
        if (ahndVar == ahnd.a) {
            throw new java.lang.IllegalStateException("Already has a manually propagated trace, resuming executor trace may change causality.");
        }
        ahpj ahpjVarB = ahns.b();
        if (ahpjVarB != null && ahpjVarB != ahoo.a && ahpjVarB != ahneVar.c) {
            throw new java.lang.IllegalStateException("Do not call reactiveTraced with the trace present: the reactive pattern should be used in long-lived coroutines to avoid trace leaks, and therefore having the trace present in the coroutine defeats the purpose. See go/tiktok/dev/concurrent/coroutines/tracing#flows");
        }
        ahob ahobVarM = ahpeVarA.d;
        if (ahobVarM == null) {
            ahobVarM = ahob.m(ahpeVarA);
        }
        ahnd ahndVar2 = ahnd.b;
        ahnd ahndVar3 = ahneVar.b;
        if (ahobVarM == ahoo.a) {
            ahndVar2 = ahnd.c;
        }
        ahneVar.b = ahndVar2;
        ahpj ahpjVarD = ahns.d(ahpeVarA, ahobVarM);
        try {
            zpm zpmVar2 = this.e;
            j$.util.Optional optionalH2 = zpmVar2.h();
            aooh.e(optionalH2, "getPrimaryCallScope(...)");
            apqr apqrVar3 = (apqr) aooh.q(optionalH2);
            j$.util.Optional optionalI2 = zpmVar2.i();
            aooh.e(optionalI2, "getSecondaryCallScope(...)");
            apqr apqrVar4 = (apqr) aooh.q(optionalI2);
            aihd aihdVarB2 = zpmVar2.b(zpo.d);
            if (apqrVar3 != null && aihdVarB2.contains(apqrVar3) && apqrVar4 != null && !aihdVarB2.contains(apqrVar4)) {
                apqrVar3 = apqrVar4;
            }
            ahns.d(ahns.a(), ahpjVarD);
            ahneVar.b = ahndVar3;
            return apqrVar3;
        } catch (java.lang.Throwable th2) {
            try {
                ahnn.b(th2);
                throw th2;
            } catch (java.lang.Throwable th3) {
                ahns.d(ahns.a(), ahpjVarD);
                ahneVar.b = ahndVar3;
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(apqr apqrVar, aoln aolnVar) {
        defpackage.hnp hnpVar;
        if (aolnVar instanceof defpackage.hnp) {
            hnpVar = (defpackage.hnp) aolnVar;
            int i = hnpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnpVar.c = i - Integer.MIN_VALUE;
            } else {
                hnpVar = new defpackage.hnp(this, aolnVar);
            }
        } else {
            hnpVar = new defpackage.hnp(this, aolnVar);
        }
        java.lang.Object objG = hnpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hnpVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objG);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objG);
            }
            return (defpackage.hnh) objG;
        }
        aooc.af(objG);
        zpm zpmVar = this.e;
        if (!zpmVar.g().equals(j$.util.Optional.ofNullable(apqrVar))) {
            j$.util.Optional optionalG = zpmVar.g();
            aooh.e(optionalG, "getBackgroundCallScope(...)");
            apqr apqrVar2 = (apqr) aooh.q(optionalG);
            if (apqrVar2 != null) {
                hnpVar.c = 1;
                objG = g(apqrVar2, hnpVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return null;
        defpackage.hkl hklVar = (defpackage.hkl) objG;
        if (hklVar != null) {
            hnpVar.c = 2;
            aoss aossVar = this.c;
            ajcq ajcqVarH = ((defpackage.hno) aooc.ar(hklVar, defpackage.hno.class)).H();
            aosy aosyVarAm = aoov.am(aossVar, 0, new defpackage.hnt(ajcqVarH, (aoln) null, 2, (byte[]) null), 3);
            aosyVarAm.p(new defpackage.aib(ajcqVarH, 15));
            objG = aosyVarAm.a(hnpVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
            return (defpackage.hnh) objG;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(apqr r11, aoln r12) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnx.d(apqr, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(apqr apqrVar, aoln aolnVar) {
        defpackage.hnr hnrVar;
        ahne ahneVar;
        ahpj ahpjVar;
        ahne ahneVar2;
        java.lang.Throwable th;
        ahnd ahndVar;
        ahpj ahpjVar2;
        apqr apqrVar2;
        ahnd ahndVar2;
        defpackage.hol holVar;
        java.lang.Object objC;
        defpackage.hol holVar2;
        defpackage.hol holVar3;
        java.lang.Object objC2;
        defpackage.hol holVar4;
        if (aolnVar instanceof defpackage.hnr) {
            hnrVar = (defpackage.hnr) aolnVar;
            int i = hnrVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnrVar.e = i - Integer.MIN_VALUE;
            } else {
                hnrVar = new defpackage.hnr(this, aolnVar);
            }
        } else {
            hnrVar = new defpackage.hnr(this, aolnVar);
        }
        java.lang.Object objF = hnrVar.c;
        aolu aoluVar = aolu.a;
        int i2 = hnrVar.e;
        try {
            if (i2 == 0) {
                aooc.af(objF);
                hnrVar.a = apqrVar;
                hnrVar.e = 1;
                if (ahre.a((aolr) null, hnrVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        apqrVar = (apqr) hnrVar.a;
                        aooc.af(objF);
                        holVar = (defpackage.hol) objF;
                        hnrVar.a = holVar;
                        hnrVar.e = 3;
                        objC = c(apqrVar, hnrVar);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        objF = objC;
                        holVar2 = holVar;
                    } else {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ahndVar = hnrVar.g;
                                ahneVar2 = hnrVar.f;
                                holVar4 = (defpackage.hol) hnrVar.b;
                                ahpjVar = (ahpj) hnrVar.a;
                                try {
                                    aooc.af(objF);
                                    defpackage.hoe hoeVar = new defpackage.hoe(holVar4, (defpackage.hnh) objF);
                                    ahns.d(ahns.a(), ahpjVar);
                                    ahneVar2.b = ahndVar;
                                    return hoeVar;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    try {
                                        ahnn.b(th);
                                        throw th;
                                    } catch (java.lang.Throwable th3) {
                                        ahns.d(ahns.a(), ahpjVar);
                                        ahneVar2.b = ahndVar;
                                        throw th3;
                                    }
                                }
                            }
                            ahndVar2 = hnrVar.g;
                            ahneVar = hnrVar.f;
                            ahpjVar2 = (ahpj) hnrVar.b;
                            apqrVar2 = (apqr) hnrVar.a;
                            try {
                                aooc.af(objF);
                                try {
                                    holVar3 = (defpackage.hol) objF;
                                    hnrVar.a = ahpjVar2;
                                    hnrVar.b = holVar3;
                                    hnrVar.f = ahneVar;
                                    hnrVar.g = ahndVar2;
                                    hnrVar.e = 5;
                                    objC2 = c(apqrVar2, hnrVar);
                                    if (objC2 != aoluVar) {
                                        return aoluVar;
                                    }
                                    holVar4 = holVar3;
                                    ahpjVar = ahpjVar2;
                                    objF = objC2;
                                    ahndVar = ahndVar2;
                                    ahneVar2 = ahneVar;
                                    defpackage.hoe hoeVar2 = new defpackage.hoe(holVar4, (defpackage.hnh) objF);
                                    ahns.d(ahns.a(), ahpjVar);
                                    ahneVar2.b = ahndVar;
                                    return hoeVar2;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    ahndVar = ahndVar2;
                                    ahneVar2 = ahneVar;
                                    ahpjVar = ahpjVar2;
                                    ahnn.b(th);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                ahndVar = ahndVar2;
                                ahneVar2 = ahneVar;
                                ahpjVar = ahpjVar2;
                                ahnn.b(th);
                                throw th;
                            }
                        }
                        holVar2 = (defpackage.hol) hnrVar.a;
                        aooc.af(objF);
                    }
                    return new defpackage.hoe(holVar2, (defpackage.hnh) objF);
                }
                apqrVar = (apqr) hnrVar.a;
                aooc.af(objF);
            }
            boolean z = ahns.a;
            ahpe ahpeVarA = ahns.a();
            ahneVar = ahpeVarA.e;
            if (ahneVar == null) {
                throw new java.lang.IllegalStateException("reactiveTraced should be used within TikTok provided CoroutineContext");
            }
            ahnd ahndVar3 = ahneVar.b;
            if (ahndVar3 == ahnd.b) {
                this.f.e(apqrVar);
                hnrVar.a = apqrVar;
                hnrVar.e = 2;
                objF = f(apqrVar, hnrVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                holVar = (defpackage.hol) objF;
                hnrVar.a = holVar;
                hnrVar.e = 3;
                objC = c(apqrVar, hnrVar);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                objF = objC;
                holVar2 = holVar;
                return new defpackage.hoe(holVar2, (defpackage.hnh) objF);
            }
            if (ahndVar3 == ahnd.a) {
                throw new java.lang.IllegalStateException("Already has a manually propagated trace, resuming executor trace may change causality.");
            }
            ahpj ahpjVarB = ahns.b();
            if (ahpjVarB != null && ahpjVarB != ahoo.a && ahpjVarB != ahneVar.c) {
                throw new java.lang.IllegalStateException("Do not call reactiveTraced with the trace present: the reactive pattern should be used in long-lived coroutines to avoid trace leaks, and therefore having the trace present in the coroutine defeats the purpose. See go/tiktok/dev/concurrent/coroutines/tracing#flows");
            }
            ahob ahobVarM = ahpeVarA.d;
            if (ahobVarM == null) {
                ahobVarM = ahob.m(ahpeVarA);
            }
            ahnd ahndVar4 = ahnd.b;
            ahnd ahndVar5 = ahneVar.b;
            if (ahobVarM == ahoo.a) {
                ahndVar4 = ahnd.c;
            }
            ahneVar.b = ahndVar4;
            ahpj ahpjVarD = ahns.d(ahpeVarA, ahobVarM);
            try {
                this.f.e(apqrVar);
                hnrVar.a = apqrVar;
                hnrVar.b = ahpjVarD;
                hnrVar.f = ahneVar;
                hnrVar.g = ahndVar5;
                hnrVar.e = 4;
                java.lang.Object objF2 = f(apqrVar, hnrVar);
                if (objF2 == aoluVar) {
                    return aoluVar;
                }
                ahpjVar2 = ahpjVarD;
                objF = objF2;
                apqrVar2 = apqrVar;
                ahndVar2 = ahndVar5;
                holVar3 = (defpackage.hol) objF;
                hnrVar.a = ahpjVar2;
                hnrVar.b = holVar3;
                hnrVar.f = ahneVar;
                hnrVar.g = ahndVar2;
                hnrVar.e = 5;
                objC2 = c(apqrVar2, hnrVar);
                if (objC2 != aoluVar) {
                    return aoluVar;
                }
                holVar4 = holVar3;
                ahpjVar = ahpjVar2;
                objF = objC2;
                ahndVar = ahndVar2;
                ahneVar2 = ahneVar;
                defpackage.hoe hoeVar3 = new defpackage.hoe(holVar4, (defpackage.hnh) objF);
                ahns.d(ahns.a(), ahpjVar);
                ahneVar2.b = ahndVar;
                return hoeVar3;
            } catch (java.lang.Throwable th6) {
                ahpjVar = ahpjVarD;
                ahneVar2 = ahneVar;
                th = th6;
                ahndVar = ahndVar5;
                ahnn.b(th);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            ahnn.b(th7);
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(apqr apqrVar, aoln aolnVar) {
        defpackage.hns hnsVar;
        if (aolnVar instanceof defpackage.hns) {
            hnsVar = (defpackage.hns) aolnVar;
            int i = hnsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnsVar.c = i - Integer.MIN_VALUE;
            } else {
                hnsVar = new defpackage.hns(this, aolnVar);
            }
        } else {
            hnsVar = new defpackage.hns(this, aolnVar);
        }
        java.lang.Object objG = hnsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hnsVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objG);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objG);
            }
            return (defpackage.hol) objG;
        }
        aooc.af(objG);
        if (apqrVar != null) {
            hnsVar.c = 1;
            objG = g(apqrVar, hnsVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        }
        return null;
        defpackage.hkl hklVar = (defpackage.hkl) objG;
        if (hklVar != null) {
            hnsVar.c = 2;
            aoss aossVar = this.c;
            ajcq ajcqVarI = ((defpackage.hno) aooc.ar(hklVar, defpackage.hno.class)).I();
            aosy aosyVarAm = aoov.am(aossVar, 0, new defpackage.hnt(ajcqVarI, (aoln) null, 3, (char[]) null), 3);
            aosyVarAm.p(new defpackage.aib(ajcqVarI, 16));
            objG = aosyVarAm.a(hnsVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
            return (defpackage.hol) objG;
        }
        return null;
    }
}
