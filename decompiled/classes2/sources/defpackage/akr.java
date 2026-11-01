package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class akr extends all {
    public static final ais a = new ais(0.0f);
    public java.lang.Object b;
    public alg c;
    public long d;
    public aosb e;
    public long f;
    public defpackage.akh g;
    public final aonj h;
    public float i;
    public final apdp j;
    public final adq k;
    private final ccp l;
    private final ccp m;
    private final aomy n;
    private clk o;
    private final aonj p;
    private final ceg q;
    private final nf r;

    public akr(java.lang.Object obj) {
        cdu cduVar = cdu.c;
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        this.m = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        this.b = obj;
        this.n = new defpackage.mq(this, 5);
        this.q = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.j = new apdp();
        this.r = new nf((byte[]) null);
        this.f = Long.MIN_VALUE;
        this.k = new adq(16);
        this.h = new agb(this, 7);
        this.p = new agb(this, 8);
    }

    public static final void u(defpackage.akh akhVar, long j) {
        long j2 = akhVar.a + j;
        akhVar.a = j2;
        long j3 = akhVar.h;
        float fS = 1.0f;
        if (j3 > 0 && j2 < j3) {
            defpackage.alp alpVar = akhVar.b;
            float f = j2 / j3;
            float fA = (akhVar.e.a(0) * (1.0f - f)) + f;
            if (!java.lang.Float.isNaN(fA)) {
                fS = aooc.s(fA, 0.0f, 1.0f);
            }
        }
        akhVar.d = fS;
    }

    public final java.lang.Object a() {
        return this.m.a();
    }

    public final java.lang.Object b() {
        return this.l.a();
    }

    public final void c(java.lang.Object obj) {
        this.m.b(obj);
    }

    public final void d(alg algVar) {
        alg algVar2 = this.c;
        if (algVar2 != null && !aooh.n(algVar, algVar2)) {
            defpackage.akf.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.c + ", new instance: " + algVar);
        }
        this.c = algVar;
    }

    public final void e() {
        this.c = null;
        clk clkVar = this.o;
        if (clkVar != null) {
            clkVar.b(this);
        }
    }

    public final float f() {
        return this.q.c();
    }

    public final java.lang.Object g(aoln aolnVar) {
        float fA = defpackage.wx.a(aolnVar.u());
        if (fA <= 0.0f || java.lang.Float.isNaN(fA)) {
            m();
            return aojh.a;
        }
        this.i = fA;
        if (this.f == Long.MIN_VALUE) {
            java.lang.Object objA = cdh.d(aolnVar.u()).a(this.h, aolnVar);
            if (objA == aolu.a) {
                return objA;
            }
        } else {
            java.lang.Object objA2 = cdh.d(aolnVar.u()).a(this.p, aolnVar);
            if (objA2 == aolu.a) {
                return objA2;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.akj akjVar;
        float fA;
        if (aolnVar instanceof defpackage.akj) {
            akjVar = (defpackage.akj) aolnVar;
            int i = akjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                akjVar.d = i - Integer.MIN_VALUE;
            } else {
                akjVar = new defpackage.akj(this, aolnVar);
            }
        } else {
            akjVar = new defpackage.akj(this, aolnVar);
        }
        java.lang.Object obj = akjVar.b;
        aolu aoluVar = aolu.a;
        int i2 = akjVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            if (this.k.f() && this.g == null) {
                return aojh.a;
            }
            fA = defpackage.wx.a(akjVar.u());
            if (fA <= 0.0f || java.lang.Float.isNaN(fA)) {
                m();
                this.f = Long.MIN_VALUE;
                return aojh.a;
            }
            if (this.f == Long.MIN_VALUE) {
                aonj aonjVar = this.h;
                akjVar.a = fA;
                akjVar.d = 1;
                if (cdh.d(akjVar.u()).a(aonjVar, akjVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fA = akjVar.a;
            aooc.af(obj);
        }
        do {
            if (!this.k.g() && this.g == null) {
                this.f = Long.MIN_VALUE;
                return aojh.a;
            }
            akjVar.a = fA;
            akjVar.d = 2;
        } while (g(akjVar) != aoluVar);
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(float f, java.lang.Object obj, aoln aolnVar) {
        defpackage.akk akkVar;
        if (aolnVar instanceof defpackage.akk) {
            akkVar = (defpackage.akk) aolnVar;
            int i = akkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akkVar.c = i - Integer.MIN_VALUE;
            } else {
                akkVar = new defpackage.akk(this, aolnVar);
            }
        } else {
            akkVar = new defpackage.akk(this, aolnVar);
        }
        java.lang.Object obj2 = akkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = akkVar.c;
        if (i2 == 0) {
            aooc.af(obj2);
            if (f < 0.0f || f > 1.0f) {
                defpackage.akf.a("Expecting fraction between 0 and 1. Got " + f);
            }
            alg algVar = this.c;
            if (algVar != null) {
                java.lang.Object objB = b();
                nf nfVar = this.r;
                defpackage.akm akmVar = new defpackage.akm(obj, objB, this, algVar, f, null);
                akkVar.c = 1;
                if (nfVar.g(defpackage.akd.a, akmVar, akkVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj2);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.Object obj, aoln aolnVar) {
        defpackage.akn aknVar;
        if (aolnVar instanceof defpackage.akn) {
            aknVar = (defpackage.akn) aolnVar;
            int i = aknVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aknVar.c = i - Integer.MIN_VALUE;
            } else {
                aknVar = new defpackage.akn(this, aolnVar);
            }
        } else {
            aknVar = new defpackage.akn(this, aolnVar);
        }
        java.lang.Object obj2 = aknVar.a;
        aolu aoluVar = aolu.a;
        int i2 = aknVar.c;
        if (i2 == 0) {
            aooc.af(obj2);
            alg algVar = this.c;
            if (algVar != null && (!aooh.n(a(), obj) || !aooh.n(b(), obj))) {
                nf nfVar = this.r;
                defpackage.ako akoVar = new defpackage.ako(this, obj, algVar, (aoln) null, 0);
                aknVar.c = 1;
                if (nfVar.g(defpackage.akd.a, akoVar, aknVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj2);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(aoln aolnVar) {
        defpackage.akp akpVar;
        java.lang.Object objB;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.akp) {
            akpVar = (defpackage.akp) aolnVar;
            int i = akpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                akpVar.d = i - Integer.MIN_VALUE;
            } else {
                akpVar = new defpackage.akp(this, aolnVar);
            }
        } else {
            akpVar = new defpackage.akp(this, aolnVar);
        }
        java.lang.Object obj2 = akpVar.b;
        aolu aoluVar = aolu.a;
        int i2 = akpVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj3 = akpVar.a;
                aooc.af(obj2);
                objB = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = akpVar.a;
                aooc.af(obj2);
            }
            if (aooh.n(obj2, obj)) {
                return aojh.a;
            }
            this.f = Long.MIN_VALUE;
            throw new java.util.concurrent.CancellationException("targetState while waiting for composition");
        }
        aooc.af(obj2);
        objB = b();
        apdp apdpVar = this.j;
        akpVar.a = objB;
        akpVar.d = 1;
        if (apdpVar.b(akpVar) == aoluVar) {
            return aoluVar;
        }
        akpVar.a = objB;
        akpVar.d = 2;
        aosc aoscVar = new aosc(ajsz.ap(akpVar), 1);
        aoscVar.z();
        this.e = aoscVar;
        this.j.d();
        java.lang.Object objK = aoscVar.k();
        if (objK == aoluVar) {
            return aoluVar;
        }
        obj = objB;
        obj2 = objK;
        if (aooh.n(obj2, obj)) {
            return aojh.a;
        }
        this.f = Long.MIN_VALUE;
        throw new java.util.concurrent.CancellationException("targetState while waiting for composition");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(aoln aolnVar) {
        defpackage.akq akqVar;
        java.lang.Object objB;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.akq) {
            akqVar = (defpackage.akq) aolnVar;
            int i = akqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                akqVar.d = i - Integer.MIN_VALUE;
            } else {
                akqVar = new defpackage.akq(this, aolnVar);
            }
        } else {
            akqVar = new defpackage.akq(this, aolnVar);
        }
        java.lang.Object obj2 = akqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = akqVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj3 = akqVar.a;
                aooc.af(obj2);
                objB = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = akqVar.a;
                aooc.af(obj2);
            }
            if (!aooh.n(obj2, obj)) {
                this.f = Long.MIN_VALUE;
                throw new java.util.concurrent.CancellationException(a.bi(obj, obj2, "snapTo() was canceled because state was changed to ", " instead of "));
            }
            return aojh.a;
        }
        aooc.af(obj2);
        objB = b();
        apdp apdpVar = this.j;
        akqVar.a = objB;
        akqVar.d = 1;
        if (apdpVar.b(akqVar) == aoluVar) {
            return aoluVar;
        }
        if (aooh.n(objB, this.b)) {
            this.j.d();
        } else {
            akqVar.a = objB;
            akqVar.d = 2;
            aosc aoscVar = new aosc(ajsz.ap(akqVar), 1);
            aoscVar.z();
            this.e = aoscVar;
            this.j.d();
            java.lang.Object objK = aoscVar.k();
            if (objK == aoluVar) {
                return aoluVar;
            }
            obj = objB;
            obj2 = objK;
            if (!aooh.n(obj2, obj)) {
                this.f = Long.MIN_VALUE;
                throw new java.util.concurrent.CancellationException(a.bi(obj, obj2, "snapTo() was canceled because state was changed to ", " instead of "));
            }
        }
        return aojh.a;
    }

    public final void m() {
        alg algVar = this.c;
        if (algVar != null) {
            algVar.j();
        }
        this.k.l();
        if (this.g != null) {
            this.g = null;
            q(1.0f);
            p();
        }
    }

    public final void n() {
        alg algVar = this.c;
        if (algVar != null) {
            defpackage.akh akhVar = this.g;
            if (akhVar == null) {
                if (this.d <= 0 || f() == 1.0f || aooh.n(a(), b())) {
                    akhVar = null;
                } else {
                    akhVar = new defpackage.akh();
                    akhVar.d = f();
                    long j = this.d;
                    akhVar.g = j;
                    akhVar.h = aopc.j(j * (1.0d - ((double) f())));
                    akhVar.e.e(0, f());
                }
            }
            if (akhVar != null) {
                akhVar.g = this.d;
                this.k.q(akhVar);
                algVar.r(akhVar);
            }
            this.g = null;
        }
    }

    public final void o() {
        clk clkVar = this.o;
        if (clkVar != null) {
            clkVar.c(this, alk.a, this.n);
        }
    }

    public final void p() {
        alg algVar = this.c;
        if (algVar != null) {
            algVar.q(aopc.j(((double) f()) * algVar.d()));
        }
    }

    public final void q(float f) {
        this.q.h(f);
    }

    public final void r(clk clkVar) {
        if (aooh.n(this.o, clkVar)) {
            return;
        }
        clk clkVar2 = this.o;
        if (clkVar2 != null) {
            clkVar2.b(this);
        }
        clk clkVar3 = this.o;
        if (clkVar3 != null) {
            clkVar3.e();
        }
        this.o = clkVar;
        if (clkVar != null) {
            clkVar.d();
        }
        o();
    }

    public final void s(java.lang.Object obj) {
        this.l.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(java.lang.Object obj, aoln aolnVar) {
        defpackage.aki akiVar;
        if (aolnVar instanceof defpackage.aki) {
            akiVar = (defpackage.aki) aolnVar;
            int i = akiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akiVar.c = i - Integer.MIN_VALUE;
            } else {
                akiVar = new defpackage.aki(this, aolnVar);
            }
        } else {
            akiVar = new defpackage.aki(this, aolnVar);
        }
        java.lang.Object obj2 = akiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = akiVar.c;
        if (i2 == 0) {
            aooc.af(obj2);
            alg algVar = this.c;
            if (algVar != null) {
                nf nfVar = this.r;
                defpackage.ako akoVar = new defpackage.ako(this, obj, algVar, null, 1, null);
                akiVar.c = 1;
                if (nfVar.g(defpackage.akd.a, akoVar, akiVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj2);
        }
        return aojh.a;
    }
}
