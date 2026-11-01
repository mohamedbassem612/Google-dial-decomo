package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ivp {
    public final boolean a;
    public final defpackage.itq b;

    public ivp(boolean z, defpackage.itq itqVar) {
        this.a = z;
        this.b = itqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ivp) {
            defpackage.ivp ivpVar = (defpackage.ivp) obj;
            if (this.a == ivpVar.a && this.b == ivpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallActionsError(transient=" + this.a + ", errorType=" + this.b + ')';
    }
}
