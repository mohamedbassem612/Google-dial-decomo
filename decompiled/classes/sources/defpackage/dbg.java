package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbg extends defpackage.dck {
    private static final defpackage.cpv N;
    private cws M;
    public defpackage.dbd f;
    public defpackage.dpd g;
    public defpackage.dbu h;

    static {
        defpackage.cpv cpvVar = new defpackage.cpv();
        cpvVar.j(-72056498821267456L);
        cpvVar.q(1.0f);
        cpvVar.r(1);
        N = cpvVar;
    }

    public dbg(defpackage.dbk dbkVar, defpackage.dbd dbdVar) {
        super(dbkVar);
        this.f = dbdVar;
        this.h = dbkVar.j != null ? new defpackage.dbe(this) : null;
        this.M = (dbdVar.L().u & 512) != 0 ? new cws(this, (defpackage.cwq) dbdVar) : null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    private final void aD() {
        boolean z;
        if (this.m) {
            return;
        }
        aq();
        defpackage.dck dckVarH = H();
        cws cwsVar = this.M;
        if (cwsVar != null) {
            defpackage.czb czbVar = this.o;
            defpackage.cwq cwqVar = cwsVar.b;
            defpackage.dbu dbuVar = this.h;
            if (dbuVar == null) {
                defpackage.aooh.g();
            }
            defpackage.cya cyaVar = dbuVar.s;
            if (cwqVar.p(czbVar) || cwsVar.c) {
                z = false;
            } else {
                long j = this.c;
                defpackage.dbu dbuVar2 = this.h;
                if (defpackage.dpp.b(j, dbuVar2 != null ? new defpackage.dpp(dbuVar2.u()) : null)) {
                    long j2 = dckVarH.c;
                    defpackage.dbu dbuVarD = dckVarH.D();
                    if (defpackage.dpp.b(j2, dbuVarD != null ? new defpackage.dpp(dbuVarD.u()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            dckVarH.x = z;
        }
        boolean z2 = dckVarH.n;
        dckVarH.n = this.n;
        L().i();
        dckVarH.n = z2;
        dckVarH.x = false;
    }

    @Override // defpackage.dck
    public final defpackage.cmv C() {
        return this.f.L();
    }

    @Override // defpackage.dck
    public final defpackage.dbu D() {
        return this.h;
    }

    @Override // defpackage.dck
    public final void E() {
        if (this.h == null) {
            this.h = new defpackage.dbe(this);
        }
    }

    @Override // defpackage.dck
    public final void G(defpackage.cqf cqfVar, defpackage.cso csoVar) {
        defpackage.dck dckVar;
        H().aj(cqfVar, csoVar);
        if (!defpackage.dfb.a((android.view.View) defpackage.dbn.a(this.w)) || (dckVar = this.z) == null) {
            return;
        }
        if (this.c == dckVar.c && dckVar.B == 0) {
            return;
        }
        aC(cqfVar, N);
    }

    public final defpackage.dck H() {
        defpackage.dck dckVar = this.z;
        if (dckVar == null) {
            defpackage.aooh.g();
        }
        return dckVar;
    }

    public final void I(defpackage.dbd dbdVar) {
        if (!defpackage.aooh.n(dbdVar, this.f)) {
            if ((dbdVar.L().u & 512) != 0) {
                defpackage.cwq cwqVar = (defpackage.cwq) dbdVar;
                cws cwsVar = this.M;
                if (cwsVar != null) {
                    cwsVar.b = cwqVar;
                } else {
                    cwsVar = new cws(this, cwqVar);
                }
                this.M = cwsVar;
            } else {
                this.M = null;
            }
        }
        this.f = dbdVar;
    }

    @Override // defpackage.cxe
    public final int c(int i) {
        cwo cwoVar = this.M;
        return cwoVar != null ? ((cws) cwoVar).b.a(cwoVar, H(), i) : this.f.e(this, H(), i);
    }

    @Override // defpackage.cxe
    public final int d(int i) {
        cwo cwoVar = this.M;
        return cwoVar != null ? ((cws) cwoVar).b.d(cwoVar, H(), i) : this.f.f(this, H(), i);
    }

    @Override // defpackage.dck, defpackage.czc
    public final void dg(long j, float f, defpackage.aonj aonjVar) {
        super.dg(j, f, aonjVar);
        aD();
    }

    @Override // defpackage.cxe
    public final int e(int i) {
        cwo cwoVar = this.M;
        return cwoVar != null ? ((cws) cwoVar).b.g(cwoVar, H(), i) : this.f.i(this, H(), i);
    }

    @Override // defpackage.cxe
    public final int f(int i) {
        cwo cwoVar = this.M;
        return cwoVar != null ? ((cws) cwoVar).b.h(cwoVar, H(), i) : this.f.j(this, H(), i);
    }

    @Override // defpackage.dbt
    public final int s(defpackage.cwk cwkVar) {
        defpackage.dbu dbuVar = this.h;
        return dbuVar != null ? dbuVar.t.c(cwkVar, Integer.MIN_VALUE) : wo.e(this, cwkVar);
    }

    @Override // defpackage.cyd
    public final defpackage.czc v(long j) {
        defpackage.cyf cyfVarCX;
        if (this.y) {
            defpackage.dpd dpdVar = this.g;
            if (dpdVar == null) {
                throw new java.lang.IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j = dpdVar.a;
        }
        A(j);
        cwr cwrVar = this.M;
        if (cwrVar != null) {
            defpackage.cwq cwqVar = ((cws) cwrVar).b;
            boolean z = false;
            boolean z2 = cwqVar.n(cwrVar.s()) || !defpackage.dpd.f(j, this.g);
            ((cws) cwrVar).c = z2;
            if (!z2) {
                H().y = true;
            }
            cyfVarCX = cwqVar.k(cwrVar, H(), j);
            H().y = false;
            int iC = cyfVarCX.c();
            defpackage.dbu dbuVar = this.h;
            if (dbuVar == null) {
                defpackage.aooh.g();
            }
            if (iC == dbuVar.a) {
                int iB = cyfVarCX.b();
                defpackage.dbu dbuVar2 = this.h;
                if (dbuVar2 == null) {
                    defpackage.aooh.g();
                }
                if (iB == dbuVar2.b) {
                    z = true;
                }
            }
            if (!((cws) cwrVar).c) {
                long j2 = H().c;
                defpackage.dbu dbuVarD = H().D();
                if (defpackage.dpp.b(j2, dbuVarD != null ? new defpackage.dpp(dbuVarD.u()) : null) && !z) {
                    cyfVarCX = new dbf(cyfVarCX, this);
                }
            }
        } else {
            cyfVarCX = this.f.cX(this, H(), j);
        }
        ax(cyfVarCX);
        ap();
        return this;
    }

    @Override // defpackage.dck, defpackage.czc
    public final void y(long j, float f, defpackage.cso csoVar) {
        super.y(j, f, csoVar);
        aD();
    }
}
