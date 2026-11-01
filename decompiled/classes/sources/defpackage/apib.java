package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apib {
    public final defpackage.apir a;
    public final javax.net.SocketFactory b;
    public final javax.net.ssl.SSLSocketFactory c;
    public final javax.net.ssl.HostnameVerifier d;
    public final defpackage.apih e;
    public final defpackage.apid f;
    public final java.net.Proxy g;
    public final java.net.ProxySelector h;
    public final defpackage.apiw i;
    public final java.util.List j;
    public final java.util.List k;

    public apib(java.lang.String str, int i, defpackage.apir apirVar, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, defpackage.apih apihVar, defpackage.apid apidVar, java.net.Proxy proxy, java.util.List list, java.util.List list2, java.net.ProxySelector proxySelector) {
        if (socketFactory == null) {
            defpackage.aooh.i("socketFactory");
        }
        if (list == null) {
            defpackage.aooh.i("protocols");
        }
        if (list2 == null) {
            defpackage.aooh.i("connectionSpecs");
        }
        if (proxySelector == null) {
            defpackage.aooh.i("proxySelector");
        }
        this.a = apirVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = apihVar;
        this.f = apidVar;
        this.g = proxy;
        this.h = proxySelector;
        defpackage.apiv apivVar = new defpackage.apiv();
        java.lang.String str2 = sSLSocketFactory != null ? "https" : "http";
        if (defpackage.aoov.s(str2, "http", true)) {
            apivVar.a = "http";
        } else {
            if (!defpackage.aoov.s(str2, "https", true)) {
                throw new java.lang.IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            apivVar.a = "https";
        }
        java.lang.String strA = defpackage.apju.a(defpackage.apof.c(str, 0, 0, false, 7));
        if (strA == null) {
            throw new java.lang.IllegalArgumentException("unexpected host: ".concat(str));
        }
        apivVar.d = strA;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "unexpected port: "));
        }
        apivVar.e = i;
        this.i = apivVar.a();
        this.j = defpackage.apjx.e(list);
        this.k = defpackage.apjx.e(list2);
    }

    public final boolean a(defpackage.apib apibVar) {
        if (apibVar == null) {
            defpackage.aooh.i("that");
        }
        if (defpackage.aooh.n(this.a, apibVar.a) && defpackage.aooh.n(this.f, apibVar.f) && defpackage.aooh.n(this.j, apibVar.j) && defpackage.aooh.n(this.k, apibVar.k) && defpackage.aooh.n(this.h, apibVar.h) && defpackage.aooh.n(this.g, apibVar.g) && defpackage.aooh.n(this.c, apibVar.c) && defpackage.aooh.n(this.d, apibVar.d) && defpackage.aooh.n(this.e, apibVar.e)) {
            defpackage.apiw apiwVar = this.i;
            if (apiwVar.c == apibVar.i.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.apib) {
            defpackage.apib apibVar = (defpackage.apib) obj;
            if (defpackage.aooh.n(this.i, apibVar.i) && a(apibVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.i.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.h.hashCode()) * 31) + j$.util.Objects.hashCode(this.g)) * 31) + j$.util.Objects.hashCode(this.c)) * 31) + j$.util.Objects.hashCode(this.d)) * 31) + j$.util.Objects.hashCode(this.e);
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf;
        java.lang.String str;
        java.net.Proxy proxy = this.g;
        if (proxy != null) {
            java.util.Objects.toString(proxy);
            strValueOf = proxy.toString();
            str = "proxy=";
        } else {
            java.net.ProxySelector proxySelector = this.h;
            java.util.Objects.toString(proxySelector);
            strValueOf = java.lang.String.valueOf(proxySelector);
            str = "proxySelector=";
        }
        java.lang.String strConcat = str.concat(strValueOf);
        defpackage.apiw apiwVar = this.i;
        return "Address{" + apiwVar.b + ':' + apiwVar.c + ", " + strConcat + '}';
    }
}
