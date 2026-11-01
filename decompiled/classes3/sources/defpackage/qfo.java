package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qfo extends amzm {
    private final amzg b;

    public qfo(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qfo.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        aimz aimzVar = defpackage.qfn.a;
        aimzVar.b().l("com/android/dialer/incall/rtt/service/RttChatProducerModule", "produceIsRttDowngradeSupported", 199, "RttChatProducerModule.java").v("Checking call scoped carrier config");
        boolean z = false;
        if (optional.isEmpty()) {
            aimzVar.b().l("com/android/dialer/incall/rtt/service/RttChatProducerModule", "produceIsRttDowngradeSupported", 201, "RttChatProducerModule.java").v("Carrier config is not present");
        } else {
            android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) optional.orElse((java.lang.Object) null);
            if (persistableBundle.getBoolean("rtt_supported_bool")) {
                z = persistableBundle.getBoolean("rtt_downgrade_supported_bool");
                aimzVar.b().l("com/android/dialer/incall/rtt/service/RttChatProducerModule", "produceIsRttDowngradeSupported", 211, "RttChatProducerModule.java").y("RTT downgrade supported: %b", java.lang.Boolean.valueOf(z));
            } else {
                aimzVar.b().l("com/android/dialer/incall/rtt/service/RttChatProducerModule", "produceIsRttDowngradeSupported", 207, "RttChatProducerModule.java").v("RTT not supported at all");
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
