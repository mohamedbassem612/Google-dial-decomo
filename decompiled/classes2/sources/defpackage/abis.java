package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abis {
    public final java.lang.String a;
    public final defpackage.abja b;
    public final java.lang.String c;
    public final boolean d;
    public final aomy e;
    public final int f;

    public abis(java.lang.String str, defpackage.abja abjaVar, int i, java.lang.String str2, boolean z, aomy aomyVar) {
        aooh.f(str, "key");
        aooh.f(str2, "text");
        this.a = str;
        this.b = abjaVar;
        this.f = i;
        this.c = str2;
        this.d = z;
        this.e = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abis) {
            defpackage.abis abisVar = (defpackage.abis) obj;
            if (aooh.n(this.a, abisVar.a) && this.b == abisVar.b && this.f == abisVar.f && aooh.n(this.c, abisVar.c) && this.d == abisVar.d && aooh.n(this.e, abisVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.abja abjaVar = this.b;
        return ((((((((iHashCode + (abjaVar == null ? 0 : abjaVar.hashCode())) * 31) + this.f) * 31) + this.c.hashCode()) * 31) + anty.L(this.d)) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChipItem(key=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", iconStyle=");
        int i = this.f;
        if (i != 1) {
            str = i != 2 ? "SemanticRed" : "Gemini";
        } else {
            str = "Default";
        }
        sb.append((java.lang.Object) str);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", isSelected=");
        sb.append(this.d);
        sb.append(", onClick=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
