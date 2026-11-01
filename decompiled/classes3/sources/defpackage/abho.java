package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abho implements defpackage.abhp {
    public final java.lang.String a;
    private final java.lang.String b;
    private final defpackage.abhh c;
    private final defpackage.abhv d;

    public /* synthetic */ abho(java.lang.String str) {
        defpackage.abhv abhvVar = new defpackage.abhv(null);
        aooh.f(str, "text");
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = abhvVar;
    }

    @Override // defpackage.abia
    public final defpackage.abhv a() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abho) {
            defpackage.abho abhoVar = (defpackage.abho) obj;
            if (aooh.n(this.a, abhoVar.a)) {
                java.lang.String str = abhoVar.b;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    defpackage.abhh abhhVar = abhoVar.c;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.d, abhoVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 29791) + 1237;
    }

    public final java.lang.String toString() {
        return "DownloadingBannerUiData(text=" + this.a + ", progressText=null, actionButtonData=null, flags=" + this.d + ')';
    }
}
