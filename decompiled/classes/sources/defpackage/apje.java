package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apje {
    public static final java.util.List a = defpackage.apjx.f(new defpackage.apjf[]{defpackage.apjf.HTTP_2, defpackage.apjf.HTTP_1_1});
    public static final java.util.List b = defpackage.apjx.f(new defpackage.apik[]{defpackage.apik.a, defpackage.apik.b});
    public final defpackage.zzx A;
    public final defpackage.zzx B;
    public final defpackage.apio c;
    public final java.util.List d;
    public final java.util.List e;
    public final boolean f;
    public final defpackage.apid g;
    public final boolean h;
    public final defpackage.apin i;
    public final defpackage.apir j;
    public final java.net.Proxy k;
    public final java.net.ProxySelector l;
    public final defpackage.apid m;
    public final javax.net.SocketFactory n;
    public final javax.net.ssl.SSLSocketFactory o;
    public final javax.net.ssl.X509TrustManager p;
    public final java.util.List q;
    public final java.util.List r;
    public final javax.net.ssl.HostnameVerifier s;
    public final defpackage.apih t;
    public final defpackage.apod u;
    public final int v;
    public final int w;
    public final int x;
    public final defpackage.apkc y;
    public final defpackage.apnt z;

    public apje(defpackage.apjd apjdVar) throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        apnx apnxVar;
        javax.net.ssl.X509TrustManager x509TrustManager;
        android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;
        this.c = apjdVar.a;
        this.d = defpackage.apjx.e(apjdVar.b);
        this.e = defpackage.apjx.e(apjdVar.c);
        this.z = apjdVar.x;
        this.f = apjdVar.d;
        this.g = apjdVar.e;
        this.h = apjdVar.f;
        this.i = apjdVar.g;
        this.j = apjdVar.h;
        this.k = apjdVar.i;
        if (apjdVar.i != null) {
            apnxVar = apnx.a;
        } else {
            apnxVar = apjdVar.j;
            if (apnxVar == null && (apnxVar = java.net.ProxySelector.getDefault()) == null) {
                apnxVar = apnx.a;
            }
        }
        this.l = apnxVar;
        this.m = apjdVar.k;
        this.n = apjdVar.l;
        java.util.List list = apjdVar.o;
        this.q = list;
        this.r = apjdVar.p;
        this.s = apjdVar.q;
        this.v = apjdVar.t;
        this.w = apjdVar.u;
        this.x = apjdVar.v;
        defpackage.zzx zzxVar = apjdVar.y;
        this.A = zzxVar == null ? new defpackage.zzx((int[]) null) : zzxVar;
        defpackage.apkc apkcVar = apjdVar.w;
        this.y = apkcVar == null ? defpackage.apkc.a : apkcVar;
        defpackage.zzx zzxVar2 = apjdVar.z;
        if (zzxVar2 == null) {
            zzxVar2 = new defpackage.zzx((char[]) null, (char[]) null);
            apjdVar.z = zzxVar2;
        }
        this.B = zzxVar2;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.o = null;
                    this.u = null;
                    this.p = null;
                    this.t = defpackage.apih.a;
                    break;
                }
                if (((defpackage.apik) it.next()).c) {
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory = apjdVar.m;
                    if (sSLSocketFactory != null) {
                        this.o = sSLSocketFactory;
                        defpackage.apod apodVar = apjdVar.s;
                        if (apodVar == null) {
                            defpackage.aooh.g();
                        }
                        this.u = apodVar;
                        javax.net.ssl.X509TrustManager x509TrustManager2 = apjdVar.n;
                        if (x509TrustManager2 == null) {
                            defpackage.aooh.g();
                        }
                        this.p = x509TrustManager2;
                        this.t = apjdVar.r.a(apodVar);
                        break;
                    }
                    defpackage.apnn apnnVar = defpackage.apnn.b;
                    javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((java.security.KeyStore) null);
                    javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    if (trustManagers == null) {
                        defpackage.aooh.g();
                    }
                    if (trustManagers.length == 1) {
                        javax.net.ssl.TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                            if (trustManager == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                            }
                            javax.net.ssl.X509TrustManager x509TrustManager3 = (javax.net.ssl.X509TrustManager) trustManager;
                            this.p = x509TrustManager3;
                            this.o = defpackage.apnn.b.c(x509TrustManager3);
                            if (x509TrustManager3 == null) {
                                defpackage.aooh.i("trustManager");
                            }
                            defpackage.apnn apnnVar2 = defpackage.apnn.b;
                            if (x509TrustManager3 == null) {
                                defpackage.aooh.i("trustManager");
                                defpackage.aooh.i("trustManager");
                                x509TrustManager = null;
                            } else {
                                x509TrustManager = x509TrustManager3;
                            }
                            try {
                                x509TrustManagerExtensions = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
                            } catch (java.lang.IllegalArgumentException unused) {
                                x509TrustManagerExtensions = null;
                            }
                            defpackage.apnq apnqVar = x509TrustManagerExtensions != null ? new defpackage.apnq(x509TrustManager, x509TrustManagerExtensions) : null;
                            if (apnqVar == null) {
                                if (x509TrustManager3 == null) {
                                    defpackage.aooh.i("trustManager");
                                }
                                defpackage.aooh.f(x509TrustManager3, "trustManager");
                                android.os.StrictMode.noteSlowCall("buildTrustRootIndex");
                                defpackage.aooh.f(x509TrustManager3, "trustManager");
                                java.security.cert.X509Certificate[] acceptedIssuers = x509TrustManager3.getAcceptedIssuers();
                                apnqVar = new apob(new apoc((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
                            }
                            this.u = apnqVar;
                            this.t = apjdVar.r.a(apnqVar);
                            break;
                        }
                    }
                    java.lang.String string = java.util.Arrays.toString(trustManagers);
                    defpackage.aooh.e(string, "toString(...)");
                    throw new java.lang.IllegalStateException("Unexpected default trust managers: ".concat(java.lang.String.valueOf(string)));
                }
            }
        } else {
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = defpackage.apih.a;
            break;
        }
        java.util.List list2 = this.d;
        if (list2 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list2.contains(null)) {
            java.util.List list3 = this.d;
            java.util.Objects.toString(list3);
            throw new java.lang.IllegalStateException("Null interceptor: ".concat(java.lang.String.valueOf(list3)));
        }
        java.util.List list4 = this.e;
        if (list4 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (list4.contains(null)) {
            java.util.List list5 = this.e;
            java.util.Objects.toString(list5);
            throw new java.lang.IllegalStateException("Null network interceptor: ".concat(java.lang.String.valueOf(list5)));
        }
        java.util.List list6 = this.q;
        if (!(list6 instanceof java.util.Collection) || !list6.isEmpty()) {
            java.util.Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                if (((defpackage.apik) it2.next()).c) {
                    if (this.o == null) {
                        throw new java.lang.IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.u == null) {
                        throw new java.lang.IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.p == null) {
                        throw new java.lang.IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.o != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (this.u != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (this.p != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (!defpackage.aooh.n(this.t, defpackage.apih.a)) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public apje() {
        this(new defpackage.apjd());
    }
}
