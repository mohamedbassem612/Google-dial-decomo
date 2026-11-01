package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abht implements defpackage.abia {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.abhh c;
    public final aomy d;
    public final defpackage.abhv e;
    public final defpackage.abhi f;

    public abht(java.lang.String str, java.lang.String str2, defpackage.abhi abhiVar, defpackage.abhh abhhVar, aomy aomyVar, defpackage.abhv abhvVar) {
        aooh.f(str, "title");
        this.a = str;
        this.b = str2;
        this.f = abhiVar;
        this.c = abhhVar;
        this.d = aomyVar;
        this.e = abhvVar;
    }

    @Override // defpackage.abia
    public final defpackage.abhv a() {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abht) {
            defpackage.abht abhtVar = (defpackage.abht) obj;
            if (aooh.n(this.a, abhtVar.a) && aooh.n(this.b, abhtVar.b) && aooh.n(this.f, abhtVar.f) && aooh.n(this.c, abhtVar.c) && aooh.n(this.d, abhtVar.d) && aooh.n(this.e, abhtVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f.a) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "EmphasizedPromotionalBannerUiData(title=" + this.a + ", text=" + this.b + ", image=" + this.f + ", actionButtonData=" + this.c + ", onClose=" + this.d + ", flags=" + this.e + ')';
    }
}
