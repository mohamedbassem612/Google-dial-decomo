package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hoz {
    public final java.util.List a;
    public final aonj b;
    public final aomy c;

    public hoz(java.util.List list, aonj aonjVar, aomy aomyVar) {
        aooh.f(list, "accounts");
        this.a = list;
        this.b = aonjVar;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hoz) {
            defpackage.hoz hozVar = (defpackage.hoz) obj;
            if (aooh.n(this.a, hozVar.a) && aooh.n(this.b, hozVar.b) && aooh.n(this.c, hozVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CarAccountSelectorUiState(accounts=" + this.a + ", onAccountSelected=" + this.b + ", onDismissed=" + this.c + ')';
    }
}
