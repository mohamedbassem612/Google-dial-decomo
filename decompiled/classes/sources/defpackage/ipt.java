package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ipt implements defpackage.afgl {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/backup/impl/DelayedBackupMigration");
    public final android.content.Context b;
    public final defpackage.rlv c;
    private final defpackage.aoss d;

    public ipt(android.content.Context context, defpackage.aoss aossVar, defpackage.rlv rlvVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("logging");
        }
        this.b = context;
        this.d = aossVar;
        this.c = rlvVar;
    }

    @Override // defpackage.afgl
    public final defpackage.ajcq a() {
        this.c.o(defpackage.rmx.RESTORE_TEMP_FILE_READ);
        return defpackage.aosv.F(this.d, 0, new icr(this, (defpackage.aoln) null, 8), 3);
    }

    @Override // defpackage.afgl
    public final /* bridge */ /* synthetic */ defpackage.ajcq b(defpackage.albh albhVar) {
        defpackage.ipb ipbVar = (defpackage.ipb) albhVar;
        defpackage.aooh.f(ipbVar, "message");
        return defpackage.aosv.F(this.d, 0, new fyn(ipbVar, this, (defpackage.aoln) null, 11), 3);
    }

    @Override // defpackage.afgl
    public final defpackage.ajcq c() {
        return defpackage.aosv.F(this.d, 0, new icr(this, (defpackage.aoln) null, 9, (byte[]) null), 3);
    }

    public final java.io.File d() {
        return new java.io.File(this.b.getFilesDir(), "delayed_backup_restored_v2");
    }
}
