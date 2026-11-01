package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aozz implements defpackage.aoxi {
    final /* synthetic */ defpackage.aoot a;
    final /* synthetic */ defpackage.aoss b;
    final /* synthetic */ defpackage.apaa c;
    final /* synthetic */ defpackage.aoxi d;

    public aozz(defpackage.aoot aootVar, defpackage.aoss aossVar, defpackage.apaa apaaVar, defpackage.aoxi aoxiVar) {
        this.a = aootVar;
        this.b = aossVar;
        this.c = apaaVar;
        this.d = aoxiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aozy aozyVar;
        if (aolnVar instanceof defpackage.aozy) {
            aozyVar = (defpackage.aozy) aolnVar;
            int i = aozyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aozyVar.e = i - Integer.MIN_VALUE;
            } else {
                aozyVar = new defpackage.aozy(this, aolnVar);
            }
        } else {
            aozyVar = new defpackage.aozy(this, aolnVar);
        }
        java.lang.Object obj2 = aozyVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aozyVar.e;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            defpackage.aoub aoubVar = (defpackage.aoub) this.a.a;
            if (aoubVar != null) {
                aoubVar.s(new defpackage.apac());
                aozyVar.a = obj;
                aozyVar.b = aoubVar;
                aozyVar.e = 1;
                if (aoubVar.n(aozyVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = aozyVar.b;
            obj = aozyVar.a;
            defpackage.aooc.af(obj2);
        }
        java.lang.Object obj4 = obj;
        this.a.a = defpackage.aoov.an(this.b, null, 4, new defpackage.edj(this.c, this.d, obj4, (defpackage.aoln) null, 7), 1);
        return defpackage.aojh.a;
    }
}
