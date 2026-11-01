package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hon {
    public final android.telecom.PhoneAccountHandle a;
    public final java.util.List b;

    public hon(android.telecom.PhoneAccountHandle phoneAccountHandle, java.util.List list) {
        aooh.f(list, "accounts");
        this.a = phoneAccountHandle;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hon) {
            defpackage.hon honVar = (defpackage.hon) obj;
            if (aooh.n(this.a, honVar.a) && aooh.n(this.b, honVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.a;
        return ((phoneAccountHandle == null ? 0 : phoneAccountHandle.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CarAccountSelectorData(selectedAccountHandle=" + this.a + ", accounts=" + this.b + ')';
    }
}
