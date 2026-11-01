package com.google.android.gms.droidguard.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DroidGuardInitReply implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(6);
    public final android.os.ParcelFileDescriptor a;
    public final android.os.Parcelable b;

    public DroidGuardInitReply(android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.Parcelable parcelable) {
        this.a = parcelFileDescriptor;
        this.b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        android.os.Parcelable parcelable = this.b;
        return (this.a != null ? 1 : 0) | (parcelable != null ? parcelable.describeContents() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
