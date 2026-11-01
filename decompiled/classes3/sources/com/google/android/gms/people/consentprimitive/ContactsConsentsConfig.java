package com.google.android.gms.people.consentprimitive;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ContactsConsentsConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(3);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final android.accounts.Account d;
    public final boolean e;
    public final boolean f;
    public final java.lang.String g;
    public final java.util.List h;
    public final boolean i;

    public ContactsConsentsConfig(boolean z, boolean z2, boolean z3, android.accounts.Account account, boolean z4, boolean z5, java.lang.String str, java.util.List list, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = account;
        this.e = z4;
        this.f = z5;
        this.g = str;
        this.h = list;
        this.i = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.consentprimitive.ContactsConsentsConfig) {
            com.google.android.gms.people.consentprimitive.ContactsConsentsConfig contactsConsentsConfig = (com.google.android.gms.people.consentprimitive.ContactsConsentsConfig) obj;
            if (this.a == contactsConsentsConfig.a && this.b == contactsConsentsConfig.b && this.c == contactsConsentsConfig.c && this.e == contactsConsentsConfig.e && this.f == contactsConsentsConfig.f && this.i == contactsConsentsConfig.i && j$.util.Objects.equals(this.d, contactsConsentsConfig.d) && j$.util.Objects.equals(this.g, contactsConsentsConfig.g) && j$.util.Objects.equals(this.h, contactsConsentsConfig.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(this.b), java.lang.Boolean.valueOf(this.c), this.d, java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.i), java.lang.Boolean.valueOf(this.f), this.g, this.h});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.a;
        int iF = aais.f(parcel, 20293);
        aais.h(parcel, 1, z);
        aais.h(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.z(parcel, 4, this.d, i);
        aais.h(parcel, 5, this.e);
        aais.h(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.E(parcel, 8, this.h);
        aais.h(parcel, 9, this.i);
        aais.g(parcel, iF);
    }
}
