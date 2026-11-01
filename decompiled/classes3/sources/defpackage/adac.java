package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adac {
    public final defpackage.acwb a;
    public final defpackage.acvu b;

    public adac(defpackage.acwb acwbVar, defpackage.acvu acvuVar) {
        if (acwbVar == null) {
            throw new java.lang.NullPointerException("Null groupKey");
        }
        this.a = acwbVar;
        if (acvuVar == null) {
            throw new java.lang.NullPointerException("Null dataFileGroup");
        }
        this.b = acvuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adac) {
            defpackage.adac adacVar = (defpackage.adac) obj;
            if (this.a.equals(adacVar.a) && this.b.equals(adacVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.acvu acvuVar = this.b;
        return "GroupKeyAndGroup{groupKey=" + this.a.toString() + ", dataFileGroup=" + acvuVar.toString() + '}';
    }

    public adac() {
        throw null;
    }
}
