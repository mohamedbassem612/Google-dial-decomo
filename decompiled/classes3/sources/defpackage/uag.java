package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uag extends amzm {
    private final amzg b;
    private final amzg c;

    public uag(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.uag.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        tzc tzcVar = (tzc) list.get(0);
        defpackage.uae uaeVar = (defpackage.uae) list.get(1);
        if (tzcVar.a()) {
            return uaeVar.a();
        }
        hgb.c(defpackage.uaf.a.b(), "sonic not enabled, not showing sonic ", "com/android/dialer/sonic/impl/service/SonicProducerModule", "arePreconditionsSatisfied", (char) 152, "SonicProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return aiql.z(java.lang.Boolean.FALSE);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
