package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aelm {
    public final java.lang.String a;
    public final int b;

    public aelm(int i, java.lang.String str) {
        this.b = i;
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aelm) {
            defpackage.aelm aelmVar = (defpackage.aelm) obj;
            if (this.b == aelmVar.b) {
                java.lang.String str = this.a;
                if (str == null) {
                    if (aelmVar.a == null) {
                        return true;
                    }
                } else if (str.equals(aelmVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((this.b ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "PSEUDONYMOUS" : "ANONYMOUS";
        } else {
            str = "GAIA";
        }
        return "AuthChannel{type=" + str + ", account=" + this.a + '}';
    }

    public aelm() {
        throw null;
    }
}
