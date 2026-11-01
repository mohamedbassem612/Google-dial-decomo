package com.android.voicemail.impl.sms;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class VvmMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(2);

    public abstract android.os.Bundle a();

    public abstract android.telecom.PhoneAccountHandle b();

    public abstract java.lang.String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(b(), i);
        parcel.writeString(c());
        parcel.writeBundle(a());
    }
}
