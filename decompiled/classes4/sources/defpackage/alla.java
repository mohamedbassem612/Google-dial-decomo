package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alla {
    public final java.lang.String a;
    public final j$.util.Optional b;

    public alla(java.lang.String str, j$.util.Optional optional) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null inputString");
        }
        this.a = str;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null historyString");
        }
        this.b = optional;
    }

    static defpackage.alla a(java.lang.String str) {
        return new defpackage.alla(str, j$.util.Optional.empty());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alla) {
            defpackage.alla allaVar = (defpackage.alla) obj;
            if (this.a.equals(allaVar.a) && this.b.equals(allaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TextInputs{inputString=" + this.a + ", historyString=" + this.b.toString() + '}';
    }

    public alla() {
        throw null;
    }
}
