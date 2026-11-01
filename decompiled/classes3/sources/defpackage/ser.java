package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ser {
    public final android.accounts.Account a;
    public final com.google.apps.tiktok.account.AccountId b;
    public final int c;

    public ser(android.accounts.Account account, com.google.apps.tiktok.account.AccountId accountId, int i) {
        aooh.f(account, "account");
        aooh.f(accountId, "accountId");
        this.a = account;
        this.b = accountId;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ser) {
            defpackage.ser serVar = (defpackage.ser) obj;
            if (aooh.n(this.a, serVar.a) && aooh.n(this.b, serVar.b) && this.c == serVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MyCallingCardAccount(account=");
        sb.append(this.a);
        sb.append(", accountId=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append((java.lang.Object) (this.c != 1 ? "DISABLED" : "ENABLED"));
        sb.append(')');
        return sb.toString();
    }
}
