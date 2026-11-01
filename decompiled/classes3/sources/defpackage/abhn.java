package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhn implements defpackage.abhp {
    public final java.lang.String a;
    private final defpackage.abhv b;

    public /* synthetic */ abhn(java.lang.String str) {
        defpackage.abhv abhvVar = new defpackage.abhv(null);
        aooh.f(str, "text");
        this.a = str;
        this.b = abhvVar;
    }

    @Override // defpackage.abia
    public final defpackage.abhv a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abhn) {
            defpackage.abhn abhnVar = (defpackage.abhn) obj;
            if (aooh.n(this.a, abhnVar.a) && aooh.n(this.b, abhnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "DownloadedBannerUiData(text=" + this.a + ", flags=" + this.b + ')';
    }
}
