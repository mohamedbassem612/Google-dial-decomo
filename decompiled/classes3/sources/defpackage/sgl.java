package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sgl {
    public final aomy a;
    public final aomy b;
    public final java.util.List c;
    public final defpackage.sgn d;
    public final boolean e;
    public final boolean f;

    public sgl(aomy aomyVar, aomy aomyVar2, java.util.List list, defpackage.sgn sgnVar, boolean z, boolean z2) {
        aooh.f(aomyVar, "onActionButtonClicked");
        aooh.f(aomyVar2, "onMyCallingCardCreateClick");
        aooh.f(list, "contactsWithPatrick");
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = list;
        this.d = sgnVar;
        this.e = z;
        this.f = z2;
    }

    public static /* synthetic */ defpackage.sgl a(defpackage.sgl sglVar, java.util.List list, defpackage.sgn sgnVar, boolean z, int i) {
        aomy aomyVar = (i & 1) != 0 ? sglVar.a : null;
        aomy aomyVar2 = (i & 2) != 0 ? sglVar.b : null;
        if ((i & 4) != 0) {
            list = sglVar.c;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            sgnVar = sglVar.d;
        }
        boolean z2 = sglVar.e;
        aooh.f(aomyVar, "onActionButtonClicked");
        aooh.f(aomyVar2, "onMyCallingCardCreateClick");
        aooh.f(list2, "contactsWithPatrick");
        return new defpackage.sgl(aomyVar, aomyVar2, list2, sgnVar, z2, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sgl) {
            defpackage.sgl sglVar = (defpackage.sgl) obj;
            if (aooh.n(this.a, sglVar.a) && aooh.n(this.b, sglVar.b) && aooh.n(this.c, sglVar.c) && aooh.n(this.d, sglVar.d) && this.e == sglVar.e && this.f == sglVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        defpackage.sgn sgnVar = this.d;
        return (((((iHashCode * 31) + (sgnVar == null ? 0 : sgnVar.hashCode())) * 31) + anty.L(this.e)) * 31) + anty.L(this.f);
    }

    public final java.lang.String toString() {
        return "CallingCardSettingsUiData(onActionButtonClicked=" + this.a + ", onMyCallingCardCreateClick=" + this.b + ", contactsWithPatrick=" + this.c + ", myCallingCard=" + this.d + ", showMyCallingCardSettingsScreen=" + this.e + ", isLoading=" + this.f + ')';
    }
}
