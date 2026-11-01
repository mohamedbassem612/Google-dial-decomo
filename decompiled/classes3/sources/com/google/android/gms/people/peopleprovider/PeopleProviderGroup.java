package com.google.android.gms.people.peopleprovider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PeopleProviderGroup extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(18);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;

    public PeopleProviderGroup(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        aais.as(str);
        this.a = str;
        this.b = str2;
        aais.as(str3);
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.peopleprovider.PeopleProviderGroup) {
            com.google.android.gms.people.peopleprovider.PeopleProviderGroup peopleProviderGroup = (com.google.android.gms.people.peopleprovider.PeopleProviderGroup) obj;
            if (j$.util.Objects.equals(this.a, peopleProviderGroup.a) && j$.util.Objects.equals(this.b, peopleProviderGroup.b) && j$.util.Objects.equals(this.c, peopleProviderGroup.c) && j$.util.Objects.equals(this.d, peopleProviderGroup.d) && j$.util.Objects.equals(this.e, peopleProviderGroup.e) && j$.util.Objects.equals(this.f, peopleProviderGroup.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("lookupKey", this.a, arrayList);
        aehj.bX("displayName", this.b, arrayList);
        aehj.bX("packageName", this.c, arrayList);
        aehj.bX("authority", this.d, arrayList);
        aehj.bX("matchedSelectionType", this.e, arrayList);
        aehj.bX("matchedSelectionValue", this.f, arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.A(parcel, 3, this.c);
        aais.A(parcel, 4, this.d);
        aais.A(parcel, 5, this.e);
        aais.A(parcel, 6, this.f);
        aais.g(parcel, iF);
    }
}
