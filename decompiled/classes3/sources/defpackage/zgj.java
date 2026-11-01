package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgj implements defpackage.zgl {
    public final defpackage.zfd a;
    public final defpackage.zff b;
    public final defpackage.zgf c;

    public zgj(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zgf zgfVar) {
        aooh.f(zffVar, "remoteNetworkIdentity");
        aooh.f(zgfVar, "standardContent");
        this.a = zfdVar;
        this.b = zffVar;
        this.c = zgfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zgj) {
            defpackage.zgj zgjVar = (defpackage.zgj) obj;
            if (aooh.n(this.a, zgjVar.a) && aooh.n(this.b, zgjVar.b) && aooh.n(this.c, zgjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "DeliverInternally(localNetworkIdentity=" + this.a + ", remoteNetworkIdentity=" + this.b + ", standardContent=" + this.c + ')';
    }
}
