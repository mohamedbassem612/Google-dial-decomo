package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anpr {
    public final defpackage.anqw a;
    public final java.lang.Object b;

    public anpr(defpackage.anqw anqwVar) {
        this.b = null;
        this.a = anqwVar;
        defpackage.ahvr.bR(!anqwVar.h(), "cannot use OK status: %s", anqwVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.anpr anprVar = (defpackage.anpr) obj;
            if (j$.util.Objects.equals(this.a, anprVar.a) && j$.util.Objects.equals(this.b, anprVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
            ahymVarL.b("config", obj);
            return ahymVarL.toString();
        }
        defpackage.ahym ahymVarL2 = defpackage.ahvr.l(this);
        ahymVarL2.b("error", this.a);
        return ahymVarL2.toString();
    }

    public anpr(java.lang.Object obj) {
        this.b = obj;
        this.a = null;
    }
}
