package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acje extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext d;
    final /* synthetic */ defpackage.acjf e;
    final /* synthetic */ defpackage.acir f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acje(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acjf acjfVar, defpackage.acir acirVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = promoContext;
        this.e = acjfVar;
        this.f = acirVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:35:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.ArrayList arrayList;
        defpackage.acir acirVar;
        defpackage.acir acirVar2;
        defpackage.acjf acjfVar;
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext;
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext2;
        akjx akjxVar;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                obj2 = this.b;
                obj3 = this.a;
                aooc.af(obj);
            }
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            bool.booleanValue();
            defpackage.acjf.a.b().y("Promotion render result - %s", bool);
            acirVar = this.f;
            acirVar2 = defpackage.acir.a;
            if (acirVar == acirVar2) {
                promoContext2 = this.d;
                akjxVar = promoContext2.c().h;
                if (akjxVar == null) {
                    akjxVar = akjx.a;
                }
                if (akjxVar.f) {
                    acjfVar = this.e;
                    promoContext = this.d;
                    acjfVar.d(promoContext);
                    if (acirVar != acirVar2) {
                        acjfVar.f(promoContext, acirVar);
                    }
                } else {
                    this.e.f(promoContext2, acirVar);
                }
            } else {
                acjfVar = this.e;
                promoContext = this.d;
                acjfVar.d(promoContext);
                if (acirVar != acirVar2) {
                    acjfVar.f(promoContext, acirVar);
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext3 = this.d;
        akhq akhqVar = promoContext3.c().c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        java.lang.String strR = defpackage.abxl.r(akhqVar);
        defpackage.akkc akkcVar = (defpackage.akkc) defpackage.acjf.b.get(strR);
        obj2 = (az) defpackage.acjf.c.get(strR);
        if (akkcVar == null || obj2 == null) {
            defpackage.acjf.a.c().L("Theme or activity not found for promotion logging. IsThemeNull [%s], IsActivityNull [%s]", akkcVar == null, obj2 == null);
            this.e.d(promoContext3);
            return aojh.a;
        }
        if (this.f == defpackage.acir.a) {
            aiof aiofVar = defpackage.acjf.a;
            aiofVar.b().y("Processing experiment ids for promotion - %s", promoContext3);
            java.lang.String strE = promoContext3.e();
            alat alatVar = promoContext3.c().e;
            aooh.e(alatVar, "getBusinessExperimentsList(...)");
            if (alatVar.isEmpty()) {
                akhq akhqVar2 = promoContext3.c().c;
                if (akhqVar2 == null) {
                    akhqVar2 = akhq.a;
                }
                arrayList = akhqVar2.c;
                aooh.c(arrayList);
            } else {
                alat alatVar2 = promoContext3.c().e;
                aooh.e(alatVar2, "getBusinessExperimentsList(...)");
                arrayList = new java.util.ArrayList(ajsz.bl(alatVar2, 10));
                java.util.Iterator it = alatVar2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Integer(((akhk) it.next()).b));
                }
            }
            if (strE != null) {
                aiofVar.b().y("Processing experiment ids for account - %s", aesg.p(strE));
                defpackage.acjf acjfVar2 = this.e;
                aokc aokcVar = aokc.a;
                this.a = akkcVar;
                this.b = obj2;
                this.c = 1;
                if (acjfVar2.h.b(strE, arrayList, aokcVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        obj3 = akkcVar;
        defpackage.acjf acjfVar3 = this.e;
        defpackage.acir acirVar3 = this.f;
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext4 = this.d;
        this.a = null;
        this.b = null;
        this.c = 2;
        obj = aoov.aj(acjfVar3.d, new defpackage.acjc(acirVar3, acjfVar3, promoContext4, (az) obj2, (defpackage.akkc) obj3, (aoln) null, 0), this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        bool2.booleanValue();
        defpackage.acjf.a.b().y("Promotion render result - %s", bool2);
        acirVar = this.f;
        acirVar2 = defpackage.acir.a;
        if (acirVar == acirVar2) {
            promoContext2 = this.d;
            akjxVar = promoContext2.c().h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            if (akjxVar.f) {
                this.e.f(promoContext2, acirVar);
            } else {
                acjfVar = this.e;
                promoContext = this.d;
                acjfVar.d(promoContext);
                if (acirVar != acirVar2) {
                    acjfVar.f(promoContext, acirVar);
                }
            }
        } else {
            acjfVar = this.e;
            promoContext = this.d;
            acjfVar.d(promoContext);
            if (acirVar != acirVar2) {
                acjfVar.f(promoContext, acirVar);
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.acje(this.d, this.e, this.f, aolnVar);
    }
}
