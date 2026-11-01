package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class slh {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final defpackage.abmv c;
    public final int d;
    public final aonj e;
    public final boolean f;
    public final java.lang.String g;
    public final boolean h;
    private final java.lang.String i;

    public slh(android.net.Uri uri, java.lang.String str, java.lang.String str2, defpackage.abmv abmvVar, int i, aonj aonjVar, boolean z, java.lang.String str3, boolean z2) {
        aooh.f(str2, "displayName");
        this.a = uri;
        this.i = str;
        this.b = str2;
        this.c = abmvVar;
        this.d = i;
        this.e = aonjVar;
        this.f = z;
        this.g = str3;
        this.h = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.slh) {
            defpackage.slh slhVar = (defpackage.slh) obj;
            if (aooh.n(this.a, slhVar.a) && aooh.n(this.i, slhVar.i) && aooh.n(this.b, slhVar.b) && aooh.n(this.c, slhVar.c) && this.d == slhVar.d && aooh.n(this.e, slhVar.e) && this.f == slhVar.f && aooh.n(this.g, slhVar.g) && this.h == slhVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.net.Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        java.lang.String str = this.i;
        int iHashCode2 = (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.b.hashCode();
        defpackage.abmv abmvVar = this.c;
        int iHashCode3 = ((((iHashCode2 * 31) + (abmvVar == null ? 0 : abmvVar.hashCode())) * 31) + this.d) * 31;
        aonj aonjVar = this.e;
        int iHashCode4 = (((iHashCode3 + (aonjVar == null ? 0 : aonjVar.hashCode())) * 31) + anty.L(this.f)) * 31;
        java.lang.String str2 = this.g;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + anty.L(this.h);
    }

    public final java.lang.String toString() {
        return "CallingCardPreviewUiData(backgroundImageUri=" + this.a + ", photoRefreshToken=" + this.i + ", displayName=" + this.b + ", flexFontUiData=" + this.c + ", fontColor=" + this.d + ", onContactNameGloballyPositioned=" + this.e + ", showPinchToAdjustIcon=" + this.f + ", remixButtonLabel=" + this.g + ", shouldShowPreviewAnswerMethod=" + this.h + ')';
    }
}
