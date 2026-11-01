package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocb {
    public final boolean a;
    public final boolean b;

    public ocb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ocb) {
            defpackage.ocb ocbVar = (defpackage.ocb) obj;
            if (this.a == ocbVar.a && this.b == ocbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "EmergencyCallInfo(isEmergencyCall=" + this.a + ", isEmergencyCallback=" + this.b + ')';
    }
}
