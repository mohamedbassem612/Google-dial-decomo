package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BackupSyncContactInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(8);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public BackupSyncContactInfo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.l(parcel, 2, this.b);
        aais.l(parcel, 3, this.c);
        aais.l(parcel, 4, this.d);
        aais.g(parcel, iF);
    }
}
