package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rvu {
    public static final aimz a = aimz.i("com/android/dialer/multibindingsettings/impl/DialerSettingsActivityPeer");
    public final com.android.dialer.multibindingsettings.impl.DialerSettingsActivity b;
    public final urs c;
    public final ruc d;
    public final afpn e;
    public final zjm f;
    public final defpackage.whl g;
    public final zjm h;
    private final agsm i;
    private final zzx j;
    private final zzx k;

    public rvu(com.android.dialer.multibindingsettings.impl.DialerSettingsActivity dialerSettingsActivity, zjm zjmVar, zzx zzxVar, zzx zzxVar2, defpackage.whl whlVar, urs ursVar, zjm zjmVar2, ruc rucVar, agsm agsmVar) {
        this.b = dialerSettingsActivity;
        this.h = zjmVar;
        this.k = zzxVar;
        this.j = zzxVar2;
        this.g = whlVar;
        this.c = ursVar;
        this.f = zjmVar2;
        this.d = rucVar;
        this.i = agsmVar;
        this.e = new defpackage.rvt(this, zjmVar2);
    }

    private final void b(aw awVar) {
        u uVar = new u(this.b.a());
        uVar.q(2131428302, awVar, (java.lang.String) null);
        uVar.c();
    }

    public final void a(android.content.Intent intent) {
        int i;
        j$.util.Optional optionalA = this.d.a();
        defpackage.rvq rvqVarO = defpackage.akmr.o(intent, "extra_settings_launch_config", defpackage.rvq.a, akzq.a());
        if ((intent.getFlags() & 536870912) == 0 && !rvqVarO.e) {
            throw new java.lang.IllegalStateException("non-singleTop launch mode without escape hatch");
        }
        this.i.g(aiql.v((aify) j$.util.Collection.-EL.stream(this.j.e()).map(new defpackage.rat(4)).collect(aido.a)), 5L, java.util.concurrent.TimeUnit.SECONDS);
        int i2 = rvqVarO.c;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 1) {
            i = i2 != 2 ? 0 : 2;
        } else {
            i = 1;
        }
        defpackage.rvc rvcVar = null;
        if (i == 0) {
            throw null;
        }
        if (i - 1 != 1) {
            b(defpackage.rvx.aW());
        } else {
            int i3 = (i2 == 2 ? (defpackage.rvo) rvqVarO.d : defpackage.rvo.a).d;
            if (i3 == 0) {
                rvcVar = defpackage.rvc.UNSPECIFIED;
            } else if (i3 == 17) {
                rvcVar = defpackage.rvc.CRYSTAL_CLEAR_AUDIO;
            } else if (i3 == 18) {
                rvcVar = defpackage.rvc.DISPLAY_OPTIONS;
            } else if (i3 == 101) {
                rvcVar = defpackage.rvc.REVELIO;
            } else if (i3 == 102) {
                rvcVar = defpackage.rvc.RTT;
            } else if (i3 == 10001) {
                rvcVar = defpackage.rvc.TEST_FEATURE_SETTING;
            } else if (i3 != 10002) {
                switch (i3) {
                    case 2:
                        rvcVar = defpackage.rvc.CALL_SCREEN;
                        break;
                    case 3:
                        rvcVar = defpackage.rvc.CALLER_ID_AND_SPAM;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        rvcVar = defpackage.rvc.SHARPIE;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        rvcVar = defpackage.rvc.HOLD_FOR_ME;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        rvcVar = defpackage.rvc.SPAM_AND_CALL_SCREEN;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        rvcVar = defpackage.rvc.XATU;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        rvcVar = defpackage.rvc.MOTOROLA_FLIPPABLES;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        rvcVar = defpackage.rvc.TIMEKEEPER;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        rvcVar = defpackage.rvc.ACCESSIBILITY;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        rvcVar = defpackage.rvc.ASSISTED_DIALING;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        rvcVar = defpackage.rvc.BLOCKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        rvcVar = defpackage.rvc.CALLING_ACCOUNTS;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        rvcVar = defpackage.rvc.CALLS;
                        break;
                    case 15:
                        rvcVar = defpackage.rvc.CALL_RECORDING;
                        break;
                    default:
                        switch (i3) {
                            case 20:
                                rvcVar = defpackage.rvc.ANSWER_METHOD;
                                break;
                            case 21:
                                rvcVar = defpackage.rvc.ENRICHED_CALLING;
                                break;
                            case 22:
                                rvcVar = defpackage.rvc.LANGUAGE_AND_VOICE;
                                break;
                            case 23:
                                rvcVar = defpackage.rvc.QUICK_REPLIES;
                                break;
                            case 24:
                                rvcVar = defpackage.rvc.SOUND_AND_VIBRATION;
                                break;
                            case 25:
                                rvcVar = defpackage.rvc.VIDEO_CALL;
                                break;
                            default:
                                switch (i3) {
                                    case 27:
                                        rvcVar = defpackage.rvc.VOICEMAIL;
                                        break;
                                    case 28:
                                        rvcVar = defpackage.rvc.CALL_ANNOUNCER;
                                        break;
                                    case 29:
                                        rvcVar = defpackage.rvc.FLIP_TO_SILENCE;
                                        break;
                                    case 30:
                                        rvcVar = defpackage.rvc.PREFIXES;
                                        break;
                                    case 31:
                                        rvcVar = defpackage.rvc.DOBBY;
                                        break;
                                    case 32:
                                        rvcVar = defpackage.rvc.SONIC;
                                        break;
                                    case 33:
                                        rvcVar = defpackage.rvc.FERMAT;
                                        break;
                                    case 34:
                                        rvcVar = defpackage.rvc.EXPRESSO;
                                        break;
                                    case 35:
                                        rvcVar = defpackage.rvc.CONTACT_RINGTONES;
                                        break;
                                    case 36:
                                        rvcVar = defpackage.rvc.NAUTILUS;
                                        break;
                                    case 37:
                                        rvcVar = defpackage.rvc.PATRICK;
                                        break;
                                    case 38:
                                        rvcVar = defpackage.rvc.BEACON;
                                        break;
                                    case 39:
                                        rvcVar = defpackage.rvc.BEESLY;
                                        break;
                                    case 40:
                                        rvcVar = defpackage.rvc.CALL_DIAGNOSTICS;
                                        break;
                                    case 41:
                                        rvcVar = defpackage.rvc.CALL_CONTEXT;
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                rvcVar = defpackage.rvc.TYPE_INTENT_TEST;
            }
            if (rvcVar == null) {
                rvcVar = defpackage.rvc.UNRECOGNIZED;
            }
            aimz aimzVar = a;
            aimzVar.b().l("com/android/dialer/multibindingsettings/impl/DialerSettingsActivityPeer", "launchSettingsFromConfig", 221, "DialerSettingsActivityPeer.java").y("settingsEntry: %s", new aepg(rvcVar));
            if (rvcVar == defpackage.rvc.UNSPECIFIED || rvcVar == defpackage.rvc.UNRECOGNIZED) {
                b(defpackage.rvx.aW());
            } else {
                aoin aoinVar = (aoin) this.k.k().get(rvcVar);
                if (aoinVar == null) {
                    aimzVar.d().l("com/android/dialer/multibindingsettings/impl/DialerSettingsActivityPeer", "launchSettingsFromConfig", 232, "DialerSettingsActivityPeer.java").y("SettingsIntegration provider not found or disabled for SettingsEntry: %s.", new aepg(rvcVar));
                    b(defpackage.rvx.aW());
                } else {
                    aw awVarC = ((rvd) aoinVar.a()).c(rvqVarO);
                    android.os.Bundle bundle = awVarC.m;
                    if (bundle == null) {
                        bundle = new android.os.Bundle();
                    }
                    defpackage.akmr.u(bundle, "extra_settings_launch_config", rvqVarO);
                    awVarC.au(bundle);
                    b(awVarC);
                }
            }
        }
        defpackage.rhb rhbVar = new defpackage.rhb(this, 5);
        if (true == optionalA.isPresent()) {
            ((defpackage.rvu) rhbVar.a).d.p((aeun) optionalA.get(), ruc.bZ);
        }
    }
}
