package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhm implements defpackage.abhp {
    public final java.lang.String a;
    public final defpackage.abhh b;
    private final defpackage.abhv c;

    public /* synthetic */ abhm(java.lang.String str, defpackage.abhh abhhVar, int i) {
        defpackage.abhv abhvVar = new defpackage.abhv(null);
        aooh.f(str, "text");
        this.a = str;
        this.b = (i & 2) != 0 ? null : abhhVar;
        this.c = abhvVar;
    }

    @Override // defpackage.abia
    public final defpackage.abhv a() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abhm) {
            defpackage.abhm abhmVar = (defpackage.abhm) obj;
            if (aooh.n(this.a, abhmVar.a) && aooh.n(this.b, abhmVar.b) && aooh.n(this.c, abhmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.abhh abhhVar = this.b;
        return ((iHashCode + (abhhVar == null ? 0 : abhhVar.hashCode())) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "DownloadableBannerUiData(text=" + this.a + ", actionButtonData=" + this.b + ", flags=" + this.c + ')';
    }
}
