package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktc {
    public final aomy a;
    public final java.util.List b;
    public final java.util.List c;
    public final defpackage.ktd d;

    public ktc(aomy aomyVar, java.util.List list, java.util.List list2, defpackage.ktd ktdVar) {
        aooh.f(list, "primaryActions");
        aooh.f(list2, "secondaryActions");
        this.a = aomyVar;
        this.b = list;
        this.c = list2;
        this.d = ktdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ktc) {
            defpackage.ktc ktcVar = (defpackage.ktc) obj;
            if (aooh.n(this.a, ktcVar.a) && aooh.n(this.b, ktcVar.b) && aooh.n(this.c, ktcVar.c) && aooh.n(this.d, ktcVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        defpackage.ktd ktdVar = this.d;
        return (iHashCode * 31) + (ktdVar == null ? 0 : ktdVar.hashCode());
    }

    public final java.lang.String toString() {
        return "CallOptionsDialogUiModel(onClose=" + this.a + ", primaryActions=" + this.b + ", secondaryActions=" + this.c + ", header=" + this.d + ')';
    }
}
