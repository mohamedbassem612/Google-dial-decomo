package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class buu {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;

    public buu(java.lang.String str, java.lang.String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.buu buuVar = (defpackage.buu) obj;
            if (aooh.n(this.a, buuVar.a) && aooh.n(this.b, buuVar.b) && this.c == buuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + 1237) * 31) + this.c;
    }
}
