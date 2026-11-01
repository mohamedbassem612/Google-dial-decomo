package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akaf {
    public final ahyn a;
    public final aihd b;

    public akaf(ahyn ahynVar, aihd aihdVar) {
        this.a = ahynVar;
        this.b = aihdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akaf) {
            defpackage.akaf akafVar = (defpackage.akaf) obj;
            if (this.a.equals(akafVar.a) && this.b.equals(akafVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        aihd aihdVar = this.b;
        return "Options{customScopes=" + java.lang.String.valueOf(this.a) + ", fallbackOptions=" + java.lang.String.valueOf(aihdVar) + '}';
    }

    public akaf() {
        throw null;
    }
}
