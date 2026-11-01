package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alve {
    public final boolean a;
    public final boolean b;

    public alve(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.alve) {
            defpackage.alve alveVar = (defpackage.alve) obj;
            if (this.a == alveVar.a && this.b == alveVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "ConfidenceState(hasRemoteSpeech=" + this.a + ", hasLowConfidenceRemoteSpeech=" + this.b + ')';
    }
}
