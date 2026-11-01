package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjs {
    public final android.telecom.PhoneAccountHandle a;
    public final defpackage.mjq b;

    public mjs(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.mjq mjqVar) {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        this.a = phoneAccountHandle;
        this.b = mjqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mjs) {
            defpackage.mjs mjsVar = (defpackage.mjs) obj;
            if (aooh.n(this.a, mjsVar.a) && aooh.n(this.b, mjsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneAccountHandleWithEntry(phoneAccountHandle=" + this.a + ", entry=" + this.b + ')';
    }
}
