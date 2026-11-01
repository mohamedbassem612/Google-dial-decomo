package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyd {
    public final int a;
    public final java.lang.String b;
    public final java.lang.Integer c;
    public final defpackage.abja d;
    public final int e;
    public final defpackage.jlr f;

    public jyd(int i, defpackage.jlr jlrVar, java.lang.String str, java.lang.Integer num, defpackage.abja abjaVar, int i2) {
        this.a = i;
        this.f = jlrVar;
        this.b = str;
        this.c = num;
        this.d = abjaVar;
        this.e = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jyd) {
            defpackage.jyd jydVar = (defpackage.jyd) obj;
            if (this.a == jydVar.a && aooh.n(this.f, jydVar.f) && aooh.n(this.b, jydVar.b) && aooh.n(this.c, jydVar.c) && this.d == jydVar.d && this.e == jydVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a * 31) + this.f.hashCode();
        java.lang.String str = this.b;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.c;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallLogChip(imageResourceId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.f);
        sb.append(", growthKitTag=");
        sb.append(this.b);
        sb.append(", imageTintResourceId=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", iconTintType=");
        sb.append((java.lang.Object) (this.e != 1 ? "PRIMARY_RED" : "DEFAULT"));
        sb.append(')');
        return sb.toString();
    }
}
