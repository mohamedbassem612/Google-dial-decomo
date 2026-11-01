package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahc {
    private final defpackage.aoir A;
    private final defpackage.aoir B;
    private final defpackage.aoir C;
    public final long b;
    public defpackage.cxi c;
    public long d;
    public float e;
    public float f;
    public long g;
    public long h;
    public float i;
    public long j;
    public float k;
    public float l;
    public long m;
    public long n;
    public long o;
    public float p;
    public float q;
    public long r;
    public long s;
    public defpackage.ais t;
    public defpackage.ait u;
    public oq v;
    public defpackage.den w;
    private final defpackage.aoir y;
    private final defpackage.aoir z;
    private final defpackage.ccp x = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.agp.a, defpackage.cdu.c);
    public final defpackage.ahy a = new defpackage.ahy();

    public ahc() {
        int i = defpackage.aork.a;
        this.b = defpackage.aork.a();
        this.d = defpackage.cfd.M(0);
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = defpackage.mni.bj(0.5f, 0.5f);
        this.h = 0L;
        this.i = 1.0f;
        this.j = 0L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = 0L;
        this.n = defpackage.cfd.M(0);
        this.o = defpackage.mni.bj(0.5f, 0.5f);
        this.p = 1.0f;
        this.q = 1.0f;
        this.r = defpackage.cfd.M(0);
        this.s = defpackage.mni.bj(0.5f, 0.5f);
        this.y = defpackage.aooc.ah(3, new defpackage.nu(5));
        this.z = defpackage.aooc.ah(3, new defpackage.nu(6));
        this.A = defpackage.aooc.ah(3, new defpackage.nu(7));
        this.B = defpackage.aooc.ah(3, new defpackage.nu(8));
        this.C = defpackage.aooc.ah(3, new defpackage.nu(9));
    }

    public final float a() {
        defpackage.ahy ahyVar = this.a;
        if (ahyVar.g()) {
            return ahyVar.b();
        }
        return 1.0f;
    }

    public final long b() {
        defpackage.ahy ahyVar = this.a;
        return ahyVar.h() ? ahyVar.c() : defpackage.mni.bj(0.5f, 0.5f);
    }

    public final defpackage.agp c() {
        return (defpackage.agp) this.x.a();
    }

    public final defpackage.aii d() {
        return (defpackage.aii) this.y.a();
    }

    public final defpackage.aii e() {
        return (defpackage.aii) this.z.a();
    }

    public final defpackage.aii f() {
        return (defpackage.aii) this.C.a();
    }

    public final defpackage.aii g() {
        return (defpackage.aii) this.B.a();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:49:0x0186  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.aoln aolnVar) {
        aha ahaVar;
        float f;
        float f2;
        long j;
        long j2;
        long j3;
        defpackage.aii aiiVarE;
        java.lang.Float f3;
        defpackage.aii aiiVar;
        defpackage.dpn dpnVar;
        defpackage.aii aiiVarG;
        defpackage.cqg cqgVar;
        defpackage.aii aiiVarF;
        defpackage.crg crgVar;
        defpackage.bpj bpjVar;
        if (aolnVar instanceof aha) {
            ahaVar = (aha) aolnVar;
            int i = ahaVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahaVar.h = i - Integer.MIN_VALUE;
            } else {
                ahaVar = new aha(this, aolnVar);
            }
        } else {
            ahaVar = new aha(this, aolnVar);
        }
        java.lang.Object obj = ahaVar.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        switch (ahaVar.h) {
            case 0:
                defpackage.aooc.af(obj);
                f = this.k;
                f2 = this.l;
                j = this.m;
                j2 = this.n;
                j3 = this.o;
                defpackage.ahy ahyVar = this.a;
                this.p = ahyVar.f() ? ahyVar.a() : 1.0f;
                this.q = ahyVar.g() ? ahyVar.b() : 1.0f;
                this.r = ahyVar.i() ? ahyVar.d() : defpackage.cfd.M(0);
                this.s = ahyVar.h() ? ahyVar.c() : defpackage.mni.bj(0.5f, 0.5f);
                defpackage.aii aiiVarD = d();
                java.lang.Float f4 = new java.lang.Float(f);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 1;
                if (aiiVarD.f(f4, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarE = e();
                f3 = new java.lang.Float(f2);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 2;
                if (aiiVarE.f(f3, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVar = (defpackage.aii) this.A.a();
                dpnVar = new defpackage.dpn(j);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 3;
                if (aiiVar.f(dpnVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarG = g();
                cqgVar = new defpackage.cqg(j2);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 4;
                if (aiiVarG.f(cqgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarF = f();
                crgVar = new defpackage.crg(j3);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 5;
                if (aiiVarF.f(crgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                if (c() == defpackage.agp.b) {
                    i(defpackage.agp.c);
                    bpjVar = new defpackage.bpj(this, (defpackage.aoln) null, 1);
                    ahaVar.a = f;
                    ahaVar.b = f2;
                    ahaVar.c = j;
                    ahaVar.d = j2;
                    ahaVar.e = j3;
                    ahaVar.h = 6;
                    if (defpackage.aosv.m(bpjVar, ahaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (c() == defpackage.agp.c) {
                        i(defpackage.agp.d);
                    }
                }
                return defpackage.aojh.a;
            case 1:
                j3 = ahaVar.e;
                j2 = ahaVar.d;
                j = ahaVar.c;
                f2 = ahaVar.b;
                f = ahaVar.a;
                defpackage.aooc.af(obj);
                aiiVarE = e();
                f3 = new java.lang.Float(f2);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 2;
                if (aiiVarE.f(f3, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVar = (defpackage.aii) this.A.a();
                dpnVar = new defpackage.dpn(j);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 3;
                if (aiiVar.f(dpnVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarG = g();
                cqgVar = new defpackage.cqg(j2);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 4;
                if (aiiVarG.f(cqgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarF = f();
                crgVar = new defpackage.crg(j3);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 5;
                if (aiiVarF.f(crgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                if (c() == defpackage.agp.b) {
                    i(defpackage.agp.c);
                    bpjVar = new defpackage.bpj(this, (defpackage.aoln) null, 1);
                    ahaVar.a = f;
                    ahaVar.b = f2;
                    ahaVar.c = j;
                    ahaVar.d = j2;
                    ahaVar.e = j3;
                    ahaVar.h = 6;
                    if (defpackage.aosv.m(bpjVar, ahaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (c() == defpackage.agp.c) {
                        i(defpackage.agp.d);
                    }
                }
                return defpackage.aojh.a;
            case 2:
                j3 = ahaVar.e;
                j2 = ahaVar.d;
                j = ahaVar.c;
                f2 = ahaVar.b;
                f = ahaVar.a;
                defpackage.aooc.af(obj);
                aiiVar = (defpackage.aii) this.A.a();
                dpnVar = new defpackage.dpn(j);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 3;
                if (aiiVar.f(dpnVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarG = g();
                cqgVar = new defpackage.cqg(j2);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 4;
                if (aiiVarG.f(cqgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarF = f();
                crgVar = new defpackage.crg(j3);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 5;
                if (aiiVarF.f(crgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                if (c() == defpackage.agp.b) {
                    i(defpackage.agp.c);
                    bpjVar = new defpackage.bpj(this, (defpackage.aoln) null, 1);
                    ahaVar.a = f;
                    ahaVar.b = f2;
                    ahaVar.c = j;
                    ahaVar.d = j2;
                    ahaVar.e = j3;
                    ahaVar.h = 6;
                    if (defpackage.aosv.m(bpjVar, ahaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (c() == defpackage.agp.c) {
                        i(defpackage.agp.d);
                    }
                }
                return defpackage.aojh.a;
            case 3:
                j3 = ahaVar.e;
                j2 = ahaVar.d;
                j = ahaVar.c;
                f2 = ahaVar.b;
                f = ahaVar.a;
                defpackage.aooc.af(obj);
                aiiVarG = g();
                cqgVar = new defpackage.cqg(j2);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 4;
                if (aiiVarG.f(cqgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                aiiVarF = f();
                crgVar = new defpackage.crg(j3);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 5;
                if (aiiVarF.f(crgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                if (c() == defpackage.agp.b) {
                    i(defpackage.agp.c);
                    bpjVar = new defpackage.bpj(this, (defpackage.aoln) null, 1);
                    ahaVar.a = f;
                    ahaVar.b = f2;
                    ahaVar.c = j;
                    ahaVar.d = j2;
                    ahaVar.e = j3;
                    ahaVar.h = 6;
                    if (defpackage.aosv.m(bpjVar, ahaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (c() == defpackage.agp.c) {
                        i(defpackage.agp.d);
                    }
                }
                return defpackage.aojh.a;
            case 4:
                j3 = ahaVar.e;
                j2 = ahaVar.d;
                j = ahaVar.c;
                f2 = ahaVar.b;
                f = ahaVar.a;
                defpackage.aooc.af(obj);
                aiiVarF = f();
                crgVar = new defpackage.crg(j3);
                ahaVar.a = f;
                ahaVar.b = f2;
                ahaVar.c = j;
                ahaVar.d = j2;
                ahaVar.e = j3;
                ahaVar.h = 5;
                if (aiiVarF.f(crgVar, ahaVar) == aoluVar) {
                    return aoluVar;
                }
                if (c() == defpackage.agp.b) {
                    i(defpackage.agp.c);
                    bpjVar = new defpackage.bpj(this, (defpackage.aoln) null, 1);
                    ahaVar.a = f;
                    ahaVar.b = f2;
                    ahaVar.c = j;
                    ahaVar.d = j2;
                    ahaVar.e = j3;
                    ahaVar.h = 6;
                    if (defpackage.aosv.m(bpjVar, ahaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (c() == defpackage.agp.c) {
                        i(defpackage.agp.d);
                    }
                }
                return defpackage.aojh.a;
            case 5:
                j3 = ahaVar.e;
                j2 = ahaVar.d;
                j = ahaVar.c;
                f2 = ahaVar.b;
                f = ahaVar.a;
                defpackage.aooc.af(obj);
                if (c() == defpackage.agp.b) {
                    i(defpackage.agp.c);
                    bpjVar = new defpackage.bpj(this, (defpackage.aoln) null, 1);
                    ahaVar.a = f;
                    ahaVar.b = f2;
                    ahaVar.c = j;
                    ahaVar.d = j2;
                    ahaVar.e = j3;
                    ahaVar.h = 6;
                    if (defpackage.aosv.m(bpjVar, ahaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (c() == defpackage.agp.c) {
                        i(defpackage.agp.d);
                    }
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(obj);
                if (c() == defpackage.agp.c) {
                    i(defpackage.agp.d);
                }
                return defpackage.aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void i(defpackage.agp agpVar) {
        this.x.b(agpVar);
    }

    public final boolean j() {
        return c() == defpackage.agp.e;
    }

    public final boolean k() {
        return c() == defpackage.agp.b || c() == defpackage.agp.c || c() == defpackage.agp.d;
    }

    public final void l(defpackage.den denVar) {
        this.w = denVar;
    }
}
