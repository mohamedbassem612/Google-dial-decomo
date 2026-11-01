package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qxm {
    public final int a;
    public final boolean b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final boolean g;
    public final aomy h;
    public final boolean i;
    public final boolean j;
    public final long k;

    public qxm(int i, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, boolean z3, aomy aomyVar, boolean z4, boolean z5, long j) {
        aooh.f(str, "label");
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = aomyVar;
        this.i = z4;
        this.j = z5;
        this.k = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qxm) {
            defpackage.qxm qxmVar = (defpackage.qxm) obj;
            if (this.a == qxmVar.a && this.b == qxmVar.b && aooh.n(this.c, qxmVar.c) && aooh.n(this.d, qxmVar.d) && aooh.n(this.e, qxmVar.e) && this.f == qxmVar.f && this.g == qxmVar.g && aooh.n(this.h, qxmVar.h) && this.i == qxmVar.i && this.j == qxmVar.j && this.k == qxmVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = (((this.a * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
        java.lang.String str = this.d;
        int iHashCode = ((iL * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.e;
        return ((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + anty.L(this.f)) * 31) + anty.L(this.g)) * 31) + this.h.hashCode()) * 31) + anty.L(this.i)) * 31) + anty.L(this.j)) * 31) + anty.M(this.k);
    }

    public final java.lang.String toString() {
        return "FixedButtonUiData(iconRes=" + this.a + ", showMoreIndicator=" + this.b + ", label=" + this.c + ", contentDescription=" + this.d + ", stateDescription=" + this.e + ", selected=" + this.f + ", enabled=" + this.g + ", onClick=" + this.h + ", isSmallSecondaryWindow=" + this.i + ", showImmediateUiChange=" + this.j + ", immediateUiChangeDurationMillis=" + this.k + ')';
    }
}
