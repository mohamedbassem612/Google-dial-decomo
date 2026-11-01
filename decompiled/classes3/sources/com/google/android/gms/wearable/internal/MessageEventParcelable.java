package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MessageEventParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aaxo(2);
    public final int a;
    public final java.lang.String b;
    public final byte[] c;
    public final java.lang.String d;

    public MessageEventParcelable(int i, java.lang.String str, byte[] bArr, java.lang.String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final java.lang.String toString() {
        byte[] bArr = this.c;
        java.lang.Object objValueOf = bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length);
        java.lang.String str = this.b;
        return "MessageEventParcelable[" + this.a + ',' + str + ", size=" + objValueOf.toString() + ']';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 2, i2);
        aais.A(parcel, 3, this.b);
        aais.q(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
