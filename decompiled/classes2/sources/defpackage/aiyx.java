package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiyx implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final java.lang.String a;
    private final int b;

    public aiyx(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aiyx) {
            defpackage.aiyx aiyxVar = (defpackage.aiyx) obj;
            if (j$.util.Objects.equals(this.a, aiyxVar.a) && this.b == aiyxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(str);
            sb.append(']');
        } else {
            sb.append(str);
        }
        int i = this.b;
        if (i >= 0) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }
}
