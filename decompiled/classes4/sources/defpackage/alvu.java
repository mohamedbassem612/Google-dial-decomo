package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvu {
    public final defpackage.alxx a;
    public final defpackage.almy b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final defpackage.almm e;

    public alvu(defpackage.alxx alxxVar, defpackage.almy almyVar, j$.util.Optional optional, j$.util.Optional optional2, defpackage.almm almmVar) {
        this.a = alxxVar;
        this.b = almyVar;
        this.c = optional;
        this.d = optional2;
        this.e = almmVar;
    }

    public static defpackage.alvu a(defpackage.almm almmVar, defpackage.alxx alxxVar, defpackage.almy almyVar) {
        defpackage.amcn amcnVar = new defpackage.amcn((byte[]) null);
        amcnVar.j(almmVar);
        amcnVar.b = alxxVar;
        amcnVar.l(almyVar);
        return amcnVar.i();
    }

    public static defpackage.alvu b(java.lang.Object obj, java.lang.String str, defpackage.alxx alxxVar, defpackage.almy almyVar) {
        defpackage.amcn amcnVar = new defpackage.amcn((byte[]) null);
        amcnVar.k(obj);
        akzx akzxVarM = defpackage.almm.a.m();
        akzxVarM.u();
        defpackage.almm almmVar = (defpackage.almm) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almmVar.b |= 1;
        almmVar.c = str;
        amcnVar.j((defpackage.almm) akzxVarM.p());
        amcnVar.b = alxxVar;
        amcnVar.l(almyVar);
        return amcnVar.i();
    }

    public static defpackage.alvu c(java.lang.Object obj, java.lang.String str, defpackage.alxx alxxVar, defpackage.almy almyVar, defpackage.alxw alxwVar) {
        defpackage.amcn amcnVar = new defpackage.amcn((byte[]) null);
        amcnVar.k(obj);
        akzx akzxVarM = defpackage.almm.a.m();
        akzxVarM.u();
        defpackage.almm almmVar = (defpackage.almm) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almmVar.b |= 1;
        almmVar.c = str;
        amcnVar.j((defpackage.almm) akzxVarM.p());
        amcnVar.b = alxxVar;
        amcnVar.l(almyVar);
        amcnVar.c = j$.util.Optional.of(alxwVar);
        return amcnVar.i();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alvu) {
            defpackage.alvu alvuVar = (defpackage.alvu) obj;
            if (this.a.equals(alvuVar.a) && this.b.equals(alvuVar.b) && this.c.equals(alvuVar.c) && this.d.equals(alvuVar.d) && this.e.equals(alvuVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.almm almmVar = this.e;
        j$.util.Optional optional = this.d;
        j$.util.Optional optional2 = this.c;
        defpackage.almy almyVar = this.b;
        return "SpamDecisionFlowOutput{duplexSpamDecision=" + java.lang.String.valueOf(this.a) + ", triggeringEvent=" + java.lang.String.valueOf(almyVar) + ", flowCause=" + java.lang.String.valueOf(optional2) + ", flowTriggerName=" + java.lang.String.valueOf(optional) + ", botIntent=" + java.lang.String.valueOf(almmVar) + '}';
    }

    public alvu() {
        throw null;
    }
}
