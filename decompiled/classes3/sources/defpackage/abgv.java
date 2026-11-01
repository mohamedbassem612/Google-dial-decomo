package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgv implements defpackage.abgw {
    public final float a;
    public final int b;

    public abgv(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abgv) {
            defpackage.abgv abgvVar = (defpackage.abgv) obj;
            if (this.b == abgvVar.b && java.lang.Float.compare(this.a, abgvVar.a) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TouchRelease(target=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "Answer" : "NoAction";
        } else {
            str = "Decline";
        }
        sb.append((java.lang.Object) str);
        sb.append(", progress=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
