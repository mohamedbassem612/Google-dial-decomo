package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sue implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ sue(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object, vcg] */
    /* JADX WARN: Type inference failed for: r0v58, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, vcc] */
    /* JADX WARN: Type inference failed for: r3v11, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, sug] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarH;
        int i = 10;
        int i2 = 8;
        int i3 = 13;
        int i4 = 7;
        int i5 = 18;
        int i6 = 6;
        int i7 = 5;
        int i8 = 19;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = (j$.util.Optional) obj;
                java.lang.Iterable iterableBf = ahvr.bf((java.lang.Iterable) this.b, 999);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = iterableBf.iterator();
                while (true) {
                    java.lang.Object obj2 = this.a;
                    if (!it.hasNext()) {
                        return ahvr.aj(arrayList).o(new raj(arrayList, 19), ((suf) obj2).c);
                    }
                    suf sufVar = (suf) obj2;
                    arrayList.add(ahvr.F(new joq(sufVar, (java.util.List) it.next(), (java.util.Set) this.c, optional, 8), sufVar.b));
                }
                break;
            case 1:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(aike.a);
                }
                ?? r1 = this.c;
                ?? r2 = this.b;
                suf sufVar2 = (suf) this.a;
                zjs zjsVar = sufVar2.e;
                return ahvr.I(aosv.F(zjsVar.b, 0, new defpackage.tyf(zjsVar, (aoln) null, 19, (short[]) null), 3), new defpackage.sue(sufVar2, (java.util.Set) r2, (java.util.Set) r1, 0), sufVar2.c);
            case 2:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    suh.a.b().l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "migrateIccIdToSubId", 117, "PreferredSimDatabaseHelper.java").v("migration already completed");
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                ?? r5 = this.b;
                java.lang.Object obj4 = this.c;
                suh.a.b().l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "migrateIccIdToSubId", 121, "PreferredSimDatabaseHelper.java").v("migrating ICC ID to sub ID");
                return ahrv.g(r5.fF().eT(new defpackage.rqy(obj4, obj3, i7))).i(new defpackage.srq(r5, i7), r5.fF()).h(new defpackage.rht(i3), r5.fH());
            case 3:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                final swt swtVar = (swt) this.b;
                if (!swtVar.k.a()) {
                    swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 170, "TidepodsRevelioGatekeeper.java").v("tidepods revelio is not enabled");
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                if (zBooleanValue) {
                    swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 176, "TidepodsRevelioGatekeeper.java").v("there's already an active call");
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                j$.util.Optional optionalG = swtVar.t.g();
                if (!optionalG.isPresent()) {
                    swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 182, "TidepodsRevelioGatekeeper.java").v("TidepodsRevelioGatekeeper should not be used when Call Screen is unavailable");
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                final ?? r3 = this.c;
                java.lang.Object obj5 = this.a;
                ahrv ahrvVarG = ahrv.g(((tkl) optionalG.orElseThrow()).p());
                tbq tbqVar = swtVar.l;
                j$.util.Objects.requireNonNull(tbqVar);
                defpackage.srq srqVar = new defpackage.srq(tbqVar, i6);
                ajct ajctVar = swtVar.f;
                final android.telecom.Call.Details details = (android.telecom.Call.Details) obj5;
                return ahrvVarG.i(srqVar, ajctVar).i(new ajat() { // from class: swr
                    public final ajcq a(java.lang.Object obj6) {
                        j$.util.Optional optionalEmpty;
                        j$.util.Optional optionalEmpty2;
                        j$.util.Optional optionalEmpty3;
                        int iIntValue;
                        if (!((j$.util.Optional) obj6).isPresent()) {
                            swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 192, "TidepodsRevelioGatekeeper.java").v("revelio audio messages are not ready");
                            return aiql.z(java.lang.Boolean.FALSE);
                        }
                        swt swtVar2 = swtVar;
                        boolean zA = swtVar2.j.a();
                        if (!zA) {
                            if (swt.a()) {
                                swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 201, "TidepodsRevelioGatekeeper.java").v("revelio does not work with bluetooth connected on devices that don't support audio processing");
                                swtVar2.i.o(rmx.ed);
                                return aiql.z(java.lang.Boolean.FALSE);
                            }
                            if (swtVar2.b()) {
                                swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 214, "TidepodsRevelioGatekeeper.java").v("revelio does not work with headsets connected on devices that don't support audio processing");
                                swtVar2.i.o(rmx.ee);
                                return aiql.z(java.lang.Boolean.FALSE);
                            }
                        }
                        oko okoVar = swtVar2.o;
                        if (okoVar.aa()) {
                            swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 224, "TidepodsRevelioGatekeeper.java").v("revelio is disabled while roaming");
                            return aiql.z(java.lang.Boolean.FALSE);
                        }
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                            optionalEmpty2 = j$.util.Optional.empty();
                        } else {
                            java.util.Iterator it2 = swtVar2.n.s().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    optionalEmpty = j$.util.Optional.empty();
                                    break;
                                }
                                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) it2.next();
                                oko okoVarI = okoVar.i(phoneAccountHandle);
                                if (android.os.Build.VERSION.SDK_INT >= 31) {
                                    try {
                                        java.lang.Object objF = new mgr(okoVarI.h(), j$.util.Optional.of(java.lang.Integer.valueOf(rk$.ExternalSyntheticApiModelOutline0.m(okoVarI.j)))).a(mgv.bT).f(new mig(14));
                                        aooh.c(objF);
                                        optionalEmpty3 = (j$.util.Optional) objF;
                                    } catch (java.lang.SecurityException e) {
                                        oko.a.d().k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetCallStateForSubscription", 1528, "DialerTelephony.kt").v("TelephonyManager.getCallStateForSubscription called without permission.");
                                        optionalEmpty3 = j$.util.Optional.empty();
                                        aooh.c(optionalEmpty3);
                                    }
                                    iIntValue = ((java.lang.Integer) optionalEmpty3.orElseThrow(new defpackage.rqc(3))).intValue();
                                } else {
                                    iIntValue = ((java.lang.Integer) okoVarI.r().orElseThrow(new defpackage.rqc(3))).intValue();
                                }
                                if (iIntValue != 0) {
                                    optionalEmpty = j$.util.Optional.of(phoneAccountHandle);
                                    break;
                                }
                            }
                            android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) optionalEmpty.orElse((java.lang.Object) null);
                            if (phoneAccountHandle2 == null) {
                                optionalEmpty2 = j$.util.Optional.empty();
                            } else {
                                j$.util.Optional optionalA = swtVar2.q.a(swtVar2.p.b(phoneAccountHandle2));
                                if (true == optionalA.isPresent()) {
                                    optionalA = j$.util.Optional.ofNullable(((android.os.PersistableBundle) optionalA.get()).getString("android.telephony.CarrierConfigManager.KEY_SIM_COUNTRY_ISO_OVERRIDE_STRING"));
                                }
                                java.lang.String str = (java.lang.String) optionalA.orElse("");
                                optionalEmpty2 = ahvr.cp(str) ? j$.util.Optional.empty() : j$.util.Optional.of(str);
                            }
                        }
                        oko okoVar2 = swtVar2.o;
                        if (!((java.lang.String) optionalEmpty2.orElse((java.lang.String) okoVar2.z().orElseThrow(new defpackage.rqc(3)))).equals(okoVar2.x().orElse((java.lang.Object) null))) {
                            swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 229, "TidepodsRevelioGatekeeper.java").v("revelio is disabled while device network is international");
                            return aiql.z(java.lang.Boolean.FALSE);
                        }
                        if (!((java.lang.Boolean) swtVar2.c.a()).booleanValue() && swt.a() && zA) {
                            swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 238, "TidepodsRevelioGatekeeper.java").v("revelio on bluetooth is disabled via flag");
                            swtVar2.i.o(rmx.dZ);
                            return aiql.z(java.lang.Boolean.FALSE);
                        }
                        if (!((java.lang.Boolean) swtVar2.d.a()).booleanValue() && swtVar2.b() && zA) {
                            swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "shouldRunRevelio", 250, "TidepodsRevelioGatekeeper.java").v("revelio on headsets is disabled via flag");
                            swtVar2.i.o(rmx.eb);
                            return aiql.z(java.lang.Boolean.FALSE);
                        }
                        ajcq ajcqVar = r3;
                        android.telecom.Call.Details details2 = details;
                        ahrv ahrvVarG2 = ahrv.g(swtVar2.u.e());
                        defpackage.sue sueVar = new defpackage.sue(swtVar2, details2, ajcqVar, 4);
                        ajct ajctVar2 = swtVar2.f;
                        return ahvr.H(ahrvVarG2.i(sueVar, ajctVar2), new defpackage.soi(swtVar2, 8), ajctVar2);
                    }
                }, ajctVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                tbf tbfVar = (tbf) obj;
                aimz aimzVar = swt.a;
                aimw aimwVarL = aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "checkShouldRunRevelioInSettings", 285, "TidepodsRevelioGatekeeper.java");
                defpackage.tbe tbeVarB = defpackage.tbe.b(tbfVar.e);
                if (tbeVarB == null) {
                    tbeVarB = defpackage.tbe.NOT_SET_BY_USER;
                }
                java.lang.String strName = tbeVarB.name();
                defpackage.tbe tbeVarB2 = defpackage.tbe.b(tbfVar.f);
                if (tbeVarB2 == null) {
                    tbeVarB2 = defpackage.tbe.NOT_SET_BY_USER;
                }
                java.lang.String strName2 = tbeVarB2.name();
                defpackage.tbe tbeVarB3 = defpackage.tbe.b(tbfVar.g);
                if (tbeVarB3 == null) {
                    tbeVarB3 = defpackage.tbe.NOT_SET_BY_USER;
                }
                java.lang.String strName3 = tbeVarB3.name();
                defpackage.tbe tbeVarB4 = defpackage.tbe.b(tbfVar.h);
                if (tbeVarB4 == null) {
                    tbeVarB4 = defpackage.tbe.NOT_SET_BY_USER;
                }
                java.lang.Object obj6 = this.a;
                aimwVarL.N("Spam: %s, Possibly faked numbers: %s, First time callers: %s, Private or hidden: %s", strName, strName2, strName3, tbeVarB4.name());
                android.telecom.Call.Details details2 = (android.telecom.Call.Details) obj6;
                java.lang.String strB = defpackage.ura.b(details2);
                int handlePresentation = details2.getHandlePresentation();
                if (android.text.TextUtils.isEmpty(strB) || handlePresentation == 2 || handlePresentation == 3 || handlePresentation == 4) {
                    aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "checkShouldRunRevelioInSettings", 303, "TidepodsRevelioGatekeeper.java").v("Caller number is unavailable");
                    defpackage.tbe tbeVarB5 = defpackage.tbe.b(tbfVar.h);
                    if (tbeVarB5 == null) {
                        tbeVarB5 = defpackage.tbe.NOT_SET_BY_USER;
                    }
                    return tbeVarB5 == defpackage.tbe.AUTOMATICALLY_SCREEN ? aiql.z(java.lang.Boolean.TRUE) : aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.b;
                qat qatVar = new qat(obj8, strB, 10, (byte[]) null);
                swt swtVar2 = (swt) obj8;
                ajct ajctVar2 = swtVar2.f;
                ajcq ajcqVarG = ahvr.G(qatVar, ajctVar2);
                ajcq ajcqVarEU = swtVar2.g.eU(ahqx.i(new defpackage.tbb(obj8, details2.getAccountHandle(), strB, 1, (byte[]) null)));
                return ahvr.ak(new ajcq[]{obj7, ajcqVarG, ajcqVarEU}).o(new joq(obj7, ajcqVarG, ajcqVarEU, tbfVar, 9, (byte[]) null), ajctVar2);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((java.lang.Boolean) obj).booleanValue() ? aiql.z(j$.util.Optional.of(new defpackage.syh(0))) : ahvr.H(this.c.d(), new defpackage.soi(this.a, 12), (java.util.concurrent.Executor) this.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((udy) this.a).o.a((java.lang.String) this.c, (java.lang.String) obj, (defpackage.uhu) this.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((val) this.c).b((android.telecom.PhoneAccountHandle) this.a, (defpackage.vaj) this.b);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                java.lang.Object obj11 = this.c;
                val valVar = (val) obj11;
                zzx zzxVar = valVar.o;
                j$.util.Objects.requireNonNull(zzxVar);
                return ahvr.I(ahvr.F(new defpackage.tvg(zzxVar, i8), valVar.f), new defpackage.sue(obj11, obj10, obj9, 9, (byte[]) null), valVar.e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.a;
                java.lang.Object obj14 = this.c;
                if (zBooleanValue2) {
                    return ((val) obj14).b((android.telecom.PhoneAccountHandle) obj13, (defpackage.vaj) obj12);
                }
                val valVar2 = (val) obj14;
                zjm zjmVar = valVar2.n;
                return ahvr.I(((afhf) zjmVar.a).a(new defpackage.van(obj13, 6), (java.util.concurrent.Executor) zjmVar.b), new defpackage.sue(obj14, obj13, obj12, 7, (byte[]) null), valVar2.e);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue3 = bool.booleanValue();
                java.lang.Object obj15 = this.a;
                java.lang.Object obj16 = this.c;
                val valVar3 = (val) obj16;
                ajcq ajcqVarA = valVar3.d.a(j$.util.Optional.of(obj15));
                defpackage.uwl uwlVar = new defpackage.uwl(obj16, obj15, 6, null);
                ajct ajctVar3 = valVar3.f;
                ajcq ajcqVarH2 = ahvr.H(ahvr.F(uwlVar, ajctVar3), new vak(2), ajctVar3);
                ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarA, ajcqVarH2});
                java.lang.Object obj17 = this.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj15;
                kxy kxyVar = new kxy(obj16, ajcqVarA, ajcqVarH2, obj17, phoneAccountHandle, 5);
                ajct ajctVar4 = valVar3.e;
                ajcq ajcqVarO = ahdaVarAk.o(kxyVar, ajctVar4);
                defpackage.vaj vajVar = (defpackage.vaj) obj17;
                if ((vajVar.b & 1) != 0) {
                    java.lang.String str = vajVar.d;
                    ajcq ajcqVarF = ahvr.F(new defpackage.uwl(obj16, obj15, 5, null), ajctVar3);
                    ajcq ajcqVarH3 = ahvr.H(ahvr.F(new defpackage.tvg(obj16, i5), ajctVar3), new defpackage.tzs(obj16, str, 16, bArr), ajctVar4);
                    ajcq ajcqVarO2 = ahvr.ak(new ajcq[]{ajcqVarF, ajcqVarH3}).o(new nyn(ajcqVarH3, ajcqVarF, zBooleanValue3, 5), ajctVar4);
                    ajcqVarH = ahvr.ak(new ajcq[]{ajcqVarO, ajcqVarO2}).o(new joq(obj16, ajcqVarO, ajcqVarO2, obj15, 12, (byte[]) null), ajctVar4);
                } else {
                    ajcqVarH = ahvr.H(ajcqVarO, new defpackage.tzs(obj16, obj15, 15), ajctVar4);
                }
                ajcq ajcqVar = ajcqVarH;
                return ahrv.g(ajcqVar).i(new uhj(obj16, obj17, 12, (byte[]) null), ajctVar4).i(new jsc(valVar3, phoneAccountHandle, bool, ajcqVar, 7), ajctVar4);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.TRUE);
                }
                java.lang.Object obj18 = this.b;
                java.lang.Object obj19 = this.a;
                val valVar4 = (val) this.c;
                vze vzeVar = valVar4.l;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj19;
                ajcq ajcqVarG2 = valVar4.m.g(phoneAccountHandle2);
                ajcq ajcqVarB = vzeVar.b(phoneAccountHandle2);
                return ahvr.ak(new ajcq[]{ajcqVarG2, ajcqVarB}).p(new uej(valVar4, ajcqVarG2, ajcqVarB, (defpackage.vaj) obj18, phoneAccountHandle2, 2), valVar4.e);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                akzx akzxVarM = defpackage.vaj.a.m();
                akzxVarM.u();
                defpackage.vaj vajVar2 = (defpackage.vaj) akzxVarM.b;
                vajVar2.b |= 2;
                vajVar2.f = true;
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.ubv ubvVar = new defpackage.ubv(akzxVarM, i5);
                j$.util.Optional optional3 = (j$.util.Optional) this.c;
                if (true == optional3.isPresent()) {
                    java.lang.Object obj20 = optional3.get();
                    java.lang.Object obj21 = ubvVar.a;
                    int iIntValue = ((java.lang.Integer) obj20).intValue();
                    akzx akzxVar = (akzx) obj21;
                    akzxVar.u();
                    ((defpackage.vaj) akzxVar.b).c = iIntValue;
                }
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.ubv ubvVar2 = new defpackage.ubv(akzxVarM, i8);
                if (true == optional2.isPresent()) {
                    java.lang.String str2 = (java.lang.String) optional2.get();
                    akzx akzxVar2 = (akzx) ubvVar2.a;
                    akzxVar2.u();
                    defpackage.vaj vajVar3 = (defpackage.vaj) akzxVar2.b;
                    j$.util.Objects.requireNonNull(str2);
                    vajVar3.b |= 1;
                    vajVar3.d = str2;
                }
                return ((val) this.b).c((android.telecom.PhoneAccountHandle) this.a, (defpackage.vaj) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((vav) this.b).l.a(4, (java.lang.String) ((j$.util.Optional) obj).orElse((java.lang.Object) null), ((aify) this.c).size(), (dva) this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((vdo) this.c).h((android.net.Uri) this.a, (defpackage.vdn) this.b);
            case 15:
                defpackage.amsi amsiVar = (defpackage.amsi) obj;
                defpackage.vck vckVar = (defpackage.vck) this.b;
                defpackage.vce vceVar = vckVar.e;
                if (vceVar == null) {
                    vceVar = defpackage.vce.a;
                }
                return ((vea) this.c).l((android.telecom.PhoneAccountHandle) this.a, vceVar, vckVar.f, 2, amsiVar);
            case 16:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj22 = this.a;
                ?? r4 = this.b;
                java.lang.Object obj23 = this.c;
                ahrv ahrvVarG2 = ahrv.g(r4.a((android.telecom.PhoneAccountHandle) obj22));
                defpackage.vcu vcuVar = new defpackage.vcu(obj23, obj22, i3);
                ajct ajctVar5 = ((vea) obj23).d;
                return ahrvVarG2.i(vcuVar, ajctVar5).i(new defpackage.qgk(i2), ajctVar5);
            case 17:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj24 = this.b;
                java.lang.Object obj25 = this.a;
                java.lang.Object obj26 = this.c;
                vea veaVar = (vea) obj26;
                ahrv ahrvVarG3 = ahrv.g(veaVar.e.k());
                defpackage.vcu vcuVar2 = new defpackage.vcu(obj26, obj25, i2);
                ajct ajctVar6 = veaVar.d;
                return ahrv.g(ahrvVarG3.i(vcuVar2, ajctVar6)).i(new defpackage.sue(obj26, obj25, obj24, 18, (byte[]) null), ajctVar6);
            case 18:
                boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj27 = this.a;
                java.lang.Object obj28 = this.c;
                if (!zBooleanValue4) {
                    return ahrv.g(this.b.l((android.telecom.PhoneAccountHandle) obj27)).i(new defpackage.qgk(i4), ((vea) obj28).d);
                }
                vea veaVar2 = (vea) obj28;
                return ahrv.g(veaVar2.e((android.telecom.PhoneAccountHandle) obj27)).i(new defpackage.qgk(i), veaVar2.d);
            case 19:
                akzx akzxVarM2 = defpackage.vbz.a.m();
                akzxVarM2.u();
                defpackage.vbz vbzVar = (defpackage.vbz) akzxVarM2.b;
                java.lang.Object obj29 = this.b;
                j$.util.Objects.requireNonNull(obj29);
                vbzVar.c = (defpackage.vcn) obj29;
                vbzVar.b |= 1;
                defpackage.vbz vbzVar2 = (defpackage.vbz) akzxVarM2.p();
                akzx akzxVarM3 = defpackage.vce.a.m();
                akzxVarM3.u();
                defpackage.vce vceVar2 = (defpackage.vce) akzxVarM3.b;
                j$.util.Objects.requireNonNull(vbzVar2);
                vceVar2.c = vbzVar2;
                vceVar2.b = 7;
                defpackage.vce vceVar3 = (defpackage.vce) akzxVarM3.p();
                vee veeVar = (vee) this.c;
                boolean zBooleanValue5 = ((java.lang.Boolean) veeVar.f.a()).booleanValue();
                java.lang.Object obj30 = this.a;
                return zBooleanValue5 ? veeVar.e((android.telecom.PhoneAccountHandle) obj30, vceVar3) : veeVar.f((android.telecom.PhoneAccountHandle) obj30, vceVar3);
            default:
                boolean zBooleanValue6 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj31 = this.b;
                java.lang.Object obj32 = this.a;
                java.lang.Object obj33 = this.c;
                if (!zBooleanValue6) {
                    vee.a.b().l("com/android/dialer/voicemail/service/impl/scheduler/VvmServiceSchedulerImpl", "executeActionOrScheduleActivation", 372, "VvmServiceSchedulerImpl.java").y("VVM must be activated before executing the action: %s. Scheduling an activation", defpackage.vcd.a(((defpackage.vce) obj31).b).name());
                    vee veeVar2 = (vee) obj33;
                    return ahvr.H(veeVar2.g((android.telecom.PhoneAccountHandle) obj32), new vak(16), veeVar2.e);
                }
                vea veaVar3 = ((vee) obj33).g;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) obj32;
                if (veaVar3.i.c(phoneAccountHandle3) != 2 || ((defpackage.vce) obj31).b == 2) {
                    return veaVar3.l(phoneAccountHandle3, (defpackage.vce) obj31, 0, 3, defpackage.amsi.a);
                }
                akzx akzxVarM4 = vcr.a.m();
                vcq vcqVar = vcq.a;
                akzxVarM4.u();
                vcr vcrVar = akzxVarM4.b;
                j$.util.Objects.requireNonNull(vcqVar);
                vcrVar.c = vcqVar;
                vcrVar.b = 1;
                return aiql.z(akzxVarM4.p());
        }
    }

    public /* synthetic */ sue(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ sue(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ sue(suf sufVar, java.util.Set set, java.util.Set set2, int i) {
        this.$cid = i;
        this.a = sufVar;
        this.b = set;
        this.c = set2;
    }

    public /* synthetic */ sue(swt swtVar, android.telecom.Call.Details details, ajcq ajcqVar, int i) {
        this.$cid = i;
        this.b = swtVar;
        this.a = details;
        this.c = ajcqVar;
    }

    public /* synthetic */ sue(udy udyVar, java.lang.String str, defpackage.uhu uhuVar, int i) {
        this.$cid = i;
        this.a = udyVar;
        this.c = str;
        this.b = uhuVar;
    }
}
