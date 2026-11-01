package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AuthAccountResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements aadl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(19);
    final int a;
    public int b;
    public android.content.Intent c;

    public AuthAccountResult(int i, int i2, android.content.Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.b == 0 ? com.google.android.gms.common.api.Status.a : com.google.android.gms.common.api.Status.e;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, this.a);
        aais.l(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }

    public AuthAccountResult() {
        this(2, 0, null);
    }
}
