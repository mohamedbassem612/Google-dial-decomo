package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class apo extends aomh implements aonp {
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    public apo(aoln aolnVar) {
        super(4, aolnVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.apo apoVar = new defpackage.apo((aoln) obj4);
        apoVar.c = (defpackage.apx) obj;
        apoVar.a = (defpackage.aqj) obj2;
        apoVar.b = obj3;
        return apoVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = this.a;
        java.lang.Object obj4 = this.b;
        aooc.af(obj);
        float fC = ((defpackage.aqj) obj3).c(obj4);
        if (!java.lang.Float.isNaN(fC)) {
            ((defpackage.apx) obj2).a(fC, 0.0f);
        }
        return aojh.a;
    }
}
