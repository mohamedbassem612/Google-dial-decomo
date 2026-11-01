package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acuo {
    public final acux a;
    public final ahyn b;
    private final ahyn c;

    public acuo(acux acuxVar, ahyn ahynVar, ahyn ahynVar2) {
        this.a = acuxVar;
        this.b = ahynVar;
        this.c = ahynVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acuo) {
            defpackage.acuo acuoVar = (defpackage.acuo) obj;
            if (this.a.equals(acuoVar.a) && this.b.equals(acuoVar.b) && this.c.equals(acuoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.c;
        ahyn ahynVar2 = this.b;
        return "AddFileGroupRequest{dataFileGroup=" + java.lang.String.valueOf(this.a) + ", accountOptional=" + java.lang.String.valueOf(ahynVar2) + ", variantIdOptional=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public acuo() {
        throw null;
    }
}
