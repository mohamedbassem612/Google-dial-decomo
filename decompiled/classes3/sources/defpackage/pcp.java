package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pcp extends amzm {
    private final amzg b;
    private final amzg c;

    public pcp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pcp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        zms zmsVar = (zms) list.get(0);
        aify aifyVar = (aify) list.get(1);
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(aifyVar, "bluetoothDevicesEligibleForAudioTransfer");
        if (zmsVar.c().contains(defpackage.zmw.ROUTE_BLUETOOTH) && (zmsVar.b().isEmpty() || !aifyVar.isEmpty())) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
