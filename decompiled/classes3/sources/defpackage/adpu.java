package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpu implements defpackage.adph {
    public static final aimz a = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voip/VoipUplinkAudioTrackFactory");
    public final java.util.List b = new java.util.ArrayList();
    private final defpackage.vqf c;
    private final defpackage.vqf d;

    public adpu(defpackage.vqf vqfVar, defpackage.vqf vqfVar2) {
        this.d = vqfVar2;
        this.c = vqfVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    @Override // defpackage.adph
    public final defpackage.vqf a(android.media.AudioFormat audioFormat) throws adpd {
        java.lang.Object objB = defpackage.adpa.b(defpackage.adpa.a("android.media.audiopolicy.AudioPolicy"), "createAudioTrackSource", new java.lang.Class[]{defpackage.adpa.a("android.media.audiopolicy.AudioMix")}, android.media.AudioTrack.class, this.c.a, this.d.a);
        if (objB == null) {
            throw new adpd("createAudioTrackSource returned null");
        }
        android.media.AudioTrack audioTrack = (android.media.AudioTrack) objB;
        if (audioTrack.getState() == 1) {
            audioTrack.setPlaybackRate(audioFormat.getSampleRate());
            this.b.add(audioTrack);
            return new defpackage.vqf(audioTrack);
        }
        throw new adpd("Failed to create audio track, current state: " + audioTrack.getState());
    }
}
