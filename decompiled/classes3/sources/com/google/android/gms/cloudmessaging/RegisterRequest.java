package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RegisterRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(8);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public int f;
    public final java.lang.String g;

    public RegisterRequest(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = "1:747654520220:android:0000000000000000";
        this.c = "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los";
        this.d = str2;
        this.e = str3;
        this.g = "fcm-25.1.2_1p";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.A(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.l(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.g(parcel, iF);
    }

    public RegisterRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
    }
}
