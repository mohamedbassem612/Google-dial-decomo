package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abec implements defpackage.alp {
    final /* synthetic */ defpackage.amc a;
    final /* synthetic */ defpackage.amc b;

    public abec(defpackage.amc amcVar, defpackage.amc amcVar2) {
        this.a = amcVar;
        this.b = amcVar2;
    }

    private static final ait f(aiw aiwVar) {
        aooh.d(aiwVar, "null cannot be cast to non-null type androidx.compose.animation.core.AnimationVector2D");
        return (ait) aiwVar;
    }

    @Override // defpackage.alp
    public final long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aooh.f(aiwVar, "initialValue");
        aooh.f(aiwVar2, "targetValue");
        aooh.f(aiwVar3, "initialVelocity");
        ait aitVarF = f(aiwVar);
        ait aitVarF2 = f(aiwVar2);
        ait aitVarF3 = f(aiwVar3);
        float f = aitVarF.a;
        float f2 = aitVarF2.a;
        float f3 = aitVarF3.a;
        long jA = defpackage.yj.a(this.a);
        float f4 = aitVarF.b;
        float f5 = aitVarF2.b;
        float f6 = aitVarF3.b;
        return java.lang.Math.max(jA, defpackage.yj.a(this.b));
    }

    @Override // defpackage.alp
    public final /* synthetic */ aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return d(a(aiwVar, aiwVar2, aiwVar3), aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aooh.f(aiwVar, "initialValue");
        aooh.f(aiwVar2, "targetValue");
        aooh.f(aiwVar3, "initialVelocity");
        ait aitVarF = f(aiwVar);
        ait aitVarF2 = f(aiwVar2);
        ait aitVarF3 = f(aiwVar3);
        return new ait(this.a.c(j, new ais(aitVarF.a), new ais(aitVarF2.a), new ais(aitVarF3.a)).a, this.b.c(j, new ais(aitVarF.b), new ais(aitVarF2.b), new ais(aitVarF3.b)).a);
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        aooh.f(aiwVar, "initialValue");
        aooh.f(aiwVar2, "targetValue");
        aooh.f(aiwVar3, "initialVelocity");
        ait aitVarF = f(aiwVar);
        ait aitVarF2 = f(aiwVar2);
        ait aitVarF3 = f(aiwVar3);
        return new ait(this.a.d(j, new ais(aitVarF.a), new ais(aitVarF2.a), new ais(aitVarF3.a)).a, this.b.d(j, new ais(aitVarF.b), new ais(aitVarF2.b), new ais(aitVarF3.b)).a);
    }

    @Override // defpackage.alp
    public final /* synthetic */ boolean e() {
        return false;
    }
}
