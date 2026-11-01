package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mkn {
    public final boolean a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final android.graphics.drawable.Icon d;

    public mkn(boolean z, java.lang.String str, java.lang.String str2, android.graphics.drawable.Icon icon) {
        aooh.f(str, "label");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = icon;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mkn) {
            defpackage.mkn mknVar = (defpackage.mkn) obj;
            if (this.a == mknVar.a && aooh.n(this.b, mknVar.b) && aooh.n(this.c, mknVar.c) && aooh.n(this.d, mknVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = (anty.L(this.a) * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode = ((iL * 31) + (str == null ? 0 : str.hashCode())) * 31;
        android.graphics.drawable.Icon icon = this.d;
        return iHashCode + (icon != null ? icon.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "SimSelectorEntry(isEnabled=" + this.a + ", label=" + this.b + ", phoneNumber=" + this.c + ", icon=" + this.d + ')';
    }
}
