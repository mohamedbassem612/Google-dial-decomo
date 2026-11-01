package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaqw extends defpackage.aaqt {
    final /* synthetic */ zzx a;

    public aaqw(defpackage.aara aaraVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aaraVar);
    }

    @Override // defpackage.aaqt
    public final void d(com.google.android.gms.common.api.Status status, com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState backupAndSyncOptInState, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        if (!status.c()) {
            aais.av(status, (java.lang.Object) null, this.a, apiMetadata);
            return;
        }
        int i = backupAndSyncOptInState.c;
        int i2 = defpackage.aara.a;
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = (i == 3 || i == 5) ? 3 : 0;
            }
        }
        aais.av(status, new com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting(i3, i3 == 3 ? new android.accounts.Account(backupAndSyncOptInState.a, "com.google") : null), this.a, apiMetadata);
    }
}
