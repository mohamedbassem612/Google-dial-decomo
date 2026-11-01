package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lem {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer");
    public final defpackage.lgi b;
    public final zmq c;
    public final android.media.AudioManager d;
    public final java.util.concurrent.Executor e;
    public j$.util.Optional f = j$.util.Optional.empty();
    public boolean g;

    public lem(android.media.AudioManager audioManager, defpackage.lgi lgiVar, zmq zmqVar, ajct ajctVar) {
        this.d = audioManager;
        this.b = lgiVar;
        this.c = zmqVar;
        this.e = new ajdc(ajctVar);
    }

    public final ajcq a() {
        return ahvr.F(new defpackage.jyr(this, 20), this.e);
    }
}
