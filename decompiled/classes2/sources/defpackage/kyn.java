package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kyn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amyz l;

    public kyn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amyz amyzVar3) {
        super(amyzVar2, new amzw(defpackage.kyn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(5)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(6);
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(7)).booleanValue();
        boolean zBooleanValue7 = ((java.lang.Boolean) list.get(8)).booleanValue();
        boolean zBooleanValue8 = ((java.lang.Boolean) list.get(9)).booleanValue();
        if (zBooleanValue4) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 73, "CallRecordingInternalProducerModule.java").v("recording not available: emergency call");
        } else if (zBooleanValue5) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 78, "CallRecordingInternalProducerModule.java").v("recording not available: emergency callback");
        } else if (zBooleanValue3) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 83, "CallRecordingInternalProducerModule.java").v("recording not available: child of conference call");
        } else if (zBooleanValue) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 88, "CallRecordingInternalProducerModule.java").v("recording not available: multiple calls in progress");
        } else if (zBooleanValue2) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 93, "CallRecordingInternalProducerModule.java").v("recording not available: conference call");
        } else if (zBooleanValue6) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 104, "CallRecordingInternalProducerModule.java").v("recording not available: CDMA network");
        } else if (zBooleanValue7) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 109, "CallRecordingInternalProducerModule.java").v("recording not available: video call");
        } else if (zBooleanValue8) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 114, "CallRecordingInternalProducerModule.java").v("recording not available: RTT call");
        } else if (lnr.a(optional2) && !((java.lang.Boolean) this.l.a()).booleanValue()) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 124, "CallRecordingInternalProducerModule.java").v("recording not available: Fi call");
        } else if (!optional.isPresent()) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 129, "CallRecordingInternalProducerModule.java").v("recording not available: feature not present");
        } else if (((kva) optional.orElseThrow()).a()) {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 138, "CallRecordingInternalProducerModule.java").v("recording available");
            z = true;
        } else {
            defpackage.kyj.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingInternalProducerModule", "produceIsCallRecordingAvailableInternal", 134, "CallRecordingInternalProducerModule.java").v("recording not available: canRecord returned false");
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.k;
        amzg amzgVar2 = this.j;
        amzg amzgVar3 = this.i;
        amzg amzgVar4 = this.h;
        amzg amzgVar5 = this.g;
        amzg amzgVar6 = this.f;
        amzg amzgVar7 = this.e;
        amzg amzgVar8 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
