package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgk implements defpackage.zgl {
    public final defpackage.zfd a;
    public final defpackage.zff b;
    public final defpackage.zgf c;
    public final defpackage.zfx d;

    public zgk(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zgf zgfVar, defpackage.zfx zfxVar) {
        aooh.f(zffVar, "remoteNetworkIdentity");
        aooh.f(zgfVar, "standardContent");
        aooh.f(zfxVar, "ackMessage");
        this.a = zfdVar;
        this.b = zffVar;
        this.c = zgfVar;
        this.d = zfxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zgk) {
            defpackage.zgk zgkVar = (defpackage.zgk) obj;
            if (aooh.n(this.a, zgkVar.a) && aooh.n(this.b, zgkVar.b) && aooh.n(this.c, zgkVar.c) && aooh.n(this.d, zgkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "DeliverInternallyAndSendAcknowledgementRemotely(localNetworkIdentity=" + this.a + ", remoteNetworkIdentity=" + this.b + ", standardContent=" + this.c + ", ackMessage=" + this.d + ')';
    }
}
