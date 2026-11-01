package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class GetCpgExDataViewByIdentifierResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(7);
    public final com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus a;
    public final java.util.List b;

    public GetCpgExDataViewByIdentifierResponse(com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus cpgExRequestStatus, java.util.List list) {
        this.a = cpgExRequestStatus;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.GetCpgExDataViewByIdentifierResponse) {
            com.google.android.gms.people.cpg.cpgex.GetCpgExDataViewByIdentifierResponse getCpgExDataViewByIdentifierResponse = (com.google.android.gms.people.cpg.cpgex.GetCpgExDataViewByIdentifierResponse) obj;
            if (j$.util.Objects.equals(this.a, getCpgExDataViewByIdentifierResponse.a) && j$.util.Objects.equals(this.b, getCpgExDataViewByIdentifierResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, reflectedParcelable, i);
        aais.E(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
