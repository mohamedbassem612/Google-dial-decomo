package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocf implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/emergencycalling/satellitesos/impl/SatelliteSOSEnabledFn");

    public final boolean a() {
        if (a.o()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/emergencycalling/satellitesos/impl/SatelliteSOSEnabledFn", "isEnabled", 17, "SatelliteSOSEnabledFn.kt").v("unsupported SDK");
        return false;
    }
}
