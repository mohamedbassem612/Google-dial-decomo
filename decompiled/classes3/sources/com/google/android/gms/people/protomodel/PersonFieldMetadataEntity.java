package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PersonFieldMetadataEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.PersonFieldMetadata {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(8);
    public final java.lang.Integer a;
    public final java.lang.Boolean b;

    public PersonFieldMetadataEntity(java.lang.Integer num, java.lang.Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final java.lang.Boolean a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final java.lang.Integer b() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.PersonFieldMetadata)) {
            return false;
        }
        if (this != obj) {
            com.google.android.gms.people.protomodel.PersonFieldMetadata personFieldMetadata = (com.google.android.gms.people.protomodel.PersonFieldMetadata) obj;
            if (!j$.util.Objects.equals(b(), personFieldMetadata.b()) || !j$.util.Objects.equals(a(), personFieldMetadata.a())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.Integer num = this.a;
        int iF = aais.f(parcel, 20293);
        aais.w(parcel, 3, num);
        aais.o(parcel, 4, this.b);
        aais.g(parcel, iF);
    }
}
