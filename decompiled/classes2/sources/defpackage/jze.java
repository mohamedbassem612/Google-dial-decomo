package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jze extends aomh implements aonn {
    final /* synthetic */ jzj a;
    final /* synthetic */ java.util.List b;
    final /* synthetic */ java.util.List c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jze(jzj jzjVar, java.util.List list, java.util.List list2, long j, int i, int i2, aoln aolnVar) {
        super(2, aolnVar);
        this.a = jzjVar;
        this.b = list;
        this.c = list2;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        return this.a.e(this.b, this.c, this.d, this.e, this.f);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jze(this.a, this.b, this.c, this.d, this.e, this.f, aolnVar);
    }
}
