package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class unc extends defpackage.ttj {
    public final java.util.List a;
    public final boolean b;
    public final ums c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unc(java.util.List list, boolean z, ums umsVar) {
        super(null, null);
        if (list == null) {
            defpackage.aooh.i("items");
        }
        this.a = list;
        this.b = z;
        this.c = umsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.unc) {
            defpackage.unc uncVar = (defpackage.unc) obj;
            if (defpackage.aooh.n(this.a, uncVar.a) && this.b == uncVar.b && defpackage.aooh.n(this.c, uncVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ums umsVar = this.c;
        return ((iHashCode + defpackage.anty.L(this.b)) * 31) + (umsVar == null ? 0 : umsVar.hashCode());
    }

    public final java.lang.String toString() {
        return "Data(items=" + this.a + ", hideContacts=" + this.b + ", disambiguationData=" + this.c + ')';
    }
}
