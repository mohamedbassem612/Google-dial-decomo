package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kys extends amzm {
    private final amzg b;
    private final amzg c;

    public kys(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.kys.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        aihd aihdVar = (aihd) list.get(1);
        if (!optional.isPresent()) {
            defpackage.kyq.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceIsCallInAutoRecordContactsList", 112, "CallRecordingProducerModule.java").v("missing DialerPhoneNumber");
        } else if (aihdVar.contains(((defpackage.hkd) optional.orElseThrow()).c)) {
            defpackage.kyq.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceIsCallInAutoRecordContactsList", 117, "CallRecordingProducerModule.java").v("in list");
            z = true;
        } else {
            defpackage.kyq.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceIsCallInAutoRecordContactsList", 120, "CallRecordingProducerModule.java").v("not in list");
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
