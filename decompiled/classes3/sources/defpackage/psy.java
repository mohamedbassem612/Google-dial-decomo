package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psy extends amzm {
    private final amzg b;

    public psy(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.psy.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        return aiql.z(j$.util.Optional.ofNullable(((android.os.Bundle) obj).getString("com.android.companion.datatransfer.contextsync.extra.CALL_ID")));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
