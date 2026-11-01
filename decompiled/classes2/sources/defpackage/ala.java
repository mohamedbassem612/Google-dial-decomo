package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ala implements defpackage.ain {
    public java.lang.Object a;
    public java.lang.Object b;
    private final defpackage.alp c;
    private aiw d;
    private aiw e;
    private final aiw f;
    private long g;
    private aiw h;
    private final nf i;

    /* JADX WARN: Type inference failed for: r1v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aonj, java.lang.Object] */
    public ala(aiq aiqVar, nf nfVar, java.lang.Object obj, java.lang.Object obj2, aiw aiwVar) {
        this.c = aiqVar.a(nfVar);
        this.i = nfVar;
        this.a = obj2;
        this.b = obj;
        this.d = (aiw) nfVar.a.a(obj);
        this.e = (aiw) nfVar.a.a(obj2);
        this.f = aiwVar != null ? den.bq(aiwVar) : ((aiw) nfVar.a.a(obj)).c();
        this.g = -1L;
    }

    @Override // defpackage.ain
    public final long a() {
        long j = this.g;
        if (j >= 0) {
            return j;
        }
        long jA = this.c.a(this.d, this.e, this.f);
        this.g = jA;
        return jA;
    }

    @Override // defpackage.ain
    public final aiw b(long j) {
        if (!defpackage.wo.a(this, j)) {
            return this.c.d(j, this.d, this.e, this.f);
        }
        aiw aiwVarB = this.h;
        if (aiwVarB == null) {
            aiwVarB = this.c.b(this.d, this.e, this.f);
            this.h = aiwVarB;
        }
        return aiwVarB;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [aonj, java.lang.Object] */
    @Override // defpackage.ain
    public final java.lang.Object c(long j) {
        if (defpackage.wo.a(this, j)) {
            return this.a;
        }
        aiw aiwVarC = this.c.c(j, this.d, this.e, this.f);
        int iB = aiwVarC.b();
        for (int i = 0; i < iB; i++) {
            if (java.lang.Float.isNaN(aiwVarC.a(i))) {
                defpackage.akf.b("AnimationVector cannot contain a NaN. " + aiwVarC + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.i.b.a(aiwVarC);
    }

    @Override // defpackage.ain
    public final /* synthetic */ boolean d(long j) {
        return defpackage.wo.a(this, j);
    }

    @Override // defpackage.ain
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ain
    public final nf g() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aonj, java.lang.Object] */
    public final void h(java.lang.Object obj) {
        if (aooh.n(obj, this.b)) {
            return;
        }
        this.b = obj;
        this.d = (aiw) this.i.a.a(obj);
        this.h = null;
        this.g = -1L;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aonj, java.lang.Object] */
    public final void i(java.lang.Object obj) {
        if (aooh.n(this.a, obj)) {
            return;
        }
        this.a = obj;
        this.e = (aiw) this.i.a.a(obj);
        this.h = null;
        this.g = -1L;
    }

    public final java.lang.String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.f + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    @Override // defpackage.ain
    public final void f() {
    }
}
