package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdt {
    public final defpackage.abko a;
    public final int b;

    public pdt(defpackage.abko abkoVar, int i) {
        this.a = abkoVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pdt) {
            defpackage.pdt pdtVar = (defpackage.pdt) obj;
            if (aooh.n(this.a, pdtVar.a) && this.b == pdtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AvatarUiData(monogram2UiData=");
        sb.append(this.a);
        sb.append(", displaySize=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "LARGE" : "MEDIUM";
        } else {
            str = "SMALL";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
