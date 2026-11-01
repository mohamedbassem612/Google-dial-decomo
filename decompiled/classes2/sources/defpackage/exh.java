package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exh implements defpackage.eym {
    public static final aify a = aify.u("file", "content", "data", "android.resource", "rawresource", "asset");
    public final defpackage.fiq b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final j$.util.concurrent.ConcurrentHashMap h;
    public long i;
    private final defpackage.erl j;
    private final defpackage.erk k;
    private final long l;
    private final long m;
    private final long n;
    private final long o;
    private final aigf p;

    public exh() {
        defpackage.fiq fiqVar = new defpackage.fiq();
        aigf aigfVar = aikj.b;
        ahvr.bW(true, "%s cannot be less than %s", "bufferForPlaybackMs", "0");
        ahvr.bW(true, "%s cannot be less than %s", "bufferForPlaybackForLocalPlaybackMs", "0");
        ahvr.bW(true, "%s cannot be less than %s", "bufferForPlaybackAfterRebufferMs", "0");
        ahvr.bW(true, "%s cannot be less than %s", "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        ahvr.bW(true, "%s cannot be less than %s", "minBufferMs", "bufferForPlaybackMs");
        ahvr.bW(true, "%s cannot be less than %s", "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        ahvr.bW(true, "%s cannot be less than %s", "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ahvr.bW(true, "%s cannot be less than %s", "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        ahvr.bW(true, "%s cannot be less than %s", "maxBufferMs", "minBufferMs");
        ahvr.bW(true, "%s cannot be less than %s", "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        ahvr.bW(true, "%s cannot be less than %s", "backBufferDurationMs", "0");
        this.j = new defpackage.erl();
        this.k = new defpackage.erk();
        this.b = fiqVar;
        this.l = eum.w(50000L);
        this.m = eum.w(1000L);
        this.n = eum.w(50000L);
        this.o = eum.w(50000L);
        this.c = eum.w(1000L);
        this.d = eum.w(1000L);
        this.e = eum.w(2000L);
        this.f = eum.w(1000L);
        this.g = eum.w(0L);
        this.h = new j$.util.concurrent.ConcurrentHashMap();
        this.p = aigf.i(aigfVar);
        this.i = -1L;
    }

    public static final boolean h(boolean z) {
        return z;
    }

    public final int a(defpackage.fag fagVar) {
        defpackage.exg exgVar = (defpackage.exg) this.h.get(fagVar);
        ahvr.ci(exgVar);
        return exgVar.c;
    }

    public final int b(defpackage.fag fagVar) {
        java.lang.Integer num = (java.lang.Integer) this.p.get(fagVar.b);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    public final int c(defpackage.fag fagVar) {
        defpackage.exg exgVar = (defpackage.exg) this.h.get(fagVar);
        ahvr.ci(exgVar);
        return exgVar.a() << 16;
    }

    public final void d(defpackage.fag fagVar) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.h;
        defpackage.exg exgVar = (defpackage.exg) concurrentHashMap.get(fagVar);
        if (exgVar != null) {
            int i = exgVar.a - 1;
            exgVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(fagVar);
                e();
            }
        }
    }

    public final void e() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.h;
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        defpackage.fiq fiqVar = this.b;
        if (zIsEmpty) {
            fiqVar.f();
            return;
        }
        java.util.Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((defpackage.exg) it.next()).c;
        }
        fiqVar.g(i);
    }

    public final boolean f(defpackage.eyl eylVar) {
        defpackage.erm ermVar = eylVar.b;
        defpackage.eqq eqqVar = ermVar.e(ermVar.m(eylVar.c.a, this.k).c, this.j, 0L).d.b;
        if (eqqVar == null) {
            return false;
        }
        java.lang.String scheme = eqqVar.a.getScheme();
        return android.text.TextUtils.isEmpty(scheme) || a.contains(scheme);
    }

    @Override // defpackage.eym
    public final boolean g(defpackage.eyl eylVar) {
        long jMin;
        long j;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.h;
        defpackage.fag fagVar = eylVar.a;
        defpackage.exg exgVar = (defpackage.exg) concurrentHashMap.get(fagVar);
        ahvr.ci(exgVar);
        int iC = c(fagVar);
        int iA = a(fagVar);
        boolean z = false;
        if (fagVar.equals(defpackage.fag.a)) {
            return iC < iA;
        }
        boolean zF = f(eylVar);
        if (zF) {
            jMin = this.m;
            j = this.o;
        } else {
            jMin = this.l;
            j = this.n;
        }
        float f = eylVar.e;
        if (f > 1.0f) {
            jMin = java.lang.Math.min(eum.u(jMin, f), j);
        }
        long j2 = eylVar.d;
        if (j2 < java.lang.Math.max(jMin, 500000L)) {
            boolean zH = h(zF);
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            boolean z2 = runtime.totalMemory() < jMaxMemory || runtime.freeMemory() + ((long) this.b.e()) >= jMaxMemory / 25;
            if (!zH ? iC < iA : !(!z2 && iC >= iA)) {
                z = true;
            }
            exgVar.b = z;
            if (!z && zH && !z2) {
                defpackage.etr.e("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!exgVar.b && j2 < 500000) {
                defpackage.etr.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || iC >= iA) {
            exgVar.b = false;
        }
        return exgVar.b;
    }
}
