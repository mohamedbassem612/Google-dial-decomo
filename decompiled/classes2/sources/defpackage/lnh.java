package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lnh implements defpackage.oke {
    public static final aimz a = aimz.i("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl");
    public final aoss b;
    public final aolr c;
    public final rlv d;
    public final zjv e;
    public final zjs f;
    public boolean g;
    public defpackage.lnl h;
    public defpackage.lmq i;
    public aoub j;
    public final zzx k;
    public final zzx l;
    public final gpd m;
    public final zzx n;
    public final zzx o;
    private final aolr p;
    private final aolr q;
    private final zjl r;
    private final oko s;
    private final aoin t;
    private final int u;
    private final zzx v;
    private final defpackage.oq w;

    static {
        aooh.e(new android.net.Uri.Builder().scheme("content").authority("androidx.car.app.connection").build(), "build(...)");
    }

    public lnh(aoss aossVar, aolr aolrVar, aolr aolrVar2, aolr aolrVar3, int i, rlv rlvVar, zzx zzxVar, zzx zzxVar2, zzx zzxVar3, zzx zzxVar4, zzx zzxVar5, defpackage.oq oqVar, gpd gpdVar, zjv zjvVar, zjl zjlVar, zjs zjsVar, oko okoVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "blockingContext");
        aooh.f(aolrVar3, "mainContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(oqVar, "callScreeningResultsCache");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(aoinVar, "allowMultipleAudioVoters");
        this.b = aossVar;
        this.c = aolrVar;
        this.p = aolrVar2;
        this.q = aolrVar3;
        this.u = 3;
        this.d = rlvVar;
        this.k = zzxVar;
        this.l = zzxVar2;
        this.v = zzxVar3;
        this.n = zzxVar4;
        this.o = zzxVar5;
        this.w = oqVar;
        this.m = gpdVar;
        this.e = zjvVar;
        this.r = zjlVar;
        this.f = zjsVar;
        this.s = okoVar;
        this.t = aoinVar;
    }

    public static final defpackage.lnl f(int i, defpackage.lnk lnkVar) {
        akzx akzxVarM = defpackage.lnl.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        ((defpackage.lnl) akzxVarM.b).c = a.R(i);
        if (lnkVar != null) {
            akzxVarM.u();
            defpackage.lnl lnlVar = (defpackage.lnl) akzxVarM.b;
            j$.util.Objects.requireNonNull(lnkVar);
            lnlVar.d = lnkVar;
            lnlVar.b |= 1;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.lnl) aladVarP;
    }

    public static final boolean g(defpackage.lmq lmqVar) {
        return l(lmqVar.a) == 1;
    }

    private final java.lang.Object h(defpackage.okd okdVar, defpackage.lmq lmqVar, defpackage.lnk lnkVar, aoln aolnVar) {
        a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "passCallToUser", 392, "DialerCallScreeningServiceMixinImpl.kt").y("passing call to user, featureCause: %s", lnkVar != null ? k(lnkVar) : null);
        java.lang.Object objJ = j(okdVar, lmqVar, f(3, lnkVar), new android.telecom.CallScreeningService.CallResponse.Builder(), aolnVar);
        return objJ != aolu.a ? aojh.a : objJ;
    }

    private final java.lang.Object i(defpackage.okd okdVar, defpackage.lmq lmqVar, defpackage.lnk lnkVar, aoln aolnVar) {
        a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "rejectCall", 455, "DialerCallScreeningServiceMixinImpl.kt").y("rejecting call, featureCause: %s", lnkVar != null ? k(lnkVar) : null);
        defpackage.lnl lnlVarF = f(5, lnkVar);
        android.telecom.CallScreeningService.CallResponse.Builder builderM$2 = fh$.ExternalSyntheticApiModelOutline0.m$2(fh$.ExternalSyntheticApiModelOutline0.m$1(fh$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder(), true), true), true);
        aooh.c(builderM$2);
        java.lang.Object objJ = j(okdVar, lmqVar, lnlVarF, builderM$2, aolnVar);
        return objJ != aolu.a ? aojh.a : objJ;
    }

    private final java.lang.Object j(defpackage.okd okdVar, defpackage.lmq lmqVar, defpackage.lnl lnlVar, android.telecom.CallScreeningService.CallResponse.Builder builder, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.q, new defpackage.lnd(this, lnlVar, lmqVar, okdVar, builder, null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    private static final java.lang.String k(defpackage.lnk lnkVar) {
        int i = lnkVar.b;
        if (i == 1) {
            defpackage.lnn lnnVarB = defpackage.lnn.b(((java.lang.Integer) lnkVar.c).intValue());
            if (lnnVarB == null) {
                lnnVarB = defpackage.lnn.UNRECOGNIZED;
            }
            return lnnVarB.name();
        }
        if (i != 2) {
            return "unknown";
        }
        defpackage.lno lnoVarB = defpackage.lno.b(((java.lang.Integer) lnkVar.c).intValue());
        if (lnoVarB == null) {
            lnoVarB = defpackage.lno.UNRECOGNIZED;
        }
        return lnoVarB.name();
    }

    private static final int l(android.telecom.Call.Details details) {
        int iM = da$.ExternalSyntheticApiModelOutline0.m(details);
        if (iM == 0) {
            return 1;
        }
        if (iM == 1) {
            return 2;
        }
        throw new java.lang.IllegalStateException("invalid call direction");
    }

    public final defpackage.lmq a(android.telecom.Call.Details details) {
        if (details != null) {
            return new defpackage.lmq(details, false);
        }
        throw new java.lang.NullPointerException("Null callDetails");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, lnp] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009c -> B:24:0x009e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(aoln r13) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnh.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.lmq lmqVar, aoln aolnVar) {
        defpackage.lng lngVar;
        if (aolnVar instanceof defpackage.lng) {
            lngVar = (defpackage.lng) aolnVar;
            int i = lngVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lngVar.c = i - Integer.MIN_VALUE;
            } else {
                lngVar = new defpackage.lng(this, aolnVar);
            }
        } else {
            lngVar = new defpackage.lng(this, aolnVar);
        }
        java.lang.Object objC = lngVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lngVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "shouldPassToUserForEmergencyCall", 329, "DialerCallScreeningServiceMixinImpl.kt").v("determining if to immediately pass to user");
            zjl zjlVar = this.r;
            lngVar.d = lmqVar;
            lngVar.c = 1;
            objC = zjlVar.c(lngVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lmqVar = lngVar.d;
            aooc.af(objC);
        }
        if (((java.lang.Boolean) objC).booleanValue()) {
            a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "shouldPassToUserForEmergencyCall", 335, "DialerCallScreeningServiceMixinImpl.kt").v("has recent emergency call, passing to user");
            return java.lang.Boolean.TRUE;
        }
        java.lang.String strB = ura.b(lmqVar.a);
        if (strB == null) {
            a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "shouldPassToUserForEmergencyCall", 341, "DialerCallScreeningServiceMixinImpl.kt").v("number is not available, cannot determine if emergency number");
            return java.lang.Boolean.FALSE;
        }
        if (!this.s.X(strB)) {
            return java.lang.Boolean.FALSE;
        }
        a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "shouldPassToUserForEmergencyCall", 349, "DialerCallScreeningServiceMixinImpl.kt").v("call is from emergency number, passing to user");
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final void d(defpackage.lmq lmqVar, defpackage.lnl lnlVar) {
        android.telecom.Call.Details details = lmqVar.a;
        aooh.f(lnlVar, "callScreeningResult");
        this.w.a.put(java.lang.Long.valueOf(aa$.ExternalSyntheticApiModelOutline0.m(details)), lnlVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:30:0x0113  */
    /* JADX WARN: Code duplicated, block: B:32:0x014e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0152  */
    /* JADX WARN: Code duplicated, block: B:37:0x016f  */
    /* JADX WARN: Code duplicated, block: B:40:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x020e  */
    /* JADX WARN: Code duplicated, block: B:52:0x022e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0233  */
    /* JADX WARN: Code duplicated, block: B:57:0x0236  */
    /* JADX WARN: Code duplicated, block: B:59:0x025e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0262 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0263  */
    /* JADX WARN: Code duplicated, block: B:64:0x026b  */
    /* JADX WARN: Code duplicated, block: B:67:0x027f  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, lnk, okd] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    public final java.lang.Object e(defpackage.okd okdVar, android.telecom.Call.Details details, aoln aolnVar) {
        defpackage.lnf lnfVar;
        defpackage.okd okdVar2;
        android.telecom.Call.Details details2;
        java.lang.Object objAj;
        defpackage.lmq lmqVarA;
        java.lang.Object objO;
        defpackage.okd okdVar3;
        defpackage.lmq lmqVar;
        int i;
        aosy aosyVarAm;
        aosy aosyVar;
        defpackage.okd okdVar4;
        defpackage.lmq lmqVar2;
        defpackage.okd okdVar5;
        java.lang.String str;
        int i2;
        aosy aosyVarAm2;
        defpackage.lnh lnhVar;
        aosy aosyVarAm3;
        java.lang.Object objA;
        java.lang.Object obj;
        defpackage.lmq lmqVar3;
        defpackage.okd okdVar6;
        aosy aosyVar2;
        java.lang.String str2;
        defpackage.okd okdVar7;
        java.lang.Object objA2;
        aosy aosyVar3;
        defpackage.lnh lnhVar2;
        defpackage.lmx lmxVar;
        defpackage.lnf lnfVar2;
        boolean z;
        java.lang.Object objA3;
        int iOrdinal;
        defpackage.lnk lnkVar;
        java.lang.Object objJ;
        defpackage.lnk lnkVar2;
        java.lang.Object objJ2;
        ?? r1;
        defpackage.lnh lnhVar3;
        defpackage.lmz lmzVar;
        defpackage.lnh lnhVar4 = this;
        if (aolnVar instanceof defpackage.lnf) {
            lnfVar = (defpackage.lnf) aolnVar;
            int i3 = lnfVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lnfVar.f = i3 - Integer.MIN_VALUE;
            } else {
                lnfVar = new defpackage.lnf(lnhVar4, aolnVar);
            }
        } else {
            lnfVar = new defpackage.lnf(lnhVar4, aolnVar);
        }
        defpackage.lnf lnfVar3 = lnfVar;
        java.lang.Object objB = lnfVar3.d;
        aolu aoluVar = aolu.a;
        switch (lnfVar3.f) {
            case 0:
                aooc.af(objB);
                if (l(details) == 2) {
                    a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "screenCall", 231, "DialerCallScreeningServiceMixinImpl.kt").v("outgoing call has started, returning");
                    return aojh.a;
                }
                okdVar2 = okdVar;
                lnfVar3.g = okdVar2;
                details2 = details;
                lnfVar3.a = details2;
                lnfVar3.f = 1;
                objAj = aoov.aj(lnhVar4.p, new defpackage.jrb(lnhVar4, (aoln) null, 11), lnfVar3);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objAj).booleanValue()) {
                    a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "passToUserForNonDefaultDialer", 412, "DialerCallScreeningServiceMixinImpl.kt").v("passing to user since application is not the default Dialer");
                    lnhVar4.d.o(rmx.iZ);
                    android.telecom.CallScreeningService.CallResponse callResponseM = fh$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder());
                    aooh.c(callResponseM);
                    okdVar2.a(details2, callResponseM);
                    return aojh.a;
                }
                lmqVarA = lnhVar4.a(details2);
                lnhVar4.i = lmqVarA;
                lnhVar4.m.i((java.lang.String) null).b(mce.aJ);
                a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "screenCall", 247, "DialerCallScreeningServiceMixinImpl.kt").y("incoming call screening has started, callScreeningDetails.isSanitized: %b", java.lang.Boolean.valueOf(lmqVarA.b));
                lnfVar3.g = okdVar2;
                lnfVar3.a = lmqVarA;
                lnfVar3.f = 2;
                objO = aooh.O(new defpackage.lnb(lnhVar4, lmqVarA, (aoln) null, 0), lnfVar3);
                if (objO != aoluVar) {
                    objO = aojh.a;
                }
                if (objO != aoluVar) {
                    return aoluVar;
                }
                okdVar3 = okdVar2;
                lmqVar = lmqVarA;
                i = 3;
                aosyVarAm = aoov.am(lnhVar4.b, 0, new defpackage.kqd(lnhVar4, lmqVar, (aoln) null, 6), 3);
                lnfVar3.g = okdVar3;
                lnfVar3.a = lmqVar;
                lnfVar3.b = aosyVarAm;
                lnfVar3.f = 3;
                objB = lnhVar4.b(lnfVar3);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                defpackage.okd okdVar8 = okdVar3;
                aosyVar = aosyVarAm;
                okdVar4 = okdVar8;
                aoss aossVar = lnhVar4.b;
                defpackage.lmy lmyVar = (defpackage.lmy) objB;
                int i4 = i;
                lmqVar2 = lmqVar;
                okdVar5 = okdVar4;
                str = "com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl";
                i2 = i4;
                aosyVarAm2 = aoov.am(aossVar, 0, new defpackage.hyq(lmyVar, this, lmqVar2, (aoln) null, 16), i4);
                lnhVar = this;
                aosyVarAm3 = aoov.am(aossVar, 0, new defpackage.hyq(lmyVar, this, lmqVar2, null, 17, null), i2);
                lnfVar3.g = okdVar5;
                lnfVar3.a = lmqVar2;
                lnfVar3.b = aosyVarAm2;
                lnfVar3.c = aosyVarAm3;
                lnfVar3.f = 4;
                objA = aosyVar.a(lnfVar3);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                obj = aosyVarAm3;
                objB = objA;
                lmqVar3 = lmqVar2;
                okdVar6 = okdVar5;
                aosyVar2 = aosyVarAm2;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().l(str, "screenCall", 279, "DialerCallScreeningServiceMixinImpl.kt").v("immediately passing call to user");
                    lnfVar3.g = null;
                    lnfVar3.a = null;
                    lnfVar3.b = null;
                    lnfVar3.c = null;
                    lnfVar3.f = 5;
                    if (lnhVar.h(okdVar6, lmqVar3, null, lnfVar3) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    str2 = str;
                    okdVar7 = null;
                    lnfVar3.g = okdVar6;
                    lnfVar3.a = lmqVar3;
                    lnfVar3.b = obj;
                    lnfVar3.c = null;
                    lnfVar3.f = 6;
                    objA2 = aosyVar2.a(lnfVar3);
                    if (objA2 == aoluVar) {
                        lnhVar2 = lnhVar;
                        aosyVar3 = obj;
                        return aoluVar;
                    }
                    lnhVar2 = lnhVar;
                    aosyVar3 = obj;
                    lmxVar = (defpackage.lmx) objA2;
                    if (lmxVar != null) {
                        aimw aimwVarL = a.b().l(str2, "screenCall", 288, "DialerCallScreeningServiceMixinImpl.kt");
                        defpackage.lnm lnmVar = lmxVar.a;
                        aimwVarL.y("audio based screening feature voted for %s", lnmVar.name());
                        iOrdinal = lnmVar.ordinal();
                        if (iOrdinal != 1) {
                            lnkVar = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 7;
                            if (lnhVar2.h(okdVar6, lmqVar3, lnkVar, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != 2) {
                            defpackage.lnk lnkVar3 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 8;
                            android.telecom.CallScreeningService.CallResponse.Builder shouldScreenCallViaAudioProcessing = new android.telecom.CallScreeningService.CallResponse.Builder().setShouldScreenCallViaAudioProcessing(true);
                            aooh.e(shouldScreenCallViaAudioProcessing, "setShouldScreenCallViaAudioProcessing(...)");
                            objJ = lnhVar2.j(okdVar6, lmqVar3, f(4, lnkVar3), shouldScreenCallViaAudioProcessing, lnfVar3);
                            if (objJ != aoluVar) {
                                objJ = aojh.a;
                            }
                            if (objJ == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != i2) {
                            lnkVar2 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 10;
                            if (lnhVar2.i(okdVar6, lmqVar3, lnkVar2, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            if (iOrdinal == 4) {
                                throw new java.lang.IllegalStateException("audio based screening vote is invalid");
                            }
                            defpackage.lnk lnkVar4 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 9;
                            android.telecom.CallScreeningService.CallResponse.Builder builderM = fn$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder(), true);
                            aooh.e(builderM, "setSilenceCall(...)");
                            objJ2 = lnhVar2.j(okdVar6, lmqVar3, f(6, lnkVar4), builderM, lnfVar3);
                            if (objJ2 != aoluVar) {
                                objJ2 = aojh.a;
                            }
                            if (objJ2 == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        lnfVar2 = lnfVar3;
                        z = true;
                        lnfVar2.g = okdVar6;
                        lnfVar2.a = lmqVar3;
                        lnfVar2.b = okdVar7;
                        lnfVar2.f = 11;
                        objA3 = aosyVar3.a(lnfVar2);
                        if (objA3 == aoluVar) {
                            lnhVar3 = lnhVar2;
                            r1 = okdVar7;
                            return aoluVar;
                        }
                        lnhVar3 = lnhVar2;
                        r1 = okdVar7;
                        lmzVar = (defpackage.lmz) objA3;
                        if (lmzVar == null && lmzVar.a == z) {
                            defpackage.lnk lnkVar5 = lmzVar.b;
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 12;
                            if (lnhVar3.i(okdVar6, lmqVar3, lnkVar5, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
            case 1:
                details2 = (android.telecom.Call.Details) lnfVar3.a;
                defpackage.okd okdVar9 = lnfVar3.g;
                aooc.af(objB);
                objAj = objB;
                okdVar2 = okdVar9;
                if (!((java.lang.Boolean) objAj).booleanValue()) {
                    a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "passToUserForNonDefaultDialer", 412, "DialerCallScreeningServiceMixinImpl.kt").v("passing to user since application is not the default Dialer");
                    lnhVar4.d.o(rmx.iZ);
                    android.telecom.CallScreeningService.CallResponse callResponseM2 = fh$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder());
                    aooh.c(callResponseM2);
                    okdVar2.a(details2, callResponseM2);
                    return aojh.a;
                }
                lmqVarA = lnhVar4.a(details2);
                lnhVar4.i = lmqVarA;
                lnhVar4.m.i((java.lang.String) null).b(mce.aJ);
                a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "screenCall", 247, "DialerCallScreeningServiceMixinImpl.kt").y("incoming call screening has started, callScreeningDetails.isSanitized: %b", java.lang.Boolean.valueOf(lmqVarA.b));
                lnfVar3.g = okdVar2;
                lnfVar3.a = lmqVarA;
                lnfVar3.f = 2;
                objO = aooh.O(new defpackage.lnb(lnhVar4, lmqVarA, (aoln) null, 0), lnfVar3);
                if (objO != aoluVar) {
                    objO = aojh.a;
                }
                if (objO != aoluVar) {
                    return aoluVar;
                }
                okdVar3 = okdVar2;
                lmqVar = lmqVarA;
                i = 3;
                aosyVarAm = aoov.am(lnhVar4.b, 0, new defpackage.kqd(lnhVar4, lmqVar, (aoln) null, 6), 3);
                lnfVar3.g = okdVar3;
                lnfVar3.a = lmqVar;
                lnfVar3.b = aosyVarAm;
                lnfVar3.f = 3;
                objB = lnhVar4.b(lnfVar3);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                defpackage.okd okdVar10 = okdVar3;
                aosyVar = aosyVarAm;
                okdVar4 = okdVar10;
                aoss aossVar2 = lnhVar4.b;
                defpackage.lmy lmyVar2 = (defpackage.lmy) objB;
                int i5 = i;
                lmqVar2 = lmqVar;
                okdVar5 = okdVar4;
                str = "com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl";
                i2 = i5;
                aosyVarAm2 = aoov.am(aossVar2, 0, new defpackage.hyq(lmyVar2, this, lmqVar2, (aoln) null, 16), i5);
                lnhVar = this;
                aosyVarAm3 = aoov.am(aossVar2, 0, new defpackage.hyq(lmyVar2, this, lmqVar2, null, 17, null), i2);
                lnfVar3.g = okdVar5;
                lnfVar3.a = lmqVar2;
                lnfVar3.b = aosyVarAm2;
                lnfVar3.c = aosyVarAm3;
                lnfVar3.f = 4;
                objA = aosyVar.a(lnfVar3);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                obj = aosyVarAm3;
                objB = objA;
                lmqVar3 = lmqVar2;
                okdVar6 = okdVar5;
                aosyVar2 = aosyVarAm2;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().l(str, "screenCall", 279, "DialerCallScreeningServiceMixinImpl.kt").v("immediately passing call to user");
                    lnfVar3.g = null;
                    lnfVar3.a = null;
                    lnfVar3.b = null;
                    lnfVar3.c = null;
                    lnfVar3.f = 5;
                    if (lnhVar.h(okdVar6, lmqVar3, null, lnfVar3) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    str2 = str;
                    okdVar7 = null;
                    lnfVar3.g = okdVar6;
                    lnfVar3.a = lmqVar3;
                    lnfVar3.b = obj;
                    lnfVar3.c = null;
                    lnfVar3.f = 6;
                    objA2 = aosyVar2.a(lnfVar3);
                    if (objA2 == aoluVar) {
                        lnhVar2 = lnhVar;
                        aosyVar3 = obj;
                        return aoluVar;
                    }
                    lnhVar2 = lnhVar;
                    aosyVar3 = obj;
                    lmxVar = (defpackage.lmx) objA2;
                    if (lmxVar != null) {
                        aimw aimwVarL2 = a.b().l(str2, "screenCall", 288, "DialerCallScreeningServiceMixinImpl.kt");
                        defpackage.lnm lnmVar2 = lmxVar.a;
                        aimwVarL2.y("audio based screening feature voted for %s", lnmVar2.name());
                        iOrdinal = lnmVar2.ordinal();
                        if (iOrdinal != 1) {
                            lnkVar = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 7;
                            if (lnhVar2.h(okdVar6, lmqVar3, lnkVar, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != 2) {
                            defpackage.lnk lnkVar6 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 8;
                            android.telecom.CallScreeningService.CallResponse.Builder shouldScreenCallViaAudioProcessing2 = new android.telecom.CallScreeningService.CallResponse.Builder().setShouldScreenCallViaAudioProcessing(true);
                            aooh.e(shouldScreenCallViaAudioProcessing2, "setShouldScreenCallViaAudioProcessing(...)");
                            objJ = lnhVar2.j(okdVar6, lmqVar3, f(4, lnkVar6), shouldScreenCallViaAudioProcessing2, lnfVar3);
                            if (objJ != aoluVar) {
                                objJ = aojh.a;
                            }
                            if (objJ == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != i2) {
                            lnkVar2 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 10;
                            if (lnhVar2.i(okdVar6, lmqVar3, lnkVar2, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            if (iOrdinal == 4) {
                                throw new java.lang.IllegalStateException("audio based screening vote is invalid");
                            }
                            defpackage.lnk lnkVar7 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 9;
                            android.telecom.CallScreeningService.CallResponse.Builder builderM2 = fn$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder(), true);
                            aooh.e(builderM2, "setSilenceCall(...)");
                            objJ2 = lnhVar2.j(okdVar6, lmqVar3, f(6, lnkVar7), builderM2, lnfVar3);
                            if (objJ2 != aoluVar) {
                                objJ2 = aojh.a;
                            }
                            if (objJ2 == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        lnfVar2 = lnfVar3;
                        z = true;
                        lnfVar2.g = okdVar6;
                        lnfVar2.a = lmqVar3;
                        lnfVar2.b = okdVar7;
                        lnfVar2.f = 11;
                        objA3 = aosyVar3.a(lnfVar2);
                        if (objA3 == aoluVar) {
                            lnhVar3 = lnhVar2;
                            r1 = okdVar7;
                            return aoluVar;
                        }
                        lnhVar3 = lnhVar2;
                        r1 = okdVar7;
                        lmzVar = (defpackage.lmz) objA3;
                        if (lmzVar == null) {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
            case 2:
                lmqVarA = (defpackage.lmq) lnfVar3.a;
                defpackage.okd okdVar11 = lnfVar3.g;
                aooc.af(objB);
                okdVar3 = okdVar11;
                lmqVar = lmqVarA;
                i = 3;
                aosyVarAm = aoov.am(lnhVar4.b, 0, new defpackage.kqd(lnhVar4, lmqVar, (aoln) null, 6), 3);
                lnfVar3.g = okdVar3;
                lnfVar3.a = lmqVar;
                lnfVar3.b = aosyVarAm;
                lnfVar3.f = 3;
                objB = lnhVar4.b(lnfVar3);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                defpackage.okd okdVar12 = okdVar3;
                aosyVar = aosyVarAm;
                okdVar4 = okdVar12;
                aoss aossVar3 = lnhVar4.b;
                defpackage.lmy lmyVar3 = (defpackage.lmy) objB;
                int i6 = i;
                lmqVar2 = lmqVar;
                okdVar5 = okdVar4;
                str = "com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl";
                i2 = i6;
                aosyVarAm2 = aoov.am(aossVar3, 0, new defpackage.hyq(lmyVar3, this, lmqVar2, (aoln) null, 16), i6);
                lnhVar = this;
                aosyVarAm3 = aoov.am(aossVar3, 0, new defpackage.hyq(lmyVar3, this, lmqVar2, null, 17, null), i2);
                lnfVar3.g = okdVar5;
                lnfVar3.a = lmqVar2;
                lnfVar3.b = aosyVarAm2;
                lnfVar3.c = aosyVarAm3;
                lnfVar3.f = 4;
                objA = aosyVar.a(lnfVar3);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                obj = aosyVarAm3;
                objB = objA;
                lmqVar3 = lmqVar2;
                okdVar6 = okdVar5;
                aosyVar2 = aosyVarAm2;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().l(str, "screenCall", 279, "DialerCallScreeningServiceMixinImpl.kt").v("immediately passing call to user");
                    lnfVar3.g = null;
                    lnfVar3.a = null;
                    lnfVar3.b = null;
                    lnfVar3.c = null;
                    lnfVar3.f = 5;
                    if (lnhVar.h(okdVar6, lmqVar3, null, lnfVar3) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    str2 = str;
                    okdVar7 = null;
                    lnfVar3.g = okdVar6;
                    lnfVar3.a = lmqVar3;
                    lnfVar3.b = obj;
                    lnfVar3.c = null;
                    lnfVar3.f = 6;
                    objA2 = aosyVar2.a(lnfVar3);
                    if (objA2 == aoluVar) {
                        lnhVar2 = lnhVar;
                        aosyVar3 = obj;
                        return aoluVar;
                    }
                    lnhVar2 = lnhVar;
                    aosyVar3 = obj;
                    lmxVar = (defpackage.lmx) objA2;
                    if (lmxVar != null) {
                        aimw aimwVarL3 = a.b().l(str2, "screenCall", 288, "DialerCallScreeningServiceMixinImpl.kt");
                        defpackage.lnm lnmVar3 = lmxVar.a;
                        aimwVarL3.y("audio based screening feature voted for %s", lnmVar3.name());
                        iOrdinal = lnmVar3.ordinal();
                        if (iOrdinal != 1) {
                            lnkVar = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 7;
                            if (lnhVar2.h(okdVar6, lmqVar3, lnkVar, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != 2) {
                            defpackage.lnk lnkVar8 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 8;
                            android.telecom.CallScreeningService.CallResponse.Builder shouldScreenCallViaAudioProcessing3 = new android.telecom.CallScreeningService.CallResponse.Builder().setShouldScreenCallViaAudioProcessing(true);
                            aooh.e(shouldScreenCallViaAudioProcessing3, "setShouldScreenCallViaAudioProcessing(...)");
                            objJ = lnhVar2.j(okdVar6, lmqVar3, f(4, lnkVar8), shouldScreenCallViaAudioProcessing3, lnfVar3);
                            if (objJ != aoluVar) {
                                objJ = aojh.a;
                            }
                            if (objJ == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != i2) {
                            lnkVar2 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 10;
                            if (lnhVar2.i(okdVar6, lmqVar3, lnkVar2, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            if (iOrdinal == 4) {
                                throw new java.lang.IllegalStateException("audio based screening vote is invalid");
                            }
                            defpackage.lnk lnkVar9 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 9;
                            android.telecom.CallScreeningService.CallResponse.Builder builderM3 = fn$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder(), true);
                            aooh.e(builderM3, "setSilenceCall(...)");
                            objJ2 = lnhVar2.j(okdVar6, lmqVar3, f(6, lnkVar9), builderM3, lnfVar3);
                            if (objJ2 != aoluVar) {
                                objJ2 = aojh.a;
                            }
                            if (objJ2 == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        lnfVar2 = lnfVar3;
                        z = true;
                        lnfVar2.g = okdVar6;
                        lnfVar2.a = lmqVar3;
                        lnfVar2.b = okdVar7;
                        lnfVar2.f = 11;
                        objA3 = aosyVar3.a(lnfVar2);
                        if (objA3 == aoluVar) {
                            lnhVar3 = lnhVar2;
                            r1 = okdVar7;
                            return aoluVar;
                        }
                        lnhVar3 = lnhVar2;
                        r1 = okdVar7;
                        lmzVar = (defpackage.lmz) objA3;
                        if (lmzVar == null) {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
            case 3:
                java.lang.Object obj2 = lnfVar3.b;
                lmqVar = (defpackage.lmq) lnfVar3.a;
                defpackage.okd okdVar13 = lnfVar3.g;
                aooc.af(objB);
                aosyVar = obj2;
                okdVar4 = okdVar13;
                i = 3;
                aoss aossVar4 = lnhVar4.b;
                defpackage.lmy lmyVar4 = (defpackage.lmy) objB;
                int i7 = i;
                lmqVar2 = lmqVar;
                okdVar5 = okdVar4;
                str = "com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl";
                i2 = i7;
                aosyVarAm2 = aoov.am(aossVar4, 0, new defpackage.hyq(lmyVar4, this, lmqVar2, (aoln) null, 16), i7);
                lnhVar = this;
                aosyVarAm3 = aoov.am(aossVar4, 0, new defpackage.hyq(lmyVar4, this, lmqVar2, null, 17, null), i2);
                lnfVar3.g = okdVar5;
                lnfVar3.a = lmqVar2;
                lnfVar3.b = aosyVarAm2;
                lnfVar3.c = aosyVarAm3;
                lnfVar3.f = 4;
                objA = aosyVar.a(lnfVar3);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                obj = aosyVarAm3;
                objB = objA;
                lmqVar3 = lmqVar2;
                okdVar6 = okdVar5;
                aosyVar2 = aosyVarAm2;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().l(str, "screenCall", 279, "DialerCallScreeningServiceMixinImpl.kt").v("immediately passing call to user");
                    lnfVar3.g = null;
                    lnfVar3.a = null;
                    lnfVar3.b = null;
                    lnfVar3.c = null;
                    lnfVar3.f = 5;
                    if (lnhVar.h(okdVar6, lmqVar3, null, lnfVar3) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    str2 = str;
                    okdVar7 = null;
                    lnfVar3.g = okdVar6;
                    lnfVar3.a = lmqVar3;
                    lnfVar3.b = obj;
                    lnfVar3.c = null;
                    lnfVar3.f = 6;
                    objA2 = aosyVar2.a(lnfVar3);
                    if (objA2 == aoluVar) {
                        lnhVar2 = lnhVar;
                        aosyVar3 = obj;
                        return aoluVar;
                    }
                    lnhVar2 = lnhVar;
                    aosyVar3 = obj;
                    lmxVar = (defpackage.lmx) objA2;
                    if (lmxVar != null) {
                        aimw aimwVarL4 = a.b().l(str2, "screenCall", 288, "DialerCallScreeningServiceMixinImpl.kt");
                        defpackage.lnm lnmVar4 = lmxVar.a;
                        aimwVarL4.y("audio based screening feature voted for %s", lnmVar4.name());
                        iOrdinal = lnmVar4.ordinal();
                        if (iOrdinal != 1) {
                            lnkVar = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 7;
                            if (lnhVar2.h(okdVar6, lmqVar3, lnkVar, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != 2) {
                            defpackage.lnk lnkVar10 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 8;
                            android.telecom.CallScreeningService.CallResponse.Builder shouldScreenCallViaAudioProcessing4 = new android.telecom.CallScreeningService.CallResponse.Builder().setShouldScreenCallViaAudioProcessing(true);
                            aooh.e(shouldScreenCallViaAudioProcessing4, "setShouldScreenCallViaAudioProcessing(...)");
                            objJ = lnhVar2.j(okdVar6, lmqVar3, f(4, lnkVar10), shouldScreenCallViaAudioProcessing4, lnfVar3);
                            if (objJ != aoluVar) {
                                objJ = aojh.a;
                            }
                            if (objJ == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != i2) {
                            lnkVar2 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 10;
                            if (lnhVar2.i(okdVar6, lmqVar3, lnkVar2, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            if (iOrdinal == 4) {
                                throw new java.lang.IllegalStateException("audio based screening vote is invalid");
                            }
                            defpackage.lnk lnkVar11 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 9;
                            android.telecom.CallScreeningService.CallResponse.Builder builderM4 = fn$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder(), true);
                            aooh.e(builderM4, "setSilenceCall(...)");
                            objJ2 = lnhVar2.j(okdVar6, lmqVar3, f(6, lnkVar11), builderM4, lnfVar3);
                            if (objJ2 != aoluVar) {
                                objJ2 = aojh.a;
                            }
                            if (objJ2 == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        lnfVar2 = lnfVar3;
                        z = true;
                        lnfVar2.g = okdVar6;
                        lnfVar2.a = lmqVar3;
                        lnfVar2.b = okdVar7;
                        lnfVar2.f = 11;
                        objA3 = aosyVar3.a(lnfVar2);
                        if (objA3 == aoluVar) {
                            lnhVar3 = lnhVar2;
                            r1 = okdVar7;
                            return aoluVar;
                        }
                        lnhVar3 = lnhVar2;
                        r1 = okdVar7;
                        lmzVar = (defpackage.lmz) objA3;
                        if (lmzVar == null) {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
            case 4:
                java.lang.Object obj3 = lnfVar3.c;
                java.lang.Object obj4 = lnfVar3.b;
                lmqVar3 = (defpackage.lmq) lnfVar3.a;
                defpackage.okd okdVar14 = lnfVar3.g;
                aooc.af(objB);
                str = "com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl";
                aosyVar2 = obj4;
                i2 = 3;
                okdVar6 = okdVar14;
                lnhVar = lnhVar4;
                obj = obj3;
                if (((java.lang.Boolean) objB).booleanValue()) {
                    a.b().l(str, "screenCall", 279, "DialerCallScreeningServiceMixinImpl.kt").v("immediately passing call to user");
                    lnfVar3.g = null;
                    lnfVar3.a = null;
                    lnfVar3.b = null;
                    lnfVar3.c = null;
                    lnfVar3.f = 5;
                    if (lnhVar.h(okdVar6, lmqVar3, null, lnfVar3) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    str2 = str;
                    okdVar7 = null;
                    lnfVar3.g = okdVar6;
                    lnfVar3.a = lmqVar3;
                    lnfVar3.b = obj;
                    lnfVar3.c = null;
                    lnfVar3.f = 6;
                    objA2 = aosyVar2.a(lnfVar3);
                    if (objA2 == aoluVar) {
                        lnhVar2 = lnhVar;
                        aosyVar3 = obj;
                        return aoluVar;
                    }
                    lnhVar2 = lnhVar;
                    aosyVar3 = obj;
                    lmxVar = (defpackage.lmx) objA2;
                    if (lmxVar != null) {
                        aimw aimwVarL5 = a.b().l(str2, "screenCall", 288, "DialerCallScreeningServiceMixinImpl.kt");
                        defpackage.lnm lnmVar5 = lmxVar.a;
                        aimwVarL5.y("audio based screening feature voted for %s", lnmVar5.name());
                        iOrdinal = lnmVar5.ordinal();
                        if (iOrdinal != 1) {
                            lnkVar = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 7;
                            if (lnhVar2.h(okdVar6, lmqVar3, lnkVar, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != 2) {
                            defpackage.lnk lnkVar12 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 8;
                            android.telecom.CallScreeningService.CallResponse.Builder shouldScreenCallViaAudioProcessing5 = new android.telecom.CallScreeningService.CallResponse.Builder().setShouldScreenCallViaAudioProcessing(true);
                            aooh.e(shouldScreenCallViaAudioProcessing5, "setShouldScreenCallViaAudioProcessing(...)");
                            objJ = lnhVar2.j(okdVar6, lmqVar3, f(4, lnkVar12), shouldScreenCallViaAudioProcessing5, lnfVar3);
                            if (objJ != aoluVar) {
                                objJ = aojh.a;
                            }
                            if (objJ == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != i2) {
                            lnkVar2 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 10;
                            if (lnhVar2.i(okdVar6, lmqVar3, lnkVar2, lnfVar3) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            if (iOrdinal == 4) {
                                throw new java.lang.IllegalStateException("audio based screening vote is invalid");
                            }
                            defpackage.lnk lnkVar13 = lmxVar.b;
                            lnfVar3.g = okdVar7;
                            lnfVar3.a = okdVar7;
                            lnfVar3.b = okdVar7;
                            lnfVar3.f = 9;
                            android.telecom.CallScreeningService.CallResponse.Builder builderM5 = fn$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder(), true);
                            aooh.e(builderM5, "setSilenceCall(...)");
                            objJ2 = lnhVar2.j(okdVar6, lmqVar3, f(6, lnkVar13), builderM5, lnfVar3);
                            if (objJ2 != aoluVar) {
                                objJ2 = aojh.a;
                            }
                            if (objJ2 == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        lnfVar2 = lnfVar3;
                        z = true;
                        lnfVar2.g = okdVar6;
                        lnfVar2.a = lmqVar3;
                        lnfVar2.b = okdVar7;
                        lnfVar2.f = 11;
                        objA3 = aosyVar3.a(lnfVar2);
                        if (objA3 == aoluVar) {
                            lnhVar3 = lnhVar2;
                            r1 = okdVar7;
                            return aoluVar;
                        }
                        lnhVar3 = lnhVar2;
                        r1 = okdVar7;
                        lmzVar = (defpackage.lmz) objA3;
                        if (lmzVar == null) {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            lnfVar2.g = r1;
                            lnfVar2.a = r1;
                            lnfVar2.f = 13;
                            if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(objB);
                return aojh.a;
            case 6:
                java.lang.Object obj5 = lnfVar3.b;
                lmqVar3 = (defpackage.lmq) lnfVar3.a;
                okdVar6 = lnfVar3.g;
                aooc.af(objB);
                objA2 = objB;
                okdVar7 = null;
                str2 = "com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl";
                i2 = 3;
                lnhVar2 = lnhVar4;
                aosyVar3 = obj5;
                lnhVar2 = lnhVar;
                aosyVar3 = obj;
                lmxVar = (defpackage.lmx) objA2;
                if (lmxVar != null) {
                    aimw aimwVarL6 = a.b().l(str2, "screenCall", 288, "DialerCallScreeningServiceMixinImpl.kt");
                    defpackage.lnm lnmVar6 = lmxVar.a;
                    aimwVarL6.y("audio based screening feature voted for %s", lnmVar6.name());
                    iOrdinal = lnmVar6.ordinal();
                    if (iOrdinal != 1) {
                        lnkVar = lmxVar.b;
                        lnfVar3.g = okdVar7;
                        lnfVar3.a = okdVar7;
                        lnfVar3.b = okdVar7;
                        lnfVar3.f = 7;
                        if (lnhVar2.h(okdVar6, lmqVar3, lnkVar, lnfVar3) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (iOrdinal != 2) {
                        defpackage.lnk lnkVar14 = lmxVar.b;
                        lnfVar3.g = okdVar7;
                        lnfVar3.a = okdVar7;
                        lnfVar3.b = okdVar7;
                        lnfVar3.f = 8;
                        android.telecom.CallScreeningService.CallResponse.Builder shouldScreenCallViaAudioProcessing6 = new android.telecom.CallScreeningService.CallResponse.Builder().setShouldScreenCallViaAudioProcessing(true);
                        aooh.e(shouldScreenCallViaAudioProcessing6, "setShouldScreenCallViaAudioProcessing(...)");
                        objJ = lnhVar2.j(okdVar6, lmqVar3, f(4, lnkVar14), shouldScreenCallViaAudioProcessing6, lnfVar3);
                        if (objJ != aoluVar) {
                            objJ = aojh.a;
                        }
                        if (objJ == aoluVar) {
                            return aoluVar;
                        }
                    } else if (iOrdinal != i2) {
                        lnkVar2 = lmxVar.b;
                        lnfVar3.g = okdVar7;
                        lnfVar3.a = okdVar7;
                        lnfVar3.b = okdVar7;
                        lnfVar3.f = 10;
                        if (lnhVar2.i(okdVar6, lmqVar3, lnkVar2, lnfVar3) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (iOrdinal == 4) {
                            throw new java.lang.IllegalStateException("audio based screening vote is invalid");
                        }
                        defpackage.lnk lnkVar15 = lmxVar.b;
                        lnfVar3.g = okdVar7;
                        lnfVar3.a = okdVar7;
                        lnfVar3.b = okdVar7;
                        lnfVar3.f = 9;
                        android.telecom.CallScreeningService.CallResponse.Builder builderM6 = fn$.ExternalSyntheticApiModelOutline0.m(new android.telecom.CallScreeningService.CallResponse.Builder(), true);
                        aooh.e(builderM6, "setSilenceCall(...)");
                        objJ2 = lnhVar2.j(okdVar6, lmqVar3, f(6, lnkVar15), builderM6, lnfVar3);
                        if (objJ2 != aoluVar) {
                            objJ2 = aojh.a;
                        }
                        if (objJ2 == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else {
                    lnfVar2 = lnfVar3;
                    z = true;
                    lnfVar2.g = okdVar6;
                    lnfVar2.a = lmqVar3;
                    lnfVar2.b = okdVar7;
                    lnfVar2.f = 11;
                    objA3 = aosyVar3.a(lnfVar2);
                    if (objA3 == aoluVar) {
                        lnhVar3 = lnhVar2;
                        r1 = okdVar7;
                        return aoluVar;
                    }
                    lnhVar3 = lnhVar2;
                    r1 = okdVar7;
                    lmzVar = (defpackage.lmz) objA3;
                    if (lmzVar == null) {
                        lnfVar2.g = r1;
                        lnfVar2.a = r1;
                        lnfVar2.f = 13;
                        if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        lnfVar2.g = r1;
                        lnfVar2.a = r1;
                        lnfVar2.f = 13;
                        if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 11:
                defpackage.lmq lmqVar4 = (defpackage.lmq) lnfVar3.a;
                defpackage.okd okdVar15 = lnfVar3.g;
                aooc.af(objB);
                lmqVar3 = lmqVar4;
                okdVar6 = okdVar15;
                z = true;
                lnfVar2 = lnfVar3;
                objA3 = objB;
                r1 = 0;
                lnhVar3 = lnhVar4;
                lnhVar3 = lnhVar2;
                r1 = okdVar7;
                lmzVar = (defpackage.lmz) objA3;
                if (lmzVar == null) {
                    lnfVar2.g = r1;
                    lnfVar2.a = r1;
                    lnfVar2.f = 13;
                    if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    lnfVar2.g = r1;
                    lnfVar2.a = r1;
                    lnfVar2.f = 13;
                    if (lnhVar3.h(okdVar6, lmqVar3, r1, lnfVar2) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
