package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anwv extends defpackage.anpv {
    public static final java.util.logging.Logger b;
    public static final java.util.Set c;
    static final boolean d;
    static final boolean e;
    protected static final boolean f;
    public static final anwu g;
    private static final java.lang.String s;
    private static final java.lang.String t;
    private static final java.lang.String u;
    private static java.lang.String v;
    private antw A;
    public final java.lang.String j;
    public final int k;
    public final long l;
    public final defpackage.anrc m;
    public final defpackage.anpu n;
    public final defpackage.ahzh o;
    public boolean p;
    public boolean q;
    private final java.lang.String w;
    private final defpackage.aoag x;
    private boolean y;
    private java.util.concurrent.Executor z;
    public final java.util.Random h = new java.util.Random();
    protected volatile int r = 1;
    public final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference();

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(defpackage.anwv.class.getName());
        b = logger;
        c = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        java.lang.String property = java.lang.System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        java.lang.String property2 = java.lang.System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        java.lang.String property3 = java.lang.System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        d = java.lang.Boolean.parseBoolean(property);
        e = java.lang.Boolean.parseBoolean(property2);
        f = java.lang.Boolean.parseBoolean(property3);
        anwu anwuVar = null;
        try {
            try {
                try {
                    anwu anwuVar2 = (anwu) java.lang.Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, defpackage.anwv.class.getClassLoader()).asSubclass(anwu.class).getConstructor(null).newInstance(null);
                    if (anwuVar2.b() != null) {
                        logger.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", anwuVar2.b());
                    } else {
                        anwuVar = anwuVar2;
                    }
                } catch (java.lang.Exception e2) {
                    b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (java.lang.Throwable) e2);
                }
            } catch (java.lang.Exception e3) {
                b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (java.lang.Throwable) e3);
            }
        } catch (java.lang.ClassCastException e4) {
            b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (java.lang.Throwable) e4);
        } catch (java.lang.ClassNotFoundException e5) {
            b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (java.lang.Throwable) e5);
        }
        g = anwuVar;
    }

    protected anwv(java.lang.String str, defpackage.anpq anpqVar, defpackage.aode aodeVar, defpackage.ahzh ahzhVar, boolean z) {
        long nanos;
        if (anpqVar == null) {
            throw new java.lang.NullPointerException("args");
        }
        if (str == null) {
            throw new java.lang.NullPointerException("name");
        }
        java.net.URI uriCreate = java.net.URI.create("//".concat(str));
        defpackage.ahvr.bR(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        java.lang.String authority = uriCreate.getAuthority();
        defpackage.ahvr.cl(authority, "nameUri (%s) doesn't have an authority", uriCreate);
        this.w = authority;
        this.j = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.k = anpqVar.a;
        } else {
            this.k = uriCreate.getPort();
        }
        java.util.concurrent.Executor executor = anpqVar.f;
        if (executor != null) {
            this.x = new defpackage.aodg(executor, 1);
        } else {
            this.x = new defpackage.aodg(aodeVar, 0);
        }
        if (z) {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            nanos = 30000000000L;
        } else {
            java.lang.String property = java.lang.System.getProperty("networkaddress.cache.ttl");
            if (property != null) {
                try {
                    nanos = java.lang.Long.parseLong(property);
                } catch (java.lang.NumberFormatException unused) {
                    b.logp(java.util.logging.Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new java.lang.Object[]{"networkaddress.cache.ttl", property, 30L});
                    nanos = 30;
                }
            } else {
                nanos = 30;
            }
            if (nanos > 0) {
                nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(nanos);
            }
        }
        this.l = nanos;
        this.o = ahzhVar;
        this.m = anpqVar.c;
        this.n = anpqVar.d;
    }

    public static java.lang.String e() {
        java.lang.String str = v;
        if (str != null) {
            return str;
        }
        try {
            java.lang.String hostName = java.net.InetAddress.getLocalHost().getHostName();
            v = hostName;
            return hostName;
        } catch (java.net.UnknownHostException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private final void f() {
        if (this.q || this.y) {
            return;
        }
        if (this.p) {
            long j = this.l;
            if (j != 0 && (j <= 0 || this.o.a(java.util.concurrent.TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.q = true;
        this.z.execute(new anws(this, this.A));
    }

    @Override // defpackage.anpv
    public final java.lang.String a() {
        return this.w;
    }

    @Override // defpackage.anpv
    public final void b() {
        defpackage.ahvr.bZ(this.A != null, "not started");
        f();
    }

    @Override // defpackage.anpv
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        java.util.concurrent.Executor executor = this.z;
        if (executor != null) {
            this.x.b(executor);
            this.z = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.anpv
    public final void d(antw antwVar) {
        defpackage.ahvr.bZ(this.A == null, "already started");
        this.z = this.x.a();
        this.A = antwVar;
        f();
    }
}
