package com.android.dialer.playback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class CallRecordingPlayer extends android.widget.LinearLayout {
    public static final aimz a = aimz.i("com/android/dialer/playback/CallRecordingPlayer");
    private boolean A;
    private boolean B;
    private final boolean C;
    private final j$.util.Optional D;
    public defpackage.sta b;
    public final android.os.Handler c;
    public final defpackage.ssu d;
    public android.media.MediaPlayer e;
    public j$.util.Optional f;
    public j$.util.Optional g;
    public final j$.util.Optional h;
    public final j$.util.Optional i;
    public j$.util.Optional j;
    public final j$.util.Optional k;
    public final boolean l;
    public boolean m;
    public boolean n;
    public android.widget.SeekBar o;
    public android.widget.ImageButton p;
    android.widget.ImageButton q;
    android.widget.ImageButton r;
    public android.widget.ImageButton s;
    public android.widget.TextView t;
    public android.widget.TextView u;
    public j$.util.Optional v;
    public final j$.util.Optional w;
    public final java.lang.Runnable x;
    private final ahpz y;
    private final j$.util.Optional z;

    public CallRecordingPlayer(android.content.Context context) {
        super(context);
        this.b = defpackage.sta.a;
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f = j$.util.Optional.empty();
        this.z = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.i = j$.util.Optional.empty();
        this.j = j$.util.Optional.empty();
        this.k = j$.util.Optional.empty();
        this.l = true;
        this.m = false;
        this.n = false;
        this.A = false;
        this.B = false;
        this.v = j$.util.Optional.empty();
        this.C = true;
        this.D = j$.util.Optional.empty();
        this.w = j$.util.Optional.empty();
        this.x = new defpackage.sxq(this, 1);
        this.d = l();
        this.y = m();
        n();
    }

    public static j$.util.Optional a(android.content.Context context) {
        while (!(context instanceof android.app.Activity)) {
            if (!(context instanceof android.content.ContextWrapper)) {
                return j$.util.Optional.empty();
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return j$.util.Optional.of((android.app.Activity) context);
    }

    public static void f(android.widget.TextView textView, int i) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long j = i;
        int i2 = (int) (j / 1000);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        int i3 = (int) (j / 60000);
        textView.setText(java.lang.String.format(java.util.Locale.US, "%01d:%02d", java.lang.Integer.valueOf(i3 <= 99 ? i3 : 99), java.lang.Integer.valueOf(i2 - (i3 * 60))));
        textView.setContentDescription(wsc.aB(textView.getContext(), j));
    }

    private final defpackage.ssu l() {
        return defpackage.sns.A(getContext()).bQ();
    }

    private final ahpz m() {
        return defpackage.sns.A(getContext()).fi();
    }

    private final void n() {
        android.view.LayoutInflater.from(getContext()).inflate(2131624064, this);
        this.o = (android.widget.SeekBar) findViewById(2131428693);
        this.p = (android.widget.ImageButton) findViewById(2131428698);
        this.q = (android.widget.ImageButton) findViewById(2131428694);
        this.s = (android.widget.ImageButton) findViewById(2131428689);
        this.r = (android.widget.ImageButton) findViewById(2131428696);
        this.t = (android.widget.TextView) findViewById(2131428691);
        this.u = (android.widget.TextView) findViewById(2131428690);
        f(this.t, 0);
        f(this.u, 0);
        defpackage.ssu ssuVar = this.d;
        android.content.Context context = getContext();
        if (!ssuVar.g) {
            ssuVar.g = true;
            ssuVar.c = (android.media.AudioManager) context.getSystemService("audio");
            ssuVar.d = new defpackage.std(context);
            ssuVar.d.d = ssuVar;
            int iA = ssuVar.a();
            ssuVar.f = new android.telecom.CallAudioState(false, defpackage.ssu.b(5, iA), iA);
            aimz aimzVar = defpackage.ssu.a;
            aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "initialize", 79, "CallRecordingAudioManager.java").y("Initial audioState = %s", ssuVar.f);
            android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
            if (powerManager.isWakeLockLevelSupported(32)) {
                ssuVar.h = j$.util.Optional.of(powerManager.newWakeLock(32, "CallRecordingAudioManager:"));
            } else {
                aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "initialize", 88, "CallRecordingAudioManager.java").v("PROXIMITY_SCREEN_OFF_WAKE_LOCK not supported");
            }
        }
        android.widget.ImageButton imageButton = this.p;
        ahpz ahpzVar = this.y;
        imageButton.setOnClickListener(new defpackage.ahpp(ahpzVar, 830, "Clicked start/stop button in voicemail call recording player", new defpackage.qht(this, 17), 0));
        this.r.setOnClickListener(new defpackage.ahpp(ahpzVar, 831, "Clicked speaker button in voicemail call recording player", new defpackage.qht(this, 18), 0));
        this.q.setOnClickListener(new defpackage.ahpp(ahpzVar, 832, "Clicked share button in voicemail call recording player", new defpackage.qht(this, 19), 0));
        this.s.setOnClickListener(new defpackage.ahpp(ahpzVar, 833, "Clicked delete button in voicemail call recording player", new defpackage.qht(this, 20), 0));
        this.o.setOnSeekBarChangeListener(new defpackage.ssy(this, 0));
    }

    public final void b() {
        this.c.removeCallbacks(this.x);
        defpackage.ssu ssuVar = this.d;
        ssuVar.e(5);
        h(false);
        if (this.b == defpackage.sta.d) {
            c(false);
        }
        android.media.MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.b = defpackage.sta.a;
        g();
        this.v = j$.util.Optional.empty();
        ssuVar.b.remove(this);
        j$.util.Optional optionalA = a(getContext());
        if (true == optionalA.isPresent()) {
            ((android.app.Activity) optionalA.get()).setVolumeControlStream(Integer.MIN_VALUE);
        }
    }

    public final void c(boolean z) {
        a.b().l("com/android/dialer/playback/CallRecordingPlayer", "pausePlaying", 662, "CallRecordingPlayer.java").y("try pause playing from %s", this.b);
        if (this.b == defpackage.sta.d) {
            this.e.pause();
            this.b = defpackage.sta.g;
            this.c.removeCallbacks(this.x);
            if (!z) {
                this.d.c();
            }
            this.d.d(false);
            g();
        }
    }

    public final void d() {
        this.b = defpackage.sta.b;
        this.e.prepareAsync();
    }

    public final void e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            setVisibility(8);
            return;
        }
        defpackage.amwp amwpVar = new defpackage.amwp(defpackage.sns.A(getContext()).oX().v(str));
        if (this.v.isPresent()) {
            throw new java.lang.IllegalStateException("attempting to prepare again without cleanUp()");
        }
        defpackage.ssu ssuVar = this.d;
        ssuVar.b.add(this);
        this.B = false;
        this.v = j$.util.Optional.of(amwpVar);
        android.media.MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer == null) {
            mediaPlayer = new android.media.MediaPlayer();
            this.e = mediaPlayer;
        }
        mediaPlayer.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() { // from class: ssv
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(android.media.MediaPlayer mediaPlayer2, int i, int i2) {
                com.android.dialer.playback.CallRecordingPlayer.a.d().i(zct.b).l("com/android/dialer/playback/CallRecordingPlayer", "prepareRecording", 247, "CallRecordingPlayer.java").z("Error during playback: %s %s", i, i2);
                com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = this.a;
                j$.util.Optional optional = callRecordingPlayer.g;
                if (true == optional.isPresent()) {
                    ((defpackage.rai) optional.get()).e();
                }
                callRecordingPlayer.n = false;
                callRecordingPlayer.setVisibility(8);
                return true;
            }
        });
        this.e.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: ssw
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            
                if (r2 != 6) goto L12;
             */
            @Override // android.media.MediaPlayer.OnCompletionListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCompletion(android.media.MediaPlayer r2) {
                /*
                    r1 = this;
                    com.android.dialer.playback.CallRecordingPlayer r1 = r1.a
                    sta r2 = r1.b
                    int r2 = r2.ordinal()
                    r0 = 3
                    if (r2 == r0) goto L14
                    r0 = 4
                    if (r2 == r0) goto L1e
                    r0 = 5
                    if (r2 == r0) goto L14
                    r0 = 6
                    if (r2 != r0) goto L31
                L14:
                    android.media.MediaPlayer r2 = r1.e
                    r2.stop()
                    j$.util.Optional r2 = r1.i
                    r2.isPresent()
                L1e:
                    android.os.Handler r2 = r1.c
                    java.lang.Runnable r0 = r1.x
                    r2.removeCallbacks(r0)
                    ssu r2 = r1.d
                    r2.c()
                    r0 = 1
                    r2.d(r0)
                    r1.d()
                L31:
                    r1.g()
                    android.widget.SeekBar r1 = r1.o
                    r2 = 0
                    r1.setProgress(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ssw.onCompletion(android.media.MediaPlayer):void");
            }
        });
        this.e.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: ssx
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(android.media.MediaPlayer mediaPlayer2) {
                com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = this.a;
                callRecordingPlayer.b = defpackage.sta.c;
                callRecordingPlayer.setVisibility(0);
                callRecordingPlayer.o.setMax(callRecordingPlayer.e.getDuration());
                callRecordingPlayer.e.seekTo(callRecordingPlayer.o.getProgress());
                com.android.dialer.playback.CallRecordingPlayer.f(callRecordingPlayer.u, callRecordingPlayer.e.getDuration());
                callRecordingPlayer.w.isPresent();
            }
        });
        defpackage.std stdVar = ssuVar.d;
        dvx.f(stdVar.c, stdVar.a, new android.content.IntentFilter("android.intent.action.HEADSET_PLUG"), (java.lang.String) null, 2);
        try {
            this.e.reset();
            this.e.setDataSource(getContext(), (android.net.Uri) amwpVar.b);
            this.e.setAudioStreamType(0);
            d();
            g();
        } catch (java.io.IOException e) {
            a.d().i(zct.b).k(e).l("com/android/dialer/playback/CallRecordingPlayer", "prepareRecording", 307, "CallRecordingPlayer.java").y("Could not initialize playback: %s", amwpVar.b);
            this.b = defpackage.sta.a;
            setVisibility(8);
            j$.util.Optional optional = this.g;
            if (true == optional.isPresent()) {
                ((defpackage.rai) optional.get()).e();
            }
        }
    }

    public final void g() {
        this.p.setImageResource(this.b == defpackage.sta.d ? 2131231530 : 2131231563);
    }

    public final void h(boolean z) {
        this.m = z;
        this.r.setSelected(z);
        this.r.setLayoutDirection(3);
        this.r.setImageDrawable(getContext().getDrawable(z ? 2131231670 : 2131231671));
        this.r.setContentDescription(getContext().getString(true != z ? 2132017828 : 2132018541));
    }

    public final void i(java.lang.Runnable runnable) {
        this.s.setVisibility(0);
        this.j = j$.util.Optional.of(runnable);
    }

    public final void j() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 3) {
                a.b().l("com/android/dialer/playback/CallRecordingPlayer", "startPlaying", 624, "CallRecordingPlayer.java").v("Already playing.");
                return;
            }
            if (iOrdinal != 4 && iOrdinal != 5) {
                try {
                    defpackage.ssu ssuVar = this.d;
                    if (ssuVar.c.requestAudioFocus(ssuVar, 0, 2) != 1) {
                        throw new java.util.concurrent.RejectedExecutionException("Could not capture audio focus.");
                    }
                    ssuVar.g(true);
                    aimz aimzVar = a;
                    aimzVar.b().l("com/android/dialer/playback/CallRecordingPlayer", "startPlaying", 632, "CallRecordingPlayer.java").y("Playing from %s", this.b);
                    this.c.post(this.x);
                    this.b = defpackage.sta.d;
                    this.e.start();
                    if (this.m) {
                        k();
                    } else {
                        this.d.h();
                    }
                    g();
                    j$.util.Optional optionalA = a(getContext());
                    int i = true == this.d.i ? 6 : 0;
                    aimzVar.b().l("com/android/dialer/playback/CallRecordingPlayer", "startPlaying", 644, "CallRecordingPlayer.java").w("playbackSctream=%d", i);
                    defpackage.oxt oxtVar = new defpackage.oxt(i, 3);
                    if (true == optionalA.isPresent()) {
                        ((android.app.Activity) optionalA.get()).setVolumeControlStream(oxtVar.a);
                    }
                    if (!this.A) {
                        j$.util.Optional optional = this.f;
                        if (true == optional.isPresent()) {
                            hhe.K((android.content.Context) ((defpackage.rai) optional.get()).a).bt().n(rmw.jX);
                        }
                        this.A = true;
                    }
                    if (this.B) {
                        return;
                    }
                    this.z.isPresent();
                    this.B = true;
                    return;
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    a.bq(a.c(), "Unable to start playing", "com/android/dialer/playback/CallRecordingPlayer", "startPlaying", (char) 630, "CallRecordingPlayer.java", e, zct.b);
                }
            }
        }
        a.b().l("com/android/dialer/playback/CallRecordingPlayer", "startPlaying", 621, "CallRecordingPlayer.java").v("Not set up to play.");
    }

    public final void k() {
        h(true);
        defpackage.ssu ssuVar = this.d;
        ssuVar.e(8);
        if (this.b == defpackage.sta.d) {
            ssuVar.d(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.isPresent();
        c(false);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        a.b().l("com/android/dialer/playback/CallRecordingPlayer", "onWindowFocusChanged", 479, "CallRecordingPlayer.java").y("onWindowFocusChanged: %s", java.lang.Boolean.valueOf(z));
        super.onWindowFocusChanged(z);
        if (z || !this.C) {
            return;
        }
        c(false);
    }

    public CallRecordingPlayer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = defpackage.sta.a;
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f = j$.util.Optional.empty();
        this.z = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.i = j$.util.Optional.empty();
        this.j = j$.util.Optional.empty();
        this.k = j$.util.Optional.empty();
        this.l = true;
        this.m = false;
        this.n = false;
        this.A = false;
        this.B = false;
        this.v = j$.util.Optional.empty();
        this.C = true;
        this.D = j$.util.Optional.empty();
        this.w = j$.util.Optional.empty();
        this.x = new defpackage.sxq(this, 1);
        this.d = l();
        this.y = m();
        n();
    }

    public CallRecordingPlayer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = defpackage.sta.a;
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f = j$.util.Optional.empty();
        this.z = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.i = j$.util.Optional.empty();
        this.j = j$.util.Optional.empty();
        this.k = j$.util.Optional.empty();
        this.l = true;
        this.m = false;
        this.n = false;
        this.A = false;
        this.B = false;
        this.v = j$.util.Optional.empty();
        this.C = true;
        this.D = j$.util.Optional.empty();
        this.w = j$.util.Optional.empty();
        this.x = new defpackage.sxq(this, 1);
        this.d = l();
        this.y = m();
        n();
    }

    public CallRecordingPlayer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = defpackage.sta.a;
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f = j$.util.Optional.empty();
        this.z = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.i = j$.util.Optional.empty();
        this.j = j$.util.Optional.empty();
        this.k = j$.util.Optional.empty();
        this.l = true;
        this.m = false;
        this.n = false;
        this.A = false;
        this.B = false;
        this.v = j$.util.Optional.empty();
        this.C = true;
        this.D = j$.util.Optional.empty();
        this.w = j$.util.Optional.empty();
        this.x = new defpackage.sxq(this, 1);
        this.d = l();
        this.y = m();
        n();
    }
}
