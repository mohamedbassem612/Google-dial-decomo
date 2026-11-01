package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LookupRemoteReachabilityRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(9);
    public com.google.android.gms.duokit.DuoId[] a;
    public java.lang.String b;
    public boolean c;

    public LookupRemoteReachabilityRequest(com.google.android.gms.duokit.DuoId[] duoIdArr, java.lang.String str, boolean z) {
        this.a = duoIdArr;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.duokit.LookupRemoteReachabilityRequest) {
            com.google.android.gms.duokit.LookupRemoteReachabilityRequest lookupRemoteReachabilityRequest = (com.google.android.gms.duokit.LookupRemoteReachabilityRequest) obj;
            if (java.util.Arrays.equals(this.a, lookupRemoteReachabilityRequest.a) && j$.util.Objects.equals(this.b, lookupRemoteReachabilityRequest.b) && j$.util.Objects.equals(java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(lookupRemoteReachabilityRequest.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.a)), this.b, java.lang.Boolean.valueOf(this.c)});
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcelable[], com.google.android.gms.duokit.DuoId[]] */
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.D(parcel, 1, (android.os.Parcelable[]) this.a, i);
        aais.A(parcel, 2, this.b);
        aais.h(parcel, 3, this.c);
        aais.g(parcel, iF);
    }

    public LookupRemoteReachabilityRequest() {
    }
}
