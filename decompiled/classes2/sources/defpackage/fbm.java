package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fbm {
    public final android.os.Handler a;
    public final android.media.AudioTrack$StreamEventCallback b;
    final /* synthetic */ defpackage.fbn c;

    public fbm(defpackage.fbn fbnVar) {
        j$.util.Objects.requireNonNull(fbnVar);
        this.c = fbnVar;
        android.os.Handler handlerAh = eum.ah();
        this.a = handlerAh;
        defpackage.fbl fblVar = new defpackage.fbl(this);
        this.b = fblVar;
        android.media.AudioTrack audioTrack = fbnVar.d;
        j$.util.Objects.requireNonNull(handlerAh);
        fn$.ExternalSyntheticApiModelOutline0.m(audioTrack, new defpackage.fbk(handlerAh, 0), fblVar);
    }
}
