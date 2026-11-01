package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class prn extends amzm {
    private final amzg b;

    public prn(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.prn.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.os.Bundle extras = ((android.telecom.Call) obj).getDetails().getExtras();
        if (extras == null) {
            extras = android.os.Bundle.EMPTY;
        }
        return aiql.z(extras);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
