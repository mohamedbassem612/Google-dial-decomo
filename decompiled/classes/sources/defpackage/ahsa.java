package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahsa implements defpackage.erg {
    final /* synthetic */ defpackage.erg a;
    final /* synthetic */ defpackage.ahda b;

    public ahsa(defpackage.ahda ahdaVar, defpackage.erg ergVar) {
        this.b = ahdaVar;
        this.a = ergVar;
    }

    @Override // defpackage.erg
    public final void M(eri eriVar, erf erfVar) throws java.io.IOException {
        defpackage.aooh.f(eriVar, "player");
        this.b.n("onEvents", new acri(this.a, eriVar, erfVar, 3));
    }

    @Override // defpackage.erg
    public final void P(boolean z) throws java.io.IOException {
        this.b.n("onLoadingChanged", new bfv(this.a, z, 6));
    }

    @Override // defpackage.erg
    public final void Q(eqt eqtVar, int i) throws java.io.IOException {
        this.b.n("onMediaItemTransition", new defpackage.agsd(this.a, eqtVar, i, 3));
    }

    @Override // defpackage.erg
    public final void a(int i) throws java.io.IOException {
        this.b.n("onAudioSessionIdChanged", new ahrx(this.a, i, 3));
    }

    @Override // defpackage.erg
    public final void b(ere ereVar) throws java.io.IOException {
        defpackage.aooh.f(ereVar, "availableCommands");
        this.b.n("onAvailableCommandsChanged", new ahcm(this.a, ereVar, 11));
    }

    @Override // defpackage.erg
    public final void c(est estVar) throws java.io.IOException {
        defpackage.aooh.f(estVar, "cueGroup");
        this.b.n("onCues", new ahcm(this.a, estVar, 10, (byte[]) null));
    }

    @Override // defpackage.erg
    public final void d(java.util.List list) throws java.io.IOException {
        defpackage.aooh.f(list, "cues");
        this.b.n("onCues", new ahcm(this.a, list, 2, (byte[]) null));
    }

    @Override // defpackage.erg
    public final void f(boolean z) throws java.io.IOException {
        this.b.n("onIsLoadingChanged", new bfv(this.a, z, 3));
    }

    @Override // defpackage.erg
    public final void g(boolean z) throws java.io.IOException {
        this.b.n("onIsPlayingChanged", new bfv(this.a, z, 5));
    }

    @Override // defpackage.erg
    public final void j(eqw eqwVar) throws java.io.IOException {
        defpackage.aooh.f(eqwVar, "mediaMetadata");
        this.b.n("onMediaMetadataChanged", new ahcm(this.a, eqwVar, 4));
    }

    @Override // defpackage.erg
    public final void k(eqy eqyVar) throws java.io.IOException {
        defpackage.aooh.f(eqyVar, "metadata");
        this.b.n("onMetadata", new ahcm(this.a, eqyVar, 9));
    }

    @Override // defpackage.erg
    public final void l(boolean z, int i) throws java.io.IOException {
        this.b.n("onPlayWhenReadyChanged", new ahrz(this.a, z, i, 0));
    }

    @Override // defpackage.erg
    public final void m(erc ercVar) throws java.io.IOException {
        defpackage.aooh.f(ercVar, "playbackParameters");
        this.b.n("onPlaybackParametersChanged", new ahcm(this.a, ercVar, 5));
    }

    @Override // defpackage.erg
    public final void n(int i) throws java.io.IOException {
        this.b.n("onPlaybackStateChanged", new ahrx(this.a, i, 0));
    }

    @Override // defpackage.erg
    public final void o(int i) throws java.io.IOException {
        this.b.n("onPlaybackSuppressionReasonChanged", new ahrx(this.a, i, 4));
    }

    @Override // defpackage.erg
    public final void p(erb erbVar) throws java.io.IOException {
        defpackage.aooh.f(erbVar, "error");
        this.b.n("onPlayerError", new ahcm(this.a, erbVar, 6));
    }

    @Override // defpackage.erg
    public final void q(erb erbVar) throws java.io.IOException {
        this.b.n("onPlayerErrorChanged", new ahcm(this.a, erbVar, 7));
    }

    @Override // defpackage.erg
    public final void r(boolean z, int i) throws java.io.IOException {
        this.b.n("onPlayerStateChanged", new ahrz(this.a, z, i, 1));
    }

    @Override // defpackage.erg
    public final void s(int i) throws java.io.IOException {
        this.b.n("onPositionDiscontinuity", new ahrx(this.a, i, 2));
    }

    @Override // defpackage.erg
    public final void t(erh erhVar, erh erhVar2, int i) throws java.io.IOException {
        this.b.n("onPositionDiscontinuity", new acms(this.a, erhVar, erhVar2, i, 4));
    }

    @Override // defpackage.erg
    public final void u() throws java.io.IOException {
        this.b.n("onRenderedFirstFrame", new ahca(this.a, 6));
    }

    @Override // defpackage.erg
    public final void v(boolean z) throws java.io.IOException {
        this.b.n("onSkipSilenceEnabledChanged", new bfv(this.a, z, 4));
    }

    @Override // defpackage.erg
    public final void w(int i, int i2) throws java.io.IOException {
        this.b.n("onSurfaceSizeChanged", new ahry(this.a, i, i2));
    }

    @Override // defpackage.erg
    public final void x(erm ermVar, int i) throws java.io.IOException {
        defpackage.aooh.f(ermVar, "timeline");
        this.b.n("onTimelineChanged", new defpackage.agsd(this.a, ermVar, i, 2));
    }

    @Override // defpackage.erg
    public final void y(ert ertVar) throws java.io.IOException {
        defpackage.aooh.f(ertVar, "tracks");
        this.b.n("onTracksChanged", new ahcm(this.a, ertVar, 3, (byte[]) null));
    }

    @Override // defpackage.erg
    public final void z(ery eryVar) throws java.io.IOException {
        defpackage.aooh.f(eryVar, "videoSize");
        this.b.n("onVideoSizeChanged", new ahcm(this.a, eryVar, 8, (byte[]) null));
    }
}
