package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiaa {
    static final defpackage.ahzi a = new defpackage.ahzm(new defpackage.ahvr());
    static final defpackage.ahzp b = new defpackage.ahzw();
    defpackage.aibb g;
    defpackage.aibb h;
    defpackage.ahxt k;
    defpackage.ahxt l;
    defpackage.aibv m;
    defpackage.ahzp n;
    defpackage.ahzz p;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long i = -1;
    long j = -1;
    final defpackage.ahzi o = a;

    public final defpackage.ahzv a() {
        if (this.p == null) {
            defpackage.ahvr.bZ(this.f == -1, "maximumWeight requires weigher");
        } else {
            boolean z = this.c;
            long j = this.f;
            if (z) {
                defpackage.ahvr.bZ(j != -1, "weigher requires maximumWeight");
            } else if (j == -1) {
                ahzx.a.logp(java.util.logging.Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
            }
        }
        return new defpackage.aiaw(this);
    }

    final defpackage.aibb b() {
        return (defpackage.aibb) defpackage.ahvr.m(this.g, defpackage.aibb.a);
    }

    final defpackage.aibb c() {
        return (defpackage.aibb) defpackage.ahvr.m(this.h, defpackage.aibb.a);
    }

    public final void d(int i) {
        int i2 = this.d;
        defpackage.ahvr.ca(i2 == -1, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    @java.lang.Deprecated
    public final void e(long j, java.util.concurrent.TimeUnit timeUnit) {
        long j2 = this.i;
        defpackage.ahvr.cb(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        defpackage.ahvr.cg(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31, j, timeUnit);
        this.i = timeUnit.toNanos(j);
    }

    public final void f(long j) {
        long j2 = this.e;
        defpackage.ahvr.cb(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f;
        defpackage.ahvr.cb(j3 == -1, "maximum weight was already set to %s", j3);
        defpackage.ahvr.bZ(this.p == null, "maximum size can not be combined with weigher");
        this.e = j;
    }

    public final void g(defpackage.aibv aibvVar) {
        if (this.m != null) {
            throw new java.lang.IllegalStateException();
        }
        aibvVar.getClass();
        this.m = aibvVar;
    }

    public final void h(defpackage.aibb aibbVar) {
        defpackage.aibb aibbVar2 = this.g;
        defpackage.ahvr.cc(aibbVar2 == null, "Key strength was already set to %s", aibbVar2);
        aibbVar.getClass();
        this.g = aibbVar;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        int i = this.d;
        if (i != -1) {
            ahymVarL.e("concurrencyLevel", i);
        }
        long j = this.e;
        if (j != -1) {
            ahymVarL.f("maximumSize", j);
        }
        long j2 = this.f;
        if (j2 != -1) {
            ahymVarL.f("maximumWeight", j2);
        }
        long j3 = this.i;
        if (j3 != -1) {
            ahymVarL.b("expireAfterWrite", j3 + "ns");
        }
        long j4 = this.j;
        if (j4 != -1) {
            ahymVarL.b("expireAfterAccess", j4 + "ns");
        }
        defpackage.aibb aibbVar = this.g;
        if (aibbVar != null) {
            ahymVarL.b("keyStrength", defpackage.ahvr.p(aibbVar.toString()));
        }
        defpackage.aibb aibbVar2 = this.h;
        if (aibbVar2 != null) {
            ahymVarL.b("valueStrength", defpackage.ahvr.p(aibbVar2.toString()));
        }
        if (this.k != null) {
            ahymVarL.a("keyEquivalence");
        }
        if (this.l != null) {
            ahymVarL.a("valueEquivalence");
        }
        if (this.m != null) {
            ahymVarL.a("removalListener");
        }
        return ahymVarL.toString();
    }
}
