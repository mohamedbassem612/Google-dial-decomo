package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhs implements defpackage.abia {
    public final abja a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.abhh d;
    public final aomy e;
    public final defpackage.abhv f;

    public abhs(abja abjaVar, java.lang.String str, java.lang.String str2, defpackage.abhh abhhVar, aomy aomyVar, defpackage.abhv abhvVar) {
        aooh.f(str, "title");
        this.a = abjaVar;
        this.b = str;
        this.c = str2;
        this.d = abhhVar;
        this.e = aomyVar;
        this.f = abhvVar;
    }

    @Override // defpackage.abia
    public final defpackage.abhv a() {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abhs) {
            defpackage.abhs abhsVar = (defpackage.abhs) obj;
            if (this.a == abhsVar.a && aooh.n(this.b, abhsVar.b) && aooh.n(this.c, abhsVar.c) && aooh.n(this.d, abhsVar.d) && aooh.n(this.e, abhsVar.e) && aooh.n(this.f, abhsVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "EmphasizedInformativeBannerUiData(icon=" + this.a + ", title=" + this.b + ", text=" + this.c + ", actionButtonData=" + this.d + ", onClose=" + this.e + ", flags=" + this.f + ')';
    }
}
