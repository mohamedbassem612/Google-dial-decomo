package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcb {
    public final defpackage.amdp a;
    public final j$.util.Optional b;

    public amcb(defpackage.amdp amdpVar, j$.util.Optional optional) {
        this.a = amdpVar;
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amcb) {
            defpackage.amcb amcbVar = (defpackage.amcb) obj;
            if (this.a.equals(amcbVar.a) && this.b.equals(amcbVar.b)) {
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
        return "AmCacheParameters{matchingParams=" + java.lang.String.valueOf(this.a) + ", lastKeyPressed=" + java.lang.String.valueOf(optional) + '}';
    }

    public amcb() {
        throw null;
    }
}
