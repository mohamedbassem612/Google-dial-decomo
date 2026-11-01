package com.google.android.gms.mobstore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class OpenFileDescriptorResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(19);
    public final android.os.ParcelFileDescriptor a;

    public OpenFileDescriptorResponse(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.z(parcel, 1, parcelFileDescriptor, i | 1);
        defpackage.aais.g(parcel, iF);
    }
}
