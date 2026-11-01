package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pru extends amzm {
    private final amzg b;

    public pru(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pru.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.os.Bundle intentExtras = ((android.telecom.Call) obj).getDetails().getIntentExtras();
        if (intentExtras == null) {
            intentExtras = android.os.Bundle.EMPTY;
        }
        return aiql.z(intentExtras);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
