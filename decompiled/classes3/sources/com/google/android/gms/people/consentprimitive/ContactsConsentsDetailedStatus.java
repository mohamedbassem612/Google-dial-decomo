package com.google.android.gms.people.consentprimitive;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ContactsConsentsDetailedStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(4);
    public final int a;
    public final android.os.Bundle b;

    public ContactsConsentsDetailedStatus(int i, android.os.Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final aigf a() {
        aigb aigbVar = new aigb(4);
        android.os.Bundle bundle = this.b;
        for (java.lang.String str : bundle.keySet()) {
            aigbVar.i(new android.accounts.Account(str, "com.google"), java.lang.Integer.valueOf(bundle.getInt(str)));
        }
        return aigbVar.e(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus) {
            com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus) obj;
            if (this.a == contactsConsentsDetailedStatus.a && j$.util.Objects.equals(a(), contactsConsentsDetailedStatus.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), a()});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.p(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
