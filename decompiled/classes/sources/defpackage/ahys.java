package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahys extends defpackage.ahyn {
    private static final long serialVersionUID = 0;
    public final java.lang.Object a;

    public ahys(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ahyn
    public final defpackage.ahyn a(defpackage.ahyc ahycVar) {
        java.lang.Object objApply = ahycVar.apply(this.a);
        if (objApply != null) {
            return new defpackage.ahys(objApply);
        }
        throw new java.lang.NullPointerException("the Function passed to Optional.transform() must not return null.");
    }

    @Override // defpackage.ahyn
    public final java.lang.Object b() {
        return this.a;
    }

    @Override // defpackage.ahyn
    public final java.lang.Object c(defpackage.ahzi ahziVar) {
        ahziVar.getClass();
        return this.a;
    }

    @Override // defpackage.ahyn
    public final java.lang.Object d(java.lang.Object obj) {
        return this.a;
    }

    @Override // defpackage.ahyn
    public final java.lang.Object e() {
        return this.a;
    }

    @Override // defpackage.ahyn
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ahys) {
            return this.a.equals(((defpackage.ahys) obj).a);
        }
        return false;
    }

    @Override // defpackage.ahyn
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ahyn
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // defpackage.ahyn
    public final java.lang.String toString() {
        return "Optional.of(" + this.a.toString() + ')';
    }
}
