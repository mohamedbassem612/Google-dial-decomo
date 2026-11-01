package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pga extends amzm {
    private final amzg b;
    private final amzg c;

    public pga(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pga.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        int iOrdinal;
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.ptx ptxVar = (defpackage.ptx) list.get(0);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(1);
        if (!ptxVar.o() && !ptxVar.n() && !ptxVar.q() && ((iOrdinal = zpoVar.ordinal()) == 2 || iOrdinal == 10 || iOrdinal == 4 || iOrdinal == 5)) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
