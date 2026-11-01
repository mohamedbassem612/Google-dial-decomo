package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psd extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;

    public psd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.psd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.pqp pqpVar = (defpackage.pqp) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        mgu mguVar = (mgu) list.get(2);
        if (((java.lang.Boolean) this.e.a()).booleanValue()) {
            aimz aimzVar = defpackage.pqv.a;
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceIsForwardedCall", 389, "CallProducerModule.java").v("produceIsForwardedCall called");
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceIsForwardedCall", 392, "CallProducerModule.java").y("callForwardedManager.isCallForwarded(): %s", java.lang.Boolean.valueOf(pqpVar.b()));
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceIsForwardedCall", 396, "CallProducerModule.java").y("lastForwardedNumber.isPresent(): %s", java.lang.Boolean.valueOf(optional.isPresent()));
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceIsForwardedCall", 397, "CallProducerModule.java").y("lastForwardedNumber: %s", optional.orElse("empty"));
        }
        java.lang.Boolean bool = (java.lang.Boolean) new mgf(mguVar, pqpVar.b() || optional.isPresent()).a(mfy.V).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
