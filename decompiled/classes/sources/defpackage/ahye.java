package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahye implements java.io.Serializable, defpackage.ahyc {
    private static final long serialVersionUID = 0;
    private final java.lang.Object a;

    public ahye(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        return this.a;
    }

    @Override // defpackage.ahyc
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ahye) {
            return j$.util.Objects.equals(this.a, ((defpackage.ahye) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "Functions.constant(" + java.lang.String.valueOf(this.a) + ')';
    }
}
