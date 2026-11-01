package com.google.android.material.checkbox;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialCheckBox$SavedState extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(13);
    public int a;

    public MaterialCheckBox$SavedState(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return "MaterialCheckBox.SavedState{" + hexString + " CheckedState=" + str + '}';
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
