package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ass implements defpackage.asp, dpf {
    private final /* synthetic */ dpf a;
    private boolean b;
    private boolean c;
    private final apdp d = new apdp();

    public ass(dpf dpfVar) {
        this.a = dpfVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.b();
    }

    public final float dh(long j) {
        return dfd.m(this.a, j);
    }

    public final float di(float f) {
        return (f / this.a.a()) + 0.0f;
    }

    public final float dj(int i) {
        return this.a.dj(i);
    }

    public final float dk(long j) {
        return dfd.o(this.a, j);
    }

    public final float dl(float f) {
        return f * this.a.a();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m72do(long j) {
        throw null;
    }

    public final int dp(float f) {
        return dfd.p(this.a, f);
    }

    public final long dq(long j) {
        return dfd.q(this.a, j);
    }

    public final long dr(long j) {
        return dfd.r(this.a, j);
    }

    public final long ds(float f) {
        return dfd.n(this.a, f);
    }

    public final long dt(float f) {
        return this.a.dt(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.asp
    public final java.lang.Object n(aoln aolnVar) {
        defpackage.asr asrVar;
        if (aolnVar instanceof defpackage.asr) {
            asrVar = (defpackage.asr) aolnVar;
            int i = asrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                asrVar.c = i - Integer.MIN_VALUE;
            } else {
                asrVar = new defpackage.asr(this, aolnVar);
            }
        } else {
            asrVar = new defpackage.asr(this, aolnVar);
        }
        java.lang.Object obj = asrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = asrVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!this.b && !this.c) {
                apdp apdpVar = this.d;
                asrVar.c = 1;
                if (apdpVar.b(asrVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(this.b);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(obj);
        this.d.d();
        return java.lang.Boolean.valueOf(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(aoln aolnVar) {
        defpackage.asq asqVar;
        if (aolnVar instanceof defpackage.asq) {
            asqVar = (defpackage.asq) aolnVar;
            int i = asqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                asqVar.c = i - Integer.MIN_VALUE;
            } else {
                asqVar = new defpackage.asq(this, aolnVar);
            }
        } else {
            asqVar = new defpackage.asq(this, aolnVar);
        }
        java.lang.Object obj = asqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = asqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar = this.d;
            asqVar.c = 1;
            if (apdpVar.b(asqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        this.b = false;
        this.c = false;
        return aojh.a;
    }

    public final void p() {
        this.c = true;
        apdp apdpVar = this.d;
        if (apdpVar.a()) {
            apdpVar.d();
        }
    }

    public final void q() {
        this.b = true;
        apdp apdpVar = this.d;
        if (apdpVar.a()) {
            apdpVar.d();
        }
    }
}
