package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eoj extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.ems b;
    final /* synthetic */ defpackage.emq c;
    final /* synthetic */ defpackage.aolr d;
    final /* synthetic */ defpackage.aoxh e;
    final /* synthetic */ defpackage.ccp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoj(defpackage.ems emsVar, defpackage.emq emqVar, defpackage.aolr aolrVar, defpackage.aoxh aoxhVar, defpackage.ccp ccpVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = emsVar;
        this.c = emqVar;
        this.d = aolrVar;
        this.e = aoxhVar;
        this.f = ccpVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.eoj) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i == 0) {
            defpackage.ems emsVar = this.b;
            defpackage.emq emqVar = this.c;
            defpackage.edj edjVar = new defpackage.edj(this.d, this.e, this.f, (defpackage.aoln) null, 2);
            this.a = 1;
            if (defpackage.dzn.f(emsVar, emqVar, edjVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.eoj(this.b, this.c, this.d, this.e, this.f, aolnVar);
    }
}
