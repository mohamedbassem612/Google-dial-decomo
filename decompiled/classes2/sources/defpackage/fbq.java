package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fbq {
    private long A;
    private long B;
    private final rai C;
    public final defpackage.etc a;
    public final long[] b;
    public final android.media.AudioTrack c;
    public final int d;
    public final long e;
    public final boolean f;
    public final defpackage.fbf g;
    public float h;
    public long i;
    public long j;
    public long k;
    public java.lang.reflect.Method l;
    public long m;
    public long n;
    public int o;
    public int p;
    public long q;
    public final long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    private long y;
    private long z;

    public fbq(rai raiVar, defpackage.etc etcVar, android.media.AudioTrack audioTrack, int i, int i2, int i3) {
        this.C = raiVar;
        this.a = etcVar;
        this.c = audioTrack;
        try {
            this.l = android.media.AudioTrack.class.getMethod("getLatency", null);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.v = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.g = new defpackage.fbf(audioTrack, raiVar);
        int sampleRate = audioTrack.getSampleRate();
        this.d = sampleRate;
        boolean zU = eum.U(i);
        this.f = zU;
        this.e = zU ? eum.y(i3 / i2, sampleRate) : -9223372036854775807L;
        this.z = 0L;
        this.A = 0L;
        this.w = false;
        this.B = 0L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.n = 0L;
        this.m = 0L;
        this.h = 1.0f;
        this.i = -9223372036854775807L;
    }

    private final long f() {
        android.media.AudioTrack audioTrack = this.c;
        ahvr.ci(audioTrack);
        return audioTrack.getPlayState() == 2 ? this.s : eum.t(eum.u(eum.w(android.os.SystemClock.elapsedRealtime()) - this.q, this.h), this.d) + this.s;
    }

    public final long a() {
        if (this.q != -9223372036854775807L) {
            return java.lang.Math.min(this.t, f());
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.y >= 5) {
            android.media.AudioTrack audioTrack = this.c;
            ahvr.ci(audioTrack);
            int playState = audioTrack.getPlayState();
            if (playState != 1 && (this.x || playState != 2)) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
                long j = this.z;
                long j2 = playbackHeadPosition & 4294967295L;
                if (j > j2) {
                    if (j - j2 >= 2147483648L) {
                        this.A++;
                    } else {
                        e();
                        this.g.c(0);
                    }
                }
                this.z = j2;
            }
            this.y = jElapsedRealtime;
        }
        return this.z + this.B + (this.A << 32);
    }

    public final long b(long j) {
        long jU;
        if (this.p == 0) {
            jU = this.q != -9223372036854775807L ? eum.y(f(), this.d) : c();
        } else {
            jU = eum.u(j + this.j, this.h);
        }
        long jMax = java.lang.Math.max(0L, jU - this.m);
        return this.q != -9223372036854775807L ? java.lang.Math.min(eum.y(this.t, this.d), jMax) : jMax;
    }

    public final long c() {
        return eum.y(a(), this.d);
    }

    public final void d(long j) {
        long j2 = this.i;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - eum.C(eum.v(j - j2, this.h));
        this.i = -9223372036854775807L;
        defpackage.eto etoVar = ((defpackage.fbn) this.C.a).k;
        if (etoVar.g()) {
            etoVar.e(-1, new defpackage.etl() { // from class: fbj
                @Override // defpackage.etl
                public final void a(java.lang.Object obj) {
                    rai raiVar;
                    rai raiVar2 = (rai) obj;
                    defpackage.fbw fbwVar = (defpackage.fbw) raiVar2.a;
                    if (!raiVar2.equals(fbwVar.W) || (raiVar = fbwVar.V) == null) {
                        return;
                    }
                    defpackage.fca fcaVar = (defpackage.fca) raiVar.a;
                    fcaVar.n = true;
                    ils ilsVar = fcaVar.q;
                    java.lang.Object obj2 = ilsVar.b;
                    if (obj2 != null) {
                        ((android.os.Handler) obj2).post(new defpackage.drn(ilsVar, 14));
                    }
                }
            });
        }
    }

    public final void e() {
        this.j = 0L;
        this.p = 0;
        this.o = 0;
        this.k = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
    }
}
