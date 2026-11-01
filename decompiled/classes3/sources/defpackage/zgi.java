package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgi implements defpackage.zgl {
    public final defpackage.zfx a;
    private final defpackage.zfd b;
    private final defpackage.zff c;

    public zgi(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zfx zfxVar) {
        aooh.f(zffVar, "remoteNetworkIdentity");
        aooh.f(zfxVar, "ackMessage");
        this.b = zfdVar;
        this.c = zffVar;
        this.a = zfxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zgi) {
            defpackage.zgi zgiVar = (defpackage.zgi) obj;
            if (aooh.n(this.b, zgiVar.b) && aooh.n(this.c, zgiVar.c) && aooh.n(this.a, zgiVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AcknowledgeInternalPendingOutboundMessage(localNetworkIdentity=" + this.b + ", remoteNetworkIdentity=" + this.c + ", ackMessage=" + this.a + ')';
    }
}
