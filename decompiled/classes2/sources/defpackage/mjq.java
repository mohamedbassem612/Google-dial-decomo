package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjq {
    public final boolean a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final android.graphics.drawable.Icon f;

    public mjq(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.graphics.drawable.Icon icon) {
        aooh.f(str, "label");
        aooh.f(str3, "phoneAccountComponentName");
        aooh.f(str4, "phoneAccountId");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = icon;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mjq) {
            defpackage.mjq mjqVar = (defpackage.mjq) obj;
            if (this.a == mjqVar.a && aooh.n(this.b, mjqVar.b) && aooh.n(this.c, mjqVar.c) && aooh.n(this.d, mjqVar.d) && aooh.n(this.e, mjqVar.e) && aooh.n(this.f, mjqVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = (anty.L(this.a) * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode = ((((((iL * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        android.graphics.drawable.Icon icon = this.f;
        return iHashCode + (icon != null ? icon.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Entry(isEnabled=" + this.a + ", label=" + this.b + ", phoneNumber=" + this.c + ", phoneAccountComponentName=" + this.d + ", phoneAccountId=" + this.e + ", icon=" + this.f + ')';
    }
}
