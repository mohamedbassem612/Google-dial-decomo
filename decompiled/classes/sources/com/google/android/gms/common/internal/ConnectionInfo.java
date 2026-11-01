package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ConnectionInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(13);
    public android.os.Bundle a;
    public com.google.android.gms.common.Feature[] b;
    int c;
    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration d;
    public com.google.android.gms.common.internal.ConnectionThrottlingConfig e;
    public java.lang.String f;

    public ConnectionInfo(android.os.Bundle bundle, com.google.android.gms.common.Feature[] featureArr, int i, com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration, com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig, java.lang.String str) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
        this.e = connectionThrottlingConfig;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.p(parcel, 1, this.a);
        defpackage.aais.D(parcel, 2, this.b, i);
        defpackage.aais.l(parcel, 3, this.c);
        defpackage.aais.z(parcel, 4, this.d, i);
        defpackage.aais.z(parcel, 5, this.e, i);
        defpackage.aais.A(parcel, 6, this.f);
        defpackage.aais.g(parcel, iF);
    }

    public ConnectionInfo() {
    }
}
