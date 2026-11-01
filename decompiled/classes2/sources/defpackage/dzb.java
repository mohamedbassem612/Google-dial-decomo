package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dzb {
    public final int a;
    private final int b;
    private final android.graphics.Point c;

    public dzb(int i, int i2, int i3, int i4) {
        this.b = i;
        this.a = i2;
        this.c = new android.graphics.Point(i3, i4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.dzb) {
            defpackage.dzb dzbVar = (defpackage.dzb) obj;
            if (this.b == dzbVar.b && this.a == dzbVar.a && this.c.equals(dzbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.a) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RoundedCornerCompat{position=");
        int i = this.b;
        if (i == 0) {
            str = "TopLeft";
        } else if (i != 1) {
            str = i != 2 ? "BottomLeft" : "BottomRight";
        } else {
            str = "TopRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.a);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
