package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iew extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.ahpz a;
    final /* synthetic */ defpackage.iez b;

    public iew(defpackage.ahpz ahpzVar, defpackage.iez iezVar) {
        this.a = ahpzVar;
        this.b = iezVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) throws java.io.IOException {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(intent, "intent");
        if (defpackage.aooh.n(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
            defpackage.ahpz ahpzVar = this.a;
            defpackage.iez iezVar = this.b;
            defpackage.ahok ahokVarF = ahpzVar.f(113, "Broadcast to AudioPlayer.becomingNoisyReceiver");
            try {
                ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$becomingNoisyReceiver$<anonymous>", "onReceive$<anonymous>", 99, "AudioPlayer.kt")).v("pause audio playback due to audio becoming noisy");
                iezVar.j(false);
                iezVar.o();
                defpackage.ajsz.ak(ahokVarF, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahokVarF, th);
                    throw th2;
                }
            }
        }
    }
}
