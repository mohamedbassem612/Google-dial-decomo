package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetCachedBackupsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(20);
    public final int a;
    public final boolean b;
    public final com.google.android.gms.wearable.internal.ParcelableBackupDevice[] c;

    public GetCachedBackupsResponse(int i, boolean z, com.google.android.gms.wearable.internal.ParcelableBackupDevice[] parcelableBackupDeviceArr) {
        this.a = i;
        this.b = z;
        this.c = parcelableBackupDeviceArr;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Parcelable[], com.google.android.gms.wearable.internal.ParcelableBackupDevice[]] */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.h(parcel, 3, this.b);
        aais.D(parcel, 4, (android.os.Parcelable[]) this.c, i);
        aais.g(parcel, iF);
    }
}
