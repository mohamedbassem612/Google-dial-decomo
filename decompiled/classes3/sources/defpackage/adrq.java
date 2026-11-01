package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adrq {
    public final java.lang.String a;
    public final j$.util.Optional b;

    public adrq(java.lang.String str, j$.util.Optional optional) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null confidence");
        }
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adrq) {
            defpackage.adrq adrqVar = (defpackage.adrq) obj;
            if (this.a.equals(adrqVar.a) && this.b.equals(adrqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TranscriptionSuggestion{text=" + this.a + ", confidence=" + this.b.toString() + '}';
    }

    public adrq() {
        throw null;
    }
}
