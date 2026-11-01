package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvi {
    public final crd a;
    public final crd b;
    public final crd c;

    public bvi(crd crdVar, crd crdVar2, crd crdVar3) {
        this.a = crdVar;
        this.b = crdVar2;
        this.c = crdVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bvi)) {
            defpackage.bvi bviVar = (defpackage.bvi) obj;
            if (aooh.n(this.a, bviVar.a) && aooh.n(this.b, bviVar.b) && aooh.n(this.c, bviVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        crd crdVar = this.c;
        return crdVar != null ? (iHashCode * 31) + crdVar.hashCode() : iHashCode;
    }
}
