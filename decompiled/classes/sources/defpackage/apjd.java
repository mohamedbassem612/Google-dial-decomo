package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjd {
    public defpackage.apio a;
    public final java.util.List b;
    public final java.util.List c;
    public boolean d;
    public final defpackage.apid e;
    public boolean f;
    public final defpackage.apin g;
    public final defpackage.apir h;
    public java.net.Proxy i;
    public java.net.ProxySelector j;
    public final defpackage.apid k;
    public final javax.net.SocketFactory l;
    public javax.net.ssl.SSLSocketFactory m;
    public javax.net.ssl.X509TrustManager n;
    public final java.util.List o;
    public final java.util.List p;
    public javax.net.ssl.HostnameVerifier q;
    public final defpackage.apih r;
    public defpackage.apod s;
    public int t;
    public int u;
    public int v;
    public defpackage.apkc w;
    public defpackage.apnt x;
    public defpackage.zzx y;
    public defpackage.zzx z;

    public apjd(defpackage.apje apjeVar) {
        this();
        this.a = apjeVar.c;
        this.z = apjeVar.B;
        defpackage.ajsz.bv(this.b, apjeVar.d);
        defpackage.ajsz.bv(this.c, apjeVar.e);
        this.x = apjeVar.z;
        this.d = apjeVar.f;
        this.e = apjeVar.g;
        this.f = apjeVar.h;
        this.g = apjeVar.i;
        this.h = apjeVar.j;
        this.i = apjeVar.k;
        this.j = apjeVar.l;
        this.k = apjeVar.m;
        this.l = apjeVar.n;
        this.m = apjeVar.o;
        this.n = apjeVar.p;
        this.o = apjeVar.q;
        this.p = apjeVar.r;
        this.q = apjeVar.s;
        this.r = apjeVar.t;
        this.s = apjeVar.u;
        this.t = apjeVar.v;
        this.u = apjeVar.w;
        this.v = apjeVar.x;
        this.y = apjeVar.A;
        this.w = apjeVar.y;
    }

    public final void a(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            defpackage.aooh.i("unit");
        }
        this.t = defpackage.apjx.l(j, timeUnit);
    }

    public final void b(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            defpackage.aooh.i("unit");
        }
        this.u = defpackage.apjx.l(j, timeUnit);
    }

    public apjd() {
        this.a = new defpackage.apio();
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        defpackage.apis apisVar = defpackage.apis.b;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        this.x = new defpackage.apnt(apisVar);
        this.d = true;
        defpackage.apid apidVar = defpackage.apid.a;
        this.e = apidVar;
        this.f = true;
        this.g = defpackage.apin.a;
        this.h = defpackage.apir.a;
        this.k = apidVar;
        defpackage.apnn apnnVar = defpackage.apnn.b;
        javax.net.SocketFactory socketFactory = javax.net.SocketFactory.getDefault();
        defpackage.aooh.e(socketFactory, "getDefault(...)");
        this.l = socketFactory;
        this.o = defpackage.apje.b;
        this.p = defpackage.apje.a;
        this.q = defpackage.apoe.a;
        this.r = defpackage.apih.a;
        this.t = 10000;
        this.u = 10000;
        this.v = 10000;
    }
}
