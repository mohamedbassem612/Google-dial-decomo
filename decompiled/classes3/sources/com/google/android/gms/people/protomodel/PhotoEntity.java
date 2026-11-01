package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PhotoEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.Photo {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(10);
    public final com.google.android.gms.people.protomodel.PersonFieldMetadataEntity a;
    public final java.lang.String b;

    public PhotoEntity(com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity, java.lang.String str) {
        this.a = personFieldMetadataEntity;
        this.b = str;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final com.google.android.gms.people.protomodel.PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final java.lang.String b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.Photo)) {
            return false;
        }
        if (this != obj) {
            com.google.android.gms.people.protomodel.Photo photo = (com.google.android.gms.people.protomodel.Photo) obj;
            if (!j$.util.Objects.equals(a(), photo.a()) || !j$.util.Objects.equals(b(), photo.b())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, personFieldMetadataEntity, i);
        aais.A(parcel, 3, this.b);
        aais.g(parcel, iF);
    }
}
