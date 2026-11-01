package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fyw implements defpackage.aoxi {
    final /* synthetic */ defpackage.gat a;

    public fyw(defpackage.gat gatVar) {
        this.a = gatVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [aoyq, java.lang.Object] */
    @Override // defpackage.aoxi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(defpackage.aokg aokgVar, defpackage.aoln aolnVar) {
        defpackage.fyv fyvVar;
        if (aolnVar instanceof defpackage.fyv) {
            fyvVar = (defpackage.fyv) aolnVar;
            int i = fyvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fyvVar.c = i - Integer.MIN_VALUE;
            } else {
                fyvVar = new defpackage.fyv(this, aolnVar);
            }
        } else {
            fyvVar = new defpackage.fyv(this, aolnVar);
        }
        java.lang.Object obj = fyvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = fyvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aokgVar = fyvVar.d;
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aokg aokgVar2 = fyvVar.d;
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        defpackage.gat gatVar = this.a;
        fyvVar.d = aokgVar;
        fyvVar.c = 1;
        if (gatVar.c.a(aokgVar, fyvVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.gat gatVar2 = this.a;
        fyvVar.d = null;
        fyvVar.c = 2;
        if (((defpackage.afab) gatVar2.a).g(aokgVar, fyvVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }
}
