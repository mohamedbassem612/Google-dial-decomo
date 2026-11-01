package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nkn {
    public final defpackage.nkl a;
    public final defpackage.njt b;

    public nkn(defpackage.nkl nklVar, defpackage.njt njtVar) {
        this.a = nklVar;
        this.b = njtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nkn) {
            defpackage.nkn nknVar = (defpackage.nkn) obj;
            if (this.a == nknVar.a && this.b == nknVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ParsedInferenceResult(intent=" + this.a + ", displayLabel=" + this.b + ')';
    }
}
