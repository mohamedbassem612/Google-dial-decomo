package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pro extends amzm {
    private final amzg b;
    private final amyz c;

    public pro(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pro.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Iterable, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        if (zBooleanValue) {
            aimz aimzVar = defpackage.pqv.a;
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceFirstForwardedNumber", 327, "CallProducerModule.java").v("produceFirstForwardedNumber called");
            aimzVar.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceFirstForwardedNumber", 328, "CallProducerModule.java").y("callExtras: %s", bundle);
        }
        if (bundle.containsKey("android.telecom.extra.LAST_FORWARDED_NUMBER")) {
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                if (zBooleanValue) {
                    defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "getForwardedNumbersList", 367, "CallProducerModule.java").v("EXTRA_LAST_FORWARDED_NUMBER list is null or empty in CallExtras");
                }
                optionalEmpty = j$.util.Optional.empty();
            } else {
                if (zBooleanValue) {
                    defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "getForwardedNumbersList", 374, "CallProducerModule.java").y("EXTRA_LAST_FORWARDED_NUMBER list found in CallExtras: %s", stringArrayList);
                }
                optionalEmpty = j$.util.Optional.of(stringArrayList);
            }
        } else {
            if (zBooleanValue) {
                defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "getForwardedNumbersList", 356, "CallProducerModule.java").v("EXTRA_LAST_FORWARDED_NUMBER key missing in CallExtras");
            }
            optionalEmpty = j$.util.Optional.empty();
        }
        if (true == optionalEmpty.isPresent()) {
            optionalEmpty = j$.util.Optional.ofNullable((java.lang.String) ahvr.bj((java.lang.Iterable) optionalEmpty.get(), ""));
        }
        if (true == optionalEmpty.isPresent() && android.text.TextUtils.isEmpty((java.lang.String) optionalEmpty.get())) {
            optionalEmpty = j$.util.Optional.empty();
        }
        defpackage.pqr pqrVar = new defpackage.pqr(zBooleanValue, 0);
        if (true == optionalEmpty.isPresent()) {
            java.lang.String str = (java.lang.String) optionalEmpty.get();
            if (pqrVar.a) {
                defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceFirstForwardedNumber", 340, "CallProducerModule.java").y("getForwardedNumbersList result (CallExtras): %s", str);
            }
            optionalEmpty = j$.util.Optional.ofNullable(str);
        }
        if (zBooleanValue && !optionalEmpty.isPresent()) {
            defpackage.pqv.a.b().l("com/android/dialer/incall/core/call/CallProducerModule", "produceFirstForwardedNumber", 346, "CallProducerModule.java").v("no forwarded number found");
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
