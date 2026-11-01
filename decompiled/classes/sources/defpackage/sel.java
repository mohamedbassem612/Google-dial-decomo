package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sel implements defpackage.iox {
    private final defpackage.ecx c;
    private final defpackage.rlv d;
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/patrick/impl/settings/data/CallingCardBackupIntegration");
    public static final defpackage.iot a = new defpackage.iot(sei.a, sej.a, new jot(3), owv.c);

    public sel(defpackage.ecx ecxVar, defpackage.rlv rlvVar) {
        defpackage.aooh.f(ecxVar, "dataStore");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        this.c = ecxVar;
        this.d = rlvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.iox
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.io.IOException {
        sek sekVar;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof sek) {
            sekVar = (sek) aolnVar;
            int i = sekVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sekVar.c = i - Integer.MIN_VALUE;
            } else {
                sekVar = new sek(this, aolnVar);
            }
        } else {
            sekVar = new sek(this, aolnVar);
        }
        java.lang.Object obj = sekVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = sekVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(sekVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(784, "CallingCardBackupIntegration_backup");
            try {
                ((defpackage.aimw) b.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardBackupIntegration", "backup$<anonymous>", 30, "CallingCardBackupIntegration.kt")).v("Backing up Calling Card settings");
                try {
                    defpackage.aoxh aoxhVarB = this.c.b();
                    sekVar.d = ahoqVarZ;
                    sekVar.c = 1;
                    java.lang.Object objAu = defpackage.aoov.au(aoxhVarB, sekVar);
                    if (objAu != obj2) {
                        ahoqVar = ahoqVarZ;
                        obj = objAu;
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    ahoqVar = ahoqVarZ;
                    ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e).l("com/android/dialer/patrick/impl/settings/data/CallingCardBackupIntegration", "backup$<anonymous>", 41, "CallingCardBackupIntegration.kt")).v("Failed to read Calling Card settings for backup, returning default instance");
                    defpackage.sfd sfdVar = defpackage.sfd.a;
                    defpackage.aooh.c(sfdVar);
                    obj2 = sfdVar;
                }
                return obj2;
            } catch (java.lang.Throwable th) {
                th = th;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sekVar.d;
        try {
            try {
                defpackage.aooc.af(obj);
            } catch (java.io.IOException e2) {
                e = e2;
                ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e).l("com/android/dialer/patrick/impl/settings/data/CallingCardBackupIntegration", "backup$<anonymous>", 41, "CallingCardBackupIntegration.kt")).v("Failed to read Calling Card settings for backup, returning default instance");
                defpackage.sfd sfdVar2 = defpackage.sfd.a;
                defpackage.aooh.c(sfdVar2);
                obj2 = sfdVar2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (java.lang.Throwable th3) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th3;
            }
        }
        defpackage.sfd sfdVar3 = (defpackage.sfd) obj;
        if (!defpackage.aooh.n(sfdVar3, defpackage.sfd.a)) {
            this.d.o(defpackage.rmx.MY_CALLING_CARD_SETTINGS_BACKED_UP);
        }
        obj2 = sfdVar3;
        defpackage.ajsz.ak(ahoqVar, null);
        return obj2;
    }

    @Override // defpackage.iox
    public final defpackage.iot c() {
        return a;
    }
}
