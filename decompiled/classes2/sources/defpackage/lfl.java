package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfl extends amzm {
    private final amzg b;
    private final amzg c;

    public lfl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.lfl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.adog adogVar;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        if (((java.lang.Boolean) optional.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
            defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallType", 717, "CallScreenProducerModule.java").v("CallScreening as VOIP call");
            adogVar = defpackage.adog.c;
        } else if (zBooleanValue) {
            defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallType", 722, "CallScreenProducerModule.java").v("CallScreening as VOICE_HD call");
            adogVar = defpackage.adog.b;
        } else {
            defpackage.lfa.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenProducerModule", "produceCallType", 726, "CallScreenProducerModule.java").v("CallScreening as VOICE call");
            adogVar = defpackage.adog.a;
        }
        return aiql.z(adogVar);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
