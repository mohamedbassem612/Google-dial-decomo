package com.google.android.material.navigation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class NavigationBarPresenter$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.afwr(0);
    public int a;
    public com.google.android.material.internal.ParcelableSparseArray b;

    public NavigationBarPresenter$SavedState(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (com.google.android.material.internal.ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public NavigationBarPresenter$SavedState() {
    }
}
