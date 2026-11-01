package com.google.android.ims.ipc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AudioData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(16);
    private final byte[] a;
    private final int b;
    private final int c;
    private final int d;

    public AudioData(android.os.Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.a = bArr;
        parcel.readByteArray(bArr);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] bArr = this.a;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public AudioData(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
        this.c = 1;
        this.d = 2;
    }
}
