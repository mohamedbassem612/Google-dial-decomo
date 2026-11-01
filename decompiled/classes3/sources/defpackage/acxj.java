package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxj {
    public final boolean a;
    public final ahyn b;

    public acxj(boolean z, ahyn ahynVar) {
        this.a = z;
        this.b = ahynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acxj) {
            defpackage.acxj acxjVar = (defpackage.acxj) obj;
            if (this.a == acxjVar.a && this.b.equals(acxjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CheckContentChangeResponse{contentChanged=" + this.a + ", freshETagOptional=" + java.lang.String.valueOf(this.b) + '}';
    }

    public acxj() {
        throw null;
    }
}
