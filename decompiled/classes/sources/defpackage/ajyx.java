package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajyx {
    public final android.content.Context a;
    public final defpackage.ajzx b;
    public final java.util.concurrent.Executor c;
    public final java.util.concurrent.Executor d;
    public final java.util.concurrent.Executor e;
    public final java.util.concurrent.ScheduledExecutorService f;
    public final defpackage.akab g;
    public final java.lang.String h;
    public final defpackage.ahzi i;
    public final defpackage.ahzi j;
    public final int k;
    public final long l;
    public final long m;
    private final defpackage.ahzi n;
    private final defpackage.aazc o;

    public ajyx(android.content.Context context, defpackage.aazc aazcVar, defpackage.ajzx ajzxVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.akab akabVar, java.lang.String str, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2, defpackage.ahzi ahziVar3, int i, long j, long j2) {
        this.a = context;
        this.o = aazcVar;
        this.b = ajzxVar;
        this.c = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = scheduledExecutorService;
        this.g = akabVar;
        this.h = str;
        this.i = ahziVar;
        this.n = ahziVar2;
        this.j = ahziVar3;
        this.k = i;
        this.l = j;
        this.m = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        defpackage.akab akabVar;
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajyx) {
            defpackage.ajyx ajyxVar = (defpackage.ajyx) obj;
            if (this.a.equals(ajyxVar.a) && this.o.equals(ajyxVar.o) && this.b.equals(ajyxVar.b) && this.c.equals(ajyxVar.c) && this.d.equals(ajyxVar.d) && this.e.equals(ajyxVar.e) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(ajyxVar.f) : ajyxVar.f == null) && ((akabVar = this.g) != null ? akabVar.equals(ajyxVar.g) : ajyxVar.g == null) && ((str = this.h) != null ? str.equals(ajyxVar.h) : ajyxVar.h == null) && this.i.equals(ajyxVar.i) && this.n.equals(ajyxVar.n) && this.j.equals(ajyxVar.j) && this.k == ajyxVar.k && this.l == ajyxVar.l && this.m == ajyxVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f;
        int iHashCode2 = ((iHashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        defpackage.akab akabVar = this.g;
        int iHashCode3 = iHashCode2 ^ (akabVar == null ? 0 : akabVar.hashCode());
        java.lang.String str = this.h;
        int iHashCode4 = ((((((((((iHashCode3 * (-721379959)) ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.j.hashCode()) * 583896283) ^ this.k) * 1000003;
        long j = this.l;
        int i = (iHashCode4 ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.m;
        return (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
    }

    public final java.lang.String toString() {
        defpackage.ahzi ahziVar = this.j;
        defpackage.ahzi ahziVar2 = this.n;
        defpackage.ahzi ahziVar3 = this.i;
        defpackage.akab akabVar = this.g;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f;
        java.util.concurrent.Executor executor = this.e;
        java.util.concurrent.Executor executor2 = this.d;
        java.util.concurrent.Executor executor3 = this.c;
        defpackage.ajzx ajzxVar = this.b;
        defpackage.aazc aazcVar = this.o;
        return "ChannelConfig{context=" + java.lang.String.valueOf(this.a) + ", clock=" + java.lang.String.valueOf(aazcVar) + ", transport=" + java.lang.String.valueOf(ajzxVar) + ", lightweightExecutor=" + java.lang.String.valueOf(executor3) + ", backgroundExecutor=" + java.lang.String.valueOf(executor2) + ", blockingExecutor=" + java.lang.String.valueOf(executor) + ", lightweightScheduledExecutor=" + java.lang.String.valueOf(scheduledExecutorService) + ", authContextManager=" + java.lang.String.valueOf(akabVar) + ", rpcCacheProvider=null, userAgentOverride=" + this.h + ", recordNetworkMetricsToPrimes=" + java.lang.String.valueOf(ahziVar3) + ", recordCachingMetricsToPrimes=" + java.lang.String.valueOf(ahziVar2) + ", grpcIdleTimeoutMillis=" + java.lang.String.valueOf(ahziVar) + ", grpcServiceConfig=null, consistencyTokenConfig=null, maxMessageSize=" + this.k + ", grpcKeepAliveTimeMillis=" + this.l + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null}";
    }

    public ajyx() {
        throw null;
    }
}
