package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxq extends amzm {
    private final amzg b;
    private final amzg c;

    public mxq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.mxq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.nmo nmoVar = (defpackage.nmo) list.get(0);
        tkl tklVar = (tkl) list.get(1);
        aooh.f(nmoVar, "lifecycleState");
        aooh.f(tklVar, "inCallUiVisibilityProvider");
        int iOrdinal = nmoVar.ordinal();
        if (iOrdinal == 8 || iOrdinal == 9) {
            j$.util.Optional optionalE = tklVar.e();
            aooh.e(optionalE, "getIsInCallUiShowing(...)");
            if (!((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
                z = true;
            }
        } else if (iOrdinal == 14 || iOrdinal == 15) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
