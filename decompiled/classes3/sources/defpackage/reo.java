package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class reo {
    public final defpackage.rea a;
    public final defpackage.ret b;

    public reo(defpackage.rea reaVar, defpackage.ret retVar) {
        this.a = reaVar;
        this.b = retVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.reo) {
            defpackage.reo reoVar = (defpackage.reo) obj;
            if (this.a.equals(reoVar.a) && this.b.equals(reoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ret retVar = this.b;
        return "ErrorDialog{featureControllerKey=" + java.lang.String.valueOf(this.a) + ", spec=" + java.lang.String.valueOf(retVar) + '}';
    }

    public reo() {
        throw null;
    }
}
