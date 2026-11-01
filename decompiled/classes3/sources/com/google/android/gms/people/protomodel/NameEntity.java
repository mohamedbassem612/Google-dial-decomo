package com.google.android.gms.people.protomodel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class NameEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.people.protomodel.Name {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aask(6);
    public final com.google.android.gms.people.protomodel.PersonFieldMetadataEntity a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;

    public NameEntity(com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final com.google.android.gms.people.protomodel.PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final java.lang.String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final java.lang.String c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final java.lang.String d() {
        return this.g;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final java.lang.String e() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.people.protomodel.Name)) {
            return false;
        }
        if (this != obj) {
            com.google.android.gms.people.protomodel.Name name = (com.google.android.gms.people.protomodel.Name) obj;
            if (!j$.util.Objects.equals(a(), name.a()) || !j$.util.Objects.equals(b(), name.b()) || !j$.util.Objects.equals(g(), name.g()) || !j$.util.Objects.equals(e(), name.e()) || !j$.util.Objects.equals(c(), name.c()) || !j$.util.Objects.equals(f(), name.f()) || !j$.util.Objects.equals(d(), name.d())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final java.lang.String f() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final java.lang.String g() {
        return this.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{a(), b(), g(), e(), c(), f(), d()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.people.protomodel.PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, personFieldMetadataEntity, i);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.g);
        aais.A(parcel, 5, this.d);
        aais.A(parcel, 6, this.e);
        aais.A(parcel, 7, this.f);
        aais.A(parcel, 17, this.c);
        aais.g(parcel, iF);
    }
}
