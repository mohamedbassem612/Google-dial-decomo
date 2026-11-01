package com.google.android.gms.auth.aang;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetTokenResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(12);
    public final java.lang.String a;
    public final com.google.android.gms.auth.aang.Oauth2TokenMetadata b;

    public GetTokenResponse(java.lang.String str, com.google.android.gms.auth.aang.Oauth2TokenMetadata oauth2TokenMetadata) {
        this.a = str;
        this.b = oauth2TokenMetadata;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.z(parcel, 2, this.b, i);
        aais.g(parcel, iF);
    }
}
