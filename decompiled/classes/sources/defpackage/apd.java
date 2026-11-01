package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class apd extends defpackage.ark implements defpackage.ddc {
    public final defpackage.cuq a;
    public defpackage.aonn b;
    public defpackage.aonn c;
    private ask d;
    private ask j;

    public apd(boolean z, defpackage.kaw kawVar, defpackage.aso asoVar) {
        super(defpackage.apg.a, z, kawVar, asoVar);
        this.a = new defpackage.cuq();
    }

    private final void A() {
        if (this.D) {
            defpackage.dpf dpfVar = defpackage.cfo.A(this).r;
            k().b = new defpackage.kaw(new defpackage.ahw(dpfVar), (byte[]) null);
        }
    }

    @Override // defpackage.ark, defpackage.cmv
    public final void cM() {
        n();
        ask askVar = this.d;
        if (askVar != null) {
            askVar.d = defpackage.cfo.A(this).r;
        }
        ask askVar2 = this.j;
        if (askVar2 != null) {
            askVar2.d = defpackage.cfo.A(this).r;
        }
        n();
        A();
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        if (this.g && (this.b == null || this.c == null)) {
            this.b = new defpackage.bae(this, 1);
            this.c = new defpackage.apc(this, null);
        }
        defpackage.aonn aonnVar = this.b;
        if (aonnVar != null) {
            diqVar.a(defpackage.did.d, new defpackage.dhr(null, aonnVar));
        }
        defpackage.aonn aonnVar2 = this.c;
        if (aonnVar2 != null) {
            diqVar.a(defpackage.did.e, aonnVar2);
        }
    }

    protected abstract ask d();

    @Override // defpackage.cmv
    public final void dc() {
        ask askVar = this.d;
        if (askVar != null) {
            askVar.d = defpackage.cfo.A(this).r;
        }
        ask askVar2 = this.j;
        if (askVar2 != null) {
            askVar2.d = defpackage.cfo.A(this).r;
        }
        A();
    }

    protected abstract ask f();

    protected abstract java.lang.Object g(long j, defpackage.aoln aolnVar);

    @Override // defpackage.ark
    public final boolean i() {
        defpackage.ato atoVarJ = j();
        if (atoVarJ.a.h()) {
            return true;
        }
        defpackage.amn amnVar = atoVarJ.k;
        return amnVar != null && amnVar.j();
    }

    protected abstract defpackage.ato j();

    protected abstract defpackage.aqm k();

    @Override // defpackage.ark, defpackage.ddb
    public final void p(defpackage.cvf cvfVar, cvg cvgVar, long j) {
        int i;
        java.util.List list = cvfVar.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((java.lang.Boolean) this.f.a(new cvu(((cvm) list.get(i2)).i))).booleanValue()) {
                super.p(cvfVar, cvgVar, j);
                break;
            }
        }
        if (this.g) {
            E();
            cvg cvgVar2 = cvg.a;
            if (cvgVar == cvgVar2 && cvfVar.e == 6) {
                ask askVarD = this.d;
                if (askVarD == null) {
                    askVarD = d();
                    this.d = askVarD;
                }
                if (askVarD != null) {
                    defpackage.aoss aossVarM = M();
                    asi asiVar = (asi) askVarD;
                    if (asiVar.b == null) {
                        asiVar.b = defpackage.aoov.an(aossVarM, null, 0, new dqx(asiVar, (defpackage.aoln) null, 1), 3);
                    }
                }
            }
            ask askVar = this.d;
            if (askVar != null) {
                askVar.o(cvfVar, cvgVar);
            }
            if (cvgVar == cvgVar2 && ((i = cvfVar.e) == 10 || i == 11 || i == 12)) {
                ask askVarF = this.j;
                if (askVarF == null) {
                    askVarF = f();
                    this.j = askVarF;
                }
                if (askVarF != null) {
                    defpackage.aoss aossVarM2 = M();
                    aud audVar = (aud) askVarF;
                    if (audVar.b == null) {
                        audVar.b = defpackage.aoov.an(aossVarM2, null, 0, new auc(audVar, (defpackage.aoln) null), 3);
                    }
                }
            }
            ask askVar2 = this.j;
            if (askVar2 != null) {
                askVar2.o(cvfVar, cvgVar);
            }
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

    @Override // defpackage.ark
    public final void h(long j) {
    }
}
