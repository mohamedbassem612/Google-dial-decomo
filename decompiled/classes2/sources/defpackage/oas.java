package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oas extends amzm {
    private final amzg b;

    public oas(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.oas.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        aooh.f(bundle, "intentExtras");
        return aiql.z(java.lang.Boolean.valueOf(bundle.getBoolean("android.telecom.extra.START_CALL_WITH_RTT", false)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
