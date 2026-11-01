package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lhr {
    public final j$.util.Optional a;
    private final lhs b;

    public lhr(j$.util.Optional optional, lhs lhsVar) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null languageCode");
        }
        this.a = optional;
        if (lhsVar == null) {
            throw new java.lang.NullPointerException("Null savedSettings");
        }
        this.b = lhsVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optional = this.a;
        if (!optional.isPresent()) {
            return j$.util.Optional.empty();
        }
        lhs lhsVar = this.b;
        java.lang.String str = ((akff) optional.orElseThrow()).q;
        j$.util.Objects.requireNonNull(str);
        java.lang.String str2 = (java.lang.String) lhsVar.c.get(str);
        if (str2 == null) {
            str2 = null;
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(str2);
        if (optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        return (lhsVar.b & 1) != 0 ? j$.util.Optional.of(lhsVar.d) : j$.util.Optional.empty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lhr) {
            defpackage.lhr lhrVar = (defpackage.lhr) obj;
            if (this.a.equals(lhrVar.a) && this.b.equals(lhrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        lhs lhsVar = this.b;
        return "LoadedUserSettings{languageCode=" + this.a.toString() + ", savedSettings=" + lhsVar.toString() + '}';
    }

    public lhr() {
        throw null;
    }
}
