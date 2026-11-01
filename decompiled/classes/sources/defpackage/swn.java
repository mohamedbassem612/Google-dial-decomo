package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class swn {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/AudioProcessingCompatibilityChecker");
    private final android.content.Context b;
    private final defpackage.rlv c;
    private final defpackage.aoin d;

    public swn(android.content.Context context, defpackage.rlv rlvVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.c = rlvVar;
        this.d = aoinVar;
    }

    public final boolean a() {
        android.content.Context context = this.b;
        if (context.getApplicationInfo().targetSdkVersion < 30) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/AudioProcessingCompatibilityChecker", "supportsAudioProcessingState", 56, "AudioProcessingCompatibilityChecker.java")).z("unable to support audio processing if Dialer app doesn't targetSDK to at least %d, the app targets:%d", 30, context.getApplicationInfo().targetSdkVersion);
            this.c.o(defpackage.rmx.AUDIO_PROCESSING_UNAVAILABLE_DUE_TO_TARGET_SDK);
            return false;
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.d.a()).booleanValue();
        defpackage.aimz aimzVar = a;
        if (zBooleanValue) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/revelio/AudioProcessingCompatibilityChecker", "supportsAudioProcessingState", 72, "AudioProcessingCompatibilityChecker.java")).v("device is able to support audio processing - Dialer flags are on, and all other pre-requisites are met");
            this.c.o(defpackage.rmx.AUDIO_PROCESSING_AVAILABLE);
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/revelio/AudioProcessingCompatibilityChecker", "supportsAudioProcessingState", 66, "AudioProcessingCompatibilityChecker.java")).v("unable to support audio processing - Dialer flag is turned off");
        this.c.o(defpackage.rmx.AUDIO_PROCESSING_UNAVAILABLE_DUE_TO_DISABLED_FLAG);
        return false;
    }
}
