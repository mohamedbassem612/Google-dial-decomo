package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoez implements defpackage.anvv {
    final java.util.concurrent.Executor a;
    final java.util.concurrent.ScheduledExecutorService b;
    final javax.net.ssl.SSLSocketFactory c;
    final defpackage.aofz d;
    final int e;
    final int f;
    final int g;
    final defpackage.zzx h;
    private final defpackage.aoag i;
    private final defpackage.aoag j;
    private final boolean k;
    private final defpackage.anuw l;
    private final long m;
    private boolean n;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public aoez(defpackage.aoag aoagVar, defpackage.aoag aoagVar2, javax.net.ssl.SSLSocketFactory sSLSocketFactory, defpackage.aofz aofzVar, int i, boolean z, long j, long j2, int i2, int i3, defpackage.zzx zzxVar) {
        this.i = aoagVar;
        this.a = aoagVar.a();
        this.j = aoagVar2;
        this.b = (java.util.concurrent.ScheduledExecutorService) aoagVar2.a();
        this.c = sSLSocketFactory;
        this.d = aofzVar;
        this.e = i;
        this.k = z;
        this.l = new defpackage.anuw(j);
        this.m = j2;
        this.f = i2;
        this.g = i3;
        if (zzxVar == null) {
            throw new java.lang.NullPointerException("transportTracerFactory");
        }
        this.h = zzxVar;
    }

    @Override // defpackage.anvv
    public final anwc a(java.net.SocketAddress socketAddress, anvu anvuVar, defpackage.anmd anmdVar) {
        if (this.n) {
            throw new java.lang.IllegalStateException("The transport factory is closed.");
        }
        defpackage.anuw anuwVar = this.l;
        anuv anuvVar = new anuv(anuwVar, anuwVar.c.get());
        aobd aobdVar = new aobd(this, anuvVar, 10);
        java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) socketAddress;
        java.lang.String str = anvuVar.a;
        java.lang.String str2 = anvuVar.c;
        anlw anlwVar = anvuVar.b;
        annj annjVar = anvuVar.d;
        defpackage.ahzi ahziVar = defpackage.anxo.q;
        java.util.logging.Logger logger = aogv.a;
        aofk aofkVar = new aofk(this, inetSocketAddress, str, str2, anlwVar, ahziVar, annjVar, aobdVar);
        if (this.k) {
            long j = anuvVar.a;
            long j2 = this.m;
            aofkVar.D = true;
            aofkVar.E = j;
            aofkVar.F = j2;
        }
        return aofkVar;
    }

    @Override // defpackage.anvv
    public final java.util.Collection b() {
        long j = defpackage.aofa.c;
        return java.util.Collections.singleton(java.net.InetSocketAddress.class);
    }

    @Override // defpackage.anvv
    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.b;
    }

    @Override // defpackage.anvv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.i.b(this.a);
        this.j.b(this.b);
    }
}
