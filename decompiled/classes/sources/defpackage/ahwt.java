package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahwt extends defpackage.ahyn {
    public static final defpackage.ahwt a = new defpackage.ahwt();
    private static final long serialVersionUID = 0;

    private ahwt() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.ahyn
    public final defpackage.ahyn a(defpackage.ahyc ahycVar) {
        return a;
    }

    @Override // defpackage.ahyn
    public final java.lang.Object b() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.ahyn
    public final java.lang.Object c(defpackage.ahzi ahziVar) {
        java.lang.Object objEZ = ahziVar.eZ();
        defpackage.ahvr.cj(objEZ, "use Optional.orNull() instead of a Supplier that returns null");
        return objEZ;
    }

    @Override // defpackage.ahyn
    public final java.lang.Object d(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // defpackage.ahyn
    public final java.lang.Object e() {
        return null;
    }

    @Override // defpackage.ahyn
    public final boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    @Override // defpackage.ahyn
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ahyn
    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.ahyn
    public final java.lang.String toString() {
        return "Optional.absent()";
    }
}
