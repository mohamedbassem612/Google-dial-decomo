package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ref {
    public final aihd a;
    public final int b;

    public ref(int i, aihd aihdVar) {
        this.b = i;
        this.a = aihdVar;
    }

    static defpackage.ref a(defpackage.reb rebVar) {
        return new defpackage.ref(1, new aile(rebVar));
    }

    static defpackage.ref b(defpackage.reb rebVar) {
        return new defpackage.ref(2, new aile(rebVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ref) {
            defpackage.ref refVar = (defpackage.ref) obj;
            if (this.b == refVar.b && this.a.equals(refVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Condition{operator=" + (this.b != 1 ? "NONE_OF" : "ANY_OF") + ", voiceFeatureUiKeys=" + this.a.toString() + '}';
    }

    public ref() {
        throw null;
    }
}
