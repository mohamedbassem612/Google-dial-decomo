package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahyo implements java.io.Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final java.lang.Object a;
    public final java.lang.Object b;

    public ahyo(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ahyo)) {
            return false;
        }
        defpackage.ahyo ahyoVar = (defpackage.ahyo) obj;
        return j$.util.Objects.equals(this.a, ahyoVar.a) && j$.util.Objects.equals(this.b, ahyoVar.b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        return "(" + java.lang.String.valueOf(this.a) + ", " + java.lang.String.valueOf(obj) + ')';
    }
}
