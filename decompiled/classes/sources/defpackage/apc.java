package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apc extends defpackage.aomh implements defpackage.aonn {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ defpackage.apd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apc(defpackage.apd apdVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.c = apdVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.apc) c(new defpackage.cpm(((defpackage.cpm) obj).a), (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        long j = this.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.apd apdVar = this.c;
        this.b = j;
        this.a = 1;
        java.lang.Object objG = apdVar.g(j, this);
        return objG == aoluVar ? aoluVar : objG;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.apc apcVar = new defpackage.apc(this.c, aolnVar);
        apcVar.b = ((defpackage.cpm) obj).a;
        return apcVar;
    }
}
