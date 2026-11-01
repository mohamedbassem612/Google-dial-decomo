package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agon {
    public final com.google.apps.tiktok.account.AccountId a;
    public final agoq b;
    public final int c;

    public agon(com.google.apps.tiktok.account.AccountId accountId, agoq agoqVar, int i) {
        this.a = accountId;
        if (agoqVar == null) {
            throw new java.lang.NullPointerException("Null info");
        }
        this.b = agoqVar;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agon) {
            defpackage.agon agonVar = (defpackage.agon) obj;
            if (this.a.equals(agonVar.a) && this.b.equals(agonVar.b) && this.c == agonVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        int i = this.c - 1;
        return "Account{id=" + this.a.toString() + ", info=" + this.b.toString() + ", state=" + java.lang.Integer.toString(i) + '}';
    }

    public agon() {
        throw null;
    }
}
