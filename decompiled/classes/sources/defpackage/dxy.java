package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dxy {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public dxy(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dxy)) {
            return false;
        }
        defpackage.dxy dxyVar = (defpackage.dxy) obj;
        return j$.util.Objects.equals(dxyVar.a, this.a) && j$.util.Objects.equals(dxyVar.b, this.b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Pair{" + this.a + ' ' + this.b + '}';
    }
}
