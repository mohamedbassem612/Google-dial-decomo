package com.google.android.gms.mobstore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class OpenFileDescriptorRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(18);
    public final android.net.Uri a;
    public final int b;

    public OpenFileDescriptorRequest(android.net.Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.z(parcel, 1, this.a, i);
        defpackage.aais.l(parcel, 2, this.b);
        defpackage.aais.g(parcel, iF);
    }
}
