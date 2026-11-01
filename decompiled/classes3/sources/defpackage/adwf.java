package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adwf extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.adwj b;
    final /* synthetic */ aduy c;
    final /* synthetic */ defpackage.advu d;
    final /* synthetic */ defpackage.aksh e;
    final /* synthetic */ defpackage.adwa f;
    final /* synthetic */ defpackage.aduc g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adwf(defpackage.adwj adwjVar, aduy aduyVar, defpackage.advu advuVar, defpackage.aksh akshVar, defpackage.adwa adwaVar, defpackage.aduc aducVar, long j, long j2, aoln aolnVar) {
        super(2, aolnVar);
        this.b = adwjVar;
        this.c = aduyVar;
        this.d = advuVar;
        this.e = akshVar;
        this.f = adwaVar;
        this.g = aducVar;
        this.h = j;
        this.i = j2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.adtl adtlVar = (defpackage.adtl) ((ahyn) this.b.b.b).b();
            int i2 = this.f.b;
            this.a = 1;
            if (adtlVar.b() == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.adwf(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, aolnVar);
    }
}
