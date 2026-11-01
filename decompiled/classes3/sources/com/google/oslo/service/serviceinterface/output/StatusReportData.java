package com.google.oslo.service.serviceinterface.output;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class StatusReportData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(10);
    private final int a;
    private final java.lang.String b;

    public StatusReportData(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }

    public StatusReportData() {
        this.a = 0;
        this.b = null;
    }
}
