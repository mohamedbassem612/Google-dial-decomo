package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ltc {
    public final java.lang.String a;
    public final defpackage.ltj b;

    public ltc(java.lang.String str, defpackage.ltj ltjVar) {
        aooh.f(str, "callerNumber");
        aooh.f(ltjVar, "verificationState");
        this.a = str;
        this.b = ltjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ltc) {
            defpackage.ltc ltcVar = (defpackage.ltc) obj;
            if (aooh.n(this.a, ltcVar.a) && this.b == ltcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ContactCheckerCallerVerificationStateDbEntity(callerNumber=" + this.a + ", verificationState=" + this.b + ')';
    }
}
