package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cwc implements defpackage.dpf, defpackage.aoln {
    public defpackage.aosb a;
    final /* synthetic */ defpackage.cwd b;
    private final /* synthetic */ defpackage.cwd c;
    private final defpackage.aoln d;
    private cvg e = cvg.b;
    private final defpackage.aolr f = defpackage.aols.a;

    public cwc(defpackage.cwd cwdVar, defpackage.aoln aolnVar) {
        this.b = cwdVar;
        this.c = cwdVar;
        this.d = aolnVar;
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.c.a();
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.c.b();
    }

    @Override // defpackage.dpl
    public final float dh(long j) {
        return defpackage.dfd.m(this.c, j);
    }

    @Override // defpackage.dpf
    public final float di(float f) {
        return (f / this.c.a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final float dj(int i) {
        return (i / this.c.a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final float dk(long j) {
        return defpackage.dfd.o(this.c, j);
    }

    @Override // defpackage.dpf
    public final float dl(float f) {
        return f * this.c.a();
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final int mo1do(long j) {
        throw null;
    }

    @Override // defpackage.dpf
    public final int dp(float f) {
        return defpackage.dfd.p(this.c, f);
    }

    @Override // defpackage.dpf
    public final long dq(long j) {
        return defpackage.dfd.q(this.c, j);
    }

    @Override // defpackage.dpf
    public final long dr(long j) {
        return defpackage.dfd.r(this.c, j);
    }

    @Override // defpackage.dpl
    public final long ds(float f) {
        return defpackage.dfd.n(this.c, f);
    }

    @Override // defpackage.dpf
    public final long dt(float f) {
        defpackage.cwd cwdVar = this.c;
        return defpackage.dfd.n(cwdVar, (f / cwdVar.a()) + 0.0f);
    }

    public final long n() {
        defpackage.cwd cwdVar = this.b;
        long jR = defpackage.dfd.r(cwdVar, cwdVar.r().e());
        long j = cwdVar.h;
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jR >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jR & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final long o() {
        return this.b.h;
    }

    public final defpackage.cvf p() {
        return this.b.e;
    }

    public final defpackage.dgk q() {
        return this.b.r();
    }

    public final java.lang.Object r(cvg cvgVar, defpackage.aoln aolnVar) {
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
        aoscVar.z();
        this.e = cvgVar;
        this.a = aoscVar;
        return aoscVar.k();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [aoub] */
    /* JADX WARN: Type inference failed for: r10v4, types: [aoub] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [aonn] */
    public final java.lang.Object s(long j, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        cwa cwaVar;
        defpackage.aosb aosbVar;
        if (aolnVar instanceof cwa) {
            cwaVar = (cwa) aolnVar;
            int i = cwaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cwaVar.d = i - Integer.MIN_VALUE;
            } else {
                cwaVar = new cwa((defpackage.cwc) this, aolnVar);
            }
        } else {
            cwaVar = new cwa((defpackage.cwc) this, aolnVar);
        }
        java.lang.Object objA = cwaVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cwaVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objA);
                if (j <= 0 && (aosbVar = this.a) != null) {
                    aosbVar.w(defpackage.aooc.ae(new defpackage.cvh(j)));
                }
                defpackage.aoub aoubVarAn = defpackage.aoov.an(this.b.M(), null, 0, new atg(j, (defpackage.cwc) this, (defpackage.aoln) null, 4), 3);
                cwaVar.a = aoubVarAn;
                cwaVar.d = 1;
                objA = aonnVar.a(this, cwaVar);
                this = aoubVarAn;
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj = cwaVar.a;
                defpackage.aooc.af(objA);
                this = obj;
            }
            this.s(cux.a);
            return objA;
        } catch (java.lang.Throwable th) {
            this.s(cux.a);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(long j, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        cwb cwbVar;
        if (aolnVar instanceof cwb) {
            cwbVar = (cwb) aolnVar;
            int i = cwbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cwbVar.c = i - Integer.MIN_VALUE;
            } else {
                cwbVar = new cwb(this, aolnVar);
            }
        } else {
            cwbVar = new cwb(this, aolnVar);
        }
        java.lang.Object objS = cwbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cwbVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objS);
                cwbVar.c = 1;
                objS = s(j, aonnVar, cwbVar);
                if (objS == aoluVar) {
                    objS = aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objS);
            }
            return objS;
        } catch (defpackage.cvh unused) {
            return null;
        }
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return this.f;
    }

    public final void v(defpackage.cvf cvfVar, cvg cvgVar) {
        defpackage.aosb aosbVar;
        if (cvgVar != this.e || (aosbVar = this.a) == null) {
            return;
        }
        this.a = null;
        aosbVar.w(cvfVar);
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) {
        defpackage.cwd cwdVar = this.b;
        synchronized (cwdVar.g) {
            cwdVar.f.m(this);
        }
        this.d.w(obj);
    }
}
