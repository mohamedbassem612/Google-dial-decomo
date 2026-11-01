package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bnv {
    public final crd a;
    public final crd b;

    public bnv(crd crdVar, crd crdVar2) {
        this.a = crdVar;
        this.b = crdVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bnv)) {
            defpackage.bnv bnvVar = (defpackage.bnv) obj;
            if (aooh.n(this.a, bnvVar.a) && aooh.n(this.b, bnvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
