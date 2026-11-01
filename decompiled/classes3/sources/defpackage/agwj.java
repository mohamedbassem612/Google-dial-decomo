package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agwj extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ aoxh b;
    final /* synthetic */ aoot c;
    final /* synthetic */ aono d;
    final /* synthetic */ aonj e;
    final /* synthetic */ java.util.List f;
    final /* synthetic */ apdp g;
    final /* synthetic */ aows h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwj(aoln aolnVar, aoxh aoxhVar, apdp apdpVar, aoot aootVar, aono aonoVar, aonj aonjVar, java.util.List list, aows aowsVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoxhVar;
        this.g = apdpVar;
        this.c = aootVar;
        this.d = aonoVar;
        this.e = aonjVar;
        this.f = list;
        this.h = aowsVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid == 0) {
            aolu aoluVar = aolu.a;
            int i = this.a;
            aooc.af(obj);
            if (i == 0) {
                aoss aossVar = (aoss) this.i;
                aoxh aoxhVar = this.b;
                defpackage.agwi agwiVar = new defpackage.agwi(aossVar, this.g, this.c, this.d, this.e, this.f, this.h);
                this.a = 1;
                if (aoxhVar.fM(agwiVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.a;
        aooc.af(obj);
        if (i2 == 0) {
            aoub aoubVar = ((aoss) this.i).c().get(aoub.d);
            aooh.c(aoubVar);
            aoub aoubVar2 = aoubVar;
            aoxh aoxhVar2 = this.b;
            defpackage.agwh agwhVar = new defpackage.agwh(this.g, this.c, this.d, this.e, this.f, aoubVar2, this.h);
            this.a = 1;
            if (aoxhVar2.fM(agwhVar, this) == aoluVar2) {
                return aoluVar2;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.agwj agwjVar = new defpackage.agwj(aolnVar, this.b, this.g, this.c, this.d, this.e, this.f, this.h, 1);
            agwjVar.i = obj;
            return agwjVar;
        }
        defpackage.agwj agwjVar2 = new defpackage.agwj(this.b, this.g, this.c, this.d, this.e, this.f, this.h, aolnVar, 0);
        agwjVar2.i = obj;
        return agwjVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agwj(aoxh aoxhVar, apdp apdpVar, aoot aootVar, aono aonoVar, aonj aonjVar, java.util.List list, aows aowsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aoxhVar;
        this.g = apdpVar;
        this.c = aootVar;
        this.d = aonoVar;
        this.e = aonjVar;
        this.f = list;
        this.h = aowsVar;
    }
}
