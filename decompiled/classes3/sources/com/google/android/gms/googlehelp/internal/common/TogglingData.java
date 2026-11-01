package com.google.android.gms.googlehelp.internal.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TogglingData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(5);
    java.lang.String a;
    java.lang.String b;
    public java.lang.String c;

    public TogglingData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.g(parcel, iF);
    }

    private TogglingData() {
    }
}
