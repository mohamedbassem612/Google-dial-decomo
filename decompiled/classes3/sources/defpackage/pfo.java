package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pfo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pfo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        defpackage.pgf pgfVar = (defpackage.pgf) list.get(2);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.pfi.a.b().l("com/android/dialer/incall/bubble/service/BubbleModelProducerModule", "produceIsBubbleFeatureEnabledForCall", 327, "BubbleModelProducerModule.java").v("Not showing bubble in Android S+.");
        } else if (pgfVar.g.get()) {
            defpackage.pfi.a.b().l("com/android/dialer/incall/bubble/service/BubbleModelProducerModule", "produceIsBubbleFeatureEnabledForCall", 331, "BubbleModelProducerModule.java").v("bubble is dismissed for the rest of the call, not showing");
        } else if (!android.provider.Settings.canDrawOverlays(context)) {
            defpackage.pfi.a.b().l("com/android/dialer/incall/bubble/service/BubbleModelProducerModule", "produceIsBubbleFeatureEnabledForCall", 335, "BubbleModelProducerModule.java").v("cannot show bubble - no permission");
        } else if (!zBooleanValue) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
