package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eff extends defpackage.aomh implements defpackage.aono {
    int a;
    private /* synthetic */ java.lang.Object b;

    public eff(defpackage.aoln aolnVar) {
        super(3, aolnVar);
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Boolean) obj2).booleanValue();
        defpackage.eff effVar = new defpackage.eff((defpackage.aoln) obj3);
        effVar.b = (defpackage.eem) obj;
        return effVar.b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        java.lang.Object obj2 = this.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        this.b = null;
        this.a = 1;
        defpackage.eem eemVar = (defpackage.eem) obj2;
        eemVar.b();
        java.lang.Object objN = defpackage.dpy.n(eemVar.a, new defpackage.eel(eemVar, null), this);
        return objN == aoluVar ? aoluVar : objN;
    }
}
