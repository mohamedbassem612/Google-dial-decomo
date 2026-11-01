package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class seh {
    public final agoq a;
    public final defpackage.sfb b;
    public final java.lang.String c;

    public seh(agoq agoqVar, defpackage.sfb sfbVar, java.lang.String str) {
        aooh.f(agoqVar, "accountInfo");
        aooh.f(sfbVar, "shareSetting");
        this.a = agoqVar;
        this.b = sfbVar;
        this.c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.seh) {
            defpackage.seh sehVar = (defpackage.seh) obj;
            if (aooh.n(this.a, sehVar.a) && this.b == sehVar.b && aooh.n(this.c, sehVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "CallingCardSharingUiModel(accountInfo=" + this.a + ", shareSetting=" + this.b + ", gaiaAccountName=" + this.c + ')';
    }
}
