package com.google.apps.tiktok.account.api.controller;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AccountActionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(2);
    public final com.google.apps.tiktok.account.AccountId a;
    public final agoq b;
    public final com.google.apps.tiktok.account.api.controller.ValidationResult c;
    public final android.content.Intent d;
    public final com.google.apps.tiktok.account.api.AccountOperationContext e;

    public AccountActionResult(android.os.Parcel parcel) {
        this.a = parcel.readParcelable(com.google.apps.tiktok.account.AccountId.class.getClassLoader());
        try {
            this.b = defpackage.akmr.k(parcel, agoq.a, akzq.a());
            this.c = (com.google.apps.tiktok.account.api.controller.ValidationResult) parcel.readParcelable(com.google.apps.tiktok.account.api.controller.ValidationResult.class.getClassLoader());
            this.d = (android.content.Intent) parcel.readParcelable(com.google.apps.tiktok.account.api.controller.ValidationResult.class.getClassLoader());
            this.e = (com.google.apps.tiktok.account.api.AccountOperationContext) parcel.readParcelable(com.google.apps.tiktok.account.api.controller.ValidationResult.class.getClassLoader());
        } catch (alaz e) {
            throw new java.lang.IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        defpackage.akmr.s(parcel, this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public AccountActionResult(com.google.apps.tiktok.account.AccountId accountId, agoq agoqVar, com.google.apps.tiktok.account.api.controller.ValidationResult validationResult, android.content.Intent intent, com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext) {
        this.a = accountId;
        ahvr.ci(agoqVar);
        this.b = agoqVar;
        this.c = validationResult;
        this.d = intent;
        this.e = accountOperationContext;
    }
}
