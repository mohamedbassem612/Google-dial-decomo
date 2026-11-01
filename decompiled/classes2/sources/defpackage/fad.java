package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fad {
    private defpackage.eqg A;
    private defpackage.eqg B;
    public final android.content.Context a;
    public final defpackage.fae c;
    public final android.media.metrics.PlaybackSession d;
    public java.lang.String h;
    public android.media.metrics.PlaybackMetrics.Builder i;
    public int j;
    public defpackage.erb m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public alic u;
    public alic v;
    public alic w;
    private defpackage.eqg z;
    public final java.util.concurrent.Executor b = defpackage.hgu.aD();
    private final defpackage.erl x = new defpackage.erl();
    private final defpackage.erk y = new defpackage.erk();
    public final java.util.HashMap g = new java.util.HashMap();
    public final java.util.HashMap f = new java.util.HashMap();
    public final long e = android.os.SystemClock.elapsedRealtime();
    public int k = 0;
    public int l = 0;

    public fad(android.content.Context context, android.media.metrics.PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        defpackage.ezx ezxVar = new defpackage.ezx();
        this.c = ezxVar;
        ezxVar.c = this;
    }

    public static int a(int i) {
        switch (eum.k(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void i(int i, long j, defpackage.eqg eqgVar, int i2) {
        android.media.metrics.TrackChangeEvent.Builder builderM = ac$.ExternalSyntheticApiModelOutline0.m(new android.media.metrics.TrackChangeEvent.Builder(i), j - this.e);
        if (eqgVar != null) {
            ac$.ExternalSyntheticApiModelOutline0.m$5(builderM, 1);
            ac$.ExternalSyntheticApiModelOutline0.m$6(builderM, i2 != 1 ? 1 : 2);
            java.lang.String str = eqgVar.o;
            if (str != null) {
                ac$.ExternalSyntheticApiModelOutline0.m$4(builderM, str);
            }
            java.lang.String str2 = eqgVar.p;
            if (str2 != null) {
                ac$.ExternalSyntheticApiModelOutline0.m(builderM, str2);
            }
            java.lang.String str3 = eqgVar.k;
            if (str3 != null) {
                ac$.ExternalSyntheticApiModelOutline0.m$1(builderM, str3);
            }
            int i3 = eqgVar.j;
            if (i3 != -1) {
                ac$.ExternalSyntheticApiModelOutline0.m(builderM, i3);
            }
            int i4 = eqgVar.v;
            if (i4 != -1) {
                ac$.ExternalSyntheticApiModelOutline0.m$1(builderM, i4);
            }
            int i5 = eqgVar.w;
            if (i5 != -1) {
                ac$.ExternalSyntheticApiModelOutline0.m$2(builderM, i5);
            }
            int i6 = eqgVar.H;
            if (i6 != -1) {
                ac$.ExternalSyntheticApiModelOutline0.m$3(builderM, i6);
            }
            int i7 = eqgVar.J;
            if (i7 != -1) {
                ac$.ExternalSyntheticApiModelOutline0.m$4(builderM, i7);
            }
            java.lang.String str4 = eqgVar.d;
            if (str4 != null) {
                java.lang.String str5 = eum.a;
                java.lang.String[] strArrSplit = str4.split("-", -1);
                android.util.Pair pairCreate = android.util.Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                ac$.ExternalSyntheticApiModelOutline0.m$2(builderM, (java.lang.String) pairCreate.first);
                if (pairCreate.second != null) {
                    ac$.ExternalSyntheticApiModelOutline0.m$3(builderM, (java.lang.String) pairCreate.second);
                }
            }
            float f = eqgVar.z;
            if (f != -1.0f) {
                ac$.ExternalSyntheticApiModelOutline0.m(builderM, f);
            }
        } else {
            ac$.ExternalSyntheticApiModelOutline0.m$5(builderM, 0);
        }
        this.t = true;
        final android.media.metrics.TrackChangeEvent trackChangeEventM = ac$.ExternalSyntheticApiModelOutline0.m(builderM);
        this.b.execute(new java.lang.Runnable() { // from class: ezy
            @Override // java.lang.Runnable
            public final void run() {
                ac$.ExternalSyntheticApiModelOutline0.m(this.a.d, trackChangeEventM);
            }
        });
    }

    public final void b() {
        android.media.metrics.PlaybackMetrics.Builder builder = this.i;
        if (builder != null && this.t) {
            ac$.ExternalSyntheticApiModelOutline0.m$1(builder, this.s);
            ac$.ExternalSyntheticApiModelOutline0.m$2(this.i, this.q);
            ac$.ExternalSyntheticApiModelOutline0.m$3(this.i, this.r);
            java.lang.Long l = (java.lang.Long) this.f.get(this.h);
            ac$.ExternalSyntheticApiModelOutline0.m$1(this.i, l == null ? 0L : l.longValue());
            java.lang.Long l2 = (java.lang.Long) this.g.get(this.h);
            ac$.ExternalSyntheticApiModelOutline0.m$2(this.i, l2 == null ? 0L : l2.longValue());
            ac$.ExternalSyntheticApiModelOutline0.m$4(this.i, (l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final android.media.metrics.PlaybackMetrics playbackMetricsM = ac$.ExternalSyntheticApiModelOutline0.m(this.i);
            this.b.execute(new java.lang.Runnable() { // from class: fab
                @Override // java.lang.Runnable
                public final void run() {
                    ac$.ExternalSyntheticApiModelOutline0.m(this.a.d, playbackMetricsM);
                }
            });
        }
        this.i = null;
        this.h = null;
        this.s = 0;
        this.q = 0;
        this.r = 0;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = false;
    }

    public final void c(defpackage.erm ermVar, defpackage.ffu ffuVar) {
        int iA;
        android.media.metrics.PlaybackMetrics.Builder builder = this.i;
        if (ffuVar == null || (iA = ermVar.a(ffuVar.a)) == -1) {
            return;
        }
        defpackage.erk erkVar = this.y;
        int i = 0;
        ermVar.d(iA, erkVar, false);
        defpackage.erl erlVar = this.x;
        ermVar.e(erkVar.c, erlVar, 0L);
        defpackage.eqq eqqVar = erlVar.d.b;
        if (eqqVar != null) {
            int iQ = eum.q(eqqVar.a, eqqVar.b);
            if (iQ == 0) {
                i = 3;
            } else if (iQ != 1) {
                i = iQ != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        ac$.ExternalSyntheticApiModelOutline0.m$5(builder, i);
        if (erlVar.m != -9223372036854775807L && !erlVar.k && !erlVar.i && !erlVar.c()) {
            ac$.ExternalSyntheticApiModelOutline0.m$3(builder, erlVar.b());
        }
        ac$.ExternalSyntheticApiModelOutline0.m$6(builder, true != erlVar.c() ? 1 : 2);
        this.t = true;
    }

    public final void d(long j, defpackage.eqg eqgVar) {
        if (j$.util.Objects.equals(this.A, eqgVar)) {
            return;
        }
        int i = this.A == null ? 1 : 0;
        this.A = eqgVar;
        i(0, j, eqgVar, i);
    }

    public final void e(long j, defpackage.eqg eqgVar) {
        if (j$.util.Objects.equals(this.B, eqgVar)) {
            return;
        }
        int i = this.B == null ? 1 : 0;
        this.B = eqgVar;
        i(2, j, eqgVar, i);
    }

    public final void f(long j, defpackage.eqg eqgVar) {
        if (j$.util.Objects.equals(this.z, eqgVar)) {
            return;
        }
        int i = this.z == null ? 1 : 0;
        this.z = eqgVar;
        i(1, j, eqgVar, i);
    }

    public final void g(defpackage.ezm ezmVar, java.lang.String str) {
        defpackage.ffu ffuVar = ezmVar.d;
        if ((ffuVar == null || !ffuVar.c()) && str.equals(this.h)) {
            b();
        }
        this.f.remove(str);
        this.g.remove(str);
    }

    public final boolean h(alic alicVar) {
        if (alicVar != null) {
            defpackage.fae faeVar = this.c;
            if (((java.lang.String) alicVar.c).equals(faeVar.c())) {
                return true;
            }
        }
        return false;
    }
}
