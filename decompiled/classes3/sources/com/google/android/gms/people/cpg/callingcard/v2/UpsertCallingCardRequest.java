package com.google.android.gms.people.cpg.callingcard.v2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class UpsertCallingCardRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalx(20);
    public final int a;
    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier b;
    public final com.google.android.gms.people.cpg.callingcard.v2.FileData c;
    public final com.google.android.gms.people.cpg.callingcard.v2.Metadata d;
    public final java.lang.String e;
    public final java.lang.String f;

    public UpsertCallingCardRequest(int i, com.google.android.gms.people.cpg.callingcard.v2.Identifier identifier, com.google.android.gms.people.cpg.callingcard.v2.FileData fileData, com.google.android.gms.people.cpg.callingcard.v2.Metadata metadata, java.lang.String str, java.lang.String str2) {
        this.a = i;
        this.b = identifier;
        this.c = fileData;
        this.d = metadata;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardRequest) {
            com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardRequest upsertCallingCardRequest = (com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardRequest) obj;
            if (this.a == upsertCallingCardRequest.a && j$.util.Objects.equals(this.b, upsertCallingCardRequest.b) && j$.util.Objects.equals(this.c, upsertCallingCardRequest.c) && j$.util.Objects.equals(this.d, upsertCallingCardRequest.d) && j$.util.Objects.equals(this.e, upsertCallingCardRequest.e) && j$.util.Objects.equals(this.f, upsertCallingCardRequest.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        int i3 = i | 1;
        aais.z(parcel, 2, this.b, i3);
        aais.z(parcel, 3, this.c, i3);
        aais.z(parcel, 4, this.d, i3);
        aais.A(parcel, 5, this.e);
        aais.A(parcel, 6, this.f);
        aais.g(parcel, iF);
    }
}
