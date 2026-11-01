package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgn extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(defpackage.abtr abtrVar, defpackage.uku ukuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abtrVar;
        this.c = ukuVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x014e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0164  */
    /* JADX WARN: Code duplicated, block: B:48:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x0174  */
    /* JADX WARN: Code duplicated, block: B:52:0x0179  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final java.lang.Object d(ahdl ahdlVar, defpackage.ahcp ahcpVar, defpackage.ajxi ajxiVar, aoxi aoxiVar, j$.time.Duration duration, boolean z, aoln aolnVar) {
        defpackage.ahdh ahdhVar;
        defpackage.ajxi ajxiVar2;
        ahdl ahdlVar2;
        boolean z2;
        defpackage.ahcp ahcpVar2;
        ?? r5;
        j$.time.Duration duration2;
        defpackage.ahck ahckVarA;
        java.lang.Object objA;
        java.lang.String str;
        defpackage.ahcp ahcpVar3;
        ahdl ahdlVar3;
        ?? r6;
        defpackage.ajxi ajxiVar3;
        ?? r7;
        boolean z3;
        j$.time.Duration durationA;
        if (aolnVar instanceof defpackage.ahdh) {
            ahdhVar = (defpackage.ahdh) aolnVar;
            int i = ahdhVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahdhVar.e = i - Integer.MIN_VALUE;
            } else {
                ahdhVar = new defpackage.ahdh(aolnVar);
            }
        } else {
            ahdhVar = new defpackage.ahdh(aolnVar);
        }
        java.lang.Object obj = ahdhVar.d;
        aolu aoluVar = aolu.a;
        int i2 = ahdhVar.e;
        boolean z4 = true;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        z2 = ahdhVar.c;
                        ahckVarA = (defpackage.ahck) ahdhVar.b;
                        java.lang.Object obj2 = ahdhVar.a;
                        defpackage.ajxi ajxiVar4 = ahdhVar.h;
                        defpackage.ahcp ahcpVar4 = ahdhVar.g;
                        ahdl ahdlVar4 = ahdhVar.f;
                        aooc.af(obj);
                        ajxiVar2 = ajxiVar4;
                        ahcpVar3 = ahcpVar4;
                        ahdlVar3 = ahdlVar4;
                        r6 = obj2;
                        ahdhVar.f = ahdlVar3;
                        ahdhVar.g = ahcpVar3;
                        ahdhVar.h = ajxiVar2;
                        ahdhVar.a = r6;
                        ahdhVar.b = ahckVarA;
                        ahdhVar.c = z2;
                        ahdhVar.e = 4;
                        if (r6.a(ahckVarA, ahdhVar) == aoluVar) {
                            return aoluVar;
                        }
                        ajxiVar3 = ajxiVar2;
                        r7 = r6;
                    } else if (i2 == 4) {
                        z2 = ahdhVar.c;
                        ahckVarA = (defpackage.ahck) ahdhVar.b;
                        java.lang.Object obj3 = ahdhVar.a;
                        ajxiVar3 = ahdhVar.h;
                        ahcpVar3 = ahdhVar.g;
                        ahdlVar3 = ahdhVar.f;
                        aooc.af(obj);
                        z4 = true;
                        r7 = obj3;
                    } else if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = false;
                    if (((defpackage.ahcl) ahckVarA).a.a && z2) {
                        z3 = z4;
                    }
                    if (z3) {
                        aimz aimzVar = ahdl.a;
                        durationA = ahdl.b;
                    } else {
                        aimz aimzVar2 = ahdl.a;
                        durationA = ahdlVar3.a();
                    }
                    ahdhVar.f = null;
                    ahdhVar.g = null;
                    ahdhVar.h = null;
                    ahdhVar.a = null;
                    ahdhVar.b = null;
                    ahdhVar.e = 5;
                    if (d(ahdlVar3, ahcpVar3, ajxiVar3, r7, durationA, !z3, ahdhVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                aooc.af(obj);
            } else {
                z2 = ahdhVar.c;
                duration2 = (j$.time.Duration) ahdhVar.b;
                java.lang.Object obj4 = ahdhVar.a;
                ajxiVar2 = ahdhVar.h;
                ahcpVar2 = ahdhVar.g;
                ahdlVar2 = ahdhVar.f;
                aooc.af(obj);
                r5 = obj4;
            }
            return aojh.a;
        }
        aooc.af(obj);
        aimz aimzVar3 = ahdl.a;
        aazc aazcVar = ahdlVar.f;
        j$.time.Duration durationPlus = aazc.c().plus(duration);
        aooh.e(durationPlus, "plus(...)");
        ahdhVar.f = ahdlVar;
        ahdhVar.g = ahcpVar;
        ajxiVar2 = ajxiVar;
        ahdhVar.h = ajxiVar2;
        ahdhVar.a = aoxiVar;
        ahdhVar.b = durationPlus;
        ahdhVar.c = z;
        ahdhVar.e = 1;
        if (ahdlVar.b(duration, ahdhVar) == aoluVar) {
            return aoluVar;
        }
        ahdlVar2 = ahdlVar;
        z2 = z;
        ahcpVar2 = ahcpVar;
        r5 = aoxiVar;
        duration2 = durationPlus;
        aimz aimzVar4 = ahdl.a;
        aazc aazcVar2 = ahdlVar2.f;
        ahckVarA = ahcpVar2.a(aazc.c().minus(duration2).abs());
        if (ahckVarA instanceof defpackage.ahcl) {
            java.lang.Object objA2 = ahdlVar2.e.a();
            aooh.e(objA2, "get(...)");
            ahea aheaVar = (ahea) objA2;
            java.lang.String str2 = ahcpVar2.a;
            defpackage.ahdf ahdfVar = ((defpackage.ahcl) ahckVarA).a;
            ahdhVar.f = ahdlVar2;
            ahdhVar.g = ahcpVar2;
            ahdhVar.h = ajxiVar2;
            ahdhVar.a = r5;
            ahdhVar.b = ahckVarA;
            ahdhVar.c = z2;
            ahdhVar.e = 3;
            j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(ahdfVar.c);
            aooh.e(durationOfMillis, "let(...)");
            if (ahdfVar.b) {
                str = "polling_too_important";
            } else {
                if (ahdfVar.a) {
                    str = "polling_exceeded_tolerance";
                } else {
                    ahdl.a.c().l("com/google/apps/tiktok/experiments/phenotype/TimedProcessReaperPoller", "logEvent", 178, "TimedProcessReaperPoller.kt").y("No mapping for invalid skip event %s", ahdfVar);
                    objA = aojh.a;
                }
                if (objA != aoluVar) {
                    return aoluVar;
                }
                ahcpVar3 = ahcpVar2;
                ahdlVar3 = ahdlVar2;
                r6 = r5;
                ahdhVar.f = ahdlVar3;
                ahdhVar.g = ahcpVar3;
                ahdhVar.h = ajxiVar2;
                ahdhVar.a = r6;
                ahdhVar.b = ahckVarA;
                ahdhVar.c = z2;
                ahdhVar.e = 4;
                if (r6.a(ahckVarA, ahdhVar) == aoluVar) {
                    return aoluVar;
                }
                ajxiVar3 = ajxiVar2;
                r7 = r6;
                z3 = false;
                if (((defpackage.ahcl) ahckVarA).a.a) {
                    z3 = z4;
                }
                if (z3) {
                    aimz aimzVar5 = ahdl.a;
                    durationA = ahdl.b;
                } else {
                    aimz aimzVar6 = ahdl.a;
                    durationA = ahdlVar3.a();
                }
                ahdhVar.f = null;
                ahdhVar.g = null;
                ahdhVar.h = null;
                ahdhVar.a = null;
                ahdhVar.b = null;
                ahdhVar.e = 5;
                if (d(ahdlVar3, ahcpVar3, ajxiVar3, r7, durationA, !z3, ahdhVar) == aoluVar) {
                    return aoluVar;
                }
            }
            objA = aheaVar.a(str2, durationOfMillis, str, ahdhVar);
            if (objA != aoluVar) {
                objA = aojh.a;
            }
            if (objA != aoluVar) {
                return aoluVar;
            }
            ahcpVar3 = ahcpVar2;
            ahdlVar3 = ahdlVar2;
            r6 = r5;
            ahdhVar.f = ahdlVar3;
            ahdhVar.g = ahcpVar3;
            ahdhVar.h = ajxiVar2;
            ahdhVar.a = r6;
            ahdhVar.b = ahckVarA;
            ahdhVar.c = z2;
            ahdhVar.e = 4;
            if (r6.a(ahckVarA, ahdhVar) == aoluVar) {
                return aoluVar;
            }
            ajxiVar3 = ajxiVar2;
            r7 = r6;
            z3 = false;
            if (((defpackage.ahcl) ahckVarA).a.a) {
                z3 = z4;
            }
            if (z3) {
                aimz aimzVar7 = ahdl.a;
                durationA = ahdl.b;
            } else {
                aimz aimzVar8 = ahdl.a;
                durationA = ahdlVar3.a();
            }
            ahdhVar.f = null;
            ahdhVar.g = null;
            ahdhVar.h = null;
            ahdhVar.a = null;
            ahdhVar.b = null;
            ahdhVar.e = 5;
            if (d(ahdlVar3, ahcpVar3, ajxiVar3, r7, durationA, !z3, ahdhVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (ajxiVar2 != null) {
                ajxiVar2.a();
            }
            ahdhVar.f = null;
            ahdhVar.g = null;
            ahdhVar.h = null;
            ahdhVar.a = null;
            ahdhVar.b = null;
            ahdhVar.e = 2;
            if (r5.a(ahckVarA, ahdhVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
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
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 15:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 17:
                return c((aows) obj, (aoln) obj2).b(aojh.a);
            case 18:
                return c((defpackage.ahck) obj, (aoln) obj2).b(aojh.a);
            case 19:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoxi) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009e  */
    /* JADX WARN: Code duplicated, block: B:329:0x099e  */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0a44, code lost:
    
        if (d(r0, (defpackage.ahcp) r1, r2, r3, r4, true, r27) != r7) goto L351;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tel] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, tnp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgn.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tel] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, tnp] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.tgn tgnVar;
        switch (this.$cid) {
            case 0:
                defpackage.tgn tgnVar2 = new defpackage.tgn((defpackage.tel) this.b, (defpackage.tei) this.c, aolnVar, 0);
                tgnVar2.d = obj;
                return tgnVar2;
            case 1:
                tgnVar = new defpackage.tgn((defpackage.sxd) this.c, (ajcq) this.b, aolnVar, 1);
                tgnVar.d = obj;
                break;
            case 2:
                tgnVar = new defpackage.tgn((defpackage.toj) this.b, (defpackage.tnp) this.c, aolnVar, 2);
                tgnVar.d = obj;
                break;
            case 3:
                tgnVar = new defpackage.tgn((ajxw) this.b, (defpackage.tsl) this.c, aolnVar, 3);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                tgnVar = new defpackage.tgn((defpackage.abtr) this.b, (defpackage.uku) this.c, aolnVar, 4);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.uoo) this.b, (android.net.Uri) this.c, 5);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.wbt) this.b, (oii) this.c, 6);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                tgnVar = new defpackage.tgn(aolnVar, (mnp) this.c, (defpackage.wcb) this.b, 7);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.wkp) this.b, (defpackage.wgz) this.c, 8);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.wkp) this.b, (defpackage.wgz) this.c, 9, (byte[]) null);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.wkp) this.b, (defpackage.wha) this.c, 10);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.wkp) this.b, (defpackage.wha) this.c, 11, (byte[]) null);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                tgnVar = new defpackage.tgn((defpackage.uyg) this.b, (defpackage.yse) this.c, aolnVar, 12);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.zki) this.c, (defpackage.zlr) this.b, 13);
                tgnVar.d = obj;
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                tgnVar = new defpackage.tgn(aolnVar, (defpackage.zpd) this.c, (defpackage.ulw) this.b, 14);
                tgnVar.d = obj;
                break;
            case 15:
                tgnVar = new defpackage.tgn((akjh) this.b, (defpackage.acjt) this.c, aolnVar, 15);
                tgnVar.d = obj;
                break;
            case 16:
                tgnVar = new defpackage.tgn((akjh) this.b, (defpackage.acjt) this.c, aolnVar, 16, (byte[]) null);
                tgnVar.d = obj;
                break;
            case 17:
                tgnVar = new defpackage.tgn((ahco) this.c, (defpackage.ahcp) this.b, aolnVar, 17);
                tgnVar.d = obj;
                break;
            case 18:
                defpackage.tgn tgnVar3 = new defpackage.tgn((ahco) this.c, (defpackage.ahcp) this.b, aolnVar, 18, (byte[]) null);
                tgnVar3.d = obj;
                return tgnVar3;
            case 19:
                defpackage.tgn tgnVar4 = new defpackage.tgn((ahde) this.b, (defpackage.ahcp) this.c, aolnVar, 19);
                tgnVar4.d = obj;
                return tgnVar4;
            default:
                tgnVar = new defpackage.tgn((ahdl) this.b, (defpackage.ahcp) this.c, aolnVar, 20);
                tgnVar.d = obj;
                break;
        }
        return tgnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(ahco ahcoVar, defpackage.ahcp ahcpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahcoVar;
        this.b = ahcpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(ahco ahcoVar, defpackage.ahcp ahcpVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ahcoVar;
        this.b = ahcpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(ahde ahdeVar, defpackage.ahcp ahcpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ahdeVar;
        this.c = ahcpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(ahdl ahdlVar, defpackage.ahcp ahcpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ahdlVar;
        this.c = ahcpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(ajxw ajxwVar, defpackage.tsl tslVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ajxwVar;
        this.c = tslVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(akjh akjhVar, defpackage.acjt acjtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = akjhVar;
        this.c = acjtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(akjh akjhVar, defpackage.acjt acjtVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = akjhVar;
        this.c = acjtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, mnp mnpVar, defpackage.wcb wcbVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = mnpVar;
        this.b = wcbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.uoo uooVar, android.net.Uri uri, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = uooVar;
        this.c = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.wbt wbtVar, oii oiiVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = wbtVar;
        this.c = oiiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.wkp wkpVar, defpackage.wgz wgzVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = wkpVar;
        this.c = wgzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.wkp wkpVar, defpackage.wgz wgzVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = wkpVar;
        this.c = wgzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.wkp wkpVar, defpackage.wha whaVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = wkpVar;
        this.c = whaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.wkp wkpVar, defpackage.wha whaVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = wkpVar;
        this.c = whaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.zki zkiVar, defpackage.zlr zlrVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = zkiVar;
        this.b = zlrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(aoln aolnVar, defpackage.zpd zpdVar, defpackage.ulw ulwVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = zpdVar;
        this.b = ulwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(defpackage.sxd sxdVar, ajcq ajcqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = sxdVar;
        this.b = ajcqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(defpackage.tel telVar, defpackage.tei teiVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = telVar;
        this.c = teiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(defpackage.toj tojVar, defpackage.tnp tnpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tojVar;
        this.c = tnpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgn(defpackage.uyg uygVar, defpackage.yse yseVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = uygVar;
        this.c = yseVar;
    }
}
