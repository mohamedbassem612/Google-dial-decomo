package com.google.apps.tiktok.account.api.controller;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ValidationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(3);
    private static com.google.apps.tiktok.account.api.controller.ValidationResult a;

    public static com.google.apps.tiktok.account.api.controller.ValidationResult d() {
        com.google.apps.tiktok.account.api.controller.ValidationResult validationResult;
        synchronized (com.google.apps.tiktok.account.api.controller.ValidationResult.class) {
            if (a == null) {
                a = new com.google.apps.tiktok.account.api.controller.AutoValue_ValidationResult(true, false, null);
            }
            validationResult = a;
        }
        return validationResult;
    }

    public abstract android.content.Intent a();

    public abstract boolean b();

    public abstract boolean c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeParcelable(a(), 0);
    }
}
