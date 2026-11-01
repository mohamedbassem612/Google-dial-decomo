package com.google.android.gms.wearable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ConnectionRestrictions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aatx(10);
    public final java.util.List a;
    public final java.util.List b;
    public final java.util.List c;

    public ConnectionRestrictions(java.util.List list, java.util.List list2, java.util.List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("allowedDataItemFilters", this.a);
        ahymVarL.b("allowedCapabilities", this.b);
        ahymVarL.b("allowedPackages", this.c);
        return ahymVarL.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.a;
        int iF = aais.f(parcel, 20293);
        aais.E(parcel, 1, list);
        aais.C(parcel, 2, this.b);
        aais.C(parcel, 3, this.c);
        aais.g(parcel, iF);
    }
}
