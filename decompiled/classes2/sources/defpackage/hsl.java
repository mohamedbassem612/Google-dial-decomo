package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hsl implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ hsl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v94, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v117, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v74, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        defpackage.llv llvVar;
        int i = 4;
        int i2 = 3;
        z = false;
        boolean z = false;
        j$.util.Optional optionalEmpty = null;
        switch (this.$cid) {
            case 0:
                android.content.Context context = (android.content.Context) this.b;
                boolean zI = abyl.i(context);
                java.lang.Object obj = this.a;
                if (!zI) {
                    a.bI(defpackage.hsm.a.c().m(aioa.b), "markMissedCallsInCallLogAsRead locked", "com/android/dialer/app/calllog/CallLogNotificationsQueryHelper", "markMissedCallsInCallLogAsRead", 'c', "CallLogNotificationsQueryHelper.java", zct.b);
                    return null;
                }
                if (zqz.a(context, "android.permission.CALL_PHONE")) {
                    if (zqz.a(context, "android.permission.WRITE_CALL_LOG")) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("new", (java.lang.Integer) 0);
                        contentValues.put("is_read", (java.lang.Integer) 1);
                        try {
                            ojo ojoVar = ((defpackage.hsm) obj).b;
                            java.lang.Object obj2 = this.c;
                            java.lang.Object obj3 = obj2;
                            if (obj2 == null) {
                                obj3 = android.provider.CallLog.Calls.CONTENT_URI;
                            }
                            ojoVar.q((android.net.Uri) obj3, contentValues, "new = 1 AND type = ?", new java.lang.String[]{"3"});
                        } catch (java.lang.IllegalArgumentException e) {
                            a.bq(defpackage.hsm.a.c(), "Contacts provider update command failed", "com/android/dialer/app/calllog/CallLogNotificationsQueryHelper", "markMissedCallsInCallLogAsRead", (char) 138, "CallLogNotificationsQueryHelper.java", e, zct.b);
                        }
                    } else {
                        a.bI(defpackage.hsm.a.c().m(aioa.b), "markMissedCallsInCallLogAsRead no call log write permission", "com/android/dialer/app/calllog/CallLogNotificationsQueryHelper", "markMissedCallsInCallLogAsRead", 's', "CallLogNotificationsQueryHelper.java", zct.b);
                    }
                    break;
                } else {
                    a.bI(defpackage.hsm.a.c().m(aioa.b), "markMissedCallsInCallLogAsRead no phone permission", "com/android/dialer/app/calllog/CallLogNotificationsQueryHelper", "markMissedCallsInCallLogAsRead", 'k', "CallLogNotificationsQueryHelper.java", zct.b);
                }
                return optionalEmpty;
            case 1:
                return defpackage.gzl.a((android.content.Context) this.b, (java.lang.String) this.c, (java.lang.String) this.a);
            case 2:
                aifo aifoVar = (aifo) this.c;
                java.util.ArrayList arrayList = new java.util.ArrayList(aifoVar.size());
                ailj ailjVarK = aifoVar.k();
                while (ailjVarK.hasNext()) {
                    java.lang.Object obj4 = this.a;
                    java.lang.String str = (java.lang.String) ailjVarK.next();
                    rsr rsrVarAI = new kaw("original_number").aI("=", str);
                    java.lang.String numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(str, (java.lang.String) obj4);
                    if (numberToE164 != null) {
                        rsr rsrVar = new rsr(rsrVarAI);
                        rsrVar.aD(new kaw("e164_number").aI("=", numberToE164));
                        rsrVarAI = rsrVar.aB();
                    }
                    arrayList.add(android.content.ContentProviderOperation.newDelete(fh$.ExternalSyntheticApiModelOutline0.m()).withSelection((java.lang.String) rsrVarAI.b, (java.lang.String[]) rsrVarAI.a).build());
                }
                ((kgl) this.b).i(arrayList);
                return null;
            case 3:
                aifo aifoVar2 = (aifo) this.c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(aifoVar2.size());
                ailj ailjVarK2 = aifoVar2.k();
                while (ailjVarK2.hasNext()) {
                    java.lang.Object obj5 = this.a;
                    java.lang.String str2 = (java.lang.String) ailjVarK2.next();
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("original_number", str2);
                    java.lang.String numberToE165 = android.telephony.PhoneNumberUtils.formatNumberToE164(str2, (java.lang.String) obj5);
                    if (numberToE165 != null) {
                        contentValues2.put("e164_number", numberToE165);
                    }
                    arrayList2.add(android.content.ContentProviderOperation.newInsert(fh$.ExternalSyntheticApiModelOutline0.m()).withValues(contentValues2).build());
                }
                ((kgl) this.b).i(arrayList2);
                return null;
            case 4:
                j$.util.Optional optional = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                aigf aigfVar = (aigf) aiql.H((java.util.concurrent.Future) this.c);
                tcp tcpVar = (tcp) aiql.H((java.util.concurrent.Future) this.a);
                defpackage.kde kdeVarA = defpackage.kdf.a();
                kdeVarA.d(optional);
                kdeVarA.e(tcpVar);
                kdeVarA.f(aigfVar);
                return kdeVarA.a();
            case 5:
                rsr rsrVar2 = new rsr();
                rsrVar2.aC(new kaw("_id").aF((java.util.Collection) this.a));
                rsr rsrVarAB = rsrVar2.aB();
                int iA = ((defpackage.klm) this.c).a.l.a(android.provider.CallLog.Calls.CONTENT_URI, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a);
                kiu kiuVar = (kiu) this.b;
                defpackage.kis kisVar = kiuVar.u;
                if (kisVar == null) {
                    kisVar = defpackage.kis.a;
                }
                if (iA != kisVar.b.size()) {
                    aimw aimwVarL = defpackage.klo.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/calllog/ui/CallLogFragmentPeer$CallLogItemDeleteRequestReceiver", "deleteCallLogItem", 894, "CallLogFragmentPeer.java");
                    defpackage.kis kisVar2 = kiuVar.u;
                    if (kisVar2 == null) {
                        kisVar2 = defpackage.kis.a;
                    }
                    aimwVarL.z("Deleting call log item is unsuccessful. %d of %d rows are deleted.", iA, kisVar2.b.size());
                    return null;
                }
                return optionalEmpty;
            case 6:
                akzx akzxVarM = defpackage.lap.a.m();
                boolean z2 = ((kwy) aiql.H((java.util.concurrent.Future) this.c)).g;
                akzxVarM.u();
                defpackage.lap lapVar = (defpackage.lap) akzxVarM.b;
                lapVar.b |= 1;
                lapVar.c = z2;
                java.lang.Iterable iterable = (java.lang.Iterable) aiql.H((java.util.concurrent.Future) this.a);
                akzxVarM.u();
                defpackage.lap lapVar2 = (defpackage.lap) akzxVarM.b;
                alat alatVar = lapVar2.d;
                if (!alatVar.c()) {
                    lapVar2.d = alad.J(alatVar);
                }
                java.lang.Object obj6 = this.b;
                akyl.i(iterable, lapVar2.d);
                defpackage.lba lbaVar = ((defpackage.kwc) obj6).g.a() ? defpackage.lba.UNRESTRICTED : defpackage.lba.RESTRICTED_CALL_RECORDING_NOT_AVAILABLE;
                akzxVarM.u();
                defpackage.lap lapVar3 = (defpackage.lap) akzxVarM.b;
                lapVar3.e = lbaVar.e;
                lapVar3.b |= 2;
                return (defpackage.lap) akzxVarM.p();
            case 7:
                ?? r1 = this.b;
                akzm akzmVar = defpackage.lil.a;
                if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r1)).booleanValue()) {
                    defpackage.lil.d.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "sodaInfraDownloadStatus", 380, "CallScreenSettingsDataSource.java").v("Google Search app outdated.");
                    return defpackage.lin.NEEDS_UPDATE;
                }
                tvy tvyVarB = tvy.b(((tvz) aiql.H((java.util.concurrent.Future) this.c)).c);
                if (tvyVarB == null) {
                    tvyVarB = tvy.a;
                }
                java.lang.Object obj7 = this.a;
                int iOrdinal = tvyVarB.ordinal();
                if (iOrdinal == 1) {
                    return defpackage.lin.READY;
                }
                if (iOrdinal == 2) {
                    return defpackage.lin.NEEDS_DOWNLOAD;
                }
                if (iOrdinal != 3) {
                    defpackage.lil.d.b().m(aioa.b).l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "sodaInfraDownloadStatus", 395, "CallScreenSettingsDataSource.java").y("SODA error for languageCode: %s.", obj7);
                    return defpackage.lin.ERROR;
                }
                defpackage.lil.d.b().m(aioa.b).l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "sodaInfraDownloadStatus", 391, "CallScreenSettingsDataSource.java").y("SODA model desired but unavailable for languageCode: %s.", obj7);
                return defpackage.lin.MODEL_UNREADY;
            case 8:
                ?? r2 = this.c;
                aimz aimzVar = llz.a;
                j$.util.Optional optional2 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) r2);
                if (!optional2.isPresent()) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optional3 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a);
                if (!optional3.isPresent()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj8 = this.b;
                defpackage.llu lluVar = (defpackage.llu) optional3.orElseThrow();
                defpackage.lhr lhrVar = (defpackage.lhr) obj8;
                if (lhrVar.a().isPresent()) {
                    java.lang.String str3 = (java.lang.String) lhrVar.a().orElseThrow();
                    defpackage.llv llvVar2 = lluVar.c;
                    if (llvVar2 == null) {
                        llvVar2 = defpackage.llv.a;
                    }
                    if (str3.equals(llvVar2.b)) {
                        llz.a.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "extractVoicePack", 265, "TtsRepository.java").y("user configured voice (%s) matches the default voice", str3);
                        llvVar = lluVar.c;
                        if (llvVar == null) {
                            llvVar = defpackage.llv.a;
                        }
                    } else {
                        for (defpackage.llv llvVar3 : lluVar.d) {
                            if (((java.lang.String) lhrVar.a().orElseThrow()).equals(llvVar3.b)) {
                                llz.a.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "extractVoicePack", 271, "TtsRepository.java").y("user configured voice (%s) matches additional voice", str3);
                                llvVar = llvVar3;
                            }
                        }
                        llz.a.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "extractVoicePack", 276, "TtsRepository.java").y("unable to find user configured voice (%s) in pack, using default", str3);
                        llvVar = lluVar.c;
                        if (llvVar == null) {
                            llvVar = defpackage.llv.a;
                        }
                    }
                } else {
                    llz.a.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "extractVoicePack", 258, "TtsRepository.java").v("no user setting, using default voice");
                    llvVar = lluVar.c;
                    if (llvVar == null) {
                        llvVar = defpackage.llv.a;
                    }
                }
                pgi pgiVar = new pgi(llvVar, (acui) optional2.orElseThrow());
                llz.a.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "voicePackInterpreter", 131, "TtsRepository.java").y("returning interpreter for voice %s", pgiVar.A());
                return j$.util.Optional.of(pgiVar);
            case 9:
                ?? r3 = this.c;
                aimz aimzVar2 = llz.a;
                j$.util.Optional optional4 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) r3);
                if (!optional4.isPresent()) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optional5 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a);
                if (!optional5.isPresent()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj9 = this.b;
                llz.a.b().l("com/android/dialer/callscreen/impl/tts/client/TtsRepository", "languagePackInterpreter", 173, "TtsRepository.java").y("returning interpreter for language %s", ((defpackage.llu) optional5.orElseThrow()).b);
                return j$.util.Optional.of(new defpackage.llx((defpackage.llu) optional5.orElseThrow(), (acui) optional4.orElseThrow(), (defpackage.lhr) obj9));
            case 10:
                ?? r4 = this.a;
                defpackage.mjm mjmVar = (defpackage.mjm) this.b;
                java.util.List listB = mjmVar.b(r4);
                ?? r0 = this.c;
                int size = r0.size();
                for (int i3 = 0; i3 < size; i3++) {
                    mjmVar.e.L((java.lang.Iterable) aiql.H((ajcq) r0.get(i3)));
                }
                mjmVar.e.L(listB);
                return null;
            case 11:
                java.lang.Object obj10 = this.a;
                j$.util.Optional optionalA = ((pzn) this.c).a();
                defpackage.ida idaVar = new defpackage.ida(new defpackage.npi(obj10, 10), i2);
                if (true == optionalA.isPresent()) {
                    if (true != a.w((aonj) idaVar.a, optionalA.get())) {
                        optionalA = j$.util.Optional.empty();
                    }
                }
                defpackage.ida idaVar2 = new defpackage.ida(new defpackage.npi(this.b, 11), i);
                if (true != optionalA.isPresent()) {
                    optionalEmpty = optionalA;
                } else if (true != a.w((aonj) idaVar2.a, optionalA.get())) {
                    optionalEmpty = j$.util.Optional.empty();
                } else {
                    optionalEmpty = optionalA;
                }
                defpackage.nzu nzuVar = new defpackage.nzu(new defpackage.mws(12), 6);
                if (true == optionalEmpty.isPresent()) {
                    return j$.util.Optional.ofNullable(nzuVar.a.a(optionalEmpty.get()));
                }
                return optionalEmpty;
            case 12:
                boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue();
                java.lang.Object obj11 = this.b;
                if (zBooleanValue && !defpackage.ony.c(((defpackage.ony) ((defpackage.jiv) obj11).d).b)) {
                    return java.lang.Boolean.TRUE;
                }
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue() && ((java.lang.Boolean) ((defpackage.jiv) obj11).a.a()).booleanValue()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                j$.util.Optional optional6 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.c);
                j$.util.Optional optional7 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a);
                ots otsVar = (ots) this.b;
                otsVar.b.a(optional6, optional7);
                otsVar.d.a(qbc.hh);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aimw aimwVarL2 = qmt.a.b().l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier", "startForegroundNotification", 721, "StatusBarNotifier.java");
                java.lang.Object obj12 = this.b;
                aimwVarL2.y("notification updated: %s", obj12);
                java.lang.Object obj13 = this.a;
                qmt qmtVar = (qmt) obj13;
                j$.util.Optional optional8 = qmtVar.q;
                qmp qmpVar = new qmp(obj13, 4);
                if (true == optional8.isPresent()) {
                    java.lang.Object obj14 = optional8.get();
                    java.lang.Object obj15 = qmpVar.a;
                    qjd qjdVar = (qjd) obj14;
                    if (qmt.j(qjdVar)) {
                        j$.util.Optional optional9 = ((qmt) obj15).p;
                        qgz qgzVar = new qgz(obj15, qjdVar, 7, (byte[]) null);
                        if (true == optional9.isPresent()) {
                            java.lang.Object obj16 = optional9.get();
                            java.lang.Object obj17 = qgzVar.a;
                            java.lang.Object obj18 = qgzVar.b;
                            qjd qjdVar2 = (qjd) obj16;
                            if (!qmt.j(qjdVar2) || !qjdVar2.b.equals(((qjd) obj18).b)) {
                                ((qmt) obj17).B.i(((qjd) obj18).b).b(mce.am);
                            }
                        }
                    }
                }
                j$.util.Optional optional10 = qmtVar.p;
                qmp qmpVar2 = new qmp(obj13, 7);
                if (true == optional10.isPresent()) {
                    java.lang.Object obj19 = optional10.get();
                    java.lang.Object obj20 = qmpVar2.a;
                    qjd qjdVar3 = (qjd) obj19;
                    if (!qmt.j(qjdVar3)) {
                        qit qitVar = qjdVar3.a;
                        if (qitVar == qit.b && qmt.l(qjdVar3) && !qjdVar3.t) {
                            ((qmt) obj20).e().b(mce.cR);
                        } else if (qitVar == qit.c && qmt.l(qjdVar3)) {
                            ((qmt) obj20).e().b(mce.cT);
                        }
                    } else if (qjdVar3.a == qit.b && qmt.k(qjdVar3) && qjdVar3.t) {
                        ((qmt) obj20).e().b(mce.cS);
                    } else {
                        ((qmt) obj20).e().b(mce.ah);
                    }
                }
                ((android.telecom.InCallService) this.c).startForeground(1, (android.app.Notification) obj12);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue()) {
                    ?? r5 = this.a;
                    java.lang.Object obj21 = this.b;
                    int iOrdinal2 = ((zmy) aiql.H((java.util.concurrent.Future) r5)).ordinal();
                    if (iOrdinal2 == 0) {
                        ((qpq) obj21).k.a(qbc.bl);
                        return null;
                    }
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        ((qpq) obj21).k.a(qbc.bk);
                        return null;
                    }
                }
                return optionalEmpty;
            case 16:
                boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue();
                ?? r6 = this.a;
                ((qpq) this.b).k.a(zBooleanValue2 ? ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r6)).booleanValue() ? qbc.bo : qbc.bn : ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r6)).booleanValue() ? qbc.bq : qbc.bp);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Boolean bool = (java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c);
                java.lang.Object objH = aiql.H((java.util.concurrent.Future) this.a);
                rce rceVar = rcf.a;
                boolean zN = aooh.n(objH, rcf.a(qtr.g));
                boolean zBooleanValue3 = bool.booleanValue();
                java.lang.Object obj22 = this.b;
                if (!zBooleanValue3 || zN) {
                    qvk.a.b().l("com/android/dialer/incall/voice/buttons/AudioRouteButtonController", "toggleAudioRouteSelectorInVoiceController$<anonymous>", 111, "AudioRouteButtonController.kt").v("Audio route selector is toggled in VoiceFragment.");
                    ((qvk) obj22).b.i();
                } else {
                    qvk.a.b().l("com/android/dialer/incall/voice/buttons/AudioRouteButtonController", "toggleAudioRouteSelectorInVoiceController$<anonymous>", 105, "AudioRouteButtonController.kt").v("requires permission to use the connected bluetooth device.");
                    qvk qvkVar = (qvk) obj22;
                    qvkVar.g.a(mcd.y);
                    qvkVar.b.t.a(true);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj23 = this.a;
                java.lang.Object obj24 = this.c;
                ahbv ahbvVar = (ahbv) this.b;
                return ahbvVar.s((sso) ahbvVar.g, (aihd) obj24, (java.lang.String) obj23);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Boolean.valueOf(((sso) ((ahbv) this.a).g).c((defpackage.hkd) this.b, (defpackage.hkd) this.c));
            default:
                java.lang.Object obj25 = ((ahdv) this.c).f;
                svm svmVar = (svm) obj25;
                ahvr.H((ajcq) svmVar.f.eZ(), new icy(obj25, this.a, this.b, 12, (byte[]) null), svmVar.d);
                return null;
        }
    }

    public /* synthetic */ hsl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ hsl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hsl(defpackage.mjm mjmVar, java.util.Set set, aify aifyVar, int i) {
        this.$cid = i;
        this.b = mjmVar;
        this.a = set;
        this.c = aifyVar;
    }
}
