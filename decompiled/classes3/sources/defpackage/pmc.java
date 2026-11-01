package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pmc extends amzm {
    private final amzg b;
    private final amzg c;

    public pmc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pmc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        if (details.can(134217728) && optional.isPresent() && ((android.os.PersistableBundle) optional.orElseThrow()).getBoolean("carrier_allow_transfer_ims_call_bool", false)) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
