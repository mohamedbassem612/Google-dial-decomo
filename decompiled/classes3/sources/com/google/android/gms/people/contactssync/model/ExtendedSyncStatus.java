package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ExtendedSyncStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(12);
    public final int a;
    public final java.lang.String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public ExtendedSyncStatus(int i, java.lang.String str, long j, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "ExtendedSyncStatus{code=%d, message=%s, lastSyncTimeMillis=%d, numOfItems=%d, syncStage=%d, dataType=%d, cycleStatus=%d, numOfSyncedItems=%d, numOfTotalItems=%d}", java.lang.Integer.valueOf(this.a), this.b, java.lang.Long.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.h), java.lang.Integer.valueOf(this.i));
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, i2);
        aais.A(parcel, 3, this.b);
        aais.m(parcel, 4, this.c);
        aais.l(parcel, 5, this.d);
        aais.l(parcel, 6, this.e);
        aais.l(parcel, 7, this.f);
        aais.l(parcel, 8, this.g);
        aais.l(parcel, 9, this.h);
        aais.l(parcel, 10, this.i);
        aais.g(parcel, iF);
    }
}
