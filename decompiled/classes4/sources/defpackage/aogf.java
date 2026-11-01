package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aogf extends aogh {
    private final java.lang.reflect.Method d;
    private final java.lang.reflect.Method e;
    private final java.lang.reflect.Method f;
    private final java.lang.Class g;
    private final java.lang.Class h;

    public aogf(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2, java.security.Provider provider) {
        super(provider);
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            defpackage.aogg aoggVar = (defpackage.aogg) java.lang.reflect.Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            int i = defpackage.aogg.c;
            if (aoggVar.a) {
                return null;
            }
            java.lang.String str = aoggVar.b;
            if (str != null) {
                return str;
            }
            a.logp(java.util.logging.Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.reflect.InvocationTargetException unused2) {
            throw new java.lang.AssertionError();
        }
    }

    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.aogi aogiVar = (defpackage.aogi) list.get(i);
            if (aogiVar != defpackage.aogi.HTTP_1_0) {
                arrayList.add(aogiVar.e);
            }
        }
        try {
            this.d.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(aogh.class.getClassLoader(), new java.lang.Class[]{this.g, this.h}, new defpackage.aogg(arrayList)));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final int c() {
        return 1;
    }

    public final void d(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.f.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.reflect.InvocationTargetException e) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (java.lang.Throwable) e);
        }
    }
}
