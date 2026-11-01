package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahif {
    public final ahyn a;
    public final aigf b;
    public final ahyn c;

    public ahif(ahyn ahynVar, aigf aigfVar, ahyn ahynVar2) {
        if (ahynVar == null) {
            throw new java.lang.NullPointerException("Null accountName");
        }
        this.a = ahynVar;
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null psdList");
        }
        this.b = aigfVar;
        this.c = ahynVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahif) {
            defpackage.ahif ahifVar = (defpackage.ahif) obj;
            if (this.a.equals(ahifVar.a) && this.b.equals(ahifVar.b) && this.c.equals(ahifVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.c;
        aigf aigfVar = this.b;
        return "FeedbackContext{accountName=" + this.a.toString() + ", psdList=" + aigfVar.toString() + ", screenshot=" + ahynVar.toString() + '}';
    }

    public ahif() {
        throw null;
    }
}
