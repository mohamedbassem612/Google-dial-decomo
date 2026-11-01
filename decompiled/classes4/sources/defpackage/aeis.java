package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aeis {
    public final ahyn a;
    public final aehj b;

    public aeis(ahyn ahynVar, aehj aehjVar) {
        this.a = ahynVar;
        this.b = aehjVar;
    }

    public static final defpackage.amac a() {
        defpackage.amac amacVar = new defpackage.amac((byte[]) null);
        amacVar.b = new aehj();
        return amacVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aeis) {
            defpackage.aeis aeisVar = (defpackage.aeis) obj;
            if (aooh.n(this.a, aeisVar.a) && aooh.n(this.b, aeisVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() - 1161807148;
    }

    public final java.lang.String toString() {
        return "AdditionalAccountInformation(observableAccountInformation=" + this.a + ", accountCapabilitiesRetriever=" + this.b + ')';
    }
}
