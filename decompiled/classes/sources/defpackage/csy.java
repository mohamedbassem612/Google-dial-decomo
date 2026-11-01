package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csy extends defpackage.ctt {
    public defpackage.cqd a;
    public float e;
    public defpackage.cqd f;
    public float j;
    public float l;
    public boolean o;
    public defpackage.cpx p;
    private defpackage.csm q;
    private final defpackage.aoir r;
    private final defpackage.cpx s;
    private defpackage.cpx t;
    public float b = 1.0f;
    public java.util.List c = defpackage.cty.a;
    public float d = 1.0f;
    public int g = 0;
    public int h = 0;
    public float i = 4.0f;
    public float k = 1.0f;
    public boolean m = true;
    public boolean n = true;

    public csy() {
        defpackage.cpx cpxVar = new defpackage.cpx((byte[]) null);
        this.s = cpxVar;
        this.p = cpxVar;
        this.r = defpackage.aooc.ah(3, new bmt(6));
    }

    private final void c() {
        if (this.j == 0.0f && this.k == 1.0f) {
            this.p = this.s;
            return;
        }
        defpackage.cpx cpxVar = this.p;
        defpackage.cpx cpxVar2 = this.s;
        if (defpackage.aooh.n(cpxVar, cpxVar2)) {
            this.p = new defpackage.cpx((byte[]) null);
        } else {
            int iA = this.p.a();
            this.p.l();
            this.p.m(iA);
        }
        d().c(cpxVar2, false);
        float fB = d().b();
        float f = this.j;
        float f2 = this.l;
        float f3 = ((f + f2) % 1.0f) * fB;
        float f4 = ((this.k + f2) % 1.0f) * fB;
        if (f3 <= f4) {
            d().d(f3, f4, this.p);
            return;
        }
        defpackage.cpx cpxVar3 = this.t;
        if (cpxVar3 == null) {
            cpxVar3 = new defpackage.cpx((byte[]) null);
            this.t = cpxVar3;
        }
        cpxVar3.k();
        d().d(f3, fB, cpxVar3);
        this.p.s(cpxVar3);
        cpxVar3.k();
        d().d(0.0f, f4, cpxVar3);
        this.p.s(cpxVar3);
    }

    private final ni d() {
        return (ni) this.r.a();
    }

    @Override // defpackage.ctt
    public final void b(defpackage.csj csjVar) {
        defpackage.csj csjVar2;
        defpackage.csm csmVar;
        if (this.m) {
            defpackage.sl.g(this.c, this.s);
            c();
        } else if (this.o) {
            c();
        }
        this.m = false;
        this.o = false;
        defpackage.cqd cqdVar = this.a;
        if (cqdVar != null) {
            csjVar2 = csjVar;
            defpackage.den.T(csjVar2, this.p, cqdVar, this.b, null, 56);
        } else {
            csjVar2 = csjVar;
        }
        defpackage.cqd cqdVar2 = this.f;
        if (cqdVar2 != null) {
            defpackage.csm csmVar2 = this.q;
            if (this.n || csmVar2 == null) {
                defpackage.csm csmVar3 = new defpackage.csm(this.e, this.i, this.g, this.h, 16);
                this.q = csmVar3;
                this.n = false;
                csmVar = csmVar3;
            } else {
                csmVar = csmVar2;
            }
            defpackage.den.T(csjVar2, this.p, cqdVar2, this.d, csmVar, 48);
        }
    }

    public final java.lang.String toString() {
        return this.s.toString();
    }
}
