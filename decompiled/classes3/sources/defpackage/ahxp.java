package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahxp extends ahxq implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final ahxq a;

    public ahxp(ahxq ahxqVar) {
        this.a = ahxqVar;
    }

    protected final java.lang.Object a(java.lang.Object obj) {
        throw new java.lang.AssertionError();
    }

    protected final java.lang.Object b(java.lang.Object obj) {
        throw new java.lang.AssertionError();
    }

    public final java.lang.Object c(java.lang.Object obj) {
        return this.a.d(obj);
    }

    public final java.lang.Object d(java.lang.Object obj) {
        return this.a.c(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ahxp) {
            return this.a.equals(((defpackage.ahxp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
