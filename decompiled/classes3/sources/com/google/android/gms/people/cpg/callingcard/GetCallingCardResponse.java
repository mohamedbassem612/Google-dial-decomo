package com.google.android.gms.people.cpg.callingcard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetCallingCardResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(10);
    public final com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus a;
    public final int b;
    public final android.net.Uri c;
    public final java.lang.String d;
    public final com.google.android.gms.people.cpg.callingcard.CallingCardMetadata e;

    public GetCallingCardResponse(com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus, int i, android.net.Uri uri, java.lang.String str, com.google.android.gms.people.cpg.callingcard.CallingCardMetadata callingCardMetadata) {
        this.a = callingCardRequestStatus;
        this.b = i;
        this.c = uri;
        this.d = str;
        this.e = callingCardMetadata;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse) {
            com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse getCallingCardResponse = (com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse) obj;
            if (j$.util.Objects.equals(this.a, getCallingCardResponse.a) && this.b == getCallingCardResponse.b && j$.util.Objects.equals(this.c, getCallingCardResponse.c) && j$.util.Objects.equals(this.d, getCallingCardResponse.d) && j$.util.Objects.equals(this.e, getCallingCardResponse.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, reflectedParcelable, i);
        aais.l(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.A(parcel, 4, this.d);
        aais.z(parcel, 5, this.e, i);
        aais.g(parcel, iF);
    }
}
