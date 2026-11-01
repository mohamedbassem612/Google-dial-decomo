package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdx implements defpackage.zdz {
    private final defpackage.zff a;

    public zdx(defpackage.zff zffVar) {
        aooh.f(zffVar, "remoteNetworkIdentity");
        this.a = zffVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zdx) && aooh.n(this.a, ((defpackage.zdx) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(remoteNetworkIdentity=" + this.a + ')';
    }
}
