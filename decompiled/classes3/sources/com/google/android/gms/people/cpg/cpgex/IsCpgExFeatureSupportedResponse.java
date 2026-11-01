package com.google.android.gms.people.cpg.cpgex;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class IsCpgExFeatureSupportedResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aarr(9);
    public final com.google.android.gms.common.api.Status a;
    public final java.util.List b;

    public IsCpgExFeatureSupportedResponse(com.google.android.gms.common.api.Status status, java.util.List list) {
        this.a = status;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.cpgex.IsCpgExFeatureSupportedResponse) {
            com.google.android.gms.people.cpg.cpgex.IsCpgExFeatureSupportedResponse isCpgExFeatureSupportedResponse = (com.google.android.gms.people.cpg.cpgex.IsCpgExFeatureSupportedResponse) obj;
            if (j$.util.Objects.equals(this.a, isCpgExFeatureSupportedResponse.a) && j$.util.Objects.equals(this.b, isCpgExFeatureSupportedResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.api.Status status = this.a;
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, status, i);
        aais.E(parcel, 2, this.b);
        aais.g(parcel, iF);
    }
}
