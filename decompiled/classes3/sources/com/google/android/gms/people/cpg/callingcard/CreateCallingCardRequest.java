package com.google.android.gms.people.cpg.callingcard;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CreateCallingCardRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(8);
    public final int a;
    public final com.google.android.gms.people.cpg.callingcard.CallingCardFileData b;
    public final com.google.android.gms.people.cpg.callingcard.CallingCardMetadata c;

    public CreateCallingCardRequest(int i, com.google.android.gms.people.cpg.callingcard.CallingCardFileData callingCardFileData, com.google.android.gms.people.cpg.callingcard.CallingCardMetadata callingCardMetadata) {
        this.a = i;
        this.b = callingCardFileData;
        this.c = callingCardMetadata;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest) {
            com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest createCallingCardRequest = (com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest) obj;
            if (this.a == createCallingCardRequest.a && j$.util.Objects.equals(this.b, createCallingCardRequest.b) && j$.util.Objects.equals(this.c, createCallingCardRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        int i3 = i | 1;
        aais.z(parcel, 2, this.b, i3);
        aais.z(parcel, 3, this.c, i3);
        aais.g(parcel, iF);
    }
}
