package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzf {
    private static final aimz a = aimz.i("com/android/dialer/audio/impl/FatalErrors");
    private final aoin b;

    public hzf(aoin aoinVar) {
        aooh.f(aoinVar, "audioFrameworkFatalErrorEnabled");
        this.b = aoinVar;
    }

    public final boolean a() {
        java.lang.Boolean bool = (java.lang.Boolean) this.b.a();
        a.b().l("com/android/dialer/audio/impl/FatalErrors", "enabled", 19, "FatalErrors.kt").y("Using Direct Boot Flag: AUDIO_FRAMEWORK_FATAL_ERROR_ENABLED: %s", bool);
        aooh.c(bool);
        return bool.booleanValue();
    }
}
