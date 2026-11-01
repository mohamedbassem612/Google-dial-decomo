package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyf implements defpackage.hxf {
    public dsd a;
    final /* synthetic */ defpackage.hyj b;
    private final ajcq c = dff.m(new defpackage.hyd(this, 0));
    private defpackage.oii d;

    public hyf(defpackage.hyj hyjVar, defpackage.oii oiiVar) {
        this.b = hyjVar;
        this.d = oiiVar;
        hyjVar.g.i(aoov.am(hyjVar.b, 0, new huk(this, hyjVar, (aoln) null, 7), 3));
    }

    @Override // defpackage.hxf
    public final ajcq a() {
        int iValueOf;
        defpackage.oii oiiVar = this.d;
        if (oiiVar != null) {
            iValueOf = java.lang.Integer.valueOf(oiiVar.a());
        } else {
            defpackage.hyj.a.b().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer$LocalPlaybackSession", "durationMillis", 227, "LocalAudioPlayer.kt").v("durationMillis called after MediaPlayer got released");
            iValueOf = 0;
        }
        return aiql.z(iValueOf);
    }

    @Override // defpackage.hxf
    public final ajcq b() {
        return this.c;
    }

    @Override // defpackage.hxf
    public final ajcq c() {
        return ajcm.a;
    }

    @Override // defpackage.hxf
    public final void d() {
        defpackage.hyj hyjVar = this.b;
        if (((java.lang.Boolean) hyjVar.d.a()).booleanValue()) {
            f(defpackage.hxe.b);
        } else {
            ahvr.ag(hyjVar.b, hyjVar.f, new defpackage.icr(this, (aoln) null, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.hye hyeVar;
        if (aolnVar instanceof defpackage.hye) {
            hyeVar = (defpackage.hye) aolnVar;
            int i = hyeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hyeVar.c = i - Integer.MIN_VALUE;
            } else {
                hyeVar = new defpackage.hye(this, aolnVar);
            }
        } else {
            hyeVar = new defpackage.hye(this, aolnVar);
        }
        java.lang.Object obj = hyeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hyeVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.oii oiiVar = this.d;
                if (oiiVar != null) {
                    hyeVar.c = 1;
                    aosc aoscVar = new aosc(ajsz.ap(hyeVar), 1);
                    aoscVar.z();
                    aoscVar.d(new defpackage.aib(oiiVar, 18));
                    oiiVar.j(new defpackage.dev((java.lang.Object) oiiVar, (aosb) aoscVar, 2));
                    oiiVar.k(new defpackage.hyb(oiiVar, aoscVar));
                    oiiVar.m();
                    java.lang.Object objK = aoscVar.k();
                    if (objK != aoluVar) {
                        objK = aojh.a;
                    }
                    if (objK == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            defpackage.hyj hyjVar = this.b;
            if (((java.lang.Boolean) hyjVar.d.a()).booleanValue() && this.d == null) {
                return defpackage.hxe.b;
            }
            hyjVar.c.o(rmx.oE);
            return defpackage.hxe.a;
        } catch (java.lang.IllegalStateException e) {
            defpackage.hyj.a.c().k(e).l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer$LocalPlaybackSession", "startMediaPlayer", 177, "LocalAudioPlayer.kt").v("failed to play audio");
            rlv rlvVar = this.b.c;
            rlvVar.o(rmx.oG);
            rlvVar.o(rmx.zM);
            return defpackage.hxe.c;
        }
    }

    public final void f(defpackage.hxe hxeVar) {
        aooh.f(hxeVar, "playbackEndedReason");
        defpackage.hyj.a.b().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer$LocalPlaybackSession", "endPlayback", 189, "LocalAudioPlayer.kt").y("endPlayback: cleaning up for %s", hxeVar);
        if (((java.lang.Boolean) this.b.d.a()).booleanValue()) {
            try {
                defpackage.oii oiiVar = this.d;
                if (oiiVar != null) {
                    oiiVar.n();
                }
                defpackage.oii oiiVar2 = this.d;
                if (oiiVar2 != null) {
                    oiiVar2.e();
                }
            } catch (java.lang.IllegalStateException unused) {
                defpackage.hyj.a.b().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer$LocalPlaybackSession", "endPlayback", 198, "LocalAudioPlayer.kt").v("MediaPlayer.stop() called before initialization completed.");
            }
        } else {
            defpackage.oii oiiVar3 = this.d;
            if (oiiVar3 != null) {
                oiiVar3.n();
            }
            defpackage.oii oiiVar4 = this.d;
            if (oiiVar4 != null) {
                oiiVar4.e();
            }
        }
        this.d = null;
        dsd dsdVar = this.a;
        if (dsdVar != null) {
            dsdVar.b(hxeVar);
        }
        this.a = null;
        defpackage.hyj hyjVar = this.b;
        if (this == hyjVar.e) {
            hyjVar.e = null;
        }
    }
}
