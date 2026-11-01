package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class akl extends aomh implements aonn {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.akr d;
    final /* synthetic */ alg e;
    final /* synthetic */ float f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akl(java.lang.Object obj, java.lang.Object obj2, defpackage.akr akrVar, alg algVar, float f, aoln aolnVar) {
        super(2, aolnVar);
        this.b = obj;
        this.c = obj2;
        this.d = akrVar;
        this.e = algVar;
        this.f = f;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aoss aossVar = (aoss) this.g;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.c;
            boolean zN = aooh.n(obj2, obj3);
            defpackage.akr akrVar = this.d;
            if (zN) {
                akrVar.g = null;
                if (aooh.n(akrVar.a(), obj2)) {
                    return aojh.a;
                }
            } else {
                akrVar.n();
            }
            if (!aooh.n(obj2, obj3)) {
                alg algVar = this.e;
                algVar.z(obj2);
                algVar.s(0L);
                this.d.s(obj2);
                algVar.p(this.f);
            }
            defpackage.akr akrVar2 = this.d;
            akrVar2.q(this.f);
            if (akrVar2.k.g()) {
                aoov.an(aossVar, (aolr) null, 0, new defpackage.ahb(akrVar2, (aoln) null, 5), 3);
            } else {
                akrVar2.f = Long.MIN_VALUE;
            }
            this.g = null;
            this.a = 1;
            if (akrVar2.l(this) == aoluVar) {
                return aoluVar;
            }
        }
        this.d.p();
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.akl aklVar = new defpackage.akl(this.b, this.c, this.d, this.e, this.f, aolnVar);
        aklVar.g = obj;
        return aklVar;
    }
}
