package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iaf implements defpackage.hzi {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/audiocontroller/stub/StubAudioController");
    private final defpackage.iad b;
    private final defpackage.iae c = new defpackage.iae();

    private iaf(android.media.AudioFormat audioFormat) {
        this.b = new defpackage.iad(audioFormat);
    }

    public static defpackage.iaf e(int i) {
        return new defpackage.iaf(new android.media.AudioFormat.Builder().setChannelMask(16).setSampleRate(i).setEncoding(2).build());
    }

    @Override // defpackage.hzi
    public final defpackage.hzl a(defpackage.hzh hzhVar) {
        return this.b;
    }

    @Override // defpackage.hzi
    public final defpackage.hzm b(java.lang.Runnable runnable, java.util.function.Consumer consumer) {
        throw new java.lang.IllegalStateException("cannot play into stub audio");
    }

    @Override // defpackage.hzi
    public final defpackage.hzo c() {
        return this.c;
    }

    @Override // defpackage.hzi
    public final ajcq d() {
        return ajcm.a;
    }
}
