package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GetBackupSettingsSupportedResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(19);
    public final int a;
    public final boolean b;

    public GetBackupSettingsSupportedResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.h(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
