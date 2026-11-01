package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvl implements java.lang.Runnable {
    private final /* synthetic */ int $cid;

    public fvl(androidx.media3.ui.AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aspectRatioFrameLayout);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case 16:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return;
            case 2:
                com.android.dialer.callscreen.impl.history.CallScreenSessionActivity.n.b().l("com/android/dialer/callscreen/impl/history/CallScreenSessionActivity", "delete", 295, "CallScreenSessionActivity.java").v("Transcript deleted");
                return;
            case 4:
                qbl.a.b().l("com/android/dialer/incall/logging/impl/datalogger/InCallDataLogger", "getProtoData", 148, "InCallDataLogger.java").v("No TetheredDialerWearMetric available.");
                return;
            case 8:
                tez.a.d().m(aioa.b).l("com/android/dialer/search/composables/DefaultSearchRowClickEventListener$Companion", "runIfPresent$<anonymous>", 236, "DefaultSearchRowClickEventListener.kt").v("Failed to execute action");
                return;
            case 10:
                vva.b.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "deleteVoicemailWithDelay", 738, "VoicemailDataServiceImpl.java").v("starting deletion");
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                try {
                    java.lang.Thread.sleep(600000L);
                    break;
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    synchronized (abcz.class) {
                        java.lang.Thread thread = abcz.b;
                        if (thread != null && thread.isAlive()) {
                            android.util.Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e);
                            return;
                        }
                    }
                }
                abcz.b();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                throw new java.lang.RuntimeException("Someone quit the @LightweightExecutor looper");
            default:
                java.lang.Throwable th = new java.lang.Throwable();
                th.fillInStackTrace();
                a.by(agtm.a.c(), "b/66999648 detected", "com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl$1", "run", (char) 225, "FuturesMixinImpl.java", th);
                return;
        }
    }

    public fvl(com.google.android.setupdesign.view.BottomScrollView bottomScrollView, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(bottomScrollView);
    }

    public fvl(agtm agtmVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agtmVar);
    }
}
