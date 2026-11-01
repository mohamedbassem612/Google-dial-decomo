package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hca extends aomh implements aonj {
    final /* synthetic */ defpackage.hcb a;
    final /* synthetic */ defpackage.gzh b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hca(defpackage.hcb hcbVar, defpackage.gzh gzhVar, float f, int i, boolean z, aoln aolnVar) {
        super(1, aolnVar);
        this.a = hcbVar;
        this.b = gzhVar;
        this.c = f;
        this.d = i;
        this.e = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.hca(this.a, this.b, this.c, this.d, this.e, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        defpackage.hcb hcbVar = this.a;
        hcbVar.j(this.b);
        hcbVar.n(this.c);
        hcbVar.k(this.d);
        hcbVar.m(false);
        if (this.e) {
            hcbVar.l(Long.MIN_VALUE);
        }
        return aojh.a;
    }
}
