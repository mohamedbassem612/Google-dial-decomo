package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class saa implements defpackage.pdy {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider");
    private final defpackage.zot b;
    private final aoin c;
    private final ruc d;
    private final aoin e;
    private final aoin f;
    private final defpackage.afpl g;
    private final ipc h;

    public saa(defpackage.zot zotVar, defpackage.afpl afplVar, aoin aoinVar, ruc rucVar, aoin aoinVar2, ipc ipcVar, aoin aoinVar3) {
        aooh.f(zotVar, "blockingInCallCache");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(rucVar, "metrics");
        aooh.f(aoinVar3, "enableMyCallingCardPostCallBottomSheet");
        this.b = zotVar;
        this.g = afplVar;
        this.c = aoinVar;
        this.d = rucVar;
        this.e = aoinVar2;
        this.h = ipcVar;
        this.f = aoinVar3;
    }

    public static final void f(java.lang.Throwable th) {
        boolean z = th instanceof aovk;
        aimz aimzVar = a;
        if (z) {
            aimzVar.b().k(th).l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "logFailure", 70, "PatrickCallBackgroundProvider.kt").v("Patrick call background timed out.");
        } else {
            aimzVar.d().k(th).l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "logFailure", 72, "PatrickCallBackgroundProvider.kt").v("Patrick call background failed.");
        }
    }

    public static final int g(defpackage.abxs abxsVar) {
        java.lang.String str = abxsVar.g;
        aooh.e(str, "getPhotoToken(...)");
        return str.length() == 0 ? 3 : 4;
    }

    private final void h(defpackage.pdv pdvVar) {
        if (((java.lang.Boolean) this.f.a()).booleanValue()) {
            int iAR = a.aR((pdvVar.b == 2 ? (defpackage.pdu) pdvVar.c : defpackage.pdu.a).g);
            if (iAR == 0 || iAR != 4) {
                return;
            }
            a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "logMyCallingCardGrowthKitEvent", 145, "PatrickCallBackgroundProvider.kt").v("Logging MY_CALLING_CARD_SHOWN_IN_CALL GrowthKit event");
            this.h.bm(rmu.V);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:13:0x002c, B:33:0x00a6, B:35:0x00be, B:18:0x003f, B:28:0x0072), top: B:49:0x0022 }] */
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
    @Override // defpackage.pdy
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.rzx rzxVar;
        java.lang.Throwable th;
        ?? Z;
        ?? r1;
        java.lang.Object obj;
        aoot aootVar;
        ?? r2;
        defpackage.pdv pdvVar;
        defpackage.pdv pdvVar2;
        java.lang.Object obj2;
        ?? r3;
        defpackage.pdv pdvVarB;
        if (aolnVar instanceof defpackage.rzx) {
            rzxVar = (defpackage.rzx) aolnVar;
            int i = rzxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzxVar.c = i - Integer.MIN_VALUE;
            } else {
                rzxVar = new defpackage.rzx(this, aolnVar);
            }
        } else {
            rzxVar = new defpackage.rzx(this, aolnVar);
        }
        defpackage.rzx rzxVar2 = rzxVar;
        java.lang.Object obj3 = rzxVar2.a;
        defpackage.pdv pdvVar3 = aolu.a;
        int i2 = rzxVar2.c;
        int i3 = 2;
        ?? r4 = 1;
        try {
            if (i2 == 0) {
                aooc.af(obj3);
                if (!ahvr.R(rzxVar2.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                Z = ahvr.Z(774, "PatrickCallBackgroundProvider_getOrCreateCallBackground");
                try {
                    if (((java.lang.Boolean) this.e.a()).booleanValue()) {
                        rzxVar2.e = Z;
                        rzxVar2.c = 1;
                        java.lang.Object objC = c(rzxVar2);
                        if (objC != pdvVar3) {
                            pdvVar2 = pdvVar3;
                            Z = Z;
                            r2 = Z;
                            obj3 = objC;
                            defpackage.pdv pdvVar4 = (defpackage.pdv) obj3;
                            pdvVar = pdvVar4;
                            r3 = r2;
                            obj2 = pdvVar4;
                        }
                    } else {
                        aoot aootVar2 = new aoot();
                        defpackage.zot zotVar = this.b;
                        defpackage.zor zorVar = defpackage.zor.a;
                        defpackage.sba sbaVar = new defpackage.sba((java.lang.Object) this, 1, (byte[]) null);
                        java.lang.Object objA = this.c.a();
                        aooh.e(objA, "get(...)");
                        long jLongValue = ((java.lang.Number) objA).longValue();
                        rzxVar2.e = Z;
                        rzxVar2.d = aootVar2;
                        rzxVar2.c = 2;
                        java.lang.Object objA2 = zotVar.a(zorVar, sbaVar, jLongValue, rzxVar2);
                        if (objA2 != pdvVar3) {
                            pdvVar2 = pdvVar3;
                            Z = Z;
                            r1 = Z;
                            obj = objA2;
                            aootVar = aootVar2;
                            aehj.ck(obj, new defpackage.rzt(aootVar, i3));
                            aehj.cj(obj, new qks(19));
                            pdvVarB = (defpackage.pdv) aootVar.a;
                            if (pdvVarB == null) {
                                pdvVarB = pez.e(defpackage.pdv.a.m()).b();
                            }
                            pdvVar = pdvVarB;
                            r3 = r1;
                            obj2 = obj;
                        }
                    }
                    pdvVar2 = pdvVar3;
                    Z = Z;
                    pdvVar2 = pdvVar3;
                    Z = Z;
                    return pdvVar2;
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
                ahoq ahoqVar = rzxVar2.e;
                aooc.af(obj3);
                r2 = ahoqVar;
                defpackage.pdv pdvVar5 = (defpackage.pdv) obj3;
                pdvVar = pdvVar5;
                r3 = r2;
                obj2 = pdvVar5;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aootVar = rzxVar2.d;
                ahoq ahoqVar2 = rzxVar2.e;
                aooc.af(obj3);
                r1 = ahoqVar2;
                obj = ((defpackage.zpb) obj3).a;
                aehj.ck(obj, new defpackage.rzt(aootVar, i3));
                aehj.cj(obj, new qks(19));
                pdvVarB = (defpackage.pdv) aootVar.a;
                if (pdvVarB == null) {
                    pdvVarB = pez.e(defpackage.pdv.a.m()).b();
                }
                pdvVar = pdvVarB;
                r3 = r1;
                obj2 = obj;
            }
            ajsz.ak((java.io.Closeable) r3, (java.lang.Throwable) null);
            pdvVar2 = pdvVar;
            Z = obj2;
            pdvVar2 = pdvVar3;
            Z = Z;
            pdvVar2 = pdvVar3;
            Z = Z;
            return pdvVar2;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.rzw rzwVar;
        if (aolnVar instanceof defpackage.rzw) {
            rzwVar = (defpackage.rzw) aolnVar;
            int i = rzwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzwVar.c = i - Integer.MIN_VALUE;
            } else {
                rzwVar = new defpackage.rzw(this, aolnVar);
            }
        } else {
            rzwVar = new defpackage.rzw(this, aolnVar);
        }
        java.lang.Object objD = rzwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rzwVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.g.X();
            rzwVar.c = 1;
            objD = aosv.D(ajcqVarX, rzwVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.rzv.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5 A[Catch: all -> 0x0110, TRY_ENTER, TryCatch #0 {all -> 0x0110, blocks: (B:31:0x008e, B:35:0x00b5, B:36:0x00ba, B:37:0x00d2), top: B:50:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:31:0x008e, B:35:0x00b5, B:36:0x00ba, B:37:0x00d2), top: B:50:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.rzy rzyVar;
        java.lang.Throwable th;
        ?? r2;
        aeun aeunVar;
        java.io.Closeable closeable;
        aeun aeunVar2;
        java.io.Closeable closeable2;
        aehj aehjVar;
        aoot aootVar;
        defpackage.pdv pdvVar;
        if (aolnVar instanceof defpackage.rzy) {
            rzyVar = (defpackage.rzy) aolnVar;
            int i = rzyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzyVar.c = i - Integer.MIN_VALUE;
            } else {
                rzyVar = new defpackage.rzy(this, aolnVar);
            }
        } else {
            rzyVar = new defpackage.rzy(this, aolnVar);
        }
        java.lang.Object objD = rzyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rzyVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aeunVar = rzyVar.d;
                    closeable = rzyVar.e;
                    try {
                        aooc.af(objD);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r2 = closeable;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            ajsz.ak((java.io.Closeable) r2, th);
                            throw th3;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aeunVar2 = rzyVar.d;
                    java.io.Closeable closeable3 = rzyVar.e;
                    aooc.af(objD);
                    closeable2 = closeable3;
                }
                try {
                    aehjVar = (aehj) aooh.q((j$.util.Optional) objD);
                    aootVar = new aoot();
                    aootVar.a = pez.e(defpackage.pdv.a.m()).b();
                    if (aehjVar == null) {
                        if (aeunVar2 != null) {
                            e(aeunVar2, rub.d);
                        }
                        a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadCallingCardBackground$<anonymous>", 83, "PatrickCallBackgroundProvider.kt").v("CallingCard background: [empty result]");
                        pdvVar = (defpackage.pdv) aootVar.a;
                    } else {
                        aehj.cy(aehjVar, new mkm(aeunVar2, this, aootVar, 6, (char[]) null), new defpackage.qza(aeunVar2, this, 7), new oen(this, aeunVar2, 20));
                        h((defpackage.pdv) aootVar.a);
                        a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadCallingCardBackground$<anonymous>", 106, "PatrickCallBackgroundProvider.kt").y("CallingCard background: %s", aootVar.a);
                        pdvVar = (defpackage.pdv) aootVar.a;
                    }
                    defpackage.pdv pdvVar2 = pdvVar;
                    ajsz.ak(closeable2, (java.lang.Throwable) null);
                    return pdvVar2;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    r2 = closeable2;
                    throw th;
                }
            }
            aooc.af(objD);
            if (!ahvr.R(rzyVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            java.io.Closeable closeableZ = ahvr.Z(775, "PatrickCallBackgroundProvider_loadCallingCardBackground");
            j$.util.Optional optionalA = this.d.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar3 = (aeun) aooh.q(optionalA);
            rzyVar.e = closeableZ;
            rzyVar.d = aeunVar3;
            rzyVar.c = 1;
            java.lang.Object objB = b(rzyVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            aeunVar = aeunVar3;
            objD = objB;
            closeable = closeableZ;
            ajcq ajcqVarF = ((defpackage.rzv) objD).F();
            rzyVar.e = closeable;
            rzyVar.d = aeunVar;
            rzyVar.c = 2;
            objD = aosv.D(ajcqVarF, rzyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            aeunVar2 = aeunVar;
            closeable2 = closeable;
            aehjVar = (aehj) aooh.q((j$.util.Optional) objD);
            aootVar = new aoot();
            aootVar.a = pez.e(defpackage.pdv.a.m()).b();
            if (aehjVar == null) {
                if (aeunVar2 != null) {
                    e(aeunVar2, rub.d);
                }
                a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadCallingCardBackground$<anonymous>", 83, "PatrickCallBackgroundProvider.kt").v("CallingCard background: [empty result]");
                pdvVar = (defpackage.pdv) aootVar.a;
            } else {
                aehj.cy(aehjVar, new mkm(aeunVar2, this, aootVar, 6, (char[]) null), new defpackage.qza(aeunVar2, this, 7), new oen(this, aeunVar2, 20));
                h((defpackage.pdv) aootVar.a);
                a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadCallingCardBackground$<anonymous>", 106, "PatrickCallBackgroundProvider.kt").y("CallingCard background: %s", aootVar.a);
                pdvVar = (defpackage.pdv) aootVar.a;
            }
            defpackage.pdv pdvVar3 = pdvVar;
            ajsz.ak(closeable2, (java.lang.Throwable) null);
            return pdvVar3;
        } catch (java.lang.Throwable th5) {
            th = th5;
            r2 = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.rzz rzzVar;
        aeun aeunVar;
        aeun aeunVar2;
        defpackage.abxt abxtVar;
        java.lang.String str;
        defpackage.abxp abxpVar;
        defpackage.abxs abxsVar;
        if (aolnVar instanceof defpackage.rzz) {
            rzzVar = (defpackage.rzz) aolnVar;
            int i = rzzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzzVar.c = i - Integer.MIN_VALUE;
            } else {
                rzzVar = new defpackage.rzz(this, aolnVar);
            }
        } else {
            rzzVar = new defpackage.rzz(this, aolnVar);
        }
        java.lang.Object objD = rzzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rzzVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aeunVar = rzzVar.d;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aeunVar2 = rzzVar.d;
                aooc.af(objD);
            }
            abxtVar = (defpackage.abxt) aooh.q((j$.util.Optional) objD);
            str = null;
            if (abxtVar != null) {
                abxpVar = abxtVar.c;
                if (abxpVar == null) {
                    abxpVar = defpackage.abxp.a;
                }
                if (abxpVar != null) {
                    if (abxpVar.b == 1) {
                        abxsVar = (defpackage.abxs) abxpVar.c;
                    } else {
                        abxsVar = defpackage.abxs.a;
                    }
                    if (abxsVar != null) {
                        str = abxsVar.f;
                    }
                }
            }
            if (abxtVar != null || str == null) {
                if (aeunVar2 != null) {
                    e(aeunVar2, rub.d);
                }
                a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadPatrickCallBackground", 117, "PatrickCallBackgroundProvider.kt").v("CallingCard background (legacy): [empty]");
                return pez.e(defpackage.pdv.a.m()).b();
            }
            defpackage.oyx oyxVarE = pez.e(defpackage.pdv.a.m());
            defpackage.oyx oyxVarF = pez.f(defpackage.pdu.a.m());
            if ((abxtVar.b & 1) != 0) {
                defpackage.abxp abxpVar2 = abxtVar.c;
                if (abxpVar2 == null) {
                    abxpVar2 = defpackage.abxp.a;
                }
                if (abxpVar2.b == 1) {
                    defpackage.abxp abxpVar3 = abxtVar.c;
                    if (abxpVar3 == null) {
                        abxpVar3 = defpackage.abxp.a;
                    }
                    oyxVarF.f((abxpVar3.b == 1 ? (defpackage.abxs) abxpVar3.c : defpackage.abxs.a).c);
                    oyxVarF.g((abxpVar3.b == 1 ? (defpackage.abxs) abxpVar3.c : defpackage.abxs.a).d);
                    oyxVarF.h((abxpVar3.b == 1 ? (defpackage.abxs) abxpVar3.c : defpackage.abxs.a).e);
                    defpackage.abxs abxsVar2 = abxpVar3.b == 1 ? (defpackage.abxs) abxpVar3.c : defpackage.abxs.a;
                    aooh.e(abxsVar2, "getFullScreenImage(...)");
                    oyxVarF.i(g(abxsVar2));
                }
            }
            oyxVarF.e(str);
            oyxVarE.c(oyxVarF.d());
            defpackage.pdv pdvVarB = oyxVarE.b();
            if (aeunVar2 != null) {
                e(aeunVar2, rub.b);
            }
            h(pdvVarB);
            a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadPatrickCallBackground", 136, "PatrickCallBackgroundProvider.kt").y("CallingCard background (legacy): %s", pdvVarB);
            return pdvVarB;
        }
        aooc.af(objD);
        j$.util.Optional optionalA = this.d.a();
        aooh.e(optionalA, "startLocalTimer(...)");
        aeun aeunVar3 = (aeun) aooh.q(optionalA);
        rzzVar.d = aeunVar3;
        rzzVar.c = 1;
        java.lang.Object objB = b(rzzVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        aeunVar = aeunVar3;
        objD = objB;
        ajcq ajcqVarBc = ((defpackage.rzv) objD).bc();
        rzzVar.d = aeunVar;
        rzzVar.c = 2;
        objD = aosv.D(ajcqVarBc, rzzVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        aeunVar2 = aeunVar;
        abxtVar = (defpackage.abxt) aooh.q((j$.util.Optional) objD);
        str = null;
        if (abxtVar != null) {
            abxpVar = abxtVar.c;
            if (abxpVar == null) {
                abxpVar = defpackage.abxp.a;
            }
            if (abxpVar != null) {
                if (abxpVar.b == 1) {
                    abxsVar = (defpackage.abxs) abxpVar.c;
                } else {
                    abxsVar = defpackage.abxs.a;
                }
                if (abxsVar != null) {
                    str = abxsVar.f;
                }
            }
        }
        if (abxtVar != null) {
        }
        if (aeunVar2 != null) {
            e(aeunVar2, rub.d);
        }
        a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadPatrickCallBackground", 117, "PatrickCallBackgroundProvider.kt").v("CallingCard background (legacy): [empty]");
        return pez.e(defpackage.pdv.a.m()).b();
    }

    public final void e(aeun aeunVar, rub rubVar) {
        this.d.q(aeunVar, ruc.ca, rubVar);
    }
}
