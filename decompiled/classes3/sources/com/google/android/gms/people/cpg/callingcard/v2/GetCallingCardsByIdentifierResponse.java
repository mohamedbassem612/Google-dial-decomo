package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetCallingCardsByIdentifierResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(16);
    public final com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus a;
    public final int b;
    public final android.net.Uri c;
    public final com.google.android.gms.people.cpg.callingcard.v2.Metadata d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.Long g;
    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier h;
    public final java.lang.String i;

    public GetCallingCardsByIdentifierResponse(com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus, int i, android.net.Uri uri, com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata, java.lang.String str, java.lang.String str2, java.lang.Long l, com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier, java.lang.String str3) {
        this.a = callingCardRequestStatus;
        this.b = i;
        this.c = uri;
        this.d = metadata;
        this.e = str;
        this.f = str2;
        this.g = l;
        this.h = identifier;
        this.i = str3;
    }

    public final java.sql.Timestamp a() {
        java.lang.Long l = this.g;
        if (l != null) {
            return new java.sql.Timestamp(l.longValue());
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.GetCallingCardsByIdentifierResponse) {
            com.google.android.gms.people.cpg.callingcard.v2.GetCallingCardsByIdentifierResponse getCallingCardsByIdentifierResponse = (com.google.android.gms.people.cpg.callingcard.v2.GetCallingCardsByIdentifierResponse) obj;
            if (j$.util.Objects.equals(this.a, getCallingCardsByIdentifierResponse.a) && this.b == getCallingCardsByIdentifierResponse.b && j$.util.Objects.equals(this.c, getCallingCardsByIdentifierResponse.c) && j$.util.Objects.equals(this.d, getCallingCardsByIdentifierResponse.d) && j$.util.Objects.equals(this.e, getCallingCardsByIdentifierResponse.e) && j$.util.Objects.equals(this.f, getCallingCardsByIdentifierResponse.f) && j$.util.Objects.equals(this.g, getCallingCardsByIdentifierResponse.g) && j$.util.Objects.equals(this.h, getCallingCardsByIdentifierResponse.h) && j$.util.Objects.equals(this.i, getCallingCardsByIdentifierResponse.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, reflectedParcelable, i);
        aais.l(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.z(parcel, 4, this.d, i);
        aais.A(parcel, 5, this.e);
        aais.A(parcel, 6, this.f);
        aais.y(parcel, 7, this.g);
        aais.z(parcel, 8, this.h, i);
        aais.A(parcel, 9, this.i);
        aais.g(parcel, iF);
    }
}
