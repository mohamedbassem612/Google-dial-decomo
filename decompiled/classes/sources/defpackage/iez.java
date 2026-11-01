package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iez {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/audioplayback/impl/player/AudioPlayer");
    public final android.content.Context b;
    public final defpackage.aoss c;
    public final defpackage.iep d;
    public final defpackage.rlv e;
    public final defpackage.odp f;
    public final defpackage.aoin g;
    public int h;
    public final defpackage.ahzp i;
    public androidx.media3.exoplayer.ExoPlayer j;
    public ied k;
    public android.media.AudioDeviceInfo l;
    public final java.util.concurrent.atomic.AtomicBoolean m;
    public final android.content.BroadcastReceiver n;
    public final defpackage.ieu o;
    public final defpackage.ies p;
    public final defpackage.tkl q;
    public final defpackage.aogc r;
    private final defpackage.aoin s;
    private final defpackage.ajct t;
    private final java.util.Set u;
    private android.os.PowerManager.WakeLock v;
    private final defpackage.erg w;
    private final defpackage.ahda x;
    private final defpackage.apnt y;
    private final defpackage.aogc z;

    public iez(defpackage.ahda ahdaVar, defpackage.ahpz ahpzVar, android.content.Context context, defpackage.aoin aoinVar, defpackage.ajct ajctVar, defpackage.aoss aossVar, defpackage.iep iepVar, defpackage.aogc aogcVar, defpackage.rlv rlvVar, defpackage.aogc aogcVar2, defpackage.odp odpVar, defpackage.tkl tklVar, defpackage.aoin aoinVar2) {
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("exoPlayerProvider");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (iepVar == null) {
            defpackage.aooh.i("audioDeviceController");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aogcVar2 == null) {
            defpackage.aooh.i("resultPropagator");
        }
        if (tklVar == null) {
            defpackage.aooh.i("dialerPowerManager");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableCrashOnPlaybackErrors");
        }
        this.b = context;
        this.s = aoinVar;
        this.t = ajctVar;
        this.c = aossVar;
        this.d = iepVar;
        this.z = aogcVar;
        this.e = rlvVar;
        this.r = aogcVar2;
        this.f = odpVar;
        this.q = tklVar;
        this.g = aoinVar2;
        this.x = new defpackage.ahda();
        this.u = new java.util.LinkedHashSet();
        this.i = defpackage.ahwr.a;
        this.m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.n = new defpackage.iew(ahpzVar, this);
        this.w = new defpackage.ahsa(ahdaVar, new defpackage.iev(this));
        this.o = new defpackage.ieu(this);
        defpackage.apnt apntVar = new defpackage.apnt(this, (byte[]) null);
        this.y = apntVar;
        this.p = new defpackage.ies(apntVar, aogcVar);
    }

    private final androidx.media3.exoplayer.ExoPlayer u() {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer == null) {
            exoPlayer = (androidx.media3.exoplayer.ExoPlayer) this.s.a();
        }
        if (this.j == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "getOrCreatePlayer", 451, "AudioPlayer.kt")).v("Initialize ExoPlayer instance.");
            this.j = exoPlayer;
            exoPlayer.s(this.w);
            java.util.Iterator it = this.u.iterator();
            while (it.hasNext()) {
                exoPlayer.s((defpackage.ifa) it.next());
            }
            android.media.AudioDeviceInfo audioDeviceInfo = this.l;
            if (audioDeviceInfo != null) {
                defpackage.aooh.c(exoPlayer);
                exoPlayer.B(audioDeviceInfo);
            }
            this.d.f(this.o);
        }
        defpackage.aooh.c(exoPlayer);
        return exoPlayer;
    }

    private final void v(boolean z) {
        android.os.PowerManager.WakeLock wakeLock = this.v;
        if (wakeLock != null) {
            if (!wakeLock.isHeld()) {
                ((defpackage.aimw) a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "disableProximitySensor", 517, "AudioPlayer.kt")).v("proximity wake lock already released");
                return;
            }
            try {
                wakeLock.release(z ? 1 : 0);
            } catch (java.lang.RuntimeException e) {
                ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "disableProximitySensor", 533, "AudioPlayer.kt")).v("proximity wake lock already released");
            }
        }
    }

    public final int a() {
        android.media.AudioDeviceInfo audioDeviceInfo = this.l;
        return (audioDeviceInfo == null || audioDeviceInfo.getType() != 7) ? 0 : 6;
    }

    public final long b() {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer != null) {
            return exoPlayer.o();
        }
        return 0L;
    }

    public final long c() {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer != null) {
            return exoPlayer.n();
        }
        return 0L;
    }

    public final iec d() {
        ied iedVar = this.k;
        if (iedVar == null) {
            return iec.a;
        }
        iec iecVarB = iec.b(iedVar.e);
        return iecVarB == null ? iec.j : iecVarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        iex iexVar;
        if (aolnVar instanceof iex) {
            iexVar = (iex) aolnVar;
            int i = iexVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iexVar.c = i - Integer.MIN_VALUE;
            } else {
                iexVar = new iex(this, aolnVar);
            }
        } else {
            iexVar = new iex(this, aolnVar);
        }
        java.lang.Object objAj = iexVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iexVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            android.os.PowerManager.WakeLock wakeLock = this.v;
            if (wakeLock != null) {
                return wakeLock;
            }
            defpackage.tkl tklVar = this.q;
            iexVar.c = 1;
            objAj = defpackage.aoov.aj(tklVar.d, new ofa(tklVar, (defpackage.aoln) null, 6), iexVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        android.os.PowerManager.WakeLock wakeLock2 = (android.os.PowerManager.WakeLock) objAj;
        this.v = wakeLock2;
        return wakeLock2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(android.media.AudioDeviceInfo audioDeviceInfo, boolean z, defpackage.aoln aolnVar) {
        iey ieyVar;
        if (aolnVar instanceof iey) {
            ieyVar = (iey) aolnVar;
            int i = ieyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ieyVar.c = i - Integer.MIN_VALUE;
            } else {
                ieyVar = new iey(this, aolnVar);
            }
        } else {
            ieyVar = new iey(this, aolnVar);
        }
        java.lang.Object objE = ieyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ieyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            if (audioDeviceInfo == null || audioDeviceInfo.getType() != 1) {
                ((defpackage.aimw) a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "updateProximitySensor", 491, "AudioPlayer.kt")).v("Current route is not earpiece, disable proximity sensor");
                v(false);
                return defpackage.aojh.a;
            }
            if (!z) {
                ((defpackage.aimw) a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "updateProximitySensor", 498, "AudioPlayer.kt")).v("Audio is not playing, wait for no proximity and then disable proximity sensor");
                v(true);
                return defpackage.aojh.a;
            }
            ieyVar.c = 1;
            objE = e(ieyVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objE);
        }
        android.os.PowerManager.WakeLock wakeLock = (android.os.PowerManager.WakeLock) objE;
        boolean zIsHeld = wakeLock.isHeld();
        defpackage.aimz aimzVar = a;
        if (zIsHeld) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "updateProximitySensor", 505, "AudioPlayer.kt")).v("proximity wake lock already acquired");
            return defpackage.aojh.a;
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "updateProximitySensor", 509, "AudioPlayer.kt")).v("acquiring proximity wake lock");
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        wakeLock.acquire(600000L);
        return defpackage.aojh.a;
    }

    public final void g(defpackage.ifa ifaVar) {
        if (ifaVar == null) {
            defpackage.aooh.i("listener");
        }
        this.u.add(ifaVar);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer != null) {
            exoPlayer.s(ifaVar);
        }
    }

    public final void h() {
        this.d.f(this.o);
    }

    public final void i(android.media.AudioDeviceInfo audioDeviceInfo, boolean z) {
        defpackage.agsm.i(114, this.x.h(defpackage.ahqx.b(new iet(this, audioDeviceInfo, z, 0)), this.t), "Failed to update proximity sensor", new java.lang.Object[0]);
    }

    public final void j(boolean z) {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer != null) {
            exoPlayer.a();
        }
        if (z) {
            return;
        }
        this.p.a();
    }

    public final void k(ied iedVar, boolean z) {
        defpackage.aooh.f(iedVar, "audioInfo");
        if (defpackage.aooh.n(iedVar, this.k)) {
            j(z);
        }
    }

    public final void l(ied iedVar) {
        defpackage.aooh.f(iedVar, "audioInfo");
        m(iedVar);
        defpackage.ies iesVar = this.p;
        java.lang.Object obj = iesVar.c.c;
        android.media.AudioFocusRequest audioFocusRequest = iesVar.a;
        defpackage.aooh.e(audioFocusRequest, "audioFocusRequest");
        if (((defpackage.oju) obj).d(audioFocusRequest) != 1) {
            ((defpackage.aimw) a.d().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$audioFocusCallBack$<anonymous>", "onAudioFocusRequest", 211, "AudioPlayer.kt")).v("audio focus request failed");
            return;
        }
        defpackage.iez iezVar = (defpackage.iez) iesVar.b.a;
        iezVar.d.e(iezVar.l, true);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = iezVar.j;
        if (exoPlayer != null) {
            exoPlayer.b();
        }
    }

    public final void m(ied iedVar) {
        defpackage.aooh.f(iedVar, "audioInfo");
        if (defpackage.aooh.n(this.k, iedVar)) {
            return;
        }
        this.k = iedVar;
        androidx.media3.exoplayer.ExoPlayer exoPlayerU = u();
        java.lang.String str = iedVar.c;
        int i = eqt.g;
        eqk eqkVar = new eqk();
        eqkVar.b = str == null ? null : android.net.Uri.parse(str);
        exoPlayerU.d(eqkVar.a());
        u().t();
    }

    public final void n(defpackage.ifa ifaVar) {
        defpackage.aooh.f(ifaVar, "listener");
        this.u.remove(ifaVar);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer != null) {
            exoPlayer.u(ifaVar);
        }
    }

    public final void o() {
        java.util.ArrayList arrayList;
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.iep iepVar = this.d;
        if (i >= 31) {
            java.util.List listH = iepVar.f.h();
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listH) {
                if (defpackage.kcq.I((android.media.AudioDeviceInfo) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            java.util.List listI = iepVar.f.i();
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : listI) {
                if (defpackage.kcq.I((android.media.AudioDeviceInfo) obj2)) {
                    arrayList.add(obj2);
                }
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(arrayList, 10)), 16));
        for (java.lang.Object obj3 : arrayList) {
            linkedHashMap.put(java.lang.Integer.valueOf(((android.media.AudioDeviceInfo) obj3).getType()), obj3);
        }
        for (java.lang.Object obj4 : defpackage.iep.a) {
            if (linkedHashMap.containsKey(java.lang.Integer.valueOf(((java.lang.Number) obj4).intValue()))) {
                q((android.media.AudioDeviceInfo) linkedHashMap.get((java.lang.Integer) obj4));
            }
        }
        obj4 = null;
        q((android.media.AudioDeviceInfo) linkedHashMap.get((java.lang.Integer) obj4));
    }

    public final void p(long j) {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer != null) {
            exoPlayer.c(java.lang.Math.min(exoPlayer.m(), j));
        }
    }

    public final void q(android.media.AudioDeviceInfo audioDeviceInfo) {
        if (defpackage.aooh.n(audioDeviceInfo, this.l)) {
            return;
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer", "setAudioDevice", 432, "AudioPlayer.kt")).y("setAudioDevice: %s", audioDeviceInfo != null ? java.lang.Integer.valueOf(audioDeviceInfo.getType()) : null);
        this.d.e(audioDeviceInfo, t());
        i(audioDeviceInfo, t());
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        if (exoPlayer != null) {
            exoPlayer.B(audioDeviceInfo);
        }
        this.l = audioDeviceInfo;
        if (audioDeviceInfo != null) {
            java.util.Iterator it = this.u.iterator();
            while (it.hasNext()) {
                ((defpackage.ifa) it.next()).A(audioDeviceInfo);
            }
        }
    }

    public final void r() {
        if (this.m.getAndSet(false)) {
            this.b.unregisterReceiver(this.n);
        }
    }

    public final boolean s(ied iedVar) {
        defpackage.aooh.f(iedVar, "audioInfo");
        return defpackage.aooh.n(this.k, iedVar);
    }

    public final boolean t() {
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.j;
        return exoPlayer != null && exoPlayer.e();
    }
}
