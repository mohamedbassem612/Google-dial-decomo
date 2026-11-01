package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uov implements defpackage.uow {
    public final long a;
    public final long b;
    public final java.lang.String c;
    public final android.net.Uri d;
    public final java.lang.Integer e;
    public final java.lang.String f;
    public final lpg g;

    public uov(long j, long j2, java.lang.String str, android.net.Uri uri, java.lang.Integer num, java.lang.String str2, lpg lpgVar) {
        aooh.f(str, "contactName");
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = uri;
        this.e = num;
        this.f = str2;
        this.g = lpgVar;
    }

    @Override // defpackage.uow
    public final long a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uov) {
            defpackage.uov uovVar = (defpackage.uov) obj;
            if (this.a == uovVar.a && this.b == uovVar.b && aooh.n(this.c, uovVar.c) && aooh.n(this.d, uovVar.d) && aooh.n(this.e, uovVar.e) && aooh.n(this.f, uovVar.f) && aooh.n(this.g, uovVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (((anty.M(this.a) * 31) + anty.M(this.b)) * 31) + this.c.hashCode();
        android.net.Uri uri = this.d;
        int iHashCode = ((iM * 31) + (uri == null ? 0 : uri.hashCode())) * 31;
        java.lang.Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "FavoritesBarComposableContactModel(speedDialEntryId=" + this.a + ", contactId=" + this.b + ", contactName=" + this.c + ", contactPhotoUri=" + this.d + ", defaultChannelIconId=" + this.e + ", defaultChannelPhoneLabel=" + this.f + ", dialerMonogramUiData=" + this.g + ')';
    }
}
