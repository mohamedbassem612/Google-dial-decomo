package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akal {
    public final android.accounts.Account a;
    public final java.lang.String b;

    public akal(android.accounts.Account account, java.lang.String str) {
        this.a = account;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akal) {
            defpackage.akal akalVar = (defpackage.akal) obj;
            if (this.a.equals(akalVar.a) && this.b.equals(akalVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AccountAndScope{account=" + this.a.toString() + ", scope=" + this.b + '}';
    }

    public akal() {
        throw null;
    }
}
