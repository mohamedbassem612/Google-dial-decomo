package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpj implements adpe {
    private static final aimz b = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallAudioManager");
    defpackage.afpl a;
    private final android.content.Context c;
    private defpackage.adpb d;
    private defpackage.adpp e;
    private defpackage.adpc f;
    private defpackage.adpc g;
    private final j$.util.Optional h;
    private boolean i;

    public adpj(android.content.Context context, j$.util.Optional optional) {
        this.c = context;
        this.h = optional;
    }

    private final synchronized void j() {
        ahvr.bZ(this.i, "VoiceCallAudioManager is not initialized");
    }

    public final int a() {
        return 8000;
    }

    public final defpackage.adpc b() {
        j();
        return this.f;
    }

    public final defpackage.adpc c() {
        j();
        return this.g;
    }

    public final defpackage.adpf d() {
        j();
        return this.d;
    }

    public final defpackage.adph e() {
        j();
        return this.e;
    }

    public final synchronized void f() {
        if (this.i) {
            b.d().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallAudioManager", "init", 89, "VoiceCallAudioManager.java").v("init():already initialized.");
            return;
        }
        this.d = new defpackage.adpi(this, this.h);
        android.content.Context context = this.c;
        this.e = new defpackage.adpp(context);
        this.f = new defpackage.adpm(context);
        defpackage.adpo.a.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallTxControllerFactory", "createVoiceCallTxController", 51, "VoiceCallTxControllerFactory.java").v("createVoiceCallTxController(): creating regular controller");
        this.g = new defpackage.adpn(context);
        defpackage.afpl afplVarA = this.d.a(new android.media.AudioFormat.Builder().setChannelMask(16).setEncoding(2).setSampleRate(8000).build());
        this.a = afplVarA;
        try {
            afplVarA.p();
            if (this.a.m() != 3) {
                throw new adpd("init():Audio recording state notrecording, maybe other apps are recording?");
            }
            this.i = true;
            b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallAudioManager", "init", 128, "VoiceCallAudioManager.java").v("init(): init finished successfully");
        } catch (java.lang.IllegalStateException e) {
            throw new adpd("init():Can't start audio recording, maybe other apps are using the recording stream?", e);
        }
    }

    public final synchronized void g() {
        b.b().l("com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallAudioManager", "shutdown", 133, "VoiceCallAudioManager.java").v("shutdown(): shutdown invoked");
        i();
        this.i = false;
    }

    public final synchronized boolean h() {
        return this.i;
    }

    public final synchronized void i() {
        defpackage.afpl afplVar = this.a;
        if (afplVar != null) {
            try {
                afplVar.q();
            } catch (java.lang.IllegalStateException e) {
                a.by(b.d(), "releaseCaptureAudioRecord(): Unable to stop() AudioRecord object.", "com/google/android/libraries/micore/telephony/common/audio/voicecall/VoiceCallAudioManager", "releaseCaptureAudioRecord", (char) 145, "VoiceCallAudioManager.java", e);
            }
            defpackage.afpl afplVar2 = this.a;
            if (afplVar2 != null) {
                afplVar2.o();
            }
            this.a = null;
        }
    }
}
