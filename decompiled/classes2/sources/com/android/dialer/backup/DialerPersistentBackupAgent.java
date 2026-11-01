package com.android.dialer.backup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class DialerPersistentBackupAgent extends defpackage.abdp {
    public static final /* synthetic */ int a = 0;
    private static final aimz b = aimz.i("com/android/dialer/backup/DialerPersistentBackupAgent");
    private static final java.lang.String[] c = {"com.google.android.dialer_preferences", "com.google.android.dialer", "com.android.dialer"};
    private final java.lang.String[] d;
    private final j$.util.OptionalInt e;

    public DialerPersistentBackupAgent() {
        java.lang.String[] strArr = c;
        this.e = j$.util.OptionalInt.empty();
        ahvr.ci(strArr);
        this.d = strArr;
        if (getBaseContext() != null) {
            defpackage.hgu.i(this).bt().n(rmw.fl);
        } else {
            b.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "<init>", 71, "DialerPersistentBackupAgent.java").v("base context was null");
        }
    }

    private final int d(final android.app.backup.BackupDataOutput backupDataOutput) {
        return this.e.orElseGet(new java.util.function.IntSupplier() { // from class: ipd
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                int i = com.android.dialer.backup.DialerPersistentBackupAgent.a;
                return ft$.ExternalSyntheticApiModelOutline0.m(backupDataOutput);
            }
        });
    }

    @Override // defpackage.abdp
    public final java.util.Map a() {
        defpackage.hgu.i(this).bt().n(rmw.fk);
        aimz aimzVar = b;
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "getBackupSpecification", 150, "DialerPersistentBackupAgent.java");
        java.lang.String[] strArr = this.d;
        int length = strArr.length;
        aimwVarL.w("number of files being backed up: %d", 3);
        aca acaVar = new aca();
        for (int i = 0; i < 3; i++) {
            java.lang.String str = strArr[i];
            aimzVar.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "getBackupSpecification", 154, "DialerPersistentBackupAgent.java").y("arrayMap.put: %s", str);
            acaVar.put(str, new afsq((char[]) null));
        }
        return acaVar;
    }

    @Override // defpackage.abdp, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(android.os.ParcelFileDescriptor parcelFileDescriptor, android.app.backup.BackupDataOutput backupDataOutput, android.os.ParcelFileDescriptor parcelFileDescriptor2) throws java.io.IOException {
        ipe ipeVarI = defpackage.hgu.i(this);
        ipeVarI.bt().n(rmw.fh);
        aimz aimzVar = b;
        aimzVar.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "onBackup", 107, "DialerPersistentBackupAgent.java").v("onBackup being performed");
        ipo ipoVarIZ = ipeVarI.iZ();
        try {
            java.io.FileOutputStream fileOutputStreamOpenFileOutput = openFileOutput("dialer_delayed_backup_temp.pb", 0);
            try {
                if ((d(backupDataOutput) & 3) != 0) {
                    aimzVar.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "onBackup", 117, "DialerPersistentBackupAgent.java").v("backing up");
                    ((ipb) aoov.ai(new defpackage.hqi(ipoVarIZ, (aoln) null, 4))).h(fileOutputStreamOpenFileOutput);
                    defpackage.hgu.i(this).bt().o(rmx.qY);
                } else {
                    aimzVar.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "onBackup", 123, "DialerPersistentBackupAgent.java").v("client side encryption not available, not backing up");
                    defpackage.hgu.i(this).bt().o(rmx.qZ);
                    ipb.a.h(fileOutputStreamOpenFileOutput);
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
                if ((d(backupDataOutput) & 2) == 0) {
                    aimzVar.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "onBackup", 134, "DialerPersistentBackupAgent.java").v("not device to device transfer, not backing up unbounded data");
                } else {
                    java.io.FileOutputStream fileOutputStreamOpenFileOutput2 = openFileOutput("dialer_unbounded_backup_temp.zip", 0);
                    try {
                        aooh.f(fileOutputStreamOpenFileOutput2, "output");
                        aoov.ai(new defpackage.ipl(ipoVarIZ, fileOutputStreamOpenFileOutput2, null));
                        if (fileOutputStreamOpenFileOutput2 != null) {
                            fileOutputStreamOpenFileOutput2.close();
                        }
                    } catch (java.lang.Throwable th) {
                        if (fileOutputStreamOpenFileOutput2 != null) {
                            try {
                                fileOutputStreamOpenFileOutput2.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            } catch (java.lang.Throwable th3) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // defpackage.abdp, android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new android.app.backup.SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
        addHelper("DialerDelayedBackup", new android.app.backup.FileBackupHelper(this, "dialer_delayed_backup_temp.pb"));
        addHelper("DialerUnboundedBackup", new android.app.backup.FileBackupHelper(this, "dialer_unbounded_backup_temp.zip"));
    }

    @Override // defpackage.abdp, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(android.app.backup.BackupDataInput backupDataInput, int i, android.os.ParcelFileDescriptor parcelFileDescriptor) throws java.io.IOException {
        defpackage.hgu.i(this).bt().n(rmw.fi);
        b.b().l("com/android/dialer/backup/DialerPersistentBackupAgent", "onRestore", 96, "DialerPersistentBackupAgent.java").w("restore from version: %d", i);
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestoreFinished() {
        defpackage.hgu.i(this).bt().n(rmw.fj);
        super.onRestoreFinished();
    }
}
