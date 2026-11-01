package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcz {
    public java.lang.Object a;
    public java.lang.Object b;

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dxy)) {
            return false;
        }
        dxy dxyVar = (dxy) obj;
        return anty.H(dxyVar.a, this.a) && anty.H(dxyVar.b, this.b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Pair{" + java.lang.String.valueOf(this.a) + ' ' + java.lang.String.valueOf(this.b) + '}';
    }
}
