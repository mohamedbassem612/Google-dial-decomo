package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agwk extends aomh implements aonn {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ aoxh c;
    final /* synthetic */ aono d;
    final /* synthetic */ aonj e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwk(java.lang.Object obj, aoxh aoxhVar, aono aonoVar, aonj aonjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = obj;
        this.c = aoxhVar;
        this.d = aonoVar;
        this.e = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aows) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aows aowsVar = (aows) this.f;
            apdp apdpVar = new apdp();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            aoot aootVar = new aoot();
            aootVar.a = new defpackage.amdx(this.b);
            defpackage.agwj agwjVar = new defpackage.agwj(this.c, apdpVar, aootVar, this.d, this.e, arrayList, aowsVar, (aoln) null, 0);
            this.a = 1;
            if (aooh.O(agwjVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.agwk agwkVar = new defpackage.agwk(this.b, this.c, this.d, this.e, aolnVar);
        agwkVar.f = obj;
        return agwkVar;
    }
}
