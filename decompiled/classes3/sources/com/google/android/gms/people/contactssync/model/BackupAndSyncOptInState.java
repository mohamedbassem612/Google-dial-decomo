package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BackupAndSyncOptInState extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(6);
    public final java.lang.String a;
    public final int[] b;
    public final int c;
    public final java.lang.String[] d;

    public BackupAndSyncOptInState(java.lang.String str, int[] iArr, int i, java.lang.String[] strArr) {
        this.a = str;
        this.b = iArr;
        this.c = i;
        this.d = strArr;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.v(parcel, 2, this.b);
        aais.l(parcel, 4, this.c);
        aais.B(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
