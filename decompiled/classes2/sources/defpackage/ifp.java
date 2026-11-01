package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ifp implements erg {
    final /* synthetic */ defpackage.ifq a;

    public ifp(defpackage.ifq ifqVar) {
        this.a = ifqVar;
    }

    public final void f(boolean z) {
        defpackage.ifq ifqVar = this.a;
        defpackage.iek iekVar = ifqVar.k;
        if (iekVar != null) {
            defpackage.ied iedVar = iekVar.c;
            if (iedVar == null) {
                iedVar = defpackage.ied.a;
            }
            if (iedVar != null) {
                long jN = (long) ifqVar.p.n();
                if (z) {
                    iez iezVar = ifqVar.d;
                    if (!iezVar.s(iedVar) || jN >= iedVar.d) {
                        return;
                    }
                    iezVar.p(jN);
                }
            }
        }
    }

    public final void g(boolean z) {
        defpackage.ifq ifqVar = this.a;
        defpackage.iek iekVar = ifqVar.k;
        if (iekVar != null) {
            iez iezVar = ifqVar.d;
            defpackage.ied iedVar = iekVar.c;
            if (iedVar == null) {
                iedVar = defpackage.ied.a;
            }
            aooh.e(iedVar, "getAudioInfo(...)");
            if (iezVar.s(iedVar) && z) {
                ahoq ahoqVarW = ahvr.W(116, "AudioPlaybackViewPeer_onPlaybackStarted");
                try {
                    defpackage.ieg iegVar = ifqVar.o;
                    if (iegVar != null) {
                        iegVar.c();
                    }
                    ifqVar.q.i((java.lang.String) null).b(mce.dJ);
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarW, th);
                        throw th2;
                    }
                }
            }
            defpackage.ifq ifqVar2 = this.a;
            defpackage.ied iedVar2 = iekVar.c;
            if (iedVar2 == null) {
                iedVar2 = defpackage.ied.a;
            }
            aooh.e(iedVar2, "getAudioInfo(...)");
            ifqVar2.a(iedVar2, z);
        }
    }

    public final void n(int i) {
        defpackage.ifq ifqVar = this.a;
        defpackage.iek iekVar = ifqVar.k;
        if (iekVar != null) {
            defpackage.ied iedVar = iekVar.c;
            if (iedVar == null) {
                iedVar = defpackage.ied.a;
            }
            if (iedVar != null) {
                iez iezVar = ifqVar.d;
                if (iezVar.s(iedVar) && i == 3) {
                    long jB = iezVar.b();
                    defpackage.ifq.a.b().l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer$<anonymous>", "onPlaybackStateChanged", 221, "AudioPlaybackViewPeer.kt").D("Duration from the player: %d, duration from the model: %d", jB, iedVar.d);
                    if (iedVar.d > 0 || jB < 0) {
                        return;
                    }
                    ifqVar.e(jB);
                }
            }
        }
    }

    public final void p(defpackage.erb erbVar) {
        aooh.f(erbVar, "error");
        defpackage.ifq ifqVar = this.a;
        defpackage.iek iekVar = ifqVar.k;
        if (iekVar != null) {
            defpackage.ied iedVar = iekVar.c;
            if (iedVar == null) {
                iedVar = defpackage.ied.a;
            }
            if (iedVar != null) {
                iez iezVar = ifqVar.d;
                if (iezVar.s(iedVar)) {
                    defpackage.ieg iegVar = ifqVar.o;
                    if (iegVar != null) {
                        iegVar.b(erbVar);
                    }
                    ifqVar.q.i((java.lang.String) null).a(mcd.ar);
                    defpackage.ifq.a.c().k(erbVar).l("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer$<anonymous>", "onPlayerError", 206, "AudioPlaybackViewPeer.kt").v("Error during playback");
                    if (aooh.n(iedVar, iezVar.k)) {
                        androidx.media3.exoplayer.ExoPlayer exoPlayer = iezVar.j;
                        if (exoPlayer != null) {
                            exoPlayer.w();
                        }
                        iezVar.p.a();
                        iezVar.k = null;
                    }
                }
            }
        }
    }

    public final /* synthetic */ void u() {
    }

    public final /* synthetic */ void P(boolean z) {
    }

    public final /* synthetic */ void a(int i) {
    }

    public final /* synthetic */ void b(defpackage.ere ereVar) {
    }

    public final /* synthetic */ void c(defpackage.est estVar) {
    }

    public final /* synthetic */ void d(java.util.List list) {
    }

    public final /* synthetic */ void j(defpackage.eqw eqwVar) {
    }

    public final /* synthetic */ void k(defpackage.eqy eqyVar) {
    }

    public final /* synthetic */ void m(defpackage.erc ercVar) {
    }

    public final /* synthetic */ void o(int i) {
    }

    public final /* synthetic */ void q(defpackage.erb erbVar) {
    }

    public final /* synthetic */ void s(int i) {
    }

    public final /* synthetic */ void v(boolean z) {
    }

    public final /* synthetic */ void y(defpackage.ert ertVar) {
    }

    public final /* synthetic */ void z(defpackage.ery eryVar) {
    }

    public final /* synthetic */ void M(defpackage.eri eriVar, defpackage.erf erfVar) {
    }

    public final /* synthetic */ void Q(defpackage.eqt eqtVar, int i) {
    }

    public final /* synthetic */ void l(boolean z, int i) {
    }

    public final /* synthetic */ void r(boolean z, int i) {
    }

    public final /* synthetic */ void w(int i, int i2) {
    }

    public final /* synthetic */ void x(defpackage.erm ermVar, int i) {
    }

    public final /* synthetic */ void t(defpackage.erh erhVar, defpackage.erh erhVar2, int i) {
    }
}
