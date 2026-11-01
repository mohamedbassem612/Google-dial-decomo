package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvu implements java.io.Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final java.lang.String a;
    public final java.lang.Long b = null;
    private final java.util.List c = new java.util.ArrayList();

    public ahvu(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ahvu)) {
            return false;
        }
        defpackage.ahvu ahvuVar = (defpackage.ahvu) obj;
        if (!j$.util.Objects.equals(this.a, ahvuVar.a)) {
            return false;
        }
        java.lang.Long l = ahvuVar.b;
        return j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.c, ahvuVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, null, this.c});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("tokenValue", this.a);
        ahymVarL.b("expirationTimeMillis", (java.lang.Object) null);
        ahymVarL.b("scopes", this.c);
        return ahymVarL.toString();
    }
}
