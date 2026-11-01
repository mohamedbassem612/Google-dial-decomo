package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bts extends aomh implements aonp {
    int a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ aoot d;
    final /* synthetic */ defpackage.btt e;
    final /* synthetic */ ajl f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bts(aoot aootVar, defpackage.btt bttVar, ajl ajlVar, aoln aolnVar) {
        super(4, aolnVar);
        this.d = aootVar;
        this.e = bttVar;
        this.f = ajlVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.bts btsVar = new defpackage.bts(this.d, this.e, this.f, (aoln) obj4);
        btsVar.g = (defpackage.apx) obj;
        btsVar.b = (defpackage.aqj) obj2;
        btsVar.c = (defpackage.btu) obj3;
        return btsVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2 = this.g;
        java.lang.Object obj3 = this.b;
        java.lang.Object obj4 = this.c;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            this.d.a = obj4;
            float fC = ((defpackage.aqj) obj3).c(obj4);
            defpackage.btt bttVar = this.e;
            float fA = java.lang.Float.isNaN(bttVar.a()) ? 0.0f : bttVar.a();
            if (!java.lang.Float.isNaN(fC) && fA != fC) {
                float fB = bttVar.d.b();
                ajl ajlVar = this.f;
                brg brgVar = new brg(obj2, 4);
                this.g = null;
                this.b = null;
                this.c = null;
                this.a = 1;
                if (defpackage.wx.c(fA, fC, fB, ajlVar, brgVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }
}
