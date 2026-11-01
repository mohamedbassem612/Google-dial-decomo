package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vlu {
    public final aify a;
    public final j$.util.Optional b;

    public vlu(aify aifyVar, j$.util.Optional optional) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null voicemails");
        }
        this.a = aifyVar;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null nextPageCursor");
        }
        this.b = optional;
    }

    static defpackage.vlu a(java.util.List list, j$.util.Optional optional) {
        return new defpackage.vlu(aify.n(list), optional);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vlu) {
            defpackage.vlu vluVar = (defpackage.vlu) obj;
            if (ahvr.aP(this.a, vluVar.a) && this.b.equals(vluVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.b;
        return "VoicemailsPage{voicemails=" + this.a.toString() + ", nextPageCursor=" + optional.toString() + '}';
    }

    public vlu() {
        throw null;
    }
}
