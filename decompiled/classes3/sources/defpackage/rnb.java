package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rnb implements defpackage.rnc {
    public final java.lang.String a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;

    public rnb(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rnb) {
            defpackage.rnb rnbVar = (defpackage.rnb) obj;
            if (aooh.n(this.a, rnbVar.a) && this.b == rnbVar.b && aooh.n(this.c, rnbVar.c) && aooh.n(this.d, rnbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "CallInfoValid(number=" + this.a + ", callType=" + this.b + ", country=" + this.c + ", subscriptionId=" + this.d + ')';
    }
}
