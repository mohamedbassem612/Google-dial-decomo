package com.google.android.material.slider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BaseSlider$SliderState extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator CREATOR = new afwr(2);
    public float a;
    public float b;
    public java.util.ArrayList c;
    public float d;
    public boolean e;

    public BaseSlider$SliderState(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.c = arrayList;
        parcel.readList(arrayList, java.lang.Float.class.getClassLoader());
        this.d = parcel.readFloat();
        this.e = parcel.createBooleanArray()[0];
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeList(this.c);
        parcel.writeFloat(this.d);
        parcel.writeBooleanArray(new boolean[]{this.e});
    }
}
