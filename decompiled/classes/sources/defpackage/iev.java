package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iev implements defpackage.erg {
    final /* synthetic */ defpackage.iez a;
    private java.lang.Long b;

    public iev(defpackage.iez iezVar) {
        this.a = iezVar;
    }

    private final void A(int i) {
        vaa vaaVarQ = akky.Q(defpackage.amod.a.m());
        defpackage.iez iezVar = this.a;
        vaaVarQ.an(iezVar.d());
        vaaVarQ.ao(i);
        iezVar.e.c(vaaVarQ.am());
    }

    @Override // defpackage.erg
    public final void g(boolean z) {
        defpackage.iez iezVar = this.a;
        iezVar.i(iezVar.l, z);
        if (!z) {
            iezVar.r();
            return;
        }
        java.lang.Long l = this.b;
        if (l != null) {
            this.b = null;
            long jA = (iezVar.i.a() - l.longValue()) / 1000000;
            ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$audioPlayerListener$<anonymous>", "onIsPlayingChanged", 130, "AudioPlayer.kt")).x("playback latency (ms): %d", jA);
            defpackage.rlv rlvVar = iezVar.e;
            vaa vaaVarQ = akky.Q(defpackage.amod.a.m());
            vaaVarQ.an(iezVar.d());
            defpackage.akzx akzxVar = (defpackage.akzx) vaaVarQ.a;
            akzxVar.u();
            defpackage.amod amodVar = (defpackage.amod) akzxVar.b;
            amodVar.b |= 4;
            amodVar.e = jA;
            rlvVar.c(vaaVarQ.am());
        }
        if (iezVar.m.getAndSet(true)) {
            return;
        }
        defpackage.dvx.f(iezVar.b, iezVar.n, new android.content.IntentFilter("android.media.AUDIO_BECOMING_NOISY"), null, 2);
    }

    @Override // defpackage.erg
    public final void l(boolean z, int i) {
        if (z && i == 1) {
            defpackage.iez iezVar = this.a;
            androidx.media3.exoplayer.ExoPlayer exoPlayer = iezVar.j;
            if (exoPlayer == null || exoPlayer.k() != 3) {
                this.b = java.lang.Long.valueOf(iezVar.i.a());
            }
        }
    }

    @Override // defpackage.erg
    public final void n(int i) {
        if (i == 4) {
            ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$audioPlayerListener$<anonymous>", "onPlaybackStateChanged", 141, "AudioPlayer.kt")).v("playback ended");
            A(13);
            defpackage.iez iezVar = this.a;
            iezVar.j(false);
            androidx.media3.exoplayer.ExoPlayer exoPlayer = iezVar.j;
            if (exoPlayer != null) {
                exoPlayer.c(0L);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: odq */
    @Override // defpackage.erg
    public final void p(erb erbVar) throws odq {
        defpackage.aooh.f(erbVar, "error");
        defpackage.iez iezVar = this.a;
        if (((java.lang.Boolean) iezVar.g.a()).booleanValue()) {
            iezVar.f.a(erbVar);
        }
        A(14);
        iezVar.p.a();
    }

    @Override // defpackage.erg
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void P(boolean z) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void a(int i) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void b(ere ereVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void c(est estVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void d(java.util.List list) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void j(eqw eqwVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void k(eqy eqyVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void m(erc ercVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void q(erb erbVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void v(boolean z) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void y(ert ertVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void z(ery eryVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void M(eri eriVar, erf erfVar) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void Q(eqt eqtVar, int i) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void w(int i, int i2) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void x(erm ermVar, int i) {
    }

    @Override // defpackage.erg
    public final /* synthetic */ void t(erh erhVar, erh erhVar2, int i) {
    }
}
