package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class atb extends aomh implements aonn {
    int a;
    final /* synthetic */ ato b;
    final /* synthetic */ long c;
    final /* synthetic */ aooq d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atb(ato atoVar, long j, aooq aooqVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = atoVar;
        this.c = j;
        this.d = aooqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((apnt) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        apnt apntVar = (apnt) this.e;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            ato atoVar = this.b;
            long j = this.c;
            aooq aooqVar = this.d;
            float fB = atoVar.b(j);
            defpackage.ata ataVar = new defpackage.ata(aooqVar, atoVar, apntVar, 0);
            this.e = null;
            this.a = 1;
            if (defpackage.wx.g(0.0f, fB, null, ataVar, this, 12) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.atb atbVar = new defpackage.atb(this.b, this.c, this.d, aolnVar);
        atbVar.e = obj;
        return atbVar;
    }
}
