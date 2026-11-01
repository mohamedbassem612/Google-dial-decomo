package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vxy {
    public final boolean a;
    public final boolean b;

    public vxy(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.vxy) {
            defpackage.vxy vxyVar = (defpackage.vxy) obj;
            if (this.a == vxyVar.a && this.b == vxyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "VoicemailEntryDateGroupPosition(topOfGroup=" + this.a + ", bottomOfGroup=" + this.b + ')';
    }
}
