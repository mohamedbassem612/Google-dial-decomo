package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpm extends defpackage.adpc {
    private static final aimz b = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallRxController");
    private static final java.lang.String[] c = {"android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.MODIFY_PHONE_STATE"};
    private final defpackage.adpl d;
    private final defpackage.adpk e;

    public adpm(android.content.Context context) {
        super(context, c);
        defpackage.adpl adplVarA = a(context);
        this.d = adplVarA;
        if (adplVarA.a) {
            this.e = null;
        } else {
            b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallRxController", "<init>", 74, "VoiceCallRxController.java").v("VOICE_CALL is not in list of mutable streams, using direct mute instead");
            this.e = new defpackage.adpk(context);
        }
    }

    private static defpackage.adpl a(android.content.Context context) {
        try {
            int i = android.provider.Settings.System.getInt(context.getContentResolver(), "mute_streams_affected");
            int i2 = i & 1;
            return new defpackage.adpl(1 == i2, (i & 64) == 64);
        } catch (android.provider.Settings.SettingNotFoundException e) {
            a.by(b.d(), "Error while trying to retrieve MUTE_STREAMS_AFFECTED setting, treating as false", "com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallRxController", "getMuteStreamsSettings", (char) 161, "VoiceCallRxController.java", e);
            return new defpackage.adpl(false, false);
        }
    }

    private final void b(int i, int i2) {
        this.a.adjustStreamVolume(i, i2, 0);
    }

    @Override // defpackage.adpc
    public final void d() {
        defpackage.adpk adpkVar = this.e;
        if (adpkVar != null) {
            adpkVar.d();
            return;
        }
        b(0, -100);
        if (!this.d.b) {
            b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallRxController", "mute", 94, "VoiceCallRxController.java").v("RX Device was muted for voice call stream");
        } else {
            b(6, -100);
            b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallRxController", "mute", 92, "VoiceCallRxController.java").v("RX Device was muted for voice call and BT streams");
        }
    }

    @Override // defpackage.adpc
    public final void e() {
        defpackage.adpk adpkVar = this.e;
        if (adpkVar != null) {
            adpkVar.e();
            return;
        }
        b(0, 100);
        if (!this.d.b) {
            b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallRxController", "unmute", 109, "VoiceCallRxController.java").v("RX Device was unmuted for voice call stream");
        } else {
            b(6, 100);
            b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallRxController", "unmute", 107, "VoiceCallRxController.java").v("RX Device was unmuted for voice call and BT streams");
        }
    }

    @Override // defpackage.adpc
    public final boolean f() {
        return this.d.a;
    }
}
