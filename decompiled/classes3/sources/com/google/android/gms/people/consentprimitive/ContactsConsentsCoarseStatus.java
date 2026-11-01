package com.google.android.gms.people.consentprimitive;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ContactsConsentsCoarseStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(2);
    public final boolean a;
    public final boolean b;
    public final java.lang.String c;
    public final boolean d;
    private final java.util.List e;
    private final java.util.List f;
    private final java.util.List g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, java.util.List list, java.util.List list2, java.lang.String str, boolean z3, java.util.List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus) {
            com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus) obj;
            if (this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && j$.util.Objects.equals(this.f, contactsConsentsCoarseStatus.f) && j$.util.Objects.equals(this.e, contactsConsentsCoarseStatus.e) && j$.util.Objects.equals(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && j$.util.Objects.equals(this.g, contactsConsentsCoarseStatus.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(this.b), this.e, this.f, this.c, java.lang.Boolean.valueOf(this.d), this.g});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, z);
        aais.h(parcel, 2, this.b);
        java.util.List list = this.e;
        aais.E(parcel, 3, list == null ? aike.a : aify.n(list));
        java.util.List list2 = this.f;
        aais.E(parcel, 4, list2 == null ? aike.a : aify.n(list2));
        aais.A(parcel, 5, this.c);
        aais.h(parcel, 6, this.d);
        java.util.List list3 = this.g;
        aais.E(parcel, 7, list3 == null ? aike.a : aify.n(list3));
        aais.g(parcel, iF);
    }
}
