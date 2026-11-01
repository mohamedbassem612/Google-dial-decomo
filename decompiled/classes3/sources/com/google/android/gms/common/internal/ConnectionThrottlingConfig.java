package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ConnectionThrottlingConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(20);
    public final android.util.SparseArray a;

    public ConnectionThrottlingConfig(android.util.SparseArray sparseArray) {
        this.a = sparseArray != null ? sparseArray.clone() : new android.util.SparseArray(0);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.util.SparseArray sparseArray = this.a;
        int iF = aais.f(parcel, 20293);
        android.util.SparseArray sparseArrayClone = sparseArray.clone();
        if (sparseArrayClone != null) {
            int iF2 = aais.f(parcel, 1);
            int size = sparseArrayClone.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArrayClone.keyAt(i2));
                android.os.Parcelable parcelable = (android.os.Parcelable) sparseArrayClone.valueAt(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    aais.n(parcel, parcelable, 0);
                }
            }
            aais.g(parcel, iF2);
        }
        aais.g(parcel, iF);
    }
}
