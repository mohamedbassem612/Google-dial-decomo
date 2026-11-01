package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hxm extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.hxv b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxm(defpackage.hxv hxvVar, int i, aoln aolnVar) {
        super(1, aolnVar);
        this.b = hxvVar;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.hxm(this.b, this.c, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.hxv hxvVar = this.b;
        int i2 = this.c;
        this.a = 1;
        defpackage.hyj hyjVar = hxvVar.d;
        java.lang.Object objA = ahvr.ag(hyjVar.b, hyjVar.f, new defpackage.hxo(hyjVar, i2, (aoln) null, 2)).a(this);
        return objA == aoluVar ? aoluVar : objA;
    }
}
