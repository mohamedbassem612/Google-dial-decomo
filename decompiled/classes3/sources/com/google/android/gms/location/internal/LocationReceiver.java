package com.google.android.gms.location.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LocationReceiver extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(10);
    public final int a;
    public final android.os.IBinder b;
    public final android.os.IBinder c;
    public final android.app.PendingIntent d;
    public final java.lang.String e;

    public LocationReceiver(int i, android.os.IBinder iBinder, android.os.IBinder iBinder2, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aann, android.os.IBinder] */
    public static com.google.android.gms.location.internal.LocationReceiver a(android.os.IInterface iInterface, defpackage.aann aannVar, java.lang.String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new com.google.android.gms.location.internal.LocationReceiver(1, iInterface, aannVar, null, str);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.u(parcel, 2, this.b);
        aais.u(parcel, 3, this.c);
        aais.z(parcel, 4, this.d, i);
        aais.A(parcel, 6, this.e);
        aais.g(parcel, iF);
    }
}
