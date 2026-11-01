package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzn extends defpackage.agzi implements emj {
    private final defpackage.agzi a;
    private final java.util.concurrent.Executor b;
    private final java.util.Map c;
    private final aogc d;

    public agzn(defpackage.agzi agziVar, defpackage.uzx uzxVar, aogc aogcVar, java.util.concurrent.Executor executor, emx emxVar) {
        this.a = agziVar;
        this.d = aogcVar;
        this.b = executor;
        this.c = (java.util.Map) uzxVar.aT(2131428786, emxVar, new defpackage.agzl(0), new defpackage.agzm(0));
        emxVar.P().c(this);
    }

    public final void b(emx emxVar) {
        afec.c();
        for (defpackage.agzw agzwVar : this.c.values()) {
            afec.c();
            ahvr.bY(!agzwVar.d);
            agzwVar.e = null;
        }
    }

    public final void e(emx emxVar) {
        afec.c();
        for (defpackage.agzw agzwVar : this.c.values()) {
            afec.c();
            agzwVar.c = true;
            defpackage.agzv agzvVar = agzwVar.b;
            if (agzvVar != null) {
                agzvVar.b();
            }
        }
    }

    public final void f(emx emxVar) {
        afec.c();
        for (defpackage.agzw agzwVar : this.c.values()) {
            afec.c();
            agzwVar.c = false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [agyz, java.lang.Object] */
    @Override // defpackage.agzi
    public final defpackage.agwm h(int i, defpackage.agza agzaVar, ahyn ahynVar) {
        afec.c();
        defpackage.agwm agwmVarH = this.a.h(i, agzaVar, ahynVar);
        java.util.Map map = this.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        defpackage.agzw agzwVar = (defpackage.agzw) map.get(numValueOf);
        if (agzwVar == null) {
            defpackage.agzw agzwVar2 = new defpackage.agzw(this.d, this.b);
            map.put(numValueOf, agzwVar2);
            ?? r3 = ((ahys) ahynVar).a;
            afec.c();
            ahvr.bY(!agzwVar2.d);
            defpackage.agzv agzvVar = agzwVar2.b;
            if (agzvVar != null) {
                agzvVar.close();
                aogc aogcVar = agzwVar2.f;
                defpackage.agzv agzvVar2 = agzwVar2.b;
                aogcVar.v(agzvVar2.a, agzvVar2);
            }
            agzwVar2.b = new defpackage.agzv(agzwVar2, r3, agzwVar2.a);
            aogc aogcVar2 = agzwVar2.f;
            defpackage.agzv agzvVar3 = agzwVar2.b;
            aogcVar2.u(agzvVar3.a, agzvVar3);
            agzwVar = agzwVar2;
        }
        afec.c();
        ahvr.bY(!agzwVar.d);
        agzwVar.e = agwmVarH;
        defpackage.agzv agzvVar4 = agzwVar.b;
        if (agzvVar4 != null) {
            agzvVar4.b();
        }
        return new defpackage.agwm((byte[]) null, (byte[]) null);
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
