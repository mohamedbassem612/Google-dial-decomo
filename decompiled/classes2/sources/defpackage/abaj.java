package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abaj extends aazc {
    public final j$.time.Duration a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final java.lang.String g;
    private final java.lang.String h;
    private final java.lang.String i;
    private final boolean j;
    private final int k;
    private final j$.time.Duration l;

    public /* synthetic */ abaj(boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, boolean z4, int i, int i2) {
        j$.time.Duration durationOfMinutes;
        if ((i2 & 512) != 0) {
            durationOfMinutes = j$.time.Duration.ofMinutes(10L);
            aooh.e(durationOfMinutes, "ofMinutes(...)");
        } else {
            durationOfMinutes = null;
        }
        int i3 = i2 & 4;
        int i4 = i2 & 2;
        int i5 = i2 & 256;
        int i6 = i2 & 128;
        int i7 = i2 & 64;
        int i8 = i2 & 32;
        boolean z5 = (i2 & 16) == 0;
        boolean z6 = i3 == 0;
        boolean z7 = !z5;
        boolean z8 = !z6;
        boolean z9 = !(i4 == 0);
        boolean z10 = (i5 == 0) & z4;
        java.lang.String str3 = i6 != 0 ? "https://www.gstatic.com" : null;
        java.lang.String str4 = i7 != 0 ? "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8" : str2;
        java.lang.String str5 = i8 != 0 ? "ondevicesafety-pa.googleapis.com" : str;
        boolean z11 = z7 | z3;
        boolean z12 = z8 | z2;
        boolean z13 = z9 | z;
        int i9 = i2 & 1;
        int i10 = (i2 & 1024) != 0 ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : i;
        boolean z14 = 1 == i9;
        aooh.f(str5, "persephoneHostUrl");
        aooh.f(str4, "persephoneApiKey");
        aooh.f(str3, "publicKeysHostUrl");
        aooh.f(durationOfMinutes, "pollInterval");
        this.b = z14;
        this.c = z13;
        this.d = z12;
        this.e = false;
        this.f = z11;
        this.g = str5;
        this.h = str4;
        this.i = str3;
        this.j = z10;
        this.a = durationOfMinutes;
        this.k = i10;
        this.l = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abaj) {
            defpackage.abaj abajVar = (defpackage.abaj) obj;
            if (this.b == abajVar.b && this.c == abajVar.c && this.d == abajVar.d) {
                boolean z = abajVar.e;
                if (this.f == abajVar.f && aooh.n(this.g, abajVar.g) && aooh.n(this.h, abajVar.h) && aooh.n(this.i, abajVar.i) && this.j == abajVar.j && aooh.n(this.a, abajVar.a) && this.k == abajVar.k) {
                    j$.time.Duration duration = abajVar.l;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = anty.L(this.b);
        java.lang.String str = this.g;
        boolean z = this.f;
        return ((((((((((((((((((((iL * 31) + anty.L(this.c)) * 31) + anty.L(this.d)) * 31) + anty.L(false)) * 31) + anty.L(z)) * 31) + str.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + anty.L(this.j)) * 31) + this.a.hashCode()) * 31) + this.k) * 31;
    }

    public abaj() {
        this(false, false, false, null, null, false, 0, 4095);
    }
}
