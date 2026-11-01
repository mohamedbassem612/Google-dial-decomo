package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afnv extends aomh implements aonn {
    /* synthetic */ int a;
    final /* synthetic */ defpackage.afov b;
    final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnv(defpackage.afov afovVar, java.lang.String str, aoln aolnVar) {
        super(2, aolnVar);
        this.b = afovVar;
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()), (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        java.lang.String str = this.c;
        int i = this.a;
        aooh.f(str, "clusterId");
        defpackage.afov afovVar = this.b;
        aoov.an(afovVar.a, (aolr) null, 0, new kgx(afovVar, str, i, (aoln) null, 12), 3);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.afnv afnvVar = new defpackage.afnv(this.b, this.c, aolnVar);
        afnvVar.a = ((java.lang.Number) obj).intValue();
        return afnvVar;
    }
}
