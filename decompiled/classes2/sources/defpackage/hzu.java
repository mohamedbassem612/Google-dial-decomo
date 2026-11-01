package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzu implements defpackage.hzk {
    public static final android.media.AudioFormat a;
    private final android.media.AudioRecord b;

    static {
        android.media.AudioFormat audioFormatBuild = new android.media.AudioFormat.Builder().setChannelMask(16).setSampleRate(16000).setEncoding(2).build();
        aooh.e(audioFormatBuild, "build(...)");
        a = audioFormatBuild;
    }

    public hzu() {
        android.media.AudioFormat audioFormat = a;
        this.b = new android.media.AudioRecord(2, audioFormat.getSampleRate(), audioFormat.getChannelMask(), audioFormat.getEncoding(), audioFormat.getSampleRate());
    }

    @Override // defpackage.hzk
    public final void a() {
        this.b.startRecording();
    }

    @Override // defpackage.hzk
    public final void b() {
        android.media.AudioRecord audioRecord = this.b;
        audioRecord.stop();
        audioRecord.release();
    }

    @Override // defpackage.hzk
    public final boolean c() {
        return this.b.getRecordingState() == 3;
    }

    @Override // defpackage.hzk
    public final int d(byte[] bArr, int i) {
        aooh.f(bArr, "buffer");
        return this.b.read(bArr, 0, i, 1);
    }
}
