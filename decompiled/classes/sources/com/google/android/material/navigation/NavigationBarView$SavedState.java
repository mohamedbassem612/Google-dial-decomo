package com.google.android.material.navigation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class NavigationBarView$SavedState extends androidx.customview.view.AbsSavedState {
    public static final android.os.Parcelable.Creator CREATOR = new afqt(5);
    public android.os.Bundle a;

    public NavigationBarView$SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.a);
    }

    public NavigationBarView$SavedState(android.os.Parcelable parcelable) {
        super(parcelable);
    }
}
