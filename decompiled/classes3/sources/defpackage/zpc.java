package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zpc {
    public final aomy a;
    public final aomy b;
    public final aomy c;

    public zpc(aomy aomyVar, aomy aomyVar2, aomy aomyVar3) {
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = aomyVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zpc) {
            defpackage.zpc zpcVar = (defpackage.zpc) obj;
            if (aooh.n(this.a, zpcVar.a) && aooh.n(this.b, zpcVar.b) && aooh.n(this.c, zpcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        aomy aomyVar = this.a;
        int iHashCode = aomyVar == null ? 0 : aomyVar.hashCode();
        aomy aomyVar2 = this.b;
        int iHashCode2 = aomyVar2 == null ? 0 : aomyVar2.hashCode();
        int i = iHashCode * 31;
        aomy aomyVar3 = this.c;
        return ((i + iHashCode2) * 31) + (aomyVar3 != null ? aomyVar3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "InCallCacheResultCallbacks(onLoad=" + this.a + ", onSuccess=" + this.b + ", onFailure=" + this.c + ')';
    }

    public zpc() {
        this(null, null, null);
    }
}
