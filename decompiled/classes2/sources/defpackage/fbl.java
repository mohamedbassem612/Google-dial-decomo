package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fbl extends android.media.AudioTrack$StreamEventCallback {
    final /* synthetic */ defpackage.fbm a;

    public fbl(defpackage.fbm fbmVar) {
        j$.util.Objects.requireNonNull(fbmVar);
        this.a = fbmVar;
    }

    public final void onDataRequest(android.media.AudioTrack audioTrack, int i) {
        this.a.c.k.e(-1, new defpackage.ezt(11));
    }

    public final void onPresentationEnded(android.media.AudioTrack audioTrack) {
        this.a.c.k.e(-1, new defpackage.ezt(12));
    }

    public final void onTearDown(android.media.AudioTrack audioTrack) {
        this.a.c.k.e(-1, new defpackage.ezt(11));
    }
}
