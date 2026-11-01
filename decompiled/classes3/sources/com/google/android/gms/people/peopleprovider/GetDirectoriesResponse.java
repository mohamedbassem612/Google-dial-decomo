package com.google.android.gms.people.peopleprovider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetDirectoriesResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(14);
    public final java.util.List a;

    public GetDirectoriesResponse(java.util.List list) {
        this.a = list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.peopleprovider.GetDirectoriesResponse) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.people.peopleprovider.GetDirectoriesResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("directories", this.a, arrayList);
        return aehj.bW(arrayList, this);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, list);
        aais.g(parcel, iF);
    }
}
