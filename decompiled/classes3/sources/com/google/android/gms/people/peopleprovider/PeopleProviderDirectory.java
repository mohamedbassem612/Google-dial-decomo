package com.google.android.gms.people.peopleprovider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PeopleProviderDirectory extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(17);
    public final java.lang.String a;
    public final java.lang.String b;

    public PeopleProviderDirectory(java.lang.String str, java.lang.String str2) {
        aais.as(str);
        this.a = str;
        aais.as(str2);
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.peopleprovider.PeopleProviderDirectory) {
            com.google.android.gms.people.peopleprovider.PeopleProviderDirectory peopleProviderDirectory = (com.google.android.gms.people.peopleprovider.PeopleProviderDirectory) obj;
            if (j$.util.Objects.equals(this.a, peopleProviderDirectory.a) && j$.util.Objects.equals(this.b, peopleProviderDirectory.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("packageName", this.a, arrayList);
        aehj.bX("authority", this.b, arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 1, str);
        aais.A(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
