package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeab {
    public final int a;
    public final java.lang.String b;

    public aeab(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aeab) {
            defpackage.aeab aeabVar = (defpackage.aeab) obj;
            if (this.a == aeabVar.a && aooh.n(this.b, aeabVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "RegistrationState(registrationStatus=" + this.a + ", environment=" + this.b + ')';
    }
}
