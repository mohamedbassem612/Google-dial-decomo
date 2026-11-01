package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbb implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ tbb(defpackage.vgs vgsVar, int i) {
        this.$cid = i;
        this.c = vgsVar;
        this.a = "/private/vendor/vendor.alu/messaging/GreetingType";
        this.b = "Personal";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r15v111, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v125, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v139, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v63, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v68, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v72, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v77, types: [java.io.IOException, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v85, types: [java.io.IOException, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v135, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        defpackage.uhu uhuVar;
        int i;
        ?? r11 = 0;
        z = false;
        boolean z = false;
        int i2 = 0;
        r11 = 0;
        switch (this.$cid) {
            case 0:
                boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
                java.lang.Object obj = this.c;
                defpackage.tbe tbeVar = defpackage.tbe.RING_PHONE;
                if (obj == tbeVar && zBooleanValue) {
                    return defpackage.tbe.SILENTLY_DECLINE;
                }
                return zBooleanValue2 ? tbeVar : obj;
            case 1:
                swt swtVar = (swt) this.a;
                oko okoVar = swtVar.o;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.c;
                java.lang.String str = (java.lang.String) okoVar.i(phoneAccountHandle).v().orElse((java.lang.Object) null);
                java.lang.String strA = rlt.a(swtVar.b, phoneAccountHandle);
                aimz aimzVar = swt.a;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isSamePrefixCall", 411, "TidepodsRevelioGatekeeper.java");
                java.lang.String str2 = (java.lang.String) this.b;
                aimwVarL.M("callerNumber: %s, userNumber: %s, countryIso: %s", aais.aC(str2), aais.aC(str), aais.aD(strA));
                defpackage.akfx akfxVarAI = swtVar.v.aI();
                defpackage.akgu akguVar = (defpackage.akgu) swt.c(akfxVarAI, str, strA).orElse((java.lang.Object) null);
                if (akguVar == null) {
                    aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isSamePrefixCall", 422, "TidepodsRevelioGatekeeper.java").v("User number not available");
                    return java.lang.Boolean.FALSE;
                }
                defpackage.akgu akguVar2 = (defpackage.akgu) swt.c(akfxVarAI, str2, strA).orElse((java.lang.Object) null);
                if (akguVar2 == null) {
                    aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isSamePrefixCall", 430, "TidepodsRevelioGatekeeper.java").v("Caller number not available");
                    return java.lang.Boolean.FALSE;
                }
                if (akguVar2.c != akguVar.c) {
                    aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isSamePrefixCall", 435, "TidepodsRevelioGatekeeper.java").v("country codes don't match");
                    return java.lang.Boolean.FALSE;
                }
                java.lang.String string = java.lang.Long.toString(akguVar2.d);
                java.lang.String string2 = java.lang.Long.toString(akguVar.d);
                ahvr.ci(string);
                ahvr.ci(string2);
                int iMin = java.lang.Math.min(string.length(), string2.length());
                int i3 = 0;
                while (i3 < iMin && string.charAt(i3) == string2.charAt(i3)) {
                    i3++;
                }
                int i4 = i3 - 1;
                if (ahvr.bL(string, i4) || ahvr.bL(string2, i4)) {
                    i3 = i4;
                }
                int length = string.subSequence(0, i3).toString().length();
                aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isSamePrefixCall", 445, "TidepodsRevelioGatekeeper.java").M("callerNationalNumber: %s, userNationalNumber: %s, commonPrefixLength: %d", aais.aC(string), aais.aC(string2), java.lang.Integer.valueOf(length));
                return java.lang.Boolean.valueOf((boolean) (((length > ((java.lang.Long) swtVar.e.a()).longValue() ? 1 : (length == ((java.lang.Long) swtVar.e.a()).longValue() ? 0 : -1)) ^ (-1)) >>> 31));
            case 2:
                tcp tcpVar = (tcp) aiql.H((java.util.concurrent.Future) this.a);
                boolean zBooleanValue3 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
                defpackage.tda tdaVar = (defpackage.tda) this.c;
                tdaVar.a = zBooleanValue3;
                if (!tcpVar.equals(tcp.d)) {
                    return aikn.a;
                }
                miv mivVar = miv.d;
                miy miyVar = miy.d;
                return aihd.r(mni.aG(mivVar, miyVar, tdaVar.a), mni.aG(miv.e, miyVar, false));
            case 3:
                aify aifyVarAr = snl.ar((aify) aiql.H((java.util.concurrent.Future) this.a), (aify) aiql.H((java.util.concurrent.Future) this.b), ((defpackage.tia) this.c).g.b());
                defpackage.ambr ambrVar = new defpackage.ambr();
                ambrVar.g(aifyVarAr);
                ambrVar.h();
                return ambrVar.f();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                udy.a.b().l("com/android/dialer/spam/composite/CompositeSpam", "storePatronusCheckSkipReasonCatchingAll", 846, "CompositeSpam.java").v("storing skipped patronus check");
                akzx akzxVarM = defpackage.ucu.a.m();
                long creationTimeMillis = ((android.telecom.Call.Details) this.c).getCreationTimeMillis();
                akzxVarM.u();
                defpackage.ucu ucuVar = (defpackage.ucu) akzxVarM.b;
                ucuVar.b |= 1;
                ucuVar.c = creationTimeMillis;
                akzxVarM.u();
                defpackage.ucu ucuVar2 = (defpackage.ucu) akzxVarM.b;
                ucuVar2.m = ((aiyg) this.b).c;
                ucuVar2.b |= 2048;
                ((udy) this.a).p.b(java.lang.String.valueOf(ucuVar2.c), (defpackage.ucu) akzxVarM.p());
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                wsc wscVar = (wsc) aiql.H((java.util.concurrent.Future) this.a);
                uip uipVar = (uip) aiql.H((java.util.concurrent.Future) this.b);
                if (wscVar instanceof defpackage.uia) {
                    udy.a.b().l("com/android/dialer/spam/composite/CompositeSpam", "checkSpamStatus", 283, "CompositeSpam.java").v("Skipping cross-app overlap metrics due to fetch error.");
                    return null;
                }
                ?? r1 = uipVar != null && uipVar.j() == udj.c;
                if ((wscVar instanceof defpackage.uid) && ((uhuVar = ((defpackage.uid) wscVar).a) == defpackage.uhu.b || uhuVar == defpackage.uhu.a)) {
                    r11 = 1;
                }
                java.lang.Object obj2 = this.c;
                if (r1 == true) {
                    ((udy) obj2).h.o(r11 != 0 ? rmx.AL : rmx.AN);
                    return null;
                }
                if (r11 == 0) {
                    return null;
                }
                ((udy) obj2).h.o(rmx.AM);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                rsr rsrVar = new rsr();
                kaw kawVar = new kaw("created");
                java.lang.Object obj3 = this.b;
                rsrVar.aC(kawVar.aI(">", java.lang.Long.valueOf(((j$.time.Instant) obj3).toEpochMilli())));
                kaw kawVar2 = new kaw("spam_status");
                udj udjVar = (udj) this.c;
                int iOrdinal = udjVar.ordinal();
                if (iOrdinal == 0) {
                    i = 3;
                } else if (iOrdinal == 1) {
                    i = 0;
                } else if (iOrdinal == 2) {
                    i = 1;
                } else if (iOrdinal != 4) {
                    uex.a.d().m(aioa.b).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "convertToDatabaseSpamStatus", 947, "SpamDatabaseUtils.java").y("Classification Spam status does not match spam list status from DB: %s", udjVar.name());
                    i = -1;
                } else {
                    i = 2;
                }
                java.lang.Object obj4 = this.a;
                rsrVar.aC(kawVar2.aI("=", i));
                rsr rsrVarAB = rsrVar.aB();
                android.database.Cursor cursorF = ((uex) obj4).b.f("client_spam_table", (java.lang.String[]) null, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a);
                if (cursorF != null) {
                    try {
                        if (cursorF.moveToFirst()) {
                            int columnIndexOrThrow = cursorF.getColumnIndexOrThrow("client_meta_data");
                            do {
                                defpackage.uei ueiVar = defpackage.uei.a;
                                try {
                                    if (cursorF.getBlob(columnIndexOrThrow) != null) {
                                        ueiVar = (defpackage.uei) alad.B(ueiVar, cursorF.getBlob(columnIndexOrThrow), akzq.a());
                                    }
                                } catch (alaz e) {
                                    uex.a.d().k(e).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getUserReportCountSince", 816, "SpamDatabaseUtils.java").v("Invalid ClientMetaData protobuf.");
                                }
                                alcf alcfVar = ueiVar.e;
                                if (alcfVar == null) {
                                    alcfVar = alcf.a;
                                }
                                if (aldi.b(alcfVar) > ((j$.time.Instant) obj3).toEpochMilli()) {
                                    i2++;
                                }
                            } while (cursorF.moveToNext());
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                            cursorF.close();
                            return numValueOf;
                        }
                    } catch (java.lang.Throwable th) {
                        if (cursorF != null) {
                            try {
                                cursorF.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                }
                if (cursorF != null) {
                    cursorF.close();
                }
                return 0;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                boolean zBooleanValue4 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                boolean zBooleanValue5 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
                defpackage.uhp uhpVar = (defpackage.uhp) this.c;
                return java.lang.Boolean.valueOf(!((java.lang.Boolean) uhpVar.b.a()).booleanValue() || !zBooleanValue5 || zBooleanValue4 || ((zjm) uhpVar.j).g().isPresent());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                gus.aJ();
                java.lang.Object obj5 = this.b;
                defpackage.adrp adrpVarA = defpackage.upo.a();
                defpackage.upt uptVar = (defpackage.upt) obj5;
                java.lang.Long lValueOf = (uptVar.b & 1) != 0 ? java.lang.Long.valueOf(uptVar.c) : null;
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.c;
                adrpVarA.b = lValueOf;
                adrpVarA.n(uptVar.f);
                adrpVarA.o(uptVar.g);
                adrpVarA.d = obj6;
                new upp((android.content.Context) obj7).d(aify.p(adrpVarA.m()));
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                akzx akzxVarM2 = defpackage.utr.a.m();
                boolean zBooleanValue6 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue();
                akzxVarM2.u();
                defpackage.utr utrVar = (defpackage.utr) akzxVarM2.b;
                utrVar.b |= 8;
                utrVar.e = zBooleanValue6;
                j$.util.Optional optional = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a);
                if (optional.isPresent()) {
                    defpackage.uty utyVar = (defpackage.uty) optional.orElseThrow();
                    akzxVarM2.u();
                    defpackage.utr utrVar2 = (defpackage.utr) akzxVarM2.b;
                    utrVar2.c = utyVar.a();
                    utrVar2.b |= 1;
                }
                boolean zBooleanValue7 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
                akzxVarM2.u();
                defpackage.utr utrVar3 = (defpackage.utr) akzxVarM2.b;
                utrVar3.b |= 4;
                utrVar3.d = zBooleanValue7;
                return (defpackage.utr) akzxVarM2.p();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream((aify) aiql.H((java.util.concurrent.Future) this.a)).filter(new defpackage.ree(this.c, 14)).findFirst();
                if (true == optionalFindFirst.isPresent()) {
                    optionalFindFirst = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((vzi) optionalFindFirst.get()).h == 0));
                }
                if (((java.lang.Boolean) optionalFindFirst.orElse(java.lang.Boolean.FALSE)).booleanValue() && ((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b)).isPresent()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Boolean.valueOf((((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue() && ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue() && !((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) ? false : true);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                java.lang.Object obj10 = this.c;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar = (defpackage.vgs) obj10;
                java.lang.String strN = vgsVar.n(18);
                try {
                    boolean zD = new defpackage.yzr(((defpackage.vgs) obj10).f).d(aigf.k(obj8, new defpackage.vik(new defpackage.vhf(((akzc) obj9).h(), ((akzc) obj9).c()))));
                    ((defpackage.vgs) obj10).k(strN, jElapsedRealtime);
                    ((defpackage.vgs) obj10).h.a(zct.a).f(mgv.dh, aify.p(gus.aw("N/A")), gus.ax(zD));
                    return java.lang.Boolean.valueOf(zD);
                } catch (java.io.IOException | defpackage.vgv e2) {
                    aimw aimwVarK = defpackage.vgs.a.c().i(zct.b).k((java.lang.Throwable) e2);
                    ainp ainpVar = zct.a;
                    aimwVarK.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "setMetadata", 1343, "ImapOperations.java").y("Failed setMetadata %s", obj8);
                    vgsVar.h.a(ainpVar).f(mgv.dh, aify.p(gus.aw(e2.toString())), gus.ax(false));
                    return java.lang.Boolean.FALSE;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.c;
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar2 = (defpackage.vgs) obj13;
                java.lang.String strN2 = vgsVar2.n(18);
                try {
                    boolean zD2 = new defpackage.yzr(((defpackage.vgs) obj13).f).d(aigf.k(obj11, new defpackage.vio((java.lang.String) obj12)));
                    ((defpackage.vgs) obj13).k(strN2, jElapsedRealtime2);
                    ((defpackage.vgs) obj13).h.a(zct.a).f(mgv.dh, aify.p(gus.aw("N/A")), gus.ax(zD2));
                    return java.lang.Boolean.valueOf(zD2);
                } catch (java.io.IOException | defpackage.vgv e3) {
                    aimw aimwVarK2 = defpackage.vgs.a.c().i(zct.b).k((java.lang.Throwable) e3);
                    ainp ainpVar2 = zct.a;
                    aimwVarK2.i(ainpVar2).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "setMetadata", 1303, "ImapOperations.java").y("Failed setMetadata %s", obj11);
                    vgsVar2.h.a(ainpVar2).f(mgv.dh, aify.p(gus.aw(e3.toString())), gus.ax(false));
                    return java.lang.Boolean.FALSE;
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.vgi vgiVar = (defpackage.vgi) this.a;
                int iA = vgiVar.a();
                aimz aimzVar2 = vix.a;
                aimzVar2.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequest", 186, "VvmNetworkRequestImpl.java").w("Adding network capability from ImapConfig: %d", iA);
                android.net.NetworkRequest.Builder builderAddCapability = new android.net.NetworkRequest.Builder().addCapability(iA);
                vix vixVar = (vix) this.b;
                ?? r2 = ((java.lang.Boolean) vixVar.h.a()).booleanValue() && (iA == 0 || iA == 5);
                java.lang.Object obj14 = this.c;
                if (vgiVar.d() || r2 == true) {
                    aimzVar2.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequest", 194, "VvmNetworkRequestImpl.java").y("Transport type: CELLULAR for %s", obj14);
                    builderAddCapability.addTransportType(0).setNetworkSpecifier((java.lang.String) ((oko) vixVar.f.D((android.telecom.PhoneAccountHandle) obj14).orElseThrow(new defpackage.vjq(1))).y().orElse((java.lang.Object) null));
                    if (vgiVar.e() || r2 != false) {
                        aimzVar2.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequest", 204, "VvmNetworkRequestImpl.java").y("allow nonDDS or MMS/CBS for %s", obj14);
                        builderAddCapability.removeCapability(13);
                    }
                } else {
                    aimzVar2.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequest", 210, "VvmNetworkRequestImpl.java").y("Transport type: ANY for %s", obj14);
                }
                android.net.NetworkRequest networkRequestBuild = builderAddCapability.build();
                aimzVar2.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequest", 213, "VvmNetworkRequestImpl.java").y("Built network request: %s", networkRequestBuild);
                return networkRequestBuild;
            case 15:
                vix vixVar2 = (vix) this.b;
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) vixVar2.b.getSystemService(android.net.ConnectivityManager.class);
                android.net.ConnectivityManager.NetworkCallback networkCallback = vixVar2.i;
                if (networkCallback == null) {
                    vixVar2.i = new defpackage.vit(vixVar2.j, (dsd) this.a);
                    vix.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createOrGetNetworkCallback", 168, "VvmNetworkRequestImpl.java").v("network callback has been created");
                    networkCallback = vixVar2.i;
                }
                rs$.ExternalSyntheticApiModelOutline0.m(connectivityManager, (android.net.NetworkRequest) this.c, networkCallback, 60000);
                return null;
            case 16:
                java.lang.Object obj15 = this.c;
                aooh.f(obj15, "context");
                java.lang.Object obj16 = this.a;
                aooh.f(obj16, "phoneAccountHandle");
                gat gatVar = (gat) this.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj16;
                if (!gatVar.y((android.content.Context) obj15, phoneAccountHandle2)) {
                    return defpackage.vrr.c;
                }
                aooh.f(obj15, "context");
                aooh.f(obj16, "phoneAccountHandle");
                return (zjm.s((zjm) gatVar.e, phoneAccountHandle2).isPresent() && new jyn(((vth) gatVar.b).b, phoneAccountHandle2).k("donate_voicemails")) ? defpackage.vrr.a : defpackage.vrr.b;
            case 17:
                if (((j$.util.Optional) this.b).isPresent()) {
                    return java.lang.Boolean.valueOf(((defpackage.vqt) this.a).b((android.telecom.PhoneAccountHandle) this.c).isPresent());
                }
                throw null;
            case 18:
                boolean zBooleanValue8 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                java.lang.Object obj17 = this.c;
                ?? r15 = this.b;
                if (zBooleanValue8 && !((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r15)).booleanValue()) {
                    vvl.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "evaluateTosEligibility", 534, "VoicemailFullscreenPromoDataServiceImpl.java").y("showing TOS for Google transcription users for %s", ((vzi) obj17).f);
                    return java.lang.Boolean.TRUE;
                }
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r15)).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                vvl.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "evaluateTosEligibility", 540, "VoicemailFullscreenPromoDataServiceImpl.java").y("showing generic TOS for %s", ((vzi) obj17).f);
                return java.lang.Boolean.TRUE;
            case 19:
                boolean zBooleanValue9 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                java.lang.Object obj18 = this.c;
                if (zBooleanValue9) {
                    vvl.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "evaluatePromoEligibility", 572, "VoicemailFullscreenPromoDataServiceImpl.java").y("already acknowledged latest features for %s", ((vzi) obj18).f);
                    return java.lang.Boolean.FALSE;
                }
                if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                vvl.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "evaluatePromoEligibility", 578, "VoicemailFullscreenPromoDataServiceImpl.java").y("showing promo for Google transcription users for %s", ((vzi) obj18).f);
                return java.lang.Boolean.TRUE;
            default:
                aift aiftVar = new aift(4);
                aiftVar.i(new dxy("xatu_enrollment_status", ((defpackage.wpu) aiql.H((java.util.concurrent.Future) this.c)).name()));
                aiftVar.i(new dxy("xatu_show_ahead_enrollment_status", ((defpackage.wpw) aiql.H((java.util.concurrent.Future) this.a)).name()));
                aiftVar.i(new dxy("xatu_automatic_display_enrollment_status", ((defpackage.wpt) aiql.H((java.util.concurrent.Future) this.b)).name()));
                return aiftVar.h();
        }
    }

    public /* synthetic */ tbb(java.lang.Object obj, ajcq ajcqVar, ajcq ajcqVar2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = ajcqVar;
        this.b = ajcqVar2;
    }

    public /* synthetic */ tbb(java.lang.Object obj, java.lang.Object obj2, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = phoneAccountHandle;
    }

    public /* synthetic */ tbb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ tbb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ tbb(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ tbb(android.content.Context context, defpackage.upt uptVar, defpackage.upl uplVar, int i) {
        this.$cid = i;
        this.c = context;
        this.b = uptVar;
        this.a = uplVar;
    }

    public /* synthetic */ tbb(defpackage.vgs vgsVar, akzc akzcVar, int i) {
        this.$cid = i;
        this.c = vgsVar;
        this.b = "/private/vendor/vendor.alu/messaging/Greetings/Personal";
        this.a = akzcVar;
    }
}
