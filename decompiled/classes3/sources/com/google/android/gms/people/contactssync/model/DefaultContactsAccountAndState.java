package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DefaultContactsAccountAndState extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(10);
    public final int a;
    public final android.accounts.Account b;

    public DefaultContactsAccountAndState(int i, android.accounts.Account account) {
        this.a = i;
        this.b = account;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
