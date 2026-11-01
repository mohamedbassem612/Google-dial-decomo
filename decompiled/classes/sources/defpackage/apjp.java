package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjp {
    public final defpackage.apib a;
    public final java.net.Proxy b;
    public final java.net.InetSocketAddress c;
    public final defpackage.appb d;

    public apjp(defpackage.apib apibVar, java.net.Proxy proxy, java.net.InetSocketAddress inetSocketAddress, defpackage.appb appbVar) {
        if (proxy == null) {
            defpackage.aooh.i("proxy");
        }
        if (inetSocketAddress == null) {
            defpackage.aooh.i("socketAddress");
        }
        this.a = apibVar;
        this.b = proxy;
        this.c = inetSocketAddress;
        this.d = appbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.apjp) {
            defpackage.apjp apjpVar = (defpackage.apjp) obj;
            if (defpackage.aooh.n(apjpVar.a, this.a) && defpackage.aooh.n(apjpVar.b, this.b) && defpackage.aooh.n(apjpVar.c, this.c) && defpackage.aooh.n(apjpVar.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        defpackage.appb appbVar = this.d;
        return (iHashCode * 31) + (appbVar != null ? appbVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String hostAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.net.InetSocketAddress inetSocketAddress = this.c;
        java.net.InetAddress address = inetSocketAddress.getAddress();
        java.lang.String strA = null;
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            strA = defpackage.apju.a(hostAddress);
        }
        defpackage.apiw apiwVar = this.a.i;
        java.lang.String str = apiwVar.b;
        if (defpackage.aoov.J(str, ':')) {
            sb.append('[');
            sb.append(str);
            sb.append(']');
        } else {
            sb.append(str);
        }
        int i = apiwVar.c;
        if (i != inetSocketAddress.getPort() || defpackage.aooh.n(str, strA)) {
            sb.append(':');
            sb.append(i);
        }
        if (!defpackage.aooh.n(str, strA)) {
            if (defpackage.aooh.n(this.b, java.net.Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strA == null) {
                sb.append("<unresolved>");
            } else if (defpackage.aoov.J(strA, ':')) {
                sb.append('[');
                sb.append(strA);
                sb.append(']');
            } else {
                sb.append(strA);
            }
            sb.append(':');
            sb.append(inetSocketAddress.getPort());
        }
        if (this.d != null) {
            sb.append(" with ECH");
        }
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public apjp(defpackage.apib apibVar, java.net.Proxy proxy, java.net.InetSocketAddress inetSocketAddress) {
        this(apibVar, proxy, inetSocketAddress, null);
        if (proxy == null) {
            defpackage.aooh.i("proxy");
        }
        if (inetSocketAddress == null) {
            defpackage.aooh.i("socketAddress");
        }
    }
}
