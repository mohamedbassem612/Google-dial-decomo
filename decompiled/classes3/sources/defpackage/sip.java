package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sip implements defpackage.siq {
    public final java.lang.String a;
    public final java.lang.String b;

    public sip(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "phoneNumber");
        aooh.f(str2, "lookupKey");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sip) {
            defpackage.sip sipVar = (defpackage.sip) obj;
            if (aooh.n(this.a, sipVar.a) && aooh.n(this.b, sipVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneNumber(phoneNumber=" + this.a + ", lookupKey=" + this.b + ')';
    }
}
