package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DeviceContactsSyncSetting extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(11);
    public static final int NOT_APPLICABLE = 1;
    public static final int OFF = 2;
    public static final int ON = 3;
    public static final int UNKNOWN_SYNC_SETTING = 0;
    private final int a;
    private final android.accounts.Account b;

    public DeviceContactsSyncSetting(int i, android.accounts.Account account) {
        this.a = i;
        this.b = account;
    }

    public static com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting create(int i) {
        return new com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting(i, null);
    }

    public android.accounts.Account getAccount() {
        return this.b;
    }

    public int getSyncSetting() {
        return this.a;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, getSyncSetting());
        aais.z(parcel, 2, getAccount(), i);
        aais.g(parcel, iF);
    }

    public static com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting create(int i, android.accounts.Account account) {
        return new com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting(i, account);
    }
}
