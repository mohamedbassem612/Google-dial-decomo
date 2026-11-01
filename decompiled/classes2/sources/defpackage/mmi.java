package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mmi extends aomh implements aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ aoot b;
    final /* synthetic */ aoot c;
    final /* synthetic */ aonj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmi(aoot aootVar, aoot aootVar2, aonj aonjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aootVar;
        this.c = aootVar2;
        this.d = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((albh) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        albh albhVar = (albh) this.a;
        this.b.a = albhVar;
        java.lang.Object objA = this.d.a(albhVar);
        aoot aootVar = this.c;
        aootVar.a = objA;
        return aootVar.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.mmi mmiVar = new defpackage.mmi(this.b, this.c, this.d, aolnVar);
        mmiVar.a = obj;
        return mmiVar;
    }
}
