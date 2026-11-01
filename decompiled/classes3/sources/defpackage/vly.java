package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vly {
    public final aify a;
    public final j$.util.Optional b;

    public vly(aify aifyVar, j$.util.Optional optional) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null vvmObjects");
        }
        this.a = aifyVar;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null nextPageCursor");
        }
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vly) {
            defpackage.vly vlyVar = (defpackage.vly) obj;
            if (ahvr.aP(this.a, vlyVar.a) && this.b.equals(vlyVar.b)) {
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
        return "VvmObjectPage{vvmObjects=" + this.a.toString() + ", nextPageCursor=" + optional.toString() + '}';
    }

    public vly() {
        throw null;
    }
}
