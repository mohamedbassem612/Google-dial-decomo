package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jya implements ajcb {
    private final /* synthetic */ int $cid;

    public jya(defpackage.ktk ktkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ktkVar);
    }

    public final void a(java.lang.Throwable th) {
        switch (this.$cid) {
            case 0:
                aooh.f(th, "t");
                throw new java.lang.AssertionError(th);
            case 1:
                a.bq(defpackage.hyv.a.c(), "LoggingCallback failure.", "com/android/dialer/audio/impl/AudioControllerSelector$LoggingCallback", "onFailure", (char) 194, "AudioControllerSelector.java", th, zct.b);
                return;
            case 2:
                a.bq(defpackage.ktk.a.c(), "sendFeedbackImpl unable to be completed", "com/android/dialer/callqualityrating/impl/CallQualityRatingFeedbackSenderImpl$1", "onFailure", '=', "CallQualityRatingFeedbackSenderImpl.java", th, zct.b);
                return;
            case 3:
                a.bq(defpackage.kxx.a.c(), "failed to play ending audio", "com/android/dialer/callrecording/impl/service/CallRecordingButtonController$4", "onFailure", (char) 367, "CallRecordingButtonController.java", th, zct.b);
                return;
            case 4:
                a.bq(defpackage.lbo.a.c(), "set failed", "com/android/dialer/callrecording/impl/storage/CallRecordingStatusInfoStorageImpl$1", "onFailure", ':', "CallRecordingStatusInfoStorageImpl.java", th, zct.b);
                return;
            case 5:
                a.bq(lbq.a.c(), "prewarming TTS failed", "com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm$1", "onFailure", 'V', "TtsPreWarm.java", th, zct.b);
                return;
            case 6:
                a.bq(defpackage.lea.a.d(), "Failed to report spam from postcall survey.", "com/android/dialer/callscreen/impl/postcall/SpamReporter$1", "onFailure", '\'', "SpamReporter.java", th, zct.b);
                return;
            case 7:
                aooh.f(th, "t");
                defpackage.nxq.a.d().k(th).l("com/android/dialer/duo/data/synclet/MeetPhoneNumberSynclet$sync$<anonymous>", "onFailure", 35, "MeetPhoneNumberSynclet.kt").v("Failed to enqueue the Meet reachability batch sync work.");
                return;
            case 8:
                aooh.f(th, "t");
                defpackage.nxs.a.d().k(th).l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchSynclet$sync$<anonymous>", "onFailure", 35, "MeetReachabilityMiniBatchSynclet.kt").v("Failed to enqueue the Meet reachability mini-batch sync work.");
                return;
            case 9:
                a.bq(swv.a.d(), "Failed to upsert revelio settings into persistable spam", "com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl$2", "onFailure", (char) 223, "TidepodsRevelioImpl.java", th, zct.b);
                return;
            case 10:
                a.bq(uqc.a.d(), "Failed to request high resolution photo.", "com/android/dialer/speeddial/loader/SpeedDialUiItemMutator$1", "onFailure", (char) 462, "SpeedDialUiItemMutator.java", th, zct.b);
                return;
            case 11:
                a.bq(uqr.a.c(), "failed to calculate and save score", "com/android/dialer/suggestcontacts/impl/SuggestContactsGlobalContentObserver$1$1", "onFailure", 'M', "SuggestContactsGlobalContentObserver.java", th, zct.b);
                return;
            case 12:
                a.bq(uwp.a.c(), "failed to update transcript audio feedback metrics", "com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger$2", "onFailure", (char) 192, "FeedbackMetricsLogger.java", th, zct.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                a.bq(vol.a.c(), "could not startRecording", "com/android/dialer/voicemail/settings/GreetingRecorder$2", "onFailure", (char) 337, "GreetingRecorder.java", th, zct.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                a.bq(vol.a.c(), "could not startPlayback", "com/android/dialer/voicemail/settings/GreetingRecorder$3", "onFailure", (char) 399, "GreetingRecorder.java", th, zct.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                acop.a.c().k(th).l("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideEventResultHandler", 24, "FloggerResultDaggerModule.java").t();
                return;
            case 16:
                android.util.Log.w("OneGoogle", "Failed to grant account access to app", th);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (th instanceof aemn) {
                    return;
                }
                android.util.Log.w("OneGoogle", java.lang.String.format("Failed to load owner avatar. exception type: %s", th.getClass().getName()));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (android.util.Log.isLoggable("ClearcutMetricXmitter", 4)) {
                    android.util.Log.i("ClearcutMetricXmitter", "Transmission has failed: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(th))));
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                a.by(aljc.a.c(), "Consuming input stream failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/AudioMulticaster$1", "onFailure", 'T', "AudioMulticaster.java", th);
                return;
            default:
                a.by(alji.a.c(), "Consuming input stream failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/TimingAudioInputRunner$2", "onFailure", 'f', "TimingAudioInputRunner.java", th);
                return;
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                defpackage.ktk.a.b().l("com/android/dialer/callqualityrating/impl/CallQualityRatingFeedbackSenderImpl$1", "onSuccess", 52, "CallQualityRatingFeedbackSenderImpl.java").v("sendFeedbackImpl completed successfully");
                break;
            case 3:
                defpackage.kxx.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController$4", "onSuccess", 362, "CallRecordingButtonController.java").y("playing of ending audio ended with reason: %s", (defpackage.hxe) obj);
                break;
            case 4:
                defpackage.lbo.a.b().l("com/android/dialer/callrecording/impl/storage/CallRecordingStatusInfoStorageImpl$1", "onSuccess", 53, "CallRecordingStatusInfoStorageImpl.java").v("set succeeded");
                break;
            case 5:
                lbq.a.b().l("com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm$1", "onSuccess", 77, "TtsPreWarm.java").v("prewarming TTS succeeded");
                break;
            case 6:
                defpackage.lea.a.b().l("com/android/dialer/callscreen/impl/postcall/SpamReporter$1", "onSuccess", 30, "SpamReporter.java").v("Reported spam from postcall survey.");
                break;
            case 7:
                aooh.f((java.util.UUID) obj, "result");
                break;
            case 8:
                aooh.f((java.util.UUID) obj, "result");
                break;
            case 9:
                swv.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl$2", "onSuccess", 214, "TidepodsRevelioImpl.java").v("Revelio settings upserted in persistable spam");
                break;
            case 10:
                uqc.a.b().l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator$1", "onSuccess", 453, "SpeedDialUiItemMutator.java").v("Successfully requested high resolution photo.");
                break;
            case 11:
                uqr.a.b().l("com/android/dialer/suggestcontacts/impl/SuggestContactsGlobalContentObserver$1$1", "onSuccess", 68, "SuggestContactsGlobalContentObserver.java").v("successfully calculated and saved score");
                break;
            case 12:
                uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger$2", "onSuccess", 183, "FeedbackMetricsLogger.java").v("successfully updated transcript audio feedback metrics");
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                vol.a.b().l("com/android/dialer/voicemail/settings/GreetingRecorder$2", "onSuccess", 332, "GreetingRecorder.java").v("successfully startRecording");
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                vol.a.b().l("com/android/dialer/voicemail/settings/GreetingRecorder$3", "onSuccess", 394, "GreetingRecorder.java").v("successfully startPlayback");
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    android.util.Log.e("OneGoogle", "Failed to grant account access to app");
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                android.util.Log.v("ClearcutMetricXmitter", "Transmission is done.");
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
    }

    public jya(int i) {
        this.$cid = i;
    }

    public jya(defpackage.kxx kxxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(kxxVar);
    }

    public jya(defpackage.lbo lboVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(lboVar);
    }

    public jya(lbq lbqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(lbqVar);
    }

    public jya(defpackage.lea leaVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(leaVar);
    }

    public jya(swv swvVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(swvVar);
    }

    public jya(uqc uqcVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uqcVar);
    }

    public jya(uqq uqqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uqqVar);
    }

    public jya(uwp uwpVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uwpVar);
    }

    public jya(vol volVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(volVar);
    }

    public jya(vol volVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(volVar);
    }

    public jya(aaoo aaooVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aaooVar);
    }

    public jya(tvn tvnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(tvnVar);
    }

    public jya(ahex ahexVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ahexVar);
    }

    public jya(aljc aljcVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljcVar);
    }

    public jya(alji aljiVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljiVar);
    }
}
