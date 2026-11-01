package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetBackupSyncSuggestionResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(13);
    public final int a;
    public final java.lang.String b;
    public final com.google.android.gms.people.contactssync.model.BackupSyncContactInfo c;

    public GetBackupSyncSuggestionResponse(int i, java.lang.String str, com.google.android.gms.people.contactssync.model.BackupSyncContactInfo backupSyncContactInfo) {
        this.a = i;
        this.b = str;
        this.c = backupSyncContactInfo;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
