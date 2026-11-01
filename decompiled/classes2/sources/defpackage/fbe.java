package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fbe {
    public final android.media.AudioTrack a;
    public final android.media.AudioTimestamp b = new android.media.AudioTimestamp();
    public long c;
    public long d;
    public long e;
    public long f;

    public fbe(android.media.AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
