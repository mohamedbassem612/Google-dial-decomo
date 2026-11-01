package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ggz extends defpackage.aomh implements defpackage.aonj {
    int a;
    final /* synthetic */ defpackage.gha b;
    final /* synthetic */ defpackage.ggg c;
    final /* synthetic */ defpackage.aonn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggz(defpackage.gha ghaVar, defpackage.ggg gggVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.b = ghaVar;
        this.c = gggVar;
        this.d = aonnVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ggz(this.b, this.c, this.d, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.gha ghaVar = this.b;
        defpackage.ggg gggVar = this.c;
        defpackage.aonn aonnVar = this.d;
        this.a = 1;
        java.lang.Object objC = ghaVar.c(gggVar, aonnVar, this);
        return objC == aoluVar ? aoluVar : objC;
    }
}
