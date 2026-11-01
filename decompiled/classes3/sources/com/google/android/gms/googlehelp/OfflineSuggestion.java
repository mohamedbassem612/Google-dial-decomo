package com.google.android.gms.googlehelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class OfflineSuggestion extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(3);
    final java.lang.String a;
    final java.lang.String b;
    final java.lang.String c;
    final java.lang.String d;

    public OfflineSuggestion(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, this.a);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.A(parcel, 5, this.d);
        aais.g(parcel, iF);
    }
}
