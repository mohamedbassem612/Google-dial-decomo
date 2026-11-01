package com.google.android.gms.wearable.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CapabilityInfoParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements defpackage.aavt {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aawm(5);
    public final java.lang.String a;
    public final java.util.List b;
    private final java.lang.Object c = new java.lang.Object();
    private java.util.Set d = null;

    public CapabilityInfoParcelable(java.lang.String str, java.util.List list) {
        this.a = str;
        this.b = list;
        aais.as(str);
        aais.as(list);
    }

    @Override // defpackage.aavt
    public final java.util.Set a() {
        java.util.Set set;
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new java.util.HashSet(this.b);
            }
            set = this.d;
        }
        return set;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.wearable.internal.CapabilityInfoParcelable capabilityInfoParcelable = (com.google.android.gms.wearable.internal.CapabilityInfoParcelable) obj;
            java.lang.String str = this.a;
            if (str == null ? capabilityInfoParcelable.a == null : str.equals(capabilityInfoParcelable.a)) {
                java.util.List list = this.b;
                if (list != null) {
                    if (list.equals(capabilityInfoParcelable.b)) {
                        return true;
                    }
                } else if (capabilityInfoParcelable.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List list = this.b;
        return ((iHashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CapabilityInfo{" + this.a + ", " + java.lang.String.valueOf(this.b) + '}';
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iF = aais.f(parcel, 20293);
        aais.A(parcel, 2, str);
        aais.E(parcel, 3, this.b);
        aais.g(parcel, iF);
    }
}
