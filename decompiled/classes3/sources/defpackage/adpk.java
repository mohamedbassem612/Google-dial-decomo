package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpk extends defpackage.adpc {
    private static final aimz b = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallDirectAudioController");
    private static final java.lang.String[] c = {"android.permission.MODIFY_AUDIO_SETTINGS"};
    private final java.lang.Object d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final java.lang.String g;

    public adpk(android.content.Context context) {
        super(context, c);
        this.d = new java.lang.Object();
        this.e = "rx";
        this.f = java.lang.String.format(java.util.Locale.US, "direction=%s;device_mute=%s;", "rx", "true");
        this.g = java.lang.String.format(java.util.Locale.US, "direction=%s;device_mute=%s;", "rx", "false");
    }

    @Override // defpackage.adpc
    public final void d() {
        this.a.setParameters(this.f);
        synchronized (this.d) {
        }
        b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallDirectAudioController", "mute", 61, "VoiceCallDirectAudioController.java").y("%s Device was muted", this.e);
    }

    @Override // defpackage.adpc
    public final void e() {
        this.a.setParameters(this.g);
        synchronized (this.d) {
        }
        b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallDirectAudioController", "unmute", 70, "VoiceCallDirectAudioController.java").y("%s Device was unmuted", this.e);
    }
}
