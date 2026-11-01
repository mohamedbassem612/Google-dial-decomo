package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amr extends defpackage.cmv implements defpackage.dat, defpackage.dcp, defpackage.ddc {
    public long a;
    public defpackage.cqd b;
    public defpackage.crd d;
    public defpackage.cqx e;
    private defpackage.dpq g;
    private defpackage.cqx h;
    private defpackage.crd i;
    public float c = 1.0f;
    private long f = 9205357640488583168L;

    public amr(long j, defpackage.cqd cqdVar, defpackage.crd crdVar) {
        this.a = j;
        this.b = cqdVar;
        this.d = crdVar;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.U, this.d);
        diqVar.a(defpackage.din.T, new defpackage.bpb(this, 1));
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        defpackage.dbm dbmVar2;
        defpackage.cqx cqxVar;
        int i;
        defpackage.cqd cqdVar;
        defpackage.cpx cpxVar;
        if (this.d == defpackage.cqz.a) {
            long j = this.a;
            float[] fArr = defpackage.crp.a;
            if (j != defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u)) {
                defpackage.den.J(dbmVar, this.a, 0L, 0.0f, null, 126);
            }
            defpackage.cqd cqdVar2 = this.b;
            if (cqdVar2 != null) {
                defpackage.den.P(dbmVar, cqdVar2, 0L, 0L, this.c, null, 0, 118);
            }
        } else {
            if (dbmVar.o() == this.f && dbmVar.p() == this.g && defpackage.aooh.n(this.i, this.d)) {
                cqxVar = this.h;
                if (cqxVar == null) {
                    defpackage.aooh.g();
                }
                dbmVar2 = dbmVar;
            } else {
                dbmVar2 = dbmVar;
                defpackage.den.u(this, new defpackage.bev(this, dbmVar2, 1, null));
                cqxVar = this.e;
                this.e = null;
            }
            defpackage.cqx cqxVar2 = cqxVar;
            this.h = cqxVar2;
            this.f = dbmVar2.o();
            this.g = dbmVar2.p();
            this.i = this.d;
            if (cqxVar2 == null) {
                defpackage.aooh.g();
            }
            long j2 = this.a;
            float[] fArr2 = defpackage.crp.a;
            if (j2 != defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u)) {
                defpackage.cfd.H(dbmVar, cqxVar2, this.a, 0.0f, 60);
            }
            defpackage.cqd cqdVar3 = this.b;
            if (cqdVar3 != null) {
                float f = this.c;
                boolean z = cqxVar2 instanceof defpackage.cqv;
                defpackage.csl cslVar = defpackage.csl.a;
                if (z) {
                    defpackage.cpn cpnVar = ((defpackage.cqv) cqxVar2).a;
                    dbmVar.t(cqdVar3, defpackage.cfd.F(cpnVar), defpackage.cfd.D(cpnVar), f, cslVar, 3);
                } else {
                    if (cqxVar2 instanceof defpackage.cqw) {
                        defpackage.cqw cqwVar = (defpackage.cqw) cqxVar2;
                        cpxVar = cqwVar.b;
                        if (cpxVar != null) {
                            i = 3;
                            cqdVar = cqdVar3;
                        } else {
                            defpackage.cpo cpoVar = cqwVar.a;
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cpoVar.h >> 32));
                            dbmVar.w(cqdVar3, defpackage.cfd.G(cpoVar), defpackage.cfd.E(cpoVar), (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f, cslVar);
                        }
                    } else {
                        if (!(cqxVar2 instanceof defpackage.cqu)) {
                            throw new defpackage.aois();
                        }
                        defpackage.cpx cpxVar2 = ((defpackage.cqu) cqxVar2).a;
                        i = 3;
                        cqdVar = cqdVar3;
                        cpxVar = cpxVar2;
                    }
                    dbmVar.y(cpxVar, cqdVar, f, cslVar, i);
                }
            }
        }
        dbmVar.D();
    }

    @Override // defpackage.dcp
    public final void v() {
        this.f = 9205357640488583168L;
        this.g = null;
        this.h = null;
        this.i = null;
        defpackage.cfo.w(this);
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
