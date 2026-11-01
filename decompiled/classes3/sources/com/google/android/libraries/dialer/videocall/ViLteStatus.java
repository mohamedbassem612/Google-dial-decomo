package com.google.android.libraries.dialer.videocall;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ViLteStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(20);

    public static defpackage.aehn c() {
        defpackage.aehn aehnVar = new defpackage.aehn();
        aehnVar.c(false);
        aehnVar.c = 1;
        return aehnVar;
    }

    public abstract boolean a();

    public abstract int b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        da$.ExternalSyntheticApiModelOutline0.m(parcel, a());
        parcel.writeString(defpackage.abxl.B(b()));
    }
}
