package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sio implements defpackage.siq {
    public final java.lang.String a;
    public final java.lang.String b;

    public sio(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "accountName");
        aooh.f(str2, "accountType");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sio) {
            defpackage.sio sioVar = (defpackage.sio) obj;
            if (aooh.n(this.a, sioVar.a) && aooh.n(this.b, sioVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Account(accountName=" + this.a + ", accountType=" + this.b + ')';
    }
}
