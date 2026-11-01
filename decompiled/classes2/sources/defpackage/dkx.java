package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dkx {
    public final dks a;
    public final dks b;
    public final dks c;
    public final dks d;

    public dkx(dks dksVar, dks dksVar2, dks dksVar3, dks dksVar4) {
        this.a = dksVar;
        this.b = dksVar2;
        this.c = dksVar3;
        this.d = dksVar4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.dkx)) {
            defpackage.dkx dkxVar = (defpackage.dkx) obj;
            if (aooh.n(this.a, dkxVar.a) && aooh.n(this.b, dkxVar.b) && aooh.n(this.c, dkxVar.c) && aooh.n(this.d, dkxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dks dksVar = this.a;
        int iHashCode = dksVar != null ? dksVar.hashCode() : 0;
        dks dksVar2 = this.b;
        int iHashCode2 = dksVar2 != null ? dksVar2.hashCode() : 0;
        int i = iHashCode * 31;
        dks dksVar3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (dksVar3 != null ? dksVar3.hashCode() : 0)) * 31;
        dks dksVar4 = this.d;
        return iHashCode3 + (dksVar4 != null ? dksVar4.hashCode() : 0);
    }

    public dkx() {
        this(null, null, null, null);
    }
}
