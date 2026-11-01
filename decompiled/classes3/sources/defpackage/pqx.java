package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqx extends amzm {
    private final amzg b;

    public pqx(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pqx.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        return aiql.z(java.lang.Long.valueOf(((android.telecom.Call) obj).getDetails().getConnectTimeMillis()));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
