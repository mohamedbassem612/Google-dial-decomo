package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyj {
    public static final aimz a = aimz.i("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer");
    public final aoss b;
    public final rlv c;
    public final aoin d;
    public defpackage.hyf e;
    public final ahda f;
    public final apni g;
    private final android.content.Context h;
    private final uss i;

    public hyj(aoss aossVar, rlv rlvVar, uss ussVar, apni apniVar, android.content.Context context, aoin aoinVar) {
        aooh.f(aossVar, "backgroundScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(ussVar, "dialerMediaPlayerProvider");
        aooh.f(apniVar, "androidJobs");
        aooh.f(context, "context");
        aooh.f(aoinVar, "enableFixEndPlaybackRaceV2");
        this.b = aossVar;
        this.c = rlvVar;
        this.i = ussVar;
        this.g = apniVar;
        this.h = context;
        this.d = aoinVar;
        this.f = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v13, types: [aolr, java.lang.Object] */
    public final java.lang.Object a(int i, int i2, int i3, boolean z, aoln aolnVar) {
        defpackage.hyh hyhVar;
        if (aolnVar instanceof defpackage.hyh) {
            hyhVar = (defpackage.hyh) aolnVar;
            int i4 = hyhVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hyhVar.c = i4 - Integer.MIN_VALUE;
            } else {
                hyhVar = new defpackage.hyh(this, aolnVar);
            }
        } else {
            hyhVar = new defpackage.hyh(this, aolnVar);
        }
        java.lang.Object objAj = hyhVar.a;
        aolu aoluVar = aolu.a;
        int i5 = hyhVar.c;
        try {
            if (i5 == 0) {
                aooc.af(objAj);
                a.b().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer", "playAudioFromResourceInternal", 122, "LocalAudioPlayer.kt").v("playAudio");
                defpackage.hyf hyfVar = this.e;
                if (hyfVar != null) {
                    hyfVar.f(defpackage.hxe.b);
                }
                uss ussVar = this.i;
                android.content.Context context = this.h;
                android.media.AudioAttributes audioAttributesH = defpackage.hgt.h(i2, i3, z);
                hyhVar.c = 1;
                objAj = aoov.aj((aolr) ussVar.b, new defpackage.ojy(ussVar, context, i, audioAttributesH, null), hyhVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i5 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objAj);
            }
            defpackage.hyf hyfVar2 = new defpackage.hyf(this, (defpackage.oii) objAj);
            this.e = hyfVar2;
            return hyfVar2;
        } catch (java.lang.Exception e) {
            a.c().k(e).l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer", "playAudioFromResourceInternal", 134, "LocalAudioPlayer.kt").v("failed to prepare audio");
            rlv rlvVar = this.c;
            rlvVar.o(rmx.oF);
            rlvVar.o(rmx.zM);
            return defpackage.hyc.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, boolean z, aoln aolnVar) {
        defpackage.hyi hyiVar;
        if (aolnVar instanceof defpackage.hyi) {
            hyiVar = (defpackage.hyi) aolnVar;
            int i = hyiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hyiVar.d = i - Integer.MIN_VALUE;
            } else {
                hyiVar = new defpackage.hyi(this, aolnVar);
            }
        } else {
            hyiVar = new defpackage.hyi(this, aolnVar);
        }
        java.lang.Object objN = hyiVar.b;
        aolu aoluVar = aolu.a;
        int i2 = hyiVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objN);
                aimz aimzVar = a;
                aimzVar.b().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer", "playAudioInternal", 72, "LocalAudioPlayer.kt").v("playAudio");
                defpackage.hyf hyfVar = this.e;
                if (hyfVar != null) {
                    hyfVar.f(defpackage.hxe.b);
                    aimzVar.d().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer", "playAudioInternal$<anonymous>", 77, "LocalAudioPlayer.kt").v("#playAudioInternal got called while the prior playback is ongoing");
                }
                uss ussVar = this.i;
                hyiVar.e = str;
                hyiVar.a = z;
                hyiVar.d = 1;
                objN = ussVar.n(hyiVar);
                if (objN == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = hyiVar.a;
                str = hyiVar.e;
                aooc.af(objN);
            }
            defpackage.oii oiiVar = (defpackage.oii) objN;
            oiiVar.i(str);
            oiiVar.h(defpackage.hgt.h(1, 2, z));
            oiiVar.c();
            defpackage.hyf hyfVar2 = new defpackage.hyf(this, oiiVar);
            this.e = hyfVar2;
            return hyfVar2;
        } catch (java.lang.Exception e) {
            a.c().k(e).l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer", "playAudioInternal", 86, "LocalAudioPlayer.kt").v("failed to prepare audio");
            rlv rlvVar = this.c;
            rlvVar.o(rmx.oF);
            rlvVar.o(rmx.zM);
            return defpackage.hyc.a;
        }
    }
}
