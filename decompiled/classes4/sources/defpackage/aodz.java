package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aodz extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.apjb b;
    final /* synthetic */ vqf c;
    final /* synthetic */ ajsz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aodz(vqf vqfVar, ajsz ajszVar, defpackage.apjb apjbVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = vqfVar;
        this.d = ajszVar;
        this.b = apjbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        aojh aojhVar = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                vqf vqfVar = this.c;
                ajsz ajszVar = this.d;
                this.a = 1;
                ajszVar.dy(vqfVar.a);
                if (aojh.a == aojhVar) {
                    return aojhVar;
                }
            }
            this.d.dw();
            return aojh.a;
        } catch (java.lang.Exception e) {
            this.d.dv("Collection of requests completed exceptionally", e);
            throw e;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aodz(this.c, this.d, this.b, aolnVar);
    }
}
