package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zqy implements zcr {
    private static final aimz a = aimz.i("com/google/android/dialershared/incall/dialingconnectivity/enabledfn/DialingConnectivityEnabledFn");
    private final aoin b;

    public zqy(aoin aoinVar) {
        this.b = aoinVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/dialershared/incall/dialingconnectivity/enabledfn/DialingConnectivityEnabledFn", "isEnabled", 22, "DialingConnectivityEnabledFn.kt").v("Feature unavailable, SDK too low.");
            return false;
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.b.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/dialershared/incall/dialingconnectivity/enabledfn/DialingConnectivityEnabledFn", "isEnabled", 31, "DialingConnectivityEnabledFn.kt").v("Feature enabled.");
            return true;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/dialershared/incall/dialingconnectivity/enabledfn/DialingConnectivityEnabledFn", "isEnabled", 27, "DialingConnectivityEnabledFn.kt").v("Feature disabled, flag disabled.");
        return false;
    }
}
