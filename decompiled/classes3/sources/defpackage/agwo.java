package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agwo extends aomh implements aonn {
    int a;
    final /* synthetic */ aoxh b;
    final /* synthetic */ aonn c;
    final /* synthetic */ aozj d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwo(aoln aolnVar, aoxh aoxhVar, aonn aonnVar, aozj aozjVar) {
        super(2, aolnVar);
        this.b = aoxhVar;
        this.c = aonnVar;
        this.d = aozjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aoxh aoxhVar = this.b;
            aonn aonnVar = this.c;
            aooh.f(aoxhVar, "<this>");
            aoxh aoxhVarAC = aoov.aC(aoov.aD(new aoxe(new defpackage.agwk(new defpackage.agws(), new hlh(aoxhVar, aonnVar, 15), defpackage.agwl.a, new defpackage.agkh(8), null)), -1), aoth.b);
            bnk bnkVar = new bnk(this.d, 19);
            this.a = 1;
            if (aoxhVarAC.fM(bnkVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.agwo agwoVar = new defpackage.agwo(aolnVar, this.b, this.c, this.d);
        agwoVar.e = obj;
        return agwoVar;
    }
}
