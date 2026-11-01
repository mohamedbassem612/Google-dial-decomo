package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cxz extends defpackage.czb {
    private final defpackage.dbt a;

    public cxz(defpackage.dbt dbtVar) {
        this.a = dbtVar;
    }

    @Override // defpackage.czb, defpackage.dpf
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.czb, defpackage.dpl
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.czb
    public final int n() {
        return this.a.x();
    }

    @Override // defpackage.czb
    public final defpackage.cxi o() {
        defpackage.dbt dbtVar = this.a;
        defpackage.cxi cxiVarK = dbtVar.n ? null : dbtVar.K();
        if (cxiVarK == null) {
            dbtVar.M().w.f();
        }
        return cxiVarK;
    }

    @Override // defpackage.czb
    public final defpackage.dpq p() {
        return this.a.p();
    }

    @Override // defpackage.czb
    public final float q(defpackage.czi cziVar) {
        defpackage.czi cziVar2;
        defpackage.aonj aonjVar;
        defpackage.dcy dcyVar;
        defpackage.aonn aonnVar = cziVar.a;
        if (aonnVar != null) {
            return ((java.lang.Number) aonnVar.a(this, java.lang.Float.valueOf(Float.NaN))).floatValue();
        }
        defpackage.dbt dbtVar = this.a;
        if (dbtVar.n) {
            return Float.NaN;
        }
        defpackage.aoot aootVar = new defpackage.aoot();
        aootVar.a = dbtVar;
        while (true) {
            yg ygVar = ((defpackage.dbt) aootVar.a).r;
            float fA = ygVar != null ? ygVar.a(cziVar) : Float.NaN;
            boolean zIsNaN = java.lang.Float.isNaN(fA);
            java.lang.Object obj = aootVar.a;
            if (!zIsNaN) {
                ((defpackage.dbt) obj).P(dbtVar.M(), cziVar);
                return cziVar.a(fA, ((defpackage.dbt) aootVar.a).K(), dbtVar.K());
            }
            defpackage.dbt dbtVar2 = (defpackage.dbt) obj;
            defpackage.aonn aonnVar2 = dbtVar2.j;
            if (aonnVar2 == null || (aonjVar = dbtVar2.k) == null || !((java.lang.Boolean) aonjVar.a(cziVar)).booleanValue()) {
                cziVar2 = cziVar;
            } else {
                defpackage.dbt dbtVar3 = (defpackage.dbt) aootVar.a;
                defpackage.adw adwVar = dbtVar3.p;
                if (adwVar == null) {
                    long[] jArr = defpackage.adx.a;
                    adwVar = new defpackage.adw(6);
                    dbtVar3.p = adwVar;
                }
                java.lang.Object objA = adwVar.a(cziVar);
                if (objA == null) {
                    objA = new dda(dbtVar3.L(), dbtVar3, cziVar);
                    adwVar.n(cziVar, objA);
                }
                dda ddaVar = (dda) objA;
                ddaVar.a = dbtVar3.L();
                defpackage.dcv dcvVar = dbtVar.M().k;
                if (dcvVar == null || (dcyVar = ((defpackage.deg) dcvVar).u) == null) {
                    cziVar2 = cziVar;
                } else {
                    cziVar2 = cziVar;
                    dcyVar.a.c(ddaVar, defpackage.dbt.i, new af(aonnVar2, aootVar, cziVar2, 13, (char[]) null));
                }
                ((defpackage.dbt) aootVar.a).P(dbtVar.M(), cziVar2);
                yg ygVar2 = ((defpackage.dbt) aootVar.a).r;
                float fA2 = ygVar2 != null ? ygVar2.a(cziVar2) : Float.NaN;
                if (!java.lang.Float.isNaN(fA2)) {
                    return cziVar2.a(fA2, ((defpackage.dbt) aootVar.a).K(), dbtVar.K());
                }
            }
            defpackage.dbt dbtVarO = ((defpackage.dbt) aootVar.a).O();
            if (dbtVarO == null) {
                ((defpackage.dbt) aootVar.a).P(dbtVar.M(), cziVar2);
                return Float.NaN;
            }
            aootVar.a = dbtVarO;
            cziVar = cziVar2;
        }
    }
}
