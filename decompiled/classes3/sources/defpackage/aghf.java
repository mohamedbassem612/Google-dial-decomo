package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghf {
    public final defpackage.aggc a;
    public final boolean b;
    public final int c;
    public final android.graphics.Bitmap d;
    public final android.graphics.Bitmap e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final android.graphics.Bitmap m;
    public final java.lang.String n;
    public final java.lang.String o;
    public final boolean p;
    public final java.lang.String q;
    public final java.lang.String r;
    public final java.lang.String s;

    public aghf(defpackage.aggc aggcVar, boolean z, int i, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, boolean z3, boolean z4, boolean z5, android.graphics.Bitmap bitmap3, java.lang.String str4, java.lang.String str5, boolean z6, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        aooh.f(aggcVar, "progressUiType");
        this.a = aggcVar;
        this.b = z;
        this.c = i;
        this.d = bitmap;
        this.e = bitmap2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = bitmap3;
        this.n = str4;
        this.o = str5;
        this.p = z6;
        this.q = str6;
        this.r = str7;
        this.s = str8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aghf) {
            defpackage.aghf aghfVar = (defpackage.aghf) obj;
            if (this.a == aghfVar.a && this.b == aghfVar.b && this.c == aghfVar.c && aooh.n(this.d, aghfVar.d) && aooh.n(this.e, aghfVar.e) && aooh.n(this.f, aghfVar.f) && aooh.n(this.g, aghfVar.g) && aooh.n(this.h, aghfVar.h) && this.i == aghfVar.i && this.j == aghfVar.j && this.k == aghfVar.k && this.l == aghfVar.l && aooh.n(this.m, aghfVar.m) && aooh.n(this.n, aghfVar.n) && aooh.n(this.o, aghfVar.o) && this.p == aghfVar.p && aooh.n(this.q, aghfVar.q) && aooh.n(this.r, aghfVar.r) && aooh.n(this.s, aghfVar.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        android.graphics.Bitmap bitmap = this.d;
        int iL = (((((iHashCode + anty.L(this.b)) * 31) + this.c) * 31) + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        android.graphics.Bitmap bitmap2 = this.e;
        int iHashCode2 = (iL + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        java.lang.String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.h;
        int iHashCode5 = (((((((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + anty.L(this.i)) * 31) + anty.L(this.j)) * 31) + anty.L(this.k)) * 31) + anty.L(this.l)) * 31;
        android.graphics.Bitmap bitmap3 = this.m;
        int iHashCode6 = (iHashCode5 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31;
        java.lang.String str4 = this.n;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.o;
        int iHashCode8 = (((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + anty.L(this.p)) * 31;
        java.lang.String str6 = this.q;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.r;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.s;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "SetupProgressUiData(progressUiType=" + this.a + ", progressIndeterminate=" + this.b + ", progressValue=" + this.c + ", progressIcon=" + this.d + ", bottomSheetIcon=" + this.e + ", bottomSheetTitle=" + this.f + ", bottomSheetDescription=" + this.g + ", bottomSheetButtonText=" + this.h + ", bottomSheetProgressBarVisible=" + this.i + ", bottomSheetCardVisible=" + this.j + ", bottomSheetCardHighlighted=" + this.k + ", bottomSheetCardShowIndicator=" + this.l + ", bottomSheetCardIcon=" + this.m + ", bottomSheetCardTitle=" + this.n + ", bottomSheetCardDescription=" + this.o + ", toolTipVisible=" + this.p + ", toolTipTitle=" + this.q + ", toolTipDescription=" + this.r + ", toolTipButtonText=" + this.s + ')';
    }
}
