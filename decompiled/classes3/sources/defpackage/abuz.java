package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuz implements defpackage.abtx {
    public final android.net.Uri a;
    public final defpackage.amjp b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    private final java.lang.String f;
    private final long g;

    public abuz(java.lang.String str, android.net.Uri uri, defpackage.amjp amjpVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        aooh.f(str, "phoneNumber");
        aooh.f(amjpVar, "metadata");
        this.f = str;
        this.a = uri;
        this.b = amjpVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.g = j;
        defpackage.abup abupVar = defpackage.abup.UNKNOWN;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abuz) {
            defpackage.abuz abuzVar = (defpackage.abuz) obj;
            if (aooh.n(this.f, abuzVar.f) && aooh.n(this.a, abuzVar.a) && aooh.n(this.b, abuzVar.b) && aooh.n(this.c, abuzVar.c) && aooh.n(this.d, abuzVar.d) && aooh.n(this.e, abuzVar.e) && this.g == abuzVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + anty.M(this.g);
    }

    public final java.lang.String toString() {
        return "MyCallingCard(phoneNumber=" + this.f + ", fileUri=" + this.a + ", metadata=" + this.b + ", ownerId=" + this.c + ", lookupKey=" + this.d + ", photoToken=" + this.e + ", lastRefreshedAtTimeMs=" + this.g + ')';
    }
}
