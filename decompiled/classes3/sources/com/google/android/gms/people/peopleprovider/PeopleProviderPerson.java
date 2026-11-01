package com.google.android.gms.people.peopleprovider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PeopleProviderPerson extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(19);
    public final java.lang.String a;
    public final java.lang.String b;
    public final android.net.Uri c;
    public final java.lang.String d;
    public final int e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final boolean i;

    public PeopleProviderPerson(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.lang.String str3, int i, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z) {
        aais.as(str);
        this.a = str;
        this.b = str2;
        this.c = uri;
        aais.as(str3);
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.peopleprovider.PeopleProviderPerson) {
            com.google.android.gms.people.peopleprovider.PeopleProviderPerson peopleProviderPerson = (com.google.android.gms.people.peopleprovider.PeopleProviderPerson) obj;
            if (this.e == peopleProviderPerson.e && this.i == peopleProviderPerson.i && j$.util.Objects.equals(this.a, peopleProviderPerson.a) && j$.util.Objects.equals(this.b, peopleProviderPerson.b) && j$.util.Objects.equals(this.c, peopleProviderPerson.c) && j$.util.Objects.equals(this.d, peopleProviderPerson.d) && j$.util.Objects.equals(this.f, peopleProviderPerson.f) && j$.util.Objects.equals(this.g, peopleProviderPerson.g) && j$.util.Objects.equals(this.h, peopleProviderPerson.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, java.lang.Integer.valueOf(this.e), this.f, this.g, this.h, java.lang.Boolean.valueOf(this.i)});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("lookupKey", this.a, arrayList);
        aehj.bX("displayName", this.b, arrayList);
        aehj.bX("photoUri", this.c, arrayList);
        aehj.bX("packageName", this.d, arrayList);
        aehj.bX("authority", this.h, arrayList);
        aehj.bX("capabilities", java.lang.Integer.valueOf(this.e), arrayList);
        aehj.bX("isKnown", java.lang.Boolean.valueOf(this.i), arrayList);
        aehj.bX("matchedSelectionType", this.f, arrayList);
        aehj.bX("matchedSelectionValue", this.g, arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.z(parcel, 3, this.c, i);
        aais.A(parcel, 4, this.d);
        aais.l(parcel, 5, this.e);
        aais.A(parcel, 6, this.f);
        aais.A(parcel, 7, this.g);
        aais.A(parcel, 8, this.h);
        aais.h(parcel, 9, this.i);
        aais.g(parcel, iF);
    }
}
