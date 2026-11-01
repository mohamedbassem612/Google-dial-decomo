package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ClientNotificationEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(16);
    public final int a;
    public final java.lang.String b;
    public final long c;
    public final int d;
    public final boolean e;

    public ClientNotificationEvent(int i, java.lang.String str, long j, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.A(parcel, 2, this.b);
        aais.m(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.h(parcel, 5, this.e);
        aais.g(parcel, iF);
    }
}
