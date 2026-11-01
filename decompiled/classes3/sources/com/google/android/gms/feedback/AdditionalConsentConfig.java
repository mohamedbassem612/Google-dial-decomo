package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AdditionalConsentConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final defpackage.aalp CREATOR = new defpackage.aalp(0);
    final java.lang.String a;
    final java.lang.String b;
    final java.lang.String c;
    final java.lang.String d;
    final java.lang.String e;
    final android.os.Bundle f;

    public AdditionalConsentConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.os.Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.A(parcel, 6, this.e);
        aais.p(parcel, 7, this.f);
        aais.g(parcel, iF);
    }
}
