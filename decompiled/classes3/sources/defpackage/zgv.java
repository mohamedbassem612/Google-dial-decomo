package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zgv extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.zgx b;
    final /* synthetic */ defpackage.zfd c;
    final /* synthetic */ defpackage.zff d;
    final /* synthetic */ defpackage.zge e;
    final /* synthetic */ java.lang.String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgv(defpackage.zgx zgxVar, defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zge zgeVar, java.lang.String str, aoln aolnVar) {
        super(1, aolnVar);
        this.b = zgxVar;
        this.c = zfdVar;
        this.d = zffVar;
        this.e = zgeVar;
        this.f = str;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.zgv(this.b, this.c, this.d, this.e, this.f, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.zgx zgxVar = this.b;
        defpackage.zfd zfdVar = this.c;
        defpackage.zff zffVar = this.d;
        defpackage.zge zgeVar = this.e;
        java.lang.String str = this.f;
        this.a = 1;
        java.lang.Object objB = zgxVar.b(zfdVar, zffVar, zgeVar, str, this);
        return objB == aoluVar ? aoluVar : objB;
    }
}
