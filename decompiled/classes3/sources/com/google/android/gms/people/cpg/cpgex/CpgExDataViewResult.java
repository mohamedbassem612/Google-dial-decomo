package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CpgExDataViewResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(4);
    public final com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus a;
    public final com.google.android.gms.people.cpg.cpgex.Identifier b;
    public final com.google.android.gms.people.cpg.cpgex.CpgExDataContents c;

    public CpgExDataViewResult(com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus cpgExRequestStatus, com.google.android.gms.people.cpg.cpgex.Identifier identifier, com.google.android.gms.people.cpg.cpgex.CpgExDataContents cpgExDataContents) {
        this.a = cpgExRequestStatus;
        this.b = identifier;
        this.c = cpgExDataContents;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.CpgExDataViewResult) {
            com.google.android.gms.people.cpg.cpgex.CpgExDataViewResult cpgExDataViewResult = (com.google.android.gms.people.cpg.cpgex.CpgExDataViewResult) obj;
            if (j$.util.Objects.equals(this.a, cpgExDataViewResult.a) && j$.util.Objects.equals(this.b, cpgExDataViewResult.b) && j$.util.Objects.equals(this.c, cpgExDataViewResult.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, reflectedParcelable, i);
        aais.z(parcel, 2, this.b, i);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
