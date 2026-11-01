package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omy {
    public final j$.util.Optional a;
    public final j$.util.Optional b;

    public omy(j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    public static defpackage.omy a() {
        return new otm((byte[]) null).c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.omy) {
            defpackage.omy omyVar = (defpackage.omy) obj;
            if (this.a.equals(omyVar.a) && this.b.equals(omyVar.b)) {
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
        return "FidesContactGridInfo{topRowLabel=" + java.lang.String.valueOf(this.a) + ", lockIconResId=" + java.lang.String.valueOf(optional) + '}';
    }

    public omy() {
        throw null;
    }
}
