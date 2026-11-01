package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adad {
    public final defpackage.acvu a;
    public final defpackage.acvu b;

    public adad(defpackage.acvu acvuVar, defpackage.acvu acvuVar2) {
        this.a = acvuVar;
        this.b = acvuVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adad) {
            defpackage.adad adadVar = (defpackage.adad) obj;
            defpackage.acvu acvuVar = this.a;
            if (acvuVar != null ? acvuVar.equals(adadVar.a) : adadVar.a == null) {
                defpackage.acvu acvuVar2 = this.b;
                if (acvuVar2 == null) {
                    if (adadVar.b == null) {
                        return true;
                    }
                } else if (acvuVar2.equals(adadVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.acvu acvuVar = this.a;
        int iHashCode = acvuVar == null ? 0 : acvuVar.hashCode();
        defpackage.acvu acvuVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (acvuVar2 != null ? acvuVar2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.acvu acvuVar = this.b;
        return "GroupPair{pendingGroup=" + java.lang.String.valueOf(this.a) + ", downloadedGroup=" + java.lang.String.valueOf(acvuVar) + '}';
    }

    public adad() {
        throw null;
    }
}
