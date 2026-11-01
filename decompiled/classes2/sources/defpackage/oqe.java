package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class oqe implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ oqe(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, qbb] */
    /* JADX WARN: Type inference failed for: r0v81, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v53, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object objOfNullable;
        ?? r0;
        java.lang.String str;
        ?? Group = 0;
        int i = 0;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                java.util.List list = (java.util.List) obj;
                aift aiftVar = new aift(4);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    java.lang.Boolean bool = (java.lang.Boolean) list.get(i2);
                    if (bool != null && bool.booleanValue()) {
                        aiftVar.i((defpackage.oql) ((aify) this.b).get(i2));
                    }
                }
                aike aikeVarH = aiftVar.h();
                if (aikeVarH.isEmpty()) {
                    return j$.util.Optional.empty();
                }
                int i3 = aikeVarH.d;
                if (i3 == 1) {
                    return j$.util.Optional.of((defpackage.oql) aikeVarH.get(0));
                }
                ipc ipcVar = (ipc) ((oqi) this.a).f.orElseThrow();
                ahvr.bN(!aikeVarH.isEmpty(), "There is no HaTS rule to resolve.");
                return j$.util.Optional.of((defpackage.oql) aikeVarH.get(((java.util.Random) ipcVar.a).nextInt(i3)));
            case 1:
                if (!((defpackage.omz) this.a).c) {
                    return null;
                }
                ((kjr) ((defpackage.onb) this.b).d).a();
                return null;
            case 2:
                defpackage.ory oryVar = (defpackage.ory) this.a;
                if (java.util.concurrent.TimeUnit.DAYS.toMillis(((java.lang.Long) oryVar.c.a()).longValue()) + ((java.lang.Long) obj).longValue() > j$.time.Instant.now().toEpochMilli()) {
                    defpackage.ory.a.b().l("com/android/dialer/inappreview/dataservice/ReviewInfoDataService", "getReviewInfo", 72, "ReviewInfoDataService.java").v("Skip requesting in-app review due to quota limit");
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj2 = this.b;
                defpackage.ory.a.b().l("com/android/dialer/inappreview/dataservice/ReviewInfoDataService", "getReviewInfo", 66, "ReviewInfoDataService.java").v("In-app review quota limit satisfied");
                defpackage.oii oiiVar = oryVar.d;
                agsm.i(425, ((kaw) oiiVar.a).p(((aogc) oiiVar.c).bl(new defpackage.jwe(j$.time.Instant.now().toEpochMilli(), 6))), "Fail to update the last invoke time", new java.lang.Object[0]);
                return j$.util.Optional.of(((ageo) obj2).b());
            case 3:
                suc sucVar = (suc) obj;
                java.lang.String str2 = (java.lang.String) ((j$.util.Optional) this.b).orElse((java.lang.Object) null);
                alin alinVar = (alin) sucVar.d.orElse((java.lang.Object) null);
                aihd aihdVar = sucVar.c;
                osk oskVar = (osk) this.a;
                osp ospVar = oskVar.d;
                if (ospVar.b.isPresent()) {
                    a.bI(osp.a.c().m(aioa.b), "preferredAccountRecorder has already been initialized", "com/android/dialer/incall/accountselectordialog/service/AccountSelectorDialogPreferenceRecorder", "initializeRecorder", '1', "AccountSelectorDialogPreferenceRecorder.java", zct.b);
                } else {
                    ospVar.b = j$.util.Optional.of(ospVar.c.p(str2, alinVar, aihdVar));
                }
                j$.util.Optional optional = sucVar.a;
                if (optional.isPresent()) {
                    oso osoVar = oskVar.f;
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) optional.orElseThrow();
                    j$.util.Optional.empty();
                    osoVar.b(phoneAccountHandle, false);
                    oskVar.g.b(ruc.aN);
                    oskVar.i.a(qbc.gt);
                    return null;
                }
                osr osrVar = oskVar.e;
                if (osrVar.b.isPresent()) {
                    a.bI(osr.a.c().m(aioa.b), "a SelectAccountResult has already been cached and this should only happen once per call", "com/android/dialer/incall/accountselectordialog/service/AccountSelectorDialogResultCache", "cacheResult", '$', "AccountSelectorDialogResultCache.java", zct.b);
                } else {
                    osrVar.b = j$.util.Optional.of(sucVar);
                }
                android.content.Context context = oskVar.a;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.incall.accountselectordialog.ui.AccountSelectorDialogActivity.class);
                intent.setFlags(402653184);
                intent.putExtra("extra_call_id_string", oskVar.b);
                ahqx.l(context, intent);
                return null;
            case 4:
                spe speVar = (spe) obj;
                if (speVar.b.size() > 0) {
                    ((java.util.concurrent.atomic.AtomicBoolean) ((defpackage.krv) this.b).a).compareAndSet(false, true);
                }
                java.lang.Object obj3 = this.a;
                akzx akzxVarM = spn.a.m();
                ((phe) obj3).c.h(akzxVarM, speVar);
                return akzxVarM.p();
            case 5:
                java.lang.String strD = defpackage.dxt.a().d(((ssq) this.a).g((java.lang.String) ((j$.util.Optional) obj).orElse((java.lang.Object) null), (java.lang.String) ((j$.util.Optional) this.b).orElse((java.lang.Object) null)), defpackage.dxv.a);
                if (strD != null) {
                    if (!strD.isEmpty()) {
                        return j$.util.Optional.of(strD);
                    }
                    hgb.c(piz.a.b(), "Unicode wrapped number is empty.", "com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceCallbackNumber", (char) 1183, "CallInfoProducerModule.java", (byte) 10, java.util.concurrent.TimeUnit.SECONDS);
                }
                return j$.util.Optional.empty();
            case 6:
                akfx akfxVar = (akfx) obj;
                ?? r2 = this.b;
                try {
                    akgu akguVarI = akfxVar.i((java.lang.CharSequence) this.a, akfg.eq);
                    return java.lang.Boolean.valueOf(akfxVar.t(akguVarI, akfxVar.i((java.lang.CharSequence) r2, akfxVar.c(akguVarI.c))) == 5);
                } catch (akfp unused) {
                    return java.lang.Boolean.FALSE;
                }
            case 7:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = this.b;
                j$.util.Objects.requireNonNull(obj4);
                pnh pnhVar = new pnh(obj4, 15);
                j$.util.Optional optional2 = (j$.util.Optional) obj5;
                if (true == optional2.isPresent()) {
                    pzp pzpVar = (pzp) optional2.get();
                    aoin aoinVar = (aoin) ((pzt) pnhVar.a).a.get(pzpVar);
                    if (aoinVar == null) {
                        objOfNullable = obj5;
                        throw new java.lang.AssertionError(java.lang.String.format("screen for %s is not bound", pzpVar.name()));
                    }
                    objOfNullable = obj5;
                    objOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((pzs) aoinVar.a()).f()));
                }
                objOfNullable = obj5;
                return (java.lang.Boolean) ((j$.util.Optional) objOfNullable).orElse(java.lang.Boolean.FALSE);
            case 8:
                return java.lang.Boolean.valueOf(((qbe) this.b).d((qbc) this.a, j$.util.Optional.of((amnr) obj), j$.util.Optional.empty(), j$.util.Optional.empty(), j$.util.Optional.empty()));
            case 9:
                qbe qbeVar = (qbe) this.b;
                java.util.Set set = qbeVar.b;
                amnr amnrVar = (amnr) obj;
                java.lang.Object obj6 = this.a;
                if (!set.add(obj6)) {
                    return null;
                }
                qbeVar.d((qbc) obj6, j$.util.Optional.of(amnrVar), j$.util.Optional.empty(), j$.util.Optional.empty(), j$.util.Optional.empty());
                return null;
            case 10:
                this.a.b((akzx) this.b, obj);
                return null;
            case 11:
                qeg qegVar = (qeg) this.b;
                qegVar.g.set(false);
                qegVar.b(false);
                int iOrdinal = ((defpackage.hxb) obj).ordinal();
                if (iOrdinal == 0) {
                    qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "listenToAudioTee", 177, "AudioDetector.java").v("audio detector stopped because rtt finished");
                    return null;
                }
                if (iOrdinal == 1) {
                    qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "listenToAudioTee", 180, "AudioDetector.java").v("audio detector stopped");
                    return null;
                }
                if (iOrdinal != 2) {
                    return null;
                }
                java.lang.Object obj7 = this.a;
                qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "listenToAudioTee", 190, "AudioDetector.java").v("audio format changed. retry to read");
                agsm.i(593, qegVar.c((defpackage.iax) obj7), "retry listenToCallAudio", new java.lang.Object[0]);
                return null;
            case 12:
                java.lang.Object[] objArr = {((qga) this.a).b.getSchemeSpecificPart()};
                android.content.Context context2 = ((qgc) this.b).b;
                android.widget.Toast.makeText(context2, context2.getString(2132019959, objArr), 1).show();
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                ((qgn) this.b).m.a((qbc) this.a);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                a.bI(qkm.a.d(), "loading the notification's contact photo timed out", "com/android/dialer/incall/statusbarnotification/service/NotificationContactPhotoLoader", "loadBitmap", 'X', "NotificationContactPhotoLoader.java", zct.b);
                ((qkm) this.a).f.a((ajcq) this.b);
                return j$.util.Optional.empty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                rur rurVar = (rur) this.a;
                ahvr.bZ(rurVar.g.isPresent(), "Mmi data not present after load()");
                aimz aimzVar = rur.a;
                java.lang.String str3 = "MmiCodesProcessorImpl.java";
                aimzVar.b().l("com/android/dialer/mmi/impl/MmiCodesProcessorImpl", "processMmiCode", 150, "MmiCodesProcessorImpl.java").v("start to process mmi code");
                ruq ruqVar = (ruq) rurVar.g.orElseThrow();
                aigf aigfVar = ruqVar.a;
                ?? r1 = this.b;
                ruk rukVar = (ruk) aigfVar.get((java.lang.Object) r1);
                if (rukVar == null || (rukVar.b & 2) == 0) {
                    aify aifyVar = ruqVar.b;
                    int size = aifyVar.size();
                    boolean z2 = false;
                    while (i < size) {
                        rup rupVar = (rup) aifyVar.get(i);
                        java.util.regex.Matcher matcher = rupVar.a.matcher(r1);
                        if (matcher.matches()) {
                            z2 = rupVar.b;
                            if (ruqVar.c) {
                                Group = Group;
                                Group = r1;
                            } else if (matcher.groupCount() == 3) {
                                Group = Group;
                                Group = matcher.group(2);
                            } else {
                                Group = Group;
                                str = str3;
                                a.bt(aimzVar.d(), "Regular expression %s should contain three matcher groups for MMI code configuration not using prefix and suffix", rupVar, "com/android/dialer/mmi/impl/MmiCodesProcessorImpl", "processMmiCode", (char) 194, str, zct.b);
                                rurVar.e.o(rmx.ii);
                            }
                            Group = Group;
                            str = str3;
                        } else {
                            Group = Group;
                            str = str3;
                        }
                        i++;
                        str3 = str;
                        Group = Group;
                    }
                    r0 = Group;
                    z = z2;
                } else if (!ruqVar.c) {
                    r0 = r1;
                    r0 = rukVar.d;
                }
                r0 = r1;
                ruh ruhVar = ruh.a;
                if (r0 != 0) {
                    ruhVar = z ? ruh.b : ruh.c;
                }
                return new ruo((java.lang.String) r0, ruhVar);
            case 16:
                aify aifyVar2 = (aify) obj;
                int size2 = aifyVar2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ?? r3 = this.b;
                    android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) aifyVar2.get(i4);
                    if (android.text.TextUtils.equals(r3, statusBarNotification.getNotification().getGroup())) {
                        ((rwi) this.a).j(statusBarNotification.getTag(), statusBarNotification.getId());
                    }
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Boolean.valueOf(((sso) obj).c((defpackage.hkd) this.a, (defpackage.hkd) this.b));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (!optional3.isPresent()) {
                    a.bI(svm.a.c().m(aioa.b), "GET_BEST_SIM returned null", "com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVoice", (char) 127, "MotoSuggestionProvider.java", zct.b);
                    return j$.util.Optional.empty();
                }
                android.content.ComponentName componentName = (android.content.ComponentName) ((android.os.Bundle) optional3.orElseThrow()).getParcelable("suggested_phone_account_component_name");
                if (componentName == null) {
                    svm.a.b().l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVoice", 136, "MotoSuggestionProvider.java").v("missing component name");
                    return j$.util.Optional.empty();
                }
                java.lang.String string = ((android.os.Bundle) optional3.orElseThrow()).getString("suggested_phone_account_id");
                if (android.text.TextUtils.isEmpty(string)) {
                    svm.a.b().l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVoice", 142, "MotoSuggestionProvider.java").v("missing component name");
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj8 = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = new android.telecom.PhoneAccountHandle(componentName, string);
                int i5 = defpackage.abxv.a;
                svm svmVar = (svm) obj8;
                if (da$.ExternalSyntheticApiModelOutline1.m((android.telephony.TelephonyManager) svmVar.c.getSystemService(android.telephony.TelephonyManager.class), phoneAccountHandle2) == null) {
                    svm.a.b().l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVoice", 147, "MotoSuggestionProvider.java").v("invalid phone account");
                    return j$.util.Optional.empty();
                }
                svmVar.b.set(new taq((java.lang.String) this.b, (android.os.Bundle) optional3.orElseThrow()));
                int i6 = ((android.os.Bundle) optional3.orElseThrow()).getInt("suggestion_rule");
                svm.a.b().l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVoice", 155, "MotoSuggestionProvider.java").w("suggestionType: %d", i6);
                switch (i6) {
                    case 1:
                        return j$.util.Optional.of(new alin(phoneAccountHandle2, svi.d, true));
                    case 2:
                        return j$.util.Optional.of(new alin(phoneAccountHandle2, svi.b, true));
                    case 3:
                        return j$.util.Optional.of(new alin(phoneAccountHandle2, svi.c, true));
                    case 4:
                        return j$.util.Optional.of(new alin(phoneAccountHandle2, svi.b, false));
                    case 5:
                        return j$.util.Optional.of(new alin(phoneAccountHandle2, svi.c, false));
                    case 6:
                        return j$.util.Optional.of(new alin(phoneAccountHandle2, svi.e, true));
                    case 7:
                        return j$.util.Optional.of(new alin(phoneAccountHandle2, svi.f, true));
                    default:
                        return j$.util.Optional.empty();
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                if (!optional4.isPresent()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                acui acuiVar = (acui) optional4.orElseThrow();
                rsr rsrVar = ((tbq) obj10).c;
                android.content.Context context3 = (android.content.Context) rsrVar.b.a();
                context3.getClass();
                zdl zdlVar = (zdl) rsrVar.a.a();
                zdlVar.getClass();
                obj9.getClass();
                acuiVar.getClass();
                rdp rdpVar = new rdp(context3, zdlVar, (java.lang.String) obj9, acuiVar);
                tbq.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository", "audioGroupInterpreter", 81, "RevelioTtsRepository.java").y("returning interpreter for voice %s", rdpVar.d);
                return j$.util.Optional.of(rdpVar);
            default:
                ((tzv) this.b).d.b(mce.cB);
                tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "completeRemoteAudioWithCuiLogging", 374, "SonicAudioPlayer.java").v("Sonic audio play started at remote side");
                return this.a;
        }
    }

    public /* synthetic */ oqe(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
