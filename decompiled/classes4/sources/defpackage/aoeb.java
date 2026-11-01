package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoeb extends aomh implements aonn {
    int a;
    final /* synthetic */ anmb b;
    final /* synthetic */ anmc c;
    final /* synthetic */ defpackage.anpk d;
    final /* synthetic */ anph e;
    final /* synthetic */ vqf f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoeb(anmb anmbVar, anmc anmcVar, defpackage.anpk anpkVar, anph anphVar, vqf vqfVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = anmbVar;
        this.c = anmcVar;
        this.d = anpkVar;
        this.e = anphVar;
        this.f = vqfVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.aoea aoeaVar = new defpackage.aoea(this.b, this.c, this.d, this.e, (aoxi) this.g, this.f, null);
            this.a = 1;
            if (aosv.m(aoeaVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aoeb aoebVar = new defpackage.aoeb(this.b, this.c, this.d, this.e, this.f, aolnVar);
        aoebVar.g = obj;
        return aoebVar;
    }
}
