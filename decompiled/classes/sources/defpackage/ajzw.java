package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajzw {
    public static final long a;
    public final android.content.Context b;
    public final java.net.URI c;
    public final java.util.concurrent.Executor d;
    public final java.util.concurrent.Executor e;
    public final java.util.concurrent.ScheduledExecutorService f;
    public final java.lang.String g;
    public final defpackage.ahzi h;
    public final java.lang.Integer i;
    public final java.lang.Integer j;
    public final long k;
    public final int l;
    public final long m;
    public final defpackage.akcg n;
    private final java.util.concurrent.Executor o;
    private final long p;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        a = 20000L;
    }

    public ajzw(android.content.Context context, java.net.URI uri, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.String str, defpackage.ahzi ahziVar, java.lang.Integer num, java.lang.Integer num2, long j, int i, long j2, long j3, defpackage.akcg akcgVar) {
        this.b = context;
        this.c = uri;
        this.o = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = scheduledExecutorService;
        this.g = str;
        this.h = ahziVar;
        this.i = num;
        this.j = num2;
        this.k = j;
        this.l = i;
        this.p = j2;
        this.m = j3;
        this.n = akcgVar;
    }

    public final int a() {
        return this.c.getPort();
    }

    public final java.lang.String b() {
        return this.c.getHost();
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        java.lang.String str;
        java.lang.Integer num;
        java.lang.Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajzw) {
            defpackage.ajzw ajzwVar = (defpackage.ajzw) obj;
            if (this.b.equals(ajzwVar.b) && this.c.equals(ajzwVar.c) && this.o.equals(ajzwVar.o) && this.d.equals(ajzwVar.d) && this.e.equals(ajzwVar.e) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(ajzwVar.f) : ajzwVar.f == null) && ((str = this.g) != null ? str.equals(ajzwVar.g) : ajzwVar.g == null) && this.h.equals(ajzwVar.h) && ((num = this.i) != null ? num.equals(ajzwVar.i) : ajzwVar.i == null) && ((num2 = this.j) != null ? num2.equals(ajzwVar.j) : ajzwVar.j == null) && this.k == ajzwVar.k && this.l == ajzwVar.l && this.p == ajzwVar.p && this.m == ajzwVar.m && this.n.equals(ajzwVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f;
        int iHashCode2 = ((iHashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        java.lang.String str = this.g;
        int iHashCode3 = ((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.h.hashCode();
        java.lang.Integer num = this.i;
        int iHashCode4 = ((iHashCode3 * (-721379959)) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        java.lang.Integer num2 = this.j;
        int iHashCode5 = num2 != null ? num2.hashCode() : 0;
        long j = this.k;
        int i = (((((iHashCode4 ^ iHashCode5) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.l) * 1000003;
        long j2 = this.p;
        long j3 = this.m;
        return ((((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * (-721379959)) ^ this.n.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.akcg akcgVar = this.n;
        defpackage.ahzi ahziVar = this.h;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f;
        java.util.concurrent.Executor executor = this.e;
        java.util.concurrent.Executor executor2 = this.d;
        java.util.concurrent.Executor executor3 = this.o;
        java.net.URI uri = this.c;
        return "TransportConfig{applicationContext=" + java.lang.String.valueOf(this.b) + ", uri=" + java.lang.String.valueOf(uri) + ", backgroundExecutor=" + java.lang.String.valueOf(executor3) + ", blockingExecutor=" + java.lang.String.valueOf(executor2) + ", lightweightExecutor=" + java.lang.String.valueOf(executor) + ", lightweightScheduledExecutorService=" + java.lang.String.valueOf(scheduledExecutorService) + ", userAgentOverride=" + this.g + ", recordNetworkMetricsToPrimes=" + java.lang.String.valueOf(ahziVar) + ", grpcServiceConfig=null, trafficStatsUid=" + this.i + ", trafficStatsTag=" + this.j + ", grpcIdleTimeoutMillis=" + this.k + ", maxMessageSize=" + this.l + ", grpcKeepAliveTimeMillis=" + this.p + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null, streamzWrapper=" + java.lang.String.valueOf(akcgVar) + '}';
    }

    public ajzw() {
        throw null;
    }
}
