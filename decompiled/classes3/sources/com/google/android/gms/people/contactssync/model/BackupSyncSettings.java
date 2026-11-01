package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class BackupSyncSettings extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(9);
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final boolean d;
    private final int e;

    public BackupSyncSettings(java.lang.String str, java.lang.String str2, int i, int i2, boolean z) {
        if (i == 3) {
            if (!str.equals(str2)) {
                throw new java.lang.IllegalArgumentException("Active contacts backup account must be the same as requested account name when backup sync mode is MODE_SYNC_AND_BACKUP.");
            }
            i = 3;
        }
        if (i != 3 && i2 != 0) {
            throw new java.lang.IllegalArgumentException("Backup scope must be BACKUP_SCOPE_UNKNOWN when backup sync mode is not MODE_SYNC_AND_BACKUP.");
        }
        this.a = str;
        this.b = str2;
        this.c = i;
        this.e = i2;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.contactssync.model.BackupSyncSettings) {
            com.google.android.gms.people.contactssync.model.BackupSyncSettings backupSyncSettings = (com.google.android.gms.people.contactssync.model.BackupSyncSettings) obj;
            if (j$.util.Objects.equals(this.a, backupSyncSettings.a) && j$.util.Objects.equals(this.b, backupSyncSettings.b) && this.c == backupSyncSettings.c && this.e == backupSyncSettings.e && this.d == backupSyncSettings.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.e), java.lang.Boolean.valueOf(this.d)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        int i2 = this.c;
        aais.l(parcel, 3, i2);
        aais.l(parcel, 4, i2 == 3 ? this.e : 0);
        aais.h(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
