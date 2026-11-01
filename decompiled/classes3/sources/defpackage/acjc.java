package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjc extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Enum a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ android.content.Context d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjc(defpackage.acir acirVar, defpackage.acjf acjfVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, az azVar, defpackage.akkc akkcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = acirVar;
        this.b = acjfVar;
        this.c = promoContext;
        this.d = azVar;
        this.e = akkcVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        if (this.$cid != 0) {
            aooc.af(obj);
            j$.util.Optional optionalQ = ((rsr) this.c).q((defpackage.zna) this.a);
            aooh.e(optionalQ, "getNameForCallPresentation(...)");
            java.lang.String str = (java.lang.String) aooh.q(optionalQ);
            return str == null ? afsq.cy(this.d, (j$.util.Optional) this.b, (j$.util.Optional) this.e) : str;
        }
        aooc.af(obj);
        java.lang.Enum r5 = this.a;
        if (defpackage.acir.a != r5) {
            defpackage.acjf acjfVar = (defpackage.acjf) this.b;
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.c;
            acjfVar.e.a(promoContext, "Error rendering promotion, result=%s.", new java.lang.Object[]{r5});
            acjfVar.f.j(promoContext, (defpackage.acir) r5);
            return java.lang.Boolean.FALSE;
        }
        try {
            i = this.d.getResources().getConfiguration().orientation;
        } catch (java.lang.Exception unused) {
            aiof aiofVar = defpackage.acjf.a;
            i = 0;
        }
        acaz acazVar = new acaz(i, (defpackage.akkc) this.e);
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext2 = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.c;
        akjx akjxVar = promoContext2.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        boolean z = akjxVar.f;
        java.lang.Object obj2 = this.b;
        if (z) {
            defpackage.acjf acjfVar2 = (defpackage.acjf) obj2;
            acjfVar2.e.b(promoContext2, "NOT DISPLAYED (control group).", new java.lang.Object[0]);
            acjfVar2.f.h(promoContext2, acazVar);
        } else {
            defpackage.acjf acjfVar3 = (defpackage.acjf) obj2;
            acjfVar3.e.b(promoContext2, "DISPLAYED.", new java.lang.Object[0]);
            acjfVar3.f.m(promoContext2, acazVar);
        }
        return java.lang.Boolean.TRUE;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            java.lang.Object obj2 = this.c;
            java.lang.Enum r0 = this.a;
            return new defpackage.acjc((rsr) obj2, (defpackage.zna) r0, this.d, (j$.util.Optional) this.b, (j$.util.Optional) this.e, aolnVar, 1);
        }
        java.lang.Enum r10 = this.a;
        java.lang.Object obj3 = this.b;
        java.lang.Object obj4 = this.c;
        return new defpackage.acjc((defpackage.acir) r10, (defpackage.acjf) obj3, (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj4, this.d, (defpackage.akkc) this.e, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjc(rsr rsrVar, defpackage.zna znaVar, android.content.Context context, j$.util.Optional optional, j$.util.Optional optional2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = rsrVar;
        this.a = znaVar;
        this.d = context;
        this.b = optional;
        this.e = optional2;
    }
}
