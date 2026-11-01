package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class apq extends aomh implements aono {
    int a;
    final /* synthetic */ aonn b;
    final /* synthetic */ defpackage.apt c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apq(aonn aonnVar, defpackage.apt aptVar, aoln aolnVar) {
        super(3, aolnVar);
        this.b = aonnVar;
        this.c = aptVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.apq apqVar = new defpackage.apq(this.b, this.c, (aoln) obj3);
        apqVar.d = (defpackage.apx) obj;
        return apqVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2 = this.d;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aonn aonnVar = this.b;
            nz nzVar = new nz(this.c, obj2, 19);
            this.d = null;
            this.a = 1;
            if (aonnVar.a(nzVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
