package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ief implements defpackage.emj {
    final /* synthetic */ defpackage.aw a;
    final /* synthetic */ defpackage.cop b;

    public ief(defpackage.cop copVar, defpackage.aw awVar) {
        this.b = copVar;
        this.a = awVar;
    }

    @Override // defpackage.emj
    public final void a(defpackage.emx emxVar) {
        defpackage.iez iezVar = (defpackage.iez) this.b.e;
        iezVar.h++;
        ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "onRegisterHostFragment", 367, "AudioPlayer.kt")).w("registered host fragment count: %d", iezVar.h);
    }

    @Override // defpackage.emj
    public final void b(defpackage.emx emxVar) {
        defpackage.cop copVar = this.b;
        boolean zIsChangingConfigurations = ((defpackage.az) copVar.c).isChangingConfigurations();
        defpackage.iez iezVar = (defpackage.iez) copVar.e;
        int i = iezVar.h - 1;
        iezVar.h = i;
        if (!zIsChangingConfigurations) {
            if (i == 0) {
                ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "onDestroyHostFragment", 381, "AudioPlayer.kt")).v("AudioPlayer is no longer used by any fragments");
                iezVar.l = null;
                defpackage.iep iepVar = iezVar.d;
                defpackage.ieu ieuVar = iezVar.o;
                defpackage.aooh.f(ieuVar, "audioDeviceCallback");
                if (iepVar.g.getAndSet(false)) {
                    iepVar.a().unregisterAudioDeviceCallback(ieuVar);
                }
                iezVar.i(null, false);
            }
            iezVar.k = null;
            androidx.media3.exoplayer.ExoPlayer exoPlayer = iezVar.j;
            if (exoPlayer != null) {
                ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "cleanUpPlayer", 398, "AudioPlayer.kt")).v("Release ExoPlayer instance.");
                iezVar.r();
                exoPlayer.B((android.media.AudioDeviceInfo) null);
                exoPlayer.A();
                iezVar.j = null;
            }
        }
        emxVar.P().d(this);
    }

    @Override // defpackage.emj
    public final void c(defpackage.emx emxVar) {
        defpackage.cop copVar = this.b;
        defpackage.az azVar = (defpackage.az) copVar.c;
        if (!azVar.isChangingConfigurations()) {
            ((defpackage.iez) copVar.e).j(false);
            ife ifeVarE = this.a.I().e("AudioDeviceSelectorDialog");
            if (ifeVarE != null) {
                ifeVarE.f();
            }
        }
        azVar.setVolumeControlStream(Integer.MIN_VALUE);
    }

    @Override // defpackage.emj
    public final void fn(defpackage.emx emxVar) {
        defpackage.cop copVar = this.b;
        ((defpackage.az) copVar.c).setVolumeControlStream(((defpackage.iez) copVar.e).a());
    }

    @Override // defpackage.emj
    public final /* synthetic */ void e(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void f(defpackage.emx emxVar) {
    }
}
