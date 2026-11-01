package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tms {
    public final aolr b;
    public final android.os.Vibrator c;
    public final zmq d;
    public final aoin e;
    public final android.media.AudioManager f;
    public final aoin g;
    public final aoin h;
    public final aoin i;
    private final android.content.Context l;
    private final hxv m;
    private final defpackage.uxy n;
    private static final long[] j = {42, 42, 42, 42, 42, 42, 42, 42, 83, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 667};
    private static final int[] k = {255, 127, 255, 127, 255, 127, 255, 127, 0, 255, 127, 255, 127, 255, 127, 255, 127, 255, 127, 255, 127, 255, 127, 0};
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer");

    public tms(android.content.Context context, aolr aolrVar, hxv hxvVar, defpackage.uxy uxyVar, android.os.Vibrator vibrator, zmq zmqVar, aoin aoinVar, android.media.AudioManager audioManager, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(hxvVar, "audioInjector");
        aooh.f(aoinVar, "enableNoScamAlertSound");
        aooh.f(aoinVar2, "enableReducedScamAlertAudioVolume");
        aooh.f(aoinVar3, "reducedScamAlertAudioVolumeThreshold");
        aooh.f(aoinVar4, "scamAlertBtOrEarphonesAudioVolumePercentageThreshold");
        this.l = context;
        this.b = aolrVar;
        this.m = hxvVar;
        this.n = uxyVar;
        this.c = vibrator;
        this.d = zmqVar;
        this.e = aoinVar;
        this.f = audioManager;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.i = aoinVar4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(int i, java.lang.String str, aoln aolnVar) {
        defpackage.tml tmlVar;
        if (aolnVar instanceof defpackage.tml) {
            tmlVar = (defpackage.tml) aolnVar;
            int i2 = tmlVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tmlVar.c = i2 - Integer.MIN_VALUE;
            } else {
                tmlVar = new defpackage.tml(this, aolnVar);
            }
        } else {
            tmlVar = new defpackage.tml(this, aolnVar);
        }
        java.lang.Object objD = tmlVar.a;
        aolu aoluVar = aolu.a;
        int i3 = tmlVar.c;
        if (i3 == 0) {
            aooc.af(objD);
            java.io.File file = new java.io.File(this.l.getCacheDir().getAbsolutePath(), str);
            if (file.exists()) {
                return file;
            }
            ajcq ajcqVarA = this.n.a(i, str);
            tmlVar.c = 1;
            objD = aosv.D(ajcqVarA, tmlVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        java.io.File file2 = (java.io.File) aooh.q((j$.util.Optional) objD);
        if (file2 == null) {
            throw new java.lang.IllegalStateException("Sound file is not available.");
        }
        return file2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #2 {all -> 0x00be, blocks: (B:13:0x0028, B:28:0x0078, B:31:0x0086, B:32:0x009a, B:18:0x0036, B:26:0x0063), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #2 {all -> 0x00be, blocks: (B:13:0x0028, B:28:0x0078, B:31:0x0086, B:32:0x009a, B:18:0x0036, B:26:0x0063), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [tms] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final java.lang.Object b(java.io.File file, aoln aolnVar) {
        defpackage.tmo tmoVar;
        ahoq ahoqVar;
        hxe hxeVar;
        hxe hxeVar2;
        aimz aimzVar;
        java.lang.Object toyVar;
        if (aolnVar instanceof defpackage.tmo) {
            tmoVar = (defpackage.tmo) aolnVar;
            int i = tmoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmoVar.c = i - Integer.MIN_VALUE;
            } else {
                tmoVar = new defpackage.tmo(this, aolnVar);
            }
        } else {
            tmoVar = new defpackage.tmo(this, aolnVar);
        }
        java.lang.Object objD = tmoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tmoVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ahoqVar = tmoVar.d;
                    aooc.af(objD);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ahoqVar = tmoVar.d;
                    aooc.af(objD);
                }
                hxeVar = (hxe) objD;
                hxeVar2 = hxe.a;
                aimzVar = a;
                if (hxeVar == hxeVar2) {
                    aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioLocal$<anonymous>", 195, "SharpieAudioHapticsPlayer.kt").v("play local audio completed");
                    toyVar = defpackage.tpa.a;
                } else {
                    aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioLocal$<anonymous>", 198, "SharpieAudioHapticsPlayer.kt").v("play local audio did not complete");
                    aooh.c(hxeVar);
                    toyVar = new defpackage.toy(new defpackage.toz(hxeVar));
                }
                java.lang.Object obj = toyVar;
                ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                return obj;
            }
            aooc.af(objD);
            if (!ahvr.R(tmoVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(886, "SharpieAudioHapticsPlayer_playAudioLocal");
            try {
                hxx hxxVar = new hxx(file);
                tmoVar.d = ahoqVarZ;
                tmoVar.c = 1;
                java.lang.Object objE = this.m.e(hxxVar, tmoVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                objD = objE;
                ahoqVar = ahoqVarZ;
            } catch (java.lang.Throwable th) {
                th = th;
                this = ahoqVarZ;
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak((java.io.Closeable) this, th);
                    throw th2;
                }
            }
            ajcq ajcqVarB = ((hxf) objD).b();
            aooh.e(ajcqVarB, "playbackEndedFuture(...)");
            tmoVar.d = ahoqVar;
            tmoVar.c = 2;
            objD = aosv.D(ajcqVarB, tmoVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            hxeVar = (hxe) objD;
            hxeVar2 = hxe.a;
            aimzVar = a;
            if (hxeVar == hxeVar2) {
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioLocal$<anonymous>", 195, "SharpieAudioHapticsPlayer.kt").v("play local audio completed");
                toyVar = defpackage.tpa.a;
            } else {
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioLocal$<anonymous>", 198, "SharpieAudioHapticsPlayer.kt").v("play local audio did not complete");
                aooh.c(hxeVar);
                toyVar = new defpackage.toy(new defpackage.toz(hxeVar));
            }
            java.lang.Object obj2 = toyVar;
            ajsz.ak(ahoqVar, (java.lang.Throwable) null);
            return obj2;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #2 {all -> 0x00be, blocks: (B:13:0x0028, B:28:0x0078, B:31:0x0086, B:32:0x009a, B:18:0x0036, B:26:0x0063), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #2 {all -> 0x00be, blocks: (B:13:0x0028, B:28:0x0078, B:31:0x0086, B:32:0x009a, B:18:0x0036, B:26:0x0063), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [tms] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final java.lang.Object c(java.io.File file, aoln aolnVar) {
        defpackage.tmp tmpVar;
        ahoq ahoqVar;
        hxe hxeVar;
        hxe hxeVar2;
        aimz aimzVar;
        java.lang.Object toyVar;
        if (aolnVar instanceof defpackage.tmp) {
            tmpVar = (defpackage.tmp) aolnVar;
            int i = tmpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmpVar.c = i - Integer.MIN_VALUE;
            } else {
                tmpVar = new defpackage.tmp(this, aolnVar);
            }
        } else {
            tmpVar = new defpackage.tmp(this, aolnVar);
        }
        java.lang.Object objD = tmpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tmpVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ahoqVar = tmpVar.d;
                    aooc.af(objD);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ahoqVar = tmpVar.d;
                    aooc.af(objD);
                }
                hxeVar = (hxe) objD;
                hxeVar2 = hxe.a;
                aimzVar = a;
                if (hxeVar == hxeVar2) {
                    aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioRemoteAndLocal$<anonymous>", 179, "SharpieAudioHapticsPlayer.kt").v("play local and remote audio completed");
                    toyVar = defpackage.tpa.a;
                } else {
                    aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioRemoteAndLocal$<anonymous>", 182, "SharpieAudioHapticsPlayer.kt").v("play local and remote audio did not complete");
                    aooh.c(hxeVar);
                    toyVar = new defpackage.toy(new defpackage.toz(hxeVar));
                }
                java.lang.Object obj = toyVar;
                ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                return obj;
            }
            aooc.af(objD);
            if (!ahvr.R(tmpVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(887, "SharpieAudioHapticsPlayer_playAudioRemoteAndLocal");
            try {
                hxx hxxVar = new hxx(file);
                tmpVar.d = ahoqVarZ;
                tmpVar.c = 1;
                java.lang.Object objF = this.m.f(hxxVar, hxxVar, tmpVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                objD = objF;
                ahoqVar = ahoqVarZ;
            } catch (java.lang.Throwable th) {
                th = th;
                this = ahoqVarZ;
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak((java.io.Closeable) this, th);
                    throw th2;
                }
            }
            ajcq ajcqVarB = ((hxf) objD).b();
            aooh.e(ajcqVarB, "playbackEndedFuture(...)");
            tmpVar.d = ahoqVar;
            tmpVar.c = 2;
            objD = aosv.D(ajcqVarB, tmpVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            hxeVar = (hxe) objD;
            hxeVar2 = hxe.a;
            aimzVar = a;
            if (hxeVar == hxeVar2) {
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioRemoteAndLocal$<anonymous>", 179, "SharpieAudioHapticsPlayer.kt").v("play local and remote audio completed");
                toyVar = defpackage.tpa.a;
            } else {
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playAudioRemoteAndLocal$<anonymous>", 182, "SharpieAudioHapticsPlayer.kt").v("play local and remote audio did not complete");
                aooh.c(hxeVar);
                toyVar = new defpackage.toy(new defpackage.toz(hxeVar));
            }
            java.lang.Object obj2 = toyVar;
            ajsz.ak(ahoqVar, (java.lang.Throwable) null);
            return obj2;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.tmq tmqVar;
        if (aolnVar instanceof defpackage.tmq) {
            tmqVar = (defpackage.tmq) aolnVar;
            int i = tmqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmqVar.c = i - Integer.MIN_VALUE;
            } else {
                tmqVar = new defpackage.tmq(this, aolnVar);
            }
        } else {
            tmqVar = new defpackage.tmq(this, aolnVar);
        }
        java.lang.Object obj = tmqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tmqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "playHaptics", 149, "SharpieAudioHapticsPlayer.kt").v("playing haptics");
            android.os.VibrationEffect vibrationEffectM = da$.ExternalSyntheticApiModelOutline1.m(j, k, -1);
            aolr aolrVar = this.b;
            tmr tmrVar = new tmr(this, vibrationEffectM, (aoln) null);
            tmqVar.c = 1;
            if (aoov.aj(aolrVar, tmrVar, tmqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return defpackage.tpa.a;
    }
}
