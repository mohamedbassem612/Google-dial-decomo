package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oam extends amzm {
    private final amzg b;

    public oam(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.oam.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.telecom.Call.Details details = (android.telecom.Call.Details) obj;
        aooh.f(details, "callDetails");
        return aiql.z(java.lang.Boolean.valueOf(details.hasProperty(1024)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
