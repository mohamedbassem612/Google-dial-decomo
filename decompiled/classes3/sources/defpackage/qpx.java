package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qpx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public qpx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.qpx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        java.lang.Boolean bool = (java.lang.Boolean) list.get(0);
        boolean zBooleanValue = bool.booleanValue();
        java.lang.Boolean bool2 = (java.lang.Boolean) list.get(1);
        boolean zBooleanValue2 = bool2.booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        long jLongValue = ((java.lang.Long) list.get(3)).longValue();
        if (((defpackage.pgi) list.get(5)).b() && optional.isPresent()) {
            if (j$.time.Instant.now().toEpochMilli() - jLongValue > 5000) {
                defpackage.qpv.a.b().l("com/android/dialer/incall/video/nomobiledata/service/VideoProducerModule", "produceIsVideoCallFailedDueToNoMobileData", 62, "VideoProducerModule.java").v("timeout for IsVideoCallFailedDueToNoMobileData");
            } else {
                defpackage.qpv.a.b().l("com/android/dialer/incall/video/nomobiledata/service/VideoProducerModule", "produceIsVideoCallFailedDueToNoMobileData", 67, "VideoProducerModule.java").M("wasInitiatedAsVideoCall: %b, isActiveVideoCall: %b, isMobileDataEnabled: %b", bool, bool2, optional.orElseThrow());
                if (zBooleanValue && !zBooleanValue2 && !((java.lang.Boolean) optional.orElseThrow()).booleanValue()) {
                    z = true;
                }
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
