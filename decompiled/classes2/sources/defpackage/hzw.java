package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzw implements defpackage.hzk {
    public static final android.media.AudioFormat a = new android.media.AudioFormat.Builder().setChannelMask(16).setSampleRate(8000).setEncoding(2).build();
    private final android.media.AudioRecord b;

    public hzw() {
        android.media.AudioFormat audioFormat = a;
        this.b = new android.media.AudioRecord(4, audioFormat.getSampleRate(), audioFormat.getChannelMask(), audioFormat.getEncoding(), audioFormat.getSampleRate());
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
        return this.b.read(bArr, 0, i, 1);
    }
}
