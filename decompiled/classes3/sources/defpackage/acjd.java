package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acjd extends aomh implements aonn {
    final /* synthetic */ defpackage.acjf a;
    final /* synthetic */ com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjd(int i, defpackage.acjf acjfVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, aoln aolnVar) {
        super(2, aolnVar);
        this.c = i;
        this.a = acjfVar;
        this.b = promoContext;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        int i = this.c;
        if (i != 0) {
            defpackage.acjf acjfVar = this.a;
            acjfVar.g.d(this.b, i);
        }
        this.a.d(this.b);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.acjd(this.c, this.a, this.b, aolnVar);
    }
}
