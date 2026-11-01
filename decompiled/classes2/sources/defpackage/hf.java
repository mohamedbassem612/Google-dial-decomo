package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hf {
    public int a;
    public int b;
    public java.lang.Object c;
    public int d;

    public hf(int i, int i2, int i3, java.lang.Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hf) {
            defpackage.hf hfVar = (defpackage.hf) obj;
            int i = this.a;
            if (i == hfVar.a) {
                if (i == 8 && java.lang.Math.abs(this.d - this.b) == 1 && this.d == hfVar.b && this.b == hfVar.d) {
                    return true;
                }
                if (this.d == hfVar.d && this.b == hfVar.b) {
                    java.lang.Object obj2 = this.c;
                    if (obj2 != null) {
                        if (obj2.equals(hfVar.c)) {
                            return true;
                        }
                    } else if (hfVar.c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append('[');
        int i = this.a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
