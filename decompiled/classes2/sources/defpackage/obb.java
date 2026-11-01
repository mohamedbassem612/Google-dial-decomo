package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public obb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.obb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(0)).booleanValue();
        tcp tcpVar = (tcp) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        aooh.f(tcpVar, "rttConfiguration");
        aooh.f(optional, "shouldUseAssistedEmergencyDialingFeature");
        if (zBooleanValue2) {
            zBooleanValue = (tcpVar == tcp.d || tcpVar == tcp.c) ? true : ((java.lang.Boolean) aooh.p(optional, java.lang.Boolean.FALSE)).booleanValue();
        }
        return aiql.z(java.lang.Boolean.valueOf(zBooleanValue));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
