package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class akm extends aomh implements aonj {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.akr d;
    final /* synthetic */ alg e;
    final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akm(java.lang.Object obj, java.lang.Object obj2, defpackage.akr akrVar, alg algVar, float f, aoln aolnVar) {
        super(1, aolnVar);
        this.b = obj;
        this.c = obj2;
        this.d = akrVar;
        this.e = algVar;
        this.f = f;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.akm(this.b, this.c, this.d, this.e, this.f, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.akl aklVar = new defpackage.akl(this.b, this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if (aosv.m(aklVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
