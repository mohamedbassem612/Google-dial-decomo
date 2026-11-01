package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class unf {
    public final java.lang.String a;
    public final int b;
    public final java.lang.String c;
    public final boolean d;
    public final int e;

    public unf(java.lang.String str, int i, java.lang.String str2, int i2, boolean z) {
        aooh.f(str, "number");
        aooh.f(str2, "label");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.e = i2;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.unf) {
            defpackage.unf unfVar = (defpackage.unf) obj;
            if (aooh.n(this.a, unfVar.a) && this.b == unfVar.b && aooh.n(this.c, unfVar.c) && this.e == unfVar.e && this.d == unfVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.e) * 31) + anty.L(this.d);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallTechnologyChannel(number=");
        sb.append(this.a);
        sb.append(", phoneType=");
        sb.append(this.b);
        sb.append(", label=");
        sb.append(this.c);
        sb.append(", technology=");
        int i = this.e;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "VOICE";
        } else if (i != 3) {
            str = i != 4 ? "RTT" : "DUO";
        } else {
            str = "IMS_VIDEO";
        }
        sb.append((java.lang.Object) str);
        sb.append(", canPlaceMeetCall=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
