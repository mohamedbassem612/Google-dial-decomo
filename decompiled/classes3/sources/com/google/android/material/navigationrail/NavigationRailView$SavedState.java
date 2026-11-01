package com.google.android.material.navigationrail;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class NavigationRailView$SavedState extends com.google.android.material.navigation.NavigationBarView.SavedState {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.afqt(7);
    boolean b;
    android.os.Parcelable e;

    public NavigationRailView$SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.b = parcel.readInt() == 1;
        this.e = parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.e, i);
    }
}
