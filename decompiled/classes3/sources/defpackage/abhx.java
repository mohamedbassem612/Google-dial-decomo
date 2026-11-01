package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhx implements defpackage.abia {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.abhh c;
    public final defpackage.abhh d;
    public final aomy e;
    public final aomy f;
    public final defpackage.abhv g;
    public final defpackage.abhw h;
    private final boolean i;

    public abhx(defpackage.abhw abhwVar, java.lang.String str, java.lang.String str2, defpackage.abhh abhhVar, aomy aomyVar, aomy aomyVar2, defpackage.abhv abhvVar) {
        aooh.f(str, "title");
        this.h = abhwVar;
        this.a = str;
        this.b = str2;
        this.c = abhhVar;
        this.d = null;
        this.i = false;
        this.e = aomyVar;
        this.f = aomyVar2;
        this.g = abhvVar;
    }

    @Override // defpackage.abia
    public final defpackage.abhv a() {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abhx) {
            defpackage.abhx abhxVar = (defpackage.abhx) obj;
            if (aooh.n(this.h, abhxVar.h) && aooh.n(this.a, abhxVar.a) && aooh.n(this.b, abhxVar.b) && aooh.n(this.c, abhxVar.c)) {
                defpackage.abhh abhhVar = abhxVar.d;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    boolean z = abhxVar.i;
                    if (aooh.n(this.e, abhxVar.e) && aooh.n(this.f, abhxVar.f) && aooh.n(this.g, abhxVar.g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() * 31) + this.a.hashCode();
        java.lang.String str = this.b;
        return (((((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 961) + 1237) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "InformativeBannerUiData(icon=" + this.h + ", title=" + this.a + ", text=" + this.b + ", primaryButtonData=" + this.c + ", secondaryButtonData=null, emphasizedPrimaryButton=false, onClose=" + this.e + ", onShown=" + this.f + ", flags=" + this.g + ')';
    }
}
