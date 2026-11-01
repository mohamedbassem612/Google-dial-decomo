package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public mxp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.mxp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        qiv qivVar;
        java.util.List list = (java.util.List) obj;
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        aooh.f(nmoVar, "lifecycleState");
        if ((nmoVar == defpackage.nmo.AUTO_SCREENING || nmoVar == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) && zBooleanValue) {
            qivVar = new qiv(true);
        } else {
            qivVar = null;
            if (zBooleanValue2 && nmoVar == defpackage.nmo.MANUAL_SCREENING) {
                qivVar = new qiv(true);
            }
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(qivVar);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
