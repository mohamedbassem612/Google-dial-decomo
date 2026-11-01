package com.google.android.gms.common.data;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BitmapTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(13);
    final int a;
    android.os.ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, android.os.ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.b == null) {
            aais.as((java.lang.Object) null);
            throw null;
        }
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.z(parcel, 2, this.b, i | 1);
        aais.l(parcel, 3, this.c);
        aais.g(parcel, iF);
        this.b = null;
    }
}
