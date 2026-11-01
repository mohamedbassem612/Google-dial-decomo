package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uys extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public uys(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.uys.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        defpackage.zlr zlrVar = (defpackage.zlr) list.get(1);
        defpackage.uyp uypVar = (defpackage.uyp) list.get(2);
        if (!((java.util.concurrent.atomic.AtomicBoolean) zlrVar.b).get() && zBooleanValue && uypVar != defpackage.uyp.LTE_TO_WIFI && (uypVar == defpackage.uyp.WIFI_TO_LTE || uypVar == defpackage.uyp.LTE_TO_WIFI_FAILED)) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
