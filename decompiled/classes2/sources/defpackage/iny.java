package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iny {
    private static final aimz a = aimz.i("com/android/dialer/autoassistedemergencycall/impl/SafetyHubAutoAssistedEmergencyCallDataParser");

    public final j$.util.Optional a(android.os.Bundle bundle) {
        if (bundle == null) {
            a.b().l("com/android/dialer/autoassistedemergencycall/impl/SafetyHubAutoAssistedEmergencyCallDataParser", "getAutoAssistedEmergencyCallData", 55, "SafetyHubAutoAssistedEmergencyCallDataParser.java").v("Failed to return data - bundle is null");
            return j$.util.Optional.empty();
        }
        if (!bundle.containsKey("AUTO_ASSISTED_EMERGENCY_CALL_DATA_KEY")) {
            a.b().l("com/android/dialer/autoassistedemergencycall/impl/SafetyHubAutoAssistedEmergencyCallDataParser", "getAutoAssistedEmergencyCallData", 59, "SafetyHubAutoAssistedEmergencyCallDataParser.java").v("Failed to return data - bundle does not contain Assisted emergency call data");
            return j$.util.Optional.empty();
        }
        try {
            return j$.util.Optional.of((defpackage.ioa) alad.B(defpackage.ioa.a, bundle.getByteArray("AUTO_ASSISTED_EMERGENCY_CALL_DATA_KEY"), akzq.a()));
        } catch (alaz e) {
            a.bq(a.c(), "Failed to parse Proto from bundle", "com/android/dialer/autoassistedemergencycall/impl/SafetyHubAutoAssistedEmergencyCallDataParser", "getAutoAssistedEmergencyCallData", 'E', "SafetyHubAutoAssistedEmergencyCallDataParser.java", e, zct.b);
            return j$.util.Optional.empty();
        }
    }

    public final j$.util.Optional b(android.os.Bundle bundle) {
        if (bundle == null) {
            a.b().l("com/android/dialer/autoassistedemergencycall/impl/SafetyHubAutoAssistedEmergencyCallDataParser", "getPendingIntent", 99, "SafetyHubAutoAssistedEmergencyCallDataParser.java").v("Failed to return pending intent - bundle is null");
            return j$.util.Optional.empty();
        }
        if (bundle.containsKey("AUTO_ASSISTED_EMERGENCY_CALL_PENDING_INTENT_KEY")) {
            return j$.util.Optional.of((android.app.PendingIntent) bundle.getParcelable("AUTO_ASSISTED_EMERGENCY_CALL_PENDING_INTENT_KEY"));
        }
        a.b().l("com/android/dialer/autoassistedemergencycall/impl/SafetyHubAutoAssistedEmergencyCallDataParser", "getPendingIntent", 103, "SafetyHubAutoAssistedEmergencyCallDataParser.java").v("Failed to return data - bundle does not contain assisted emergency call pending intent");
        return j$.util.Optional.empty();
    }

    public final void c(android.os.Bundle bundle, defpackage.iob iobVar) {
        ahvr.ci(iobVar);
        bundle.putByteArray("SAFETY_HUB_RETURNED_DATA_KEY", iobVar.i());
    }
}
