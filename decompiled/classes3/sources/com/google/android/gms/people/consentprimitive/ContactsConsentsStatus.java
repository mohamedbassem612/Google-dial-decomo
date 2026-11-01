package com.google.android.gms.people.consentprimitive;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ContactsConsentsStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(5);
    public final com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus a;
    public final com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus b;
    public final com.google.android.gms.people.consentprimitive.ContactsConsentsConfig c;

    public ContactsConsentsStatus(com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus contactsConsentsCoarseStatus, com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus contactsConsentsDetailedStatus, com.google.android.gms.people.consentprimitive.ContactsConsentsConfig contactsConsentsConfig) {
        this.a = contactsConsentsCoarseStatus;
        this.b = contactsConsentsDetailedStatus;
        this.c = contactsConsentsConfig;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.consentprimitive.ContactsConsentsStatus) {
            com.google.android.gms.people.consentprimitive.ContactsConsentsStatus contactsConsentsStatus = (com.google.android.gms.people.consentprimitive.ContactsConsentsStatus) obj;
            if (j$.util.Objects.equals(this.a, contactsConsentsStatus.a) && j$.util.Objects.equals(this.b, contactsConsentsStatus.b) && j$.util.Objects.equals(this.c, contactsConsentsStatus.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, abstractSafeParcelable, i);
        aais.z(parcel, 2, this.b, i);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
