package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class smx implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/patrick/phasetwo/PatrickPhaseTwoEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.aoin c;

    public smx(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (aoinVar == null) {
            defpackage.aooh.i("enablePatrickPhaseTwo");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableCallingCardRepositoryV2");
        }
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue() && ((java.lang.Boolean) this.c.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/phasetwo/PatrickPhaseTwoEnabledFn", "isEnabled", 23, "PatrickPhaseTwoEnabledFn.kt")).v("disabled by flag");
        return false;
    }
}
