package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikq extends defpackage.aijz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.aijz a;

    public aikq(defpackage.aijz aijzVar) {
        this.a = aijzVar;
    }

    @Override // defpackage.aijz
    public final defpackage.aijz a() {
        return this.a;
    }

    @Override // defpackage.aijz, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aikq) {
            return this.a.equals(((defpackage.aikq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
