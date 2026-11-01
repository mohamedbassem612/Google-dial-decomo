package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class day extends defpackage.dbu {
    public day(defpackage.daz dazVar) {
        super(dazVar);
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int c(int i) {
        defpackage.vx vxVarAz = M().az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.a(dbkVar.p(), dbkVar.s(), i);
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int d(int i) {
        defpackage.vx vxVarAz = M().az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.b(dbkVar.p(), dbkVar.s(), i);
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int e(int i) {
        defpackage.vx vxVarAz = M().az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.c(dbkVar.p(), dbkVar.s(), i);
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int f(int i) {
        defpackage.vx vxVarAz = M().az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.d(dbkVar.p(), dbkVar.s(), i);
    }

    @Override // defpackage.dbt
    public final int s(defpackage.cwk cwkVar) {
        defpackage.dbv dbvVar = (defpackage.dbv) D();
        if (!dbvVar.j) {
            if (dbvVar.J() == 2) {
                defpackage.dag dagVar = dbvVar.p;
                dagVar.f = true;
                if (dagVar.b) {
                    dbvVar.f.e();
                }
            } else {
                dbvVar.p.g = true;
            }
        }
        defpackage.dbu dbuVar = ((defpackage.daz) dbvVar.k()).g;
        java.lang.Boolean boolValueOf = dbuVar != null ? java.lang.Boolean.valueOf(dbuVar.n) : null;
        defpackage.dbu dbuVar2 = ((defpackage.daz) dbvVar.k()).g;
        if (dbuVar2 != null) {
            dbuVar2.n = true;
        }
        dbvVar.m();
        defpackage.dbu dbuVar3 = ((defpackage.daz) dbvVar.k()).g;
        if (dbuVar3 != null) {
            dbuVar3.n = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        java.lang.Integer num = (java.lang.Integer) dbvVar.p.h.get(cwkVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.t.h(cwkVar, iIntValue);
        return iIntValue;
    }

    @Override // defpackage.dbu
    protected final void t() {
        defpackage.dbv dbvVarM = M().m();
        if (dbvVarM == null) {
            defpackage.aooh.g();
        }
        dbvVarM.C();
    }

    @Override // defpackage.cyd
    public final defpackage.czc v(long j) {
        A(j);
        defpackage.cfc cfcVarJ = M().j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbv dbvVarM = ((defpackage.dbk) objArr[i2]).m();
            if (dbvVarM == null) {
                defpackage.aooh.g();
            }
            dbvVarM.y = 3;
        }
        super.F(M().q.e(this, M().s(), j));
        return this;
    }
}
