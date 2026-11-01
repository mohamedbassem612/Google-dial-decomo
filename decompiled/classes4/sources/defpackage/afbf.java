package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class afbf extends xhp {
    public final android.content.Intent a;
    public final aihd b;

    public afbf(android.content.Intent intent, aihd aihdVar) {
        this.a = intent;
        this.b = aihdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.afbf)) {
            return false;
        }
        defpackage.afbf afbfVar = (defpackage.afbf) obj;
        return j$.util.Objects.equals(this.a, afbfVar.a) && j$.util.Objects.equals(this.b, afbfVar.b);
    }

    public final int hashCode() {
        return (j$.util.Objects.hashCode(this.a) * 31) + j$.util.Objects.hashCode(this.b);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {this.a, this.b};
        java.lang.String[] strArrSplit = "intent;removedExtras".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("afbf[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
