package com.google.android.gms.people.contactssync.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TetheredContactsSyncRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(15);
    public static final int DISABLE_SYNC = 2;
    public static final int FULL_SYNC = 0;
    public static final int INCREMENTAL_SYNC = 1;
    public static final int INITIAL_SYNC = 3;
    private final int a;
    private final boolean b;

    public TetheredContactsSyncRequest(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public int getType() {
        return this.a;
    }

    public boolean isValidForHighResPhotoSync() {
        return this.b;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, getType());
        aais.h(parcel, 3, isValidForHighResPhotoSync());
        aais.g(parcel, iF);
    }
}
