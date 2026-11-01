package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdy implements defpackage.zdz {
    public final java.util.Set a;
    private final defpackage.zff b;

    public zdy(defpackage.zff zffVar, java.util.Set set) {
        aooh.f(zffVar, "remoteNetworkIdentity");
        aooh.f(set, "capabilities");
        this.b = zffVar;
        this.a = set;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zdy) {
            defpackage.zdy zdyVar = (defpackage.zdy) obj;
            if (aooh.n(this.b, zdyVar.b) && aooh.n(this.a, zdyVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(remoteNetworkIdentity=" + this.b + ", capabilities=" + this.a + ')';
    }
}
