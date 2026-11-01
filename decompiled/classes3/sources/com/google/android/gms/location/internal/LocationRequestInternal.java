package com.google.android.gms.location.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public class LocationRequestInternal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalp(11);
    com.google.android.gms.location.LocationRequest a;

    public LocationRequestInternal(com.google.android.gms.location.LocationRequest locationRequest, java.util.List list, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        android.os.WorkSource workSource;
        defpackage.aanp aanpVar = new defpackage.aanp(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new android.os.WorkSource();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.common.internal.ClientIdentity clientIdentity = (com.google.android.gms.common.internal.ClientIdentity) it.next();
                    defpackage.aaiu.a(workSource, clientIdentity.a, clientIdentity.b);
                }
            }
            aanpVar.c = workSource;
        }
        if (z) {
            aanpVar.b(1);
        }
        if (z2) {
            aanpVar.e(2);
        }
        if (z3) {
            aanpVar.b = true;
        }
        if (z4) {
            aanpVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            aanpVar.c(j);
        }
        this.a = aanpVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.location.internal.LocationRequestInternal) {
            return j$.util.Objects.equals(this.a, ((com.google.android.gms.location.internal.LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 1, this.a, i);
        aais.g(parcel, iF);
    }
}
