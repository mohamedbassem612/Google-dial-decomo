package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lnz implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/chocolatechip/impl/enabledfn/ChocolateChipEnabledFn");
    private final defpackage.aoin b;

    public lnz(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableChocolateChip");
        }
        this.b = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        boolean zBooleanValue = ((java.lang.Boolean) this.b.a()).booleanValue();
        defpackage.aimz aimzVar = a;
        if (zBooleanValue) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/chocolatechip/impl/enabledfn/ChocolateChipEnabledFn", "isEnabled", 20, "ChocolateChipEnabledFn.kt")).v("enabled");
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/chocolatechip/impl/enabledfn/ChocolateChipEnabledFn", "isEnabled", 23, "ChocolateChipEnabledFn.kt")).v("disabled by flag");
        return false;
    }
}
