package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class daz extends defpackage.dck {
    private static final defpackage.cpv h;
    public final defpackage.ddf f;
    public defpackage.dbu g;

    static {
        defpackage.cpv cpvVar = new defpackage.cpv();
        cpvVar.j(-281474976710656L);
        cpvVar.q(1.0f);
        cpvVar.r(1);
        h = cpvVar;
    }

    public daz(defpackage.dbk dbkVar) {
        super(dbkVar);
        defpackage.ddf ddfVar = new defpackage.ddf();
        this.f = ddfVar;
        ddfVar.z = this;
        this.g = dbkVar.j != null ? new defpackage.day(this) : null;
    }

    private final void H() {
        if (this.m) {
            return;
        }
        this.w.n().D();
    }

    @Override // defpackage.dck
    public final /* synthetic */ defpackage.cmv C() {
        return this.f;
    }

    @Override // defpackage.dck
    public final defpackage.dbu D() {
        return this.g;
    }

    @Override // defpackage.dck
    public final void E() {
        if (this.g == null) {
            this.g = new defpackage.day(this);
        }
    }

    @Override // defpackage.dck
    public final void F(defpackage.dcj dcjVar, long j, defpackage.dax daxVar, int i, boolean z) {
        defpackage.dcj dcjVar2;
        defpackage.dbk dbkVar = this.w;
        boolean z2 = false;
        if (dcjVar.e(dbkVar)) {
            if (aB(j)) {
                z2 = true;
            } else if (i == 1) {
                if ((java.lang.Float.floatToRawIntBits(X(j, aa())) & Integer.MAX_VALUE) < 2139095040) {
                    z = false;
                    i = 1;
                    z2 = true;
                } else {
                    i = 1;
                }
            }
        }
        if (z2) {
            int i2 = daxVar.a;
            defpackage.cfc cfcVarI = dbkVar.i();
            java.lang.Object[] objArr = cfcVarI.a;
            int i3 = cfcVarI.b - 1;
            while (i3 >= 0) {
                defpackage.dbk dbkVar2 = (defpackage.dbk) objArr[i3];
                if (dbkVar2.am()) {
                    dcjVar2 = dcjVar;
                    dcjVar2.b(dbkVar2, j, daxVar, i, z);
                    long jB = daxVar.b();
                    if (java.lang.Float.intBitsToFloat((int) (jB >> 32)) < 0.0f && das.c(jB) && !das.b(jB) && !dcjVar2.c(daxVar, dbkVar2)) {
                        break;
                    }
                } else {
                    dcjVar2 = dcjVar;
                }
                i3--;
                dcjVar = dcjVar2;
            }
            daxVar.a = i2;
        }
    }

    @Override // defpackage.dck
    public final void G(defpackage.cqf cqfVar, defpackage.cso csoVar) throws java.lang.Throwable {
        defpackage.dbk dbkVar = this.w;
        java.lang.Object objA = defpackage.dbn.a(dbkVar);
        defpackage.cfc cfcVarI = dbkVar.i();
        java.lang.Object[] objArr = cfcVarI.a;
        int i = cfcVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar2 = (defpackage.dbk) objArr[i2];
            if (dbkVar2.am()) {
                dbkVar2.A(cqfVar, csoVar);
            }
        }
        if (defpackage.dfb.a((android.view.View) objA)) {
            aC(cqfVar, h);
        }
    }

    @Override // defpackage.cxe
    public final int c(int i) {
        defpackage.vx vxVarAz = this.w.az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.a(dbkVar.p(), dbkVar.t(), i);
    }

    @Override // defpackage.cxe
    public final int d(int i) {
        defpackage.vx vxVarAz = this.w.az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.b(dbkVar.p(), dbkVar.t(), i);
    }

    @Override // defpackage.dck, defpackage.czc
    public final void dg(long j, float f, defpackage.aonj aonjVar) {
        super.dg(j, f, aonjVar);
        H();
    }

    @Override // defpackage.cxe
    public final int e(int i) {
        defpackage.vx vxVarAz = this.w.az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.c(dbkVar.p(), dbkVar.t(), i);
    }

    @Override // defpackage.cxe
    public final int f(int i) {
        defpackage.vx vxVarAz = this.w.az();
        defpackage.cye cyeVarD = vxVarAz.D();
        defpackage.dbk dbkVar = (defpackage.dbk) vxVarAz.a;
        return cyeVarD.d(dbkVar.p(), dbkVar.t(), i);
    }

    @Override // defpackage.dbt
    public final int s(defpackage.cwk cwkVar) {
        defpackage.dbu dbuVar = this.g;
        if (dbuVar != null) {
            return dbuVar.s(cwkVar);
        }
        defpackage.dbx dbxVar = (defpackage.dbx) ag();
        if (!dbxVar.l) {
            if (dbxVar.H() == 1) {
                defpackage.dag dagVar = dbxVar.w;
                dagVar.f = true;
                if (dagVar.b) {
                    dbxVar.u();
                }
            } else {
                dbxVar.w.g = true;
            }
        }
        defpackage.dck dckVarK = dbxVar.k();
        boolean z = dckVarK.n;
        dckVarK.n = true;
        dbxVar.m();
        dckVarK.n = z;
        java.lang.Integer num = (java.lang.Integer) dbxVar.w.h.get(cwkVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.cyd
    public final defpackage.czc v(long j) {
        if (this.y) {
            defpackage.dbu dbuVar = this.g;
            if (dbuVar == null) {
                defpackage.aooh.g();
            }
            j = dbuVar.d;
        }
        A(j);
        defpackage.dbk dbkVar = this.w;
        defpackage.cfc cfcVarJ = dbkVar.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.dbk) objArr[i2]).n().G = 3;
        }
        ax(dbkVar.q.e(this, dbkVar.t(), j));
        ap();
        return this;
    }

    @Override // defpackage.dck, defpackage.czc
    public final void y(long j, float f, defpackage.cso csoVar) {
        super.y(j, f, csoVar);
        H();
    }
}
