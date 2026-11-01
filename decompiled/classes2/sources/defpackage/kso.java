package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kso implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/calloptions/enabledfn/CallOptionsEnabledFn");
    private final aoin b;
    private final zzx c;

    public kso(aoin aoinVar, zzx zzxVar) {
        this.b = aoinVar;
        this.c = zzxVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calloptions/enabledfn/CallOptionsEnabledFn", "isEnabled", 31, "CallOptionsEnabledFn.kt").v("disabled: requires Android T+");
            return false;
        }
        if (this.c.m()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calloptions/enabledfn/CallOptionsEnabledFn", "isEnabled", 36, "CallOptionsEnabledFn.kt").v("disabled in direct boot mode");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calloptions/enabledfn/CallOptionsEnabledFn", "isEnabled", 41, "CallOptionsEnabledFn.kt").v("disabled by flag");
        return false;
    }
}
