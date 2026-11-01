package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class annj extends defpackage.anqh {
    private static final long serialVersionUID = 0;
    public final java.net.SocketAddress a;
    public final java.net.InetSocketAddress b;
    public final java.lang.String c;
    public final java.lang.String d;
    private final java.util.Map e;

    public annj(java.net.SocketAddress socketAddress, java.net.InetSocketAddress inetSocketAddress, java.util.Map map, java.lang.String str, java.lang.String str2) {
        ahvr.cc(!((java.net.InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.e = map;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.annj)) {
            return false;
        }
        defpackage.annj annjVar = (defpackage.annj) obj;
        return j$.util.Objects.equals(this.a, annjVar.a) && j$.util.Objects.equals(this.b, annjVar.b) && j$.util.Objects.equals(this.e, annjVar.e) && j$.util.Objects.equals(this.c, annjVar.c) && j$.util.Objects.equals(this.d, annjVar.d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("proxyAddr", this.a);
        ahymVarL.b("targetAddr", this.b);
        ahymVarL.b("headers", this.e);
        ahymVarL.b("username", this.c);
        ahymVarL.g("hasPassword", this.d != null);
        return ahymVarL.toString();
    }
}
