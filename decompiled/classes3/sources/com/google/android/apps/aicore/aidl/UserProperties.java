package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class UserProperties extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(18);
    public static final com.google.android.apps.aicore.aidl.UserProperties a = new com.google.android.apps.aicore.aidl.UserProperties(false);
    public final boolean b;

    public UserProperties(boolean z) {
        this.b = z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.b;
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, z);
        aais.g(parcel, iF);
    }
}
