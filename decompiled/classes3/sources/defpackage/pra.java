package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pra extends amzm {
    private final amzg b;

    public pra(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pra.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.net.Uri handle = ((android.telecom.Call) obj).getDetails().getHandle();
        if (handle == null) {
            handle = android.net.Uri.EMPTY;
        }
        return aiql.z(handle);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
