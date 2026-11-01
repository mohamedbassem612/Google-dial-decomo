package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FunctionDeclaration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(10);
    public final java.lang.String a;
    public final java.lang.String b;
    public final com.google.android.apps.aicore.aidl.ResponseSchema c;
    public final com.google.android.apps.aicore.aidl.ResponseSchema d;

    public FunctionDeclaration(java.lang.String str, java.lang.String str2, com.google.android.apps.aicore.aidl.ResponseSchema responseSchema, com.google.android.apps.aicore.aidl.ResponseSchema responseSchema2) {
        this.a = str;
        this.b = str2;
        this.c = responseSchema;
        this.d = responseSchema2;
    }

    public final java.lang.String toString() {
        return (java.lang.String) j$.util.stream.Stream.-CC.of(new java.lang.String[]{this.a, this.b}).filter(new defpackage.wrm(10)).collect(j$.util.stream.Collectors.joining(","));
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.z(parcel, 4, this.d, i);
        aais.g(parcel, iF);
    }
}
