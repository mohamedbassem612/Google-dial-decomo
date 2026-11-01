package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoiu implements java.io.Serializable {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public aoiu(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aoiu) {
            defpackage.aoiu aoiuVar = (defpackage.aoiu) obj;
            if (defpackage.aooh.n(this.a, aoiuVar.a) && defpackage.aooh.n(this.b, aoiuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
