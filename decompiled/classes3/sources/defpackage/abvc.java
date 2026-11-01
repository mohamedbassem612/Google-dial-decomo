package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abvc implements defpackage.abtx {
    public final android.net.Uri a;
    public final defpackage.amjp b;
    public final java.lang.String c;
    public final java.lang.String d;
    private final defpackage.abut e;
    private final long f;

    public abvc(defpackage.abut abutVar, android.net.Uri uri, defpackage.amjp amjpVar, java.lang.String str, java.lang.String str2, long j) {
        aooh.f(amjpVar, "metadata");
        this.e = abutVar;
        this.a = uri;
        this.b = amjpVar;
        this.c = str;
        this.d = str2;
        this.f = j;
        defpackage.abup abupVar = defpackage.abup.UNKNOWN;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abvc) {
            defpackage.abvc abvcVar = (defpackage.abvc) obj;
            if (aooh.n(this.e, abvcVar.e) && aooh.n(this.a, abvcVar.a) && aooh.n(this.b, abvcVar.b) && aooh.n(this.c, abvcVar.c) && aooh.n(this.d, abvcVar.d) && this.f == abvcVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + anty.M(this.f);
    }

    public final java.lang.String toString() {
        return "SelfCallingCard(account=" + this.e + ", fileUri=" + this.a + ", metadata=" + this.b + ", ownerId=" + this.c + ", photoToken=" + this.d + ", lastRefreshedAtTimeMs=" + this.f + ')';
    }
}
