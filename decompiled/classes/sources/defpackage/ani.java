package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ani extends defpackage.dap implements defpackage.ddc, defpackage.dan, defpackage.dcp {
    public final defpackage.aonj a;
    public defpackage.avd b;
    public defpackage.bek c;
    public final defpackage.cpg d;
    public defpackage.kaw e;

    public ani(defpackage.kaw kawVar, int i, defpackage.aonj aonjVar) {
        this.e = kawVar;
        this.a = aonjVar;
        defpackage.cpg cpgVar = new defpackage.cpg(i, false, new defpackage.gfx(this, 1, (byte[]) null), 10);
        V(cpgVar);
        this.d = cpgVar;
    }

    public final defpackage.bek a() {
        defpackage.aoot aootVar = new defpackage.aoot();
        defpackage.den.u(this, new ny(aootVar, this, 4, (byte[]) null));
        return (defpackage.bek) aootVar.a;
    }

    public final void b(defpackage.kaw kawVar, defpackage.avj avjVar) {
        if (!this.D) {
            kawVar.aw(avjVar);
        } else {
            defpackage.aoub aoubVar = (defpackage.aoub) ((defpackage.apbj) M()).a.get(defpackage.aoub.d);
            defpackage.aoov.an(M(), null, 0, new amh(kawVar, avjVar, aoubVar != null ? aoubVar.p(new defpackage.nz(kawVar, avjVar, 18, null)) : null, (defpackage.aoln) null, 4), 3);
        }
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.l, java.lang.Boolean.valueOf(this.d.e().b()));
        diqVar.a(defpackage.did.v, new defpackage.dhr(null, new defpackage.ded((java.lang.Object) this, 1, (byte[]) null)));
    }

    @Override // defpackage.cmv
    public final void cZ() {
        defpackage.bek bekVar = this.c;
        if (bekVar != null) {
            bekVar.a();
        }
        this.c = null;
    }

    public final void d(defpackage.kaw kawVar) {
        defpackage.avd avdVar;
        if (defpackage.aooh.n(this.e, kawVar)) {
            return;
        }
        defpackage.kaw kawVar2 = this.e;
        if (kawVar2 != null && (avdVar = this.b) != null) {
            kawVar2.aw(new ave(avdVar));
        }
        this.b = null;
        this.e = kawVar;
    }

    @Override // defpackage.dcp
    public final void v() {
        defpackage.bek bekVarA = a();
        if (this.d.e().b()) {
            defpackage.bek bekVar = this.c;
            if (bekVar != null) {
                bekVar.a();
            }
            if (bekVarA != null) {
                bekVarA.d();
            } else {
                bekVarA = null;
            }
            this.c = bekVarA;
        }
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean y() {
        return true;
    }
}
