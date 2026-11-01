package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahzm implements java.io.Serializable, defpackage.ahzi {
    private static final long serialVersionUID = 0;
    public final java.lang.Object a;

    public ahzm(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        return this.a;
    }

    @Override // defpackage.ahzi
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ahzm) {
            return j$.util.Objects.equals(this.a, ((defpackage.ahzm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }

    public final java.lang.String toString() {
        return "Suppliers.ofInstance(" + java.lang.String.valueOf(this.a) + ')';
    }
}
