package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vol extends eoa {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/GreetingRecorder");
    public final eng b = new eng();
    public final defpackage.vok c = new defpackage.vok();
    public final java.io.File d;
    public final android.media.MediaRecorder e;
    public final ajct f;
    public final ajct g;
    public int i;
    public int j;
    public boolean k;
    public android.telecom.PhoneAccountHandle l;
    public boolean m;
    public final enf n;
    public final oii o;
    public final defpackage.uyg p;
    public final defpackage.vqf q;
    private final oju r;
    private android.os.PowerManager.WakeLock s;
    private final android.media.AudioFocusRequest t;

    public vol(android.app.Application application, boolean z) {
        android.media.MediaRecorder mediaRecorder = new android.media.MediaRecorder();
        this.e = mediaRecorder;
        this.k = false;
        this.n = new defpackage.voh(this);
        mediaRecorder.setOnInfoListener(new android.media.MediaRecorder.OnInfoListener() { // from class: vof
            @Override // android.media.MediaRecorder.OnInfoListener
            public final void onInfo(android.media.MediaRecorder mediaRecorder2, int i, int i2) {
                if (i == 800) {
                    this.a.j();
                }
            }
        });
        oii oiiVarO = wsc.aA(application).nN().o();
        this.o = oiiVarO;
        oiiVarO.h(new android.media.AudioAttributes.Builder().setContentType(1).setUsage(1).build());
        oiiVarO.j(new tge(this, 13));
        this.k = z;
        this.d = new java.io.File(application.getFilesDir(), true != z ? "/temporary_voicemail_greeting.amr" : "/temporary_voicemail_greeting.m4a");
        this.p = wsc.aA(application).mC();
        this.q = wsc.aA(application).mD();
        this.f = wsc.aA(application).fH();
        this.g = wsc.aA(application).fF();
        this.r = wsc.aA(application).ba();
        android.os.PowerManager powerManager = (android.os.PowerManager) application.getSystemService(android.os.PowerManager.class);
        if (powerManager.isWakeLockLevelSupported(32)) {
            this.s = powerManager.newWakeLock(32, "Dialer:GreetingRecorder");
        } else {
            a.bI(a.d(), "weak lock is not supported", "com/android/dialer/voicemail/settings/GreetingRecorder", "<init>", (char) 182, "GreetingRecorder.java", zct.b);
        }
        this.t = da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(new android.media.AudioFocusRequest.Builder(2), new android.media.AudioAttributes.Builder().setUsage(1).setContentType(1).build()));
        m(defpackage.voj.a);
    }

    private final void l() {
        this.r.a(this.t);
    }

    private final void m(defpackage.voj vojVar) {
        gus.aI();
        this.b.k(vojVar);
    }

    public final int a() {
        return this.c.a();
    }

    public final void b(boolean z) {
        android.os.PowerManager.WakeLock wakeLock = this.s;
        if (wakeLock == null) {
            a.bI(a.d(), "already released by timeout", "com/android/dialer/voicemail/settings/GreetingRecorder", "enableProximitySensor", (char) 499, "GreetingRecorder.java", zct.b);
            return;
        }
        if (z) {
            if (wakeLock.isHeld()) {
                return;
            }
            this.s.acquire(this.i);
        } else if (wakeLock.isHeld()) {
            try {
                this.s.release();
            } catch (java.lang.RuntimeException e) {
                a.bq(a.d(), "already released by timeout", "com/android/dialer/voicemail/settings/GreetingRecorder", "enableProximitySensor", (char) 512, "GreetingRecorder.java", e, zct.b);
            }
        }
    }

    public final void c(defpackage.voj vojVar) {
        gus.aJ();
        this.b.i(vojVar);
    }

    protected final void d() {
        if (this.b.d() == defpackage.voj.b && !this.m) {
            fh$.ExternalSyntheticApiModelOutline0.m(this.e);
        }
        this.e.release();
        this.o.e();
    }

    public final void e() {
        this.r.d(this.t);
    }

    public final void f() {
        h();
        this.c.b();
        this.m = false;
        m(defpackage.voj.a);
    }

    public final void h() {
        eng engVar = this.b;
        if (engVar.d() == defpackage.voj.b) {
            j();
        } else if (engVar.d() == defpackage.voj.d) {
            i(defpackage.voj.e);
        }
    }

    public final void i(defpackage.voj vojVar) {
        if (!this.d.exists()) {
            throw new java.lang.IllegalStateException("greetings not loaded yet");
        }
        l();
        this.o.n();
        defpackage.vok vokVar = this.c;
        vokVar.d();
        vokVar.b();
        m(vojVar);
    }

    public final void j() {
        defpackage.vok vokVar = this.c;
        this.j = vokVar.a();
        vokVar.d();
        vokVar.b();
        android.media.MediaRecorder mediaRecorder = this.e;
        mediaRecorder.stop();
        mediaRecorder.reset();
        this.m = false;
        b(false);
        l();
        oii oiiVar = this.o;
        oiiVar.f();
        try {
            oiiVar.i(this.d.getAbsolutePath());
            m(defpackage.voj.c);
        } catch (java.io.IOException e) {
            throw new defpackage.ahzr(e);
        }
    }

    public final void k() {
        int iOrdinal = ((defpackage.voj) this.b.d()).ordinal();
        if (iOrdinal == 0) {
            ahvr.J(this.g.eU(ahqx.i(new defpackage.vdp(this, 20))), new jya(this, 13), ajbm.a);
            return;
        }
        if (iOrdinal == 1) {
            j();
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                i(defpackage.voj.e);
                return;
            } else if (iOrdinal != 4 && iOrdinal != 5) {
                return;
            }
        }
        if (!this.d.exists()) {
            throw new java.lang.IllegalStateException("greetings not exist");
        }
        ahvr.J(this.g.eU(ahqx.i(new defpackage.vdp(this, 19))), new jya(this, 14, (byte[]) null), ajbm.a);
    }
}
