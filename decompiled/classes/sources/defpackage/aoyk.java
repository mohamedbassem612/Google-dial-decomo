package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoyk extends defpackage.aomh implements defpackage.aonn {
    /* synthetic */ int a;

    public aoyk(defpackage.aoln aolnVar) {
        super(2, aolnVar);
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aoyk) c(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()), (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        return java.lang.Boolean.valueOf(this.a > 0);
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aoyk aoykVar = new defpackage.aoyk(aolnVar);
        aoykVar.a = ((java.lang.Number) obj).intValue();
        return aoykVar;
    }
}
