package com.google.android.gms.people.cpg.actionpreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ContactActionSettings extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(20);
    public final java.util.ArrayList a;

    public ContactActionSettings(java.util.ArrayList arrayList) {
        this.a = arrayList == null ? new java.util.ArrayList() : arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.people.cpg.actionpreferences.ContactActionSettings) {
            return this.a.equals(((com.google.android.gms.people.cpg.actionpreferences.ContactActionSettings) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.ArrayList arrayList = this.a;
        int iF = aais.f(parcel, 20293);
        aais.C(parcel, 1, arrayList);
        aais.g(parcel, iF);
    }
}
