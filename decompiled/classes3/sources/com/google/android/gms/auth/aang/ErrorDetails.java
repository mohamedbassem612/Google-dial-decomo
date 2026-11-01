package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ErrorDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(8);
    public final boolean a;
    public final boolean b;

    public ErrorDetails(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, z);
        aais.h(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
