package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvk extends amzm {
    private final amzg b;
    private final amzg c;

    public hvk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.hvk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        hvy hvyVar = (hvy) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        aooh.f(hvyVar, "voiceAssistAudioGenerator");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(java.lang.Boolean.valueOf(hvyVar.f));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
