package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svc extends amzm {
    private final amzg b;

    public svc(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.svc.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.Set set = (java.util.Set) obj;
        aooh.f(set, "preferredSims");
        return aiql.z((android.telecom.PhoneAccountHandle) ajsz.bN(set));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
