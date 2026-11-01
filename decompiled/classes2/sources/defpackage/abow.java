package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abow implements defpackage.asp, dpf {
    public boolean a;
    public boolean b;
    public final apdp c = new apdp();
    private final /* synthetic */ dpf d;

    public abow(dpf dpfVar) {
        this.d = dpfVar;
    }

    public final float a() {
        return this.d.a();
    }

    public final float b() {
        return this.d.b();
    }

    public final float dh(long j) {
        return dfd.m(this.d, j);
    }

    public final float di(float f) {
        return (f / this.d.a()) + 0.0f;
    }

    public final float dj(int i) {
        return this.d.dj(i);
    }

    public final float dk(long j) {
        return dfd.o(this.d, j);
    }

    public final float dl(float f) {
        return f * this.d.a();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m13do(long j) {
        throw null;
    }

    public final int dp(float f) {
        return dfd.p(this.d, f);
    }

    public final long dq(long j) {
        return dfd.q(this.d, j);
    }

    public final long dr(long j) {
        return dfd.r(this.d, j);
    }

    public final long ds(float f) {
        return dfd.n(this.d, f);
    }

    public final long dt(float f) {
        return this.d.dt(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.asp
    public final java.lang.Object n(aoln aolnVar) {
        defpackage.abov abovVar;
        if (aolnVar instanceof defpackage.abov) {
            abovVar = (defpackage.abov) aolnVar;
            int i = abovVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abovVar.c = i - Integer.MIN_VALUE;
            } else {
                abovVar = new defpackage.abov(this, aolnVar);
            }
        } else {
            abovVar = new defpackage.abov(this, aolnVar);
        }
        java.lang.Object obj = abovVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abovVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!this.a && !this.b) {
                apdp apdpVar = this.c;
                abovVar.c = 1;
                if (apdpVar.b(abovVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(this.a);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(obj);
        this.c.d();
        return java.lang.Boolean.valueOf(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(aoln aolnVar) {
        defpackage.abou abouVar;
        if (aolnVar instanceof defpackage.abou) {
            abouVar = (defpackage.abou) aolnVar;
            int i = abouVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abouVar.c = i - Integer.MIN_VALUE;
            } else {
                abouVar = new defpackage.abou(this, aolnVar);
            }
        } else {
            abouVar = new defpackage.abou(this, aolnVar);
        }
        java.lang.Object obj = abouVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abouVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar = this.c;
            abouVar.c = 1;
            if (apdpVar.b(abouVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        this.a = false;
        this.b = false;
        return aojh.a;
    }
}
