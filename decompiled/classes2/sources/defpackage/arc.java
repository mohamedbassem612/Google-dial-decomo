package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class arc extends aomg implements aonn {
    int a;
    final /* synthetic */ aomy b;
    final /* synthetic */ aono c;
    final /* synthetic */ aonn d;
    final /* synthetic */ aomy e;
    final /* synthetic */ aonj f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arc(aomy aomyVar, aono aonoVar, aonn aonnVar, aomy aomyVar2, aonj aonjVar, aoln aolnVar) {
        super(aolnVar);
        this.b = aomyVar;
        this.c = aonoVar;
        this.d = aonnVar;
        this.e = aomyVar2;
        this.f = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        cwc cwcVar = (cwc) this.g;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            if (i == 1) {
            }
            return aojh.a;
        }
        defpackage.cvg cvgVar = defpackage.cvg.a;
        this.g = cwcVar;
        this.a = 1;
        obj = defpackage.atv.b(cwcVar, false, cvgVar, false, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        aono aonoVar = this.c;
        aonn aonnVar = this.d;
        aomy aomyVar = this.e;
        aonj aonjVar = this.f;
        this.g = null;
        this.a = 2;
        if (defpackage.ro.p(cwcVar, (defpackage.cvm) obj, aonoVar, aonnVar, aomyVar, aonjVar, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.arc arcVar = new defpackage.arc(this.b, this.c, this.d, this.e, this.f, aolnVar);
        arcVar.g = obj;
        return arcVar;
    }
}
