package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sbl {
    private static final aimz g = aimz.i("com/android/dialer/patrick/impl/logging/PatrickCallEventClearcutLogger");
    public final defpackage.sbo a;
    public final scw b;
    public final smx c;
    public final defpackage.sfa d;
    public final defpackage.sdw e;
    public final tvn f;
    private final aoin h;
    private final kgl i;
    private final defpackage.afpl j;

    public sbl(defpackage.sbo sboVar, scw scwVar, tvn tvnVar, defpackage.afpl afplVar, smx smxVar, android.content.Context context, kgl kglVar, defpackage.sfa sfaVar, defpackage.sdw sdwVar, aoin aoinVar) {
        aooh.f(sboVar, "patrickMetricsCache");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(context, "appContext");
        aooh.f(kglVar, "blocking");
        aooh.f(sdwVar, "callingCardCallScopedDataService");
        aooh.f(aoinVar, "enableMccMetricsLogging");
        this.a = sboVar;
        this.b = scwVar;
        this.f = tvnVar;
        this.j = afplVar;
        this.c = smxVar;
        this.i = kglVar;
        this.d = sfaVar;
        this.e = sdwVar;
        this.h = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x012b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.sbh sbhVar;
        defpackage.vqu vquVarL;
        defpackage.vqu vquVar;
        defpackage.vqu vquVar2;
        defpackage.vqu vquVar3;
        defpackage.vqu vquVar4;
        alct alctVarAw;
        defpackage.sbl sblVar;
        defpackage.vqu vquVar5;
        defpackage.vqu vquVar6;
        defpackage.vqu vquVar7;
        java.lang.Integer num;
        defpackage.vqu vquVar8;
        defpackage.vqu vquVar9;
        java.lang.Integer num2;
        if (aolnVar instanceof defpackage.sbh) {
            sbhVar = (defpackage.sbh) aolnVar;
            int i = sbhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbhVar.d = i - Integer.MIN_VALUE;
            } else {
                sbhVar = new defpackage.sbh(this, aolnVar);
            }
        } else {
            sbhVar = new defpackage.sbh(this, aolnVar);
        }
        java.lang.Object objD = sbhVar.b;
        aolu aoluVar = aolu.a;
        try {
            switch (sbhVar.d) {
                case 0:
                    aooc.af(objD);
                    if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                        sbhVar.d = 1;
                        java.lang.Object objM = aosv.m(new defpackage.sbi(this, null), sbhVar);
                        if (objM != aoluVar) {
                            return objM;
                        }
                    } else {
                        vquVarL = akky.L(defpackage.amqx.b.m());
                        defpackage.sbo sboVar = this.a;
                        sbhVar.f = vquVarL;
                        sbhVar.g = vquVarL;
                        sbhVar.a = vquVarL;
                        sbhVar.d = 2;
                        objD = sboVar.d(sbhVar);
                        if (objD != aoluVar) {
                            vquVar = vquVarL;
                            vquVar2 = vquVar;
                            vquVarL.az(((java.lang.Boolean) objD).booleanValue());
                            defpackage.sbo sboVar2 = this.a;
                            sbhVar.f = vquVar2;
                            sbhVar.g = vquVar;
                            sbhVar.a = vquVar;
                            sbhVar.d = 3;
                            objD = sboVar2.a(sbhVar);
                            if (objD != aoluVar) {
                                vquVar3 = vquVar;
                                vquVar4 = vquVar2;
                                vquVar3.aA(((java.lang.Number) objD).intValue());
                                scw scwVar = this.b;
                                alctVarAw = vquVar.aw();
                                sbhVar.f = vquVar4;
                                sbhVar.g = vquVar;
                                sbhVar.a = this;
                                sbhVar.h = vquVar;
                                sbhVar.e = alctVarAw;
                                sbhVar.d = 4;
                                objD = scwVar.b(sbhVar);
                                if (objD != aoluVar) {
                                    sblVar = this;
                                    vquVar5 = vquVar;
                                    vquVar.ay(alctVarAw, sblVar.d((snl) objD));
                                    defpackage.sbo sboVar3 = this.a;
                                    sbhVar.f = vquVar4;
                                    sbhVar.g = vquVar5;
                                    sbhVar.a = null;
                                    sbhVar.h = null;
                                    sbhVar.e = null;
                                    sbhVar.d = 5;
                                    objD = sboVar3.b(sbhVar);
                                    if (objD != aoluVar) {
                                        vquVar6 = vquVar5;
                                        vquVar7 = vquVar4;
                                        num = (java.lang.Integer) objD;
                                        if (num != null) {
                                            vquVar6.aB(num.intValue());
                                        }
                                        defpackage.sbo sboVar4 = this.a;
                                        sbhVar.f = vquVar7;
                                        sbhVar.g = vquVar6;
                                        sbhVar.d = 6;
                                        objD = sboVar4.c(sbhVar);
                                        if (objD != aoluVar) {
                                            vquVar8 = vquVar6;
                                            vquVar9 = vquVar7;
                                            num2 = (java.lang.Integer) objD;
                                            if (num2 != null) {
                                                vquVar8.aC(num2.intValue());
                                            }
                                            return vquVar9.ax();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aoluVar;
                case 1:
                    aooc.af(objD);
                    return objD;
                case 2:
                    vquVarL = (defpackage.vqu) sbhVar.a;
                    vquVar = sbhVar.g;
                    vquVar2 = sbhVar.f;
                    aooc.af(objD);
                    vquVarL.az(((java.lang.Boolean) objD).booleanValue());
                    defpackage.sbo sboVar5 = this.a;
                    sbhVar.f = vquVar2;
                    sbhVar.g = vquVar;
                    sbhVar.a = vquVar;
                    sbhVar.d = 3;
                    objD = sboVar5.a(sbhVar);
                    if (objD != aoluVar) {
                        vquVar3 = vquVar;
                        vquVar4 = vquVar2;
                        vquVar3.aA(((java.lang.Number) objD).intValue());
                        scw scwVar2 = this.b;
                        alctVarAw = vquVar.aw();
                        sbhVar.f = vquVar4;
                        sbhVar.g = vquVar;
                        sbhVar.a = this;
                        sbhVar.h = vquVar;
                        sbhVar.e = alctVarAw;
                        sbhVar.d = 4;
                        objD = scwVar2.b(sbhVar);
                        if (objD != aoluVar) {
                            sblVar = this;
                            vquVar5 = vquVar;
                            vquVar.ay(alctVarAw, sblVar.d((snl) objD));
                            defpackage.sbo sboVar6 = this.a;
                            sbhVar.f = vquVar4;
                            sbhVar.g = vquVar5;
                            sbhVar.a = null;
                            sbhVar.h = null;
                            sbhVar.e = null;
                            sbhVar.d = 5;
                            objD = sboVar6.b(sbhVar);
                            if (objD != aoluVar) {
                                vquVar6 = vquVar5;
                                vquVar7 = vquVar4;
                                num = (java.lang.Integer) objD;
                                if (num != null) {
                                    vquVar6.aB(num.intValue());
                                }
                                defpackage.sbo sboVar7 = this.a;
                                sbhVar.f = vquVar7;
                                sbhVar.g = vquVar6;
                                sbhVar.d = 6;
                                objD = sboVar7.c(sbhVar);
                                if (objD != aoluVar) {
                                    vquVar8 = vquVar6;
                                    vquVar9 = vquVar7;
                                    num2 = (java.lang.Integer) objD;
                                    if (num2 != null) {
                                        vquVar8.aC(num2.intValue());
                                    }
                                    return vquVar9.ax();
                                }
                            }
                        }
                    }
                    return aoluVar;
                case 3:
                    vquVar3 = (defpackage.vqu) sbhVar.a;
                    vquVar = sbhVar.g;
                    vquVar2 = sbhVar.f;
                    aooc.af(objD);
                    vquVar4 = vquVar2;
                    vquVar3.aA(((java.lang.Number) objD).intValue());
                    scw scwVar3 = this.b;
                    alctVarAw = vquVar.aw();
                    sbhVar.f = vquVar4;
                    sbhVar.g = vquVar;
                    sbhVar.a = this;
                    sbhVar.h = vquVar;
                    sbhVar.e = alctVarAw;
                    sbhVar.d = 4;
                    objD = scwVar3.b(sbhVar);
                    if (objD != aoluVar) {
                        sblVar = this;
                        vquVar5 = vquVar;
                        vquVar.ay(alctVarAw, sblVar.d((snl) objD));
                        defpackage.sbo sboVar8 = this.a;
                        sbhVar.f = vquVar4;
                        sbhVar.g = vquVar5;
                        sbhVar.a = null;
                        sbhVar.h = null;
                        sbhVar.e = null;
                        sbhVar.d = 5;
                        objD = sboVar8.b(sbhVar);
                        if (objD != aoluVar) {
                            vquVar6 = vquVar5;
                            vquVar7 = vquVar4;
                            num = (java.lang.Integer) objD;
                            if (num != null) {
                                vquVar6.aB(num.intValue());
                            }
                            defpackage.sbo sboVar9 = this.a;
                            sbhVar.f = vquVar7;
                            sbhVar.g = vquVar6;
                            sbhVar.d = 6;
                            objD = sboVar9.c(sbhVar);
                            if (objD != aoluVar) {
                                vquVar8 = vquVar6;
                                vquVar9 = vquVar7;
                                num2 = (java.lang.Integer) objD;
                                if (num2 != null) {
                                    vquVar8.aC(num2.intValue());
                                }
                                return vquVar9.ax();
                            }
                        }
                    }
                    return aoluVar;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    alctVarAw = sbhVar.e;
                    vquVar = sbhVar.h;
                    sblVar = (defpackage.sbl) sbhVar.a;
                    vquVar5 = sbhVar.g;
                    vquVar4 = sbhVar.f;
                    aooc.af(objD);
                    vquVar.ay(alctVarAw, sblVar.d((snl) objD));
                    defpackage.sbo sboVar10 = this.a;
                    sbhVar.f = vquVar4;
                    sbhVar.g = vquVar5;
                    sbhVar.a = null;
                    sbhVar.h = null;
                    sbhVar.e = null;
                    sbhVar.d = 5;
                    objD = sboVar10.b(sbhVar);
                    if (objD != aoluVar) {
                        vquVar6 = vquVar5;
                        vquVar7 = vquVar4;
                        num = (java.lang.Integer) objD;
                        if (num != null) {
                            vquVar6.aB(num.intValue());
                        }
                        defpackage.sbo sboVar11 = this.a;
                        sbhVar.f = vquVar7;
                        sbhVar.g = vquVar6;
                        sbhVar.d = 6;
                        objD = sboVar11.c(sbhVar);
                        if (objD != aoluVar) {
                            vquVar8 = vquVar6;
                            vquVar9 = vquVar7;
                            num2 = (java.lang.Integer) objD;
                            if (num2 != null) {
                                vquVar8.aC(num2.intValue());
                            }
                            return vquVar9.ax();
                        }
                    }
                    return aoluVar;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    vquVar6 = sbhVar.g;
                    vquVar7 = sbhVar.f;
                    aooc.af(objD);
                    num = (java.lang.Integer) objD;
                    if (num != null) {
                        vquVar6.aB(num.intValue());
                    }
                    defpackage.sbo sboVar12 = this.a;
                    sbhVar.f = vquVar7;
                    sbhVar.g = vquVar6;
                    sbhVar.d = 6;
                    objD = sboVar12.c(sbhVar);
                    if (objD != aoluVar) {
                        vquVar8 = vquVar6;
                        vquVar9 = vquVar7;
                        num2 = (java.lang.Integer) objD;
                        if (num2 != null) {
                            vquVar8.aC(num2.intValue());
                        }
                        return vquVar9.ax();
                    }
                    return aoluVar;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    vquVar8 = sbhVar.g;
                    vquVar9 = sbhVar.f;
                    aooc.af(objD);
                    num2 = (java.lang.Integer) objD;
                    if (num2 != null) {
                        vquVar8.aC(num2.intValue());
                    }
                    return vquVar9.ax();
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            g.d().k(e2).l("com/android/dialer/patrick/impl/logging/PatrickCallEventClearcutLogger", "createPatrickMetrics", 69, "PatrickCallEventClearcutLogger.kt").v("Failed to create MCC metrics, falling back to original Patrick metrics");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.sbj sbjVar;
        if (aolnVar instanceof defpackage.sbj) {
            sbjVar = (defpackage.sbj) aolnVar;
            int i = sbjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbjVar.c = i - Integer.MIN_VALUE;
            } else {
                sbjVar = new defpackage.sbj(this, aolnVar);
            }
        } else {
            sbjVar = new defpackage.sbj(this, aolnVar);
        }
        java.lang.Object objD = sbjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sbjVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.j.X();
            sbjVar.c = 1;
            objD = aosv.D(ajcqVarX, sbjVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.sbg.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.sbg sbgVar, aoln aolnVar) {
        defpackage.sbk sbkVar;
        if (aolnVar instanceof defpackage.sbk) {
            sbkVar = (defpackage.sbk) aolnVar;
            int i = sbkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbkVar.c = i - Integer.MIN_VALUE;
            } else {
                sbkVar = new defpackage.sbk(this, aolnVar);
            }
        } else {
            sbkVar = new defpackage.sbk(this, aolnVar);
        }
        java.lang.Object objD = sbkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sbkVar.c;
        boolean z = false;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(objD);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objD);
                }
                if (((aigf) objD).values().contains(java.lang.Boolean.TRUE)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
            aooc.af(objD);
            ajcq ajcqVarBn = sbgVar.bn();
            sbkVar.c = 1;
            objD = aosv.D(ajcqVarBn, sbkVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            hkd hkdVar = (hkd) aooh.q((j$.util.Optional) objD);
            if (hkdVar == null) {
                return java.lang.Boolean.FALSE;
            }
            ajcq ajcqVarK = this.i.k(aify.p(hkdVar.c), hkdVar.d);
            sbkVar.c = 2;
            objD = aosv.D(ajcqVarK, sbkVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            if (((aigf) objD).values().contains(java.lang.Boolean.TRUE)) {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            g.b().k(e2).l("com/android/dialer/patrick/impl/logging/PatrickCallEventClearcutLogger", "isBlockedNumber", 203, "PatrickCallEventClearcutLogger.kt").v("Failed to check if number is blocked");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.util.List d(snl snlVar) throws aois {
        defpackage.amqw amqwVar;
        j$.util.Objects.checkIndex(0, 11);
        if (snlVar != null) {
            if (snlVar instanceof defpackage.scm) {
                java.util.List list = ((defpackage.scm) snlVar).a;
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iOrdinal = ((defpackage.scx) it.next()).ordinal();
                    if (iOrdinal == 0) {
                        amqwVar = defpackage.amqw.VERIFICATION_UNKNOWN;
                    } else if (iOrdinal == 1) {
                        amqwVar = defpackage.amqw.UNVERIFIED;
                    } else if (iOrdinal == 2) {
                        amqwVar = defpackage.amqw.VERIFIED_AND_FRESH;
                    } else {
                        if (iOrdinal != 3) {
                            throw new aois();
                        }
                        amqwVar = defpackage.amqw.VERIFIED_BUT_STALE;
                    }
                    arrayList.add(amqwVar);
                }
                return arrayList;
            }
            if (snlVar instanceof defpackage.sce) {
                return ajsz.aY(defpackage.amqw.NO_ACCOUNT_ON_DEVICE);
            }
            if (snlVar instanceof defpackage.scl) {
                return ajsz.aY(defpackage.amqw.STALE_DATA_ON_DEVICE);
            }
            if (snlVar instanceof defpackage.scf) {
                return ajsz.aY(defpackage.amqw.NO_DATA_STORED_ON_DEVICE);
            }
            if (snlVar instanceof defpackage.scg) {
                return ajsz.aY(defpackage.amqw.NO_MATCHING_PHONE_NUMBER);
            }
            if (snlVar instanceof defpackage.sch) {
                return ajsz.aY(defpackage.amqw.NO_PHONE_ACCOUNT);
            }
            if (snlVar instanceof defpackage.sci) {
                return ajsz.aY(defpackage.amqw.NO_PHONE_NUMBER_FROM_SERVER);
            }
            if (snlVar instanceof defpackage.scj) {
                return ajsz.aY(defpackage.amqw.NO_RECENT_CALLS);
            }
            if (snlVar instanceof defpackage.sck) {
                return ajsz.aY(defpackage.amqw.NO_VALID_PHONE_NUMBER_FOUND);
            }
            if (snlVar instanceof defpackage.scd) {
                return ajsz.aY(defpackage.amqw.LIST_PHONE_NUMBERS_FAILED);
            }
        }
        throw new aois();
    }
}
