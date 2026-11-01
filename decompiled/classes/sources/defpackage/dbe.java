package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dbe extends defpackage.dbu {
    final /* synthetic */ defpackage.dbg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbe(defpackage.dbg dbgVar) {
        super(dbgVar);
        this.f = dbgVar;
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int c(int i) {
        defpackage.dbg dbgVar = this.f;
        defpackage.dbd dbdVar = dbgVar.f;
        defpackage.dbu dbuVarD = dbgVar.H().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbdVar.e(this, dbuVarD, i);
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int d(int i) {
        defpackage.dbg dbgVar = this.f;
        defpackage.dbd dbdVar = dbgVar.f;
        defpackage.dbu dbuVarD = dbgVar.H().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbdVar.f(this, dbuVarD, i);
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int e(int i) {
        defpackage.dbg dbgVar = this.f;
        defpackage.dbd dbdVar = dbgVar.f;
        defpackage.dbu dbuVarD = dbgVar.H().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbdVar.i(this, dbuVarD, i);
    }

    @Override // defpackage.dbu, defpackage.cxe
    public final int f(int i) {
        defpackage.dbg dbgVar = this.f;
        defpackage.dbd dbdVar = dbgVar.f;
        defpackage.dbu dbuVarD = dbgVar.H().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbdVar.j(this, dbuVarD, i);
    }

    @Override // defpackage.dbt
    public final int s(defpackage.cwk cwkVar) {
        defpackage.ado adoVar = this.t;
        int iE = wo.e(this, cwkVar);
        adoVar.h(cwkVar, iE);
        return iE;
    }

    @Override // defpackage.cyd
    public final defpackage.czc v(long j) {
        A(j);
        defpackage.dpd dpdVar = new defpackage.dpd(j);
        defpackage.dbg dbgVar = this.f;
        dbgVar.g = dpdVar;
        defpackage.dbd dbdVar = dbgVar.f;
        defpackage.dbu dbuVarD = dbgVar.H().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        super.F(dbdVar.cX(this, dbuVarD, j));
        return this;
    }
}
