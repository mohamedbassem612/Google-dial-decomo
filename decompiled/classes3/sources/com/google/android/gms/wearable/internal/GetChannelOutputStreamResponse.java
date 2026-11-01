package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetChannelOutputStreamResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxf(2);
    public final int a;
    public final android.os.ParcelFileDescriptor b;
    public final boolean c;

    public GetChannelOutputStreamResponse(int i, android.os.ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.z(parcel, 3, this.b, i);
        aais.h(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
