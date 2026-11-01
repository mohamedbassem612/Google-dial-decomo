package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class asu extends aomh implements aonn {
    final /* synthetic */ aooq a;
    final /* synthetic */ float b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asu(aooq aooqVar, float f, aoln aolnVar) {
        super(2, aolnVar);
        this.a = aooqVar;
        this.b = f;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((asv) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        asv asvVar = (asv) this.c;
        aooc.af(obj);
        this.a.a = asvVar.a(this.b);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.asu asuVar = new defpackage.asu(this.a, this.b, aolnVar);
        asuVar.c = obj;
        return asuVar;
    }
}
