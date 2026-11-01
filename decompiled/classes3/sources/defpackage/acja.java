package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acja implements defpackage.acio {
    private static final aiof a = aiof.i("GnpSdk");
    private final java.util.Set b;
    private final defpackage.acip c;

    public acja(java.util.Set set, defpackage.acip acipVar) {
        aooh.f(set, "rendererSet");
        aooh.f(acipVar, "promotionDisplayEventsListener");
        this.b = set;
        this.c = acipVar;
    }

    private final defpackage.acis c(akjw akjwVar) {
        for (defpackage.acis acisVar : this.b) {
            if (acisVar.c(akjwVar)) {
                return acisVar;
            }
        }
        return null;
    }

    @Override // defpackage.acio
    public final android.view.View a(az azVar, akjx akjxVar) {
        aooh.f(akjxVar, "promoUi");
        akjw akjwVarB = akjw.b(akjxVar.e);
        if (akjwVarB == null) {
            akjwVarB = akjw.a;
        }
        defpackage.acis acisVarC = c(akjwVarB);
        if (acisVarC != null) {
            return acisVarC.a(azVar, akjxVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.acio
    public final java.lang.Object b(az azVar, android.view.View view, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.akkc akkcVar, aoln aolnVar) {
        defpackage.aciz acizVar;
        if (aolnVar instanceof defpackage.aciz) {
            acizVar = (defpackage.aciz) aolnVar;
            int i = acizVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acizVar.c = i - Integer.MIN_VALUE;
            } else {
                acizVar = new defpackage.aciz(this, aolnVar);
            }
        } else {
            acizVar = new defpackage.aciz(this, aolnVar);
        }
        java.lang.Object obj = acizVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acizVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            akjx akjxVar = promoContext.c().h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            akjw akjwVarB = akjw.b(akjxVar.e);
            if (akjwVarB == null) {
                akjwVarB = akjw.a;
            }
            defpackage.acis acisVarC = c(akjwVarB);
            if (acisVarC != null) {
                try {
                    acisVarC.b(azVar, view, promoContext, akkcVar);
                } catch (java.lang.RuntimeException e) {
                    hgb.b(a.c(), "Failed rendering promotion.", e);
                    defpackage.acip acipVar = this.c;
                    defpackage.acir acirVar = defpackage.acir.b;
                    acizVar.c = 1;
                    if (acipVar.a(promoContext, acirVar, acizVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                akjx akjxVar2 = promoContext.c().h;
                defpackage.acip acipVar2 = this.c;
                defpackage.acir acirVar2 = defpackage.acir.d;
                acizVar.c = 2;
                if (acipVar2.a(promoContext, acirVar2, acizVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
