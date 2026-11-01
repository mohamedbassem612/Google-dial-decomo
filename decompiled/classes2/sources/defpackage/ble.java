package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ble {
    private final defpackage.bgp a;
    private final long b;
    private final boolean c;
    private final int d;

    public ble(defpackage.bgp bgpVar, long j, int i, boolean z) {
        this.a = bgpVar;
        this.b = j;
        this.d = i;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ble) {
            defpackage.ble bleVar = (defpackage.ble) obj;
            if (this.a == bleVar.a && anty.ah(this.b, bleVar.b) && this.d == bleVar.d && this.c == bleVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.d) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String strC = cpm.c(this.b);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(strC);
        sb.append(", anchor=");
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "Right" : "Middle";
        } else {
            str = "Left";
        }
        sb.append((java.lang.Object) str);
        sb.append(", visible=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
