package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lhl implements android.media.AudioManager.OnAudioFocusChangeListener {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer");
    public final oju b;
    public final defpackage.oii c;
    private final zdl d;
    private final java.util.concurrent.Executor e;

    public lhl(zdl zdlVar, oju ojuVar, uss ussVar, ajct ajctVar) {
        this.d = zdlVar;
        this.b = ojuVar;
        this.e = new ajdc(ajctVar);
        this.c = ussVar.o();
    }

    public final ajcq a(android.net.Uri uri) {
        a.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "playDemoAudio", 72, "DemoAudioPlayer.java").y("demoAudioUri: %s", uri);
        return ahvr.I(this.d.a(uri), new defpackage.kwa(this, uri, 17, null), this.e);
    }

    public final void b() {
        a.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "stopPlayback", 146, "DemoAudioPlayer.java").v("enter");
        agsm.i(294, ahvr.E(new defpackage.ldf(this, 11), this.e), "failed to stop playback", new java.lang.Object[0]);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -3 || i == -2 || i == -1) {
            a.b().l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "onAudioFocusChange", 137, "DemoAudioPlayer.java").w("focus lost: %d", i);
            b();
            return;
        }
        aimw aimwVarB = a.b();
        if (i != 1) {
            aimwVarB.l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "onAudioFocusChange", 141, "DemoAudioPlayer.java").w("unexpected focus: %d", i);
        } else {
            aimwVarB.l("com/android/dialer/callscreen/impl/settings/DemoAudioPlayer", "onAudioFocusChange", 132, "DemoAudioPlayer.java").v("focus gained");
        }
    }
}
