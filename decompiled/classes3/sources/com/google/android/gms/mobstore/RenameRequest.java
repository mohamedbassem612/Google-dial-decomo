package com.google.android.gms.mobstore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RenameRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(20);
    public final android.net.Uri a;
    public final android.net.Uri b;

    public RenameRequest(android.net.Uri uri, android.net.Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
