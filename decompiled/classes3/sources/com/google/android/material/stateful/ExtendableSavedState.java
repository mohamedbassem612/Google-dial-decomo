package com.google.android.material.stateful;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ExtendableSavedState extends androidx.customview.view.AbsSavedState {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.afqt(8);
    public final aec a;

    public ExtendableSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        java.lang.String[] strArr = new java.lang.String[i];
        parcel.readStringArray(strArr);
        android.os.Bundle[] bundleArr = new android.os.Bundle[i];
        parcel.readTypedArray(bundleArr, android.os.Bundle.CREATOR);
        this.a = new aec(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.a.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final java.lang.String toString() {
        return "ExtendableSavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " states=" + this.a.toString() + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        aec aecVar = this.a;
        int i2 = aecVar.d;
        parcel.writeInt(i2);
        java.lang.String[] strArr = new java.lang.String[i2];
        android.os.Bundle[] bundleArr = new android.os.Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (java.lang.String) aecVar.d(i3);
            bundleArr[i3] = (android.os.Bundle) aecVar.g(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(android.os.Parcelable parcelable) {
        super(parcelable);
        this.a = new aec(0);
    }
}
