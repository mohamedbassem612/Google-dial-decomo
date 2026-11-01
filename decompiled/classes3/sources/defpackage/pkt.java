package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkt extends amzm {
    private final amzg b;

    public pkt(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkt.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        try {
            jxb jxbVarA = jxa.a((android.os.Bundle) obj);
            optionalEmpty = (jxbVarA == null || (jxbVarA.c & 8388608) == 0) ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Long.valueOf(jxbVarA.y));
        } catch (java.lang.IllegalArgumentException e) {
            defpackage.piz.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).k(e).l("com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceOutgoingCallRequestId", 257, "CallInfoProducerModule.java").v("Failed to retrieve CallSpecificAppData");
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
