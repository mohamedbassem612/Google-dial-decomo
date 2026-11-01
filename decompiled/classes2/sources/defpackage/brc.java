package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class brc {
    public final crd a;
    public final crd b;

    public brc(crd crdVar, crd crdVar2) {
        this.a = crdVar;
        this.b = crdVar2;
    }

    public static final crd a(crd crdVar, aomy aomyVar) {
        return crdVar == null ? (crd) aomyVar.a() : crdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.brc)) {
            defpackage.brc brcVar = (defpackage.brc) obj;
            if (aooh.n(this.a, brcVar.a) && aooh.n(this.b, brcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
