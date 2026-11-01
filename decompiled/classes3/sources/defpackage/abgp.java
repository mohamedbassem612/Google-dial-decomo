package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abgp extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.abgq b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgp(defpackage.abgq abgqVar, boolean z, long j, long j2, aoln aolnVar) {
        super(2, aolnVar);
        this.b = abgqVar;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.abgq abgqVar = this.b;
            long j = this.c ? this.d : this.e;
            aii aiiVar = abgqVar.o;
            cqg cqgVar = new cqg(j);
            this.a = 1;
            if (aiiVar.f(cqgVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abgp(this.b, this.c, this.d, this.e, aolnVar);
    }
}
