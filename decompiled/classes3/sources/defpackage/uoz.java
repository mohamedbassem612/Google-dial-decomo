package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uoz extends aais {
    public final aomy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoz(aomy aomyVar) {
        super((short[]) null);
        aooh.f(aomyVar, "grantPermissionsClickhandler");
        this.a = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.uoz) && aooh.n(this.a, ((defpackage.uoz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MissingPermissions(grantPermissionsClickhandler=" + this.a + ')';
    }
}
