package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajc implements defpackage.ain {
    private final java.lang.Object a;
    private final aiw b;
    private final aiw c;
    private final aiw d;
    private final java.lang.Object e;
    private final long f;
    private final defpackage.alv g;
    private final nf h;

    /* JADX WARN: Type inference failed for: r0v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aonj, java.lang.Object] */
    public ajc(kaw kawVar, nf nfVar, java.lang.Object obj, aiw aiwVar) {
        defpackage.alv alvVarAy = kawVar.ay();
        this.g = alvVarAy;
        this.h = nfVar;
        this.a = obj;
        aiw aiwVar2 = (aiw) nfVar.a.a(obj);
        this.b = aiwVar2;
        this.c = den.bq(aiwVar);
        this.e = nfVar.b.a(alvVarAy.a(aiwVar2, aiwVar));
        if (alvVarAy.c == null) {
            alvVarAy.c = aiwVar2.c();
        }
        aiw aiwVar3 = alvVarAy.c;
        if (aiwVar3 == null) {
            aooh.j("velocityVector");
            aiwVar3 = null;
        }
        int iB = aiwVar3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            ajn ajnVar = alvVarAy.a;
            aiwVar2.a(i);
            jMax = java.lang.Math.max(jMax, ajnVar.d(aiwVar.a(i)));
        }
        this.f = jMax;
        aiw aiwVarBq = den.bq(this.g.b(jMax, this.b, aiwVar));
        this.d = aiwVarBq;
        int iB2 = aiwVarBq.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            aiw aiwVar4 = this.d;
            float fA = aiwVar4.a(i2);
            float f = this.g.d;
            aiwVar4.e(i2, aooc.s(fA, -f, f));
        }
    }

    @Override // defpackage.ain
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ain
    public final aiw b(long j) {
        return !defpackage.wo.a(this, j) ? this.g.b(j, this.b, this.c) : this.d;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [aonj, java.lang.Object] */
    @Override // defpackage.ain
    public final java.lang.Object c(long j) {
        if (defpackage.wo.a(this, j)) {
            return this.e;
        }
        nf nfVar = this.h;
        defpackage.alv alvVar = this.g;
        aiw aiwVar = this.b;
        aiw aiwVar2 = this.c;
        if (alvVar.b == null) {
            alvVar.b = aiwVar.c();
        }
        aiw aiwVar3 = alvVar.b;
        aiw aiwVar4 = null;
        if (aiwVar3 == null) {
            aooh.j("valueVector");
            aiwVar3 = null;
        }
        int iB = aiwVar3.b();
        for (int i = 0; i < iB; i++) {
            aiw aiwVar5 = alvVar.b;
            if (aiwVar5 == null) {
                aooh.j("valueVector");
                aiwVar5 = null;
            }
            aiwVar5.e(i, alvVar.a.c(j, aiwVar.a(i), aiwVar2.a(i)));
        }
        aiw aiwVar6 = alvVar.b;
        if (aiwVar6 == null) {
            aooh.j("valueVector");
        } else {
            aiwVar4 = aiwVar6;
        }
        return nfVar.b.a(aiwVar4);
    }

    @Override // defpackage.ain
    public final /* synthetic */ boolean d(long j) {
        return defpackage.wo.a(this, j);
    }

    @Override // defpackage.ain
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ain
    public final nf g() {
        return this.h;
    }

    @Override // defpackage.ain
    public final void f() {
    }
}
