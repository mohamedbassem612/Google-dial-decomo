package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anpt {
    public final defpackage.anqy a;
    public final defpackage.anlw b;
    public final anpr c;

    public anpt(defpackage.anqy anqyVar, defpackage.anlw anlwVar, anpr anprVar) {
        this.a = anqyVar;
        ahvr.cj(anlwVar, "attributes");
        this.b = anlwVar;
        this.c = anprVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.anpt)) {
            return false;
        }
        defpackage.anpt anptVar = (defpackage.anpt) obj;
        return j$.util.Objects.equals(this.a, anptVar.a) && j$.util.Objects.equals(this.b, anptVar.b) && j$.util.Objects.equals(this.c, anptVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("addressesOrError", this.a.toString());
        ahymVarL.b("attributes", this.b);
        ahymVarL.b("serviceConfigOrError", this.c);
        return ahymVarL.toString();
    }
}
