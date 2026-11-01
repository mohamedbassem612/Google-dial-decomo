package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agos {
    public final com.google.apps.tiktok.account.AccountId a;
    public final agoq b;

    public agos(com.google.apps.tiktok.account.AccountId accountId, agoq agoqVar) {
        if (accountId == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.a = accountId;
        this.b = agoqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agos) {
            defpackage.agos agosVar = (defpackage.agos) obj;
            if (this.a.equals(agosVar.a) && this.b.equals(agosVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        agoq agoqVar = this.b;
        return "AccountContext{id=" + this.a.toString() + ", info=" + agoqVar.toString() + '}';
    }

    public agos() {
        throw null;
    }
}
