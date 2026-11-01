package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymc {
    public final defpackage.ylf a;
    public final defpackage.ydy b;

    public ymc(defpackage.ylf ylfVar, defpackage.ydy ydyVar) {
        if (ylfVar == null) {
            throw new java.lang.NullPointerException("Null service");
        }
        this.a = ylfVar;
        if (ydyVar == null) {
            throw new java.lang.NullPointerException("Null disconnectSignal");
        }
        this.b = ydyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ymc) {
            defpackage.ymc ymcVar = (defpackage.ymc) obj;
            if (this.a.equals(ymcVar.a) && this.b.equals(ymcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ydy ydyVar = this.b;
        return "ServiceContext{service=" + this.a.toString() + ", disconnectSignal=" + ydyVar.toString() + '}';
    }

    public ymc() {
        throw null;
    }
}
