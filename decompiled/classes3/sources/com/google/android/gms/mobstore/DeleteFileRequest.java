package com.google.android.gms.mobstore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class DeleteFileRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(19);
    public final android.net.Uri a;

    public DeleteFileRequest(android.net.Uri uri) {
        this.a = uri;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.g(parcel, iF);
    }
}
