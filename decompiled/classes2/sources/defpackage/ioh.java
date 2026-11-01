package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ioh implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/HandoverSMSToSafetyHubEnabledFn");
    private final aoin b;

    public ioh(aoin aoinVar) {
        this.b = aoinVar;
    }

    public final boolean a() {
        if (!a.o()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/HandoverSMSToSafetyHubEnabledFn", "isEnabled", 25, "HandoverSMSToSafetyHubEnabledFn.kt").v("unsupported SDK");
            return false;
        }
        java.lang.Object objA = this.b.a();
        aooh.e(objA, "get(...)");
        if (((java.lang.Boolean) objA).booleanValue()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/listener/HandoverSMSToSafetyHubEnabledFn", "isEnabled", 32, "HandoverSMSToSafetyHubEnabledFn.kt").v("disabled because enable_sms_handover_to_safetyhub flag is disabled.");
        return false;
    }
}
