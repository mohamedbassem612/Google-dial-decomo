package com.google.apps.tiktok.account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class AccountId implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaso(13);

    public static com.google.apps.tiktok.account.AccountId b(int i) {
        defpackage.ahvr.bZ(i >= -1, "Invalid AccountId");
        return new com.google.apps.tiktok.account.AutoValue_AccountId(i);
    }

    @java.lang.Deprecated
    public abstract int a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(a());
    }
}
