package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ConnectionTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(19);
    public final com.google.android.gms.common.internal.RootTelemetryConfiguration a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ConnectionTelemetryConfiguration(com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = rootTelemetryConfiguration;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, rootTelemetryConfiguration, i);
        aais.h(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.v(parcel, 4, this.d);
        aais.l(parcel, 5, this.e);
        aais.v(parcel, 6, this.f);
        aais.g(parcel, iF);
    }
}
