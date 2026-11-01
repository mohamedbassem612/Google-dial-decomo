package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lrb implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/contactchecker/enablefn/ContactCheckerEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.zzx d;

    public lrb(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zzx zzxVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableContactChecker");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableContactCheckerUi");
        }
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = zzxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.d.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/contactchecker/enablefn/ContactCheckerEnabledFn", "isEnabled", 25, "ContactCheckerEnabledFn.kt")).v("disabled due to direct boot");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/contactchecker/enablefn/ContactCheckerEnabledFn", "isEnabled", 30, "ContactCheckerEnabledFn.kt")).v("disabled by flag");
        return false;
    }

    public final boolean b() {
        return a() && ((java.lang.Boolean) this.c.a()).booleanValue();
    }
}
