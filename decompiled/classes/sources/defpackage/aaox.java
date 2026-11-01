package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaox implements defpackage.aacu {
    public final android.accounts.Account a;
    public final defpackage.aizr b;

    public aaox(android.accounts.Account account, defpackage.aizr aizrVar) {
        if (account == null) {
            throw new java.lang.NullPointerException("Null account");
        }
        this.a = account;
        this.b = aizrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aaox) {
            defpackage.aaox aaoxVar = (defpackage.aaox) obj;
            if (this.a.equals(aaoxVar.a) && this.b.equals(aaoxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MdiSyncClientOptions{account=" + this.a.toString() + ", timeSource=TimeSource.system()}";
    }

    public aaox() {
        throw null;
    }
}
