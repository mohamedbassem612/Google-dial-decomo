package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahib implements defpackage.xuo {
    private final defpackage.xzg b;
    private final com.google.apps.tiktok.account.AccountId c;

    public ahib(defpackage.xzg xzgVar, com.google.apps.tiktok.account.AccountId accountId) {
        if (xzgVar == null) {
            throw new java.lang.NullPointerException("Null glideUrl");
        }
        this.b = xzgVar;
        this.c = accountId;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        this.b.a(messageDigest);
        defpackage.agqz.a.a(this.c, messageDigest);
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahib) {
            defpackage.ahib ahibVar = (defpackage.ahib) obj;
            if (this.b.equals(ahibVar.b) && this.c.equals(ahibVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        com.google.apps.tiktok.account.AccountId accountId = this.c;
        return "GlideUrlAccountKey{glideUrl=" + this.b.b() + ", accountId=" + accountId.toString() + '}';
    }

    public ahib() {
        throw null;
    }
}
