package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fdq implements defpackage.fdz {
    public final ahzi a;
    public final ahzi b;
    public boolean c;

    public fdq(final int i) {
        final int i2 = 1;
        ahzi ahziVar = new ahzi() { // from class: fdp
            public final java.lang.Object eZ() {
                int i3 = i2;
                int i4 = i;
                return i3 != 0 ? new android.os.HandlerThread(defpackage.fdr.d(i4, "ExoPlayer:MediaCodecAsyncAdapter:")) : new android.os.HandlerThread(defpackage.fdr.d(i4, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        final int i3 = 0;
        ahzi ahziVar2 = new ahzi() { // from class: fdp
            public final java.lang.Object eZ() {
                int i4 = i3;
                int i5 = i;
                return i4 != 0 ? new android.os.HandlerThread(defpackage.fdr.d(i5, "ExoPlayer:MediaCodecAsyncAdapter:")) : new android.os.HandlerThread(defpackage.fdr.d(i5, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.a = ahziVar;
        this.b = ahziVar2;
        this.c = true;
    }
}
