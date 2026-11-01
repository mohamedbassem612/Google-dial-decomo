package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class RootTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(15);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.l(parcel, 1, i2);
        defpackage.aais.h(parcel, 2, this.b);
        defpackage.aais.h(parcel, 3, this.c);
        defpackage.aais.l(parcel, 4, this.d);
        defpackage.aais.l(parcel, 5, this.e);
        defpackage.aais.g(parcel, iF);
    }
}
