package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmy {
    public final java.lang.String a;
    public final defpackage.hhs b;

    public hmy(java.lang.String str, defpackage.hhs hhsVar) {
        aooh.f(hhsVar, "numberChangeListener");
        this.a = str;
        this.b = hhsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hmy) {
            defpackage.hmy hmyVar = (defpackage.hmy) obj;
            if (aooh.n(this.a, hmyVar.a) && aooh.n(this.b, hmyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DialpadUiState(phoneNumber=" + this.a + ", numberChangeListener=" + this.b + ')';
    }
}
