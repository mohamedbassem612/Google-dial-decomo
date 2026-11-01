package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PhoneEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.Phone {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(9);
    public final com.google.android.gms.people.protomodel.PersonFieldMetadataEntity a;
    public final java.lang.String b;
    public final java.lang.String c;

    public PhoneEntity(com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity, java.lang.String str, java.lang.String str2) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final com.google.android.gms.people.protomodel.PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final java.lang.String b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final java.lang.String c() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.Phone)) {
            return false;
        }
        if (this != obj) {
            com.google.android.gms.people.protomodel.Phone phone = (com.google.android.gms.people.protomodel.Phone) obj;
            if (!j$.util.Objects.equals(a(), phone.a()) || !j$.util.Objects.equals(c(), phone.c()) || !j$.util.Objects.equals(b(), phone.b())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{a(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, personFieldMetadataEntity, i);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.g(parcel, iF);
    }
}
