package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aodb {
    final anop a;
    final java.lang.Object b;

    public aodb(anop anopVar, java.lang.Object obj) {
        this.a = anopVar;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.aodb aodbVar = (defpackage.aodb) obj;
            if (j$.util.Objects.equals(this.a, aodbVar.a) && j$.util.Objects.equals(this.b, aodbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("provider", this.a);
        ahymVarL.b("config", this.b);
        return ahymVarL.toString();
    }
}
