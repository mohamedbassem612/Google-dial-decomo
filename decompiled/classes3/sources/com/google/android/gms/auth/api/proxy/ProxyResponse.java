package com.google.android.gms.auth.api.proxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ProxyResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(15);
    final int a;
    public final int b;
    public final android.app.PendingIntent c;
    public final int d;
    final android.os.Bundle e;
    public final byte[] f;

    public ProxyResponse(int i, int i2, android.app.PendingIntent pendingIntent, int i3, android.os.Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.e = bundle;
        this.f = bArr;
        this.c = pendingIntent;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.b);
        aais.z(parcel, 2, this.c, i);
        aais.l(parcel, 3, this.d);
        aais.p(parcel, 4, this.e);
        aais.q(parcel, 5, this.f);
        aais.l(parcel, 1000, this.a);
        aais.g(parcel, iF);
    }
}
