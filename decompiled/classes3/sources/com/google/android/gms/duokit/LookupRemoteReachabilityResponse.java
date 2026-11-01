package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LookupRemoteReachabilityResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(10);
    public com.google.android.gms.duokit.RemoteUserReachability[] a;

    public LookupRemoteReachabilityResponse(com.google.android.gms.duokit.RemoteUserReachability[] remoteUserReachabilityArr) {
        this.a = remoteUserReachabilityArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.LookupRemoteReachabilityResponse) {
            return java.util.Arrays.equals(this.a, ((com.google.android.gms.duokit.LookupRemoteReachabilityResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.a))});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Parcelable[], com.google.android.gms.duokit.RemoteUserReachability[]] */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.D(parcel, 1, (android.os.Parcelable[]) this.a, i);
        aais.g(parcel, iF);
    }

    public LookupRemoteReachabilityResponse() {
    }
}
