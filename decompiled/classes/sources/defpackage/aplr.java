package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aplr {
    public final defpackage.apks a;
    public final defpackage.apkl b;
    public final defpackage.apjh c;
    public final int d;
    public final int e;
    public final int f;
    public final defpackage.apih g;
    public final defpackage.apin h;
    public final defpackage.apir i;
    public final javax.net.ssl.HostnameVerifier j;
    public final java.net.Proxy k;
    public final defpackage.apid l;
    public final java.net.ProxySelector m;
    public final boolean n;
    public final javax.net.SocketFactory o;
    public final javax.net.ssl.SSLSocketFactory p;
    public final defpackage.zzx q;
    private final java.util.List r;
    private final int s;
    private final defpackage.apid t;
    private final javax.net.ssl.X509TrustManager u;
    private final defpackage.apod v;
    private int w;

    public aplr(defpackage.apks apksVar, java.util.List list, int i, defpackage.apkl apklVar, defpackage.apjh apjhVar, int i2, int i3, int i4, defpackage.apid apidVar, defpackage.apih apihVar, defpackage.zzx zzxVar, defpackage.apin apinVar, defpackage.apir apirVar, javax.net.ssl.HostnameVerifier hostnameVerifier, java.net.Proxy proxy, defpackage.apid apidVar2, java.net.ProxySelector proxySelector, boolean z, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.X509TrustManager x509TrustManager, defpackage.apod apodVar) {
        if (apjhVar == null) {
            defpackage.aooh.i("request");
        }
        if (apihVar == null) {
            defpackage.aooh.i("certificatePinner");
        }
        if (hostnameVerifier == null) {
            defpackage.aooh.i("hostnameVerifier");
        }
        if (proxySelector == null) {
            defpackage.aooh.i("proxySelector");
        }
        if (socketFactory == null) {
            defpackage.aooh.i("socketFactory");
        }
        this.a = apksVar;
        this.r = list;
        this.s = i;
        this.b = apklVar;
        this.c = apjhVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.t = apidVar;
        this.g = apihVar;
        this.q = zzxVar;
        this.h = apinVar;
        this.i = apirVar;
        this.j = hostnameVerifier;
        this.k = proxy;
        this.l = apidVar2;
        this.m = proxySelector;
        this.n = z;
        this.o = socketFactory;
        this.p = sSLSocketFactory;
        this.u = x509TrustManager;
        this.v = apodVar;
    }

    public static /* synthetic */ defpackage.aplr c(defpackage.aplr aplrVar, int i, defpackage.apkl apklVar, defpackage.apjh apjhVar, int i2) {
        int i3 = (i2 & 1) != 0 ? aplrVar.s : i;
        defpackage.apkl apklVar2 = (i2 & 2) != 0 ? aplrVar.b : apklVar;
        defpackage.apjh apjhVar2 = (i2 & 4) != 0 ? aplrVar.c : apjhVar;
        int i4 = aplrVar.d;
        int i5 = aplrVar.e;
        int i6 = aplrVar.f;
        defpackage.apid apidVar = aplrVar.t;
        defpackage.apih apihVar = aplrVar.g;
        defpackage.zzx zzxVar = aplrVar.q;
        defpackage.apin apinVar = aplrVar.h;
        defpackage.apir apirVar = aplrVar.i;
        javax.net.ssl.HostnameVerifier hostnameVerifier = aplrVar.j;
        java.net.Proxy proxy = aplrVar.k;
        defpackage.apid apidVar2 = aplrVar.l;
        java.net.ProxySelector proxySelector = aplrVar.m;
        boolean z = aplrVar.n;
        javax.net.SocketFactory socketFactory = aplrVar.o;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = aplrVar.p;
        javax.net.ssl.X509TrustManager x509TrustManager = aplrVar.u;
        defpackage.apod apodVar = aplrVar.v;
        if (apjhVar2 == null) {
            defpackage.aooh.i("request");
        }
        if (apihVar == null) {
            defpackage.aooh.i("certificatePinner");
        }
        if (hostnameVerifier == null) {
            defpackage.aooh.i("hostnameVerifier");
        }
        if (proxySelector == null) {
            defpackage.aooh.i("proxySelector");
        }
        if (socketFactory == null) {
            defpackage.aooh.i("socketFactory");
        }
        return new defpackage.aplr(aplrVar.a, aplrVar.r, i3, apklVar2, apjhVar2, i4, i5, i6, apidVar, apihVar, zzxVar, apinVar, apirVar, hostnameVerifier, proxy, apidVar2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, apodVar);
    }

    public final defpackage.apjm a(defpackage.apjh apjhVar) {
        if (apjhVar == null) {
            defpackage.aooh.i("request");
        }
        int i = this.s;
        java.util.List list = this.r;
        if (i >= list.size()) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.w++;
        defpackage.apkl apklVar = this.b;
        if (apklVar != null) {
            if (!((defpackage.apko) apklVar.d).f.e(apjhVar.a)) {
                throw new java.lang.IllegalStateException("network interceptor " + list.get(i - 1) + " must retain the same host and port");
            }
            if (this.w != 1) {
                throw new java.lang.IllegalStateException("network interceptor " + list.get(i - 1) + " must call proceed() exactly once");
            }
        }
        int i2 = i + 1;
        defpackage.aplr aplrVarC = c(this, i2, null, apjhVar, 2097146);
        defpackage.apix apixVar = (defpackage.apix) list.get(i);
        defpackage.apjm apjmVarA = apixVar.a(aplrVarC);
        if (apklVar == null || i2 >= list.size() || aplrVarC.w == 1) {
            return apjmVarA;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(apixVar, "network interceptor ", " must call proceed() exactly once"));
    }

    public final defpackage.apkt b() {
        defpackage.apkl apklVar = this.b;
        if (apklVar != null) {
            return apklVar.b();
        }
        return null;
    }
}
