package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eds extends aomh implements aonn {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ eei c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eds(eei eeiVar, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.c = eeiVar;
        this.d = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return c(bool, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int iIntValue;
        boolean z = this.b;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            iIntValue = ((java.lang.Number) obj).intValue();
        } else if (z) {
            aogc aogcVarO = this.c.o();
            this.b = true;
            this.a = 1;
            obj = aogcVarO.bo();
            if (obj == aoluVar) {
                return aoluVar;
            }
            iIntValue = ((java.lang.Number) obj).intValue();
        } else {
            iIntValue = this.d;
        }
        return new java.lang.Integer(iIntValue);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.eds edsVar = new defpackage.eds(this.c, this.d, aolnVar);
        edsVar.b = ((java.lang.Boolean) obj).booleanValue();
        return edsVar;
    }
}
