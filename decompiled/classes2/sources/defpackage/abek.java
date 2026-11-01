package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abek {
    public final boolean a;
    public final boolean b;

    public abek(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abek) {
            defpackage.abek abekVar = (defpackage.abek) obj;
            if (this.a == abekVar.a && this.b == abekVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "TransitionStateData(currentState=" + this.a + ", targetState=" + this.b + ')';
    }
}
