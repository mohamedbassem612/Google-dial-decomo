package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TetheredSyncStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(16);
    public static final int DUAL_WRITE_ENABLED = 2;
    public static final int SUCCESS = 3;
    public static final java.lang.String TCS_DUAL_WRITE_ENABLED = "TCS companion dual write is enabled. ";
    public static final java.lang.String TCS_SUCCESS = "TCS sync is enabled on GmsCore both phone and watch.";
    public static final java.lang.String TCS_UNSUPPORTED = "TCS unsupported on GmsCore.";
    public static final int UNSUPPORTED = 1;
    private final int a;
    private final java.lang.String b;

    public TetheredSyncStatus(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public int getCode() {
        return this.a;
    }

    public java.lang.String getMessage() {
        return this.b;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, getCode());
        aais.A(parcel, 3, getMessage());
        aais.g(parcel, iF);
    }
}
