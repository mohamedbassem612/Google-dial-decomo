package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apae implements defpackage.aoxi {
    final /* synthetic */ defpackage.aowi a;
    final /* synthetic */ int b;

    public apae(defpackage.aowi aowiVar, int i) {
        this.a = aowiVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.apad apadVar;
        if (aolnVar instanceof defpackage.apad) {
            apadVar = (defpackage.apad) aolnVar;
            int i = apadVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apadVar.c = i - Integer.MIN_VALUE;
            } else {
                apadVar = new defpackage.apad(this, aolnVar);
            }
        } else {
            apadVar = new defpackage.apad(this, aolnVar);
        }
        java.lang.Object obj2 = apadVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = apadVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(obj2);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj2);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj2);
        defpackage.aowi aowiVar = this.a;
        defpackage.aokg aokgVar = new defpackage.aokg(this.b, obj);
        apadVar.c = 1;
        if (aowiVar.a(aokgVar, apadVar) == aoluVar) {
            return aoluVar;
        }
        apadVar.c = 2;
        if (defpackage.aooh.J(apadVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }
}
