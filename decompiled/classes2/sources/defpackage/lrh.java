package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lrh {
    public final aolr b;
    public final android.os.Vibrator c;
    public final zmq d;
    public final aoin e;
    public final android.media.AudioManager f;
    public final aoin g;
    public final aoin h;
    public final aoin i;
    private final android.content.Context l;
    private final defpackage.hxv m;
    private final uxy n;
    private static final long[] j = {42, 42, 42, 42, 42, 42, 42, 42, 83, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 667};
    private static final int[] k = {255, 127, 255, 127, 255, 127, 255, 127, 0, 255, 127, 255, 127, 255, 127, 255, 127, 255, 127, 255, 127, 255, 127, 0};
    public static final aimz a = aimz.i("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer");

    public lrh(android.content.Context context, aolr aolrVar, defpackage.hxv hxvVar, uxy uxyVar, android.os.Vibrator vibrator, zmq zmqVar, aoin aoinVar, android.media.AudioManager audioManager, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(hxvVar, "audioInjector");
        aooh.f(aoinVar, "enableNoSpoofAlertSound");
        aooh.f(aoinVar2, "enableReducedSpoofAlertAudioVolume");
        aooh.f(aoinVar3, "reducedSpoofAlertAudioVolumeThreshold");
        aooh.f(aoinVar4, "spoofAlertBtOrEarphonesAudioVolumePercentageThreshold");
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
        defpackage.lrd lrdVar;
        if (aolnVar instanceof defpackage.lrd) {
            lrdVar = (defpackage.lrd) aolnVar;
            int i2 = lrdVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lrdVar.c = i2 - Integer.MIN_VALUE;
            } else {
                lrdVar = new defpackage.lrd(this, aolnVar);
            }
        } else {
            lrdVar = new defpackage.lrd(this, aolnVar);
        }
        java.lang.Object objD = lrdVar.a;
        aolu aoluVar = aolu.a;
        int i3 = lrdVar.c;
        if (i3 == 0) {
            aooc.af(objD);
            java.io.File file = new java.io.File(this.l.getCacheDir().getAbsolutePath(), str);
            if (file.exists()) {
                return file;
            }
            ajcq ajcqVarA = this.n.a(i, str);
            lrdVar.c = 1;
            objD = aosv.D(ajcqVarA, lrdVar);
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

    /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:13:0x002e, B:28:0x0095, B:30:0x009d, B:31:0x00b1, B:18:0x003c, B:26:0x0080), top: B:44:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #0 {all -> 0x00d5, blocks: (B:13:0x002e, B:28:0x0095, B:30:0x009d, B:31:0x00b1, B:18:0x003c, B:26:0x0080), top: B:44:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lrh] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public final java.lang.Object b(java.io.File file, aoln aolnVar) {
        defpackage.lre lreVar;
        ahoq ahoqVar;
        defpackage.hxe hxeVar;
        defpackage.hxe hxeVar2;
        aimz aimzVar;
        java.lang.Object lrzVar;
        if (aolnVar instanceof defpackage.lre) {
            lreVar = (defpackage.lre) aolnVar;
            int i = lreVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lreVar.c = i - Integer.MIN_VALUE;
            } else {
                lreVar = new defpackage.lre(this, aolnVar);
            }
        } else {
            lreVar = new defpackage.lre(this, aolnVar);
        }
        java.lang.Object objD = lreVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lreVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ahoqVar = lreVar.d;
                    aooc.af(objD);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ahoqVar = lreVar.d;
                    aooc.af(objD);
                }
                hxeVar = (defpackage.hxe) objD;
                hxeVar2 = defpackage.hxe.a;
                aimzVar = a;
                if (hxeVar == hxeVar2) {
                    aimzVar.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "playAudioLocal$<anonymous>", 159, "ContactCheckerAudioHapticsPlayer.kt").v("play local audio completed");
                    lrzVar = defpackage.lsb.a;
                } else {
                    aimzVar.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "playAudioLocal$<anonymous>", 162, "ContactCheckerAudioHapticsPlayer.kt").y("play local audio did not complete: %s", hxeVar);
                    aooh.c(hxeVar);
                    lrzVar = new defpackage.lrz(new defpackage.lsa(hxeVar));
                }
                java.lang.Object obj = lrzVar;
                ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                return obj;
            }
            aooc.af(objD);
            if (!ahvr.R(lreVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(319, "ContactCheckerAudioHapticsPlayer_playAudioLocal");
            try {
                a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "playAudioLocal$<anonymous>", 155, "ContactCheckerAudioHapticsPlayer.kt").y("playing local audio: %s", file.getAbsolutePath());
                defpackage.hxx hxxVar = new defpackage.hxx(file);
                lreVar.d = ahoqVarZ;
                lreVar.c = 1;
                java.lang.Object objE = this.m.e(hxxVar, lreVar);
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
            ajcq ajcqVarB = ((defpackage.hxf) objD).b();
            aooh.e(ajcqVarB, "playbackEndedFuture(...)");
            lreVar.d = ahoqVar;
            lreVar.c = 2;
            objD = aosv.D(ajcqVarB, lreVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            hxeVar = (defpackage.hxe) objD;
            hxeVar2 = defpackage.hxe.a;
            aimzVar = a;
            if (hxeVar == hxeVar2) {
                aimzVar.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "playAudioLocal$<anonymous>", 159, "ContactCheckerAudioHapticsPlayer.kt").v("play local audio completed");
                lrzVar = defpackage.lsb.a;
            } else {
                aimzVar.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "playAudioLocal$<anonymous>", 162, "ContactCheckerAudioHapticsPlayer.kt").y("play local audio did not complete: %s", hxeVar);
                aooh.c(hxeVar);
                lrzVar = new defpackage.lrz(new defpackage.lsa(hxeVar));
            }
            java.lang.Object obj2 = lrzVar;
            ajsz.ak(ahoqVar, (java.lang.Throwable) null);
            return obj2;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.lrf lrfVar;
        if (aolnVar instanceof defpackage.lrf) {
            lrfVar = (defpackage.lrf) aolnVar;
            int i = lrfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrfVar.c = i - Integer.MIN_VALUE;
            } else {
                lrfVar = new defpackage.lrf(this, aolnVar);
            }
        } else {
            lrfVar = new defpackage.lrf(this, aolnVar);
        }
        java.lang.Object obj = lrfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lrfVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "playHaptics", 128, "ContactCheckerAudioHapticsPlayer.kt").v("playing haptics");
            android.os.VibrationEffect vibrationEffectM = da$.ExternalSyntheticApiModelOutline1.m(j, k, -1);
            aolr aolrVar = this.b;
            lrg lrgVar = new lrg(this, vibrationEffectM, (aoln) null);
            lrfVar.c = 1;
            if (aoov.aj(aolrVar, lrgVar, lrfVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return defpackage.lsb.a;
    }
}
