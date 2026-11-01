package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xam {
    public final boolean a;
    public final boolean b;

    public xam(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.xam) {
            defpackage.xam xamVar = (defpackage.xam) obj;
            if (this.a == xamVar.a && this.b == xamVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "OptInPreferenceState{enabled=" + this.a + ", checked=" + this.b + '}';
    }

    public xam() {
        throw null;
    }
}
