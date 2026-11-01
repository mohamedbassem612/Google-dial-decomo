package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfp extends amzm {
    private final amzg b;
    private final amzg c;

    public pfp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pfp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        hkw hkwVar = (hkw) list.get(0);
        tkl tklVar = (tkl) list.get(1);
        if (hkwVar != hkw.b) {
            j$.util.Optional optionalE = tklVar.e();
            if (!optionalE.isPresent()) {
                defpackage.pfi.a.b().l("com/android/dialer/incall/bubble/service/BubbleModelProducerModule", "produceIsInCallUiHidden", 377, "BubbleModelProducerModule.java").v("cannot show bubble, legacyInCallUiShowing state is not present");
            } else if (!((java.lang.Boolean) optionalE.orElseThrow()).booleanValue()) {
                defpackage.pfi.a.b().l("com/android/dialer/incall/bubble/service/BubbleModelProducerModule", "produceIsInCallUiHidden", 383, "BubbleModelProducerModule.java").v("show bubble, LegacyInCallUi is not showing");
            }
            return aiql.z(java.lang.Boolean.valueOf(z));
        }
        defpackage.pfi.a.b().l("com/android/dialer/incall/bubble/service/BubbleModelProducerModule", "produceIsInCallUiHidden", 372, "BubbleModelProducerModule.java").v("showing bubble in StartingUiMode.BUBBLE");
        z = true;
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
