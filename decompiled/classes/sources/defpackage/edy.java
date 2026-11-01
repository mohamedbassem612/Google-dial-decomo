package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class edy extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.eei b;
    final /* synthetic */ boolean c;
    final /* synthetic */ defpackage.aonn d;
    final /* synthetic */ defpackage.gjy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edy(defpackage.eei eeiVar, defpackage.gjy gjyVar, boolean z, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = eeiVar;
        this.e = gjyVar;
        this.c = z;
        this.d = aonnVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.edy) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.edx edxVar = new defpackage.edx(this.c, this.b, this.d, null);
        this.a = 1;
        java.lang.Object objO = defpackage.dpy.o(edxVar, this);
        return objO == aoluVar ? aoluVar : objO;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.edy(this.b, this.e, this.c, this.d, aolnVar);
    }
}
