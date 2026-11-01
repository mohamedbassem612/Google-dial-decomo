package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adpo {
    public static final aimz a = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallTxControllerFactory");

    static {
        try {
            java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class);
        } catch (java.lang.Exception unused) {
            a.c().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallTxControllerFactory", "<clinit>", 28, "VoiceCallTxControllerFactory.java").v("Error getting SystemProperties.get()");
        }
    }
}
