package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zqw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public zqw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.zqw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.zqx zqxVar;
        java.util.List list = (java.util.List) obj;
        defpackage.zqu zquVar = (defpackage.zqu) list.get(0);
        defpackage.zqy zqyVar = (defpackage.zqy) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        aooh.f(zquVar, "dialingConnectivity");
        aooh.f(zqyVar, "enabledFn");
        if (!zqyVar.a()) {
            zqxVar = defpackage.zqx.a;
        } else if (zBooleanValue) {
            defpackage.zqv.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/dialershared/incall/dialingconnectivity/DialingConnectivityProducerModule", "produceDialingConnectivityState", 32, "DialingConnectivityProducerModule.kt").v("No dialing connectivity state due to WiFi call.");
            zqxVar = defpackage.zqx.a;
        } else {
            zqxVar = zquVar.h;
        }
        return aiql.z(zqxVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
