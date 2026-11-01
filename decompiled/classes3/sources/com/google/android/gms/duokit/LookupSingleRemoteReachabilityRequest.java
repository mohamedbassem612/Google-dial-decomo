package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LookupSingleRemoteReachabilityRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(11);
    public com.google.android.gms.duokit.DuoId a;
    public java.lang.String b;
    public boolean c;

    public LookupSingleRemoteReachabilityRequest(com.google.android.gms.duokit.DuoId duoId, java.lang.String str, boolean z) {
        this.a = duoId;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest) {
            com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest lookupSingleRemoteReachabilityRequest = (com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest) obj;
            if (j$.util.Objects.equals(this.a, lookupSingleRemoteReachabilityRequest.a) && j$.util.Objects.equals(this.b, lookupSingleRemoteReachabilityRequest.b) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(lookupSingleRemoteReachabilityRequest.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Boolean.valueOf(this.c)});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.A(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.g(parcel, iF);
    }

    public LookupSingleRemoteReachabilityRequest() {
    }
}
