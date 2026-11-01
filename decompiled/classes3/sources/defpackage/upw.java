package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class upw implements java.util.function.BiConsumer {
    public final /* synthetic */ defpackage.upt a;
    public final /* synthetic */ java.util.Map b;

    public /* synthetic */ upw(defpackage.upt uptVar, java.util.Map map) {
        this.a = uptVar;
        this.b = map;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.upo upoVar = (defpackage.upo) obj;
        if (((java.lang.Boolean) obj2).booleanValue()) {
            defpackage.upt uptVar = this.a;
            if (upoVar.c == uptVar.f) {
                akzx akzxVarP = uptVar.p();
                java.lang.Long l = upoVar.a;
                if (l == null) {
                    akzxVarP.u();
                    defpackage.upt uptVar2 = (defpackage.upt) akzxVarP.b;
                    uptVar2.b &= -2;
                    uptVar2.c = 0L;
                } else {
                    long jLongValue = l.longValue();
                    akzxVarP.u();
                    defpackage.upt uptVar3 = (defpackage.upt) akzxVarP.b;
                    uptVar3.b |= 1;
                    uptVar3.c = jLongValue;
                }
                j$.util.Optional optional = upoVar.b;
                if (optional.isPresent()) {
                    int iIntValue = ((java.lang.Integer) optional.orElseThrow()).intValue();
                    akzxVarP.u();
                    defpackage.upt uptVar4 = (defpackage.upt) akzxVarP.b;
                    uptVar4.b |= 2;
                    uptVar4.d = iIntValue;
                } else {
                    akzxVarP.u();
                    defpackage.upt uptVar5 = (defpackage.upt) akzxVarP.b;
                    uptVar5.b &= -3;
                    uptVar5.d = 0;
                }
                defpackage.upl uplVar = upoVar.f;
                if (uplVar != null) {
                    if (uptVar.l.contains(uplVar)) {
                        akzxVarP.u();
                        defpackage.upt uptVar6 = (defpackage.upt) akzxVarP.b;
                        j$.util.Objects.requireNonNull(uplVar);
                        uptVar6.m = uplVar;
                        uptVar6.b |= 4;
                        break;
                    }
                    alat alatVar = uptVar.l;
                    uqc.a.b().l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "isValidDefaultChannel", 891, "SpeedDialUiItemMutator.java").v("enter");
                    defpackage.upk upkVarB = defpackage.upk.b(uplVar.f);
                    if (upkVarB == null) {
                        upkVarB = defpackage.upk.UNRECOGNIZED;
                    }
                    if (upkVarB == defpackage.upk.DUO || upkVarB == defpackage.upk.RTT) {
                        java.util.Iterator it = alatVar.iterator();
                        while (it.hasNext()) {
                            if (((defpackage.upl) it.next()).c.equals(uplVar.c)) {
                                akzxVarP.u();
                                defpackage.upt uptVar7 = (defpackage.upt) akzxVarP.b;
                                j$.util.Objects.requireNonNull(uplVar);
                                uptVar7.m = uplVar;
                                uptVar7.b |= 4;
                                break;
                            }
                        }
                    }
                }
                ahvr.bN(this.b.put(upoVar, (defpackage.upt) akzxVarP.p()) == null, "Each SpeedDialEntry only has one correct SpeedDialUiItem");
            }
        }
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
