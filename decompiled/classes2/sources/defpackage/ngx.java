package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngx extends amzm {
    private final amzg b;

    public ngx(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.ngx.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        aooh.f(optional, "disconnectionCause");
        android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) aooh.q(optional);
        boolean z = false;
        if (disconnectCause != null && disconnectCause.getCode() == 6) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
