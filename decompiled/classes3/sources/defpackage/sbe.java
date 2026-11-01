package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sbe {
    private static final aimz b = aimz.i("com/android/dialer/patrick/impl/displayname/PatrickDisplayNameUiDataProvider");
    public final aoss a;
    private final defpackage.zot c;
    private final aoin d;
    private final aoin e;
    private final defpackage.afpl f;

    public sbe(defpackage.zot zotVar, defpackage.afpl afplVar, aoin aoinVar, aoss aossVar, aoin aoinVar2) {
        aooh.f(zotVar, "blockingInCallCache");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aossVar, "lightweightScope");
        this.c = zotVar;
        this.f = afplVar;
        this.d = aoinVar;
        this.a = aossVar;
        this.e = aoinVar2;
    }

    public static final void e(java.lang.Throwable th) {
        boolean z = th instanceof aovk;
        aimz aimzVar = b;
        if (z) {
            aimzVar.b().k(th).l("com/android/dialer/patrick/impl/displayname/PatrickDisplayNameUiDataProvider", "logError", 74, "PatrickDisplayNameUiDataProvider.kt").v("Patrick display name timed out.");
        } else {
            aimzVar.d().k(th).l("com/android/dialer/patrick/impl/displayname/PatrickDisplayNameUiDataProvider", "logError", 76, "PatrickDisplayNameUiDataProvider.kt").v("Patrick display name failed.");
        }
    }

    public static final defpackage.pmp f(defpackage.abxt abxtVar) {
        defpackage.oyx oyxVarAh = pez.ah(defpackage.pmp.a.m());
        if ((abxtVar.b & 2) != 0) {
            akzx akzxVarM = defpackage.pmo.a.m();
            aooh.f(akzxVarM, "builder");
            defpackage.abxr abxrVar = abxtVar.d;
            if (abxrVar == null) {
                abxrVar = defpackage.abxr.a;
            }
            float f = abxrVar.d;
            akzxVarM.u();
            defpackage.pmo pmoVar = (defpackage.pmo) akzxVarM.b;
            pmoVar.b |= 1;
            pmoVar.c = f;
            defpackage.abxr abxrVar2 = abxtVar.d;
            if (abxrVar2 == null) {
                abxrVar2 = defpackage.abxr.a;
            }
            float f2 = abxrVar2.e;
            akzxVarM.u();
            defpackage.pmo pmoVar2 = (defpackage.pmo) akzxVarM.b;
            pmoVar2.b |= 2;
            pmoVar2.d = f2;
            defpackage.abxr abxrVar3 = abxtVar.d;
            if (abxrVar3 == null) {
                abxrVar3 = defpackage.abxr.a;
            }
            int i = abxrVar3.f;
            akzxVarM.u();
            defpackage.pmo pmoVar3 = (defpackage.pmo) akzxVarM.b;
            pmoVar3.b |= 4;
            pmoVar3.e = i;
            defpackage.abxr abxrVar4 = abxtVar.d;
            if (abxrVar4 == null) {
                abxrVar4 = defpackage.abxr.a;
            }
            int i2 = abxrVar4.g;
            akzxVarM.u();
            defpackage.pmo pmoVar4 = (defpackage.pmo) akzxVarM.b;
            pmoVar4.b |= 8;
            pmoVar4.f = i2;
            defpackage.abxr abxrVar5 = abxtVar.d;
            if (abxrVar5 == null) {
                abxrVar5 = defpackage.abxr.a;
            }
            float f3 = abxrVar5.h;
            akzxVarM.u();
            defpackage.pmo pmoVar5 = (defpackage.pmo) akzxVarM.b;
            pmoVar5.b |= 16;
            pmoVar5.g = f3;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.pmo pmoVar6 = (defpackage.pmo) aladVarP;
            aooh.f(pmoVar6, "value");
            akzx akzxVar = (akzx) oyxVarAh.a;
            akzxVar.u();
            defpackage.pmp pmpVar = (defpackage.pmp) akzxVar.b;
            j$.util.Objects.requireNonNull(pmoVar6);
            pmpVar.d = pmoVar6;
            pmpVar.b |= 2;
            defpackage.abxr abxrVar6 = abxtVar.d;
            if (((abxrVar6 == null ? defpackage.abxr.a : abxrVar6).b & 1) != 0) {
                if (abxrVar6 == null) {
                    abxrVar6 = defpackage.abxr.a;
                }
                defpackage.amml ammlVar = abxrVar6.c;
                if (ammlVar == null) {
                    ammlVar = defpackage.amml.a;
                }
                aooh.e(ammlVar, "getColor(...)");
                aooh.f(ammlVar, "value");
                akzxVar.u();
                defpackage.pmp pmpVar2 = (defpackage.pmp) akzxVar.b;
                j$.util.Objects.requireNonNull(ammlVar);
                pmpVar2.c = ammlVar;
                pmpVar2.b |= 1;
            }
        }
        return oyxVarAh.m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v7, types: [ahoq] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.saz sazVar;
        java.lang.Throwable th;
        ?? Z;
        ?? r1;
        java.lang.Object obj;
        aoot aootVar;
        ?? r2;
        defpackage.pmp pmpVar;
        defpackage.pmp pmpVar2;
        java.lang.Object obj2;
        ?? r3;
        if (aolnVar instanceof defpackage.saz) {
            sazVar = (defpackage.saz) aolnVar;
            int i = sazVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sazVar.c = i - Integer.MIN_VALUE;
            } else {
                sazVar = new defpackage.saz(this, aolnVar);
            }
        } else {
            sazVar = new defpackage.saz(this, aolnVar);
        }
        defpackage.saz sazVar2 = sazVar;
        java.lang.Object obj3 = sazVar2.a;
        defpackage.pmp pmpVar3 = aolu.a;
        int i2 = sazVar2.c;
        ?? r4 = 2;
        try {
            if (i2 == 0) {
                aooc.af(obj3);
                if (!ahvr.R(sazVar2.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                Z = ahvr.Z(777, "PatrickDisplayNameUiDataProvider_getDisplayNameUiData");
                try {
                    aoot aootVar2 = new aoot();
                    if (((java.lang.Boolean) this.e.a()).booleanValue()) {
                        sazVar2.e = Z;
                        sazVar2.c = 1;
                        java.lang.Object objC = c(sazVar2);
                        if (objC != pmpVar3) {
                            pmpVar2 = pmpVar3;
                            Z = Z;
                            r2 = Z;
                            obj3 = objC;
                            defpackage.pmp pmpVar4 = (defpackage.pmp) obj3;
                            pmpVar = pmpVar4;
                            r3 = r2;
                            obj2 = pmpVar4;
                        }
                    } else {
                        defpackage.zot zotVar = this.c;
                        defpackage.zor zorVar = defpackage.zor.b;
                        defpackage.sba sbaVar = new defpackage.sba(this, 0);
                        java.lang.Object objA = this.d.a();
                        aooh.e(objA, "get(...)");
                        long jLongValue = ((java.lang.Number) objA).longValue();
                        sazVar2.e = Z;
                        sazVar2.d = aootVar2;
                        sazVar2.c = 2;
                        java.lang.Object objA2 = zotVar.a(zorVar, sbaVar, jLongValue, sazVar2);
                        if (objA2 != pmpVar3) {
                            pmpVar2 = pmpVar3;
                            Z = Z;
                            r1 = Z;
                            obj = objA2;
                            aootVar = aootVar2;
                            aehj.ck(obj, new defpackage.rzt(aootVar, 3));
                            aehj.cj(obj, new qks(20));
                            pmpVar = (defpackage.pmp) aootVar.a;
                            r3 = r1;
                            obj2 = obj;
                        }
                    }
                    pmpVar2 = pmpVar3;
                    Z = Z;
                    pmpVar2 = pmpVar3;
                    Z = Z;
                    return pmpVar2;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r4 = Z;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        ajsz.ak((java.io.Closeable) r4, th);
                        throw th3;
                    }
                }
            }
            if (i2 == 1) {
                ahoq ahoqVar = sazVar2.e;
                aooc.af(obj3);
                r2 = ahoqVar;
                defpackage.pmp pmpVar5 = (defpackage.pmp) obj3;
                pmpVar = pmpVar5;
                r3 = r2;
                obj2 = pmpVar5;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aootVar = sazVar2.d;
                ahoq ahoqVar2 = sazVar2.e;
                aooc.af(obj3);
                r1 = ahoqVar2;
                obj = ((defpackage.zpb) obj3).a;
                aehj.ck(obj, new defpackage.rzt(aootVar, 3));
                aehj.cj(obj, new qks(20));
                pmpVar = (defpackage.pmp) aootVar.a;
                r3 = r1;
                obj2 = obj;
            }
            ajsz.ak((java.io.Closeable) r3, (java.lang.Throwable) null);
            pmpVar2 = pmpVar;
            Z = obj2;
            pmpVar2 = pmpVar3;
            Z = Z;
            pmpVar2 = pmpVar3;
            Z = Z;
            return pmpVar2;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.sbb sbbVar;
        if (aolnVar instanceof defpackage.sbb) {
            sbbVar = (defpackage.sbb) aolnVar;
            int i = sbbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbbVar.c = i - Integer.MIN_VALUE;
            } else {
                sbbVar = new defpackage.sbb(this, aolnVar);
            }
        } else {
            sbbVar = new defpackage.sbb(this, aolnVar);
        }
        java.lang.Object objD = sbbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sbbVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.f.X();
            sbbVar.c = 1;
            objD = aosv.D(ajcqVarX, sbbVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.say.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x0028, B:28:0x006c, B:30:0x008b, B:31:0x0099, B:18:0x0036, B:26:0x005c), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [sbe] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Closeable] */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.sbc sbcVar;
        ahoq ahoqVar;
        aehj aehjVar;
        aoot aootVar;
        if (aolnVar instanceof defpackage.sbc) {
            sbcVar = (defpackage.sbc) aolnVar;
            int i = sbcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbcVar.c = i - Integer.MIN_VALUE;
            } else {
                sbcVar = new defpackage.sbc(this, aolnVar);
            }
        } else {
            sbcVar = new defpackage.sbc(this, aolnVar);
        }
        java.lang.Object objD = sbcVar.a;
        defpackage.pmp pmpVar = aolu.a;
        int i2 = sbcVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ahoq ahoqVar2 = sbcVar.d;
                    aooc.af(objD);
                    ahoqVar = ahoqVar2;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ahoq ahoqVar3 = sbcVar.d;
                    aooc.af(objD);
                    this = ahoqVar3;
                }
                aehjVar = (aehj) aooh.q((j$.util.Optional) objD);
                aootVar = new aoot();
                aootVar.a = pez.ah(defpackage.pmp.a.m()).m();
                if (aehjVar != null) {
                    aehj.cz(aehjVar, new defpackage.rzt(aootVar, 4), new defpackage.sdi(1));
                }
                pmpVar = (defpackage.pmp) aootVar.a;
                ajsz.ak((java.io.Closeable) this, (java.lang.Throwable) null);
                return pmpVar;
            }
            aooc.af(objD);
            if (!ahvr.R(sbcVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(778, "PatrickDisplayNameUiDataProvider_loadCallingCardDisplayName");
            try {
                sbcVar.d = ahoqVarZ;
                sbcVar.c = 1;
                java.lang.Object objB = b(sbcVar);
                if (objB != pmpVar) {
                    objD = objB;
                    ahoqVar = ahoqVarZ;
                }
                return pmpVar;
            } catch (java.lang.Throwable th) {
                th = th;
                this = ahoqVarZ;
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak((java.io.Closeable) this, th);
                    throw th2;
                }
            }
            ajcq ajcqVarF = ((defpackage.say) objD).F();
            sbcVar.d = ahoqVar;
            sbcVar.c = 2;
            objD = aosv.D(ajcqVarF, sbcVar);
            this = ahoqVar;
            if (objD != pmpVar) {
                aehjVar = (aehj) aooh.q((j$.util.Optional) objD);
                aootVar = new aoot();
                aootVar.a = pez.ah(defpackage.pmp.a.m()).m();
                if (aehjVar != null) {
                    aehj.cz(aehjVar, new defpackage.rzt(aootVar, 4), new defpackage.sdi(1));
                }
                pmpVar = (defpackage.pmp) aootVar.a;
                ajsz.ak((java.io.Closeable) this, (java.lang.Throwable) null);
            }
            return pmpVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.sbd sbdVar;
        defpackage.abxt abxtVar;
        if (aolnVar instanceof defpackage.sbd) {
            sbdVar = (defpackage.sbd) aolnVar;
            int i = sbdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbdVar.c = i - Integer.MIN_VALUE;
            } else {
                sbdVar = new defpackage.sbd(this, aolnVar);
            }
        } else {
            sbdVar = new defpackage.sbd(this, aolnVar);
        }
        java.lang.Object objB = sbdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sbdVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            abxtVar = (defpackage.abxt) aooh.q((j$.util.Optional) objB);
            if (abxtVar != null) {
                return f(abxtVar);
            }
            return null;
        }
        aooc.af(objB);
        sbdVar.c = 1;
        objB = b(sbdVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBc = ((defpackage.say) objB).bc();
        sbdVar.c = 2;
        objB = aosv.D(ajcqVarBc, sbdVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        abxtVar = (defpackage.abxt) aooh.q((j$.util.Optional) objB);
        if (abxtVar != null) {
            return f(abxtVar);
        }
        return null;
    }
}
