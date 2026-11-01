package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vvc {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public vvc(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.vvc) {
            defpackage.vvc vvcVar = (defpackage.vvc) obj;
            if (this.a == vvcVar.a && this.b == vvcVar.b && this.c == vvcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.L(this.a) * 31) + anty.L(this.b)) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "VoicemailPermissions(hasVoicemailAccess=" + this.a + ", hasReadPhoneStatePermissions=" + this.b + ", hasSendSmsPermissions=" + this.c + ')';
    }
}
