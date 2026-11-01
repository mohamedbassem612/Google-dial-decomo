package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class riq {
    public final boolean a;
    public final int b;

    public riq(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.riq) {
            defpackage.riq riqVar = (defpackage.riq) obj;
            if (this.a == riqVar.a && this.b == riqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "DialerConsent(isConsented=" + this.a + ", resultCode=" + ((java.lang.Object) aehj.a(this.b)) + ')';
    }
}
