package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class adpb implements defpackage.adpf {
    private final j$.util.Optional a;

    public adpb(j$.util.Optional optional) {
        this.a = optional;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    @Override // defpackage.adpf
    public defpackage.afpl a(android.media.AudioFormat audioFormat) throws adpd {
        int i;
        int sampleRate = audioFormat.getSampleRate();
        int channelCount = audioFormat.getChannelCount();
        int i2 = 2;
        if (channelCount == 1) {
            i = 16;
        } else {
            if (channelCount != 2) {
                throw new java.lang.IllegalArgumentException(a.bj(channelCount, "Unsupported number of channels: "));
            }
            i = 12;
        }
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(sampleRate, i, audioFormat.getEncoding());
        int sampleRate2 = audioFormat.getSampleRate();
        int encoding = audioFormat.getEncoding();
        if (encoding != 2) {
            if (encoding != 3) {
                throw new java.lang.IllegalArgumentException(a.bj(encoding, "Unsupported audio encoding: "));
            }
            i2 = 1;
        }
        try {
            android.media.AudioRecord audioRecordBuild = new android.media.AudioRecord.Builder().setAudioFormat(audioFormat).setAudioSource(3).setBufferSizeInBytes(java.lang.Math.max(minBufferSize, sampleRate2 * i2 * audioFormat.getChannelCount())).build();
            j$.util.Optional optional = this.a;
            return new defpackage.afpl(audioRecordBuild, (java.util.Set) (optional.isPresent() ? new aile(new adoz((kvt) optional.get())) : aikn.a));
        } catch (java.lang.Exception e) {
            throw new adpd(e);
        }
    }
}
