package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvd {
    public final j$.util.Optional a;
    public final j$.util.Optional b;

    public pvd(j$.util.Optional optional, j$.util.Optional optional2) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null front");
        }
        this.a = optional;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null back");
        }
        this.b = optional2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pvd) {
            defpackage.pvd pvdVar = (defpackage.pvd) obj;
            if (this.a.equals(pvdVar.a) && this.b.equals(pvdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.b;
        return "OptimalCameras{front=" + this.a.toString() + ", back=" + optional.toString() + '}';
    }

    public pvd() {
        throw null;
    }
}
