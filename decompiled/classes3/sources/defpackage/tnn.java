package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tnn extends amzm {
    private final amzg b;

    public tnn(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.tnn.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.Object objPrevious;
        defpackage.zlr zlrVar = (defpackage.zlr) obj;
        java.util.Set set = defpackage.tna.a;
        aooh.f(zlrVar, "sharpieState");
        alat alatVar = zlrVar.m().d;
        aooh.e(alatVar, "getScamAlertsList(...)");
        java.util.ListIterator listIterator = alatVar.listIterator(alatVar.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            int iW = a.W(((defpackage.ttf) objPrevious).e);
            if (iW == 0) {
                iW = 1;
            }
            if (iW == 3) {
                return aiql.z((defpackage.ttf) objPrevious);
            }
        }
        objPrevious = null;
        return aiql.z((defpackage.ttf) objPrevious);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
