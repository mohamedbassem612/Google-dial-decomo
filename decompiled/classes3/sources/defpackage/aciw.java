package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aciw {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.acix d;
    public final defpackage.acix e;
    public final boolean f;
    public final defpackage.aciv g;
    public final int h;
    public final int i;
    public final int j;

    public aciw(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.acix acixVar, defpackage.acix acixVar2, int i, boolean z, int i2, defpackage.aciv acivVar) {
        aooh.f(str, "key");
        aooh.f(str2, "body");
        aooh.f(str3, "title");
        this.h = 1;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = acixVar;
        this.e = acixVar2;
        this.j = 3;
        this.f = z;
        this.i = i2;
        this.g = acivVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aciw) {
            defpackage.aciw aciwVar = (defpackage.aciw) obj;
            int i = aciwVar.h;
            if (aooh.n(this.a, aciwVar.a) && aooh.n(this.b, aciwVar.b) && aooh.n(this.c, aciwVar.c) && aooh.n(this.d, aciwVar.d) && aooh.n(this.e, aciwVar.e)) {
                int i2 = aciwVar.j;
                if (this.f == aciwVar.f && this.i == aciwVar.i && aooh.n(this.g, aciwVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        defpackage.aciv acivVar = this.g;
        return (((((((iHashCode * 31) + 3) * 31) + anty.L(this.f)) * 31) + this.i) * 31) + (acivVar == null ? 0 : acivVar.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionData(type=TOOLTIP, key=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", lightColors=");
        sb.append(this.d);
        sb.append(", darkColors=");
        sb.append(this.e);
        sb.append(", theme=AUTO, useCustomColors=");
        sb.append(this.f);
        sb.append(", placement=");
        int i = this.i;
        if (i != 1) {
            str = i != 2 ? "BELOW" : "ABOVE";
        } else {
            str = "UNKNOWN";
        }
        sb.append((java.lang.Object) str);
        sb.append(", action=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
