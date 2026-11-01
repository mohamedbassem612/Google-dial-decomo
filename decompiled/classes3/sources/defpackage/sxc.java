package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class sxc extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.sxd d;
    final /* synthetic */ lmq e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxc(defpackage.sxd sxdVar, lmq lmqVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = sxdVar;
        this.e = lmqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0126  */
    /* JADX WARN: Code duplicated, block: B:37:0x0130  */
    /* JADX WARN: Code duplicated, block: B:40:0x015c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x01af  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.String strB;
        aoss aossVar;
        lnm lnmVar;
        java.lang.Object obj2;
        android.telecom.Call.Details details;
        ajcq ajcqVarZ;
        aoss aossVar2;
        android.telecom.Call.Details details2;
        defpackage.sxd sxdVar;
        defpackage.sxi sxiVar;
        ajcq ajcqVar;
        defpackage.sxd sxdVar2;
        defpackage.sxi sxiVar2;
        defpackage.sxd sxdVar3;
        defpackage.sxi sxiVar3;
        defpackage.sxd sxdVar4;
        defpackage.yzr yzrVar;
        defpackage.sxi sxiVar4;
        aolu aoluVar = aolu.a;
        int i = 3;
        switch (this.c) {
            case 0:
                aooc.af(obj);
                aoss aossVar3 = (aoss) this.f;
                aimz aimzVar = defpackage.sxd.a;
                aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 52, "TidepodsRevelioCallResponseVoter.kt").v("starting work on casting vote");
                defpackage.sxd sxdVar5 = this.d;
                if (sxdVar5.e.c()) {
                    aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 55, "TidepodsRevelioCallResponseVoter.kt").v("Revelio is already running");
                    defpackage.yzr yzrVar2 = sxdVar5.h;
                    lnmVar = lnm.d;
                    defpackage.sxi sxiVar5 = defpackage.sxi.a;
                    this.f = lnmVar;
                    this.c = 1;
                    if (yzrVar2.f(lnmVar, sxiVar5, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    strB = defpackage.ura.b(this.e.a);
                    defpackage.sqt sqtVar = sxdVar5.d;
                    this.f = aossVar3;
                    this.a = strB;
                    this.c = 2;
                    java.lang.Object objA = sqtVar.a(strB, this);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    aossVar = aossVar3;
                    obj = objA;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 63, "TidepodsRevelioCallResponseVoter.kt").v("call is from local contact");
                        sxdVar = this.d;
                        lnmVar = lnm.b;
                        sxiVar = defpackage.sxi.d;
                        this.f = lnmVar;
                        this.a = null;
                        this.c = 3;
                        if (sxdVar.h.f(lnmVar, sxiVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        defpackage.sxd sxdVar6 = this.d;
                        sxdVar6.c.n(rmw.hV);
                        details = this.e.a;
                        int handlePresentation = details.getHandlePresentation();
                        if (!android.text.TextUtils.isEmpty(strB) || handlePresentation == 2 || handlePresentation == 3 || handlePresentation == 4) {
                            defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "getSpamStatusFuture", 112, "TidepodsRevelioCallResponseVoter.kt").v("not eligible for spam check");
                            ajcqVarZ = aiql.z(ttj.H());
                        } else {
                            ajcqVarZ = sxdVar6.g.f(details);
                        }
                        this.f = aossVar;
                        this.a = details;
                        this.b = ajcqVarZ;
                        this.c = 4;
                        obj = aoov.aj(sxdVar6.b, new defpackage.tgn(sxdVar6, ajcqVarZ, (aoln) null, 1), this);
                        if (obj != aoluVar) {
                            return aoluVar;
                        }
                        aossVar2 = aossVar;
                        details2 = details;
                        ajcqVar = ajcqVarZ;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 73, "TidepodsRevelioCallResponseVoter.kt").v("voting to reject due to spam call");
                            sxdVar2 = this.d;
                            lnmVar = lnm.d;
                            sxiVar2 = defpackage.sxi.b;
                            this.f = lnmVar;
                            this.a = null;
                            this.b = null;
                            this.c = 5;
                            if (sxdVar2.h.f(lnmVar, sxiVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            swt swtVar = this.d.e.b;
                            ajcq ajcqVarI = ahvr.I(ahvr.F(new defpackage.sws(swtVar, 0), swtVar.h), new defpackage.sue(swtVar, details2, ajcqVar, i), swtVar.f);
                            aosy aosyVarAm = aoov.am(aossVar2, 0, new defpackage.sge(ajcqVarI, (aoln) null, 19, (byte[]) null), 3);
                            aosyVarAm.p(new lwl(ajcqVarI, 11));
                            this.f = null;
                            this.a = null;
                            this.b = null;
                            this.c = 6;
                            obj = aosyVarAm.a(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                sxdVar4 = this.d;
                                if (sxdVar4.f.a()) {
                                    defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 85, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with Telecom audio processing");
                                    lnmVar = lnm.c;
                                } else {
                                    defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 88, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with no Telecom audio processing");
                                    lnmVar = lnm.e;
                                }
                                yzrVar = sxdVar4.h;
                                sxiVar4 = defpackage.sxi.c;
                                this.f = lnmVar;
                                this.c = 7;
                                if (yzrVar.f(lnmVar, sxiVar4, this) == aoluVar) {
                                    return aoluVar;
                                }
                            } else {
                                defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 95, "TidepodsRevelioCallResponseVoter.kt").v("voting to pass call to user");
                                sxdVar3 = this.d;
                                lnmVar = lnm.b;
                                sxiVar3 = defpackage.sxi.e;
                                this.f = lnmVar;
                                this.c = 8;
                                if (sxdVar3.h.f(lnmVar, sxiVar3, this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    }
                }
                return lnmVar;
            case 1:
            case 3:
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            default:
                obj2 = this.f;
                lnm lnmVar2 = (lnm) obj2;
                aooc.af(obj);
                return lnmVar2;
            case 2:
                strB = (java.lang.String) this.a;
                aossVar = (aoss) this.f;
                aooc.af(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 63, "TidepodsRevelioCallResponseVoter.kt").v("call is from local contact");
                    sxdVar = this.d;
                    lnmVar = lnm.b;
                    sxiVar = defpackage.sxi.d;
                    this.f = lnmVar;
                    this.a = null;
                    this.c = 3;
                    if (sxdVar.h.f(lnmVar, sxiVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.sxd sxdVar7 = this.d;
                    sxdVar7.c.n(rmw.hV);
                    details = this.e.a;
                    int handlePresentation2 = details.getHandlePresentation();
                    if (android.text.TextUtils.isEmpty(strB)) {
                        defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "getSpamStatusFuture", 112, "TidepodsRevelioCallResponseVoter.kt").v("not eligible for spam check");
                        ajcqVarZ = aiql.z(ttj.H());
                    } else {
                        defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "getSpamStatusFuture", 112, "TidepodsRevelioCallResponseVoter.kt").v("not eligible for spam check");
                        ajcqVarZ = aiql.z(ttj.H());
                    }
                    this.f = aossVar;
                    this.a = details;
                    this.b = ajcqVarZ;
                    this.c = 4;
                    obj = aoov.aj(sxdVar7.b, new defpackage.tgn(sxdVar7, ajcqVarZ, (aoln) null, 1), this);
                    if (obj != aoluVar) {
                        return aoluVar;
                    }
                    aossVar2 = aossVar;
                    details2 = details;
                    ajcqVar = ajcqVarZ;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 73, "TidepodsRevelioCallResponseVoter.kt").v("voting to reject due to spam call");
                        sxdVar2 = this.d;
                        lnmVar = lnm.d;
                        sxiVar2 = defpackage.sxi.b;
                        this.f = lnmVar;
                        this.a = null;
                        this.b = null;
                        this.c = 5;
                        if (sxdVar2.h.f(lnmVar, sxiVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        swt swtVar2 = this.d.e.b;
                        ajcq ajcqVarI2 = ahvr.I(ahvr.F(new defpackage.sws(swtVar2, 0), swtVar2.h), new defpackage.sue(swtVar2, details2, ajcqVar, i), swtVar2.f);
                        aosy aosyVarAm2 = aoov.am(aossVar2, 0, new defpackage.sge(ajcqVarI2, (aoln) null, 19, (byte[]) null), 3);
                        aosyVarAm2.p(new lwl(ajcqVarI2, 11));
                        this.f = null;
                        this.a = null;
                        this.b = null;
                        this.c = 6;
                        obj = aosyVarAm2.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            sxdVar4 = this.d;
                            if (sxdVar4.f.a()) {
                                defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 85, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with Telecom audio processing");
                                lnmVar = lnm.c;
                            } else {
                                defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 88, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with no Telecom audio processing");
                                lnmVar = lnm.e;
                            }
                            yzrVar = sxdVar4.h;
                            sxiVar4 = defpackage.sxi.c;
                            this.f = lnmVar;
                            this.c = 7;
                            if (yzrVar.f(lnmVar, sxiVar4, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 95, "TidepodsRevelioCallResponseVoter.kt").v("voting to pass call to user");
                            sxdVar3 = this.d;
                            lnmVar = lnm.b;
                            sxiVar3 = defpackage.sxi.e;
                            this.f = lnmVar;
                            this.c = 8;
                            if (sxdVar3.h.f(lnmVar, sxiVar3, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return lnmVar;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj3 = this.b;
                details2 = (android.telecom.Call.Details) this.a;
                aossVar2 = (aoss) this.f;
                aooc.af(obj);
                ajcqVar = obj3;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 73, "TidepodsRevelioCallResponseVoter.kt").v("voting to reject due to spam call");
                    sxdVar2 = this.d;
                    lnmVar = lnm.d;
                    sxiVar2 = defpackage.sxi.b;
                    this.f = lnmVar;
                    this.a = null;
                    this.b = null;
                    this.c = 5;
                    if (sxdVar2.h.f(lnmVar, sxiVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    swt swtVar3 = this.d.e.b;
                    ajcq ajcqVarI3 = ahvr.I(ahvr.F(new defpackage.sws(swtVar3, 0), swtVar3.h), new defpackage.sue(swtVar3, details2, ajcqVar, i), swtVar3.f);
                    aosy aosyVarAm3 = aoov.am(aossVar2, 0, new defpackage.sge(ajcqVarI3, (aoln) null, 19, (byte[]) null), 3);
                    aosyVarAm3.p(new lwl(ajcqVarI3, 11));
                    this.f = null;
                    this.a = null;
                    this.b = null;
                    this.c = 6;
                    obj = aosyVarAm3.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        sxdVar4 = this.d;
                        if (sxdVar4.f.a()) {
                            defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 85, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with Telecom audio processing");
                            lnmVar = lnm.c;
                        } else {
                            defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 88, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with no Telecom audio processing");
                            lnmVar = lnm.e;
                        }
                        yzrVar = sxdVar4.h;
                        sxiVar4 = defpackage.sxi.c;
                        this.f = lnmVar;
                        this.c = 7;
                        if (yzrVar.f(lnmVar, sxiVar4, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 95, "TidepodsRevelioCallResponseVoter.kt").v("voting to pass call to user");
                        sxdVar3 = this.d;
                        lnmVar = lnm.b;
                        sxiVar3 = defpackage.sxi.e;
                        this.f = lnmVar;
                        this.c = 8;
                        if (sxdVar3.h.f(lnmVar, sxiVar3, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return lnmVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    sxdVar4 = this.d;
                    if (sxdVar4.f.a()) {
                        defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 85, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with Telecom audio processing");
                        lnmVar = lnm.c;
                    } else {
                        defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 88, "TidepodsRevelioCallResponseVoter.kt").v("voting to silence call with no Telecom audio processing");
                        lnmVar = lnm.e;
                    }
                    yzrVar = sxdVar4.h;
                    sxiVar4 = defpackage.sxi.c;
                    this.f = lnmVar;
                    this.c = 7;
                    if (yzrVar.f(lnmVar, sxiVar4, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.sxd.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioCallResponseVoter", "vote$<anonymous>", 95, "TidepodsRevelioCallResponseVoter.kt").v("voting to pass call to user");
                    sxdVar3 = this.d;
                    lnmVar = lnm.b;
                    sxiVar3 = defpackage.sxi.e;
                    this.f = lnmVar;
                    this.c = 8;
                    if (sxdVar3.h.f(lnmVar, sxiVar3, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return lnmVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                obj2 = this.f;
                lnm lnmVar3 = (lnm) obj2;
                aooc.af(obj);
                return lnmVar3;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.sxc sxcVar = new defpackage.sxc(this.d, this.e, aolnVar);
        sxcVar.f = obj;
        return sxcVar;
    }
}
