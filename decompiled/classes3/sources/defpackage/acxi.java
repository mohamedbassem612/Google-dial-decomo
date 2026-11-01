package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxi {
    public final java.lang.String a;
    public final ahyn b;

    public acxi(java.lang.String str, ahyn ahynVar) {
        this.a = str;
        this.b = ahynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acxi) {
            defpackage.acxi acxiVar = (defpackage.acxi) obj;
            if (this.a.equals(acxiVar.a) && this.b.equals(acxiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CheckContentChangeRequest{url=" + this.a + ", cachedETagOptional=" + java.lang.String.valueOf(this.b) + '}';
    }

    public acxi() {
        throw null;
    }
}
