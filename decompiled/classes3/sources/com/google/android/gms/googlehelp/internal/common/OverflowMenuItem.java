package com.google.android.gms.googlehelp.internal.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class OverflowMenuItem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(4);
    final int a;
    final java.lang.String b;
    final android.content.Intent c;

    public OverflowMenuItem(int i, java.lang.String str, android.content.Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.z(parcel, 4, this.c, i);
        aais.g(parcel, iF);
    }
}
