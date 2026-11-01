package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adyn {
    public final android.accounts.Account a;
    public final java.lang.String b;

    public adyn(android.accounts.Account account, java.lang.String str) {
        aooh.f(str, "scope");
        this.a = account;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adyn) {
            defpackage.adyn adynVar = (defpackage.adyn) obj;
            if (aooh.n(this.a, adynVar.a) && aooh.n(this.b, adynVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AccountAndScope(account=" + this.a + ", scope=" + this.b + ')';
    }
}
