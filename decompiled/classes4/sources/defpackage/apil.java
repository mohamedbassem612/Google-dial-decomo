package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apil {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final java.lang.String e;
    public final java.lang.String f;
    private final long g;
    private final java.lang.String h;
    private final java.lang.String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final java.lang.String n;

    public apil(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str5) {
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.apil) {
            defpackage.apil apilVar = (defpackage.apil) obj;
            if (aooh.n(apilVar.e, this.e) && aooh.n(apilVar.f, this.f) && apilVar.g == this.g && aooh.n(apilVar.h, this.h) && aooh.n(apilVar.i, this.i) && apilVar.j == this.j && apilVar.k == this.k && apilVar.l == this.l && apilVar.m == this.m && aooh.n(apilVar.n, this.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.e.hashCode() + 527) * 31) + this.f.hashCode()) * 31) + anty.M(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        java.lang.String str = this.n;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        boolean z = this.m;
        return (((((((((iHashCode * 31) + anty.L(this.j)) * 31) + anty.L(this.k)) * 31) + anty.L(this.l)) * 31) + anty.L(z)) * 31) + iHashCode2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.l) {
            long j = this.g;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                java.lang.String str = ((java.text.DateFormat) defpackage.apln.a.get()).format(new java.util.Date(j));
                aooh.e(str, "format(...)");
                sb.append(str);
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        java.lang.String str2 = this.n;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
