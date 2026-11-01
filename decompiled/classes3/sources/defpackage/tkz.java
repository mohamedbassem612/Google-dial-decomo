package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tkz extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(java.lang.String str, defpackage.tqd tqdVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = str;
        this.c = tqdVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 15:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 17:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 18:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 19:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:144:0x039f  */
    /* JADX WARN: Code duplicated, block: B:183:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:264:0x0698  */
    /* JADX WARN: Code duplicated, block: B:265:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x020c  */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object objD;
        java.lang.Object objG;
        java.lang.Object objE;
        java.lang.Object objL;
        java.lang.Object objD2;
        java.lang.Object objAj;
        java.lang.Object objI;
        java.lang.Object objA;
        java.lang.Object objA2;
        java.lang.Object objAx;
        java.lang.Object objG2;
        java.lang.Object objA3;
        java.lang.Object objAu;
        java.lang.Object objI2;
        java.lang.Object objH;
        int i = 5;
        boolean z = false;
        java.lang.Integer num = null;
        switch (this.$cid) {
            case 0:
                aolu aoluVar = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                if (i2 != 0) {
                    if (i2 != 1) {
                        objG = obj;
                    } else {
                        objD = obj;
                    }
                    if (!((java.lang.Boolean) objG).booleanValue()) {
                        return java.lang.Boolean.TRUE;
                    }
                    defpackage.tla.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/hats/SharpieHatsRule", "shouldShowSurvey$<anonymous>", 68, "SharpieHatsRule.kt").v("last call with scam alert ended outside threshold time, not showing HaTs survey");
                    return java.lang.Boolean.FALSE;
                }
                ajcq ajcqVarA = ((oqi) this.c).a(oqt.q);
                this.a = 1;
                objD = aosv.D(ajcqVarA, this);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                java.lang.Integer num2 = (java.lang.Integer) objD;
                if (num2 != null && num2.intValue() == 0) {
                    defpackage.tla.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/hats/SharpieHatsRule", "shouldShowSurvey$<anonymous>", 60, "SharpieHatsRule.kt").v("no scam alert displayed recently, not showing HaTs survey");
                    return java.lang.Boolean.FALSE;
                }
                java.lang.Object obj2 = this.b;
                this.a = 2;
                objG = ((defpackage.tla) obj2).g(this);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    return java.lang.Boolean.TRUE;
                }
                defpackage.tla.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/hats/SharpieHatsRule", "shouldShowSurvey$<anonymous>", 68, "SharpieHatsRule.kt").v("last call with scam alert ended outside threshold time, not showing HaTs survey");
                return java.lang.Boolean.FALSE;
            case 1:
                aolu aoluVar2 = aolu.a;
                int i3 = this.a;
                aooc.af(obj);
                if (i3 == 0) {
                    java.lang.Object obj3 = this.c;
                    java.lang.Object obj4 = this.b;
                    this.a = 1;
                    defpackage.thj thjVar = (defpackage.thj) obj3;
                    java.lang.Object objAj2 = aoov.aj(thjVar.e, new defpackage.ryd(thjVar, (java.lang.String) obj4, (aoln) null, 5), this);
                    if (objAj2 != aoluVar2) {
                        objAj2 = aojh.a;
                    }
                    if (objAj2 == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return aojh.a;
            case 2:
                aolu aoluVar3 = aolu.a;
                int i4 = this.a;
                aooc.af(obj);
                if (i4 == 0) {
                    defpackage.tmj.a.b().l("com/android/dialer/sharpie/impl/service/InCallScreenActionControllerImpl", "onScamAlertConfirmed$<anonymous>", 51, "InCallScreenActionControllerImpl.kt").v("User has confirmed the scam alert.");
                    java.lang.Object obj5 = this.c;
                    java.lang.Object obj6 = this.b;
                    this.a = 1;
                    defpackage.toj tojVar = ((defpackage.tmj) obj5).c;
                    java.lang.Object objG3 = tojVar.g(new nhv(tojVar, (alcf) obj6, (aoln) null, 2), this);
                    if (objG3 != aoluVar3) {
                        objG3 = aojh.a;
                    }
                    if (objG3 == aoluVar3) {
                        return aoluVar3;
                    }
                }
                return aojh.a;
            case 3:
                aolu aoluVar4 = aolu.a;
                int i5 = this.a;
                aooc.af(obj);
                if (i5 == 0) {
                    defpackage.tmj.a.b().l("com/android/dialer/sharpie/impl/service/InCallScreenActionControllerImpl", "onScamAlertDismissed$<anonymous>", 57, "InCallScreenActionControllerImpl.kt").v("User has dismissed the scam alert.");
                    java.lang.Object obj7 = this.c;
                    java.lang.Object obj8 = this.b;
                    this.a = 1;
                    if (((defpackage.tmj) obj7).c.o((alcf) obj8, this) == aoluVar4) {
                        return aoluVar4;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aolu aoluVar5 = aolu.a;
                int i6 = this.a;
                aooc.af(obj);
                if (i6 == 0) {
                    java.lang.Object obj9 = this.c;
                    j$.time.Instant instantNow = j$.time.Instant.now();
                    aooh.e(instantNow, "instant(...)");
                    alcf alcfVarAu = aooc.au(instantNow);
                    this.a = 1;
                    if (((defpackage.toj) obj9).o(alcfVarAu, this) == aoluVar5) {
                        return aoluVar5;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aolu aoluVar6 = aolu.a;
                int i7 = this.a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                        objE = obj;
                    }
                    return aojh.a;
                }
                aooc.af(obj);
                java.lang.Object obj10 = this.c;
                java.lang.Object obj11 = this.b;
                this.a = 1;
                objE = ((defpackage.toj) obj10).z.e((java.lang.String) obj11, this);
                if (objE == aoluVar6) {
                    return aoluVar6;
                }
                defpackage.yxq yxqVar = (defpackage.yxq) objE;
                j$.util.Objects.checkIndex(0, 4);
                if (yxqVar != null) {
                    if (yxqVar instanceof defpackage.yxn) {
                        java.lang.Object obj12 = this.c;
                        this.a = 2;
                        defpackage.toj tojVar2 = (defpackage.toj) obj12;
                        java.lang.Object objG4 = tojVar2.g(new nhv(tojVar2, (defpackage.yxn) yxqVar, (aoln) null, 4), this);
                        if (objG4 != aoluVar6) {
                            objG4 = aojh.a;
                        }
                        if (objG4 == aoluVar6) {
                            return aoluVar6;
                        }
                    } else if (yxqVar instanceof defpackage.yxo) {
                        java.lang.Object obj13 = this.c;
                        this.a = 3;
                        java.lang.Object objM = ((defpackage.toj) obj13).m(((defpackage.yxo) yxqVar).a, this);
                        if (objM != aoluVar6) {
                            objM = aojh.a;
                        }
                        if (objM == aoluVar6) {
                            return aoluVar6;
                        }
                    } else if (yxqVar instanceof defpackage.yxp) {
                        java.lang.Object obj14 = this.c;
                        this.a = 4;
                        defpackage.toj tojVar3 = (defpackage.toj) obj14;
                        java.lang.Object objG5 = tojVar3.g(new defpackage.tob(tojVar3, (defpackage.yxp) yxqVar, null), this);
                        if (objG5 != aoluVar6) {
                            objG5 = aojh.a;
                        }
                        if (objG5 == aoluVar6) {
                            return aoluVar6;
                        }
                    }
                    return aojh.a;
                }
                throw new aois();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aolu aoluVar7 = aolu.a;
                int i8 = this.a;
                aooc.af(obj);
                if (i8 != 0) {
                    if (i8 == 1) {
                        objL = obj;
                    } else if (i8 == 2) {
                        objD2 = obj;
                        java.lang.Object obj15 = this.b;
                        defpackage.trt trtVar = (defpackage.trt) objD2;
                        akzx akzxVarM = aivw.a.m();
                        aooh.f(akzxVarM, "builder");
                        aooh.f(trtVar, "value");
                        akzxVarM.u();
                        aivw aivwVar = akzxVarM.b;
                        aivwVar.c = trtVar.a();
                        aivwVar.b |= 1;
                        aivw aivwVarP = akzxVarM.p();
                        aooh.e(aivwVarP, "build(...)");
                        long creationTimeMillis = ((android.telecom.Call.Details) this.c).getCreationTimeMillis();
                        this.a = 3;
                        defpackage.tlx tlxVar = ((defpackage.toj) obj15).h;
                        objAj = aoov.aj(tlxVar.b, new nrk(tlxVar, creationTimeMillis, aivwVarP, (aoln) null, 2), this);
                        if (objAj != aoluVar7) {
                            objAj = aojh.a;
                        }
                        if (objAj == aoluVar7) {
                            return aoluVar7;
                        }
                    }
                    return aojh.a;
                }
                java.lang.Object obj16 = this.b;
                this.a = 1;
                objL = ((defpackage.toj) obj16).l(this);
                if (objL == aoluVar7) {
                    return aoluVar7;
                }
                ajcq ajcqVarBv = ((defpackage.tnp) objL).bv();
                this.a = 2;
                objD2 = aosv.D(ajcqVarBv, this);
                if (objD2 == aoluVar7) {
                    return aoluVar7;
                }
                java.lang.Object obj17 = this.b;
                defpackage.trt trtVar2 = (defpackage.trt) objD2;
                akzx akzxVarM2 = aivw.a.m();
                aooh.f(akzxVarM2, "builder");
                aooh.f(trtVar2, "value");
                akzxVarM2.u();
                aivw aivwVar2 = akzxVarM2.b;
                aivwVar2.c = trtVar2.a();
                aivwVar2.b |= 1;
                aivw aivwVarP2 = akzxVarM2.p();
                aooh.e(aivwVarP2, "build(...)");
                long creationTimeMillis2 = ((android.telecom.Call.Details) this.c).getCreationTimeMillis();
                this.a = 3;
                defpackage.tlx tlxVar2 = ((defpackage.toj) obj17).h;
                objAj = aoov.aj(tlxVar2.b, new nrk(tlxVar2, creationTimeMillis2, aivwVarP2, (aoln) null, 2), this);
                if (objAj != aoluVar7) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar7) {
                    return aoluVar7;
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aolu aoluVar8 = aolu.a;
                try {
                    if (this.a != 0) {
                        aooc.af(obj);
                        objI = obj;
                    } else {
                        aooc.af(obj);
                        ?? r0 = this.b;
                        if (android.text.TextUtils.isEmpty(r0)) {
                            return java.lang.Boolean.FALSE;
                        }
                        ojo ojoVar = ((defpackage.tqd) this.c).b;
                        android.net.Uri uriBuild = android.provider.CallLog.Calls.CONTENT_FILTER_URI.buildUpon().appendQueryParameter("limit", "1").appendEncodedPath((java.lang.String) r0).build();
                        aooh.e(uriBuild, "build(...)");
                        defpackage.sqs sqsVar = defpackage.sqs.f;
                        this.a = 1;
                        int i9 = ojo.f;
                        objI = ojoVar.i(uriBuild, new java.lang.String[]{"_id"}, "((type = 1 OR type = 2) AND duration > 0)", (java.lang.String[]) null, (java.lang.String) null, sqsVar, this);
                        if (objI == aoluVar8) {
                            return aoluVar8;
                        }
                    }
                    return java.lang.Boolean.valueOf(!((aify) objI).isEmpty());
                } catch (java.lang.RuntimeException e) {
                    defpackage.tqd.a.d().k(e).l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerCallPreconditionDataProvider", "isPreviouslyConnectedCallNumber$<anonymous>", 160, "SharpieDialerCallPreconditionDataProvider.kt").v("isPreviouslyConnectedCallNumber failed");
                    throw e;
                } catch (aguh e2) {
                    defpackage.tqd.a.b().k(e2).l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerCallPreconditionDataProvider", "isPreviouslyConnectedCallNumber$<anonymous>", 149, "SharpieDialerCallPreconditionDataProvider.kt").v("Not previously connected call: cursor is null");
                    return java.lang.Boolean.FALSE;
                } catch (defpackage.aguk e3) {
                    defpackage.tqd.a.b().k(e3).l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerCallPreconditionDataProvider", "isPreviouslyConnectedCallNumber$<anonymous>", 157, "SharpieDialerCallPreconditionDataProvider.kt").v("Not previously connected call: NoMatchingProviderException");
                    return java.lang.Boolean.FALSE;
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aolu aoluVar9 = aolu.a;
                int i10 = this.a;
                aooc.af(obj);
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                        }
                        tsg.h(((tsg) this.c).o, ajcm.a);
                        return aojh.a;
                    }
                    java.lang.Object obj18 = this.c;
                    this.a = 3;
                    tsj tsjVar = ((tsg) obj18).d;
                    objA = ahvr.ag(tsjVar.e, tsjVar.k, new defpackage.tlv(tsjVar, (aoln) null, 7, (byte[]) null)).a(this);
                    if (objA != aoluVar9) {
                        objA = aojh.a;
                    }
                    if (objA == aoluVar9) {
                        return aoluVar9;
                    }
                    tsg.h(((tsg) this.c).o, ajcm.a);
                    return aojh.a;
                }
                java.lang.Object obj19 = this.c;
                this.a = 1;
                tsj tsjVar2 = ((tsg) obj19).d;
                java.lang.Object objA4 = ahvr.ag(tsjVar2.e, tsjVar2.k, new defpackage.tlv(tsjVar2, (aoln) null, 6)).a(this);
                if (objA4 != aoluVar9) {
                    objA4 = aojh.a;
                }
                if (objA4 == aoluVar9) {
                    return aoluVar9;
                }
                j$.time.Duration duration = (j$.time.Duration) this.b;
                long j = aorh.j(aooh.B(duration.getSeconds(), aorj.d), aooh.A(duration.getNano(), aorj.a));
                this.a = 2;
                if (aosv.k(j, this) == aoluVar9) {
                    return aoluVar9;
                }
                java.lang.Object obj110 = this.c;
                this.a = 3;
                tsj tsjVar3 = ((tsg) obj110).d;
                objA = ahvr.ag(tsjVar3.e, tsjVar3.k, new defpackage.tlv(tsjVar3, (aoln) null, 7, (byte[]) null)).a(this);
                if (objA != aoluVar9) {
                    objA = aojh.a;
                }
                if (objA == aoluVar9) {
                    return aoluVar9;
                }
                tsg.h(((tsg) this.c).o, ajcm.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aolu aoluVar10 = aolu.a;
                int i11 = this.a;
                aooc.af(obj);
                if (i11 == 0) {
                    aosy aosyVar = ((tsg) this.c).g;
                    if (aosyVar != null) {
                        this.a = 1;
                        objA2 = aosyVar.a(this);
                        if (objA2 == aoluVar10) {
                            return aoluVar10;
                        }
                    }
                    return aojh.a;
                }
                objA2 = obj;
                defpackage.txk txkVar = (defpackage.txk) objA2;
                if (txkVar != null) {
                    txkVar.a((akff) this.b);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aolu aoluVar11 = aolu.a;
                int i12 = this.a;
                aooc.af(obj);
                if (i12 == 0) {
                    aimw aimwVarL = tsg.a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsDataService", "setAndLogSharpieEnrollment$<anonymous>", 162, "SharpieSettingsDataService.kt");
                    java.lang.Object obj20 = this.c;
                    aimwVarL.y("Attempting to log consent audit record for enrollment status: %s", obj20);
                    java.lang.Object obj21 = this.b;
                    boolean zB = defpackage.trv.a.b((defpackage.trt) obj20);
                    this.a = 1;
                    if (((tsg) obj21).c(zB, this) == aoluVar11) {
                        return aoluVar11;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aolu aoluVar12 = aolu.a;
                int i13 = this.a;
                aooc.af(obj);
                if (i13 == 0) {
                    java.lang.Object obj22 = this.b;
                    java.lang.Object obj23 = this.c;
                    this.a = 1;
                    objAx = ((tsg) obj22).q.ax((defpackage.trt) obj23, this);
                    if (objAx == aoluVar12) {
                        return aoluVar12;
                    }
                    return objAx;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aolu aoluVar13 = aolu.a;
                int i14 = this.a;
                aooc.af(obj);
                if (i14 != 0) {
                    objG2 = obj;
                } else {
                    ?? r2 = this.b;
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r2, 10));
                    java.util.Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(defpackage.abxl.M((j$.time.Instant) it.next()));
                    }
                    java.lang.Object obj24 = this.c;
                    this.a = 1;
                    objG2 = ((tts) obj24).c.g(arrayList, this);
                    if (objG2 == aoluVar13) {
                        return aoluVar13;
                    }
                }
                if (((java.lang.Boolean) objG2).booleanValue()) {
                    tts.a.b().l("com/android/dialer/sharpie/impl/storage/SharpieDataStore", "delete$<anonymous>", 60, "SharpieDataStore.kt").v("Deleted Sharpie data");
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aolu aoluVar14 = aolu.a;
                int i15 = this.a;
                aooc.af(obj);
                if (i15 == 0) {
                    java.lang.Object obj25 = this.b;
                    int iOrdinal = ((defpackage.tth) this.c).ordinal();
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal == 7) {
                                i = 3;
                            } else {
                                i = 0;
                            }
                        } else if (((defpackage.tuy) obj25).c != defpackage.tth.SCAM_DETECTED) {
                            i = 0;
                        }
                    } else if (((defpackage.tuy) obj25).c == defpackage.tth.SCAM_DETECTED) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        defpackage.tuw tuwVar = ((defpackage.tuy) obj25).b;
                        akzx akzxVarM3 = defpackage.zla.a.m();
                        aooh.f(akzxVarM3, "builder");
                        akzxVarM3.u();
                        defpackage.zla zlaVar = (defpackage.zla) akzxVarM3.b;
                        zlaVar.c = a.Q(i);
                        zlaVar.b |= 1;
                        alad aladVarP = akzxVarM3.p();
                        aooh.e(aladVarP, "build(...)");
                        this.a = 1;
                        objA3 = tuwVar.a((defpackage.zla) aladVarP, this);
                        if (objA3 == aoluVar14) {
                            return aoluVar14;
                        }
                    }
                    ((defpackage.tuy) this.b).c = (defpackage.tth) this.c;
                    return aojh.a;
                }
                objA3 = obj;
                ((defpackage.tuy) this.b).c = (defpackage.tth) this.c;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aolu aoluVar15 = aolu.a;
                int i16 = this.a;
                aooc.af(obj);
                if (i16 != 0) {
                    if (i16 != 1) {
                        objI2 = obj;
                    } else {
                        objAu = obj;
                    }
                    return (defpackage.tvz) objI2;
                }
                java.lang.Object obj26 = this.c;
                aguv aguvVarA = aguz.a(twl.class);
                twp twpVar = (twp) obj26;
                java.lang.Object objA5 = twpVar.d.a();
                aooh.e(objA5, "get(...)");
                aguvVarA.d(new aguw(new agux(((java.lang.Number) objA5).longValue(), java.util.concurrent.TimeUnit.HOURS), ahwt.a));
                java.lang.Object objA6 = twpVar.e.a();
                aooh.e(objA6, "get(...)");
                aguvVarA.c(new agux(((java.lang.Number) objA6).longValue(), java.util.concurrent.TimeUnit.HOURS));
                aguvVarA.f(new aguy("com.android.dialer.sodatranscription.impl.PersistedLanguagePackInfoRefreshWorker", 2));
                agsm.i(897, ((zjx) twpVar.h.a()).b(aguvVarA.a()), "failed to enqueue worker", new java.lang.Object[0]);
                aoxh aoxhVarB = twpVar.c.b();
                this.a = 1;
                objAu = aoov.au(aoxhVarB, this);
                if (objAu == aoluVar15) {
                    return aoluVar15;
                }
                akff akffVar = (akff) this.b;
                objAx = (defpackage.tvz) j$.util.DesugarCollections.unmodifiableMap(((twk) objAu).b).get(defpackage.agmc.af(akffVar));
                if (objAx == null) {
                    java.lang.Object obj27 = this.c;
                    this.a = 2;
                    objI2 = ((twp) obj27).i(akffVar, this);
                    if (objI2 == aoluVar15) {
                        return aoluVar15;
                    }
                    return (defpackage.tvz) objI2;
                }
                return objAx;
            case 15:
                aolu aoluVar16 = aolu.a;
                int i17 = this.a;
                aooc.af(obj);
                if (i17 == 0) {
                    java.lang.Object obj28 = this.c;
                    java.lang.Object obj29 = this.b;
                    this.a = 1;
                    objAx = ((twp) obj28).h((akff) obj29, this);
                    if (objAx == aoluVar16) {
                        return aoluVar16;
                    }
                    return objAx;
                }
                break;
            case 16:
                aolu aoluVar17 = aolu.a;
                int i18 = this.a;
                aooc.af(obj);
                if (i18 == 0) {
                    java.lang.Object obj30 = this.c;
                    java.lang.Object obj31 = this.b;
                    this.a = 1;
                    objAx = ((twp) obj30).i((akff) obj31, this);
                    if (objAx == aoluVar17) {
                        return aoluVar17;
                    }
                    return objAx;
                }
                break;
            case 17:
                aolu aoluVar18 = aolu.a;
                int i19 = this.a;
                aooc.af(obj);
                if (i19 != 0) {
                    objH = obj;
                } else {
                    java.lang.Object obj32 = this.c;
                    java.lang.Object obj33 = this.b;
                    this.a = 1;
                    objH = ((twp) obj32).h((akff) obj33, this);
                    if (objH == aoluVar18) {
                        return aoluVar18;
                    }
                }
                defpackage.tvz tvzVar = (defpackage.tvz) objH;
                defpackage.tvy tvyVarB = defpackage.tvy.b(tvzVar.c);
                if (tvyVarB == null) {
                    tvyVarB = defpackage.tvy.UNKNOWN;
                }
                if (tvyVarB != defpackage.tvy.ON_DEVICE || (tvzVar.b & 2) == 0) {
                    return java.lang.Boolean.FALSE;
                }
                java.lang.String strAf = defpackage.agmc.af((akff) this.b);
                aooh.f(strAf, "languageCode");
                if (android.os.Build.BRAND.equals("google")) {
                    if (twq.a.contains(ttj.h())) {
                        num = (java.lang.Integer) twq.b.get(strAf);
                    } else if (twq.c.contains(ttj.h())) {
                        num = (java.lang.Integer) twq.d.get(strAf);
                    } else if (twq.e.contains(ttj.h())) {
                        num = (java.lang.Integer) twq.f.get(strAf);
                    }
                }
                if (num != null && tvzVar.d >= num.intValue()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 18:
                aolu aoluVar19 = aolu.a;
                int i20 = this.a;
                aooc.af(obj);
                if (i20 == 0) {
                    java.lang.Object obj34 = this.c;
                    java.lang.Object obj35 = this.b;
                    this.a = 1;
                    objAx = ((defpackage.twu) obj34).a((java.io.File) obj35, false, this);
                    if (objAx == aoluVar19) {
                        return aoluVar19;
                    }
                    return objAx;
                }
                break;
            case 19:
                aolu aoluVar20 = aolu.a;
                int i21 = this.a;
                aooc.af(obj);
                if (i21 == 0) {
                    java.lang.Object obj36 = this.c;
                    java.lang.Object obj37 = this.b;
                    this.a = 1;
                    objAx = ((defpackage.twu) obj36).a((java.io.File) obj37, true, this);
                    if (objAx == aoluVar20) {
                        return aoluVar20;
                    }
                    return objAx;
                }
                break;
            default:
                aolu aoluVar21 = aolu.a;
                int i22 = this.a;
                aooc.af(obj);
                if (i22 == 0) {
                    java.lang.Object obj38 = this.c;
                    java.lang.Object obj39 = this.b;
                    this.a = 1;
                    defpackage.twu twuVar = (defpackage.twu) obj38;
                    objAx = aoov.aj(twuVar.c, new defpackage.tkz(twuVar, (java.io.File) obj39, (aoln) null, 19, (byte[]) null), this);
                    if (objAx == aoluVar21) {
                        return aoluVar21;
                    }
                    return objAx;
                }
                break;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, java.util.Set] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.tkz((oqi) this.c, (defpackage.tla) this.b, aolnVar, 0);
            case 1:
                return new defpackage.tkz((defpackage.thj) this.c, (java.lang.String) this.b, aolnVar, 1);
            case 2:
                return new defpackage.tkz((defpackage.tmj) this.c, (alcf) this.b, aolnVar, 2);
            case 3:
                return new defpackage.tkz((defpackage.tmj) this.c, (alcf) this.b, aolnVar, 3, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.tkz((defpackage.toj) this.c, (aazc) this.b, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.tkz((defpackage.toj) this.c, (java.lang.String) this.b, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.tkz((defpackage.toj) this.b, (android.telecom.Call.Details) this.c, aolnVar, 6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new defpackage.tkz((java.lang.String) this.b, (defpackage.tqd) this.c, aolnVar, 7);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new defpackage.tkz((tsg) this.c, (j$.time.Duration) this.b, aolnVar, 8);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.tkz((tsg) this.c, (akff) this.b, aolnVar, 9);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new defpackage.tkz((defpackage.trt) this.c, (tsg) this.b, aolnVar, 10);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new defpackage.tkz((tsg) this.b, (defpackage.trt) this.c, aolnVar, 11);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new defpackage.tkz((java.util.Set) this.b, (tts) this.c, aolnVar, 12);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new defpackage.tkz((defpackage.tuy) this.b, (defpackage.tth) this.c, aolnVar, 13);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new defpackage.tkz((twp) this.c, (akff) this.b, aolnVar, 14);
            case 15:
                return new defpackage.tkz((twp) this.c, (akff) this.b, aolnVar, 15, (byte[]) null);
            case 16:
                return new defpackage.tkz((twp) this.c, (akff) this.b, aolnVar, 16, (char[]) null);
            case 17:
                return new defpackage.tkz((twp) this.c, (akff) this.b, aolnVar, 17, (short[]) null);
            case 18:
                return new defpackage.tkz((defpackage.twu) this.c, (java.io.File) this.b, aolnVar, 18);
            case 19:
                return new defpackage.tkz((defpackage.twu) this.c, (java.io.File) this.b, aolnVar, 19, (byte[]) null);
            default:
                return new defpackage.tkz((defpackage.twu) this.c, (java.io.File) this.b, aolnVar, 20, (char[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(java.util.Set set, tts ttsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = set;
        this.c = ttsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(oqi oqiVar, defpackage.tla tlaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = oqiVar;
        this.b = tlaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.thj thjVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = thjVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.tmj tmjVar, alcf alcfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = tmjVar;
        this.b = alcfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.tmj tmjVar, alcf alcfVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = tmjVar;
        this.b = alcfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.toj tojVar, aazc aazcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = tojVar;
        this.b = aazcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.toj tojVar, android.telecom.Call.Details details, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tojVar;
        this.c = details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.toj tojVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = tojVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.trt trtVar, tsg tsgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = trtVar;
        this.b = tsgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(tsg tsgVar, akff akffVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = tsgVar;
        this.b = akffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(tsg tsgVar, j$.time.Duration duration, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = tsgVar;
        this.b = duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(tsg tsgVar, defpackage.trt trtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tsgVar;
        this.c = trtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.tuy tuyVar, defpackage.tth tthVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tuyVar;
        this.c = tthVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(twp twpVar, akff akffVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = twpVar;
        this.b = akffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(twp twpVar, akff akffVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = twpVar;
        this.b = akffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(twp twpVar, akff akffVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = twpVar;
        this.b = akffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(twp twpVar, akff akffVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = twpVar;
        this.b = akffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.twu twuVar, java.io.File file, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = twuVar;
        this.b = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.twu twuVar, java.io.File file, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = twuVar;
        this.b = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(defpackage.twu twuVar, java.io.File file, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = twuVar;
        this.b = file;
    }
}
