package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxs extends aomh implements aonn {
    /* synthetic */ boolean a;
    final /* synthetic */ defpackage.bwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxs(defpackage.bwj bwjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = bwjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return c(bool, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        boolean z = this.a;
        aooc.af(obj);
        if (!z) {
            this.b.b();
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bxs bxsVar = new defpackage.bxs(this.b, aolnVar);
        bxsVar.a = ((java.lang.Boolean) obj).booleanValue();
        return bxsVar;
    }
}
