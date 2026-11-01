package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csv extends defpackage.ctt {
    public long b;
    public java.util.List c;
    public boolean d;
    public defpackage.aonj e;
    public java.lang.String f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    private float[] o;
    private final defpackage.aonj q;
    private defpackage.cpx r;
    private final java.util.List p = new java.util.ArrayList();
    public boolean a = true;

    public csv() {
        float[] fArr = defpackage.crp.a;
        this.b = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        this.c = defpackage.cty.a;
        this.d = true;
        this.q = new defpackage.clc(this, 6);
        this.f = "";
        this.j = 1.0f;
        this.k = 1.0f;
        this.n = true;
    }

    private final void g() {
        this.a = false;
        float[] fArr = defpackage.crp.a;
        this.b = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
    }

    private final void h(defpackage.cqd cqdVar) {
        if (!this.a || cqdVar == null) {
            return;
        }
        if (cqdVar instanceof defpackage.crf) {
            i(((defpackage.crf) cqdVar).a);
        } else {
            g();
        }
    }

    private final void i(long j) {
        if (!this.a || j == 16) {
            return;
        }
        long j2 = this.b;
        if (j2 == 16) {
            this.b = j;
        } else {
            if (defpackage.cqg.d(j2) == defpackage.cqg.d(j) && defpackage.cqg.c(j2) == defpackage.cqg.c(j) && defpackage.cqg.b(j2) == defpackage.cqg.b(j)) {
                return;
            }
            g();
        }
    }

    private final boolean j() {
        return !this.c.isEmpty();
    }

    @Override // defpackage.ctt
    public final defpackage.aonj a() {
        return this.e;
    }

    @Override // defpackage.ctt
    public final void b(defpackage.csj csjVar) {
        if (this.n) {
            float[] fArrE = this.o;
            if (fArrE == null) {
                fArrE = defpackage.cqt.e();
                this.o = fArrE;
            } else {
                defpackage.cqt.c(fArrE);
            }
            defpackage.cqt.h(fArrE, this.l + this.h, this.m + this.i);
            defpackage.cqt.d(fArrE, this.g);
            defpackage.cqt.g(fArrE, this.j, this.k);
            defpackage.cqt.h(fArrE, -this.h, -this.i);
            this.n = false;
        }
        if (this.d) {
            if (j()) {
                defpackage.cpx cpxVar = this.r;
                if (cpxVar == null) {
                    cpxVar = new defpackage.cpx((byte[]) null);
                    this.r = cpxVar;
                }
                defpackage.sl.g(this.c, cpxVar);
            }
            this.d = false;
        }
        defpackage.csg csgVarQ = csjVar.q();
        long jA = csgVarQ.a();
        csgVarQ.b().g();
        try {
            defpackage.apnt apntVar = csgVarQ.c;
            float[] fArr = this.o;
            if (fArr != null) {
                ((defpackage.csg) apntVar.a).b().b(new defpackage.cqt(fArr).a);
            }
            defpackage.cpx cpxVar2 = this.r;
            if (j() && cpxVar2 != null) {
                apntVar.t(cpxVar2);
            }
            java.util.List list = this.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.ctt) list.get(i)).b(csjVar);
            }
        } finally {
            csgVarQ.b().e();
            csgVarQ.h(jA);
        }
    }

    public final void c(int i, defpackage.ctt cttVar) {
        java.util.List list = this.p;
        if (i < list.size()) {
            list.set(i, cttVar);
        } else {
            list.add(cttVar);
        }
        d(cttVar);
        cttVar.e(this.q);
        f();
    }

    public final void d(defpackage.ctt cttVar) {
        if (cttVar instanceof defpackage.csy) {
            defpackage.csy csyVar = (defpackage.csy) cttVar;
            h(csyVar.a);
            h(csyVar.f);
        } else if (cttVar instanceof defpackage.csv) {
            defpackage.csv csvVar = (defpackage.csv) cttVar;
            if (csvVar.a && this.a) {
                i(csvVar.b);
            } else {
                g();
            }
        }
    }

    @Override // defpackage.ctt
    public final void e(defpackage.aonj aonjVar) {
        this.e = aonjVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VGroup: ");
        sb.append(this.f);
        java.util.List list = this.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.ctt cttVar = (defpackage.ctt) list.get(i);
            sb.append('\t');
            sb.append(cttVar.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
