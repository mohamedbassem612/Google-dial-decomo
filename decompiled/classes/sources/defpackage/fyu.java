package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fyu implements defpackage.aoxi {
    final /* synthetic */ defpackage.aoor a;
    final /* synthetic */ defpackage.aoxi b;

    public fyu(defpackage.aoor aoorVar, defpackage.aoxi aoxiVar) {
        this.a = aoorVar;
        this.b = aoxiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoxi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(defpackage.aokg aokgVar, defpackage.aoln aolnVar) {
        defpackage.fyt fytVar;
        if (aolnVar instanceof defpackage.fyt) {
            fytVar = (defpackage.fyt) aolnVar;
            int i = fytVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fytVar.c = i - Integer.MIN_VALUE;
            } else {
                fytVar = new defpackage.fyt(this, aolnVar);
            }
        } else {
            fytVar = new defpackage.fyt(this, aolnVar);
        }
        java.lang.Object obj = fytVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = fytVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (aokgVar == null) {
                defpackage.aooh.g();
            }
            if (aokgVar.a > this.a.a) {
                defpackage.aoxi aoxiVar = this.b;
                java.lang.Object obj2 = aokgVar.b;
                fytVar.d = aokgVar;
                fytVar.c = 1;
                if (aoxiVar.a(obj2, fytVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aokgVar = fytVar.d;
        defpackage.aooc.af(obj);
        this.a.a = aokgVar.a;
        return defpackage.aojh.a;
    }
}
