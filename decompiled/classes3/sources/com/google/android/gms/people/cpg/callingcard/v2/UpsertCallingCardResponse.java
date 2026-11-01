package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class UpsertCallingCardResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(1);
    public final com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus a;
    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier b;

    public UpsertCallingCardResponse(com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus, com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier) {
        this.a = callingCardRequestStatus;
        this.b = identifier;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse) {
            com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse upsertCallingCardResponse = (com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse) obj;
            if (j$.util.Objects.equals(this.a, upsertCallingCardResponse.a) && j$.util.Objects.equals(this.b, upsertCallingCardResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        int i2 = i | 1;
        aais.z(parcel, 1, reflectedParcelable, i2);
        aais.z(parcel, 2, this.b, i2);
        aais.g(parcel, iF);
    }
}
