package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CpgExDataOperationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(3);
    public final com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus a;
    public final java.lang.Long b;
    public final java.lang.Long c;

    public CpgExDataOperationResult(com.google.android.gms.people.cpg.cpgex.CpgExRequestStatus cpgExRequestStatus, java.lang.Long l, java.lang.Long l2) {
        this.a = cpgExRequestStatus;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.CpgExDataOperationResult) {
            com.google.android.gms.people.cpg.cpgex.CpgExDataOperationResult cpgExDataOperationResult = (com.google.android.gms.people.cpg.cpgex.CpgExDataOperationResult) obj;
            if (j$.util.Objects.equals(this.a, cpgExDataOperationResult.a) && j$.util.Objects.equals(this.b, cpgExDataOperationResult.b) && j$.util.Objects.equals(this.c, cpgExDataOperationResult.c)) {
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
        aais.y(parcel, 2, this.b);
        aais.y(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
