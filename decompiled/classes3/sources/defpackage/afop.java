package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afop {
    public final java.util.List a;
    public final int b;
    public final int c;

    public afop(java.util.List list, int i, int i2) {
        aooh.f(list, "sections");
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afop) {
            defpackage.afop afopVar = (defpackage.afop) obj;
            if (aooh.n(this.a, afopVar.a) && this.b == afopVar.b && this.c == afopVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.c;
        if (i == 0) {
            i = 0;
        }
        return ((iHashCode + this.b) * 31) + i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GooglePhotosResult(sections=");
        sb.append(this.a);
        sb.append(", state=");
        int i = this.b;
        if (i == 1) {
            str = "INITIALIZED";
        } else if (i == 2) {
            str = "IN_PROGRESS";
        } else if (i != 3) {
            str = i != 4 ? "FAILURE" : "SUCCESSFUL";
        } else {
            str = "EDITING";
        }
        sb.append((java.lang.Object) str);
        sb.append(", errorState=");
        sb.append((java.lang.Object) aehj.v(this.c));
        sb.append(')');
        return sb.toString();
    }
}
