package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ggt implements defpackage.aoxi {
    final /* synthetic */ defpackage.aoxi a;
    final /* synthetic */ defpackage.gfy b;
    final /* synthetic */ defpackage.aonj c;

    public ggt(defpackage.aoxi aoxiVar, defpackage.gfy gfyVar, defpackage.aonj aonjVar) {
        this.a = aoxiVar;
        this.b = gfyVar;
        this.c = aonjVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.ggs ggsVar;
        ?? r6;
        if (aolnVar instanceof defpackage.ggs) {
            ggsVar = (defpackage.ggs) aolnVar;
            int i = ggsVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ggsVar.b = i - Integer.MIN_VALUE;
            } else {
                ggsVar = new defpackage.ggs(this, aolnVar);
            }
        } else {
            ggsVar = new defpackage.ggs(this, aolnVar);
        }
        java.lang.Object obj2 = ggsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ggsVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj3 = ggsVar.c;
                defpackage.aooc.af(obj2);
                r6 = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj2);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj2);
        defpackage.aoxi aoxiVar = this.a;
        defpackage.gfy gfyVar = this.b;
        defpackage.aonj aonjVar = this.c;
        ggsVar.c = aoxiVar;
        ggsVar.b = 1;
        java.lang.Object objO = defpackage.dez.o(gfyVar, true, false, aonjVar, ggsVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        obj2 = objO;
        r6 = aoxiVar;
        ggsVar.c = null;
        ggsVar.b = 2;
        if (r6.a(obj2, ggsVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }
}
