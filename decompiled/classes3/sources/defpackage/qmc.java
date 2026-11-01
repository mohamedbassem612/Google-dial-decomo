package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmc extends amzm {
    private final amzg b;
    private final amzg c;

    public qmc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qmc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        aooh.f(aihdVar, "safeContents");
        java.util.Comparator comparatorComparing = j$.util.Comparator.-CC.comparing(new defpackage.pei(new aoom() { // from class: qku
            public final java.lang.Object b(java.lang.Object obj2) {
                return ((defpackage.qin) obj2).a;
            }
        }, 9));
        aooh.e(comparatorComparing, "comparing(...)");
        defpackage.qin qinVar = (defpackage.qin) ajsz.bK(aihdVar, comparatorComparing);
        return qinVar != null ? aiql.z(qinVar) : this.c.d();
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
