package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hwo implements ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public hwo(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x0627  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v133, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v167, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final /* synthetic */ ahtm a(ahth ahthVar) {
        defpackage.iec iecVarB;
        defpackage.ied iedVarD;
        ahtm ahtmVar;
        androidx.media3.exoplayer.ExoPlayer exoPlayer;
        int i = 9;
        byte[] bArr = 0;
        switch (this.$cid) {
            case 0:
                aooh.f((defpackage.hwu) ahthVar, "event");
                defpackage.hwn hwnVar = (defpackage.hwn) this.a;
                defpackage.hvc hvcVarC = hwnVar.c();
                if (hvcVarC != null) {
                    hvcVarC.b();
                }
                qbe qbeVarE = hwnVar.e();
                if (qbeVarE != null) {
                    qbeVarE.a(qbc.gW);
                }
                return ahtm.a;
            case 1:
                aooh.f((defpackage.hwt) ahthVar, "event");
                defpackage.hvc hvcVarC2 = ((defpackage.hwn) this.a).c();
                if (hvcVarC2 != null) {
                    defpackage.hvc.a.b().l("com/android/dialer/assistedemergencydialing/impl/service/AssistedEmergencyDialingController", "onVoiceAssistDialogCloseButtonPressed", 100, "AssistedEmergencyDialingController.kt").v("enter");
                    hvcVarC2.b.d(defpackage.hwa.b);
                    hvcVarC2.c.e.set(true);
                }
                return ahtm.a;
            case 2:
                defpackage.iff iffVar = (defpackage.iff) ahthVar;
                aooh.f(iffVar, "event");
                aimw aimwVarL = defpackage.ifg.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioDeviceSelectorDialogFragmentPeer", "onAudioDeviceSelected", 129, "AudioDeviceSelectorDialogFragmentPeer.kt");
                android.media.AudioDeviceInfo audioDeviceInfo = iffVar.a;
                aimwVarL.w("audio device(type=%d) selected.", audioDeviceInfo.getType());
                int type = audioDeviceInfo.getType();
                if (type == 1) {
                    i = 8;
                } else if (type == 2) {
                    i = 7;
                } else if (type == 3) {
                    i = 10;
                } else if (type != 7 && type != 26) {
                    if (type != 22) {
                        i = type != 23 ? 1 : 11;
                    } else {
                        i = 10;
                    }
                }
                java.lang.Object obj = this.a;
                vaa vaaVarQ = akky.Q(amod.a.m());
                defpackage.ifg ifgVar = (defpackage.ifg) obj;
                defpackage.iec iecVarB2 = defpackage.iec.b(ifgVar.b.b);
                if (iecVarB2 == null) {
                    iecVarB2 = defpackage.iec.UNRECOGNIZED;
                }
                rlv rlvVar = ifgVar.g;
                vaaVarQ.an(iecVarB2);
                vaaVarQ.ao(i);
                rlvVar.c(vaaVarQ.am());
                ifgVar.e.q(audioDeviceInfo);
                ifgVar.c.f();
                return ahtm.a;
            case 3:
                aooh.f((defpackage.ifk) ahthVar, "event");
                defpackage.ifq ifqVar = (defpackage.ifq) this.a;
                ifqVar.g(6);
                defpackage.iek iekVar = ifqVar.k;
                if (iekVar == null) {
                    iecVarB = defpackage.iec.UNKNOWN;
                } else {
                    defpackage.ied iedVar = iekVar.c;
                    if (iedVar == null) {
                        iedVar = defpackage.ied.a;
                    }
                    if (iedVar != null) {
                        iecVarB = defpackage.iec.b(iedVar.e);
                        if (iecVarB == null) {
                            iecVarB = defpackage.iec.UNRECOGNIZED;
                        }
                    } else {
                        iecVarB = defpackage.iec.UNKNOWN;
                    }
                }
                akzx akzxVarM = defpackage.ifd.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                ((defpackage.ifd) akzxVarM.b).b = iecVarB.a();
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.ife ifeVar = new defpackage.ife();
                amxr.g(ifeVar);
                ahgl.b(ifeVar, (defpackage.ifd) aladVarP);
                ifeVar.r(ifqVar.c.I(), "AudioDeviceSelectorDialog");
                return ahtm.a;
            case 4:
                aooh.f((defpackage.ifm) ahthVar, "event");
                defpackage.ifq ifqVar2 = (defpackage.ifq) this.a;
                ifqVar2.g(4);
                defpackage.iek iekVar2 = ifqVar2.k;
                if (iekVar2 != null) {
                    iedVarD = iekVar2.c;
                    if (iedVarD == null) {
                        iedVarD = defpackage.ied.a;
                    }
                    aooh.e(iedVarD, "getAudioInfo(...)");
                    defpackage.ifq.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "onDeleteButtonClick", 557, "AudioPlaybackViewPeer.kt").v("pause audio playback before delete");
                    ifqVar2.d.k(iedVarD, false);
                } else {
                    defpackage.ifq.a.d().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "onDeleteButtonClick", 560, "AudioPlaybackViewPeer.kt").v("DeleteButtonClickEvent was triggered with missing view model");
                    iedVarD = defpackage.hgz.t(defpackage.ied.a.m()).D();
                }
                ahtmVar = new ahtm(new defpackage.ieh(iedVarD));
                break;
            case 5:
                aooh.f((defpackage.ifn) ahthVar, "event");
                defpackage.ifq ifqVar3 = (defpackage.ifq) this.a;
                ifqVar3.g(5);
                defpackage.iek iekVar3 = ifqVar3.k;
                if (iekVar3 == null) {
                    defpackage.ifq.a.d().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "onShareButtonClick", 534, "AudioPlaybackViewPeer.kt").v("ShareButtonClickEvent was triggered with missing view model");
                    return ahtm.a;
                }
                if (!iekVar3.f) {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
                    intent.setType("audio/*");
                    defpackage.ied iedVar2 = iekVar3.c;
                    if (iedVar2 == null) {
                        iedVar2 = defpackage.ied.a;
                    }
                    intent.putExtra("android.intent.extra.STREAM", android.net.Uri.parse(iedVar2.c));
                    intent.setFlags(1);
                    android.content.Context context = ifqVar3.b;
                    android.content.Intent intentCreateChooser = android.content.Intent.createChooser(intent, null);
                    aooh.e(intentCreateChooser, "createChooser(...)");
                    ahqx.l(context, intentCreateChooser);
                    return ahtm.a;
                }
                defpackage.ied iedVar3 = iekVar3.c;
                if (iedVar3 == null) {
                    iedVar3 = defpackage.ied.a;
                }
                aooh.e(iedVar3, "getAudioInfo(...)");
                ahtmVar = new ahtm(new defpackage.iej(iedVar3));
                break;
                break;
            case 6:
                aooh.f((defpackage.ifo) ahthVar, "event");
                defpackage.ifq ifqVar4 = (defpackage.ifq) this.a;
                ifqVar4.g(2);
                defpackage.iek iekVar4 = ifqVar4.k;
                if (iekVar4 == null) {
                    defpackage.ifq.a.d().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer", "onPlayPauseButtonClick", 495, "AudioPlaybackViewPeer.kt").v("PlayPauseButtonClickEvent was triggered with missing view model");
                    return ahtm.a;
                }
                iez iezVar = ifqVar4.d;
                defpackage.ied iedVar4 = iekVar4.c;
                if (iedVar4 == null) {
                    iedVar4 = defpackage.ied.a;
                }
                aooh.e(iedVar4, "getAudioInfo(...)");
                boolean z = (iezVar.s(iedVar4) && iezVar.t()) ? false : true;
                if (!z) {
                    ifqVar4.b(iezVar.c());
                }
                defpackage.ieg iegVar = ifqVar4.o;
                if (iegVar != null) {
                    iegVar.a(z);
                }
                if (iekVar4.g) {
                    defpackage.ied iedVar5 = iekVar4.c;
                    if (iedVar5 == null) {
                        iedVar5 = defpackage.ied.a;
                    }
                    aooh.e(iedVar5, "getAudioInfo(...)");
                    if (!iezVar.s(iedVar5)) {
                        defpackage.ied iedVar6 = iekVar4.c;
                        if (iedVar6 == null) {
                            iedVar6 = defpackage.ied.a;
                        }
                        aooh.e(iedVar6, "getAudioInfo(...)");
                        ahtmVar = new ahtm(new defpackage.iei(iedVar6));
                    }
                    break;
                }
                defpackage.ied iedVar7 = iekVar4.c;
                if (iedVar7 == null) {
                    iedVar7 = defpackage.ied.a;
                }
                aooh.e(iedVar7, "getAudioInfo(...)");
                aooh.f(iedVar7, "audioInfo");
                if (aooh.n(iezVar.k, iedVar7) && (exoPlayer = iezVar.j) != null && exoPlayer.e()) {
                    iezVar.k(iedVar7, false);
                } else {
                    iezVar.l(iedVar7);
                }
                return ahtm.a;
            case 7:
                aooh.f((ahtd) ahthVar, "event");
                defpackage.ijk ijkVarA = ((defpackage.iji) this.a).a();
                if (ijkVarA != null) {
                    ijkVarA.b();
                }
                return ahtm.a;
            case 8:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.ijk ijkVarA2 = ((defpackage.iji) this.a).a();
                if (ijkVarA2 == null) {
                    defpackage.iji.a.d().l("com/android/dialer/audioprism/internal/exclusivity/impl/AudioPrismExclusivityDialogFragmentPeer", "onPositiveButtonClicked", 71, "AudioPrismExclusivityDialogFragmentPeer.kt").v("Ignore because of no primary call scope");
                    return ahtm.a;
                }
                defpackage.ijk.a.b().l("com/android/dialer/audioprism/internal/exclusivity/impl/AudioPrismExclusivityDialogsImpl", "stopIncompatibleFeaturesAndStart", 50, "AudioPrismExclusivityDialogsImpl.kt").v("stop incompatible features and start");
                ijkVarA2.d.i(aoov.an(ijkVarA2.b, (aolr) null, 0, new defpackage.icr(ijkVarA2, (aoln) null, 3), 3));
                return ahtm.a;
            case 9:
                aooh.f((ahtf) ahthVar, "event");
                aimw aimwVarL2 = defpackage.ixz.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyDeleteDialogFragmentPeer", "onPositiveButtonClick", 47, "BeeslyDeleteDialogFragmentPeer.kt");
                defpackage.ixz ixzVar = (defpackage.ixz) this.a;
                defpackage.iyr iyrVar = ixzVar.b;
                aimwVarL2.y("onPositiveButtonClick: id=%s", iyrVar.b);
                ixzVar.c.o(rmx.xP);
                java.lang.String str = iyrVar.b;
                aooh.e(str, "getGreetingId(...)");
                ahtmVar = new ahtm(new defpackage.iyt(str));
                break;
            case 10:
                defpackage.iyt iytVar = (defpackage.iyt) ahthVar;
                aooh.f(iytVar, "event");
                aimw aimwVarL3 = defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "onGreetingDeleteConfirmedEvent", 438, "BeeslyGreetingSettingsFragmentPeer.kt");
                java.lang.String str2 = iytVar.a;
                aimwVarL3.y("onDeleteConfirmedEvent RECEIVED for: id=%s", str2);
                defpackage.iyi iyiVar = (defpackage.iyi) this.a;
                iyiVar.g.j(zoe.N(aosv.F(iyiVar.i, 0, new defpackage.iiw(iyiVar, iytVar, (aoln) null, 18), 3)), new zoe(str2), iyiVar.t);
                return ahtm.a;
            case 11:
                defpackage.iyw iywVar = (defpackage.iyw) ahthVar;
                aooh.f(iywVar, "event");
                aimw aimwVarL4 = defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "onGreetingRenameConfirmedEvent", 457, "BeeslyGreetingSettingsFragmentPeer.kt");
                java.lang.String str3 = iywVar.a;
                aimwVarL4.I("onRenameConfirmedEvent RECEIVED for: id=%s, newName=%s", str3, iywVar.b);
                defpackage.iyi iyiVar2 = (defpackage.iyi) this.a;
                iyiVar2.g.j(zoe.N(aosv.F(iyiVar2.i, 0, new defpackage.iiw(iyiVar2, iywVar, (aoln) null, 19), 3)), new zoe(str3), iyiVar2.u);
                return ahtm.a;
            case 12:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.iyp iypVar = (defpackage.iyp) this.a;
                defpackage.iyn iynVar = iypVar.b;
                com.google.android.material.textfield.TextInputEditText textInputEditTextFindViewById = iynVar.c().findViewById(2131428781);
                iynVar.f();
                java.lang.String string = aoov.x(java.lang.String.valueOf(textInputEditTextFindViewById != null ? textInputEditTextFindViewById.getText() : 0)).toString();
                if (aooh.n(string, "")) {
                    defpackage.iyp.a.d().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyRenameDialogFragmentPeer", "onPositiveButtonClick", 106, "BeeslyRenameDialogFragmentPeer.kt").v("onPositiveButtonClick: newName is empty");
                    return ahtm.a;
                }
                defpackage.izo izoVar = iypVar.c;
                if (aooh.n(string, izoVar.c)) {
                    defpackage.iyp.a.d().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyRenameDialogFragmentPeer", "onPositiveButtonClick", 110, "BeeslyRenameDialogFragmentPeer.kt").v("onPositiveButtonClick: newName is the same as currentName");
                    return ahtm.a;
                }
                defpackage.iyp.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyRenameDialogFragmentPeer", "onPositiveButtonClick", 114, "BeeslyRenameDialogFragmentPeer.kt").y("onPositiveButtonClick: newName=%s", string);
                iypVar.d.o(rmx.xO);
                java.lang.String str4 = izoVar.b;
                aooh.e(str4, "getGreetingId(...)");
                ahtmVar = new ahtm(new defpackage.iyw(str4, string));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                tyr tyrVar = (tyr) ahthVar;
                aooh.f(tyrVar, "buttonEvent");
                tyv tyvVarB = tyv.b(tyrVar.a().d);
                if (tyvVarB == null) {
                    tyvVarB = tyv.m;
                }
                java.lang.Object obj2 = this.a;
                int iOrdinal = tyvVarB.ordinal();
                if (iOrdinal == 1) {
                    defpackage.jcp.a.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer", "onSodaStatusBannerClick", 411, "BeeslySettingsFragmentPeer.kt").y("starting SODA download for language code %s", tyrVar.a().c);
                    defpackage.jcp jcpVar = (defpackage.jcp) obj2;
                    agtj agtjVar = jcpVar.g;
                    defpackage.jbv jbvVar = jcpVar.f;
                    agtjVar.i(zoe.N(aosv.C(aoov.am(jbvVar.b, 0, new defpackage.iiw(jbvVar, akff.a(tyrVar.a().c), (aoln) null, 20), 3))), jcpVar.q);
                } else if (iOrdinal != 6) {
                    defpackage.jcp.a.d().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer", "onSodaStatusBannerClick", 430, "BeeslySettingsFragmentPeer.kt").v("Click on non-clickable SODA status banner");
                } else {
                    defpackage.jcp jcpVar2 = (defpackage.jcp) obj2;
                    ahqx.l(jcpVar2.b, jcpVar2.t.a());
                }
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooh.f((ahtd) ahthVar, "event");
                ((defpackage.jiv) this.a).b.o(rmx.gB);
                ahtmVar = new ahtm(new zsy());
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.jiv jivVar = (defpackage.jiv) this.a;
                jivVar.b.o(rmx.gC);
                zrx zrxVar = ((defpackage.jit) jivVar.c).d;
                if (zrxVar == null) {
                    zrxVar = zrx.a;
                }
                return new ahtm(new ztc(zrxVar));
            case 16:
                defpackage.jma jmaVar = (defpackage.jma) ahthVar;
                aooh.f(jmaVar, "event");
                aooh.f(jmaVar, "event");
                com.google.android.material.chip.Chip chipM = ft$.ExternalSyntheticApiModelOutline0.m(((defpackage.jlm) this.a).c.c(), 2131428978);
                aooh.e(chipM, "requireViewById(...)");
                com.google.android.material.chip.Chip chip = chipM;
                java.lang.String str5 = jmaVar.a;
                if (str5 != null) {
                    chip.setText(str5);
                    chip.j((android.graphics.drawable.Drawable) null);
                } else {
                    chip.k(2131231975);
                    chip.setChecked(false);
                }
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooh.f((ahtd) ahthVar, "event");
                defpackage.jly jlyVar = (defpackage.jly) this.a;
                defpackage.jms jmsVar = jlyVar.e;
                if (jmsVar == null) {
                    aooh.j("scamSelector");
                    jmsVar = null;
                }
                jlyVar.c.o((rmx) jmsVar.d.get(defpackage.jmr.h));
                ahtmVar = new ahtm(new defpackage.jma(null));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.jly jlyVar2 = (defpackage.jly) this.a;
                defpackage.jms jmsVar2 = jlyVar2.e;
                if (jmsVar2 == null) {
                    aooh.j("scamSelector");
                    jmsVar2 = null;
                }
                jlyVar2.c.o((rmx) jmsVar2.d.get(defpackage.jmr.g));
                com.google.android.material.textfield.TextInputEditText textInputEditTextA = jlyVar2.a();
                return new ahtm(new defpackage.jma(java.lang.String.valueOf(textInputEditTextA != null ? textInputEditTextA.getText() : null)));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.jub.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdCrowdsourcingOptInDialogFragmentPeer", "onNegativeButtonClicked", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CallerIdCrowdsourcingOptInDialogFragmentPeer.java").v("Saving negative CallerIdBusiness feedback.");
                defpackage.jub jubVar = (defpackage.jub) this.a;
                jubVar.e.o(rmx.fw);
                defpackage.jrz jrzVar = jubVar.b;
                defpackage.jyn jynVar = jubVar.f;
                ajcq ajcqVarI = ahrv.g(jynVar.c(jrzVar, false)).i(new defpackage.idd(jynVar, jrzVar, i, bArr), (java.util.concurrent.Executor) jynVar.b);
                jubVar.d.k(ajcqVarI);
                jubVar.h.D(ajcqVarI);
                jubVar.a();
                return ahtm.a;
            default:
                defpackage.jub.a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdCrowdsourcingOptInDialogFragmentPeer", "onNeutralButtonClicked", 114, "CallerIdCrowdsourcingOptInDialogFragmentPeer.java").v("Opting out of CallerIdBusiness feedback.");
                defpackage.jub jubVar2 = (defpackage.jub) this.a;
                jubVar2.e.o(rmx.fx);
                ajcq ajcqVarC = jubVar2.f.c(jubVar2.b, false);
                jubVar2.d.k(ajcqVarC);
                jubVar2.h.D(ajcqVarC);
                return ahtm.a;
        }
        return ahtmVar;
    }
}
