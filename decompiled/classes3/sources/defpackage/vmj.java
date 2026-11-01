package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vmj implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vmj(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vbs vbsVarB;
        defpackage.vbs vbsVarB2;
        defpackage.vbs vbsVarB3;
        defpackage.vbs vbsVarB4;
        switch (this.$cid) {
            case 0:
                akzx akzxVarM = vcr.a.m();
                vcq vcqVar = vcq.a;
                akzxVarM.u();
                vcr vcrVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(vcqVar);
                vcrVar.c = vcqVar;
                vcrVar.b = 1;
                return akzxVarM.p();
            case 1:
                return vmg.a;
            case 2:
                return ((defpackage.vcx) obj).a;
            case 3:
                return (android.os.PersistableBundle) ((j$.util.Optional) obj).orElse(new android.os.PersistableBundle());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return afsq.bU((java.lang.Boolean) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                akzx akzxVarP = ((vmt) obj).p();
                akzxVarP.u();
                vmt vmtVar = akzxVarP.b;
                vmtVar.b |= 1;
                vmtVar.c = true;
                return akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                akzx akzxVarP2 = ((vmt) obj).p();
                akzxVarP2.u();
                vmt vmtVar2 = akzxVarP2.b;
                vmtVar2.b |= 1;
                vmtVar2.c = false;
                return akzxVarP2.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return java.lang.Boolean.valueOf(((vmt) obj).c);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return (aify) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new vgb(8)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vcr vcrVar2 = (vcr) obj;
                int i = vcrVar2.b;
                if (i != 2) {
                    a.bI(defpackage.vna.a.b(), "successfully fetching voicemail", "com/android/dialer/voicemail/service/receivers/FetchVoicemailReceiver", "downloadAudio", (char) 194, "FetchVoicemailReceiver.java", zct.a);
                    return null;
                }
                vcp vcpVar = i == 2 ? (vcp) vcrVar2.c : vcp.a;
                if (vcpVar.b == 1) {
                    vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                    if (vbsVarB == null) {
                        vbsVarB = defpackage.vbs.UNRECOGNIZED;
                    }
                } else {
                    vbsVarB = defpackage.vbs.UNSPECIFIED;
                }
                throw new java.lang.AssertionError(java.lang.String.format("Failed to download voicemail audio with reason: %s", java.lang.Integer.valueOf(vbsVarB.a())));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((vcg) optionalOfNullable.get()).t()));
                }
                return (java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.twf twfVar = (defpackage.twf) obj;
                return java.lang.Boolean.valueOf(twfVar.equals(defpackage.twf.SODA_HOST_APP_STATUS_ABLE_TO_TRANSCRIBE_AND_UP_TO_DATE) || twfVar.equals(defpackage.twf.SODA_HOST_APP_STATUS_ABLE_TO_TRANSCRIBE_AND_OUTDATED));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                gus gusVar = (gus) obj;
                if (gusVar.equals(new gsf())) {
                    return gusVar;
                }
                vnv.a.b().l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscriptionWorker", "startWork", 64, "VvmSodaTranscriptionWorker.java").v("soda file transcription will be retried in 5 min or more");
                return new gse();
            case 15:
                vcr vcrVar3 = (vcr) obj;
                int i2 = vcrVar3.b;
                if (i2 != 1) {
                    if (i2 != 2) {
                        return 4;
                    }
                    vcp vcpVar2 = (vcp) vcrVar3.c;
                    if (vcpVar2.b == 1) {
                        vbsVarB2 = defpackage.vbs.b(((java.lang.Integer) vcpVar2.c).intValue());
                        if (vbsVarB2 == null) {
                            vbsVarB2 = defpackage.vbs.UNRECOGNIZED;
                        }
                    } else {
                        vbsVarB2 = defpackage.vbs.UNSPECIFIED;
                    }
                    if (vbsVarB2 != defpackage.vbs.PIN_CHANGE_NEW_UNCHANGED) {
                        return 4;
                    }
                }
                return 0;
            case 16:
                vcr vcrVar4 = (vcr) obj;
                if (vcrVar4.b != 1) {
                    aimw aimwVarL = defpackage.vqt.a.b().l("com/android/dialer/voicemail/settings/pin/SchedulerPinChanger", "changePin", 64, "SchedulerPinChanger.java");
                    vcp vcpVar3 = vcrVar4.b == 2 ? (vcp) vcrVar4.c : vcp.a;
                    if (vcpVar3.b == 1) {
                        vbsVarB3 = defpackage.vbs.b(((java.lang.Integer) vcpVar3.c).intValue());
                        if (vbsVarB3 == null) {
                            vbsVarB3 = defpackage.vbs.UNRECOGNIZED;
                        }
                    } else {
                        vbsVarB3 = defpackage.vbs.UNSPECIFIED;
                    }
                    aimwVarL.y("VVM pin change failure reason: %s", vbsVarB3);
                    vcp vcpVar4 = vcrVar4.b == 2 ? (vcp) vcrVar4.c : vcp.a;
                    if (vcpVar4.b == 1) {
                        vbsVarB4 = defpackage.vbs.b(((java.lang.Integer) vcpVar4.c).intValue());
                        if (vbsVarB4 == null) {
                            vbsVarB4 = defpackage.vbs.UNRECOGNIZED;
                        }
                    } else {
                        vbsVarB4 = defpackage.vbs.UNSPECIFIED;
                    }
                    switch (vbsVarB4.ordinal()) {
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            return 1;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            return 2;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        case 15:
                            return 3;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            return 5;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                            return 4;
                        case 16:
                            return 7;
                        case 17:
                            return 8;
                        default:
                            return 6;
                    }
                }
                return 0;
            case 17:
                ((defpackage.txk) obj).b();
                return null;
            case 18:
                return agxh.a((defpackage.vru) obj, j$.time.Instant.now());
            case 19:
                return (java.lang.Boolean) obj;
            default:
                return afsq.bU((java.lang.Boolean) obj);
        }
    }
}
