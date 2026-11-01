package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdr {
    public final defpackage.zff a;
    public final defpackage.zfd b;
    public final aowv c;

    public zdr(defpackage.zff zffVar, defpackage.zfd zfdVar, aowv aowvVar) {
        aooh.f(aowvVar, "sendChannel");
        this.a = zffVar;
        this.b = zfdVar;
        this.c = aowvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zdr) {
            defpackage.zdr zdrVar = (defpackage.zdr) obj;
            if (aooh.n(this.a, zdrVar.a) && aooh.n(this.b, zdrVar.b) && aooh.n(this.c, zdrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.zff zffVar = this.a;
        int iHashCode = zffVar == null ? 0 : zffVar.hashCode();
        defpackage.zfd zfdVar = this.b;
        return (((iHashCode * 31) + (zfdVar != null ? zfdVar.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ChannelAndIdentity(remoteNetworkIdentity=" + this.a + ", localNetworkIdentity=" + this.b + ", sendChannel=" + this.c + ')';
    }
}
