package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RecordConsentByConsentResultResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements aadl {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(20);
    public final java.util.List a;
    public final java.lang.String b;

    public RecordConsentByConsentResultResponse(java.util.List list, java.lang.String str) {
        this.a = list;
        this.b = str;
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.b != null ? com.google.android.gms.common.api.Status.a : com.google.android.gms.common.api.Status.e;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iF = aais.f(parcel, 20293);
        aais.C(parcel, 1, list);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
