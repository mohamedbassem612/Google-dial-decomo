package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afbb extends defpackage.xhp {
    public final afbf a;
    public final java.lang.String b;
    public final aihd c;
    public final j$.time.Duration d;
    public final defpackage.afba e;

    public afbb(afbf afbfVar, java.lang.String str, aihd aihdVar, j$.time.Duration duration, defpackage.afba afbaVar) {
        this.a = afbfVar;
        this.b = str;
        this.c = aihdVar;
        this.d = duration;
        this.e = afbaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.afbb)) {
            return false;
        }
        defpackage.afbb afbbVar = (defpackage.afbb) obj;
        return j$.util.Objects.equals(this.a, afbbVar.a) && j$.util.Objects.equals(this.b, afbbVar.b) && j$.util.Objects.equals(this.c, afbbVar.c) && j$.util.Objects.equals(this.d, afbbVar.d) && j$.util.Objects.equals(this.e, afbbVar.e);
    }

    public final int hashCode() {
        return (((((((j$.util.Objects.hashCode(this.a) * 31) + j$.util.Objects.hashCode(this.b)) * 31) + j$.util.Objects.hashCode(this.c)) * 31) + j$.util.Objects.hashCode(this.d)) * 31) + j$.util.Objects.hashCode(this.e);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {this.a, this.b, this.c, this.d, this.e};
        java.lang.String[] strArrSplit = "sanitizationResult;className;originalExtras;sanitizationTime;intentSource".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("afbb[");
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
