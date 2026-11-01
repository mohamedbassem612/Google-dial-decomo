package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpa {
    public final android.telecom.PhoneAccountHandle a;
    public final android.telecom.PhoneAccount b;
    public final java.lang.CharSequence c;
    public final boolean d;
    public final java.lang.String e;

    public hpa(android.telecom.PhoneAccountHandle phoneAccountHandle, android.telecom.PhoneAccount phoneAccount, java.lang.CharSequence charSequence, boolean z, java.lang.String str) {
        aooh.f(phoneAccountHandle, "handle");
        aooh.f(phoneAccount, "account");
        aooh.f(str, "hint");
        this.a = phoneAccountHandle;
        this.b = phoneAccount;
        this.c = charSequence;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hpa) {
            defpackage.hpa hpaVar = (defpackage.hpa) obj;
            if (aooh.n(this.a, hpaVar.a) && aooh.n(this.b, hpaVar.b) && aooh.n(this.c, hpaVar.c) && this.d == hpaVar.d && aooh.n(this.e, hpaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.CharSequence charSequence = this.c;
        return (((((iHashCode * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + anty.L(this.d)) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneAccountData(handle=" + this.a + ", account=" + this.b + ", number=" + ((java.lang.Object) this.c) + ", enabled=" + this.d + ", hint=" + this.e + ')';
    }
}
