package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ams extends defpackage.cmv implements defpackage.dat, defpackage.ddc {
    public defpackage.cso a;
    public float b;
    public defpackage.cqd c;
    public defpackage.crd d;
    private final defpackage.aou e = new defpackage.aou();
    private defpackage.aomy f;

    public ams(float f, defpackage.cqd cqdVar, defpackage.crd crdVar) {
        this.b = f;
        this.c = cqdVar;
        this.d = crdVar;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.U, this.d);
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        float fCeil;
        float f;
        defpackage.aou aouVar;
        aot awuVar;
        int i;
        dbmVar.D();
        defpackage.cqx cqxVarA = this.d.a(dbmVar.o(), dbmVar.p(), dbmVar);
        float f2 = this.b;
        defpackage.cqd cqdVar = this.c;
        if (this.f == null) {
            this.f = new defpackage.ml(this, 9);
        }
        if (java.lang.Float.compare(f2, 0.0f) == 0) {
            fCeil = 1.0f;
        } else {
            fCeil = java.lang.Float.compare(f2, Float.NaN) == 0 ? 0.0f : (float) java.lang.Math.ceil(dbmVar.dl(f2));
        }
        if (fCeil > 0.0f) {
            defpackage.aou aouVar2 = this.e;
            if (defpackage.aooh.n(cqdVar, aouVar2.c) && defpackage.aooh.n(cqxVarA, aouVar2.d) && aouVar2.e != null) {
                f = fCeil;
                aouVar = aouVar2;
            } else {
                aouVar2.c = cqdVar;
                aouVar2.d = cqxVarA;
                defpackage.cqa cqaVar = null;
                if (cqxVarA instanceof defpackage.cqu) {
                    defpackage.cqu cquVar = (defpackage.cqu) cqxVarA;
                    defpackage.cpx cpxVar = cquVar.a;
                    defpackage.cpn cpnVarB = cpxVar.b();
                    defpackage.cpx cpxVarA = aouVar2.a();
                    cpxVarA.k();
                    cpxVarA.t(cpnVarB);
                    cpxVarA.r(cpxVarA, cpxVar, 0);
                    float fCeil2 = (float) java.lang.Math.ceil(cpnVarB.d - cpnVarB.b);
                    float fCeil3 = (float) java.lang.Math.ceil(cpnVarB.e - cpnVarB.c);
                    if (cqdVar instanceof defpackage.crf) {
                        cqaVar = new defpackage.cqa(defpackage.cqg.h(((defpackage.crf) cqdVar).a, 1.0f), 5);
                        i = 1;
                    } else {
                        i = 0;
                    }
                    defpackage.cqa cqaVar2 = cqaVar;
                    int i2 = i;
                    aooq aooqVar = new aooq();
                    aooqVar.a = Float.NaN;
                    long j = (int) fCeil2;
                    f = fCeil;
                    awuVar = new aot(aouVar2, cpnVarB, cquVar, cqdVar, aooqVar, new defpackage.aoot(), (j << 32) | (((long) ((int) fCeil3)) & 4294967295L), i2, cpxVarA, cqaVar2);
                    aouVar = aouVar2;
                } else {
                    f = fCeil;
                    aouVar = aouVar2;
                    if (cqxVarA instanceof defpackage.cqw) {
                        defpackage.cqw cqwVar = (defpackage.cqw) cqxVarA;
                        defpackage.cpo cpoVar = cqwVar.a;
                        defpackage.cpn cpnVarA = cqwVar.a();
                        if (defpackage.cdh.u(cpoVar)) {
                            awuVar = new ata(cpnVarA, cpoVar, cqdVar, 1);
                        } else {
                            defpackage.cpx cpxVarA2 = aouVar.a();
                            defpackage.cpx cpxVar2 = aouVar.f;
                            if (cpxVar2 == null) {
                                cpxVar2 = new defpackage.cpx((byte[]) null);
                                aouVar.f = cpxVar2;
                            }
                            aooq aooqVar2 = new aooq();
                            aooqVar2.a = Float.NaN;
                            awuVar = new afnl(cpnVarA, aooqVar2, new defpackage.aoot(), cpxVarA2, cpxVar2, cpoVar, cqdVar, 1);
                        }
                    } else {
                        if (!(cqxVarA instanceof defpackage.cqv)) {
                            throw new defpackage.aois();
                        }
                        awuVar = new awu(((defpackage.cqv) cqxVarA).a, cqdVar, 1);
                    }
                }
                aouVar.e = awuVar;
            }
            defpackage.aonn aonnVar = aouVar.e;
            if (aonnVar == null) {
                defpackage.aooh.g();
            }
            aonnVar.a(dbmVar, java.lang.Float.valueOf(f));
        }
    }

    @Override // defpackage.cmv
    public final void u() {
        defpackage.cso csoVar = this.a;
        if (csoVar != null) {
            ((defpackage.deg) defpackage.cfo.C(this)).N.k(csoVar);
            this.a = null;
        }
        this.f = null;
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
    public final boolean y() {
        return false;
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }
}
