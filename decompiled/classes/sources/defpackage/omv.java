package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class omv implements defpackage.zcr {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/fermat/enabledfn/FermatEnabledFn");
    public final defpackage.zzx b;
    private final defpackage.omx c;

    public omv(defpackage.zzx zzxVar, defpackage.omx omxVar) {
        this.b = zzxVar;
        this.c = omxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        defpackage.omx omxVar = this.c;
        if (omxVar.a() && omxVar.b()) {
            throw new java.lang.IllegalStateException("Both call notes and call actions can not be active at the same time.");
        }
        if (omxVar.b()) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.omx.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "getFermatEnabledFeature", 83, "FermatFeatureResolver.kt")).v("Call Recording enabled.");
            return true;
        }
        if (!omxVar.a()) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.omx.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "getFermatEnabledFeature", 95, "FermatFeatureResolver.kt")).v("Fermat not supported.");
            return false;
        }
        defpackage.aimz aimzVar = defpackage.omx.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "getFermatEnabledFeature", 87, "FermatFeatureResolver.kt")).v("Call Notes enabled.");
        if (android.os.Build.VERSION.SDK_INT < 34) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "supportsSummarization", 104, "FermatFeatureResolver.kt")).v("unsupported SDK");
            return true;
        }
        if (omxVar.b.m()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "supportsSummarization", 108, "FermatFeatureResolver.kt")).v("disabled in direct boot mode");
            return true;
        }
        if (omxVar.c() == 4) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "supportsSummarization", 114, "FermatFeatureResolver.kt")).v("disabled by flag");
        return true;
    }
}
