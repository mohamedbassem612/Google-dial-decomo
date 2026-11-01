package com.google.android.gms.people.cpg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CpgDocument extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.aalw(18);
    public final int a;
    public final com.google.android.gms.people.cpg.GroupContactOrder b;
    public final com.google.android.gms.people.cpg.ActionPreference c;

    public CpgDocument(int i, com.google.android.gms.people.cpg.GroupContactOrder groupContactOrder, com.google.android.gms.people.cpg.ActionPreference actionPreference) {
        this.a = i;
        this.b = groupContactOrder;
        this.c = actionPreference;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.people.cpg.CpgDocument cpgDocument = (com.google.android.gms.people.cpg.CpgDocument) obj;
            if (this.a == cpgDocument.a && j$.util.Objects.equals(this.b, cpgDocument.b) && j$.util.Objects.equals(this.c, cpgDocument.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.b, this.c});
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.z(parcel, 2, this.b, i);
        aais.z(parcel, 3, this.c, i);
        aais.g(parcel, iF);
    }
}
