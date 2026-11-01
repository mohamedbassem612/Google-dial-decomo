package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hla {
    private final android.telecom.PhoneAccountHandle a;

    public hla(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.a = phoneAccountHandle;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.a);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.hla) && aooh.n(this.a, ((defpackage.hla) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.a;
        if (phoneAccountHandle == null) {
            return 0;
        }
        return phoneAccountHandle.hashCode();
    }

    public final java.lang.String toString() {
        return "ActiveCallInfo(phoneAccount=" + this.a + ')';
    }
}
