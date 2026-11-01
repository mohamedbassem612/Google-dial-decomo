package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class agwl extends aoof implements aono {
    public static final defpackage.agwl a = new defpackage.agwl();

    public agwl() {
        super(3, defpackage.agwm.class, "reduceLocal", "reduceLocal(Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;Lcom/google/apps/tiktok/coroutines/flow/LocalReadState;Z)Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;", 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) throws aois {
        defpackage.agwm agwmVar = (defpackage.agwm) obj;
        defpackage.agwm agwmVar2 = (defpackage.agwm) obj2;
        boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
        aooh.f(agwmVar, "p0");
        aooh.f(agwmVar2, "p1");
        j$.util.Objects.checkIndex(0, 3);
        if (agwmVar2 != null) {
            if (agwmVar2 instanceof defpackage.agwq) {
                int iA = defpackage.agwm.a(agwmVar);
                if (iA == 0) {
                    return new defpackage.agwu(null);
                }
                if (iA == 1) {
                    return new defpackage.agwu(((defpackage.agwr) agwmVar).a);
                }
                if (iA == 2) {
                    return new defpackage.agwu(((defpackage.agwu) agwmVar).a);
                }
                if (iA == 3) {
                    return new defpackage.agwv(((defpackage.agwt) agwmVar).a, null);
                }
                if (iA == 4) {
                    defpackage.agww agwwVar = (defpackage.agww) agwmVar;
                    return new defpackage.agwv(agwwVar.a, agwwVar.b);
                }
                if (iA != 5) {
                    throw new aois();
                }
                defpackage.agwv agwvVar = (defpackage.agwv) agwmVar;
                return new defpackage.agwv(agwvVar.a, agwvVar.b);
            }
            if (agwmVar2 instanceof defpackage.agwp) {
                defpackage.agwm agwmVar3 = ((defpackage.agwp) agwmVar2).a;
                j$.util.Objects.checkIndex(0, 3);
                if (agwmVar3 instanceof defpackage.agvs) {
                    return zBooleanValue ? new defpackage.agwv(((defpackage.agvs) agwmVar3).a, null) : new defpackage.agwt(((defpackage.agvs) agwmVar3).a);
                }
                if (!(agwmVar3 instanceof defpackage.agvr)) {
                    throw new aois();
                }
                int iA2 = defpackage.agwm.a(agwmVar);
                if (iA2 == 0) {
                    throw new defpackage.agwy("Advanced from Idle to a failure with no intermediate state.");
                }
                if (iA2 == 1) {
                    throw new defpackage.agwy("Advanced from Failed to another failure with no intermediate state.");
                }
                if (iA2 == 2) {
                    return zBooleanValue ? new defpackage.agwu(((defpackage.agwu) agwmVar).a) : new defpackage.agwr(new defpackage.agwx(((defpackage.agvr) agwmVar3).a));
                }
                if (iA2 == 3) {
                    throw new defpackage.agwy("Advanced from Read to a failure with no intermediate state.");
                }
                if (iA2 == 4) {
                    throw new defpackage.agwy("Advanced from StaleRead to a failure with no intermediate state.");
                }
                if (iA2 != 5) {
                    throw new aois();
                }
                if (!zBooleanValue) {
                    return new defpackage.agww(((defpackage.agwv) agwmVar).a, new defpackage.agwx(((defpackage.agvr) agwmVar3).a));
                }
                defpackage.agwv agwvVar2 = (defpackage.agwv) agwmVar;
                return new defpackage.agwv(agwvVar2.a, agwvVar2.b);
            }
        }
        throw new aois();
    }
}
