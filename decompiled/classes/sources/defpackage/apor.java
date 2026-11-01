package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apor implements java.net.URLStreamHandlerFactory, java.lang.Cloneable {
    static final java.util.Set a = new java.util.LinkedHashSet(java.util.Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));
    static final java.util.TimeZone b = j$.util.DesugarTimeZone.getTimeZone("GMT");
    static final java.lang.ThreadLocal c = new defpackage.apog();
    static final java.util.Comparator d = new defpackage.beg(20);
    public static final /* synthetic */ int e = 0;
    private final defpackage.apje f;

    public apor(defpackage.apje apjeVar) {
        this.f = apjeVar;
    }

    static java.io.IOException a(java.lang.Throwable th) throws java.io.IOException {
        if (th instanceof java.io.IOException) {
            throw ((java.io.IOException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        throw new java.lang.AssertionError();
    }

    static java.lang.String b(defpackage.apjm apjmVar) {
        return (apjmVar.b == defpackage.apjf.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1") + ' ' + apjmVar.d + ' ' + apjmVar.c;
    }

    static java.util.Map e(defpackage.apiu apiuVar, java.lang.String str) {
        java.util.TreeMap treeMap = new java.util.TreeMap(d);
        int iA = apiuVar.a();
        for (int i = 0; i < iA; i++) {
            java.lang.String strBe = defpackage.aoov.be(apiuVar, i);
            java.lang.String strBf = defpackage.aoov.bf(apiuVar, i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List list = (java.util.List) treeMap.get(strBe);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(strBf);
            treeMap.put(strBe, j$.util.DesugarCollections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, j$.util.DesugarCollections.unmodifiableList(java.util.Collections.singletonList(str)));
        }
        return j$.util.DesugarCollections.unmodifiableMap(treeMap);
    }

    static boolean f(java.lang.String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    static java.lang.String g() {
        try {
            java.lang.String property = java.lang.System.getProperty("http.agent");
            if (property == null) {
                return null;
            }
            return property;
        } catch (java.security.AccessControlException unused) {
        }
    }

    public final java.net.HttpURLConnection c(java.net.URL url) {
        return d(url, this.f.k);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        return new defpackage.apor(this.f);
    }

    @Override // java.net.URLStreamHandlerFactory
    public final java.net.URLStreamHandler createURLStreamHandler(java.lang.String str) {
        if (str.equals("http") || str.equals("https")) {
            return new apoh(this, str);
        }
        return null;
    }

    final java.net.HttpURLConnection d(java.net.URL url, java.net.Proxy proxy) {
        java.lang.String protocol = url.getProtocol();
        defpackage.apjd apjdVar = new defpackage.apjd(this.f);
        if (!defpackage.aooh.n(proxy, apjdVar.i)) {
            apjdVar.y = null;
        }
        apjdVar.i = proxy;
        defpackage.apje apjeVar = new defpackage.apje(apjdVar);
        if (protocol.equals("http")) {
            return new defpackage.apol(url, apjeVar);
        }
        if (protocol.equals("https")) {
            return new defpackage.apoj(url, apjeVar);
        }
        throw new java.lang.IllegalArgumentException("Unexpected protocol: ".concat(java.lang.String.valueOf(protocol)));
    }
}
