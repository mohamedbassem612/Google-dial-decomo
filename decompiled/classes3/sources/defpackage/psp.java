package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psp extends amzm {
    private final amzg b;
    private final amyz c;

    public psp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.psp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        if (zBooleanValue) {
            aimz aimzVar = defpackage.pqv.a;
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceLastForwardedNumber", 282, "CallProducerModule.java").v("produceLastForwardedNumber called");
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceLastForwardedNumber", 283, "CallProducerModule.java").y("callExtras: %s", bundle);
        }
        if (bundle.containsKey("android.telecom.extra.LAST_FORWARDED_NUMBER")) {
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                if (zBooleanValue) {
                    defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceLastForwardedNumber", 300, "CallProducerModule.java").v("EXTRA_LAST_FORWARDED_NUMBER list is null or empty");
                }
                optionalEmpty = j$.util.Optional.empty();
            } else {
                if (zBooleanValue) {
                    defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceLastForwardedNumber", 308, "CallProducerModule.java").y("EXTRA_LAST_FORWARDED_NUMBER list found: %s", stringArrayList);
                }
                java.lang.String str = (java.lang.String) ahvr.bk(stringArrayList);
                optionalEmpty = android.text.TextUtils.isEmpty(str) ? j$.util.Optional.empty() : j$.util.Optional.of(str);
            }
        } else {
            if (zBooleanValue) {
                defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceLastForwardedNumber", 288, "CallProducerModule.java").v("EXTRA_LAST_FORWARDED_NUMBER key missing");
            }
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
