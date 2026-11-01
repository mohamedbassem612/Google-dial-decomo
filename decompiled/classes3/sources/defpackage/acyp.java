package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyp implements ajat {
    public final /* synthetic */ acyu a;
    public final /* synthetic */ defpackage.acvu b;
    public final /* synthetic */ defpackage.acwb c;
    public final /* synthetic */ ajat d;
    public final /* synthetic */ defpackage.acwb e;
    public final /* synthetic */ defpackage.acvu f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ defpackage.vaa h;

    public /* synthetic */ acyp(acyu acyuVar, defpackage.vaa vaaVar, defpackage.acvu acvuVar, defpackage.acwb acwbVar, ajat ajatVar, defpackage.acwb acwbVar2, defpackage.acvu acvuVar2, boolean z) {
        this.a = acyuVar;
        this.h = vaaVar;
        this.b = acvuVar;
        this.c = acwbVar;
        this.d = ajatVar;
        this.e = acwbVar2;
        this.f = acvuVar2;
        this.g = z;
    }

    public final ajcq a(java.lang.Object obj) {
        defpackage.vaa vaaVar = this.h;
        defpackage.acvu acvuVar = this.b;
        defpackage.acyt acytVar = (defpackage.acyt) obj;
        defpackage.acyt acytVar2 = defpackage.acyt.c;
        if (acytVar == acytVar2) {
            vaaVar.F(1008, acvuVar);
            return aiql.z(acytVar2);
        }
        defpackage.acyt acytVar3 = defpackage.acyt.a;
        if (acytVar == acytVar3) {
            vaaVar.F(1007, acvuVar);
            return aiql.z(acytVar3);
        }
        boolean z = this.g;
        defpackage.acvu acvuVar2 = this.f;
        defpackage.acwb acwbVar = this.e;
        ajat ajatVar = this.d;
        defpackage.acwb acwbVar2 = this.c;
        acyu acyuVar = this.a;
        ahvr.bM(acytVar == defpackage.acyt.b);
        defpackage.adcs adcsVarE = defpackage.adcs.e(ajatVar.a(new defpackage.adac(acwbVar2, acvuVar)));
        defpackage.acyj acyjVar = new defpackage.acyj(acyuVar, (java.lang.Object) vaaVar, acvuVar, acwbVar2, 3);
        java.util.concurrent.Executor executor = acyuVar.f;
        return adcsVarE.g(acyjVar, executor).g(new defpackage.acyg((java.lang.Object) acyuVar, (alad) acvuVar, 6), executor).g(new defpackage.acyh((java.lang.Object) acyuVar, acwbVar, acvuVar2, 4), executor).g(new defpackage.acyg((java.lang.Object) acyuVar, (alad) acwbVar2, 7), executor).g(new defpackage.acwk(acyuVar, 18), executor).f(new defpackage.vrm(z, vaaVar, acvuVar2, 3), executor);
    }
}
