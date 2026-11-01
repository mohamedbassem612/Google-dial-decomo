package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zbv implements defpackage.zbo {
    public final defpackage.zbw a;
    public final java.lang.Integer b;
    public final defpackage.zal c;
    public final java.lang.String d;
    public final defpackage.mce e;

    public zbv(defpackage.zbw zbwVar, java.lang.Integer num, defpackage.mce mceVar, defpackage.zal zalVar, java.lang.String str) {
        this.a = zbwVar;
        this.b = num;
        this.e = mceVar;
        this.c = zalVar;
        this.d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zbv) {
            defpackage.zbv zbvVar = (defpackage.zbv) obj;
            if (this.a == zbvVar.a && defpackage.aooh.n(this.b, zbvVar.b) && defpackage.aooh.n(this.e, zbvVar.e) && defpackage.aooh.n(this.c, zbvVar.c) && defpackage.aooh.n(this.d, zbvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        defpackage.mce mceVar = this.e;
        int iHashCode3 = (iHashCode2 + (mceVar == null ? 0 : mceVar.hashCode())) * 31;
        defpackage.zal zalVar = this.c;
        int iHashCode4 = (iHashCode3 + (zalVar == null ? 0 : zalVar.hashCode())) * 31;
        java.lang.String str = this.d;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CuiDebugEvent(cuiDebugType=" + this.a + ", semanticEventId=" + this.b + ", cuiEvent=" + this.e + ", cuiError=" + this.c + ", uniqueCallId=" + this.d + ')';
    }
}
