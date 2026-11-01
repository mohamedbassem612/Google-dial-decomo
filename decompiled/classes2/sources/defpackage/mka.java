package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mka extends aomh implements aonn {
    int a;
    final /* synthetic */ oko b;
    final /* synthetic */ zqq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mka(oko okoVar, zqq zqqVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = okoVar;
        this.c = zqqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            oko okoVar = this.b;
            zqq zqqVar = this.c;
            this.a = 1;
            if (okoVar.N(zqqVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.mka(this.b, this.c, aolnVar);
    }
}
