package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class edk extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.eei c;
    final /* synthetic */ defpackage.gat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edk(defpackage.eei eeiVar, defpackage.gat gatVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.c = eeiVar;
        this.d = gatVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.edk(this.c, this.d, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aolr, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.gat gatVar;
        defpackage.eei eeiVar;
        defpackage.gjy gjyVar;
        java.lang.Object obj2;
        java.lang.Throwable th;
        java.lang.Object obj3;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.b;
        try {
            if (i != 0) {
                if (i != 1) {
                    obj3 = this.a;
                    try {
                        defpackage.aooc.af(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        obj = new defpackage.aoiv(th);
                    }
                } else {
                    defpackage.aooc.af(obj);
                }
                return java.lang.Boolean.valueOf(defpackage.aosv.w((defpackage.aosi) obj3, obj));
            }
            defpackage.aooc.af(obj);
            this.b = 1;
            obj = null;
            defpackage.aolr aolrVarPlus = gatVar.e.plus(u());
            defpackage.edj edjVar = new defpackage.edj(eeiVar, gatVar, gjyVar, (defpackage.aoln) null, 0);
            this.a = obj2;
            this.b = 2;
            java.lang.Object objAj = defpackage.aoov.aj(aolrVarPlus, edjVar, this);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            obj = objAj;
            obj3 = obj2;
            return java.lang.Boolean.valueOf(defpackage.aosv.w((defpackage.aosi) obj3, obj));
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj3 = obj2;
            obj = new defpackage.aoiv(th);
        }
        gatVar = this.d;
        eeiVar = this.c;
        gjyVar = (defpackage.gjy) obj;
        obj2 = gatVar.b;
    }
}
