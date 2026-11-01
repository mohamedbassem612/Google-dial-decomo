package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class omx {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/fermat/enabledfn/FermatFeatureResolver");
    public final defpackage.zzx b;
    private final defpackage.omw c;
    private final defpackage.rln d;

    public omx(defpackage.zzx zzxVar, defpackage.rln rlnVar, defpackage.omw omwVar) {
        if (rlnVar == null) {
            defpackage.aooh.i("snapshot");
        }
        this.b = zzxVar;
        this.d = rlnVar;
        this.c = omwVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "isCallNotesEnabled", 59, "FermatFeatureResolver.kt")).v("[Call Notes] unsupported SDK");
            return false;
        }
        if (this.b.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "isCallNotesEnabled", 66, "FermatFeatureResolver.kt")).v("[Call Notes] disabled in direct boot mode");
            return false;
        }
        int iC = c() - 2;
        if (iC == 2 || iC == 3) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "isCallNotesEnabled", 71, "FermatFeatureResolver.kt")).v("[Call Notes] disabled by flag");
        return false;
    }

    public final boolean b() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "isCallRecordingEnabled", 37, "FermatFeatureResolver.kt")).v("[Call Recording] unsupported SDK");
            return false;
        }
        if (this.b.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "isCallRecordingEnabled", 44, "FermatFeatureResolver.kt")).v("[Call Recording] disabled in direct boot mode");
            return false;
        }
        if (c() == 6) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatFeatureResolver", "isCallRecordingEnabled", 48, "FermatFeatureResolver.kt")).v("[Call Recording] disabled by flag");
        return false;
    }

    public final int c() {
        defpackage.omw omwVar = this.c;
        defpackage.ipc ipcVar = omwVar.a;
        defpackage.rln rlnVar = this.d;
        if (defpackage.gus.aU(ipcVar, rlnVar)) {
            return 4;
        }
        if (defpackage.gus.aU(omwVar.b, rlnVar)) {
            return 5;
        }
        return defpackage.gus.aU(omwVar.c, rlnVar) ? 6 : 3;
    }
}
