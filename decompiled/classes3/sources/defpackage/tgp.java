package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tgp extends aomh implements aono {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ aoot b;
    final /* synthetic */ defpackage.tgq c;
    final /* synthetic */ aenj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgp(aoot aootVar, defpackage.tgq tgqVar, aenj aenjVar, aoln aolnVar) {
        super(3, aolnVar);
        this.b = aootVar;
        this.c = tgqVar;
        this.d = aenjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.tgp tgpVar = new defpackage.tgp(this.b, this.c, this.d, (aoln) obj3);
        tgpVar.a = (java.lang.Throwable) obj2;
        return tgpVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        rub rubVar = this.a instanceof java.util.concurrent.CancellationException ? rub.d : rub.c;
        aoot aootVar = this.b;
        aeun aeunVar = (aeun) aootVar.a;
        if (aeunVar != null) {
            this.c.c.q(aeunVar, this.d, rubVar);
        }
        aootVar.a = null;
        return aojh.a;
    }
}
