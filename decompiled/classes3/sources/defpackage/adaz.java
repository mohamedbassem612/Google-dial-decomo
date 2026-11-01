package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adaz {
    public final aiwu a;
    public final aiwm b;

    public adaz(aiwu aiwuVar, aiwm aiwmVar) {
        if (aiwuVar == null) {
            throw new java.lang.NullPointerException("Null fileGroupStatus");
        }
        this.a = aiwuVar;
        if (aiwmVar == null) {
            throw new java.lang.NullPointerException("Null fileGroupDetails");
        }
        this.b = aiwmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adaz) {
            defpackage.adaz adazVar = (defpackage.adaz) obj;
            if (this.a.equals(adazVar.a) && this.b.equals(adazVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        aiwm aiwmVar = this.b;
        return "FileGroupStatusWithDetails{fileGroupStatus=" + this.a.toString() + ", fileGroupDetails=" + aiwmVar.toString() + '}';
    }

    public adaz() {
        throw null;
    }
}
