package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pco extends amzm {
    private final amzg b;
    private final amzg c;

    public pco(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pco.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        int iOrdinal;
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.zmw zmwVar = (defpackage.zmw) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        aooh.f(zmwVar, "callAudioRoute");
        if (!zBooleanValue ? zmwVar == defpackage.zmw.ROUTE_SPEAKER : !((iOrdinal = zmwVar.ordinal()) != 1 && iOrdinal != 2 && iOrdinal != 3)) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
