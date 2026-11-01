package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmk {
    public final defpackage.zmj a;
    public final defpackage.zmd b;

    public zmk(defpackage.zmj zmjVar, defpackage.zmd zmdVar) {
        this.a = zmjVar;
        this.b = zmdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zmk) {
            defpackage.zmk zmkVar = (defpackage.zmk) obj;
            if (this.a == zmkVar.a && aooh.n(this.b, zmkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.zmd zmdVar = this.b;
        return iHashCode + (zmdVar == null ? 0 : zmdVar.hashCode());
    }

    public final java.lang.String toString() {
        return "Response(sentStatus=" + this.a + ", responseData=" + this.b + ')';
    }
}
