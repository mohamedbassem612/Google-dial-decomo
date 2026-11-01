package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LookupSingleRemoteReachabilityResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(12);
    public com.google.android.gms.duokit.RemoteUserReachability a;

    public LookupSingleRemoteReachabilityResponse(com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability) {
        this.a = remoteUserReachability;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.duokit.LookupSingleRemoteReachabilityResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.g(parcel, iF);
    }

    public LookupSingleRemoteReachabilityResponse() {
    }
}
