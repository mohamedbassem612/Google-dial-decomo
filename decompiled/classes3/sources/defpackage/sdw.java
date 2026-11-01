package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sdw {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/service/CallingCardCallScopedDataService");
    public final ruc b;
    private final sin c;
    private final smx d;
    private final defpackage.zot e;
    private final aoin f;
    private final java.lang.String g;
    private final aoin h;
    private defpackage.abxt i;
    private final apdp j;
    private final gpd k;
    private aehj l;

    public sdw(sin sinVar, smx smxVar, defpackage.zot zotVar, aoin aoinVar, ruc rucVar, gpd gpdVar, java.lang.String str, aoin aoinVar2) {
        aooh.f(zotVar, "blockingInCallCache");
        aooh.f(aoinVar, "callingCardNonBlockingDataCacheTimeoutMillis");
        aooh.f(rucVar, "metrics");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(str, "uniqueCallId");
        aooh.f(aoinVar2, "enableMccMetricsLogging");
        this.c = sinVar;
        this.d = smxVar;
        this.e = zotVar;
        this.f = aoinVar;
        this.b = rucVar;
        this.k = gpdVar;
        this.g = str;
        this.h = aoinVar2;
        this.j = new apdp();
    }

    private final void f(mcd mcdVar) {
        this.k.j(this.g).a(mcdVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.sdr sdrVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.sdr) {
            sdrVar = (defpackage.sdr) aolnVar;
            int i = sdrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdrVar.c = i - Integer.MIN_VALUE;
            } else {
                sdrVar = new defpackage.sdr(this, aolnVar);
            }
        } else {
            sdrVar = new defpackage.sdr(this, aolnVar);
        }
        java.lang.Object obj = sdrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sdrVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
                return defpackage.amqu.NO_CC_SHOWN;
            }
            apdp apdpVar2 = this.j;
            sdrVar.d = apdpVar2;
            sdrVar.c = 1;
            if (apdpVar2.b(sdrVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = sdrVar.d;
            aooc.af(obj);
        }
        try {
            aehj aehjVar = this.l;
            return aehjVar instanceof defpackage.zow ? ((defpackage.sdx) ((defpackage.zow) aehjVar).a).b : defpackage.amqu.NO_CC_SHOWN;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(long j, java.lang.String str, java.lang.String str2, aoln aolnVar) {
        defpackage.sds sdsVar;
        defpackage.amqu amquVar;
        if (aolnVar instanceof defpackage.sds) {
            sdsVar = (defpackage.sds) aolnVar;
            int i = sdsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdsVar.c = i - Integer.MIN_VALUE;
            } else {
                sdsVar = new defpackage.sds(this, aolnVar);
            }
        } else {
            sdsVar = new defpackage.sds(this, aolnVar);
        }
        java.lang.Object objAj = sdsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sdsVar.c;
        defpackage.abxt abxtVar = null;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        str2 = sdsVar.e;
                        str = sdsVar.d;
                        aooc.af(objAj);
                    } else {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aooc.af(objAj);
                    }
                    abxtVar = (defpackage.abxt) objAj;
                    if (abxtVar != null) {
                        amquVar = defpackage.amqu.MY_CALLING_CARD;
                    } else {
                        amquVar = defpackage.amqu.NO_CC_SHOWN;
                    }
                    return new defpackage.sdx(abxtVar, amquVar);
                }
                aooc.af(objAj);
                sin sinVar = this.c;
                sdsVar.d = str;
                sdsVar.e = str2;
                sdsVar.c = 1;
                objAj = aoov.aj(sinVar.c, new defpackage.sie(sinVar, j, null), sdsVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                defpackage.abxt abxtVar2 = (defpackage.abxt) objAj;
                if (abxtVar2 != null) {
                    return new defpackage.sdx(abxtVar2, defpackage.amqu.CONTACT_CALLING_CARD);
                }
                if (this.d.a() && str2 != null && str != null) {
                    sin sinVar2 = this.c;
                    sdsVar.d = null;
                    sdsVar.e = null;
                    sdsVar.c = 2;
                    objAj = sinVar2.g(str, str2, sdsVar);
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    abxtVar = (defpackage.abxt) objAj;
                }
                if (abxtVar != null) {
                    amquVar = defpackage.amqu.MY_CALLING_CARD;
                } else {
                    amquVar = defpackage.amqu.NO_CC_SHOWN;
                }
                return new defpackage.sdx(abxtVar, amquVar);
            } catch (java.lang.Throwable th) {
                f(mcd.bd);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            f(mcd.bc);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object c(long j, java.lang.String str, java.lang.String str2, aoln aolnVar) {
        defpackage.sdt sdtVar;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        java.lang.Object objPutIfAbsent;
        apdp apdpVar;
        aehj aehjVar;
        if (aolnVar instanceof defpackage.sdt) {
            sdtVar = (defpackage.sdt) aolnVar;
            int i = sdtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdtVar.d = i - Integer.MIN_VALUE;
            } else {
                sdtVar = new defpackage.sdt(this, aolnVar);
            }
        } else {
            sdtVar = new defpackage.sdt(this, aolnVar);
        }
        defpackage.sdt sdtVar2 = sdtVar;
        java.lang.Object objA = sdtVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = sdtVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                closeable = (java.io.Closeable) sdtVar2.a;
                try {
                    aooc.af(objA);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        ajsz.ak(closeable, th);
                        throw th3;
                    }
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar = sdtVar2.e;
                aehj aehjVar2 = (aehj) sdtVar2.a;
                aooc.af(objA);
                aehjVar = aehjVar2;
            }
            try {
                this.l = aehjVar;
                return aehjVar;
            } finally {
                apdpVar.d();
            }
        }
        aooc.af(objA);
        aoot aootVar = new aoot();
        if (!ahvr.R(sdtVar2.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        java.io.Closeable closeableZ = ahvr.Z(782, "PatrickDataService_loadCallingCardCacheResult");
        try {
            defpackage.zot zotVar = this.e;
            defpackage.zor zorVar = defpackage.zor.c;
            defpackage.sdu sduVar = new defpackage.sdu(this, j, str, str2, null);
            java.lang.Object objA2 = this.f.a();
            aooh.e(objA2, "get(...)");
            long jLongValue = ((java.lang.Number) objA2).longValue();
            defpackage.zpc zpcVar = new defpackage.zpc(new defpackage.qza(aootVar, this, 8), new defpackage.qza(aootVar, this, 9), new defpackage.qza(aootVar, this, 10));
            sdtVar2.a = closeableZ;
            sdtVar2.d = 1;
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = zotVar.c;
            java.lang.Object zoqVar = concurrentHashMap.get(zorVar);
            if (zoqVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(zorVar, (zoqVar = new defpackage.zoq(zotVar, sduVar)))) != null) {
                zoqVar = objPutIfAbsent;
            }
            objA = ((defpackage.zoq) zoqVar).a(jLongValue, zpcVar, sdtVar2);
            if (objA == aoluVar) {
                return aoluVar;
            }
            closeable = closeableZ;
        } catch (java.lang.Throwable th4) {
            th = th4;
            closeable = closeableZ;
            throw th;
        }
        aehj aehjVar3 = (aehj) objA;
        ajsz.ak(closeable, (java.lang.Throwable) null);
        if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
            return aehjVar3;
        }
        apdpVar = this.j;
        sdtVar2.a = aehjVar3;
        sdtVar2.e = apdpVar;
        sdtVar2.d = 2;
        if (apdpVar.b(sdtVar2) == aoluVar) {
            return aoluVar;
        }
        aehjVar = aehjVar3;
        this.l = aehjVar;
        return aehjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(long j, java.lang.String str, java.lang.String str2, aoln aolnVar) throws java.lang.Throwable {
        defpackage.sdv sdvVar;
        java.lang.Throwable th;
        java.lang.String str3;
        java.lang.Throwable th2;
        java.io.Closeable closeable;
        defpackage.sdw sdwVar;
        if (aolnVar instanceof defpackage.sdv) {
            sdvVar = (defpackage.sdv) aolnVar;
            int i = sdvVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdvVar.g = i - Integer.MIN_VALUE;
            } else {
                sdvVar = new defpackage.sdv(this, aolnVar);
            }
        } else {
            sdvVar = new defpackage.sdv(this, aolnVar);
        }
        defpackage.sdv sdvVar2 = sdvVar;
        java.lang.Object objB = sdvVar2.e;
        aolu aoluVar = aolu.a;
        int i2 = sdvVar2.g;
        try {
            try {
                if (i2 == 0) {
                    aooc.af(objB);
                    java.lang.String str4 = this.j;
                    sdvVar2.b = str;
                    sdvVar2.c = str2;
                    sdvVar2.d = str4;
                    sdvVar2.a = j;
                    sdvVar2.g = 1;
                    if (str4.b(sdvVar2) == aoluVar) {
                        return aoluVar;
                    }
                    str3 = str4;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sdwVar = (defpackage.sdw) sdvVar2.d;
                        closeable = (java.io.Closeable) sdvVar2.c;
                        str = (apdp) sdvVar2.b;
                        try {
                            aooc.af(objB);
                            sdwVar.i = ((defpackage.sdx) objB).a;
                            ajsz.ak(closeable, (java.lang.Throwable) null);
                            defpackage.abxt abxtVar = this.i;
                            str.d();
                            return abxtVar;
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (java.lang.Throwable th4) {
                                ajsz.ak(closeable, th2);
                                throw th4;
                            }
                        }
                    }
                    j = sdvVar2.a;
                    java.lang.String str5 = (apdp) sdvVar2.d;
                    str2 = (java.lang.String) sdvVar2.c;
                    java.lang.String str6 = (java.lang.String) sdvVar2.b;
                    aooc.af(objB);
                    str3 = str5;
                    str = str6;
                }
                defpackage.abxt abxtVar2 = this.i;
                if (abxtVar2 != null) {
                    str3.d();
                    return abxtVar2;
                }
                if (!ahvr.R(sdvVar2.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                java.io.Closeable closeableZ = ahvr.Z(783, "PatrickDataService_loadPatrickData");
                try {
                    sdvVar2.b = str3;
                    sdvVar2.c = closeableZ;
                    sdvVar2.d = this;
                    sdvVar2.g = 2;
                    objB = b(j, str, str2, sdvVar2);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    sdwVar = this;
                    str = str3;
                    closeable = closeableZ;
                    sdwVar.i = ((defpackage.sdx) objB).a;
                    ajsz.ak(closeable, (java.lang.Throwable) null);
                    defpackage.abxt abxtVar3 = this.i;
                    str.d();
                    return abxtVar3;
                } catch (java.lang.Throwable th5) {
                    th2 = th5;
                    str = str3;
                    closeable = closeableZ;
                    throw th2;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                str3.d();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str3 = str;
            str3.d();
            throw th;
        }
    }

    public final void e(aeun aeunVar, rub rubVar) {
        this.b.q(aeunVar, ruc.cb, rubVar);
    }
}
